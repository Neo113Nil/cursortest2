package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MaxAdRevenueListener.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2", f = "MaxAdRevenueListener.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class MaxAdRevenueListener$onMessageReceived$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Bundle $messageData;
    Object L$0;
    int label;
    final /* synthetic */ MaxAdRevenueListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxAdRevenueListener$onMessageReceived$2(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle, spj<? super MaxAdRevenueListener$onMessageReceived$2> spjVar) {
        super(2, spjVar);
        this.this$0 = maxAdRevenueListener;
        this.$messageData = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new MaxAdRevenueListener$onMessageReceived$2(this.this$0, this.$messageData, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        AdRevenueData parseRevenueBundle;
        Logger logger2;
        HandleAdRevenueEvent handleAdRevenueEvent;
        AdRevenueData adRevenueData;
        Logger logger3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace("Failed to process ad revenue event", e);
        }
        if (i == 0) {
            kotlin.a.a(obj);
            parseRevenueBundle = this.this$0.parseRevenueBundle(this.$messageData);
            if (parseRevenueBundle == null) {
                logger2 = this.this$0.logger;
                Logger.DefaultImpls.trace$default(logger2, "Failed to parse revenue event", null, 2, null);
                return s3q0.a;
            }
            handleAdRevenueEvent = this.this$0.handleAdRevenueEvent;
            ClientInfoOuterClass.MediationProvider mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            AdRevenueOrigin adRevenueOrigin = AdRevenueOrigin.AUTOMATIC_COLLECTION;
            this.L$0 = parseRevenueBundle;
            this.label = 1;
            if (handleAdRevenueEvent.invoke(parseRevenueBundle, mediationProvider, adRevenueOrigin, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            adRevenueData = parseRevenueBundle;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adRevenueData = (AdRevenueData) this.L$0;
            kotlin.a.a(obj);
        }
        logger3 = this.this$0.logger;
        Logger.DefaultImpls.trace$default(logger3, "Ad revenue event sent: revenue=" + adRevenueData.getRevenue() + ", network=" + adRevenueData.getNetworkName(), null, 2, null);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((MaxAdRevenueListener$onMessageReceived$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
