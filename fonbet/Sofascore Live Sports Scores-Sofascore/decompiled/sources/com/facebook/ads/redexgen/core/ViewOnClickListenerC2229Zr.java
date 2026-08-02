package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2229Zr implements View.OnClickListener {
    public final /* synthetic */ C1946Ok A00;
    public final /* synthetic */ C2219Zh A01;
    public final /* synthetic */ MD A02;

    public ViewOnClickListenerC2229Zr(MD md, C2219Zh c2219Zh, C1946Ok c1946Ok) {
        this.A02 = md;
        this.A01 = c2219Zh;
        this.A00 = c1946Ok;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0D.AF4(this.A00);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
