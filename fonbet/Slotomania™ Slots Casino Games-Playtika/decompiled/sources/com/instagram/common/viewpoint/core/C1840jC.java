package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1840jC implements O3 {
    public final /* synthetic */ C0973Nu A00;

    public C1840jC(C0973Nu c0973Nu) {
        this.A00 = c0973Nu;
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFF(AdError adError) {
        InterfaceC0972Nt interfaceC0972Nt;
        interfaceC0972Nt = this.A00.A04;
        interfaceC0972Nt.ACo(AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.O3
    public final void AFG() {
        InterfaceC0972Nt interfaceC0972Nt;
        interfaceC0972Nt = this.A00.A04;
        interfaceC0972Nt.ACp();
    }
}
