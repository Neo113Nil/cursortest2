package com.bytedance.sdk.openadsdk.core.hc.sf.oo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.oo;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends View {
    private float gbb;
    private RectF gm;
    private int hc;
    private int kj;
    private int oo;
    private String ork;
    private Paint pcc;
    private float qf;
    private Paint sf;
    private ValueAnimator tmg;
    private oo vh;
    private int vj;
    private int vy;
    private float wh;

    public pcc(Context context) {
        super(context);
        this.oo = com.bytedance.adsdk.ugeno.qf.pcc.pcc("#FFD813");
        this.vj = com.bytedance.adsdk.ugeno.qf.pcc.pcc("rgba(0, 0, 0, 0.5)");
        this.wh = 3.0f;
        this.qf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.kj = 0;
        this.vy = 100;
        this.ork = "line";
        this.hc = 1000;
        setBackgroundColor(0);
        pcc();
    }

    private void pcc(Canvas canvas) {
        float f;
        int i;
        float f2 = this.wh / 2.0f;
        this.gm.set(f2, f2, getWidth() - f2, getHeight() - f2);
        Paint paint = this.pcc;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.pcc.setStrokeWidth(this.wh);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - f2, this.pcc);
        boolean equals = TextUtils.equals(this.ork, "ring_reverse");
        float f3 = this.gbb;
        if (equals) {
            f = f3 * (-360.0f);
            i = this.vy;
        } else {
            f = f3 * 360.0f;
            i = this.vy;
        }
        float f4 = f / i;
        this.sf.setStyle(style);
        this.sf.setStrokeWidth(this.wh);
        float f5 = this.qf;
        Paint paint2 = this.sf;
        if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            paint2.setStrokeCap(Paint.Cap.SQUARE);
        } else {
            paint2.setStrokeCap(Paint.Cap.ROUND);
        }
        canvas.drawArc(this.gm, -90.0f, f4, false, this.sf);
    }

    private void sf(Canvas canvas) {
        Paint paint = this.pcc;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        float width = getWidth();
        float f = this.wh;
        float f2 = this.qf;
        canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, f, f2, f2, this.pcc);
        float width2 = (getWidth() * this.gbb) / this.vy;
        this.sf.setStyle(style);
        if (!TextUtils.equals(this.ork, "line_reverse")) {
            float f3 = this.wh;
            float f4 = this.qf;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, f3, f4, f4, this.sf);
        } else {
            float width3 = getWidth() - width2;
            float width4 = getWidth();
            float f5 = this.wh;
            float f6 = this.qf;
            canvas.drawRoundRect(width3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width4, f5, f6, f6, this.sf);
        }
    }

    public int getMaxProgress() {
        return this.vy;
    }

    public int getProgress() {
        return this.kj;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.tmg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.equals(this.ork, "ring") || TextUtils.equals(this.ork, "ring_reverse")) {
            pcc(canvas);
        } else {
            sf(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        oo ooVar = this.vh;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
        if (TextUtils.equals(this.ork, "ring") || TextUtils.equals(this.ork, "ring_reverse")) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(min, min);
        } else {
            setMeasuredDimension(getMeasuredWidth(), (int) this.wh);
        }
        oo ooVar2 = this.vh;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    public void setAnimationDuration(int i) {
        this.hc = i;
        this.tmg.setDuration(i);
    }

    public void setMaxProgress(int i) {
        this.vy = i;
        invalidate();
    }

    public void setProgress(int i) {
        int min = Math.min(i, this.vy);
        this.kj = min;
        if (min < 0) {
            this.kj = 0;
        }
        ValueAnimator valueAnimator = this.tmg;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.tmg.setFloatValues(this.gbb, this.kj);
            this.tmg.start();
        }
    }

    public pcc sf(int i) {
        this.pcc.setColor(i);
        return this;
    }

    public pcc sf(float f) {
        this.qf = f;
        return this;
    }

    private void pcc() {
        Paint paint = new Paint(1);
        this.pcc = paint;
        paint.setColor(this.vj);
        Paint paint2 = this.pcc;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.sf = paint3;
        paint3.setColor(this.oo);
        this.sf.setStyle(style);
        this.gm = new RectF();
        this.gbb = this.kj;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[0]);
        this.tmg = ofFloat;
        ofFloat.setDuration(this.hc);
        this.tmg.setInterpolator(new LinearInterpolator());
        this.tmg.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.oo.pcc.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                pcc.this.gbb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pcc.this.invalidate();
            }
        });
    }

    public pcc pcc(int i) {
        this.sf.setColor(i);
        return this;
    }

    public pcc pcc(float f) {
        this.wh = f;
        invalidate();
        return this;
    }

    public pcc pcc(String str) {
        this.ork = str;
        return this;
    }

    public void pcc(oo ooVar) {
        this.vh = ooVar;
    }
}
