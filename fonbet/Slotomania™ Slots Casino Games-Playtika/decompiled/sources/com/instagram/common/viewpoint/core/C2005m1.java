package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.m1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2005m1 implements HY {
    public final /* synthetic */ C2004m0 A00;

    public C2005m1(C2004m0 c2004m0) {
        this.A00 = c2004m0;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        AbstractC0851Jb abstractC0851Jb;
        long j;
        abstractC0851Jb = this.A00.A0B;
        j = this.A00.A07;
        return abstractC0851Jb.A05(j);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j) {
        AbstractC0851Jb abstractC0851Jb;
        long j2;
        long j3;
        long targetGranule;
        long targetGranule2;
        long j4;
        long j5;
        abstractC0851Jb = this.A00.A0B;
        long A06 = abstractC0851Jb.A06(j);
        j2 = this.A00.A09;
        j3 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j6 = (j3 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        j4 = this.A00.A09;
        j5 = this.A00.A08;
        long estimatedPosition = C5C.A0T((j2 + (j6 / targetGranule2)) - 30000, j4, j5 - 1);
        return new HX(new HZ(j, estimatedPosition));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
