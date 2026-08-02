package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2463dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass55 A00;

    public C2463dd(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
