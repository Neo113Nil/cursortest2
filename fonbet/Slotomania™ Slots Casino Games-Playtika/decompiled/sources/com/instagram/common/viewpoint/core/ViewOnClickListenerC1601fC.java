package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1601fC implements View.OnClickListener {
    public final /* synthetic */ C0699Dd A00;

    public ViewOnClickListenerC1601fC(C0699Dd c0699Dd) {
        this.A00 = c0699Dd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C1695gi c1695gi;
        C0732Ek c0732Ek;
        boolean A07;
        C0732Ek c0732Ek2;
        C0732Ek c0732Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A03;
            vi.A04(VH.A0l, null);
            c1695gi = this.A00.A02;
            c1695gi.A0F().A3m();
            c0732Ek = this.A00.A00;
            if (c0732Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c0732Ek3 = this.A00.A00;
                    c0732Ek3.setVolume(1.0f);
                } else {
                    c0732Ek2 = this.A00.A00;
                    c0732Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
