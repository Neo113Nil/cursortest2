package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2780it extends AbstractRunnableC2139Wc {
    public final /* synthetic */ C15387w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C15167a A02;

    public C2780it(C15167a c15167a, O8 o8, C15387w c15387w) {
        this.A02 = c15167a;
        this.A01 = o8;
        this.A00 = c15387w;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2139Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C2124Vm(adErrorType, ""));
    }
}
