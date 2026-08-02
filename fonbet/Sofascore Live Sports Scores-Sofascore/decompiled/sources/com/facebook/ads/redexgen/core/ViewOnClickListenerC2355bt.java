package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2355bt implements View.OnClickListener {
    public final /* synthetic */ ViewOnClickListenerC1850Kr A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC2355bt(ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr, String str) {
        this.A00 = viewOnClickListenerC1850Kr;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
