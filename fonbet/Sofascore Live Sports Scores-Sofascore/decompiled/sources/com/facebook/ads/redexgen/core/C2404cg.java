package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2404cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C1815Ji A00;
    public final /* synthetic */ boolean A01;

    public C2404cg(C1815Ji c1815Ji, boolean z) {
        this.A00 = c1815Ji;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        C1815Ji c1815Ji = this.A00;
        z = this.A00.A0D;
        c1815Ji.A0t(z, true);
        if (!this.A01) {
            m3 = this.A00.A08;
            if (m3 != null) {
                m32 = this.A00.A08;
                m32.destroy();
            }
        }
    }
}
