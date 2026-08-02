package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2796jB implements SM {
    public final /* synthetic */ C1930Nu A00;

    public C2796jB(C1930Nu c1930Nu) {
        this.A00 = c1930Nu;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        InterfaceC1929Nt interfaceC1929Nt;
        interfaceC1929Nt = this.A00.A04;
        interfaceC1929Nt.ACp();
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        InterfaceC1929Nt interfaceC1929Nt;
        interfaceC1929Nt = this.A00.A04;
        interfaceC1929Nt.ACo(AdError.CACHE_ERROR);
    }
}
