package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.vk.reefton.protocol.ReefProtocol$Event;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import org.json.JSONObject;
import xsna.b6l;
import xsna.izg0;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yzs;

/* compiled from: AndroidShow.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {45, 84}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidShow$invoke$1 extends SuspendLambda implements wzs<lsr<? super ShowEvent>, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidShow this$0;

    /* compiled from: AndroidShow.kt */
    @b6l(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements wzs<lsr<? super ShowEvent>, spj<? super s3q0>, Object> {
        final /* synthetic */ Ref$ObjectRef<AdObject> $ad;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AdPlayer $adPlayer;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Ref$ObjectRef<AdObject> ref$ObjectRef, AndroidShow androidShow, AdObject adObject, AdPlayer adPlayer, UnityAdsShowOptions unityAdsShowOptions, spj<? super AnonymousClass4> spjVar) {
            super(2, spjVar);
            this.$ad = ref$ObjectRef;
            this.this$0 = androidShow;
            this.$adObject = adObject;
            this.$adPlayer = adPlayer;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass4(this.$ad, this.this$0, this.$adObject, this.$adPlayer, this.$showOptions, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GameServerIdReader gameServerIdReader;
            JSONObject data;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            AdObject adObject = this.$ad.element;
            gameServerIdReader = this.this$0.gameServerIdReader;
            Object playerServerId = this.$ad.element.getPlayerServerId();
            Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
            if (obj2 != null) {
                boolean z = obj2 instanceof String;
                Object obj3 = obj2;
                if (!z) {
                    obj3 = playerServerId;
                }
                if (obj3 != null) {
                    playerServerId = obj3;
                }
            }
            if (gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey()) != null) {
                gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
            }
            adObject.setPlayerServerId((String) playerServerId);
            this.$adObject.getState().setValue(AdObjectState.SHOWING);
            AdPlayer adPlayer = this.$adPlayer;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            adPlayer.show(new AndroidShowOptions((unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null) ? null : JSONObjectExtensionsKt.toBuiltInMap(data), this.$ad.element.getPlacementId(), this.$ad.element.isOfferwallAd(), this.$ad.element.getOfferwallPlacementName()));
            return s3q0.a;
        }

        @Override // xsna.wzs
        public final Object invoke(lsr<? super ShowEvent> lsrVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass4) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* compiled from: AndroidShow.kt */
    @b6l(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements yzs<lsr<? super ShowEvent>, Throwable, spj<? super s3q0>, Object> {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ ByteString $opportunityId;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AdObject adObject, AndroidShow androidShow, ByteString byteString, spj<? super AnonymousClass5> spjVar) {
            super(3, spjVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$opportunityId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AdRepository adRepository;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$adObject.getState().setValue(AdObjectState.COMPLETED);
            adRepository = this.this$0.adRepository;
            adRepository.removeAd(this.$opportunityId);
            return s3q0.a;
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super ShowEvent> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
            return new AnonymousClass5(this.$adObject, this.this$0, this.$opportunityId, spjVar).invokeSuspend(s3q0.a);
        }
    }

    /* compiled from: AndroidShow.kt */
    @b6l(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$6", f = "AndroidShow.kt", l = {ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$6, reason: invalid class name */
    public static final class AnonymousClass6 extends SuspendLambda implements yzs<lsr<? super ShowEvent>, ShowEvent, spj<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass6(spj<? super AnonymousClass6> spjVar) {
            super(3, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ShowEvent showEvent;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lsr lsrVar = (lsr) this.L$0;
                ShowEvent showEvent2 = (ShowEvent) this.L$1;
                this.L$0 = showEvent2;
                this.label = 1;
                if (lsrVar.emit(showEvent2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                showEvent = showEvent2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                showEvent = (ShowEvent) this.L$0;
                kotlin.a.a(obj);
            }
            return Boolean.valueOf(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
        }

        @Override // xsna.yzs
        public final Object invoke(lsr<? super ShowEvent> lsrVar, ShowEvent showEvent, spj<? super Boolean> spjVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(spjVar);
            anonymousClass6.L$0 = lsrVar;
            anonymousClass6.L$1 = showEvent;
            return anonymousClass6.invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidShow$invoke$1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, spj<? super AndroidShow$invoke$1> spjVar) {
        super(2, spjVar);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidShow$invoke$1 androidShow$invoke$1 = new AndroidShow$invoke$1(this.$adObject, this.this$0, this.$showOptions, spjVar);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x017f, code lost:
    
        if (r0.collect(r1, r26) == r10) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0185  */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, com.unity3d.ads.core.data.model.AdObject] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.unity3d.ads.core.data.model.AdObject] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final lsr lsrVar;
        ByteString opportunityId;
        Ref$ObjectRef ref$ObjectRef;
        AdRepository adRepository;
        SendDiagnosticEvent sendDiagnosticEvent;
        HandleGatewayAdResponse handleGatewayAdResponse;
        Context context;
        Object invoke;
        ByteString byteString;
        lsr lsrVar2;
        ShowConfigurationInternal showConfigurationInternal;
        ValidateExtrasSize validateExtrasSize;
        SendDiagnosticEvent sendDiagnosticEvent2;
        AdPlayer adPlayer;
        AdRepository adRepository2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsrVar = (lsr) this.L$0;
            if (this.$adObject.getOpportunityId().isEmpty()) {
                throw new IllegalArgumentException("No opportunityId");
            }
            opportunityId = this.$adObject.getOpportunityId();
            ref$ObjectRef = new Ref$ObjectRef();
            adRepository = this.this$0.adRepository;
            ?? ad = adRepository.getAd(opportunityId);
            if (ad == 0) {
                throw new IllegalStateException("No ad associated with opportunityId");
            }
            ref$ObjectRef.element = ad;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            if (unityAdsShowOptions != null && (showConfigurationInternal = unityAdsShowOptions.showConfiguration) != null) {
                AndroidShow androidShow = this.this$0;
                AdObject adObject = this.$adObject;
                validateExtrasSize = androidShow.validateExtrasSize;
                validateExtrasSize.invoke(showConfigurationInternal.getExtras(), "show", adObject);
            }
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = ((AdObject) ref$ObjectRef.element).getWebViewLessLoadingRequiredData();
            if (webViewLessLoadingRequiredData != null) {
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_less_show_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
                UnityAdsLoadOptions loadOptions = ((AdObject) ref$ObjectRef.element).getLoadOptions();
                AdResponseOuterClass.AdResponse adResponse = webViewLessLoadingRequiredData.getAdResponse();
                context = this.this$0.context;
                String placementId = ((AdObject) ref$ObjectRef.element).getPlacementId();
                DiagnosticEventRequestOuterClass.DiagnosticAdType adType = ((AdObject) ref$ObjectRef.element).getAdType();
                boolean isHeaderBidding = ((AdObject) ref$ObjectRef.element).isHeaderBidding();
                this.L$0 = lsrVar;
                this.L$1 = opportunityId;
                this.L$2 = ref$ObjectRef;
                this.label = 1;
                invoke = handleGatewayAdResponse.invoke(loadOptions, opportunityId, adResponse, context, placementId, adType, isHeaderBidding, true, this);
                if (invoke != coroutineSingletons) {
                    byteString = opportunityId;
                    lsrVar2 = lsrVar;
                }
                return coroutineSingletons;
            }
            Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
            sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, this.$adObject, (Integer) null, (ByteString) null, 110, (Object) null);
            adPlayer = ((AdObject) ref$ObjectRef2.element).getAdPlayer();
            if (adPlayer != null) {
                throw new IllegalStateException("No adPlayer associated with ad");
            }
            izg0 izg0Var = new izg0(new FlowKt__LimitKt$transformWhile$1(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(adPlayer.getOnShowEvent(), new AnonymousClass4(ref$ObjectRef2, this.this$0, this.$adObject, adPlayer, this.$showOptions, null)), new AnonymousClass5(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass6(null), null));
            lsr lsrVar3 = new lsr() { // from class: com.unity3d.ads.core.domain.AndroidShow$invoke$1.7
                @Override // xsna.lsr
                public /* bridge */ /* synthetic */ Object emit(Object obj2, spj spjVar) {
                    return emit((ShowEvent) obj2, (spj<? super s3q0>) spjVar);
                }

                public final Object emit(ShowEvent showEvent, spj<? super s3q0> spjVar) {
                    Object emit = lsrVar.emit(showEvent, spjVar);
                    return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : s3q0.a;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
            byteString = (ByteString) this.L$1;
            lsrVar2 = (lsr) this.L$0;
            kotlin.a.a(obj);
            ref$ObjectRef = ref$ObjectRef3;
            invoke = obj;
        }
        if (!(((LoadResult) invoke) instanceof LoadResult.Success)) {
            throw new IllegalStateException("Webview less Load - WebView load fail");
        }
        adRepository2 = this.this$0.adRepository;
        ?? ad2 = adRepository2.getAd(byteString);
        if (ad2 == 0) {
            throw new IllegalStateException("Webview less Load - No ad after deferred WebView load");
        }
        ref$ObjectRef.element = ad2;
        lsrVar = lsrVar2;
        opportunityId = byteString;
        Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef;
        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, this.$adObject, (Integer) null, (ByteString) null, 110, (Object) null);
        adPlayer = ((AdObject) ref$ObjectRef22.element).getAdPlayer();
        if (adPlayer != null) {
        }
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super ShowEvent> lsrVar, spj<? super s3q0> spjVar) {
        return ((AndroidShow$invoke$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
