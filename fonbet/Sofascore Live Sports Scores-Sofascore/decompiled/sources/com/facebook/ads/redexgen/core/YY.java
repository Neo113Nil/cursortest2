package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class YY implements View.OnClickListener {
    public final /* synthetic */ C1922Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ YZ A02;
    public final /* synthetic */ InterfaceC2193Yh A03;
    public final /* synthetic */ String A04;

    public YY(YZ yz, VI vi, InterfaceC2193Yh interfaceC2193Yh, String str, C1922Nm c1922Nm) {
        this.A02 = yz;
        this.A01 = vi;
        this.A03 = interfaceC2193Yh;
        this.A04 = str;
        this.A00 = c1922Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1942Og c1942Og;
        C2652gi c2652gi;
        C2652gi c2652gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c1942Og = this.A02.A02;
            c2652gi = this.A02.A03;
            if (c1942Og.A0O(c2652gi.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x6 = new X6();
                c2652gi2 = this.A02.A03;
                X6.A0O(x6, c2652gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
