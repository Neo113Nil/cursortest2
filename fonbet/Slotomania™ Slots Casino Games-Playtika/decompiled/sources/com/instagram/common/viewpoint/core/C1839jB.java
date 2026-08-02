package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1839jB implements SM {
    public final /* synthetic */ C0973Nu A00;

    public C1839jB(C0973Nu c0973Nu) {
        this.A00 = c0973Nu;
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACx() {
        InterfaceC0972Nt interfaceC0972Nt;
        interfaceC0972Nt = this.A00.A04;
        interfaceC0972Nt.ACp();
    }

    @Override // com.instagram.common.viewpoint.core.SM
    public final void ACy() {
        InterfaceC0972Nt interfaceC0972Nt;
        interfaceC0972Nt = this.A00.A04;
        interfaceC0972Nt.ACo(AdError.CACHE_ERROR);
    }
}
