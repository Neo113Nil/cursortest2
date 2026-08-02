package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements InterfaceC2482dx {
    public final /* synthetic */ C4V A00;

    public GE(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2482dx
    public final void A9l() {
        AbstractC2365c3 abstractC2365c3;
        AbstractC2365c3 abstractC2365c32;
        abstractC2365c3 = this.A00.A02;
        if (abstractC2365c3 instanceof C6H) {
            abstractC2365c32 = this.A00.A02;
            ((C6H) abstractC2365c32).A1X();
            VI.A02(VH.A0e, null, ((AbstractC1739Gj) this.A00).A03.A2E(), ((AbstractC1739Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2482dx
    public final void AJz() {
        AbstractC2365c3 abstractC2365c3;
        AbstractC2365c3 abstractC2365c32;
        C4L c4l;
        abstractC2365c3 = this.A00.A02;
        if (abstractC2365c3 instanceof C6H) {
            abstractC2365c32 = this.A00.A02;
            c4l = this.A00.A0N;
            ((C6H) abstractC2365c32).A1b(c4l);
            VI.A02(VH.A0e, null, ((AbstractC1739Gj) this.A00).A03.A2E(), ((AbstractC1739Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2482dx
    public final void AKE() {
        AbstractC2365c3 abstractC2365c3;
        AbstractC2365c3 abstractC2365c32;
        this.A00.A0e();
        abstractC2365c3 = this.A00.A02;
        if (abstractC2365c3 instanceof C6H) {
            abstractC2365c32 = this.A00.A02;
            ((C6H) abstractC2365c32).getAdDetailsView().setVisibility(8);
        }
    }
}
