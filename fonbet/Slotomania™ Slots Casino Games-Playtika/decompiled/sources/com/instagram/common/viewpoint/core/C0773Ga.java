package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0773Ga extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C05044x A00;

    public C0773Ga(C05044x c05044x) {
        this.A00 = c05044x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        AbstractC1408c3 abstractC1408c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1408c3 abstractC1408c32;
        abstractC1408c3 = this.A00.A00;
        if (abstractC1408c3 != null) {
            abstractC1408c32 = this.A00.A00;
            abstractC1408c32.A1F();
        }
        AbstractC1230Yb abstractC1230Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1230Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
