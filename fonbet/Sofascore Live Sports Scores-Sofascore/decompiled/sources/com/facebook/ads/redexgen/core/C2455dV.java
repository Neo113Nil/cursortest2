package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2455dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5F A00;

    public C2455dV(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1689Ek c1689Ek;
        C1689Ek c1689Ek2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        c1689Ek = this.A00.A0b;
        c1689Ek.getLayoutParams().height = num.intValue();
        c1689Ek2 = this.A00.A0b;
        c1689Ek2.requestLayout();
    }
}
