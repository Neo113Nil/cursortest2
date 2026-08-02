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
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardedAd.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.RewardedAd$show$1", f = "RewardedAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RewardedAd$show$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ShowConfiguration $configuration;
    final /* synthetic */ RewardedShowListener $listener;
    int label;
    final /* synthetic */ RewardedAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RewardedAd$show$1(ShowConfiguration showConfiguration, RewardedAd rewardedAd, Activity activity, RewardedShowListener rewardedShowListener, Continuation<? super RewardedAd$show$1> continuation) {
        super(2, continuation);
        this.$configuration = showConfiguration;
        this.this$0 = rewardedAd;
        this.$activity = activity;
        this.$listener = rewardedShowListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RewardedAd$show$1(this.$configuration, this.this$0, this.$activity, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RewardedAd$show$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, String> emptyMap;
        AdObject adObject;
        AdObject adObject2;
        AdObject adObject3;
        AdObject adObject4;
        AdObject adObject5;
        Map<String, String> extras;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ShowConfiguration showConfiguration = this.$configuration;
        String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
        ShowConfiguration showConfiguration2 = this.$configuration;
        if (showConfiguration2 == null || (emptyMap = showConfiguration2.getExtras()) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(customRewardString, emptyMap);
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
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
            public void onLeftApplication(String placementId2) {
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onError(String placementId2, UnityAds.UnityAdsShowError error, String message) {
                ErrorOuterClass.PublicErrorCode publicErrorCode;
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
                Intrinsics.checkNotNullParameter(error, "error");
                Intrinsics.checkNotNullParameter(message, "message");
                int i = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                if (i == 1) {
                    publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                } else if (i == 2) {
                    publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                } else if (i == 3) {
                    publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                } else {
                    publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL;
                }
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onFailed(rewardedAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onStart(String placementId2) {
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onStarted(rewardedAd);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onClick(String placementId2) {
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onClicked(rewardedAd);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onComplete(String placementId2, UnityAds.UnityAdsShowCompletionState state) {
                ShowFinishState showFinishState;
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
                Intrinsics.checkNotNullParameter(state, "state");
                int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
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
            public void onRewarded(String placementId2) {
                Intrinsics.checkNotNullParameter(placementId2, "placementId");
                RewardedShowListener rewardedShowListener2 = RewardedShowListener.this;
                if (rewardedShowListener2 != null) {
                    rewardedShowListener2.onRewarded(rewardedAd);
                }
            }
        });
        return Unit.INSTANCE;
    }
}
