package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends AbstractRunnableC1182Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ YR A01;

    public Q1(YR yr, DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        InterfaceC1646fv interfaceC1646fv;
        InterfaceC1646fv interfaceC1646fv2;
        C1691ge c1691ge;
        Map<? extends String, ? extends String> A02;
        interfaceC1646fv = this.A01.A01.A02;
        if (interfaceC1646fv != null) {
            interfaceC1646fv2 = this.A01.A01.A02;
            c1691ge = this.A01.A01.A00;
            String A03 = WI.A03(c1691ge);
            C1660g9 c1660g9 = new C1660g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1646fv2.AGx(A03, c1660g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
