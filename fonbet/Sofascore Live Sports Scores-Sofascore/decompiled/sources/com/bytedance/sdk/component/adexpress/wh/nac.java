package com.bytedance.sdk.component.adexpress.wh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class nac extends View {
    private ValueAnimator gm;
    private float kj;
    private ValueAnimator oo;
    private int ork;
    private float pcc;
    private float qf;
    private float sf;
    private Paint vj;
    private Animator.AnimatorListener vy;
    private long wh;

    public nac(Context context, int i) {
        super(context);
        this.wh = 300L;
        this.qf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ork = i;
        pcc();
    }

    public void gm() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.kj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.oo = ofFloat;
        ofFloat.setDuration(this.wh);
        this.oo.setInterpolator(new LinearInterpolator());
        this.oo.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.nac.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                nac.this.qf = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nac.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.vy;
        if (animatorListener != null) {
            this.oo.addListener(animatorListener);
        }
        this.oo.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.pcc, this.sf, this.qf, this.vj);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.pcc = i / 2.0f;
        this.sf = i2 / 2.0f;
        this.kj = (float) (Math.hypot(i, i2) / 2.0d);
    }

    public void pcc() {
        Paint paint = new Paint(1);
        this.vj = paint;
        paint.setStyle(Paint.Style.FILL);
        this.vj.setColor(this.ork);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.vy = animatorListener;
    }

    public void sf() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.kj);
        this.gm = ofFloat;
        ofFloat.setDuration(this.wh);
        this.gm.setInterpolator(new LinearInterpolator());
        this.gm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.wh.nac.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                nac.this.qf = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nac.this.invalidate();
            }
        });
        this.gm.start();
    }
}
