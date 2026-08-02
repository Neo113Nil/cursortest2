package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2797jC implements O3 {
    public final /* synthetic */ C1930Nu A00;

    public C2797jC(C1930Nu c1930Nu) {
        this.A00 = c1930Nu;
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFF(AdError adError) {
        InterfaceC1929Nt interfaceC1929Nt;
        interfaceC1929Nt = this.A00.A04;
        interfaceC1929Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.O3
    public final void AFG() {
        InterfaceC1929Nt interfaceC1929Nt;
        interfaceC1929Nt = this.A00.A04;
        interfaceC1929Nt.ACp();
    }
}
