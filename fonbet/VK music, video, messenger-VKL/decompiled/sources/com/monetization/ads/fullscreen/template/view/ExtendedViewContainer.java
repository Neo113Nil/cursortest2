package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R$styleable;
import xsna.zcl;
import yads.ek1;
import yads.fk1;
import yads.g03;
import yads.ik1;
import yads.jk1;
import yads.oy;
import yads.u10;

/* loaded from: classes14.dex */
public final class ExtendedViewContainer extends FrameLayout {
    private final u10 a;
    private final jk1 b;
    private jk1 c;

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final oy a(float f, float f2) {
        return new oy(new fk1(this, f, getContext().getApplicationContext()), new ek1(this, f2, getContext().getApplicationContext()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u10 u10Var = this.a;
        if (u10Var.d != null && !u10Var.c.isEmpty()) {
            canvas.clipPath(u10Var.c);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ik1 a = this.c.a(i, i2);
        super.onMeasure(a.a, a.b);
        this.a.a();
    }

    public final void setMeasureSpecProvider(jk1 jk1Var) {
        this.c = new oy(this.b, jk1Var);
        requestLayout();
        invalidate();
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        int i5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalExtendedContainer, i, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            i3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize);
            i4 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize);
            i5 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize);
            i2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize);
            this.b = a(obtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), obtainStyledAttributes.getFloat(R$styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            obtainStyledAttributes.recycle();
        } else {
            this.b = new g03();
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        this.c = this.b;
        this.a = new u10(this, i3, i4, i5, i2);
        setWillNotDraw(false);
    }
}
