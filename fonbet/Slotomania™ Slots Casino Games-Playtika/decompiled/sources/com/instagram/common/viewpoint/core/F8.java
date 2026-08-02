package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC1665gE {
    public final /* synthetic */ C1563ea A00;

    public F8(C1563ea c1563ea) {
        this.A00 = c1563ea;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1665gE
    public final void AHA() {
        InterfaceC1236Yh interfaceC1236Yh;
        InterfaceC1236Yh interfaceC1236Yh2;
        ZU zu;
        interfaceC1236Yh = this.A00.A02;
        if (interfaceC1236Yh == null) {
            return;
        }
        interfaceC1236Yh2 = this.A00.A02;
        zu = this.A00.A03;
        interfaceC1236Yh2.A4j(zu.A94());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1665gE
    public final void AHC(C1667gG c1667gG) {
        InterfaceC1236Yh interfaceC1236Yh;
        C1695gi c1695gi;
        InterfaceC1236Yh interfaceC1236Yh2;
        ZU zu;
        C1695gi c1695gi2;
        InterfaceC1236Yh interfaceC1236Yh3;
        ZU zu2;
        interfaceC1236Yh = this.A00.A02;
        if (interfaceC1236Yh == null) {
            return;
        }
        if (c1667gG == null || !c1667gG.A00()) {
            c1695gi = this.A00.A01;
            c1695gi.A0F().ABv();
            interfaceC1236Yh2 = this.A00.A02;
            zu = this.A00.A03;
            interfaceC1236Yh2.A4j(zu.A94());
            return;
        }
        c1695gi2 = this.A00.A01;
        c1695gi2.A0F().ABw();
        interfaceC1236Yh3 = this.A00.A02;
        zu2 = this.A00.A03;
        interfaceC1236Yh3.A4j(zu2.A95());
    }
}
