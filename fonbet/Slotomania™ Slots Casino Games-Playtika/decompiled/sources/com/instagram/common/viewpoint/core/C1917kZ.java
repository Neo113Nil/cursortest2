package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1917kZ implements InterfaceC0925Lx {
    public final InterfaceC0922Lu A00;

    public C1917kZ(InterfaceC0922Lu interfaceC0922Lu) {
        this.A00 = interfaceC0922Lu;
    }

    public final InterfaceC0922Lu A00() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0925Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0925Lx
    public final C1921kd ACM() {
        return new C1921kd(this);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0925Lx
    public final C1921kd ACN(String str) {
        return new C1921kd(this, str);
    }
}
