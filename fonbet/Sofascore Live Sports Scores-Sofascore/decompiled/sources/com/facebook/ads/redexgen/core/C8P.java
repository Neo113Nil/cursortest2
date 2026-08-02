package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC3132oz implements InterfaceC1816Jj {
    public long A00;
    public InterfaceC1816Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC3132oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC14845u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j, InterfaceC1816Jj interfaceC1816Jj, long j2) {
        super.A01 = j;
        this.A01 = interfaceC1816Jj;
        if (j2 == Long.MAX_VALUE) {
            j2 = super.A01;
        }
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final List<C3162pT> A7X(long j) {
        return ((InterfaceC1816Jj) AbstractC14363y.A01(this.A01)).A7X(j - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final long A83(int i) {
        return ((InterfaceC1816Jj) AbstractC14363y.A01(this.A01)).A83(i) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final int A84() {
        return ((InterfaceC1816Jj) AbstractC14363y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final int A8a(long j) {
        return ((InterfaceC1816Jj) AbstractC14363y.A01(this.A01)).A8a(j - this.A00);
    }
}
