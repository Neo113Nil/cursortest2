package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C0742Eu A00;

    public F1(C0742Eu c0742Eu) {
        this.A00 = c0742Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        C1569eg c1569eg;
        C0732Ek c0732Ek;
        E4 e4;
        EA ea;
        c1569eg = this.A00.A03;
        c1569eg.A07();
        c0732Ek = this.A00.A04;
        UM<UN, UL> eventBus = c0732Ek.getEventBus();
        e4 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e4, ea);
    }
}
