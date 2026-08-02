package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1694Ep extends AbstractRunnableC2139Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1689Ek A02;

    public C1694Ep(C1689Ek c1689Ek, int i, int i2) {
        this.A02 = c1689Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C1677Dy(this.A00, this.A01));
    }
}
