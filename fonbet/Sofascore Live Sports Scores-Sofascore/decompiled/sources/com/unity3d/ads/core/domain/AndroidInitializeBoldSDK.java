package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.au3;
import defpackage.jka;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sub;
import defpackage.tub;
import defpackage.xw3;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0019\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0001QB\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b'\u0010(J \u0010-\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020)H\u0002¢\u0006\u0004\b/\u00100J(\u00103\u001a\u00020&2\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0082@¢\u0006\u0004\b3\u00104J/\u00107\u001a\u00020&2\u0006\u00102\u001a\u0002012\u0006\u00106\u001a\u0002052\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108J7\u0010:\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020)092\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020&H\u0002¢\u0006\u0004\b<\u0010(J\u000f\u0010=\u001a\u00020&H\u0002¢\u0006\u0004\b=\u0010(J\u0018\u0010>\u001a\u00020&2\u0006\u0010*\u001a\u00020)H\u0096B¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010KR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010NR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010OR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010P¨\u0006R"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "initializeOM", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getInitializeRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/CleanAssets;", "cleanAssets", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "handleGatewayInitializationResponse", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "eventObservers", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "triggerInitializeListener", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "storageManager", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "handleFocusCounters", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/CleanAssets;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;)V", "", "checkCanInitialize", "()V", "", "source", "", "isRetry", "initializationStart", "(Ljava/lang/String;ZLrq3;)Ljava/lang/Object;", "getInitLog", "()Ljava/lang/String;", "Lkotlin/time/TimeMark;", "startTime", "initializationSuccess", "(Lkotlin/time/TimeMark;Ljava/lang/String;ZLrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "e", "initializationFailure", "(Lkotlin/time/TimeMark;Lcom/unity3d/ads/core/data/model/exception/InitializationException;Ljava/lang/String;Z)V", "", "getTags", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;Ljava/lang/String;Z)Ljava/util/Map;", "setupDiagnosticEvents", "logNewPrivacyWasNotUsedIfNeeded", "invoke", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lau3;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/domain/CleanAssets;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "Lcom/unity3d/ads/core/domain/GetGameId;", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {

    @NotNull
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";

    @NotNull
    public static final String MSG_NETWORK = "Network";

    @NotNull
    public static final String MSG_TIMEOUT = "Timeout";

    @NotNull
    public static final String MSG_UNKNOWN = "Initialization failure";

    @NotNull
    private final CleanAssets cleanAssets;

    @NotNull
    private final au3 defaultDispatcher;

    @NotNull
    private final DiagnosticEventRepository diagnosticEventRepository;

    @NotNull
    private final EventObservers eventObservers;

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetGameId getGameId;

    @NotNull
    private final GetInitializationRequest getInitializeRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final AndroidHandleFocusCounters handleFocusCounters;

    @NotNull
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;

    @NotNull
    private final InitializeOMSDK initializeOM;

    @NotNull
    private final Logger logger;

    @NotNull
    private final SDKPropertiesManager sdkPropertiesManager;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    private final TriggerInitializeListener triggerInitializeListener;

    public AndroidInitializeBoldSDK(@NotNull au3 au3Var, @NotNull InitializeOMSDK initializeOMSDK, @NotNull GetInitializationRequest getInitializationRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull CleanAssets cleanAssets, @NotNull HandleGatewayInitializationResponse handleGatewayInitializationResponse, @NotNull GatewayClient gatewayClient, @NotNull SessionRepository sessionRepository, @NotNull EventObservers eventObservers, @NotNull TriggerInitializeListener triggerInitializeListener, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull DiagnosticEventRepository diagnosticEventRepository, @NotNull StorageManager storageManager, @NotNull SDKPropertiesManager sDKPropertiesManager, @NotNull GetGameId getGameId, @NotNull Logger logger, @NotNull AndroidHandleFocusCounters androidHandleFocusCounters) {
        au3Var.getClass();
        initializeOMSDK.getClass();
        getInitializationRequest.getClass();
        getRequestPolicy.getClass();
        cleanAssets.getClass();
        handleGatewayInitializationResponse.getClass();
        gatewayClient.getClass();
        sessionRepository.getClass();
        eventObservers.getClass();
        triggerInitializeListener.getClass();
        sendDiagnosticEvent.getClass();
        diagnosticEventRepository.getClass();
        storageManager.getClass();
        sDKPropertiesManager.getClass();
        getGameId.getClass();
        logger.getClass();
        androidHandleFocusCounters.getClass();
        this.defaultDispatcher = au3Var;
        this.initializeOM = initializeOMSDK;
        this.getInitializeRequest = getInitializationRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.sdkPropertiesManager = sDKPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = androidHandleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() {
        if (this.sessionRepository.getShouldInitialize()) {
            if (this.getGameId.invoke() == null) {
                throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", null, null, 50, null);
            }
        } else {
            InitializationException initializationError = this.sessionRepository.getInitializationError();
            if (initializationError == null) {
                throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", null, null, 50, null);
            }
        }
    }

    private final String getInitLog() {
        StringBuilder sb = new StringBuilder("Initializing SDK 4.19.0 41900 with game id ");
        sb.append(this.getGameId.invoke());
        sb.append(" in ");
        sb.append(this.sessionRepository.isTestModeEnabled() ? "test" : "production");
        sb.append(" mode, session ");
        sb.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb.toString();
    }

    private final Map<String, String> getTags(InitializationException e, String source, boolean isRetry) {
        ltb ltbVar = new ltb();
        ltbVar.put("operation", OperationType.INITIALIZATION.toString());
        if (e != null) {
        }
        ltbVar.put("source", source);
        ltbVar.put("is_retry", String.valueOf(isRetry));
        ltbVar.put("new_api", String.valueOf(this.sessionRepository.getInitializationConfiguration() != null));
        if (e != null && e.getReasonDebug() != null) {
            ltbVar.put("reason_debug", e.getReasonDebug());
        }
        return ltbVar.d();
    }

    public static /* synthetic */ Map getTags$default(AndroidInitializeBoldSDK androidInitializeBoldSDK, InitializationException initializationException, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            initializationException = null;
        }
        return androidInitializeBoldSDK.getTags(initializationException, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(TimeMark startTime, InitializationException e, String source, boolean isRetry) {
        this.logger.error("Initialization failed: " + e.getMessage(), e);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), getTags(e, source, isRetry), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sessionRepository.setInitializationError(e);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(e);
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z, rq3<? super Unit> rq3Var) {
        this.logger.info(getInitLog());
        logNewPrivacyWasNotUsedIfNeeded();
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED, (Double) null, tub.k(getTags$default(this, null, str, z, 1, null), sub.d(new Pair("kotlin_version", jka.f.toString()))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(rq3Var);
        return invoke == lu3.a ? invoke : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r1.persistNativeConfiguration(r6) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r1.invoke(r6) != r7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializationSuccess(TimeMark timeMark, String str, boolean z, rq3<? super Unit> rq3Var) {
        AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$1;
        int i;
        double d;
        if (rq3Var instanceof AndroidInitializeBoldSDK$initializationSuccess$1) {
            androidInitializeBoldSDK$initializationSuccess$1 = (AndroidInitializeBoldSDK$initializationSuccess$1) rq3Var;
            int i2 = androidInitializeBoldSDK$initializationSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidInitializeBoldSDK$initializationSuccess$1.label = i2 - Integer.MIN_VALUE;
                AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$12 = androidInitializeBoldSDK$initializationSuccess$1;
                Object obj = androidInitializeBoldSDK$initializationSuccess$12.result;
                lu3 lu3Var = lu3.a;
                i = androidInitializeBoldSDK$initializationSuccess$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    this.logger.info("Initialized successfully");
                    double elapsedMillis = TimeExtensionsKt.elapsedMillis(timeMark);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_SUCCESS_TIME, new Double(elapsedMillis), getTags$default(this, null, str, z, 1, null), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                    this.storageManager.hasInitialized();
                    InitializeOMSDK initializeOMSDK = this.initializeOM;
                    androidInitializeBoldSDK$initializationSuccess$12.D$0 = elapsedMillis;
                    androidInitializeBoldSDK$initializationSuccess$12.label = 1;
                    if (initializeOMSDK.invoke(androidInitializeBoldSDK$initializationSuccess$12) != lu3Var) {
                        d = elapsedMillis;
                    }
                    return lu3Var;
                }
                if (i == 1) {
                    d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                        y6a.M(obj);
                        this.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
                        this.sdkPropertiesManager.setInitialized(true);
                        this.sessionRepository.setInitializationLatency((int) d);
                        this.triggerInitializeListener.success();
                        setupDiagnosticEvents();
                        return Unit.a;
                    }
                    d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                    y6a.M(obj);
                    this.handleFocusCounters.invoke();
                    SessionRepository sessionRepository = this.sessionRepository;
                    androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
                    androidInitializeBoldSDK$initializationSuccess$12.label = 3;
                }
                CleanAssets cleanAssets = this.cleanAssets;
                androidInitializeBoldSDK$initializationSuccess$12.D$0 = d;
                androidInitializeBoldSDK$initializationSuccess$12.label = 2;
            }
        }
        androidInitializeBoldSDK$initializationSuccess$1 = new AndroidInitializeBoldSDK$initializationSuccess$1(this, rq3Var);
        AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$122 = androidInitializeBoldSDK$initializationSuccess$1;
        Object obj2 = androidInitializeBoldSDK$initializationSuccess$122.result;
        lu3 lu3Var2 = lu3.a;
        i = androidInitializeBoldSDK$initializationSuccess$122.label;
        if (i != 0) {
        }
        CleanAssets cleanAssets2 = this.cleanAssets;
        androidInitializeBoldSDK$initializationSuccess$122.D$0 = d;
        androidInitializeBoldSDK$initializationSuccess$122.label = 2;
    }

    private final void logNewPrivacyWasNotUsedIfNeeded() {
        if (this.sessionRepository.getInitializationConfiguration() != null && UnityAds.getUserConsent() == null && UnityAds.getUserOptOut() == null && UnityAds.getNonBehavioral() == null) {
            this.logger.info("The new UnityAds SDK initialization was used without the new privacy APIs. Use the new privacy APIs to update privacy consent handling.");
        }
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        diagnosticEvents.getClass();
        diagnosticEventRepository.configure(diagnosticEvents);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    @Nullable
    public Object invoke(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        Object R = xw3.R(this.defaultDispatcher, new AndroidInitializeBoldSDK$invoke$2(this, str, null), rq3Var);
        return R == lu3.a ? R : Unit.a;
    }
}
