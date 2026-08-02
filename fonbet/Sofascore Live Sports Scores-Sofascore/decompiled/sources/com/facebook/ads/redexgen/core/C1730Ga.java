package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1730Ga extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C14614x A00;

    public C1730Ga(C14614x c14614x) {
        this.A00 = c14614x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        AbstractC2365c3 abstractC2365c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC2365c3 abstractC2365c32;
        abstractC2365c3 = this.A00.A00;
        if (abstractC2365c3 != null) {
            abstractC2365c32 = this.A00.A00;
            abstractC2365c32.A1F();
        }
        AbstractC2187Yb abstractC2187Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC2187Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
