package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0887Kl extends AbstractRunnableC1182Wc {
    public final /* synthetic */ AbstractC1380bb A00;

    public C0887Kl(AbstractC1380bb abstractC1380bb) {
        this.A00 = abstractC1380bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC1380bb abstractC1380bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC1380bb.postOnAnimationDelayed(runnable, i);
    }
}
