package com.unity3d.ads;

import android.app.Activity;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsSDK;
import gatewayprotocol.v1.ErrorOuterClass;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.jgp;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: RewardedAd.kt */
@b6l(c = "com.unity3d.ads.RewardedAd$show$1", f = "RewardedAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class RewardedAd$show$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ShowConfiguration $configuration;
    final /* synthetic */ RewardedShowListener $listener;
    int label;
    final /* synthetic */ RewardedAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAd$show$1(ShowConfiguration showConfiguration, RewardedAd rewardedAd, Activity activity, RewardedShowListener rewardedShowListener, spj<? super RewardedAd$show$1> spjVar) {
        super(2, spjVar);
        this.$configuration = showConfiguration;
        this.this$0 = rewardedAd;
        this.$activity = activity;
        this.$listener = rewardedShowListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new RewardedAd$show$1(this.$configuration, this.this$0, this.$activity, this.$listener, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        AdObject adObject;
        AdObject adObject2;
        AdObject adObject3;
        AdObject adObject4;
        AdObject adObject5;
        Map<String, String> extras;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ShowConfiguration showConfiguration = this.$configuration;
        String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
        ShowConfiguration showConfiguration2 = this.$configuration;
        if (showConfiguration2 == null || (map = showConfiguration2.getExtras()) == null) {
            map = jgp.b;
        }
        ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(customRewardString, map);
        UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
        adObject = this.this$0.adObject;
        unityAdsShowOptions.setObjectId(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString());
        unityAdsShowOptions.showConfiguration = showConfigurationInternal;
        MetaData metaData = new MetaData(this.$activity);
        ShowConfiguration showConfiguration3 = this.$configuration;
        if (showConfiguration3 != null && (extras = showConfiguration3.getExtras()) != null) {
            for (Map.Entry<String, String> entry : extras.entrySet()) {
                metaData.set(entry.getKey(), entry.getValue());
            }
        }
        metaData.commit();
        adObject2 = this.this$0.adObject;
        adObject2.setShowConfiguration(this.$configuration);
        adObject3 = this.this$0.adObject;
        ShowConfiguration showConfiguration4 = this.$configuration;
        adObject3.setPlayerServerId(showConfiguration4 != null ? showConfiguration4.getCustomRewardString() : null);
        adObject4 = this.this$0.adObject;
        adObject4.setActivity(new WeakReference<>(this.$activity));
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK(null, 1, null);
        adObject5 = this.this$0.adObject;
        String placementId = adObject5.getPlacementId();
        final RewardedShowListener rewardedShowListener = this.$listener;
        final RewardedAd rewardedAd = this.this$0;
        unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.RewardedAd$show$1.2

            /* compiled from: RewardedAd.kt */
            /* renamed from: com.unity3d.ads.RewardedAd$show$1$2$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                static {
                    int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
                    try {
                        iArr[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                    try {
                        iArr2[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onClick(String str) {
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onClicked(rewardedAd);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                ShowFinishState showFinishState;
                int i = WhenMappings.$EnumSwitchMapping$1[unityAdsShowCompletionState.ordinal()];
                if (i == 1) {
                    showFinishState = ShowFinishState.COMPLETED;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    showFinishState = ShowFinishState.SKIPPED;
                }
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onCompleted(rewardedAd, showFinishState);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                int i = WhenMappings.$EnumSwitchMapping$0[unityAdsShowError.ordinal()];
                ErrorOuterClass.PublicErrorCode publicErrorCode = i != 1 ? i != 2 ? i != 3 ? ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onFailed(rewardedAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onRewarded(String str) {
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onRewarded(rewardedAd);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onStart(String str) {
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onStarted(rewardedAd);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onLeftApplication(String str) {
            }
        });
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((RewardedAd$show$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
