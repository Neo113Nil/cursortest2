package com.instagram.common.viewpoint.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05687j extends AbstractC1830j0 {
    public C05687j(C1695gi c1695gi, O7 o7) {
        super(c1695gi, o7);
    }

    private C1828iy A00(Runnable runnable) {
        return new C1828iy(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1830j0
    public final NQ A0I() {
        C1882jz successfullyLoadedAdapter = (C1882jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1830j0
    public final void A0P() {
        C1882jz interstitialAdapter = (C1882jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1830j0
    public final void A0R(N1 n1, C1126Tw c1126Tw, C1124Tu c1124Tu, O8 o8) {
        C1882jz c1882jz = (C1882jz) n1;
        C1829iz c1829iz = new C1829iz(this, o8, c1882jz);
        A0H().postDelayed(c1829iz, c1126Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c1882jz.A0A(this.A0B, A00(c1829iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
