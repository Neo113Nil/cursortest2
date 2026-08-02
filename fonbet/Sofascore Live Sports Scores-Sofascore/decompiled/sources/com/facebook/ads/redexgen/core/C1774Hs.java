package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1774Hs extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C5F A00;

    public C1774Hs(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2401cd c2401cd;
        c2401cd = this.A00.A0H;
        YB.A0F(1000, c2401cd);
        this.A00.postDelayed(this, 2000L);
    }
}
