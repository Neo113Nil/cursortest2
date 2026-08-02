package com.facebook.ads.redexgen.core;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.facebook.ads.redexgen.X.fC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2558fC implements View.OnClickListener {
    public final /* synthetic */ C1656Dd A00;

    public ViewOnClickListenerC2558fC(C1656Dd c1656Dd) {
        this.A00 = c1656Dd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C2652gi c2652gi;
        C1689Ek c1689Ek;
        boolean A07;
        C1689Ek c1689Ek2;
        C1689Ek c1689Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A03;
            vi.A04(VH.A0l, null);
            c2652gi = this.A00.A02;
            c2652gi.A0F().A3m();
            c1689Ek = this.A00.A00;
            if (c1689Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c1689Ek3 = this.A00.A00;
                    c1689Ek3.setVolume(1.0f);
                } else {
                    c1689Ek2 = this.A00.A00;
                    c1689Ek2.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
