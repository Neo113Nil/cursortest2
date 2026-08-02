package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C2213Zb A00;

    public ZZ(C2213Zb c2213Zb) {
        this.A00 = c2213Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2217Zf interfaceC2217Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2217Zf = this.A00.A04;
            interfaceC2217Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
