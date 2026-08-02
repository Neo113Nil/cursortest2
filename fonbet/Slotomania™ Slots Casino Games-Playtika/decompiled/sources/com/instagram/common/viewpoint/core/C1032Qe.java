package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1032Qe extends AbstractRunnableC1182Wc {
    public final /* synthetic */ XO A00;

    public C1032Qe(XO xo) {
        this.A00 = xo;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        Handler handler;
        long j;
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        handler = this.A00.A05;
        j = this.A00.A02;
        handler.postDelayed(this, j);
    }
}
