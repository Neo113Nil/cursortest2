package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC04663l {
    public final C06229y A00;
    public final C2133oJ A01;
    public final InterfaceC04653k[] A02;

    public A4(InterfaceC04653k... interfaceC04653kArr) {
        this(interfaceC04653kArr, new C06229y(), new C2133oJ());
    }

    public A4(InterfaceC04653k[] interfaceC04653kArr, C06229y c06229y, C2133oJ c2133oJ) {
        this.A02 = new InterfaceC04653k[interfaceC04653kArr.length + 2];
        System.arraycopy(interfaceC04653kArr, 0, this.A02, 0, interfaceC04653kArr.length);
        this.A00 = c06229y;
        this.A01 = c2133oJ;
        this.A02[interfaceC04653kArr.length] = c06229y;
        this.A02[interfaceC04653kArr.length + 1] = c2133oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04663l
    public final C2234px A4F(C2234px c2234px) {
        this.A01.A02(c2234px.A01);
        this.A01.A01(c2234px.A00);
        return c2234px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04663l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04663l
    public final InterfaceC04653k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04663l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04663l
    public final long A98() {
        return this.A00.A0C();
    }
}
