package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2914lF implements L8 {
    public C3212qI A00;
    public AnonymousClass53 A01;
    public InterfaceC1759Hd A02;

    public C2914lF(String str) {
        this.A00 = new C14032p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC14363y.A02(this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void A5A(C14594v c14594v) {
        A00();
        long A03 = this.A01.A03();
        long A04 = this.A01.A04();
        if (A03 == C.TIME_UNSET || A04 == C.TIME_UNSET) {
            return;
        }
        if (A04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(A04).A14();
            this.A02.A6e(this.A00);
        }
        int A07 = c14594v.A07();
        this.A02.AIr(c14594v, A07);
        this.A02.AIu(A03, 1, A07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
        this.A01 = anonymousClass53;
        lg.A05();
        this.A02 = ha.AKS(lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
