package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku3;", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku3;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {26, 28}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidRefresh$invoke$2 extends hoi implements Function2<ku3, rq3<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse>, Object> {
    final /* synthetic */ ByteString $adDataRefreshToken;
    final /* synthetic */ ByteString $opportunityId;
    int label;
    final /* synthetic */ AndroidRefresh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRefresh$invoke$2(AndroidRefresh androidRefresh, ByteString byteString, ByteString byteString2, rq3<? super AndroidRefresh$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidRefresh;
        this.$adDataRefreshToken = byteString;
        this.$opportunityId = byteString2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidRefresh$invoke$2(this.this$0, this.$adDataRefreshToken, this.$opportunityId, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> rq3Var) {
        return ((AndroidRefresh$invoke$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r12 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r12 == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GetAdDataRefreshRequest getAdDataRefreshRequest;
        GetRequestPolicy getRequestPolicy;
        GatewayClient gatewayClient;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            getAdDataRefreshRequest = this.this$0.getAdDataRefreshRequest;
            ByteString byteString = this.$adDataRefreshToken;
            ByteString byteString2 = this.$opportunityId;
            this.label = 1;
            obj = getAdDataRefreshRequest.invoke(byteString, byteString2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke = getRequestPolicy.invoke();
        gatewayClient = this.this$0.gatewayClient;
        OperationType operationType = OperationType.REFRESH;
        this.label = 2;
        obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, this, 1, null);
    }
}
