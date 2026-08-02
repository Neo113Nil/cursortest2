package com.monetization.ads.fullscreen.template.view;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import yads.xm2;

/* loaded from: classes14.dex */
public final class ColorizedRatingView extends xm2 {
    private static final int a = Color.parseColor("#FFF4C900");

    public ColorizedRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable.getNumberOfLayers() >= 3) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    drawable2.setColorFilter(new BlendModeColorFilter(-3355444, BlendMode.SRC_ATOP));
                } else {
                    drawable2.setColorFilter(-3355444, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable3 = layerDrawable.getDrawable(1);
                int i2 = a;
                if (i >= 29) {
                    drawable3.setColorFilter(new BlendModeColorFilter(i2, BlendMode.SRC_ATOP));
                } else {
                    drawable3.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                }
                Drawable drawable4 = layerDrawable.getDrawable(2);
                if (i >= 29) {
                    drawable4.setColorFilter(new BlendModeColorFilter(i2, BlendMode.SRC_ATOP));
                } else {
                    drawable4.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                }
            }
        }
    }
}
