package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2203Yr implements View.OnClickListener {
    public final /* synthetic */ PU A00;

    public ViewOnClickListenerC2203Yr(PU pu) {
        this.A00 = pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2186Ya interfaceC2186Ya;
        ZM zm;
        InterfaceC2186Ya interfaceC2186Ya2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC2186Ya = this.A00.A01;
            if (interfaceC2186Ya != null) {
                zm = this.A00.A02;
                if (zm.A03()) {
                    interfaceC2186Ya2 = this.A00.A01;
                    interfaceC2186Ya2.ACl(this.A00);
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
