package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "<anonymous>", "(Lku3;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CommonGatewayClient$request$2 extends hoi implements Function2<ku3, rq3<? super UniversalResponseOuterClass.UniversalResponse>, Object> {
    final /* synthetic */ OperationType $operationType;
    final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
    final /* synthetic */ RequestPolicy $requestPolicy;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonGatewayClient$request$2(CommonGatewayClient commonGatewayClient, OperationType operationType, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, rq3<? super CommonGatewayClient$request$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = commonGatewayClient;
        this.$operationType = operationType;
        this.$url = str;
        this.$request = universalRequest;
        this.$requestPolicy = requestPolicy;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new CommonGatewayClient$request$2(this.this$0, this.$operationType, this.$url, this.$request, this.$requestPolicy, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super UniversalResponseOuterClass.UniversalResponse> rq3Var) {
        return ((CommonGatewayClient$request$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        RequestUrlFactory requestUrlFactory;
        Object executeWithRetry;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                y6a.M(obj);
                return obj;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        CommonGatewayClient commonGatewayClient = this.this$0;
        requestUrlFactory = commonGatewayClient.requestUrlFactory;
        String requestUrl = requestUrlFactory.getRequestUrl(this.$operationType, this.$url);
        UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
        RequestPolicy requestPolicy = this.$requestPolicy;
        OperationType operationType = this.$operationType;
        this.label = 1;
        executeWithRetry = commonGatewayClient.executeWithRetry(requestUrl, universalRequest, requestPolicy, operationType, this);
        return executeWithRetry == lu3Var ? lu3Var : executeWithRetry;
    }
}
