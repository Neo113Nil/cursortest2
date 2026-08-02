package com.facebook.ads.redexgen.core;

import android.R;

/* loaded from: assets/audience_network/classes2.dex */
public class PQ extends AbstractRunnableC2139Wc {
    public final /* synthetic */ AnimationAnimationListenerC2206Yu A00;

    public PQ(AnimationAnimationListenerC2206Yu animationAnimationListenerC2206Yu) {
        this.A00 = animationAnimationListenerC2206Yu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
