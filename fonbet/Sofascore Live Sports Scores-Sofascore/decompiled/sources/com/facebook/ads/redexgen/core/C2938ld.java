package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2938ld implements InterfaceC1816Jj {
    public final long[] A00;
    public final C3162pT[] A01;

    public C2938ld(C3162pT[] c3162pTArr, long[] jArr) {
        this.A01 = c3162pTArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final List<C3162pT> A7X(long j) {
        int A0L = C5C.A0L(this.A00, j, true, false);
        if (A0L == -1 || this.A01[A0L] == C3162pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[A0L]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final long A83(int i) {
        boolean z = true;
        AbstractC14363y.A07(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        AbstractC14363y.A07(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1816Jj
    public final int A8a(long j) {
        int A0K = C5C.A0K(this.A00, j, false, false);
        int index = this.A00.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
