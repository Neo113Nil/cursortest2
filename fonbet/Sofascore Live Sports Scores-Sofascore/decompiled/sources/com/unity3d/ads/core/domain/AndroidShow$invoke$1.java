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
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.b98;
import defpackage.ct8;
import defpackage.fdi;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.pog;
import defpackage.rq3;
import defpackage.t98;
import defpackage.u1;
import defpackage.v98;
import defpackage.y6a;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {45, 84}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidShow$invoke$1 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AndroidShow this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
    public static final class AnonymousClass4 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
        final /* synthetic */ fsf $ad;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AdPlayer $adPlayer;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(fsf fsfVar, AndroidShow androidShow, AdObject adObject, AdPlayer adPlayer, UnityAdsShowOptions unityAdsShowOptions, rq3<? super AnonymousClass4> rq3Var) {
            super(2, rq3Var);
            this.$ad = fsfVar;
            this.this$0 = androidShow;
            this.$adObject = adObject;
            this.$adPlayer = adPlayer;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass4(this.$ad, this.this$0, this.$adObject, this.$adPlayer, this.$showOptions, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass4) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            GameServerIdReader gameServerIdReader;
            JSONObject data;
            lu3 lu3Var = lu3.a;
            Map<String, Object> map = null;
            if (this.label != 0) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            AdObject adObject = (AdObject) this.$ad.a;
            gameServerIdReader = this.this$0.gameServerIdReader;
            Object playerServerId = ((AdObject) this.$ad.a).getPlayerServerId();
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
            ((fdi) this.$adObject.getState()).l(AdObjectState.SHOWING);
            AdPlayer adPlayer = this.$adPlayer;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            if (unityAdsShowOptions != null && (data = unityAdsShowOptions.getData()) != null) {
                map = JSONObjectExtensionsKt.toBuiltInMap(data);
            }
            adPlayer.show(new AndroidShowOptions(map, ((AdObject) this.$ad.a).getPlacementId(), ((AdObject) this.$ad.a).isOfferwallAd(), ((AdObject) this.$ad.a).getOfferwallPlacementName()));
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "", "<anonymous>", "(Lb98;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$5", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$5, reason: invalid class name */
    public static final class AnonymousClass5 extends hoi implements ct8 {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ ByteString $opportunityId;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AdObject adObject, AndroidShow androidShow, ByteString byteString, rq3<? super AnonymousClass5> rq3Var) {
            super(3, rq3Var);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$opportunityId = byteString;
        }

        @Override // defpackage.ct8
        public final Object invoke(b98 b98Var, Throwable th, rq3<? super Unit> rq3Var) {
            return new AnonymousClass5(this.$adObject, this.this$0, this.$opportunityId, rq3Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            AdRepository adRepository;
            lu3 lu3Var = lu3.a;
            if (this.label != 0) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            ((fdi) this.$adObject.getState()).l(AdObjectState.COMPLETED);
            adRepository = this.this$0.adRepository;
            adRepository.removeAd(this.$opportunityId);
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "", "<anonymous>", "(Lb98;Lcom/unity3d/ads/core/data/model/ShowEvent;)Z"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$6", f = "AndroidShow.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$6, reason: invalid class name */
    public static final class AnonymousClass6 extends hoi implements ct8 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass6(rq3<? super AnonymousClass6> rq3Var) {
            super(3, rq3Var);
        }

        @Override // defpackage.ct8
        public final Object invoke(b98 b98Var, ShowEvent showEvent, rq3<? super Boolean> rq3Var) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(rq3Var);
            anonymousClass6.L$0 = b98Var;
            anonymousClass6.L$1 = showEvent;
            return anonymousClass6.invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            ShowEvent showEvent;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                b98 b98Var = (b98) this.L$0;
                ShowEvent showEvent2 = (ShowEvent) this.L$1;
                this.L$0 = showEvent2;
                this.label = 1;
                if (b98Var.emit(showEvent2, this) == lu3Var) {
                    return lu3Var;
                }
                showEvent = showEvent2;
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                showEvent = (ShowEvent) this.L$0;
                y6a.M(obj);
            }
            return Boolean.valueOf(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidShow$invoke$1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, rq3<? super AndroidShow$invoke$1> rq3Var) {
        super(2, rq3Var);
        this.$adObject = adObject;
        this.this$0 = androidShow;
        this.$showOptions = unityAdsShowOptions;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidShow$invoke$1 androidShow$invoke$1 = new AndroidShow$invoke$1(this.$adObject, this.this$0, this.$showOptions, rq3Var);
        androidShow$invoke$1.L$0 = obj;
        return androidShow$invoke$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
        return ((AndroidShow$invoke$1) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x017e, code lost:
    
        if (r0.collect(r1, r27) == r10) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0184  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final b98 b98Var;
        ByteString opportunityId;
        fsf fsfVar;
        AdRepository adRepository;
        SendDiagnosticEvent sendDiagnosticEvent;
        HandleGatewayAdResponse handleGatewayAdResponse;
        Context context;
        Object invoke;
        ByteString byteString;
        b98 b98Var2;
        ShowConfigurationInternal showConfigurationInternal;
        ValidateExtrasSize validateExtrasSize;
        SendDiagnosticEvent sendDiagnosticEvent2;
        AdPlayer adPlayer;
        AdRepository adRepository2;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            b98Var = (b98) this.L$0;
            if (this.$adObject.getOpportunityId().isEmpty()) {
                a70.p("No opportunityId");
                return null;
            }
            opportunityId = this.$adObject.getOpportunityId();
            fsfVar = new fsf();
            adRepository = this.this$0.adRepository;
            AdObject ad = adRepository.getAd(opportunityId);
            if (ad == null) {
                a70.r("No ad associated with opportunityId");
                return null;
            }
            fsfVar.a = ad;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            if (unityAdsShowOptions != null && (showConfigurationInternal = unityAdsShowOptions.showConfiguration) != null) {
                AndroidShow androidShow = this.this$0;
                AdObject adObject = this.$adObject;
                validateExtrasSize = androidShow.validateExtrasSize;
                validateExtrasSize.invoke(showConfigurationInternal.getExtras(), "show", adObject);
            }
            AdObject.WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = ((AdObject) fsfVar.a).getWebViewLessLoadingRequiredData();
            if (webViewLessLoadingRequiredData != null) {
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_less_show_started", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                handleGatewayAdResponse = this.this$0.handleGatewayAdResponse;
                UnityAdsLoadOptions loadOptions = ((AdObject) fsfVar.a).getLoadOptions();
                AdResponseOuterClass.AdResponse adResponse = webViewLessLoadingRequiredData.getAdResponse();
                context = this.this$0.context;
                String placementId = ((AdObject) fsfVar.a).getPlacementId();
                DiagnosticEventRequestOuterClass.DiagnosticAdType adType = ((AdObject) fsfVar.a).getAdType();
                boolean isHeaderBidding = ((AdObject) fsfVar.a).isHeaderBidding();
                this.L$0 = b98Var;
                this.L$1 = opportunityId;
                this.L$2 = fsfVar;
                this.label = 1;
                invoke = handleGatewayAdResponse.invoke(loadOptions, opportunityId, adResponse, context, placementId, adType, isHeaderBidding, true, this);
                if (invoke != lu3Var) {
                    byteString = opportunityId;
                    b98Var2 = b98Var;
                }
                return lu3Var;
            }
            fsf fsfVar2 = fsfVar;
            sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, this.$adObject, (Integer) null, (ByteString) null, 110, (Object) null);
            adPlayer = ((AdObject) fsfVar2.a).getAdPlayer();
            if (adPlayer != null) {
                a70.r("No adPlayer associated with ad");
                return null;
            }
            pog pogVar = new pog(new u1(new t98(new v98(new AnonymousClass4(fsfVar2, this.this$0, this.$adObject, adPlayer, this.$showOptions, null), adPlayer.getOnShowEvent()), new AnonymousClass5(this.$adObject, this.this$0, opportunityId, null), 0), new AnonymousClass6(null), (rq3) null, 29));
            b98 b98Var3 = new b98() { // from class: com.unity3d.ads.core.domain.AndroidShow$invoke$1.7
                public final Object emit(ShowEvent showEvent, rq3<? super Unit> rq3Var) {
                    Object emit = b98.this.emit(showEvent, rq3Var);
                    return emit == lu3.a ? emit : Unit.a;
                }

                @Override // defpackage.b98
                public /* bridge */ /* synthetic */ Object emit(Object obj2, rq3 rq3Var) {
                    return emit((ShowEvent) obj2, (rq3<? super Unit>) rq3Var);
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fsf fsfVar3 = (fsf) this.L$2;
            byteString = (ByteString) this.L$1;
            b98Var2 = (b98) this.L$0;
            y6a.M(obj);
            fsfVar = fsfVar3;
            invoke = obj;
        }
        if (!(((LoadResult) invoke) instanceof LoadResult.Success)) {
            a70.r("Webview less Load - WebView load fail");
            return null;
        }
        adRepository2 = this.this$0.adRepository;
        AdObject ad2 = adRepository2.getAd(byteString);
        if (ad2 == null) {
            a70.r("Webview less Load - No ad after deferred WebView load");
            return null;
        }
        fsfVar.a = ad2;
        b98Var = b98Var2;
        opportunityId = byteString;
        fsf fsfVar22 = fsfVar;
        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, this.$adObject, (Integer) null, (ByteString) null, 110, (Object) null);
        adPlayer = ((AdObject) fsfVar22.a).getAdPlayer();
        if (adPlayer != null) {
        }
    }
}
