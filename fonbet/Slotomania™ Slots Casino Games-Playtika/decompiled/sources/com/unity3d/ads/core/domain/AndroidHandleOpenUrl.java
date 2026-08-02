package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: AndroidHandleOpenUrl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JU\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "context", "Landroid/content/Context;", "intentCreation", "Lcom/unity3d/ads/core/domain/IntentCreation;", "(Landroid/content/Context;Lcom/unity3d/ads/core/domain/IntentCreation;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "url", "", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "action", "extras", "", "", HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT, "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;
    private final IntentCreation intentCreation;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.unity3d.ads");
        p0.startActivity(p1);
    }

    public AndroidHandleOpenUrl(Context context, IntentCreation intentCreation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(final AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z, Continuation<? super Boolean> continuation) {
        AndroidHandleOpenUrl$invoke$1 androidHandleOpenUrl$invoke$1;
        int i;
        Object m11180constructorimpl;
        boolean m11187isSuccessimpl;
        if (continuation instanceof AndroidHandleOpenUrl$invoke$1) {
            androidHandleOpenUrl$invoke$1 = (AndroidHandleOpenUrl$invoke$1) continuation;
            if ((androidHandleOpenUrl$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidHandleOpenUrl$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidHandleOpenUrl$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidHandleOpenUrl$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Intent invoke = this.intentCreation.invoke(str, str2, str3, map);
                    if (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                        invoke.setFlags(268435456);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            AndroidHandleOpenUrl androidHandleOpenUrl = this;
                            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, invoke);
                            m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        }
                        m11187isSuccessimpl = Result.m11187isSuccessimpl(m11180constructorimpl);
                        return Boxing.boxBoolean(m11187isSuccessimpl);
                    }
                    final SharedFlow onSubscription = FlowKt.onSubscription(AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages(), new AndroidHandleOpenUrl$invoke$result$1(adObject, invoke, z, null));
                    Flow<DisplayMessage> flow = new Flow<DisplayMessage>() { // from class: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ AdObject $adObject$inlined;
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2", f = "AndroidHandleOpenUrl.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                            /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, AdObject adObject) {
                                this.$this_unsafeFlow = flowCollector;
                                this.$adObject$inlined = adObject;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label -= Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            DisplayMessage displayMessage = (DisplayMessage) obj;
                                            if ((displayMessage instanceof DisplayMessage.OpenUrlResult) && Intrinsics.areEqual(displayMessage.getOpportunityId(), ProtobufExtensionsKt.toUUID(this.$adObject$inlined.getOpportunityId()).toString())) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super DisplayMessage> flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, adObject), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }
                    };
                    androidHandleOpenUrl$invoke$1.label = 1;
                    obj = FlowKt.first(flow, androidHandleOpenUrl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult");
                m11187isSuccessimpl = ((DisplayMessage.OpenUrlResult) obj).getSuccess();
                return Boxing.boxBoolean(m11187isSuccessimpl);
            }
        }
        androidHandleOpenUrl$invoke$1 = new AndroidHandleOpenUrl$invoke$1(this, continuation);
        Object obj2 = androidHandleOpenUrl$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidHandleOpenUrl$invoke$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult");
        m11187isSuccessimpl = ((DisplayMessage.OpenUrlResult) obj2).getSuccess();
        return Boxing.boxBoolean(m11187isSuccessimpl);
    }
}
