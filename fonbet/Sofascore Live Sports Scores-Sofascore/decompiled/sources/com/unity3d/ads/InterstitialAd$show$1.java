package com.unity3d.ads;

import android.app.Activity;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsSDK;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lm5;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import gatewayprotocol.v1.ErrorOuterClass;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.InterstitialAd$show$1", f = "InterstitialAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class InterstitialAd$show$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ShowConfiguration $configuration;
    final /* synthetic */ InterstitialShowListener $listener;
    int label;
    final /* synthetic */ InterstitialAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAd$show$1(ShowConfiguration showConfiguration, InterstitialAd interstitialAd, Activity activity, InterstitialShowListener interstitialShowListener, rq3<? super InterstitialAd$show$1> rq3Var) {
        super(2, rq3Var);
        this.$configuration = showConfiguration;
        this.this$0 = interstitialAd;
        this.$activity = activity;
        this.$listener = interstitialShowListener;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new InterstitialAd$show$1(this.$configuration, this.this$0, this.$activity, this.$listener, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((InterstitialAd$show$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        AdObject adObject;
        AdObject adObject2;
        AdObject adObject3;
        AdObject adObject4;
        AdObject adObject5;
        Map<String, String> extras;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        ShowConfiguration showConfiguration = this.$configuration;
        String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
        ShowConfiguration showConfiguration2 = this.$configuration;
        if (showConfiguration2 == null || (map = showConfiguration2.getExtras()) == null) {
            map = lm5.a;
            map.getClass();
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
        final InterstitialShowListener interstitialShowListener = this.$listener;
        final InterstitialAd interstitialAd = this.this$0;
        unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.InterstitialAd$show$1.2

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.unity3d.ads.InterstitialAd$show$1$2$WhenMappings */
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
            public void onClick(String placementId2) {
                placementId2.getClass();
                InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                if (interstitialShowListener2 != null) {
                    interstitialShowListener2.onClicked(interstitialAd);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onComplete(String placementId2, UnityAds.UnityAdsShowCompletionState state) {
                ShowFinishState showFinishState;
                placementId2.getClass();
                state.getClass();
                InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                if (interstitialShowListener2 != null) {
                    InterstitialAd interstitialAd2 = interstitialAd;
                    int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
                    if (i == 1) {
                        showFinishState = ShowFinishState.COMPLETED;
                    } else {
                        if (i != 2) {
                            zzl.b();
                            return;
                        }
                        showFinishState = ShowFinishState.SKIPPED;
                    }
                    interstitialShowListener2.onCompleted(interstitialAd2, showFinishState);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onError(String placementId2, UnityAds.UnityAdsShowError error, String message) {
                placementId2.getClass();
                error.getClass();
                message.getClass();
                int i = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                ErrorOuterClass.PublicErrorCode publicErrorCode = i != 1 ? i != 2 ? i != 3 ? ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                if (interstitialShowListener2 != null) {
                    interstitialShowListener2.onFailed(interstitialAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onLeftApplication(String placementId2) {
                placementId2.getClass();
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onRewarded(String str) {
                Listeners.DefaultImpls.onRewarded(this, str);
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onStart(String placementId2) {
                placementId2.getClass();
                InterstitialShowListener interstitialShowListener2 = InterstitialShowListener.this;
                if (interstitialShowListener2 != null) {
                    interstitialShowListener2.onStarted(interstitialAd);
                }
            }
        });
        return Unit.a;
    }
}
