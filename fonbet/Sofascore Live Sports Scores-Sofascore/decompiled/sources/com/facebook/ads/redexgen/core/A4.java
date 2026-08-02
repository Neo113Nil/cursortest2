package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC14233l {
    public final C15799y A00;
    public final C3090oJ A01;
    public final InterfaceC14223k[] A02;

    public A4(InterfaceC14223k... interfaceC14223kArr) {
        this(interfaceC14223kArr, new C15799y(), new C3090oJ());
    }

    public A4(InterfaceC14223k[] interfaceC14223kArr, C15799y c15799y, C3090oJ c3090oJ) {
        this.A02 = new InterfaceC14223k[interfaceC14223kArr.length + 2];
        System.arraycopy(interfaceC14223kArr, 0, this.A02, 0, interfaceC14223kArr.length);
        this.A00 = c15799y;
        this.A01 = c3090oJ;
        this.A02[interfaceC14223kArr.length] = c15799y;
        this.A02[interfaceC14223kArr.length + 1] = c3090oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14233l
    public final C3191px A4F(C3191px c3191px) {
        this.A01.A02(c3191px.A01);
        this.A01.A01(c3191px.A00);
        return c3191px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14233l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14233l
    public final InterfaceC14223k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14233l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC14233l
    public final long A98() {
        return this.A00.A0C();
    }
}
