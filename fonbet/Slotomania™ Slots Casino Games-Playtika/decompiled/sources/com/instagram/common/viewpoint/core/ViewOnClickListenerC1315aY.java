package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1315aY implements View.OnClickListener {
    public final /* synthetic */ M8 A00;

    public ViewOnClickListenerC1315aY(M8 m8) {
        this.A00 = m8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1695gi c1695gi;
        InterfaceC1337au interfaceC1337au;
        InterfaceC1337au interfaceC1337au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1695gi = this.A00.A08;
            c1695gi.A0F().A9w();
            interfaceC1337au = this.A00.A05;
            if (interfaceC1337au != null) {
                interfaceC1337au2 = this.A00.A05;
                interfaceC1337au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
