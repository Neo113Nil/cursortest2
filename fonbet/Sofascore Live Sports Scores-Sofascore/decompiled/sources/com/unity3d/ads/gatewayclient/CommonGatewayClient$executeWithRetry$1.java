package com.unity3d.ads.gatewayclient;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER, 84, 108}, m = "executeWithRetry")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGatewayClient$executeWithRetry$1 extends sq3 {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$executeWithRetry$1(CommonGatewayClient commonGatewayClient, rq3<? super CommonGatewayClient$executeWithRetry$1> rq3Var) {
        super(rq3Var);
        this.this$0 = commonGatewayClient;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeWithRetry;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeWithRetry = this.this$0.executeWithRetry(null, null, null, null, this);
        return executeWithRetry;
    }
}
