package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.UUID;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fpf0;
import xsna.m5k;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: RewardedAd.kt */
@b6l(c = "com.unity3d.ads.RewardedAd$Companion$load$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class RewardedAd$Companion$load$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ LoadConfiguration $configuration;
    final /* synthetic */ LoadListener<RewardedAd> $listener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$Companion$load$1(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener, spj<? super RewardedAd$Companion$load$1> spjVar) {
        super(2, spjVar);
        this.$configuration = loadConfiguration;
        this.$listener = loadListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(LoadListener loadListener, Throwable th) {
        loadListener.onAdLoaded(null, new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.getNumber(), m5k.b(th, new StringBuilder("Unity Ads SDK load failed due to unexpected error: "))));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        RewardedAd$Companion$load$1 rewardedAd$Companion$load$1 = new RewardedAd$Companion$load$1(this.$configuration, this.$listener, spjVar);
        rewardedAd$Companion$load$1.L$0 = obj;
        return rewardedAd$Companion$load$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        LoadConfiguration loadConfiguration = this.$configuration;
        final LoadListener<RewardedAd> loadListener = this.$listener;
        try {
            LoadConfigurationInternal loadConfigurationInternal = new LoadConfigurationInternal(loadConfiguration.getPlacementId(), loadConfiguration.getAdMarkup(), loadConfiguration.getMediationAdUnitId(), loadConfiguration.getMediationInfo(), pn00.t(loadConfiguration.getExtras()));
            UUID randomUUID = UUID.randomUUID();
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(randomUUID.toString());
            unityAdsLoadOptions.setAdMarkup(loadConfiguration.getAdMarkup());
            unityAdsLoadOptions.loadConfiguration = loadConfigurationInternal;
            UnityAdsImplementation.getInstance().load(loadConfiguration.getPlacementId(), unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.ads.RewardedAd$Companion$load$1$1$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError unityAdsError) {
                    loadListener.onAdLoaded(null, unityAdsError);
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    loadListener.onAdLoaded(new RewardedAd(adObject, (SafeCallbackInvoke) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(null, fpf0.a(SafeCallbackInvoke.class), 1, null))), null);
                }
            });
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        final LoadListener<RewardedAd> loadListener2 = this.$listener;
        final Throwable a = Result.a(failure);
        if (a != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    RewardedAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(LoadListener.this, a);
                }
            });
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((RewardedAd$Companion$load$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
