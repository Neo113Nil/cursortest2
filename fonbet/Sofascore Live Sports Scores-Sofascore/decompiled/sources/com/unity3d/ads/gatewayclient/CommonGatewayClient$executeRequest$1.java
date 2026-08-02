package com.unity3d.ads.gatewayclient;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.il4;
import defpackage.rq3;
import defpackage.sq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@il4(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "executeRequest")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGatewayClient$executeRequest$1 extends sq3 {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$executeRequest$1(CommonGatewayClient commonGatewayClient, rq3<? super CommonGatewayClient$executeRequest$1> rq3Var) {
        super(rq3Var);
        this.this$0 = commonGatewayClient;
    }

    @Override // defpackage.h21
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeRequest;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeRequest = this.this$0.executeRequest(null, 0, null, this);
        return executeRequest;
    }
}
