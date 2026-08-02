package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04593c extends AbstractC0715Dt {
    public final /* synthetic */ C0703Dh A00;

    public C04593c(C0703Dh c0703Dh) {
        this.A00 = c0703Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0716Du c0716Du) {
        C0732Ek c0732Ek;
        Handler handler;
        c0732Ek = this.A00.A01;
        if (c0732Ek == null || c0716Du.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C1596f7(this));
    }
}
