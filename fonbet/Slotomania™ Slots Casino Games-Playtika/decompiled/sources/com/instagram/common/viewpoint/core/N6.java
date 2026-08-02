package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* loaded from: assets/audience_network/classes2.dex */
public final class N6 {
    public static N1 A00;

    public final N1 A00(final C1695gi c1695gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new AnonymousClass81();
            case 2:
                if (C1145Up.A1O(c1695gi)) {
                    return new AnonymousClass80();
                }
                return new AnonymousClass81();
            case 3:
                return new C1882jz();
            case 4:
                return new C1877ju(c1695gi);
            case 5:
                return new C1877ju(c1695gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.instagram.common.viewpoint.core.C1877ju, com.instagram.common.viewpoint.core.N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C05817w();
            default:
                return null;
        }
    }
}
