package com.vk.movika.sdk.android.defaultplayer.view.timeline;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.n23;
import xsna.s3q0;

/* loaded from: classes3.dex */
public final class TimeoutCropView extends FrameLayout implements Animator.AnimatorListener {
    public gzs<s3q0> b;
    public float c;

    public TimeoutCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(getContext(), R.layout.mie_timeout_side, this);
        new LinearInterpolator();
    }

    public final gzs<s3q0> getOnAnimationEndListener() {
        return this.b;
    }

    public final float getProgress() {
        return this.c;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gzs<s3q0> gzsVar = this.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        animator.removeListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setOnAnimationEndListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Keep
    public final void setPercent(float f) {
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 100.0f) {
            throw new IllegalArgumentException(n23.a(f, "Percent must be in range 0..100, but it is "));
        }
        setProgress(f);
    }

    public final void setProgress(float f) {
        this.c = f;
        View findViewById = findViewById(R.id.percent_container);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getWidth(), (int) ((getHeight() * this.c) / 100.0f));
        layoutParams.gravity = 17;
        findViewById.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
