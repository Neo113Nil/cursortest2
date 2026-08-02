package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2843k3 extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C2842k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2843k3(C2842k2 c2842k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2842k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2597fp c2597fp;
        C2597fp c2597fp2;
        C2597fp c2597fp3;
        this.A00.A00.A0A();
        c2597fp = this.A00.A00.A0B;
        if (c2597fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c2597fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c2597fp2);
            c2597fp3 = this.A00.A00.A0B;
            c2597fp3.A0U();
        }
    }
}
