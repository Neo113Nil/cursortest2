package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1385bg implements View.OnClickListener {
    public final /* synthetic */ C1387bi A00;

    public ViewOnClickListenerC1385bg(C1387bi c1387bi) {
        this.A00 = c1387bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
