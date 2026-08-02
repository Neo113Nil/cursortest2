package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1957lF implements L8 {
    public C2255qI A00;
    public AnonymousClass53 A01;
    public InterfaceC0802Hd A02;

    public C1957lF(String str) {
        this.A00 = new C04462p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC04793y.A02(this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void A5A(C05024v c05024v) {
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
        int A07 = c05024v.A07();
        this.A02.AIr(c05024v, A07);
        this.A02.AIu(A03, 1, A07, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
        this.A01 = anonymousClass53;
        lg.A05();
        this.A02 = ha.AKS(lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
