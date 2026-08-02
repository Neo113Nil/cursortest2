package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC1526dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1526dy
    public final void AIY() {
        boolean z;
        C0967No c0967No;
        InterfaceC1236Yh interfaceC1236Yh;
        ZU zu;
        InterfaceC1236Yh interfaceC1236Yh2;
        ZU zu2;
        ZU zu3;
        C0967No c0967No2;
        AbstractC1860jd abstractC1860jd;
        InterfaceC1237Yi A05;
        Intent intent;
        InterfaceC1237Yi interfaceC1237Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC1237Yi interfaceC1237Yi2;
        this.A00.A0B();
        z = this.A00.A0E;
        if (!z || this.A00.A01 == null) {
            c0967No = this.A00.A07;
            if (c0967No == null) {
                interfaceC1236Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC1236Yh.A4j(zu.A81());
                interfaceC1236Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC1236Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c0967No2 = this.A00.A07;
            abstractC1860jd = this.A00.A05;
            A05 = gb2.A05(zu3, c0967No2, Boolean.valueOf(abstractC1860jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC1237Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC1237Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC1237Yi2 = this.A00.A04;
            ((MW) interfaceC1237Yi2).A0b();
        }
    }
}
