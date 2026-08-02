package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class YY implements View.OnClickListener {
    public final /* synthetic */ C0965Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ YZ A02;
    public final /* synthetic */ InterfaceC1236Yh A03;
    public final /* synthetic */ String A04;

    public YY(YZ yz, VI vi, InterfaceC1236Yh interfaceC1236Yh, String str, C0965Nm c0965Nm) {
        this.A02 = yz;
        this.A01 = vi;
        this.A03 = interfaceC1236Yh;
        this.A04 = str;
        this.A00 = c0965Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0985Og c0985Og;
        C1695gi c1695gi;
        C1695gi c1695gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c0985Og = this.A02.A02;
            c1695gi = this.A02.A03;
            if (c0985Og.A0O(c1695gi.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x6 = new X6();
                c1695gi2 = this.A02.A03;
                X6.A0O(x6, c1695gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
