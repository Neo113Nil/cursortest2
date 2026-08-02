package com.vk.im.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.ccr0;
import xsna.f5h0;
import xsna.ktc0;

/* compiled from: BlurredFrameLayout.kt */
/* loaded from: classes2.dex */
public final class BlurredFrameLayout extends FrameLayout {
    public int b;
    public int c;
    public final Path d;
    public float e;
    public float f;
    public String g;
    public boolean h;
    public final ccr0 i;

    public BlurredFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Path();
        ccr0 ccr0Var = new ccr0(context);
        this.i = ccr0Var;
        ccr0Var.g.o(f5h0.m.a);
        ccr0Var.setCallback(this);
    }

    public final void a(float f, float f2) {
        if (f == this.e && f2 == this.f) {
            return;
        }
        this.e = f;
        this.f = f2;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.e;
        float f2 = this.f;
        Path path = this.d;
        path.reset();
        path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getMeasuredWidth(), getMeasuredHeight(), new float[]{f, f, f, f, f2, f2, f2, f2}, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.b < getMeasuredWidth() || this.c < getMeasuredHeight()) {
            int save = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ccr0 ccr0Var = this.i;
            ccr0Var.setBounds(0, 0, measuredWidth, measuredHeight);
            ccr0Var.m = measuredWidth;
            ccr0Var.n = measuredHeight;
            ccr0Var.draw(canvas);
            canvas.restoreToCount(save);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable == this.i) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i.t();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.i.s();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = 0;
        this.c = 0;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredWidth > this.b && childAt.getVisibility() == 0) {
                this.b = measuredWidth;
            }
            if (measuredHeight > this.c && childAt.getVisibility() == 0) {
                this.c = measuredHeight;
            }
        }
        if ((this.b < getMeasuredWidth() || this.c < getMeasuredHeight()) && this.h) {
            this.h = false;
            this.i.r(this.g);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        this.i.t();
        super.onStartTemporaryDetach();
    }

    public final void setBlurPostprocessor(ktc0 ktc0Var) {
        this.i.i = ktc0Var;
    }

    public final void setFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }
}
