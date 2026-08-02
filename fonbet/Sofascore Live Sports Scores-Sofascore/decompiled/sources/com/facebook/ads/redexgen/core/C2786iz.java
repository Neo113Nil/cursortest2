package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2786iz extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C2839jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C15257j A02;

    public C2786iz(C15257j c15257j, O8 o8, C2839jz c2839jz) {
        this.A02 = c15257j;
        this.A01 = o8;
        this.A00 = c2839jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C2124Vm A00 = C2124Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
