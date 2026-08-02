package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1829iz extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C1882jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C05687j A02;

    public C1829iz(C05687j c05687j, O8 o8, C1882jz c1882jz) {
        this.A02 = c05687j;
        this.A01 = o8;
        this.A00 = c1882jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1167Vm A00 = C1167Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
