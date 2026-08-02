package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1736hN extends WP {
    public final /* synthetic */ C1735hM A00;

    public C1736hN(C1735hM c1735hM) {
        this.A00 = c1735hM;
    }

    @Override // com.instagram.common.viewpoint.core.WP
    public final void A01() {
        C1056Rd c1056Rd;
        C1056Rd c1056Rd2;
        C1056Rd c1056Rd3;
        c1056Rd = this.A00.A01;
        if (c1056Rd.A06() != null) {
            c1056Rd2 = this.A00.A01;
            AdListener A06 = c1056Rd2.A06();
            c1056Rd3 = this.A00.A01;
            A06.onLoggingImpression(c1056Rd3.A07());
        }
    }
}
