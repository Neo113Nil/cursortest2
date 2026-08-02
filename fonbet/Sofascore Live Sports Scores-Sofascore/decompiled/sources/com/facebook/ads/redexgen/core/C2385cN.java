package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2385cN extends AnimatorListenerAdapter {
    public final /* synthetic */ KE A00;
    public final /* synthetic */ boolean A01;

    public C2385cN(KE ke, boolean z) {
        this.A00 = ke;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2401cd c2401cd;
        DZ dz;
        AbstractC2817jd abstractC2817jd;
        DZ dz2;
        DZ dz3;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        c2401cd = this.A00.A0K;
        c2401cd.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A00.A0T();
        if (!this.A01) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                m32 = this.A00.A0I;
                m32.destroy();
            }
        }
        dz = this.A00.A0g;
        if (dz != null) {
            abstractC2817jd = this.A00.A0E;
            if (!abstractC2817jd.A1i()) {
                dz3 = this.A00.A0g;
                dz3.setVisibility(this.A01 ? 8 : 0);
            } else {
                dz2 = this.A00.A0g;
                dz2.setVisibility(8);
            }
        }
    }
}
