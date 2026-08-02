package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "currentAdRevenueEventRequest", "Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2", f = "AdRevenueObserver.kt", l = {36, 37}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AdRevenueObserver$invoke$2 extends hoi implements Function2<AdRevenueEventRequestOuterClass.AdRevenueEventRequest, rq3<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdRevenueObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRevenueObserver$invoke$2(AdRevenueObserver adRevenueObserver, rq3<? super AdRevenueObserver$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = adRevenueObserver;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AdRevenueObserver$invoke$2 adRevenueObserver$invoke$2 = new AdRevenueObserver$invoke$2(this.this$0, rq3Var);
        adRevenueObserver$invoke$2.L$0 = obj;
        return adRevenueObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, rq3<? super Unit> rq3Var) {
        return ((AdRevenueObserver$invoke$2) create(adRevenueEventRequest, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:2)|(2:25|(1:(3:28|16|17)(2:29|30))(1:31))(4:4|5|6|(2:8|9))|11|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, null, r5, r6, r7, r8, 1, null) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        r0 = e;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        AdRevenueObserver$invoke$2 adRevenueObserver$invoke$2;
        Logger logger;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i != 0) {
            try {
            } catch (Exception e) {
                exc = e;
                adRevenueObserver$invoke$2 = this;
                logger = adRevenueObserver$invoke$2.this$0.logger;
                logger.trace("Unexpected error processing ad revenue event", exc);
                return Unit.a;
            }
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        } else {
            y6a.M(obj);
            AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest = (AdRevenueEventRequestOuterClass.AdRevenueEventRequest) this.L$0;
            try {
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                newBuilder.getClass();
                UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setAdRevenueEventRequest(adRevenueEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } catch (Exception e2) {
                e = e2;
                adRevenueObserver$invoke$2 = this;
                exc = e;
                logger = adRevenueObserver$invoke$2.this$0.logger;
                logger.trace("Unexpected error processing ad revenue event", exc);
                return Unit.a;
            }
        }
        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke = getRequestPolicy.invoke();
        OperationType operationType = OperationType.AD_REVENUE_EVENT;
        this.label = 2;
        adRevenueObserver$invoke$2 = this;
    }
}
