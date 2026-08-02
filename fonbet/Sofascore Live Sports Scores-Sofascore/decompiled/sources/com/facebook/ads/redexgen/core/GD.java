package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: assets/audience_network/classes2.dex */
public class GD implements InterfaceC2483dy {
    public final /* synthetic */ GB A00;

    public GD(GB gb) {
        this.A00 = gb;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2483dy
    public final void AIY() {
        boolean z;
        C1924No c1924No;
        InterfaceC2193Yh interfaceC2193Yh;
        ZU zu;
        InterfaceC2193Yh interfaceC2193Yh2;
        ZU zu2;
        ZU zu3;
        C1924No c1924No2;
        AbstractC2817jd abstractC2817jd;
        InterfaceC2194Yi A05;
        Intent intent;
        InterfaceC2194Yi interfaceC2194Yi;
        Intent intent2;
        Bundle bundle;
        InterfaceC2194Yi interfaceC2194Yi2;
        this.A00.A0B();
        z = this.A00.A0E;
        if (!z || this.A00.A01 == null) {
            c1924No = this.A00.A07;
            if (c1924No == null) {
                interfaceC2193Yh = this.A00.A0C;
                zu = this.A00.A0D;
                interfaceC2193Yh.A4j(zu.A81());
                interfaceC2193Yh2 = this.A00.A0C;
                zu2 = this.A00.A0D;
                interfaceC2193Yh2.A4j(zu2.A7w());
                return;
            }
            GB gb = this.A00;
            GB gb2 = this.A00;
            zu3 = this.A00.A0D;
            c1924No2 = this.A00.A07;
            abstractC2817jd = this.A00.A05;
            A05 = gb2.A05(zu3, c1924No2, Boolean.valueOf(abstractC2817jd.A1n()));
            gb.A04 = A05;
            intent = this.A00.A02;
            if (intent != null && this.A00.A00 != null) {
                interfaceC2194Yi = this.A00.A04;
                intent2 = this.A00.A02;
                bundle = this.A00.A03;
                interfaceC2194Yi.AAu(intent2, bundle, this.A00.A00);
                return;
            }
            return;
        }
        if (this.A00.A01 instanceof MW) {
            this.A00.A04 = this.A00.A01;
            interfaceC2194Yi2 = this.A00.A04;
            ((MW) interfaceC2194Yi2).A0b();
        }
    }
}
