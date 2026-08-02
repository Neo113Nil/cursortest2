package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2874kZ implements InterfaceC1882Lx {
    public final InterfaceC1879Lu A00;

    public C2874kZ(InterfaceC1879Lu interfaceC1879Lu) {
        this.A00 = interfaceC1879Lu;
    }

    public final InterfaceC1879Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1882Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1882Lx
    public final C2878kd ACM() {
        return new C2878kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1882Lx
    public final C2878kd ACN(String str) {
        return new C2878kd(this, str);
    }
}
