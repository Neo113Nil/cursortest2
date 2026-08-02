package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AdRevenueObserver.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2", f = "AdRevenueObserver.kt", l = {36, 37}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AdRevenueObserver$invoke$2 extends SuspendLambda implements wzs<AdRevenueEventRequestOuterClass.AdRevenueEventRequest, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdRevenueObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRevenueObserver$invoke$2(AdRevenueObserver adRevenueObserver, spj<? super AdRevenueObserver$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = adRevenueObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AdRevenueObserver$invoke$2 adRevenueObserver$invoke$2 = new AdRevenueObserver$invoke$2(this.this$0, spjVar);
        adRevenueObserver$invoke$2.L$0 = obj;
        return adRevenueObserver$invoke$2;
    }

    @Override // xsna.wzs
    public final Object invoke(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, spj<? super s3q0> spjVar) {
        return ((AdRevenueObserver$invoke$2) create(adRevenueEventRequest, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(2:26|(1:(4:29|30|16|17)(2:31|32))(1:33))(4:4|5|6|(2:8|9))|11|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, null, r5, r6, r7, r8, 1, null) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r0 = e;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
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
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            try {
            } catch (Exception e) {
                exc = e;
                adRevenueObserver$invoke$2 = this;
                logger = adRevenueObserver$invoke$2.this$0.logger;
                logger.trace("Unexpected error processing ad revenue event", exc);
                return s3q0.a;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return s3q0.a;
            }
            a.a(obj);
        } else {
            a.a(obj);
            AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest = (AdRevenueEventRequestOuterClass.AdRevenueEventRequest) this.L$0;
            try {
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl _create = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
                _create.setAdRevenueEventRequest(adRevenueEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Exception e2) {
                e = e2;
                adRevenueObserver$invoke$2 = this;
                exc = e;
                logger = adRevenueObserver$invoke$2.this$0.logger;
                logger.trace("Unexpected error processing ad revenue event", exc);
                return s3q0.a;
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
