package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import defpackage.a70;
import defpackage.bf3;
import defpackage.duf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.RewardedAd$Companion$load$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class RewardedAd$Companion$load$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ LoadConfiguration $configuration;
    final /* synthetic */ LoadListener<RewardedAd> $listener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$Companion$load$1(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener, rq3<? super RewardedAd$Companion$load$1> rq3Var) {
        super(2, rq3Var);
        this.$configuration = loadConfiguration;
        this.$listener = loadListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(LoadListener loadListener, Throwable th) {
        loadListener.onAdLoaded(null, new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.getNumber(), bf3.o(new StringBuilder("Unity Ads SDK load failed due to unexpected error: "), th)));
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        RewardedAd$Companion$load$1 rewardedAd$Companion$load$1 = new RewardedAd$Companion$load$1(this.$configuration, this.$listener, rq3Var);
        rewardedAd$Companion$load$1.L$0 = obj;
        return rewardedAd$Companion$load$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((RewardedAd$Companion$load$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        LoadConfiguration loadConfiguration = this.$configuration;
        final LoadListener<RewardedAd> loadListener = this.$listener;
        try {
            p2g p2gVar = w2g.b;
            LoadConfigurationInternal loadConfigurationInternal = new LoadConfigurationInternal(loadConfiguration.getPlacementId(), loadConfiguration.getAdMarkup(), loadConfiguration.getMediationAdUnitId(), loadConfiguration.getMediationInfo(), tub.p(loadConfiguration.getExtras()));
            UUID randomUUID = UUID.randomUUID();
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(randomUUID.toString());
            unityAdsLoadOptions.setAdMarkup(loadConfiguration.getAdMarkup());
            unityAdsLoadOptions.loadConfiguration = loadConfigurationInternal;
            UnityAdsImplementation.getInstance().load(loadConfiguration.getPlacementId(), unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.ads.RewardedAd$Companion$load$1$1$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError error) {
                    error.getClass();
                    loadListener.onAdLoaded(null, error);
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    adObject.getClass();
                    loadListener.onAdLoaded(new RewardedAd(adObject, (SafeCallbackInvoke) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(null, duf.a.getOrCreateKotlinClass(SafeCallbackInvoke.class), 1, null))), null);
                }
            });
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        LoadListener<RewardedAd> loadListener2 = this.$listener;
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            Utilities.wrapCustomerListener(new b(loadListener2, a, 1));
        }
        return Unit.a;
    }
}
