package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1274Zt implements View.OnClickListener {
    public final /* synthetic */ C1276Zv A00;

    public ViewOnClickListenerC1274Zt(C1276Zv c1276Zv) {
        this.A00 = c1276Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1260Zf interfaceC1260Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1260Zf = this.A00.A02;
            interfaceC1260Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
