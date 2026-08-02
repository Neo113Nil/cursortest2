package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2399cb implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC2399cb(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2482dx interfaceC2482dx;
        InterfaceC2482dx interfaceC2482dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2482dx = this.A00.A08;
            if (interfaceC2482dx != null) {
                interfaceC2482dx2 = this.A00.A08;
                interfaceC2482dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
