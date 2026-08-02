package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C14163c extends AbstractC1672Dt {
    public final /* synthetic */ C1660Dh A00;

    public C14163c(C1660Dh c1660Dh) {
        this.A00 = c1660Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1673Du c1673Du) {
        C1689Ek c1689Ek;
        Handler handler;
        c1689Ek = this.A00.A01;
        if (c1689Ek == null || c1673Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C2553f7(this));
    }
}
