package com.facebook.ads.redexgen.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C2213Zb A00;

    public ZY(C2213Zb c2213Zb) {
        this.A00 = c2213Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC2217Zf interfaceC2217Zf;
        InterfaceC2217Zf interfaceC2217Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC2217Zf2 = this.A00.A04;
                interfaceC2217Zf2.A53();
            } else {
                interfaceC2217Zf = this.A00.A04;
                interfaceC2217Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
