package com.vk.video.profile.presentation.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.video.profile.impl.R$styleable;

/* compiled from: ToolbarButton.kt */
/* loaded from: classes6.dex */
public final class ToolbarButton extends FrameLayout {
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public int d;

    public ToolbarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        this.b = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        this.c = appCompatImageView2;
        addView(appCompatImageView, -1, -1);
        addView(appCompatImageView2, -1, -1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        this.d = obtainStyledAttributes.getColor(5, 0);
        appCompatImageView2.setImageDrawable(obtainStyledAttributes.getDrawable(2));
        appCompatImageView2.setColorFilter(this.d);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        appCompatImageView2.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        appCompatImageView2.setTranslationX(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        appCompatImageView.setImageDrawable(obtainStyledAttributes.getDrawable(1));
        appCompatImageView.setAlpha(obtainStyledAttributes.getFloat(0, 1.0f));
        obtainStyledAttributes.recycle();
    }

    @Keep
    public final float getBackgroundAlpha() {
        return this.b.getAlpha();
    }

    @Keep
    public final int getForegroundTint() {
        return this.d;
    }

    @Keep
    public final void setBackgroundAlpha(float f) {
        this.b.setAlpha(f);
    }

    @Keep
    public final void setForegroundTint(int i) {
        this.d = i;
        this.c.setColorFilter(i);
    }
}
