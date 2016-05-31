package com.example.yvonne.ripple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.andexert.library.RippleView;

import static com.example.yvonne.ripple.R.id.more;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final RippleView rippleView = (RippleView) findViewById(more);
        rippleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: onRippleViewClick
            }
        });

    }
}