package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2231Zt implements View.OnClickListener {
    public final /* synthetic */ C2233Zv A00;

    public ViewOnClickListenerC2231Zt(C2233Zv c2233Zv) {
        this.A00 = c2233Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2217Zf interfaceC2217Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2217Zf = this.A00.A02;
            interfaceC2217Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
