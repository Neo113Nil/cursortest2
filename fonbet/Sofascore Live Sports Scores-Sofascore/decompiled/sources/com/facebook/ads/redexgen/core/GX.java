package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC2139Wc {
    public final /* synthetic */ InterfaceC2474dp A00;
    public final /* synthetic */ C2475dq A01;

    public GX(C2475dq c2475dq, InterfaceC2474dp interfaceC2474dp) {
        this.A01 = c2475dq;
        this.A00 = interfaceC2474dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
