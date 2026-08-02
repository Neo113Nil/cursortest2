package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC2139Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        boolean z;
        C2401cd c2401cd;
        z = this.A00.A0Y;
        if (!z) {
            c2401cd = this.A00.A0K;
            YB.A0F(1000, c2401cd);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
