package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.pZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2211pZ implements AnonymousClass24 {
    public final int A00;
    public final C2218pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = C5C.A0h(0);
    public static final String A09 = C5C.A0h(1);
    public static final String A08 = C5C.A0h(3);
    public static final String A06 = C5C.A0h(4);
    public static final AnonymousClass23<C2211pZ> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2211pZ.A00(bundle);
        }
    };

    public C2211pZ(C2218pg c2218pg, boolean z, int[] iArr, boolean[] zArr) {
        this.A00 = c2218pg.A01;
        boolean z2 = false;
        AbstractC04793y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c2218pg;
        if (z && this.A00 > 1) {
            z2 = true;
        }
        this.A02 = z2;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C2211pZ A00(Bundle bundle) {
        C2218pg A6f = C2218pg.A06.A6f((Bundle) AbstractC04793y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC1918ka.A00(bundle.getIntArray(A09), new int[A6f.A01]);
        boolean[] selected = (boolean[]) AbstractC1918ka.A00(bundle.getBooleanArray(A08), new boolean[A6f.A01]);
        return new C2211pZ(A6f, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2211pZ c2211pZ = (C2211pZ) obj;
        if (this.A02 == c2211pZ.A02 && this.A01.equals(c2211pZ.A01) && Arrays.equals(this.A03, c2211pZ.A03) && Arrays.equals(this.A04, c2211pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
