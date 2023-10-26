package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
         }
    }



