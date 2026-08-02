package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class S2 extends C2641s0 {
    private final ISBannerSize b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(C2445h0 adProperties, ISBannerSize iSBannerSize) {
        super(adProperties);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.b = iSBannerSize;
    }

    @Override // com.ironsource.C2641s0, com.ironsource.InterfaceC2500k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        super.a(auctionRequestParams);
        auctionRequestParams.a(this.b);
    }
}
