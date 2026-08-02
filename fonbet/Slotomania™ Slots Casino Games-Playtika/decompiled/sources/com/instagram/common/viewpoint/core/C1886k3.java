package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1886k3 extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C1885k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1886k3(C1885k2 c1885k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c1885k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        C1640fp c1640fp;
        C1640fp c1640fp2;
        C1640fp c1640fp3;
        this.A00.A00.A0A();
        c1640fp = this.A00.A00.A0B;
        if (c1640fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c1640fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c1640fp2);
            c1640fp3 = this.A00.A00.A0B;
            c1640fp3.A0U();
        }
    }
}
