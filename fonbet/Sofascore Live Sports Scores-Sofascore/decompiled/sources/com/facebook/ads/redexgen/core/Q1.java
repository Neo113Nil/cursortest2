package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends AbstractRunnableC2139Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ YR A01;

    public Q1(YR yr, DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        InterfaceC2603fv interfaceC2603fv;
        InterfaceC2603fv interfaceC2603fv2;
        C2648ge c2648ge;
        Map<? extends String, ? extends String> A02;
        interfaceC2603fv = this.A01.A01.A02;
        if (interfaceC2603fv != null) {
            interfaceC2603fv2 = this.A01.A01.A02;
            c2648ge = this.A01.A01.A00;
            String A03 = WI.A03(c2648ge);
            C2617g9 c2617g9 = new C2617g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC2603fv2.AGx(A03, c2617g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
