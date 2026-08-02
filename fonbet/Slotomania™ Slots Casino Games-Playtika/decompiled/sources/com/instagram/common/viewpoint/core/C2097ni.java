package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2097ni implements InterfaceC0747Ez {
    public long A00;
    public long A01;
    public C2097ni A02;
    public C0746Ey A03;

    public C2097ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C2097ni A01() {
        this.A03 = null;
        C2097ni c2097ni = this.A02;
        this.A02 = null;
        return c2097ni;
    }

    public final void A02(long j, int i) {
        AbstractC04793y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(C0746Ey c0746Ey, C2097ni c2097ni) {
        this.A03 = c0746Ey;
        this.A02 = c2097ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0747Ez
    public final C0746Ey A6u() {
        return (C0746Ey) AbstractC04793y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0747Ez
    public final C2097ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
