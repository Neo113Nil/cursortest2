package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KG implements InterfaceC1386bh {
    public final /* synthetic */ KE A00;

    public KG(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1386bh
    public final void ACt() {
        C1412c7 c1412c7;
        C1412c7 c1412c72;
        c1412c7 = this.A00.A0J;
        AbstractC1860jd A05 = c1412c7.A05();
        c1412c72 = this.A00.A0J;
        A05.A2H(c1412c72.A0C());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1386bh
    public final void AEm() {
        this.A00.A0Y = false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1386bh
    public final void AEn() {
        this.A00.A0Y = true;
    }
}
