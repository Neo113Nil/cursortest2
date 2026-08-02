package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1732hJ extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C1731hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1732hJ(C1731hI c1731hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c1731hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
