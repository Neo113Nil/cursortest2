package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1369bQ implements Animator.AnimatorListener {
    public final /* synthetic */ C1370bR A00;

    public C1369bQ(C1370bR c1370bR) {
        this.A00 = c1370bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RelativeLayout relativeLayout;
        C1695gi c1695gi;
        this.A00.A06();
        relativeLayout = this.A00.A05;
        YB.A0O(relativeLayout, 8);
        c1695gi = this.A00.A07;
        c1695gi.A0F().ADG();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A01 = true;
    }
}
