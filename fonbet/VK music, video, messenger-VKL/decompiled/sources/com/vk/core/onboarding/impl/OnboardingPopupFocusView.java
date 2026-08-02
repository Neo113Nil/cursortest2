package com.vk.core.onboarding.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.vk.core.ui.themes.VKTheme;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.qe80;
import xsna.re80;

/* compiled from: OnboardingPopupFocusView.kt */
/* loaded from: classes17.dex */
public final class OnboardingPopupFocusView extends View implements dhr0.e {
    public static final PointF e = new PointF(-1.0f, -1.0f);
    public PointF b;
    public float c;
    public PointF d;

    public OnboardingPopupFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        Paint paint2 = new Paint(1);
        PointF pointF = e;
        this.b = pointF;
        this.c = -1.0f;
        this.d = pointF;
        paint.setColor(e3m.f(R.attr.vk_ui_background, context));
        paint2.setColor(context.getColor(R.color.vk_azure_A100));
        if (isInEditMode()) {
            this.b = new PointF(250.0f, 250.0f);
            this.c = 100.0f;
            this.d = new PointF(100.0f, 100.0f);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dhr0.f(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dhr0.a.getClass();
        dhr0.X(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        PointF pointF = this.b;
        PointF pointF2 = e;
        if (epx.f(pointF, pointF2) || this.c == -1.0f) {
            return;
        }
        epx.f(this.d, pointF2);
    }

    public final void setCircleCenter(PointF pointF) {
        this.b = pointF;
        invalidate();
    }

    public final void setCircleRadius(float f) {
        this.c = f;
        invalidate();
    }

    public final void setCutoutCenter(PointF pointF) {
        this.d = pointF;
        invalidate();
    }

    public final void setCutoutDrawer(re80 re80Var) {
        invalidate();
    }

    public final void setInterpolation(float f) {
        invalidate();
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
    }

    public final void setAppearanceProvider(qe80 qe80Var) {
    }
}
