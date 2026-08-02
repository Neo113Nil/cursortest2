package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import defpackage.a70;
import defpackage.ad2;
import defpackage.be5;
import defpackage.dij;
import defpackage.eed;
import defpackage.fcp;
import defpackage.fsf;
import defpackage.ku3;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.u2g;
import defpackage.v98;
import defpackage.w2g;
import defpackage.whj;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z88;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J2\u00101\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0082@¢\u0006\u0004\b1\u00102JP\u0010>\u001a\u00020=2\u0006\u00104\u001a\u0002032\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\"2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0096B¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010KR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010M¨\u0006N"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "webViewLessLoadStrategy", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "webViewUrl", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webviewContainer", "", "loadUrl", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Lcom/unity3d/ads/adplayer/WebViewContainer;Lrq3;)Ljava/lang/Object;", "", "t", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "response", "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "cleanup", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Landroid/content/Context;", "context", "placementId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "forceWebViewLoad", "Lcom/unity3d/ads/core/data/model/LoadResult;", "invoke", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZZLrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {

    @NotNull
    private final AdPlayerScope adPlayerScope;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final CampaignRepository campaignRepository;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final GetAdPlayer getAdPlayer;

    @NotNull
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;

    @NotNull
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final GetWebViewBridgeUseCase getWebViewBridge;

    @NotNull
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    public AndroidHandleGatewayAdResponse(@NotNull AdRepository adRepository, @NotNull AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, @NotNull GetWebViewBridgeUseCase getWebViewBridgeUseCase, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, @NotNull CampaignRepository campaignRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetLatestWebViewConfiguration getLatestWebViewConfiguration, @NotNull AdPlayerScope adPlayerScope, @NotNull GetAdPlayer getAdPlayer, @NotNull CacheWebViewAssets cacheWebViewAssets, @NotNull WebViewLessLoadStrategy webViewLessLoadStrategy, @NotNull SessionRepository sessionRepository) {
        adRepository.getClass();
        androidGetWebViewContainerUseCase.getClass();
        getWebViewBridgeUseCase.getClass();
        deviceInfoRepository.getClass();
        handleInvocationsFromAdViewer.getClass();
        campaignRepository.getClass();
        sendDiagnosticEvent.getClass();
        getOperativeEventApi.getClass();
        getLatestWebViewConfiguration.getClass();
        adPlayerScope.getClass();
        getAdPlayer.getClass();
        cacheWebViewAssets.getClass();
        webViewLessLoadStrategy.getClass();
        sessionRepository.getClass();
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.webViewLessLoadStrategy = webViewLessLoadStrategy;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        if (r14.destroy(r9) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cleanup(Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, rq3<? super Unit> rq3Var) {
        AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$1;
        int i;
        String message;
        AdPlayer adPlayer2;
        if (rq3Var instanceof AndroidHandleGatewayAdResponse$cleanup$1) {
            androidHandleGatewayAdResponse$cleanup$1 = (AndroidHandleGatewayAdResponse$cleanup$1) rq3Var;
            int i2 = androidHandleGatewayAdResponse$cleanup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$cleanup$1.label = i2 - Integer.MIN_VALUE;
                AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$12 = androidHandleGatewayAdResponse$cleanup$1;
                Object obj = androidHandleGatewayAdResponse$cleanup$12.result;
                lu3 lu3Var = lu3.a;
                i = androidHandleGatewayAdResponse$cleanup$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
                    OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
                    newBuilder.getClass();
                    OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
                    _create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
                    Throwable cause = th.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
                        message = "";
                    }
                    _create.setMessage(message);
                    OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
                    GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
                    OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
                    ByteString trackingToken = adResponse.getTrackingToken();
                    trackingToken.getClass();
                    ByteString byteString2 = _build.toByteString();
                    byteString2.getClass();
                    androidHandleGatewayAdResponse$cleanup$12.L$0 = adPlayer;
                    androidHandleGatewayAdResponse$cleanup$12.label = 1;
                    if (GetOperativeEventApi.invoke$default(getOperativeEventApi, operativeEventType, byteString, trackingToken, byteString2, null, null, androidHandleGatewayAdResponse$cleanup$12, 48, null) != lu3Var) {
                        adPlayer2 = adPlayer;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                adPlayer2 = (AdPlayer) androidHandleGatewayAdResponse$cleanup$12.L$0;
                y6a.M(obj);
                if (adPlayer2 != null) {
                    return Unit.a;
                }
                androidHandleGatewayAdResponse$cleanup$12.L$0 = null;
                androidHandleGatewayAdResponse$cleanup$12.label = 2;
            }
        }
        androidHandleGatewayAdResponse$cleanup$1 = new AndroidHandleGatewayAdResponse$cleanup$1(this, rq3Var);
        AndroidHandleGatewayAdResponse$cleanup$1 androidHandleGatewayAdResponse$cleanup$122 = androidHandleGatewayAdResponse$cleanup$1;
        Object obj2 = androidHandleGatewayAdResponse$cleanup$122.result;
        lu3 lu3Var2 = lu3.a;
        i = androidHandleGatewayAdResponse$cleanup$122.label;
        if (i != 0) {
        }
        if (adPlayer2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadUrl(AdObject adObject, String str, WebViewContainer webViewContainer, rq3<? super Unit> rq3Var) {
        AndroidHandleGatewayAdResponse$loadUrl$1 androidHandleGatewayAdResponse$loadUrl$1;
        int i;
        long b;
        AdObject adObject2;
        AdObject adObject3;
        long j;
        Object u2gVar;
        AdObject adObject4;
        if (rq3Var instanceof AndroidHandleGatewayAdResponse$loadUrl$1) {
            androidHandleGatewayAdResponse$loadUrl$1 = (AndroidHandleGatewayAdResponse$loadUrl$1) rq3Var;
            int i2 = androidHandleGatewayAdResponse$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleGatewayAdResponse$loadUrl$1.result;
                Object obj2 = lu3.a;
                i = androidHandleGatewayAdResponse$loadUrl$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    xhj.a.getClass();
                    xuc.a.getClass();
                    b = xuc.b();
                    try {
                        p2g p2gVar = w2g.b;
                        adObject2 = adObject;
                        try {
                            androidHandleGatewayAdResponse$loadUrl$1.L$0 = adObject2;
                            androidHandleGatewayAdResponse$loadUrl$1.J$0 = b;
                            androidHandleGatewayAdResponse$loadUrl$1.label = 1;
                            if (webViewContainer.loadUrl(str, androidHandleGatewayAdResponse$loadUrl$1) == obj2) {
                                return obj2;
                            }
                            adObject3 = adObject2;
                            j = b;
                        } catch (Throwable th) {
                            th = th;
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                            adObject4 = adObject2;
                            j = b;
                            dij dijVar = new dij(new w2g(u2gVar), whj.b(j), null);
                            Object obj3 = ((w2g) dijVar.a).a;
                            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = obj3 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME;
                            be5 be5Var = be5.NANOSECONDS;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, new Double(xd5.j(dijVar.b)), (Map) null, (Map) null, adObject4, (Integer) null, (ByteString) null, 108, (Object) null);
                            y6a.M(obj3);
                            return Unit.a;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        adObject2 = adObject;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = androidHandleGatewayAdResponse$loadUrl$1.J$0;
                    adObject3 = (AdObject) androidHandleGatewayAdResponse$loadUrl$1.L$0;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        b = j;
                        adObject2 = adObject3;
                        p2g p2gVar22 = w2g.b;
                        u2gVar = new u2g(th);
                        adObject4 = adObject2;
                        j = b;
                        dij dijVar2 = new dij(new w2g(u2gVar), whj.b(j), null);
                        Object obj32 = ((w2g) dijVar2.a).a;
                        SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = obj32 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME;
                        be5 be5Var2 = be5.NANOSECONDS;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, new Double(xd5.j(dijVar2.b)), (Map) null, (Map) null, adObject4, (Integer) null, (ByteString) null, 108, (Object) null);
                        y6a.M(obj32);
                        return Unit.a;
                    }
                }
                u2gVar = Unit.a;
                p2g p2gVar3 = w2g.b;
                adObject4 = adObject3;
                dij dijVar22 = new dij(new w2g(u2gVar), whj.b(j), null);
                Object obj322 = ((w2g) dijVar22.a).a;
                SendDiagnosticEvent sendDiagnosticEvent22 = this.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType22 = obj322 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME;
                be5 be5Var22 = be5.NANOSECONDS;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent22, diagnosticEventType22, new Double(xd5.j(dijVar22.b)), (Map) null, (Map) null, adObject4, (Integer) null, (ByteString) null, 108, (Object) null);
                y6a.M(obj322);
                return Unit.a;
            }
        }
        androidHandleGatewayAdResponse$loadUrl$1 = new AndroidHandleGatewayAdResponse$loadUrl$1(this, rq3Var);
        Object obj4 = androidHandleGatewayAdResponse$loadUrl$1.result;
        Object obj22 = lu3.a;
        i = androidHandleGatewayAdResponse$loadUrl$1.label;
        if (i != 0) {
        }
        u2gVar = Unit.a;
        p2g p2gVar32 = w2g.b;
        adObject4 = adObject3;
        dij dijVar222 = new dij(new w2g(u2gVar), whj.b(j), null);
        Object obj3222 = ((w2g) dijVar222.a).a;
        SendDiagnosticEvent sendDiagnosticEvent222 = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType222 = obj3222 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME;
        be5 be5Var222 = be5.NANOSECONDS;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent222, diagnosticEventType222, new Double(xd5.j(dijVar222.b)), (Map) null, (Map) null, adObject4, (Integer) null, (ByteString) null, 108, (Object) null);
        y6a.M(obj3222);
        return Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|438|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0578, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x065b A[Catch: CancellationException -> 0x0660, TryCatch #1 {CancellationException -> 0x0660, blocks: (B:105:0x0642, B:109:0x064e, B:111:0x065b, B:113:0x0669, B:116:0x0684, B:118:0x06e7, B:120:0x0700, B:158:0x0666), top: B:104:0x0642 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0749 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0666 A[Catch: CancellationException -> 0x0660, TryCatch #1 {CancellationException -> 0x0660, blocks: (B:105:0x0642, B:109:0x064e, B:111:0x065b, B:113:0x0669, B:116:0x0684, B:118:0x06e7, B:120:0x0700, B:158:0x0666), top: B:104:0x0642 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04bb A[Catch: CancellationException -> 0x04d1, TRY_ENTER, TRY_LEAVE, TryCatch #32 {CancellationException -> 0x04d1, blocks: (B:196:0x04bb, B:202:0x04f0), top: B:194:0x04b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d8 A[Catch: CancellationException -> 0x091f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x091f, blocks: (B:193:0x04b1, B:198:0x04d8, B:205:0x04f9, B:208:0x0516, B:213:0x0532), top: B:192:0x04b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x041c A[Catch: CancellationException -> 0x0416, TryCatch #10 {CancellationException -> 0x0416, blocks: (B:333:0x040d, B:308:0x041c, B:310:0x0420, B:312:0x042a, B:314:0x0453, B:330:0x0427), top: B:332:0x040d }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0453 A[Catch: CancellationException -> 0x0416, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x0416, blocks: (B:333:0x040d, B:308:0x041c, B:310:0x0420, B:312:0x042a, B:314:0x0453, B:330:0x0427), top: B:332:0x040d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x040d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02f8 A[Catch: CancellationException -> 0x0200, TRY_ENTER, TryCatch #18 {CancellationException -> 0x0200, blocks: (B:345:0x01f1, B:350:0x02f8, B:352:0x0300, B:357:0x0366), top: B:344:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0366 A[Catch: CancellationException -> 0x0200, TRY_ENTER, TRY_LEAVE, TryCatch #18 {CancellationException -> 0x0200, blocks: (B:345:0x01f1, B:350:0x02f8, B:352:0x0300, B:357:0x0366), top: B:344:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0323 A[Catch: CancellationException -> 0x095b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x095b, blocks: (B:348:0x02e9, B:355:0x0356, B:376:0x0323), top: B:347:0x02e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0801 A[Catch: CancellationException -> 0x0578, TRY_ENTER, TRY_LEAVE, TryCatch #25 {CancellationException -> 0x0578, blocks: (B:41:0x07fa, B:44:0x0801, B:48:0x083a, B:57:0x0899, B:59:0x08be, B:60:0x08c8, B:62:0x08d8, B:64:0x08f1, B:66:0x08de, B:68:0x08e4, B:70:0x08ec, B:266:0x056f), top: B:8:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d6  */
    /* JADX WARN: Type inference failed for: r15v16, types: [com.unity3d.ads.core.domain.CacheWebViewAssets] */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lu3] */
    /* JADX WARN: Type inference failed for: r3v30, types: [fsf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.unity3d.ads.core.domain.GetLatestWebViewConfiguration] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, rq3] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16, types: [gatewayprotocol.v1.AdResponseOuterClass$AdResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull ByteString byteString, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull Context context, @NotNull String str, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, boolean z2, @NotNull rq3<? super LoadResult> rq3Var) {
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$1;
        AdResponseOuterClass.AdResponse adResponse2;
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$12;
        ByteString byteString2;
        fsf fsfVar;
        eed eedVar;
        AndroidHandleGatewayAdResponse$invoke$5 androidHandleGatewayAdResponse$invoke$5;
        CancellationException cancellationException;
        Throwable cause;
        ByteString byteString3;
        AdResponseOuterClass.AdResponse adResponse3;
        boolean z3;
        Object invoke;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        fsf fsfVar2;
        ByteString byteString4;
        AdResponseOuterClass.AdResponse adResponse4;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        boolean z4;
        String errorText;
        ku3 ku3Var;
        String str3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        boolean z5;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        AdObject adObject;
        String str4;
        dij dijVar;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
        String str5;
        WebViewConfiguration webViewConfiguration;
        long b;
        Object warmFromDisk;
        ku3 ku3Var2;
        AdObject adObject2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5;
        String str6;
        boolean z6;
        fsf fsfVar3;
        long j;
        AndroidHandleGatewayAdResponse$invoke$1 androidHandleGatewayAdResponse$invoke$13;
        boolean z7;
        boolean booleanValue;
        boolean z8;
        AdObject adObject3;
        boolean z9;
        ku3 ku3Var3;
        String str7;
        AdResponseOuterClass.AdResponse adResponse5;
        WebViewConfiguration webViewConfiguration2;
        ?? r2;
        AdObject adObject4;
        boolean z10;
        WebViewConfiguration webViewConfiguration3;
        ByteString byteString5;
        fsf fsfVar4;
        boolean z11;
        int i;
        fsf fsfVar5;
        ByteString byteString6;
        fsf fsfVar6;
        String str8;
        ku3 ku3Var4;
        Object obj;
        String str9;
        int i2;
        Object obj2;
        boolean z12;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        String str10;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6;
        AdObject adObject5;
        long j2;
        boolean z13;
        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase;
        AdPlayerScope adPlayerScope;
        Object invoke2;
        ByteString byteString7;
        String str11;
        AdResponseOuterClass.AdResponse adResponse6;
        Object u2gVar;
        AdObject adObject6;
        UnityAdsLoadOptions unityAdsLoadOptions6;
        AdResponseOuterClass.AdResponse adResponse7;
        boolean z14;
        AndroidWebViewContainer androidWebViewContainer;
        AdObject adObject7;
        Object obj3;
        LoadEvent loadEvent;
        AdResponseOuterClass.AdResponse adResponse8;
        AdObject adObject8;
        int i3;
        long j3;
        WebViewConfiguration webViewConfiguration4;
        String str12;
        int i4;
        Object S;
        AdObject adObject9;
        fsf fsfVar7;
        boolean z15;
        JSONObject data;
        ByteString byteString8;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this;
        if (rq3Var instanceof AndroidHandleGatewayAdResponse$invoke$1) {
            androidHandleGatewayAdResponse$invoke$1 = (AndroidHandleGatewayAdResponse$invoke$1) rq3Var;
            int i5 = androidHandleGatewayAdResponse$invoke$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                androidHandleGatewayAdResponse$invoke$1.label = i5 - Integer.MIN_VALUE;
                adResponse2 = androidHandleGatewayAdResponse$invoke$1;
                Object obj4 = adResponse2.result;
                ?? r3 = lu3.a;
                Object obj5 = null;
                switch (adResponse2.label) {
                    case 0:
                        fsf g = lnb.g(obj4);
                        try {
                        } catch (CancellationException e) {
                            e = e;
                            byteString3 = byteString;
                        }
                        try {
                            if (adResponse.hasError()) {
                                ErrorOuterClass.PublicErrorCode errorCode = adResponse.getError().getErrorCode();
                                errorCode.getClass();
                                ErrorOuterClass.Error error = adResponse.getError();
                                if (error != null) {
                                    ErrorOuterClass.PublicErrorCode errorCode2 = error.getErrorCode();
                                    if (errorCode2 != null) {
                                        errorText = UnityAdsErrorKt.getLoadErrorMsg(errorCode2);
                                        if (errorText == null) {
                                        }
                                        String str13 = errorText;
                                        String errorText2 = adResponse.getError().getErrorText();
                                        ErrorOuterClass.Error error2 = adResponse.getError();
                                        error2.getClass();
                                        return new LoadResult.Failure(errorCode, str13, null, "gateway", errorText2, ErrorExtensionsKt.getErrorTokenOrNull(error2), 4, null);
                                    }
                                }
                                errorText = adResponse.getError().getErrorText();
                                String str132 = errorText;
                                String errorText22 = adResponse.getError().getErrorText();
                                ErrorOuterClass.Error error22 = adResponse.getError();
                                error22.getClass();
                                return new LoadResult.Failure(errorCode, str132, null, "gateway", errorText22, ErrorExtensionsKt.getErrorTokenOrNull(error22), 4, null);
                            }
                            if (adResponse.getAdData().isEmpty()) {
                                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NO_FILL, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_NO_FILL, null, "no_fill", null, null, 52, null);
                            }
                            ?? r4 = androidHandleGatewayAdResponse.getLatestWebViewConfiguration;
                            String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                            try {
                                Integer num = new Integer(adResponse.getWebviewConfiguration().getVersion());
                                List<String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                                String type = adResponse.getWebviewConfiguration().getType();
                                adResponse2.L$0 = unityAdsLoadOptions;
                                byteString3 = byteString;
                                try {
                                    adResponse2.L$1 = byteString3;
                                    adResponse3 = adResponse;
                                } catch (CancellationException e2) {
                                    e = e2;
                                    adResponse3 = adResponse;
                                    obj5 = r3;
                                    androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                    fsfVar = g;
                                    byteString2 = byteString3;
                                    adResponse2 = adResponse3;
                                    eedVar = eed.b;
                                    CancellationException cancellationException2 = e;
                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2, byteString2, adResponse2, fsfVar, null);
                                    cancellationException = cancellationException2;
                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                    }
                                    cause = cancellationException.getCause();
                                    if (cause == null) {
                                    }
                                }
                                try {
                                    adResponse2.L$2 = adResponse3;
                                    adResponse2.L$3 = str;
                                    adResponse2.L$4 = diagnosticAdType;
                                    adResponse2.L$5 = g;
                                    adResponse2.Z$0 = z;
                                    z3 = z2;
                                    adResponse2.Z$1 = z3;
                                    adResponse2.label = 1;
                                    invoke = r4.invoke(entryPoint, num, additionalFilesList, type, adResponse2);
                                    if (invoke == r3) {
                                        return r3;
                                    }
                                    unityAdsLoadOptions2 = unityAdsLoadOptions;
                                    fsfVar2 = g;
                                    byteString4 = byteString3;
                                    adResponse4 = adResponse3;
                                    str2 = str;
                                    diagnosticAdType2 = diagnosticAdType;
                                    z4 = z;
                                    try {
                                        WebViewConfiguration webViewConfiguration5 = (WebViewConfiguration) invoke;
                                        ad2 F = s9a.F(androidHandleGatewayAdResponse.adPlayerScope, new CoroutineOpportunity(byteString4));
                                        if (z3) {
                                            ByteString trackingToken = adResponse4.getTrackingToken();
                                            trackingToken.getClass();
                                            ByteString byteString9 = byteString4;
                                            try {
                                                ku3Var = F;
                                                str3 = str2;
                                                unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                z5 = z4;
                                                diagnosticAdType3 = diagnosticAdType2;
                                                adObject = new AdObject(F, byteString9, str2, trackingToken, false, null, null, null, unityAdsLoadOptions2, z4, diagnosticAdType2, null, null, null, null, null, null, 129264, null);
                                            } catch (CancellationException e3) {
                                                e = e3;
                                                obj5 = r3;
                                                androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                byteString4 = byteString9;
                                                fsfVar = fsfVar2;
                                                adResponse2 = adResponse4;
                                                byteString2 = byteString4;
                                                eedVar = eed.b;
                                                CancellationException cancellationException22 = e;
                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22, byteString2, adResponse2, fsfVar, null);
                                                cancellationException = cancellationException22;
                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                    return obj5;
                                                }
                                                cause = cancellationException.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        } else {
                                            AdObject ad = androidHandleGatewayAdResponse.adRepository.getAd(byteString4);
                                            if (ad == null) {
                                                return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "webviewless_ad_not_found", null, null, 52, null);
                                            }
                                            adObject = ad;
                                            ku3Var = F;
                                            str3 = str2;
                                            unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                            z5 = z4;
                                            diagnosticAdType3 = diagnosticAdType2;
                                        }
                                        if (androidHandleGatewayAdResponse.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                                            str4 = "?platform=android&mode=ad-viewer&webviewType=";
                                            obj5 = r3;
                                            dijVar = null;
                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                            diagnosticAdType4 = diagnosticAdType3;
                                            str5 = str3;
                                            webViewConfiguration = webViewConfiguration5;
                                            fsfVar = fsfVar2;
                                            z7 = z5;
                                            if (dijVar != null) {
                                            }
                                            if (dijVar != null) {
                                            }
                                            if (z8) {
                                            }
                                        } else {
                                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_STARTED, (Double) null, (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, 110, (Object) null);
                                            AdObject adObject10 = adObject;
                                            xhj.a.getClass();
                                            xuc.a.getClass();
                                            str4 = "?platform=android&mode=ad-viewer&webviewType=";
                                            obj5 = r3;
                                            try {
                                                b = xuc.b();
                                            } catch (CancellationException e4) {
                                                e = e4;
                                            }
                                            try {
                                                ?? r15 = androidHandleGatewayAdResponse.cacheWebViewAssets;
                                                adResponse2.L$0 = unityAdsLoadOptions3;
                                                adResponse2.L$1 = byteString4;
                                                adResponse2.L$2 = adResponse4;
                                                adResponse2.L$3 = str3;
                                                adResponse2.L$4 = diagnosticAdType3;
                                                adResponse2.L$5 = fsfVar2;
                                                adResponse2.L$6 = webViewConfiguration5;
                                                adResponse2.L$7 = ku3Var;
                                                adResponse2.L$8 = adObject10;
                                                adResponse2.Z$0 = z5;
                                                adResponse2.Z$1 = z3;
                                                adResponse2.J$0 = b;
                                                boolean z16 = z3;
                                                adResponse2.label = 2;
                                                warmFromDisk = r15.warmFromDisk(webViewConfiguration5, adResponse2);
                                                obj5 = obj5;
                                                if (warmFromDisk == obj5) {
                                                    return obj5;
                                                }
                                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = diagnosticAdType3;
                                                ku3Var2 = ku3Var;
                                                adObject2 = adObject10;
                                                diagnosticAdType5 = diagnosticAdType7;
                                                str6 = str3;
                                                webViewConfiguration = webViewConfiguration5;
                                                z6 = z16;
                                                fsfVar3 = fsfVar2;
                                                j = b;
                                                try {
                                                    Boolean bool = (Boolean) warmFromDisk;
                                                    bool.getClass();
                                                    boolean z17 = z6;
                                                    fsfVar5 = fsfVar3;
                                                } catch (CancellationException e5) {
                                                    e = e5;
                                                    fsfVar5 = fsfVar3;
                                                }
                                                try {
                                                    dijVar = new dij(bool, whj.b(j), null);
                                                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType5;
                                                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                                    diagnosticAdType4 = diagnosticAdType8;
                                                    z3 = z17;
                                                    fsfVar = fsfVar5;
                                                    adObject = adObject2;
                                                    ku3Var = ku3Var2;
                                                    str5 = str6;
                                                    z7 = z5;
                                                    if (dijVar != null) {
                                                        try {
                                                            booleanValue = ((Boolean) dijVar.a).booleanValue();
                                                        } catch (CancellationException e6) {
                                                            e = e6;
                                                            androidHandleGatewayAdResponse$invoke$13 = adResponse2;
                                                            androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$13;
                                                            adResponse2 = adResponse4;
                                                            byteString2 = byteString4;
                                                            eedVar = eed.b;
                                                            CancellationException cancellationException222 = e;
                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222, byteString2, adResponse2, fsfVar, null);
                                                            cancellationException = cancellationException222;
                                                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                            }
                                                            cause = cancellationException.getCause();
                                                            if (cause == null) {
                                                            }
                                                        }
                                                    } else {
                                                        booleanValue = false;
                                                    }
                                                    if (dijVar != null) {
                                                        SendDiagnosticEvent sendDiagnosticEvent = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                        z8 = booleanValue;
                                                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = booleanValue ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_CACHE_WARM_FAILURE_TIME;
                                                        long j4 = dijVar.b;
                                                        be5 be5Var = be5.NANOSECONDS;
                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, new Double(xd5.j(j4)), (Map) null, (Map) null, adObject, (Integer) null, (ByteString) null, 108, (Object) null);
                                                        adObject3 = adObject;
                                                    } else {
                                                        z8 = booleanValue;
                                                        adObject3 = adObject;
                                                    }
                                                    if (z8) {
                                                        String str14 = str5;
                                                        z9 = z7;
                                                        ku3Var3 = ku3Var;
                                                        str7 = str14;
                                                        WebViewConfiguration webViewConfiguration6 = webViewConfiguration;
                                                        adResponse5 = adResponse4;
                                                        byteString2 = byteString4;
                                                        webViewConfiguration2 = webViewConfiguration6;
                                                        r2 = z8;
                                                        r3 = fsfVar;
                                                        adObject4 = adObject3;
                                                        z10 = z3;
                                                        if (webViewConfiguration2.getEntryPoint().length() == 0) {
                                                        }
                                                    } else {
                                                        CacheWebViewAssets cacheWebViewAssets = androidHandleGatewayAdResponse.cacheWebViewAssets;
                                                        adResponse2.L$0 = unityAdsLoadOptions4;
                                                        adResponse2.L$1 = byteString4;
                                                        adResponse2.L$2 = adResponse4;
                                                        adResponse2.L$3 = str5;
                                                        adResponse2.L$4 = diagnosticAdType4;
                                                        adResponse2.L$5 = fsfVar;
                                                        adResponse2.L$6 = webViewConfiguration;
                                                        adResponse2.L$7 = ku3Var;
                                                        adResponse2.L$8 = adObject3;
                                                        adResponse2.Z$0 = z7;
                                                        adResponse2.Z$1 = z3;
                                                        boolean z18 = z8;
                                                        adResponse2.I$0 = z18 ? 1 : 0;
                                                        adResponse2.label = 3;
                                                        try {
                                                            if (CacheWebViewAssets.DefaultImpls.invoke$default(cacheWebViewAssets, webViewConfiguration, false, adResponse2, 2, null) == obj5) {
                                                                return obj5;
                                                            }
                                                            WebViewConfiguration webViewConfiguration7 = webViewConfiguration;
                                                            adResponse5 = adResponse4;
                                                            webViewConfiguration3 = webViewConfiguration7;
                                                            byteString5 = byteString4;
                                                            fsfVar4 = fsfVar;
                                                            z11 = z3;
                                                            i = z18 ? 1 : 0;
                                                            AdObject adObject11 = adObject3;
                                                            z10 = z11;
                                                            adObject4 = adObject11;
                                                            String str15 = str5;
                                                            z9 = z7;
                                                            ku3Var3 = ku3Var;
                                                            str7 = str15;
                                                            r3 = fsfVar4;
                                                            webViewConfiguration2 = webViewConfiguration3;
                                                            byteString2 = byteString5;
                                                            r2 = i;
                                                            try {
                                                                try {
                                                                    if (webViewConfiguration2.getEntryPoint().length() == 0) {
                                                                        return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "no_webview_entry_point", null, null, 52, null);
                                                                    }
                                                                    String configUrl = SdkProperties.getConfigUrl();
                                                                    configUrl.getClass();
                                                                    ku3 ku3Var5 = ku3Var3;
                                                                    String str16 = str7;
                                                                    if (!kotlin.text.c.n(configUrl, ".html", false)) {
                                                                        configUrl = null;
                                                                    }
                                                                    if (configUrl == null) {
                                                                        configUrl = webViewConfiguration2.getEntryPoint();
                                                                    }
                                                                    try {
                                                                        URI uri = new URI(configUrl);
                                                                        StringBuilder sb = new StringBuilder(str4);
                                                                        sb.append(webViewConfiguration2.getType());
                                                                        sb.append('&');
                                                                        String query = uri.getQuery();
                                                                        if (query == null) {
                                                                            query = "";
                                                                        }
                                                                        sb.append(query);
                                                                        String sb2 = sb.toString();
                                                                        try {
                                                                            configUrl.getClass();
                                                                            boolean z19 = z9;
                                                                            int T = StringsKt.T("?", configUrl, 6);
                                                                            if (T != -1) {
                                                                                configUrl = configUrl.substring(0, T);
                                                                            }
                                                                            String concat = configUrl.concat(sb2);
                                                                            if (!z10) {
                                                                                try {
                                                                                    if (diagnosticAdType4 != DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER && adResponse5.hasCampaignMetadata() && adResponse5.getCampaignMetadata().getAssetsToCacheCount() > 0) {
                                                                                        ?? r42 = androidHandleGatewayAdResponse.webViewLessLoadStrategy;
                                                                                        adResponse2.L$0 = byteString2;
                                                                                        adResponse2.L$1 = adResponse5;
                                                                                        adResponse2.L$2 = r3;
                                                                                        adResponse2.L$3 = null;
                                                                                        adResponse2.L$4 = null;
                                                                                        adResponse2.L$5 = null;
                                                                                        adResponse2.L$6 = null;
                                                                                        adResponse2.L$7 = null;
                                                                                        adResponse2.L$8 = null;
                                                                                        adResponse2.label = 4;
                                                                                        Object invoke3 = r42.invoke(ku3Var5, concat, unityAdsLoadOptions4, byteString2, adResponse5, str16, diagnosticAdType4, z19, adResponse2);
                                                                                        return invoke3 == obj5 ? obj5 : invoke3;
                                                                                    }
                                                                                } catch (CancellationException e7) {
                                                                                    e = e7;
                                                                                    AdResponseOuterClass.AdResponse adResponse9 = adResponse5;
                                                                                    androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                                                    adResponse2 = adResponse9;
                                                                                    fsfVar = r3;
                                                                                    eedVar = eed.b;
                                                                                    CancellationException cancellationException2222 = e;
                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222, byteString2, adResponse2, fsfVar, null);
                                                                                    cancellationException = cancellationException2222;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                    }
                                                                                    cause = cancellationException.getCause();
                                                                                    if (cause == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            AdResponseOuterClass.AdResponse adResponse10 = adResponse5;
                                                                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                                            adResponse2 = adResponse10;
                                                                            str8 = str16;
                                                                            UnityAdsLoadOptions unityAdsLoadOptions7 = unityAdsLoadOptions4;
                                                                            ku3Var4 = ku3Var5;
                                                                            try {
                                                                                obj = obj5;
                                                                            } catch (CancellationException e8) {
                                                                                e = e8;
                                                                                fsfVar6 = r3;
                                                                                fsfVar = fsfVar6;
                                                                                eedVar = eed.b;
                                                                                CancellationException cancellationException22222 = e;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222, byteString2, adResponse2, fsfVar, null);
                                                                                cancellationException = cancellationException22222;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                }
                                                                                cause = cancellationException.getCause();
                                                                                if (cause == null) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                String encodeToString = Base64.encodeToString(adResponse2.getImpressionConfiguration().toByteArray(), 2);
                                                                                xhj.a.getClass();
                                                                                xuc.a.getClass();
                                                                                str9 = concat;
                                                                                boolean z20 = z10;
                                                                                long b2 = xuc.b();
                                                                                try {
                                                                                    p2g p2gVar = w2g.b;
                                                                                    androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse.getWebViewContainerUseCase;
                                                                                    adPlayerScope = androidHandleGatewayAdResponse.adPlayerScope;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions7;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = diagnosticAdType4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = r3;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = webViewConfiguration2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = ku3Var4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = adObject4;
                                                                                    fsfVar6 = r3;
                                                                                } catch (Throwable th) {
                                                                                    th = th;
                                                                                    i2 = r2;
                                                                                    fsfVar6 = r3;
                                                                                }
                                                                                try {
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = str9;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = encodeToString;
                                                                                    str9 = str9;
                                                                                    z12 = z20;
                                                                                    try {
                                                                                        androidHandleGatewayAdResponse$invoke$12.Z$0 = z12;
                                                                                        androidHandleGatewayAdResponse$invoke$12.I$0 = r2;
                                                                                        androidHandleGatewayAdResponse$invoke$12.J$0 = b2;
                                                                                        i2 = r2;
                                                                                        try {
                                                                                            androidHandleGatewayAdResponse$invoke$12.label = 5;
                                                                                            invoke2 = androidGetWebViewContainerUseCase.invoke(adPlayerScope, adObject4, androidHandleGatewayAdResponse$invoke$12);
                                                                                            obj2 = obj;
                                                                                        } catch (Throwable th2) {
                                                                                            th = th2;
                                                                                            obj2 = obj;
                                                                                            unityAdsLoadOptions5 = unityAdsLoadOptions7;
                                                                                            str10 = encodeToString;
                                                                                            diagnosticAdType6 = diagnosticAdType4;
                                                                                            adObject5 = adObject4;
                                                                                            j2 = b2;
                                                                                            z13 = z12;
                                                                                            adResponse2 = adResponse2;
                                                                                            try {
                                                                                                p2g p2gVar2 = w2g.b;
                                                                                                u2gVar = new u2g(th);
                                                                                                adResponse2 = adResponse2;
                                                                                                long j5 = j2;
                                                                                                adObject6 = adObject5;
                                                                                                unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                                r3 = fsfVar6;
                                                                                                int i6 = i2;
                                                                                                try {
                                                                                                    w2g w2gVar = new w2g(u2gVar);
                                                                                                    try {
                                                                                                        adResponse7 = adResponse2;
                                                                                                        WebViewConfiguration webViewConfiguration8 = webViewConfiguration2;
                                                                                                        try {
                                                                                                            long b3 = whj.b(j5);
                                                                                                            z14 = z13;
                                                                                                        } catch (CancellationException e9) {
                                                                                                            e = e9;
                                                                                                            adResponse2 = adResponse7;
                                                                                                        }
                                                                                                    } catch (CancellationException e10) {
                                                                                                        e = e10;
                                                                                                    }
                                                                                                } catch (CancellationException e11) {
                                                                                                    e = e11;
                                                                                                }
                                                                                            } catch (CancellationException e12) {
                                                                                                e = e12;
                                                                                                obj5 = obj2;
                                                                                                fsfVar = fsfVar6;
                                                                                                eedVar = eed.b;
                                                                                                CancellationException cancellationException222222 = e;
                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222, byteString2, adResponse2, fsfVar, null);
                                                                                                cancellationException = cancellationException222222;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                }
                                                                                                cause = cancellationException.getCause();
                                                                                                if (cause == null) {
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                dij dijVar2 = new dij(w2gVar, b3, null);
                                                                                                Object obj6 = dijVar2.a;
                                                                                                Object obj7 = ((w2g) obj6).a;
                                                                                                long j6 = dijVar2.b;
                                                                                                SendDiagnosticEvent sendDiagnosticEvent2 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = obj7 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                                                                                                be5 be5Var2 = be5.NANOSECONDS;
                                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, diagnosticEventType2, new Double(xd5.j(j6)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                Object obj8 = ((w2g) obj6).a;
                                                                                                y6a.M(obj8);
                                                                                                androidWebViewContainer = (AndroidWebViewContainer) obj8;
                                                                                                WebViewBridge invoke4 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                                                AdPlayer invoke5 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke4, androidWebViewContainer, adObject6, diagnosticAdType6);
                                                                                                r3.a = invoke5;
                                                                                                AdObject copy$default = AdObject.copy$default(adObject6, adObject6.getAdScope(), null, null, null, false, null, invoke5, null, null, false, null, null, null, null, null, null, adObject6.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                                                fcp.m0(new v98(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(r3, null), 3), ((AdPlayer) r3.a).getScope());
                                                                                                xhj.a.getClass();
                                                                                                xuc.a.getClass();
                                                                                                long b4 = xuc.b();
                                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                                adObject7 = copy$default;
                                                                                                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                                                                ByteString adData = adResponse7.getAdData();
                                                                                                adData.getClass();
                                                                                                obj3 = obj2;
                                                                                                try {
                                                                                                    String base64$default = ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                                                                    str10.getClass();
                                                                                                    ByteString adDataRefreshToken = adResponse7.getAdDataRefreshToken();
                                                                                                    adDataRefreshToken.getClass();
                                                                                                    invoke4.setExposedFunctions(handleInvocationsFromAdViewer.invoke(base64$default, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null), str10, adObject7));
                                                                                                    if (z14) {
                                                                                                    }
                                                                                                    str12 = str9;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                                                                                    adResponse2 = adResponse7;
                                                                                                } catch (CancellationException e13) {
                                                                                                    e = e13;
                                                                                                    adResponse2 = adResponse7;
                                                                                                }
                                                                                                try {
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = r3;
                                                                                                    webViewConfiguration4 = webViewConfiguration8;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.I$0 = i6;
                                                                                                    j3 = b4;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 6;
                                                                                                    obj5 = obj3;
                                                                                                    if (androidHandleGatewayAdResponse.loadUrl(adObject6, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$12) != obj5) {
                                                                                                    }
                                                                                                } catch (CancellationException e14) {
                                                                                                    e = e14;
                                                                                                    obj5 = obj3;
                                                                                                    fsfVar = r3;
                                                                                                    eedVar = eed.b;
                                                                                                    CancellationException cancellationException2222222 = e;
                                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222, byteString2, adResponse2, fsfVar, null);
                                                                                                    cancellationException = cancellationException2222222;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                    }
                                                                                                    cause = cancellationException.getCause();
                                                                                                    if (cause == null) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (CancellationException e15) {
                                                                                                e = e15;
                                                                                                adResponse2 = adResponse7;
                                                                                                obj5 = obj2;
                                                                                                fsfVar = r3;
                                                                                                eedVar = eed.b;
                                                                                                CancellationException cancellationException22222222 = e;
                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222, byteString2, adResponse2, fsfVar, null);
                                                                                                cancellationException = cancellationException22222222;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                }
                                                                                                cause = cancellationException.getCause();
                                                                                                if (cause == null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        i2 = r2;
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    i2 = r2;
                                                                                    str9 = str9;
                                                                                    obj2 = obj;
                                                                                    z12 = z20;
                                                                                    unityAdsLoadOptions5 = unityAdsLoadOptions7;
                                                                                    str10 = encodeToString;
                                                                                    diagnosticAdType6 = diagnosticAdType4;
                                                                                    adObject5 = adObject4;
                                                                                    j2 = b2;
                                                                                    z13 = z12;
                                                                                    adResponse2 = adResponse2;
                                                                                    p2g p2gVar22 = w2g.b;
                                                                                    u2gVar = new u2g(th);
                                                                                    adResponse2 = adResponse2;
                                                                                    long j52 = j2;
                                                                                    adObject6 = adObject5;
                                                                                    unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                    r3 = fsfVar6;
                                                                                    int i62 = i2;
                                                                                    w2g w2gVar2 = new w2g(u2gVar);
                                                                                    adResponse7 = adResponse2;
                                                                                    WebViewConfiguration webViewConfiguration82 = webViewConfiguration2;
                                                                                    long b32 = whj.b(j52);
                                                                                    z14 = z13;
                                                                                    dij dijVar22 = new dij(w2gVar2, b32, null);
                                                                                    Object obj62 = dijVar22.a;
                                                                                    Object obj72 = ((w2g) obj62).a;
                                                                                    long j62 = dijVar22.b;
                                                                                    SendDiagnosticEvent sendDiagnosticEvent22 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType22 = obj72 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                                                                                    be5 be5Var22 = be5.NANOSECONDS;
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent22, diagnosticEventType22, new Double(xd5.j(j62)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                    Object obj82 = ((w2g) obj62).a;
                                                                                    y6a.M(obj82);
                                                                                    androidWebViewContainer = (AndroidWebViewContainer) obj82;
                                                                                    WebViewBridge invoke42 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                                    AdPlayer invoke52 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke42, androidWebViewContainer, adObject6, diagnosticAdType6);
                                                                                    r3.a = invoke52;
                                                                                    AdObject copy$default2 = AdObject.copy$default(adObject6, adObject6.getAdScope(), null, null, null, false, null, invoke52, null, null, false, null, null, null, null, null, null, adObject6.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                                    fcp.m0(new v98(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(r3, null), 3), ((AdPlayer) r3.a).getScope());
                                                                                    xhj.a.getClass();
                                                                                    xuc.a.getClass();
                                                                                    long b42 = xuc.b();
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default2, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                    adObject7 = copy$default2;
                                                                                    HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                                                    ByteString adData2 = adResponse7.getAdData();
                                                                                    adData2.getClass();
                                                                                    obj3 = obj2;
                                                                                    String base64$default2 = ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                                                                                    str10.getClass();
                                                                                    ByteString adDataRefreshToken2 = adResponse7.getAdDataRefreshToken();
                                                                                    adDataRefreshToken2.getClass();
                                                                                    invoke42.setExposedFunctions(handleInvocationsFromAdViewer2.invoke(base64$default2, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null), str10, adObject7));
                                                                                    if (z14) {
                                                                                    }
                                                                                    str12 = str9;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                                                                    adResponse2 = adResponse7;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = r3;
                                                                                    webViewConfiguration4 = webViewConfiguration82;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.I$0 = i62;
                                                                                    j3 = b42;
                                                                                    androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 6;
                                                                                    obj5 = obj3;
                                                                                    if (androidHandleGatewayAdResponse.loadUrl(adObject6, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$12) != obj5) {
                                                                                    }
                                                                                }
                                                                                if (invoke2 == obj2) {
                                                                                    return obj2;
                                                                                }
                                                                                unityAdsLoadOptions5 = unityAdsLoadOptions7;
                                                                                byteString7 = byteString2;
                                                                                str10 = encodeToString;
                                                                                str11 = str9;
                                                                                adResponse6 = adResponse2;
                                                                                diagnosticAdType6 = diagnosticAdType4;
                                                                                adObject5 = adObject4;
                                                                                j2 = b2;
                                                                                z13 = z12;
                                                                                try {
                                                                                    u2gVar = (AndroidWebViewContainer) invoke2;
                                                                                    p2g p2gVar3 = w2g.b;
                                                                                    adResponse2 = adResponse6;
                                                                                    str9 = str11;
                                                                                    byteString2 = byteString7;
                                                                                } catch (Throwable th5) {
                                                                                    th = th5;
                                                                                    adResponse2 = adResponse6;
                                                                                    str9 = str11;
                                                                                    byteString2 = byteString7;
                                                                                    p2g p2gVar222 = w2g.b;
                                                                                    u2gVar = new u2g(th);
                                                                                    adResponse2 = adResponse2;
                                                                                    long j522 = j2;
                                                                                    adObject6 = adObject5;
                                                                                    unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                    r3 = fsfVar6;
                                                                                    int i622 = i2;
                                                                                    w2g w2gVar22 = new w2g(u2gVar);
                                                                                    adResponse7 = adResponse2;
                                                                                    WebViewConfiguration webViewConfiguration822 = webViewConfiguration2;
                                                                                    long b322 = whj.b(j522);
                                                                                    z14 = z13;
                                                                                    dij dijVar222 = new dij(w2gVar22, b322, null);
                                                                                    Object obj622 = dijVar222.a;
                                                                                    Object obj722 = ((w2g) obj622).a;
                                                                                    long j622 = dijVar222.b;
                                                                                    SendDiagnosticEvent sendDiagnosticEvent222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                    DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType222 = obj722 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                                                                                    be5 be5Var222 = be5.NANOSECONDS;
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent222, diagnosticEventType222, new Double(xd5.j(j622)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                    Object obj822 = ((w2g) obj622).a;
                                                                                    y6a.M(obj822);
                                                                                    androidWebViewContainer = (AndroidWebViewContainer) obj822;
                                                                                    WebViewBridge invoke422 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                                    AdPlayer invoke522 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke422, androidWebViewContainer, adObject6, diagnosticAdType6);
                                                                                    r3.a = invoke522;
                                                                                    AdObject copy$default22 = AdObject.copy$default(adObject6, adObject6.getAdScope(), null, null, null, false, null, invoke522, null, null, false, null, null, null, null, null, null, adObject6.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                                    fcp.m0(new v98(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(r3, null), 3), ((AdPlayer) r3.a).getScope());
                                                                                    xhj.a.getClass();
                                                                                    xuc.a.getClass();
                                                                                    long b422 = xuc.b();
                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default22, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                    adObject7 = copy$default22;
                                                                                    HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                                                    ByteString adData22 = adResponse7.getAdData();
                                                                                    adData22.getClass();
                                                                                    obj3 = obj2;
                                                                                    String base64$default22 = ProtobufExtensionsKt.toBase64$default(adData22, false, 1, null);
                                                                                    str10.getClass();
                                                                                    ByteString adDataRefreshToken22 = adResponse7.getAdDataRefreshToken();
                                                                                    adDataRefreshToken22.getClass();
                                                                                    invoke422.setExposedFunctions(handleInvocationsFromAdViewer22.invoke(base64$default22, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22, false, 1, null), str10, adObject7));
                                                                                    if (z14) {
                                                                                    }
                                                                                    str12 = str9;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                                                                    adResponse2 = adResponse7;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = r3;
                                                                                    webViewConfiguration4 = webViewConfiguration822;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.I$0 = i622;
                                                                                    j3 = b422;
                                                                                    androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 6;
                                                                                    obj5 = obj3;
                                                                                    if (androidHandleGatewayAdResponse.loadUrl(adObject6, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$12) != obj5) {
                                                                                    }
                                                                                }
                                                                                long j5222 = j2;
                                                                                adObject6 = adObject5;
                                                                                unityAdsLoadOptions6 = unityAdsLoadOptions5;
                                                                                r3 = fsfVar6;
                                                                                int i6222 = i2;
                                                                                w2g w2gVar222 = new w2g(u2gVar);
                                                                                adResponse7 = adResponse2;
                                                                                WebViewConfiguration webViewConfiguration8222 = webViewConfiguration2;
                                                                                long b3222 = whj.b(j5222);
                                                                                z14 = z13;
                                                                                dij dijVar2222 = new dij(w2gVar222, b3222, null);
                                                                                Object obj6222 = dijVar2222.a;
                                                                                Object obj7222 = ((w2g) obj6222).a;
                                                                                long j6222 = dijVar2222.b;
                                                                                SendDiagnosticEvent sendDiagnosticEvent2222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2222 = obj7222 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                                                                                be5 be5Var2222 = be5.NANOSECONDS;
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2222, diagnosticEventType2222, new Double(xd5.j(j6222)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                Object obj8222 = ((w2g) obj6222).a;
                                                                                y6a.M(obj8222);
                                                                                androidWebViewContainer = (AndroidWebViewContainer) obj8222;
                                                                                WebViewBridge invoke4222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                                                AdPlayer invoke5222 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke4222, androidWebViewContainer, adObject6, diagnosticAdType6);
                                                                                r3.a = invoke5222;
                                                                                AdObject copy$default222 = AdObject.copy$default(adObject6, adObject6.getAdScope(), null, null, null, false, null, invoke5222, null, null, false, null, null, null, null, null, null, adObject6.getWebViewLessLoadingRequiredData(), 65470, null);
                                                                                fcp.m0(new v98(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(r3, null), 3), ((AdPlayer) r3.a).getScope());
                                                                                xhj.a.getClass();
                                                                                xuc.a.getClass();
                                                                                long b4222 = xuc.b();
                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default222, (Integer) null, (ByteString) null, 110, (Object) null);
                                                                                adObject7 = copy$default222;
                                                                                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer222 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                                                ByteString adData222 = adResponse7.getAdData();
                                                                                adData222.getClass();
                                                                                obj3 = obj2;
                                                                                String base64$default222 = ProtobufExtensionsKt.toBase64$default(adData222, false, 1, null);
                                                                                str10.getClass();
                                                                                ByteString adDataRefreshToken222 = adResponse7.getAdDataRefreshToken();
                                                                                adDataRefreshToken222.getClass();
                                                                                invoke4222.setExposedFunctions(handleInvocationsFromAdViewer222.invoke(base64$default222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken222, false, 1, null), str10, adObject7));
                                                                                if (z14) {
                                                                                    try {
                                                                                        if (androidHandleGatewayAdResponse.sessionRepository.getNativeConfiguration().getFeatureFlags().getWebviewLessLoadParallelActivityLaunch()) {
                                                                                            try {
                                                                                                xw3.L(androidHandleGatewayAdResponse.adPlayerScope, null, null, new AndroidHandleGatewayAdResponse$invoke$loadEvent$1(androidHandleGatewayAdResponse, adObject6, str9, androidWebViewContainer, null), 3);
                                                                                                loadEvent = LoadEvent.Completed.INSTANCE;
                                                                                                adResponse8 = adResponse7;
                                                                                                adObject8 = adObject7;
                                                                                                i3 = i6222;
                                                                                                obj5 = obj3;
                                                                                                j3 = b4222;
                                                                                                webViewConfiguration4 = webViewConfiguration8222;
                                                                                                fsfVar7 = r3;
                                                                                                z15 = loadEvent instanceof LoadEvent.Error;
                                                                                                SendDiagnosticEvent sendDiagnosticEvent3 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                                if (!z15) {
                                                                                                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(j3))), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                    AdObject adObject12 = adObject8;
                                                                                                    if (i3 != 0) {
                                                                                                        xw3.L(ku3Var4, null, null, new AndroidHandleGatewayAdResponse$invoke$4(androidHandleGatewayAdResponse, webViewConfiguration4, null), 3);
                                                                                                    }
                                                                                                    androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString2);
                                                                                                    androidHandleGatewayAdResponse.adRepository.addAd(byteString2, adObject12);
                                                                                                    String objectId = unityAdsLoadOptions6.getObjectId();
                                                                                                    if ((objectId == null || StringsKt.R(objectId)) && (data = unityAdsLoadOptions6.getData()) != null && !data.has("adMarkup")) {
                                                                                                        androidHandleGatewayAdResponse.adRepository.enqueueOpportunityForPlacement(str8, byteString2);
                                                                                                    }
                                                                                                    return new LoadResult.Success(adObject12);
                                                                                                }
                                                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_CREATE_AD_OBJECT_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(j3))), (Map) null, (Map) null, adObject8, (Integer) null, (ByteString) null, 108, (Object) null);
                                                                                                eed eedVar2 = eed.b;
                                                                                                fsf fsfVar8 = fsfVar7;
                                                                                                ByteString byteString10 = byteString2;
                                                                                                AdResponseOuterClass.AdResponse adResponse11 = adResponse8;
                                                                                                try {
                                                                                                    AndroidHandleGatewayAdResponse$invoke$3 androidHandleGatewayAdResponse$invoke$3 = new AndroidHandleGatewayAdResponse$invoke$3(androidHandleGatewayAdResponse, loadEvent, byteString10, adResponse11, fsfVar8, null);
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = byteString2;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = adResponse8;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = fsfVar7;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = loadEvent;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 8;
                                                                                                    if (xw3.R(eedVar2, androidHandleGatewayAdResponse$invoke$3, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                        return obj5;
                                                                                                    }
                                                                                                    fsfVar = fsfVar7;
                                                                                                    byteString8 = byteString2;
                                                                                                    adResponse2 = adResponse8;
                                                                                                    try {
                                                                                                        return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent).getMessage(), null, 36, null);
                                                                                                    } catch (CancellationException e16) {
                                                                                                        e = e16;
                                                                                                        byteString2 = byteString8;
                                                                                                        eedVar = eed.b;
                                                                                                        CancellationException cancellationException222222222 = e;
                                                                                                        androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222222, byteString2, adResponse2, fsfVar, null);
                                                                                                        cancellationException = cancellationException222222222;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                        androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                                        if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                        }
                                                                                                        cause = cancellationException.getCause();
                                                                                                        if (cause == null) {
                                                                                                        }
                                                                                                    }
                                                                                                } catch (CancellationException e17) {
                                                                                                    e = e17;
                                                                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse;
                                                                                                    byteString2 = byteString10;
                                                                                                    adResponse2 = adResponse11;
                                                                                                    r3 = fsfVar8;
                                                                                                    fsfVar = r3;
                                                                                                    eedVar = eed.b;
                                                                                                    CancellationException cancellationException2222222222 = e;
                                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222222, byteString2, adResponse2, fsfVar, null);
                                                                                                    cancellationException = cancellationException2222222222;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                    }
                                                                                                    cause = cancellationException.getCause();
                                                                                                    if (cause == null) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (CancellationException e18) {
                                                                                                e = e18;
                                                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse;
                                                                                                adResponse2 = adResponse7;
                                                                                                fsfVar = r3;
                                                                                                obj5 = obj3;
                                                                                                eedVar = eed.b;
                                                                                                CancellationException cancellationException22222222222 = e;
                                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222222, byteString2, adResponse2, fsfVar, null);
                                                                                                cancellationException = cancellationException22222222222;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                                }
                                                                                                cause = cancellationException.getCause();
                                                                                                if (cause == null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } catch (CancellationException e19) {
                                                                                        e = e19;
                                                                                    }
                                                                                }
                                                                                str12 = str9;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                                                                adResponse2 = adResponse7;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = r3;
                                                                                webViewConfiguration4 = webViewConfiguration8222;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.I$0 = i6222;
                                                                                j3 = b4222;
                                                                                androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                                                                                androidHandleGatewayAdResponse$invoke$12.label = 6;
                                                                                obj5 = obj3;
                                                                                if (androidHandleGatewayAdResponse.loadUrl(adObject6, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$12) != obj5) {
                                                                                    return obj5;
                                                                                }
                                                                                fsfVar = r3;
                                                                                i4 = i6222;
                                                                                adResponse2 = adResponse2;
                                                                                try {
                                                                                    z88 onLoadEvent = ((AdPlayer) fsfVar.a).getOnLoadEvent();
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = fsfVar;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                                                                                    androidHandleGatewayAdResponse$invoke$12.I$0 = i4;
                                                                                    androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 7;
                                                                                    S = rd0.S(onLoadEvent, androidHandleGatewayAdResponse$invoke$12);
                                                                                    if (S != obj5) {
                                                                                        return obj5;
                                                                                    }
                                                                                    adObject9 = adObject7;
                                                                                    obj4 = S;
                                                                                    adResponse2 = adResponse2;
                                                                                    adObject8 = adObject9;
                                                                                    fsfVar7 = fsfVar;
                                                                                    i3 = i4;
                                                                                    loadEvent = (LoadEvent) obj4;
                                                                                    adResponse8 = adResponse2;
                                                                                    z15 = loadEvent instanceof LoadEvent.Error;
                                                                                    SendDiagnosticEvent sendDiagnosticEvent32 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                                                                                    if (!z15) {
                                                                                    }
                                                                                } catch (CancellationException e20) {
                                                                                    e = e20;
                                                                                    eedVar = eed.b;
                                                                                    CancellationException cancellationException222222222222 = e;
                                                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222222222, byteString2, adResponse2, fsfVar, null);
                                                                                    cancellationException = cancellationException222222222222;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                    }
                                                                                    cause = cancellationException.getCause();
                                                                                    if (cause == null) {
                                                                                    }
                                                                                }
                                                                            } catch (CancellationException e21) {
                                                                                e = e21;
                                                                                fsfVar6 = r3;
                                                                                obj5 = obj;
                                                                                fsfVar = fsfVar6;
                                                                                eedVar = eed.b;
                                                                                CancellationException cancellationException2222222222222 = e;
                                                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222222222, byteString2, adResponse2, fsfVar, null);
                                                                                cancellationException = cancellationException2222222222222;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                                }
                                                                                cause = cancellationException.getCause();
                                                                                if (cause == null) {
                                                                                }
                                                                            }
                                                                        } catch (CancellationException e22) {
                                                                            e = e22;
                                                                            AdResponseOuterClass.AdResponse adResponse12 = adResponse5;
                                                                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                                            adResponse2 = adResponse12;
                                                                        }
                                                                    } catch (Throwable unused) {
                                                                        AdResponseOuterClass.AdResponse adResponse13 = adResponse5;
                                                                        androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                                        adResponse2 = adResponse13;
                                                                        fsfVar6 = r3;
                                                                        try {
                                                                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "invalid_url", configUrl, null, 36, null);
                                                                        } catch (CancellationException e23) {
                                                                            e = e23;
                                                                            fsfVar = fsfVar6;
                                                                            eedVar = eed.b;
                                                                            CancellationException cancellationException22222222222222 = e;
                                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222222222, byteString2, adResponse2, fsfVar, null);
                                                                            cancellationException = cancellationException22222222222222;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                                            }
                                                                            cause = cancellationException.getCause();
                                                                            if (cause == null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (CancellationException e24) {
                                                                    e = e24;
                                                                    AdResponseOuterClass.AdResponse adResponse14 = adResponse5;
                                                                    androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                                    adResponse2 = adResponse14;
                                                                }
                                                            } catch (CancellationException e25) {
                                                                e = e25;
                                                                AdResponseOuterClass.AdResponse adResponse15 = adResponse5;
                                                                androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                                                adResponse2 = adResponse15;
                                                            }
                                                        } catch (CancellationException e26) {
                                                            e = e26;
                                                            androidHandleGatewayAdResponse$invoke$13 = adResponse2;
                                                            androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$13;
                                                            adResponse2 = adResponse4;
                                                            byteString2 = byteString4;
                                                            eedVar = eed.b;
                                                            CancellationException cancellationException222222222222222 = e;
                                                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222222222222, byteString2, adResponse2, fsfVar, null);
                                                            cancellationException = cancellationException222222222222222;
                                                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                            }
                                                            cause = cancellationException.getCause();
                                                            if (cause == null) {
                                                            }
                                                        }
                                                    }
                                                } catch (CancellationException e27) {
                                                    e = e27;
                                                    fsfVar = fsfVar5;
                                                    androidHandleGatewayAdResponse$invoke$13 = adResponse2;
                                                    androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$13;
                                                    adResponse2 = adResponse4;
                                                    byteString2 = byteString4;
                                                    eedVar = eed.b;
                                                    CancellationException cancellationException2222222222222222 = e;
                                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222222222222, byteString2, adResponse2, fsfVar, null);
                                                    cancellationException = cancellationException2222222222222222;
                                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                    }
                                                    cause = cancellationException.getCause();
                                                    if (cause == null) {
                                                    }
                                                }
                                            } catch (CancellationException e28) {
                                                e = e28;
                                                obj5 = obj5;
                                                fsfVar = fsfVar2;
                                                androidHandleGatewayAdResponse$invoke$13 = adResponse2;
                                                androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$13;
                                                adResponse2 = adResponse4;
                                                byteString2 = byteString4;
                                                eedVar = eed.b;
                                                CancellationException cancellationException22222222222222222 = e;
                                                androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222222222222, byteString2, adResponse2, fsfVar, null);
                                                cancellationException = cancellationException22222222222222222;
                                                androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                                androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                                androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                                androidHandleGatewayAdResponse$invoke$12.label = 9;
                                                if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                                }
                                                cause = cancellationException.getCause();
                                                if (cause == null) {
                                                }
                                            }
                                        }
                                    } catch (CancellationException e29) {
                                        e = e29;
                                        obj5 = r3;
                                        androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                    }
                                } catch (CancellationException e30) {
                                    e = e30;
                                    obj5 = r3;
                                    androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                                    fsfVar = g;
                                    byteString2 = byteString3;
                                    adResponse2 = adResponse3;
                                    eedVar = eed.b;
                                    CancellationException cancellationException222222222222222222 = e;
                                    androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222222222222222, byteString2, adResponse2, fsfVar, null);
                                    cancellationException = cancellationException222222222222222222;
                                    androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                                    androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                                    androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                                    androidHandleGatewayAdResponse$invoke$12.label = 9;
                                    if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                                    }
                                    cause = cancellationException.getCause();
                                    if (cause == null) {
                                    }
                                }
                            } catch (CancellationException e31) {
                                e = e31;
                                byteString3 = byteString;
                                adResponse3 = adResponse;
                            }
                        } catch (CancellationException e32) {
                            e = e32;
                            byteString2 = byteString;
                            obj5 = r3;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            fsfVar = g;
                            adResponse2 = adResponse;
                            eedVar = eed.b;
                            CancellationException cancellationException2222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException2222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 1:
                        z3 = adResponse2.Z$1;
                        boolean z21 = adResponse2.Z$0;
                        fsfVar2 = (fsf) adResponse2.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) adResponse2.L$4;
                        String str17 = (String) adResponse2.L$3;
                        adResponse4 = (AdResponseOuterClass.AdResponse) adResponse2.L$2;
                        byteString4 = (ByteString) adResponse2.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions8 = (UnityAdsLoadOptions) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            z4 = z21;
                            diagnosticAdType2 = diagnosticAdType9;
                            str2 = str17;
                            unityAdsLoadOptions2 = unityAdsLoadOptions8;
                            invoke = obj4;
                            WebViewConfiguration webViewConfiguration52 = (WebViewConfiguration) invoke;
                            ad2 F2 = s9a.F(androidHandleGatewayAdResponse.adPlayerScope, new CoroutineOpportunity(byteString4));
                            if (z3) {
                            }
                            if (androidHandleGatewayAdResponse.sessionRepository.getNativeConfiguration().getFeatureFlags().getUseOptimisticWebviewCache()) {
                            }
                        } catch (CancellationException e33) {
                            e = e33;
                            obj5 = r3;
                            fsfVar = fsfVar2;
                            androidHandleGatewayAdResponse$invoke$13 = adResponse2;
                            androidHandleGatewayAdResponse$invoke$12 = androidHandleGatewayAdResponse$invoke$13;
                            adResponse2 = adResponse4;
                            byteString2 = byteString4;
                            eedVar = eed.b;
                            CancellationException cancellationException22222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException22222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 2:
                        j = adResponse2.J$0;
                        boolean z22 = adResponse2.Z$1;
                        z5 = adResponse2.Z$0;
                        adObject2 = (AdObject) adResponse2.L$8;
                        ku3 ku3Var6 = (ku3) adResponse2.L$7;
                        WebViewConfiguration webViewConfiguration9 = (WebViewConfiguration) adResponse2.L$6;
                        fsf fsfVar9 = (fsf) adResponse2.L$5;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) adResponse2.L$4;
                        String str18 = (String) adResponse2.L$3;
                        AdResponseOuterClass.AdResponse adResponse16 = (AdResponseOuterClass.AdResponse) adResponse2.L$2;
                        byteString6 = (ByteString) adResponse2.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions9 = (UnityAdsLoadOptions) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            str4 = "?platform=android&mode=ad-viewer&webviewType=";
                            z6 = z22;
                            ku3Var2 = ku3Var6;
                            adResponse4 = adResponse16;
                            diagnosticAdType5 = diagnosticAdType10;
                            str6 = str18;
                            webViewConfiguration = webViewConfiguration9;
                            byteString4 = byteString6;
                            obj5 = r3;
                            fsfVar3 = fsfVar9;
                            unityAdsLoadOptions3 = unityAdsLoadOptions9;
                            warmFromDisk = obj4;
                            Boolean bool2 = (Boolean) warmFromDisk;
                            bool2.getClass();
                            boolean z172 = z6;
                            fsfVar5 = fsfVar3;
                            dijVar = new dij(bool2, whj.b(j), null);
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType82 = diagnosticAdType5;
                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                            diagnosticAdType4 = diagnosticAdType82;
                            z3 = z172;
                            fsfVar = fsfVar5;
                            adObject = adObject2;
                            ku3Var = ku3Var2;
                            str5 = str6;
                            z7 = z5;
                            if (dijVar != null) {
                            }
                            if (dijVar != null) {
                            }
                            if (z8) {
                            }
                        } catch (CancellationException e34) {
                            e = e34;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            fsfVar = fsfVar9;
                            adResponse2 = adResponse16;
                            byteString2 = byteString6;
                            obj5 = r3;
                            eedVar = eed.b;
                            CancellationException cancellationException222222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException222222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 3:
                        i = adResponse2.I$0;
                        z11 = adResponse2.Z$1;
                        z7 = adResponse2.Z$0;
                        adObject3 = (AdObject) adResponse2.L$8;
                        ku3Var = (ku3) adResponse2.L$7;
                        webViewConfiguration3 = (WebViewConfiguration) adResponse2.L$6;
                        fsfVar4 = (fsf) adResponse2.L$5;
                        diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) adResponse2.L$4;
                        str5 = (String) adResponse2.L$3;
                        adResponse5 = (AdResponseOuterClass.AdResponse) adResponse2.L$2;
                        byteString6 = (ByteString) adResponse2.L$1;
                        unityAdsLoadOptions4 = (UnityAdsLoadOptions) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            str4 = "?platform=android&mode=ad-viewer&webviewType=";
                            byteString5 = byteString6;
                            obj5 = r3;
                            AdObject adObject112 = adObject3;
                            z10 = z11;
                            adObject4 = adObject112;
                            String str152 = str5;
                            z9 = z7;
                            ku3Var3 = ku3Var;
                            str7 = str152;
                            r3 = fsfVar4;
                            webViewConfiguration2 = webViewConfiguration3;
                            byteString2 = byteString5;
                            r2 = i;
                            if (webViewConfiguration2.getEntryPoint().length() == 0) {
                            }
                        } catch (CancellationException e35) {
                            e = e35;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse5;
                            fsfVar = fsfVar4;
                            byteString2 = byteString6;
                            obj5 = r3;
                            eedVar = eed.b;
                            CancellationException cancellationException2222222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException2222222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 4:
                        fsfVar = (fsf) adResponse2.L$2;
                        AdResponseOuterClass.AdResponse adResponse17 = (AdResponseOuterClass.AdResponse) adResponse2.L$1;
                        ByteString byteString11 = (ByteString) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            return obj4;
                        } catch (CancellationException e36) {
                            e = e36;
                            obj5 = r3;
                            byteString2 = byteString11;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse17;
                            eedVar = eed.b;
                            CancellationException cancellationException22222222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException22222222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 5:
                        j2 = adResponse2.J$0;
                        int i7 = adResponse2.I$0;
                        z13 = adResponse2.Z$0;
                        str10 = (String) adResponse2.L$10;
                        str11 = (String) adResponse2.L$9;
                        adObject5 = (AdObject) adResponse2.L$8;
                        ku3Var4 = (ku3) adResponse2.L$7;
                        webViewConfiguration2 = (WebViewConfiguration) adResponse2.L$6;
                        fsf fsfVar10 = (fsf) adResponse2.L$5;
                        diagnosticAdType6 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) adResponse2.L$4;
                        str8 = (String) adResponse2.L$3;
                        adResponse6 = (AdResponseOuterClass.AdResponse) adResponse2.L$2;
                        byteString7 = (ByteString) adResponse2.L$1;
                        unityAdsLoadOptions5 = (UnityAdsLoadOptions) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            invoke2 = obj4;
                            i2 = i7;
                            obj2 = r3;
                            fsfVar6 = fsfVar10;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            u2gVar = (AndroidWebViewContainer) invoke2;
                            p2g p2gVar32 = w2g.b;
                            adResponse2 = adResponse6;
                            str9 = str11;
                            byteString2 = byteString7;
                        } catch (Throwable th6) {
                            th = th6;
                            i2 = i7;
                            obj2 = r3;
                            fsfVar6 = fsfVar10;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse6;
                            str9 = str11;
                            byteString2 = byteString7;
                            p2g p2gVar2222 = w2g.b;
                            u2gVar = new u2g(th);
                            adResponse2 = adResponse2;
                            long j52222 = j2;
                            adObject6 = adObject5;
                            unityAdsLoadOptions6 = unityAdsLoadOptions5;
                            r3 = fsfVar6;
                            int i62222 = i2;
                            w2g w2gVar2222 = new w2g(u2gVar);
                            adResponse7 = adResponse2;
                            WebViewConfiguration webViewConfiguration82222 = webViewConfiguration2;
                            long b32222 = whj.b(j52222);
                            z14 = z13;
                            dij dijVar22222 = new dij(w2gVar2222, b32222, null);
                            Object obj62222 = dijVar22222.a;
                            Object obj72222 = ((w2g) obj62222).a;
                            long j62222 = dijVar22222.b;
                            SendDiagnosticEvent sendDiagnosticEvent22222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType22222 = obj72222 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                            be5 be5Var22222 = be5.NANOSECONDS;
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent22222, diagnosticEventType22222, new Double(xd5.j(j62222)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                            Object obj82222 = ((w2g) obj62222).a;
                            y6a.M(obj82222);
                            androidWebViewContainer = (AndroidWebViewContainer) obj82222;
                            WebViewBridge invoke42222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                            AdPlayer invoke52222 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke42222, androidWebViewContainer, adObject6, diagnosticAdType6);
                            r3.a = invoke52222;
                            AdObject copy$default2222 = AdObject.copy$default(adObject6, adObject6.getAdScope(), null, null, null, false, null, invoke52222, null, null, false, null, null, null, null, null, null, adObject6.getWebViewLessLoadingRequiredData(), 65470, null);
                            fcp.m0(new v98(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(r3, null), 3), ((AdPlayer) r3.a).getScope());
                            xhj.a.getClass();
                            xuc.a.getClass();
                            long b42222 = xuc.b();
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default2222, (Integer) null, (ByteString) null, 110, (Object) null);
                            adObject7 = copy$default2222;
                            HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2222 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                            ByteString adData2222 = adResponse7.getAdData();
                            adData2222.getClass();
                            obj3 = obj2;
                            String base64$default2222 = ProtobufExtensionsKt.toBase64$default(adData2222, false, 1, null);
                            str10.getClass();
                            ByteString adDataRefreshToken2222 = adResponse7.getAdDataRefreshToken();
                            adDataRefreshToken2222.getClass();
                            invoke42222.setExposedFunctions(handleInvocationsFromAdViewer2222.invoke(base64$default2222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2222, false, 1, null), str10, adObject7));
                            if (z14) {
                            }
                            str12 = str9;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                            adResponse2 = adResponse7;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = r3;
                            webViewConfiguration4 = webViewConfiguration82222;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.I$0 = i62222;
                            j3 = b42222;
                            androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                            androidHandleGatewayAdResponse$invoke$12.label = 6;
                            obj5 = obj3;
                            if (androidHandleGatewayAdResponse.loadUrl(adObject6, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$12) != obj5) {
                            }
                        }
                        long j522222 = j2;
                        adObject6 = adObject5;
                        unityAdsLoadOptions6 = unityAdsLoadOptions5;
                        r3 = fsfVar6;
                        int i622222 = i2;
                        w2g w2gVar22222 = new w2g(u2gVar);
                        adResponse7 = adResponse2;
                        WebViewConfiguration webViewConfiguration822222 = webViewConfiguration2;
                        long b322222 = whj.b(j522222);
                        z14 = z13;
                        dij dijVar222222 = new dij(w2gVar22222, b322222, null);
                        Object obj622222 = dijVar222222.a;
                        Object obj722222 = ((w2g) obj622222).a;
                        long j622222 = dijVar222222.b;
                        SendDiagnosticEvent sendDiagnosticEvent222222 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType222222 = obj722222 instanceof u2g ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_WEBVIEW_FAILURE_TIME;
                        be5 be5Var222222 = be5.NANOSECONDS;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent222222, diagnosticEventType222222, new Double(xd5.j(j622222)), (Map) null, (Map) null, adObject6, (Integer) null, (ByteString) null, 108, (Object) null);
                        Object obj822222 = ((w2g) obj622222).a;
                        y6a.M(obj822222);
                        androidWebViewContainer = (AndroidWebViewContainer) obj822222;
                        WebViewBridge invoke422222 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                        AdPlayer invoke522222 = androidHandleGatewayAdResponse.getAdPlayer.invoke(invoke422222, androidWebViewContainer, adObject6, diagnosticAdType6);
                        r3.a = invoke522222;
                        AdObject copy$default22222 = AdObject.copy$default(adObject6, adObject6.getAdScope(), null, null, null, false, null, invoke522222, null, null, false, null, null, null, null, null, null, adObject6.getWebViewLessLoadingRequiredData(), 65470, null);
                        fcp.m0(new v98(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new AndroidHandleGatewayAdResponse$invoke$2(r3, null), 3), ((AdPlayer) r3.a).getScope());
                        xhj.a.getClass();
                        xuc.a.getClass();
                        long b422222 = xuc.b();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER, (Double) null, (Map) null, (Map) null, copy$default22222, (Integer) null, (ByteString) null, 110, (Object) null);
                        adObject7 = copy$default22222;
                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer22222 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        ByteString adData22222 = adResponse7.getAdData();
                        adData22222.getClass();
                        obj3 = obj2;
                        String base64$default22222 = ProtobufExtensionsKt.toBase64$default(adData22222, false, 1, null);
                        str10.getClass();
                        ByteString adDataRefreshToken22222 = adResponse7.getAdDataRefreshToken();
                        adDataRefreshToken22222.getClass();
                        invoke422222.setExposedFunctions(handleInvocationsFromAdViewer22222.invoke(base64$default22222, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken22222, false, 1, null), str10, adObject7));
                        if (z14) {
                        }
                        str12 = str9;
                        androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                        androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                        adResponse2 = adResponse7;
                        androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                        androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                        androidHandleGatewayAdResponse$invoke$12.L$4 = r3;
                        webViewConfiguration4 = webViewConfiguration822222;
                        androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                        androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                        androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                        androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                        androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                        androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                        androidHandleGatewayAdResponse$invoke$12.I$0 = i622222;
                        j3 = b422222;
                        androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                        androidHandleGatewayAdResponse$invoke$12.label = 6;
                        obj5 = obj3;
                        if (androidHandleGatewayAdResponse.loadUrl(adObject6, str12, androidWebViewContainer, androidHandleGatewayAdResponse$invoke$12) != obj5) {
                        }
                        break;
                    case 6:
                        long j7 = adResponse2.J$0;
                        i4 = adResponse2.I$0;
                        AdObject adObject13 = (AdObject) adResponse2.L$7;
                        ku3 ku3Var7 = (ku3) adResponse2.L$6;
                        WebViewConfiguration webViewConfiguration10 = (WebViewConfiguration) adResponse2.L$5;
                        fsf fsfVar11 = (fsf) adResponse2.L$4;
                        String str19 = (String) adResponse2.L$3;
                        adResponse3 = (AdResponseOuterClass.AdResponse) adResponse2.L$2;
                        ByteString byteString12 = (ByteString) adResponse2.L$1;
                        UnityAdsLoadOptions unityAdsLoadOptions10 = (UnityAdsLoadOptions) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            obj5 = r3;
                            adObject7 = adObject13;
                            ku3Var4 = ku3Var7;
                            j3 = j7;
                            fsfVar = fsfVar11;
                            webViewConfiguration4 = webViewConfiguration10;
                            byteString2 = byteString12;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse3;
                            str8 = str19;
                            unityAdsLoadOptions6 = unityAdsLoadOptions10;
                            z88 onLoadEvent2 = ((AdPlayer) fsfVar.a).getOnLoadEvent();
                            androidHandleGatewayAdResponse$invoke$12.L$0 = unityAdsLoadOptions6;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = byteString2;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = adResponse2;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = str8;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = fsfVar;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = webViewConfiguration4;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = ku3Var4;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = adObject7;
                            androidHandleGatewayAdResponse$invoke$12.I$0 = i4;
                            androidHandleGatewayAdResponse$invoke$12.J$0 = j3;
                            androidHandleGatewayAdResponse$invoke$12.label = 7;
                            S = rd0.S(onLoadEvent2, androidHandleGatewayAdResponse$invoke$12);
                            if (S != obj5) {
                            }
                        } catch (CancellationException e37) {
                            e = e37;
                            obj5 = r3;
                            fsfVar = fsfVar11;
                            byteString2 = byteString12;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse3;
                            eedVar = eed.b;
                            CancellationException cancellationException222222222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException222222222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException222222222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 7:
                        long j8 = adResponse2.J$0;
                        i4 = adResponse2.I$0;
                        AdObject adObject14 = (AdObject) adResponse2.L$7;
                        ku3 ku3Var8 = (ku3) adResponse2.L$6;
                        WebViewConfiguration webViewConfiguration11 = (WebViewConfiguration) adResponse2.L$5;
                        fsf fsfVar12 = (fsf) adResponse2.L$4;
                        str8 = (String) adResponse2.L$3;
                        AdResponseOuterClass.AdResponse adResponse18 = (AdResponseOuterClass.AdResponse) adResponse2.L$2;
                        ByteString byteString13 = (ByteString) adResponse2.L$1;
                        unityAdsLoadOptions6 = (UnityAdsLoadOptions) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse18;
                            obj5 = r3;
                            adObject9 = adObject14;
                            ku3Var4 = ku3Var8;
                            j3 = j8;
                            fsfVar = fsfVar12;
                            webViewConfiguration4 = webViewConfiguration11;
                            byteString2 = byteString13;
                            adObject8 = adObject9;
                            fsfVar7 = fsfVar;
                            i3 = i4;
                            loadEvent = (LoadEvent) obj4;
                            adResponse8 = adResponse2;
                            z15 = loadEvent instanceof LoadEvent.Error;
                            SendDiagnosticEvent sendDiagnosticEvent322 = androidHandleGatewayAdResponse.sendDiagnosticEvent;
                            if (!z15) {
                            }
                        } catch (CancellationException e38) {
                            e = e38;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse18;
                            obj5 = r3;
                            fsfVar = fsfVar12;
                            byteString2 = byteString13;
                            eedVar = eed.b;
                            CancellationException cancellationException2222222222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException2222222222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException2222222222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 8:
                        loadEvent = (LoadEvent) adResponse2.L$3;
                        fsfVar = (fsf) adResponse2.L$2;
                        AdResponseOuterClass.AdResponse adResponse19 = (AdResponseOuterClass.AdResponse) adResponse2.L$1;
                        byteString8 = (ByteString) adResponse2.L$0;
                        try {
                            y6a.M(obj4);
                            obj5 = r3;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse19;
                            return new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent).getMessage(), null, 36, null);
                        } catch (CancellationException e39) {
                            e = e39;
                            obj5 = r3;
                            byteString2 = byteString8;
                            androidHandleGatewayAdResponse$invoke$12 = adResponse2;
                            adResponse2 = adResponse19;
                            eedVar = eed.b;
                            CancellationException cancellationException22222222222222222222222222 = e;
                            androidHandleGatewayAdResponse$invoke$5 = new AndroidHandleGatewayAdResponse$invoke$5(androidHandleGatewayAdResponse, cancellationException22222222222222222222222222, byteString2, adResponse2, fsfVar, null);
                            cancellationException = cancellationException22222222222222222222222222;
                            androidHandleGatewayAdResponse$invoke$12.L$0 = cancellationException;
                            androidHandleGatewayAdResponse$invoke$12.L$1 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$2 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$3 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$4 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$5 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$6 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$7 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$8 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$9 = null;
                            androidHandleGatewayAdResponse$invoke$12.L$10 = null;
                            androidHandleGatewayAdResponse$invoke$12.label = 9;
                            if (xw3.R(eedVar, androidHandleGatewayAdResponse$invoke$5, androidHandleGatewayAdResponse$invoke$12) == obj5) {
                            }
                            cause = cancellationException.getCause();
                            if (cause == null) {
                            }
                        }
                        break;
                    case 9:
                        cancellationException = (CancellationException) adResponse2.L$0;
                        y6a.M(obj4);
                        cause = cancellationException.getCause();
                        if (cause == null) {
                            throw cancellationException;
                        }
                        throw cause;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        androidHandleGatewayAdResponse$invoke$1 = new AndroidHandleGatewayAdResponse$invoke$1(androidHandleGatewayAdResponse, rq3Var);
        adResponse2 = androidHandleGatewayAdResponse$invoke$1;
        Object obj42 = adResponse2.result;
        ?? r32 = lu3.a;
        Object obj52 = null;
        switch (adResponse2.label) {
        }
    }
}
