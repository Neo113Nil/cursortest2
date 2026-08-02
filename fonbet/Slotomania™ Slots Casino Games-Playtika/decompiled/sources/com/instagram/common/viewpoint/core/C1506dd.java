package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1506dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass55 A00;

    public C1506dd(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
