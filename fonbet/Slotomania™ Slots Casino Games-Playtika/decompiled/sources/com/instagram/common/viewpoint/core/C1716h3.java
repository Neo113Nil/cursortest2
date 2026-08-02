package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.h3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1716h3 extends AbstractRunnableC1182Wc {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ SA A01;
    public final /* synthetic */ UK A02;

    public C1716h3(SA sa, UK uk2, Drawable drawable) {
        this.A01 = sa;
        this.A02 = uk2;
        this.A00 = drawable;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        this.A02.A1P(this.A00);
    }
}
