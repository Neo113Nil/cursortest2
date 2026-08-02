package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1436cV implements View.OnClickListener {
    public final /* synthetic */ KD A00;

    public ViewOnClickListenerC1436cV(KD kd) {
        this.A00 = kd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1525dx interfaceC1525dx;
        InterfaceC1525dx interfaceC1525dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1525dx = this.A00.A02;
            if (interfaceC1525dx != null) {
                interfaceC1525dx2 = this.A00.A02;
                interfaceC1525dx2.A9l();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
