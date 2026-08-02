package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1368bP implements Animator.AnimatorListener {
    public final /* synthetic */ C1370bR A00;

    public C1368bP(C1370bR c1370bR) {
        this.A00 = c1370bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1695gi c1695gi;
        this.A00.A06();
        this.A00.A02 = true;
        c1695gi = this.A00.A07;
        c1695gi.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
