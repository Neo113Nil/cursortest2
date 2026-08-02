package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1498dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5F A00;

    public C1498dV(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C0732Ek c0732Ek;
        C0732Ek c0732Ek2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        c0732Ek = this.A00.A0b;
        c0732Ek.getLayoutParams().height = num.intValue();
        c0732Ek2 = this.A00.A0b;
        c0732Ek2.requestLayout();
    }
}
