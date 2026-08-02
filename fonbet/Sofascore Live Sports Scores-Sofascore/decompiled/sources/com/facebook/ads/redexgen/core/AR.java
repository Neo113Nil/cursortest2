package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* loaded from: assets/audience_network/classes2.dex */
public final class AR extends Timeline {
    public static String[] A04 = {"nDkuZZEFG4iGMwbsGEvKBo4ueCI7wxif", "OM6NJOBBZMKrUazjZz4CdR8Ljfz9nzwy", "h9AdYD37MAF4FmuzDOyGIvEw", "VkmtOVI9Gbc78hEhNGIz4LiMtzYnUrU2", "bkWqGplua99PBwc9ED6yZtwvDtuw6KwN", "305DBImSoaz5MlD7g6qLfpiwFg5d3Fl", "QtOjLPNYFNek9UnmHWOFtbeX9w", "y2avdvKeY0dhYPEmFhuJXZmeyR2ks2D4"};
    public final BP<C3179pl> A00;
    public final BP<C3177pj> A01;
    public final int[] A02;
    public final int[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AR(BP<C3177pj> bp, BP<C3179pl> bp2, int[] iArr) {
        AbstractC14363y.A07(bp.size() == iArr.length);
        this.A01 = bp;
        this.A00 = bp2;
        this.A02 = iArr;
        this.A03 = new int[iArr.length];
        for (int i = 0; i < i; i++) {
            int[] iArr2 = this.A03;
            int i2 = iArr[i];
            iArr2[i2] = i;
        }
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A06() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A07() {
        return this.A01.size();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A08(int i, int i2, boolean z) {
        if (i2 == 1) {
            return i;
        }
        if (i == A0C(z)) {
            if (i2 == 2) {
                return A0B(z);
            }
            return -1;
        }
        if (z) {
            return this.A02[this.A03[i] + 1];
        }
        return i + 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0A(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0B(boolean z) {
        if (A0N()) {
            return -1;
        }
        if (!z) {
            return 0;
        }
        int[] iArr = this.A02;
        if (A04[1].charAt(22) == 'H') {
            throw new RuntimeException();
        }
        A04[7] = "6ncpOYdEr0xsUZdZBYFnYejLEosAstPL";
        return iArr[0];
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final int A0C(boolean z) {
        if (A0N()) {
            return -1;
        }
        if (z) {
            return this.A02[A07() - 1];
        }
        return A07() - 1;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C3179pl A0I(int i, C3179pl p, boolean z) {
        C3220qS c3220qS;
        C3179pl p2 = this.A00.get(i);
        Object obj = p2.A03;
        Object obj2 = p2.A04;
        int i2 = p2.A00;
        long j = p2.A01;
        long j2 = p2.A02;
        c3220qS = p2.A06;
        p.A0G(obj, obj2, i2, j, j2, c3220qS, p2.A05);
        return p;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final C3177pj A0L(int i, C3177pj c3177pj, long j) {
        C3177pj c3177pj2 = this.A01.get(i);
        c3177pj.A07(c3177pj2.A0C, c3177pj2.A09, c3177pj2.A0A, c3177pj2.A06, c3177pj2.A07, c3177pj2.A04, c3177pj2.A0G, c3177pj2.A0D, c3177pj2.A08, c3177pj2.A02, c3177pj2.A03, c3177pj2.A00, c3177pj2.A01, c3177pj2.A05);
        c3177pj.A0F = c3177pj2.A0F;
        return c3177pj;
    }

    @Override // com.facebook.ads.androidx.media3.common.Timeline
    public final Object A0M(int i) {
        throw new UnsupportedOperationException();
    }
}
