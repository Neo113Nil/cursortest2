package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2277ad implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public ViewOnClickListenerC2277ad(M6 m6) {
        this.A00 = m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2652gi c2652gi;
        InterfaceC2294au interfaceC2294au;
        InterfaceC2294au interfaceC2294au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c2652gi = this.A00.A09;
            c2652gi.A0F().A9w();
            interfaceC2294au = this.A00.A06;
            if (interfaceC2294au != null) {
                interfaceC2294au2 = this.A00.A06;
                interfaceC2294au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
