package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1697Es extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C1689Ek A00;

    public C1697Es(C1689Ek c1689Ek) {
        this.A00 = c1689Ek;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        boolean z;
        UM um;
        Handler handler;
        int i;
        z = this.A00.A04;
        if (!z) {
            um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            um.A02(new EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            handler = this.A00.A08;
            i = this.A00.A01;
            handler.postDelayed(this, i);
        }
    }
}
