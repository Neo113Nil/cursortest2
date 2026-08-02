package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2693hN extends WP {
    public final /* synthetic */ C2692hM A00;

    public C2693hN(C2692hM c2692hM) {
        this.A00 = c2692hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        C2013Rd c2013Rd;
        C2013Rd c2013Rd2;
        C2013Rd c2013Rd3;
        c2013Rd = this.A00.A01;
        if (c2013Rd.A06() != null) {
            c2013Rd2 = this.A00.A01;
            AdListener A06 = c2013Rd2.A06();
            c2013Rd3 = this.A00.A01;
            A06.onLoggingImpression(c2013Rd3.A07());
        }
    }
}
