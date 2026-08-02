package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1823it extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C05817w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C05597a A02;

    public C1823it(C05597a c05597a, O8 o8, C05817w c05817w) {
        this.A02 = c05597a;
        this.A01 = o8;
        this.A00 = c05817w;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C1167Vm(adErrorType, ""));
    }
}
