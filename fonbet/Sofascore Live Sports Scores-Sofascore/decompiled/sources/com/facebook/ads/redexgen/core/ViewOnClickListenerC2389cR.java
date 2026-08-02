package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2389cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public ViewOnClickListenerC2389cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC1904Mt abstractC1904Mt;
        AbstractC2817jd abstractC2817jd;
        Handler handler;
        Runnable runnable;
        AbstractC2817jd abstractC2817jd2;
        AbstractC1904Mt abstractC1904Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (!z) {
                this.A00.A0N = true;
                abstractC1904Mt = this.A00.A0b;
                if (abstractC1904Mt != null) {
                    KE ke = this.A00;
                    abstractC1904Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC1904Mt2).A0M().toString());
                }
                abstractC2817jd = this.A00.A0E;
                if (abstractC2817jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC2817jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC2817jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z2 = this.A00.A0M;
            ke2.A0i(z2 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
