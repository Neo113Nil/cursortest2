package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: CommonGatewayClient.kt */
@b6l(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CommonGatewayClient$request$2 extends SuspendLambda implements wzs<yvj, spj<? super UniversalResponseOuterClass.UniversalResponse>, Object> {
    final /* synthetic */ OperationType $operationType;
    final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ RequestPolicy $requestPolicy;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$request$2(CommonGatewayClient commonGatewayClient, OperationType operationType, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, spj<? super CommonGatewayClient$request$2> spjVar) {
        super(2, spjVar);
        this.this$0 = commonGatewayClient;
        this.$operationType = operationType;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new CommonGatewayClient$request$2(this.this$0, this.$operationType, this.$url, this.$request, this.$requestPolicy, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RequestUrlFactory requestUrlFactory;
        Object executeWithRetry;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return obj;
        }
        a.a(obj);
        CommonGatewayClient commonGatewayClient = this.this$0;
        requestUrlFactory = commonGatewayClient.requestUrlFactory;
        String requestUrl = requestUrlFactory.getRequestUrl(this.$operationType, this.$url);
        UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
        RequestPolicy requestPolicy = this.$requestPolicy;
        OperationType operationType = this.$operationType;
        this.label = 1;
        executeWithRetry = commonGatewayClient.executeWithRetry(requestUrl, universalRequest, requestPolicy, operationType, this);
        return executeWithRetry == coroutineSingletons ? coroutineSingletons : executeWithRetry;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super UniversalResponseOuterClass.UniversalResponse> spjVar) {
        return ((CommonGatewayClient$request$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
