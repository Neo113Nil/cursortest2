package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2216pe implements AnonymousClass24 {
    public final C2218pg A00;
    public final BP<Integer> A01;
    public static final String A04 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final AnonymousClass23<C2216pe> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pf
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2216pe.A00(bundle);
        }
    };

    public C2216pe(C2218pg c2218pg, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c2218pg.A01)) {
            this.A00 = c2218pg;
            this.A01 = BP.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C2216pe A00(Bundle bundle) {
        return new C2216pe(C2218pg.A06.A6f((Bundle) AbstractC04793y.A01(bundle.getBundle(A04))), AbstractC0639As.A09((int[]) AbstractC04793y.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2216pe c2216pe = (C2216pe) obj;
        return this.A00.equals(c2216pe.A00) && this.A01.equals(c2216pe.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
