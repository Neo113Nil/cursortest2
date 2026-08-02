package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0909Lh extends AbstractRunnableC1182Wc {
    public final WeakReference<C1640fp> A00;

    public C0909Lh(C1640fp c1640fp) {
        this.A00 = new WeakReference<>(c1640fp);
    }

    public C0909Lh(WeakReference<C1640fp> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        C1640fp viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
