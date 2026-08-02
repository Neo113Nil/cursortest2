package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2677h7 extends WP {
    public final /* synthetic */ C2676h6 A00;

    public C2677h7(C2676h6 c2676h6) {
        this.A00 = c2676h6;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        S6 s6;
        S6 s62;
        s6 = this.A00.A01.A01;
        if (s6.A00() != null) {
            s62 = this.A00.A01.A01;
            s62.A00().onAdsLoaded();
        }
    }
}
