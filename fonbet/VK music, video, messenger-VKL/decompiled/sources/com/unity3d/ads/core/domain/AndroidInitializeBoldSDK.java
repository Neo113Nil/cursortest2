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
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.myc0;
import xsna.on00;
import xsna.ovj;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.uto0;
import xsna.zcl;

/* compiled from: AndroidInitializeBoldSDK.kt */
/* loaded from: classes14.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final ovj defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final Logger logger;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* compiled from: AndroidInitializeBoldSDK.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidInitializeBoldSDK(ovj ovjVar, InitializeOMSDK initializeOMSDK, GetInitializationRequest getInitializationRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, SDKPropertiesManager sDKPropertiesManager, GetGameId getGameId, Logger logger, AndroidHandleFocusCounters androidHandleFocusCounters) {
        this.defaultDispatcher = ovjVar;
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
        sb.append(this.sessionRepository.isTestModeEnabled() ? LoginRequest.CLIENT_NAME : "production");
        sb.append(" mode, session ");
        sb.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb.toString();
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("operation", OperationType.INITIALIZATION.toString());
        if (initializationException != null) {
        }
        mapBuilder.put("source", str);
        mapBuilder.put("is_retry", String.valueOf(z));
        mapBuilder.put("new_api", String.valueOf(this.sessionRepository.getInitializationConfiguration() != null));
        if (initializationException != null && initializationException.getReasonDebug() != null) {
            mapBuilder.put("reason_debug", initializationException.getReasonDebug());
        }
        return mapBuilder.h();
    }

    public static /* synthetic */ Map getTags$default(AndroidInitializeBoldSDK androidInitializeBoldSDK, InitializationException initializationException, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            initializationException = null;
        }
        return androidInitializeBoldSDK.getTags(initializationException, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(uto0 uto0Var, InitializationException initializationException, String str, boolean z) {
        this.logger.error("Initialization failed: " + initializationException.getMessage(), initializationException);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), getTags(initializationException, str, z), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sessionRepository.setInitializationError(initializationException);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(initializationException);
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z, spj<? super s3q0> spjVar) {
        this.logger.info(getInitLog());
        logNewPrivacyWasNotUsedIfNeeded();
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED, (Double) null, pn00.n(getTags$default(this, null, str, z, 1, null), on00.f(new Pair("kotlin_version", KotlinVersion.CURRENT.toString()))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object invoke = this.eventObservers.invoke(spjVar);
        return invoke == CoroutineSingletons.COROUTINE_SUSPENDED ? invoke : s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if (r1.persistNativeConfiguration(r6) == r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r1.invoke(r6) != r7) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializationSuccess(uto0 uto0Var, String str, boolean z, spj<? super s3q0> spjVar) {
        AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$1;
        int i;
        double d;
        if (spjVar instanceof AndroidInitializeBoldSDK$initializationSuccess$1) {
            androidInitializeBoldSDK$initializationSuccess$1 = (AndroidInitializeBoldSDK$initializationSuccess$1) spjVar;
            int i2 = androidInitializeBoldSDK$initializationSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidInitializeBoldSDK$initializationSuccess$1.label = i2 - Integer.MIN_VALUE;
                AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$12 = androidInitializeBoldSDK$initializationSuccess$1;
                Object obj = androidInitializeBoldSDK$initializationSuccess$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidInitializeBoldSDK$initializationSuccess$12.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    this.logger.info("Initialized successfully");
                    double elapsedMillis = TimeExtensionsKt.elapsedMillis(uto0Var);
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_SUCCESS_TIME, new Double(elapsedMillis), getTags$default(this, null, str, z, 1, null), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                    this.storageManager.hasInitialized();
                    InitializeOMSDK initializeOMSDK = this.initializeOM;
                    androidInitializeBoldSDK$initializationSuccess$12.D$0 = elapsedMillis;
                    androidInitializeBoldSDK$initializationSuccess$12.label = 1;
                    if (initializeOMSDK.invoke(androidInitializeBoldSDK$initializationSuccess$12) != coroutineSingletons) {
                        d = elapsedMillis;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                    kotlin.a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                        kotlin.a.a(obj);
                        this.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
                        this.sdkPropertiesManager.setInitialized(true);
                        this.sessionRepository.setInitializationLatency((int) d);
                        this.triggerInitializeListener.success();
                        setupDiagnosticEvents();
                        return s3q0.a;
                    }
                    d = androidInitializeBoldSDK$initializationSuccess$12.D$0;
                    kotlin.a.a(obj);
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
        androidInitializeBoldSDK$initializationSuccess$1 = new AndroidInitializeBoldSDK$initializationSuccess$1(this, spjVar);
        AndroidInitializeBoldSDK$initializationSuccess$1 androidInitializeBoldSDK$initializationSuccess$122 = androidInitializeBoldSDK$initializationSuccess$1;
        Object obj2 = androidInitializeBoldSDK$initializationSuccess$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
        this.diagnosticEventRepository.configure(this.sessionRepository.getNativeConfiguration().getDiagnosticEvents());
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, spj<? super s3q0> spjVar) {
        Object k = myc0.k(this.defaultDispatcher, new AndroidInitializeBoldSDK$invoke$2(this, str, null), spjVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
