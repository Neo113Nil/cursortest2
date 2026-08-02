package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.CrashConfig;

/* renamed from: com.facebook.ads.redexgen.X.m1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2962m1 implements HY {
    public final /* synthetic */ C2961m0 A00;

    public C2962m1(C2961m0 c2961m0) {
        this.A00 = c2961m0;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        AbstractC1808Jb abstractC1808Jb;
        long j;
        abstractC1808Jb = this.A00.A0B;
        j = this.A00.A07;
        return abstractC1808Jb.A05(j);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j) {
        AbstractC1808Jb abstractC1808Jb;
        long j2;
        long j3;
        long targetGranule;
        long targetGranule2;
        long j4;
        long j5;
        abstractC1808Jb = this.A00.A0B;
        long A06 = abstractC1808Jb.A06(j);
        j2 = this.A00.A09;
        j3 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j6 = (j3 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        long j7 = (j2 + (j6 / targetGranule2)) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        j4 = this.A00.A09;
        j5 = this.A00.A08;
        long estimatedPosition = C5C.A0T(j7, j4, j5 - 1);
        return new HX(new HZ(j, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
