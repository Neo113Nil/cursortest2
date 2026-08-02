package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ck, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2408ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C1815Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC1904Mt abstractC1904Mt;
        AbstractC1904Mt abstractC1904Mt2;
        boolean z;
        C2329bT c2329bT;
        boolean z2;
        C2329bT c2329bT2;
        C2369c7 c2369c7;
        AbstractC2817jd abstractC2817jd;
        Handler handler;
        Runnable runnable;
        AbstractC2817jd abstractC2817jd2;
        C2369c7 c2369c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC1904Mt = this.A00.A0W;
            if (abstractC1904Mt == null) {
                return;
            }
            abstractC1904Mt2 = this.A00.A0W;
            Uri A0M = ((AnonymousClass85) abstractC1904Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z = this.A00.A0D;
            if (!z) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c2369c7 = this.A00.A0b;
                if (c2369c7.A0D() != null) {
                    c2369c72 = this.A00.A0b;
                    c2369c72.A0D().ACQ();
                }
                abstractC2817jd = this.A00.A0X;
                if (abstractC2817jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC2817jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC2817jd2.A0q());
                }
            }
            c2329bT = this.A00.A09;
            if (c2329bT != null) {
                c2329bT2 = this.A00.A09;
                c2329bT2.A0B();
                this.A00.A09 = null;
            }
            C1815Ji c1815Ji = this.A00;
            z2 = this.A00.A0D;
            c1815Ji.A0q(z2 ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            WU.A00(th, this);
        }
    }

    public ViewOnClickListenerC2408ck(C1815Ji c1815Ji) {
        this.A00 = c1815Ji;
    }
}
