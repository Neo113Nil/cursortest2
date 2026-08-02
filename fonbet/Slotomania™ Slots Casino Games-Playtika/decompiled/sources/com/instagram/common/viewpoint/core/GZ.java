package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C05044x A00;

    public GZ(C05044x c05044x) {
        this.A00 = c05044x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        AbstractC1408c3 abstractC1408c3;
        AbstractC1408c3 abstractC1408c32;
        abstractC1408c3 = this.A00.A00;
        if (abstractC1408c3 != null) {
            abstractC1408c32 = this.A00.A00;
            if (abstractC1408c32.A1N()) {
                ((AbstractC0782Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
