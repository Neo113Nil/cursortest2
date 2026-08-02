package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1866Lh extends AbstractRunnableC2139Wc {
    public final WeakReference<C2597fp> A00;

    public C1866Lh(C2597fp c2597fp) {
        this.A00 = new WeakReference<>(c2597fp);
    }

    public C1866Lh(WeakReference<C2597fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        C2597fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
