package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2705hZ extends R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC2700hU A01;

    public C2705hZ(AbstractC2700hU abstractC2700hU) {
        this.A01 = abstractC2700hU;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0L(C7M c7m, int i) {
        super.A0L(c7m, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0M(C7M c7m, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.A00 = true;
        }
    }
}
