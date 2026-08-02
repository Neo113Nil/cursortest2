package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1726hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1725hC A01;

    public C1726hD(C1725hC c1725hC, int i) {
        this.A01 = c1725hC;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        C1695gi c1695gi;
        c1695gi = this.A01.A0C;
        c1695gi.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        C1376bX c1376bX;
        C1376bX c1376bX2;
        float f2 = 1.0f - (f / this.A00);
        c1376bX = this.A01.A0G;
        if (c1376bX != null) {
            c1376bX2 = this.A01.A0G;
            c1376bX2.setProgressWithAnimation(100.0f * f2);
        }
    }
}
