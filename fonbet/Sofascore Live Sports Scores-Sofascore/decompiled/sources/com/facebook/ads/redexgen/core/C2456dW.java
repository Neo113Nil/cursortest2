package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2456dW extends AnimatorListenerAdapter {
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ boolean A01;

    public C2456dW(C5F c5f, boolean z) {
        this.A00 = c5f;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2401cd c2401cd;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        c2401cd = this.A00.A0H;
        c2401cd.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A00.A0V();
        if (!this.A01) {
            m3 = this.A00.A0G;
            if (m3 != null) {
                m32 = this.A00.A0G;
                m32.destroy();
            }
        }
    }
}
