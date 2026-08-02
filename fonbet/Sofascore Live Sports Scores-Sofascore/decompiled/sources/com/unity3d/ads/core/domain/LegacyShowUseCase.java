package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.EmbeddableAdPlayer;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.FlowExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import defpackage.a70;
import defpackage.asf;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.gt8;
import defpackage.ku3;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.m61;
import defpackage.p2g;
import defpackage.p5b;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.t98;
import defpackage.tub;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.whj;
import defpackage.wv8;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086B¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010 J(\u0010'\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010 J'\u0010,\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010 J\u0019\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b1\u00102JQ\u00107\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00104\u001a\u0002032\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b7\u00108Jq\u0010=\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0<\u0012\u0006\u0012\u0004\u0018\u00010\u0001092\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b=\u0010>JA\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140B2\u0006\u0010?\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010;2\b\u0010A\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020%2\u0006\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0014H\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010VR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010X¨\u0006Z"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", "Lcom/unity3d/ads/core/domain/Show;", "show", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "", "placement", "Lcom/unity3d/ads/UnityAdsShowOptions;", "unityAdsShowOptions", "Lcom/unity3d/ads/core/data/model/Listeners;", "listeners", "", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Lrq3;)Ljava/lang/Object;", "Lkotlin/time/TimeMark;", "startTime", "showReceivedReward", "(Lkotlin/time/TimeMark;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)V", "bannerLeftApplication", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeEvent", "operativeMessage", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "sendOperativeError", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lrq3;)Ljava/lang/Object;", "cancelTimeout", "(Lkotlin/time/TimeMark;)V", "showStarted", "showClicked", "getOpportunityId", "(Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/lang/String;", "opportunityId", "showOptions", "showStart", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "status", "reason", "reasonDebug", "showCompleted", "(Lkotlin/time/TimeMark;Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ShowStatus;Lcom/unity3d/ads/core/data/model/Listeners;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "Lrq3;", "showError", "(Lkotlin/time/TimeMark;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;Lcom/unity3d/ads/UnityAdsShowOptions;)Lgt8;", "diagnosticReason", "code", "debugMessage", "", "getTags", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/util/Map;", "getTmpAdObject", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdObject;", "getAdInfoString", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/domain/Show;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/log/Logger;", "Lf1d;", "", "hasStarted", "Lf1d;", "timeoutCancellationRequested", "Lcom/unity3d/ads/core/data/model/AdObject;", "Ljava/lang/String;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyShowUseCase {

    @NotNull
    public static final String KEY_OBJECT_ID = "objectId";

    @NotNull
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";

    @NotNull
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";

    @NotNull
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";

    @NotNull
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";

    @NotNull
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";

    @NotNull
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";

    @NotNull
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";

    @NotNull
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";

    @NotNull
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;

    @Nullable
    private AdObject adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GetInitializationState getInitializationState;

    @NotNull
    private final GetOperativeEventApi getOperativeEventApi;

    @NotNull
    private final f1d hasStarted;

    @NotNull
    private final Logger logger;

    @Nullable
    private String placement;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Show show;

    @NotNull
    private final f1d timeoutCancellationRequested;

    @Nullable
    private UnityAdsShowOptions unityAdsShowOptions;

    public LegacyShowUseCase(@NotNull Show show, @NotNull AdRepository adRepository, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetOperativeEventApi getOperativeEventApi, @NotNull GetInitializationState getInitializationState, @NotNull SessionRepository sessionRepository, @NotNull SafeCallbackInvoke safeCallbackInvoke, @NotNull Logger logger) {
        show.getClass();
        adRepository.getClass();
        sendDiagnosticEvent.getClass();
        getOperativeEventApi.getClass();
        getInitializationState.getClass();
        sessionRepository.getClass();
        safeCallbackInvoke.getClass();
        logger.getClass();
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = gdi.a(bool);
        this.timeoutCancellationRequested = gdi.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(TimeMark startTime, String placement, Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new p5b(listeners, placement, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bannerLeftApplication$lambda$4(Listeners listeners, String str) {
        listeners.onLeftApplication(str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(TimeMark startTime) {
        f1d f1dVar = this.timeoutCancellationRequested;
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb = new StringBuilder("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb.append(adObject != null ? adObject.getPlacementId() : null);
        sb.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb.append(uuid);
        return sb.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object opt;
        String obj;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (opt = data.opt("objectId")) == null || (obj = opt.toString()) == null) {
            return null;
        }
        return UUID.fromString(obj).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String diagnosticReason, Integer code, String debugMessage, UnityAdsShowOptions showOptions) {
        LinkedHashMap i = tub.i(new Pair("operation", OperationType.SHOW.toString()), new Pair("reason", diagnosticReason), new Pair("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null)));
        if (code != null) {
        }
        if (debugMessage != null) {
            i.put("reason_debug", debugMessage);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String opportunityId) {
        UUID fromString = UUID.fromString(opportunityId);
        fromString.getClass();
        AdObject ad = this.adRepository.getAd(ProtobufExtensionsKt.toByteString(fromString));
        if (ad != null) {
            return ad;
        }
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID fromString2 = UUID.fromString(opportunityId);
        fromString2.getClass();
        ByteString byteString = ProtobufExtensionsKt.toByteString(fromString2);
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(companion, byteString, str, false, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, rq3<? super Unit> rq3Var) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        newBuilder.getClass();
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        _create.setErrorType(operativeEventErrorType);
        _create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData _build = _create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = _build.toByteString();
        byteString.getClass();
        Object invoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, rq3Var);
        return invoke == lu3.a ? invoke : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(TimeMark startTime, String placement, Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new p5b(listeners, placement, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showClicked$lambda$7(Listeners listeners, String str) {
        listeners.onClick(str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(TimeMark startTime, String placement, ShowStatus status, Listeners listeners, String reason, String reasonDebug, UnityAdsShowOptions showOptions) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        ltb ltbVar = new ltb();
        if (reason != null) {
        }
        if (reasonDebug != null) {
        }
        String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), ltbVar.d(), (Map) null, this.adObject, (Integer) null, (ByteString) null, 104, (Object) null);
        this.safeCallbackInvoke.invoke(new m61(listeners, placement, status, this, 13));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, TimeMark timeMark, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions, int i, Object obj) {
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(timeMark, str, showStatus, listeners, str2, str3, unityAdsShowOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCompleted$lambda$12(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
        NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = legacyShowUseCase.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
        defaultShowCompletionState.getClass();
        listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        return Unit.a;
    }

    private final gt8 showError(TimeMark startTime, String placement, String opportunityId, Listeners listeners, UnityAdsShowOptions showOptions) {
        return new LegacyShowUseCase$showError$1(this, opportunityId, startTime, showOptions, listeners, placement, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showReceivedReward$lambda$3(Listeners listeners, String str) {
        listeners.onRewarded(str);
        return Unit.a;
    }

    private final void showStart(String opportunityId, UnityAdsShowOptions showOptions) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED, (Double) null, wv8.o("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null)), (Map) null, getTmpAdObject(opportunityId), (Integer) null, (ByteString) null, 106, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(TimeMark startTime, String placement, Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        f1d f1dVar = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new p5b(listeners, placement, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showStarted$lambda$6(Listeners listeners, String str) {
        listeners.onStart(str);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        if (r3.invoke("ad_player_scope_not_active", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0241, code lost:
    
        if (r3.invoke("already_showing", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0272, code lost:
    
        if (r3.invoke("placement_validation", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0130, code lost:
    
        if (r3.invoke("not_initialized", r5, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0148, code lost:
    
        if (r3.invoke("placement_null", r5, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0175, code lost:
    
        if (r3.invoke("no_opportunity_id", r5, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r8, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019b, code lost:
    
        if (r3.invoke("placement_not_loaded", r5, r6, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ca, code lost:
    
        if (r3.invoke("ad_object_not_found", r5, r6, null, null, r9) == r10) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r2v7, types: [u2g] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(@Nullable String str, @Nullable UnityAdsShowOptions unityAdsShowOptions, @NotNull Listeners listeners, @NotNull rq3<? super Unit> rq3Var) {
        LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$1;
        LegacyShowUseCase$invoke$1 legacyShowUseCase$invoke$12;
        String u2gVar;
        int i;
        String str2;
        boolean z;
        int i2;
        ku3 scope;
        ByteString byteString;
        JSONObject data;
        Object opt;
        UUID uuid;
        if (rq3Var instanceof LegacyShowUseCase$invoke$1) {
            legacyShowUseCase$invoke$1 = (LegacyShowUseCase$invoke$1) rq3Var;
            int i3 = legacyShowUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                legacyShowUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
                legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
                Object obj = legacyShowUseCase$invoke$12.result;
                lu3 lu3Var = lu3.a;
                String str3 = null;
                switch (legacyShowUseCase$invoke$12.label) {
                    case 0:
                        y6a.M(obj);
                        xhj.a.getClass();
                        xuc.a.getClass();
                        long b = xuc.b();
                        this.placement = str;
                        this.unityAdsShowOptions = unityAdsShowOptions;
                        this.logger.debug("Show for placement " + str + " called");
                        asf asfVar = new asf();
                        asf asfVar2 = new asf();
                        try {
                            p2g p2gVar = w2g.b;
                            u2gVar = unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null;
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        if (w2g.a(u2gVar) != null) {
                            asfVar.a = true;
                            u2gVar = UUID.randomUUID().toString();
                        }
                        String str4 = u2gVar;
                        if (str4 == null) {
                            if (str != null) {
                                ByteString pollOpportunityIdForPlacement = this.adRepository.pollOpportunityIdForPlacement(str);
                                str4 = (pollOpportunityIdForPlacement == null || (uuid = ProtobufExtensionsKt.toUUID(pollOpportunityIdForPlacement)) == null) ? null : uuid.toString();
                                if (str4 == null) {
                                    asfVar2.a = true;
                                    str4 = UUID.randomUUID().toString();
                                }
                            } else {
                                str4 = UUID.randomUUID().toString();
                            }
                            str4.getClass();
                        }
                        String str5 = str4;
                        showStart(str5, unityAdsShowOptions);
                        whj whjVar = new whj(b);
                        if (str == null) {
                            str2 = "";
                            i = 1;
                        } else {
                            i = 1;
                            str2 = str;
                        }
                        gt8 showError = showError(whjVar, str2, str5, listeners, unityAdsShowOptions);
                        if (GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, i, null) == InitializationState.INITIALIZED) {
                            if (str != null) {
                                if (!asfVar.a) {
                                    if (!asfVar2.a) {
                                        UUID fromString = UUID.fromString(str5);
                                        fromString.getClass();
                                        ByteString byteString2 = ProtobufExtensionsKt.toByteString(fromString);
                                        AdObject ad = this.adRepository.getAd(byteString2);
                                        this.adObject = ad;
                                        if (ad != null) {
                                            if (((fdi) ad.getState()).getValue() != AdObjectState.EXPIRED) {
                                                AdPlayer adPlayer = ad.getAdPlayer();
                                                if (adPlayer != null && (scope = adPlayer.getScope()) != null && !s9a.w(scope)) {
                                                    UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                                    legacyShowUseCase$invoke$12.label = 7;
                                                    break;
                                                } else {
                                                    boolean z2 = ad.getAdPlayer() instanceof EmbeddableAdPlayer;
                                                    if (!z2 && isFullscreenAdShowing) {
                                                        UnityAds.UnityAdsShowError unityAdsShowError2 = UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                                                        legacyShowUseCase$invoke$12.label = 8;
                                                        break;
                                                    } else if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !Intrinsics.c(ad.getPlacementId(), str)) {
                                                        UnityAds.UnityAdsShowError unityAdsShowError3 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                                        legacyShowUseCase$invoke$12.label = 9;
                                                        break;
                                                    } else {
                                                        z = false;
                                                        long showTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                                                        if (!z2) {
                                                            isFullscreenAdShowing = i;
                                                        }
                                                        t98 t98Var = new t98(FlowExtensionsKt.timeoutAfter$default(this.show.invoke(ad, unityAdsShowOptions), showTimeoutMs, false, new LegacyShowUseCase$invoke$2(this, ad, true, showError, str, null), 2, null), new LegacyShowUseCase$invoke$3(showError, z2, null), i);
                                                        LegacyShowUseCase$invoke$4 legacyShowUseCase$invoke$4 = new LegacyShowUseCase$invoke$4(this, b, str, listeners, unityAdsShowOptions, ad, showError);
                                                        legacyShowUseCase$invoke$12.I$0 = z2 ? 1 : 0;
                                                        legacyShowUseCase$invoke$12.label = 10;
                                                        if (t98Var.collect(legacyShowUseCase$invoke$4, legacyShowUseCase$invoke$12) != lu3Var) {
                                                            i2 = z2 ? 1 : 0;
                                                            if (i2 == 0) {
                                                                isFullscreenAdShowing = z;
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }
                                                }
                                            } else {
                                                UnityAds.UnityAdsShowError unityAdsShowError4 = UnityAds.UnityAdsShowError.EXPIRED;
                                                legacyShowUseCase$invoke$12.L$0 = byteString2;
                                                legacyShowUseCase$invoke$12.label = 6;
                                                if (showError.invoke("ad_object_expired", unityAdsShowError4, MESSAGE_AD_OBJECT_EXPIRED, null, null, legacyShowUseCase$invoke$12) != lu3Var) {
                                                    byteString = byteString2;
                                                    this.adRepository.removeAd(byteString);
                                                    return Unit.a;
                                                }
                                            }
                                        } else {
                                            UnityAds.UnityAdsShowError unityAdsShowError5 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                                            String concat = MESSAGE_NO_AD_OBJECT.concat(str5);
                                            legacyShowUseCase$invoke$12.label = 5;
                                            break;
                                        }
                                    } else {
                                        UnityAds.UnityAdsShowError unityAdsShowError6 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                        String format = String.format(MESSAGE_PLACEMENT_NOT_LOADED, Arrays.copyOf(new Object[]{str}, i));
                                        legacyShowUseCase$invoke$12.label = 4;
                                        break;
                                    }
                                } else {
                                    if (unityAdsShowOptions != null && (data = unityAdsShowOptions.getData()) != null && (opt = data.opt("objectId")) != null) {
                                        str3 = opt.toString();
                                    }
                                    UnityAds.UnityAdsShowError unityAdsShowError7 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                    legacyShowUseCase$invoke$12.label = 3;
                                    break;
                                }
                            } else {
                                UnityAds.UnityAdsShowError unityAdsShowError8 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                                legacyShowUseCase$invoke$12.label = 2;
                                break;
                            }
                        } else {
                            UnityAds.UnityAdsShowError unityAdsShowError9 = UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                            legacyShowUseCase$invoke$12.label = i;
                            break;
                        }
                        return lu3Var;
                    case 1:
                        y6a.M(obj);
                        return Unit.a;
                    case 2:
                        y6a.M(obj);
                        return Unit.a;
                    case 3:
                        y6a.M(obj);
                        return Unit.a;
                    case 4:
                        y6a.M(obj);
                        return Unit.a;
                    case 5:
                        y6a.M(obj);
                        return Unit.a;
                    case 6:
                        byteString = (ByteString) legacyShowUseCase$invoke$12.L$0;
                        y6a.M(obj);
                        this.adRepository.removeAd(byteString);
                        return Unit.a;
                    case 7:
                        y6a.M(obj);
                        return Unit.a;
                    case 8:
                        y6a.M(obj);
                        return Unit.a;
                    case 9:
                        y6a.M(obj);
                        return Unit.a;
                    case 10:
                        i2 = legacyShowUseCase$invoke$12.I$0;
                        y6a.M(obj);
                        z = false;
                        if (i2 == 0) {
                        }
                        return Unit.a;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        legacyShowUseCase$invoke$1 = new LegacyShowUseCase$invoke$1(this, rq3Var);
        legacyShowUseCase$invoke$12 = legacyShowUseCase$invoke$1;
        Object obj2 = legacyShowUseCase$invoke$12.result;
        lu3 lu3Var2 = lu3.a;
        String str32 = null;
        switch (legacyShowUseCase$invoke$12.label) {
        }
    }

    public final void showReceivedReward(@NotNull TimeMark startTime, @NotNull String placement, @NotNull Listeners listeners) {
        startTime.getClass();
        placement.getClass();
        listeners.getClass();
        this.logger.info("Rewarding ad " + getAdInfoString());
        f1d f1dVar = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, (ByteString) null, 108, (Object) null);
        this.safeCallbackInvoke.invoke(new p5b(listeners, placement, 3));
    }
}
