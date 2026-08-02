package com.fyber.inneractive.sdk.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ IAsmoothProgressBar a;

    public h(IAsmoothProgressBar iAsmoothProgressBar) {
        this.a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
