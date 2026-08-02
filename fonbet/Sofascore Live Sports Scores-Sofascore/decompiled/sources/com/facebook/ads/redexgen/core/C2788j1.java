package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2788j1 extends AbstractRunnableC2139Wc {
    public final /* synthetic */ AbstractC2787j0 A00;
    public final /* synthetic */ C2124Vm A01;

    public C2788j1(AbstractC2787j0 abstractC2787j0, C2124Vm c2124Vm) {
        this.A00 = abstractC2787j0;
        this.A01 = c2124Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
