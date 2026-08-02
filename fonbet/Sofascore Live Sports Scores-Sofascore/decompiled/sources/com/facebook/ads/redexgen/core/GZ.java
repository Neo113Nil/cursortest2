package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C14614x A00;

    public GZ(C14614x c14614x) {
        this.A00 = c14614x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        AbstractC2365c3 abstractC2365c3;
        AbstractC2365c3 abstractC2365c32;
        abstractC2365c3 = this.A00.A00;
        if (abstractC2365c3 != null) {
            abstractC2365c32 = this.A00.A00;
            if (abstractC2365c32.A1N()) {
                ((AbstractC1739Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
