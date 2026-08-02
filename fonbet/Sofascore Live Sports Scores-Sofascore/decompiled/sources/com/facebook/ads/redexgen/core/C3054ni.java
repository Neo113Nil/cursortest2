package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3054ni implements InterfaceC1704Ez {
    public long A00;
    public long A01;
    public C3054ni A02;
    public C1703Ey A03;

    public C3054ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C3054ni A01() {
        this.A03 = null;
        C3054ni c3054ni = this.A02;
        this.A02 = null;
        return c3054ni;
    }

    public final void A02(long j, int i) {
        AbstractC14363y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(C1703Ey c1703Ey, C3054ni c3054ni) {
        this.A03 = c1703Ey;
        this.A02 = c3054ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1704Ez
    public final C1703Ey A6u() {
        return (C1703Ey) AbstractC14363y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1704Ez
    public final C3054ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
