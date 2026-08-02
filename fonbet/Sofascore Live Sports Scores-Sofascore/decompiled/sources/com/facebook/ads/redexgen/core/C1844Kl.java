package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1844Kl extends AbstractRunnableC2139Wc {
    public final /* synthetic */ AbstractC2337bb A00;

    public C1844Kl(AbstractC2337bb abstractC2337bb) {
        this.A00 = abstractC2337bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC2337bb abstractC2337bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC2337bb.postOnAnimationDelayed(runnable, i);
    }
}
