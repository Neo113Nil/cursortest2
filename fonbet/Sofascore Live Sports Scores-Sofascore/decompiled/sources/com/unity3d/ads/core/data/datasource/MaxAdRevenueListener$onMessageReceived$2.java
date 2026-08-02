package com.unity3d.ads.core.data.datasource;

import android.os.Bundle;
import com.unity3d.ads.core.data.model.AdRevenueData;
import com.unity3d.ads.core.data.model.AdRevenueOrigin;
import com.unity3d.ads.core.domain.events.HandleAdRevenueEvent;
import com.unity3d.ads.core.log.Logger;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.data.datasource.MaxAdRevenueListener$onMessageReceived$2", f = "MaxAdRevenueListener.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class MaxAdRevenueListener$onMessageReceived$2 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ Bundle $messageData;
    Object L$0;
    int label;
    final /* synthetic */ MaxAdRevenueListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxAdRevenueListener$onMessageReceived$2(MaxAdRevenueListener maxAdRevenueListener, Bundle bundle, rq3<? super MaxAdRevenueListener$onMessageReceived$2> rq3Var) {
        super(2, rq3Var);
        this.this$0 = maxAdRevenueListener;
        this.$messageData = bundle;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new MaxAdRevenueListener$onMessageReceived$2(this.this$0, this.$messageData, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((MaxAdRevenueListener$onMessageReceived$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        AdRevenueData parseRevenueBundle;
        Logger logger2;
        HandleAdRevenueEvent handleAdRevenueEvent;
        AdRevenueData adRevenueData;
        Logger logger3;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        try {
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.trace("Failed to process ad revenue event", e);
        }
        if (i == 0) {
            y6a.M(obj);
            parseRevenueBundle = this.this$0.parseRevenueBundle(this.$messageData);
            MaxAdRevenueListener maxAdRevenueListener = this.this$0;
            if (parseRevenueBundle == null) {
                logger2 = maxAdRevenueListener.logger;
                Logger.DefaultImpls.trace$default(logger2, "Failed to parse revenue event", null, 2, null);
                return Unit.a;
            }
            handleAdRevenueEvent = maxAdRevenueListener.handleAdRevenueEvent;
            ClientInfoOuterClass.MediationProvider mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            AdRevenueOrigin adRevenueOrigin = AdRevenueOrigin.AUTOMATIC_COLLECTION;
            this.L$0 = parseRevenueBundle;
            this.label = 1;
            if (handleAdRevenueEvent.invoke(parseRevenueBundle, mediationProvider, adRevenueOrigin, this) == lu3Var) {
                return lu3Var;
            }
            adRevenueData = parseRevenueBundle;
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            adRevenueData = (AdRevenueData) this.L$0;
            y6a.M(obj);
        }
        logger3 = this.this$0.logger;
        Logger.DefaultImpls.trace$default(logger3, "Ad revenue event sent: revenue=" + adRevenueData.getRevenue() + ", network=" + adRevenueData.getNetworkName(), null, 2, null);
        return Unit.a;
    }
}
