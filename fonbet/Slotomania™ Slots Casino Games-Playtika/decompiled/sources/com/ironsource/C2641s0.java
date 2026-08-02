package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2641s0 implements InterfaceC2500k2 {
    private final C2445h0 a;

    public C2641s0(C2445h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a = adProperties;
    }

    @Override // com.ironsource.InterfaceC2500k2
    public void a(com.ironsource.mediationsdk.h auctionRequestParams) {
        Intrinsics.checkNotNullParameter(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.a.c());
        auctionRequestParams.a(this.a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
