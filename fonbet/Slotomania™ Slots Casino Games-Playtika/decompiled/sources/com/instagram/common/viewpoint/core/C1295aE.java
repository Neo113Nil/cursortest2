package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.aE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1295aE implements Animator.AnimatorListener {
    public final /* synthetic */ C1300aJ A00;

    public C1295aE(C1300aJ c1300aJ) {
        this.A00 = c1300aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A08();
        this.A00.A0B();
    }
}
