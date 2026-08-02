package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C15257j extends AbstractC2787j0 {
    public C15257j(C2652gi c2652gi, O7 o7) {
        super(c2652gi, o7);
    }

    private C2785iy A00(Runnable runnable) {
        return new C2785iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final NQ A0I() {
        C2839jz successfullyLoadedAdapter = (C2839jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final void A0P() {
        C2839jz interstitialAdapter = (C2839jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2787j0
    public final void A0R(N1 n1, C2083Tw c2083Tw, C2081Tu c2081Tu, O8 o8) {
        C2839jz c2839jz = (C2839jz) n1;
        C2786iz c2786iz = new C2786iz(this, o8, c2839jz);
        A0H().postDelayed(c2786iz, c2083Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2839jz.A0A(this.A0B, A00(c2786iz), o8, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
