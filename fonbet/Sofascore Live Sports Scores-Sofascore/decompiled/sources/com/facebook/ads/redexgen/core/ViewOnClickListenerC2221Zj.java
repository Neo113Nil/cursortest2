package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2221Zj implements View.OnClickListener {
    public final /* synthetic */ ME A00;

    public ViewOnClickListenerC2221Zj(ME me) {
        this.A00 = me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AEr(EnumC1944Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
