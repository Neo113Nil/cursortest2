package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C1699Eu A00;

    public F1(C1699Eu c1699Eu) {
        this.A00 = c1699Eu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2526eg c2526eg;
        C1689Ek c1689Ek;
        E4 e4;
        EA ea;
        c2526eg = this.A00.A03;
        c2526eg.A07();
        c1689Ek = this.A00.A04;
        UM<UN, UL> eventBus = c1689Ek.getEventBus();
        e4 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e4, ea);
    }
}
