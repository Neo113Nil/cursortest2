package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2683hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2682hC A01;

    public C2683hD(C2682hC c2682hC, int i) {
        this.A01 = c2682hC;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        C2652gi c2652gi;
        c2652gi = this.A01.A0C;
        c2652gi.A0F().ABa();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        C2333bX c2333bX;
        C2333bX c2333bX2;
        float f2 = 1.0f - (f / this.A00);
        c2333bX = this.A01.A0G;
        if (c2333bX != null) {
            c2333bX2 = this.A01.A0G;
            c2333bX2.setProgressWithAnimation(100.0f * f2);
        }
    }
}
