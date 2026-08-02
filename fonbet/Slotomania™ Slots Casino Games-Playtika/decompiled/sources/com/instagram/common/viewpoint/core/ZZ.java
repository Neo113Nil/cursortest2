package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C1256Zb A00;

    public ZZ(C1256Zb c1256Zb) {
        this.A00 = c1256Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1260Zf interfaceC1260Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1260Zf = this.A00.A04;
            interfaceC1260Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
