package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1265Zk implements View.OnClickListener {
    public final /* synthetic */ ME A00;

    public ViewOnClickListenerC1265Zk(ME me2) {
        this.A00 = me2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AEr(EnumC0987Oi.A06);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
