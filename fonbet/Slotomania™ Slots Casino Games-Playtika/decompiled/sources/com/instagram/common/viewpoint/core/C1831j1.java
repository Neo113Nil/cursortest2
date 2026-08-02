package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1831j1 extends AbstractRunnableC1182Wc {
    public final /* synthetic */ AbstractC1830j0 A00;
    public final /* synthetic */ C1167Vm A01;

    public C1831j1(AbstractC1830j0 abstractC1830j0, C1167Vm c1167Vm) {
        this.A00 = abstractC1830j0;
        this.A01 = c1167Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
