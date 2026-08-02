package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1279Zy implements View.OnClickListener {
    public final /* synthetic */ C1262Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC1279Zy(MC mc, C1262Zh c1262Zh) {
        this.A01 = mc;
        this.A00 = c1262Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC0987Oi.A06);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
