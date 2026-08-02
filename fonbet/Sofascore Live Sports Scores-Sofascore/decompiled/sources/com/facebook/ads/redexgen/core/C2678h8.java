package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2678h8 extends WP {
    public final /* synthetic */ C2675h5 A00;
    public final /* synthetic */ C2124Vm A01;

    public C2678h8(C2675h5 c2675h5, C2124Vm c2124Vm) {
        this.A00 = c2675h5;
        this.A01 = c2124Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        S6 s6;
        S6 s62;
        s6 = this.A00.A01;
        if (s6.A00() != null) {
            s62 = this.A00.A01;
            s62.A00().onAdError(XE.A00(this.A01));
        }
    }
}
