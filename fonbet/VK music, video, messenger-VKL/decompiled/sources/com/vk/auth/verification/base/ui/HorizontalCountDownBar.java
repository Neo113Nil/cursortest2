package com.vk.auth.verification.base.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cdv;
import xsna.jcg;
import xsna.krv0;
import xsna.s3q0;
import xsna.yxb;

/* compiled from: HorizontalCountDownBar.kt */
/* loaded from: classes15.dex */
public final class HorizontalCountDownBar extends View {
    public final Paint b;
    public final Paint c;
    public final LinearInterpolator d;
    public Paint e;
    public float f;
    public long g;
    public long h;
    public float i;
    public ValueAnimator j;
    public boolean k;

    public HorizontalCountDownBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setColor(krv0.m(R.attr.vk_ui_stroke_accent, context));
        this.b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(krv0.m(R.attr.vk_ui_stroke_negative, context));
        this.c = paint2;
        this.d = new LinearInterpolator();
        this.e = paint;
    }

    public static void a(HorizontalCountDownBar horizontalCountDownBar, ValueAnimator valueAnimator) {
        horizontalCountDownBar.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        horizontalCountDownBar.e = horizontalCountDownBar.getCurrentBarPaint();
        horizontalCountDownBar.invalidate();
    }

    public static s3q0 b(HorizontalCountDownBar horizontalCountDownBar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(horizontalCountDownBar.getWidthBasedOnTimeLeft(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(horizontalCountDownBar.getTimeLeftMillis());
        ofFloat.setInterpolator(horizontalCountDownBar.d);
        ofFloat.addUpdateListener(new yxb(horizontalCountDownBar, 1));
        ofFloat.start();
        horizontalCountDownBar.j = ofFloat;
        return s3q0.a;
    }

    private final Paint getCurrentBarPaint() {
        return getTimeLeftMillis() < 10000 ? this.c : this.b;
    }

    private final float getTimeLeftFromAnimationDurationRatio() {
        return this.g == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : getTimeLeftMillis() / this.g;
    }

    private final long getTimeLeftMillis() {
        return this.h - SystemClock.elapsedRealtime();
    }

    private final float getWidthBasedOnTimeLeft() {
        if (getTimeLeftMillis() <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return getMeasuredWidth() * getTimeLeftFromAnimationDurationRatio();
    }

    public final void c() {
        if (getTimeLeftMillis() <= 0) {
            return;
        }
        jcg jcgVar = new jcg(this, 25);
        if (this.k) {
            jcgVar.invoke();
        } else {
            addOnLayoutChangeListener(new cdv(jcgVar));
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getTimeLeftMillis() < 0) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.j = null;
            return;
        }
        float width = (getWidth() - this.i) / 2.0f;
        float height = getHeight();
        float f = this.f;
        canvas.drawRoundRect(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getWidth() - width, height, f, f, this.e);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.k = true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f = i2 / 2.0f;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ValueAnimator valueAnimator = this.j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.j = null;
        }
    }
}
