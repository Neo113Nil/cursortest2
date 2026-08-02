package com.react.rnspinkit;

import android.content.Context;
import android.util.Log;
import android.widget.RelativeLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.ChasingDots;
import com.github.ybq.android.spinkit.style.Circle;
import com.github.ybq.android.spinkit.style.CubeGrid;
import com.github.ybq.android.spinkit.style.DoubleBounce;
import com.github.ybq.android.spinkit.style.FadingCircle;
import com.github.ybq.android.spinkit.style.FoldingCube;
import com.github.ybq.android.spinkit.style.Pulse;
import com.github.ybq.android.spinkit.style.RotatingPlane;
import com.github.ybq.android.spinkit.style.ThreeBounce;
import com.github.ybq.android.spinkit.style.WanderingCubes;
import com.github.ybq.android.spinkit.style.Wave;

/* loaded from: classes8.dex */
public class RNSpinkitView extends SpinKitView {
    private int mColor;
    private double mSize;
    private Sprite mSprite;
    private String mType;

    public RNSpinkitView(Context context) {
        super(context);
        this.mSprite = getSprite("");
    }

    public void setSpriteColor(int i) {
        try {
            this.mColor = i;
            this.mSprite.setColor(i);
            setIndeterminateDrawable(this.mSprite);
        } catch (Exception e) {
            Log.e("RNSpinkit-Err", e.toString() + "when set prop color to " + i);
        }
    }

    public void setSpriteType(String str) {
        this.mType = str;
        Sprite sprite = getSprite(str);
        this.mSprite = sprite;
        sprite.setColor(this.mColor);
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        setIndeterminateDrawable(this.mSprite);
    }

    private Sprite getSprite(String str) {
        str.hashCode();
        switch (str) {
            case "ChasingDots":
                ChasingDots chasingDots = new ChasingDots();
                chasingDots.setScale(0.85f);
                return chasingDots;
            case "RotatingPlane":
                return new RotatingPlane();
            case "Wave":
                return new Wave();
            case "Pulse":
                return new Pulse();
            case "WanderingCubes":
                return new WanderingCubes();
            case "9CubeGrid":
                return new CubeGrid();
            case "FoldingCube":
                FoldingCube foldingCube = new FoldingCube();
                foldingCube.setScale(0.7f);
                return foldingCube;
            case "FadingCircleAlt":
                return new FadingCircle();
            case "ThreeBounce":
                return new ThreeBounce();
            case "Bounce":
                return new DoubleBounce();
            case "Circle":
                return new Circle();
            default:
                return new RotatingPlane();
        }
    }

    public void setSpriteSize(double d) {
        this.mSize = d;
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
    }
}
