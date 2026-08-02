package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C1256Zb A00;

    public ZY(C1256Zb c1256Zb) {
        this.A00 = c1256Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC1260Zf interfaceC1260Zf;
        InterfaceC1260Zf interfaceC1260Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC1260Zf2 = this.A00.A04;
                interfaceC1260Zf2.A53();
            } else {
                interfaceC1260Zf = this.A00.A04;
                interfaceC1260Zf.A54();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
