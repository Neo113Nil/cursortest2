package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KY implements XN {
    public final /* synthetic */ C6K A00;

    public KY(C6K c6k) {
        this.A00 = c6k;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        AbstractC2187Yb abstractC2187Yb;
        AbstractC2187Yb abstractC2187Yb2;
        this.A00.A02 = false;
        abstractC2187Yb = this.A00.A07;
        if (abstractC2187Yb != null) {
            abstractC2187Yb2 = this.A00.A07;
            abstractC2187Yb2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        AbstractC2187Yb abstractC2187Yb;
        AbstractC2187Yb abstractC2187Yb2;
        abstractC2187Yb = this.A00.A07;
        if (abstractC2187Yb != null) {
            abstractC2187Yb2 = this.A00.A07;
            abstractC2187Yb2.setProgressImmediate(100.0f * (1.0f - (f / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
