package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import com.unity3d.ads.core.extensions.ErrorExtensionsKt;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.xw3;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096B¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)¨\u0006*"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "transactionEventManager", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "adRevenueObserver", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "maxAdRevenueObserver", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "lifecycleEventObserver", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lku3;", "sdkScope", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "handleDebugSettings", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "getSafeguardedInitializationPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "initializeAdQuality", "<init>", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lku3;Lcom/unity3d/ads/core/domain/HandleDebugSettings;Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "response", "", "invoke", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lku3;", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {

    @NotNull
    private final AdRevenueObserver adRevenueObserver;

    @NotNull
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;

    @NotNull
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;

    @NotNull
    private final HandleDebugSettings handleDebugSettings;

    @NotNull
    private final InitializeAdQuality initializeAdQuality;

    @NotNull
    private final LifecycleEventObserver lifecycleEventObserver;

    @NotNull
    private final MaxAdRevenueObserver maxAdRevenueObserver;

    @NotNull
    private final ku3 sdkScope;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final TransactionEventManager transactionEventManager;

    @NotNull
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(@NotNull TransactionEventManager transactionEventManager, @NotNull AdRevenueObserver adRevenueObserver, @NotNull MaxAdRevenueObserver maxAdRevenueObserver, @NotNull LifecycleEventObserver lifecycleEventObserver, @NotNull TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, @NotNull SessionRepository sessionRepository, @NotNull ku3 ku3Var, @NotNull HandleDebugSettings handleDebugSettings, @NotNull GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy, @NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, @NotNull InitializeAdQuality initializeAdQuality) {
        transactionEventManager.getClass();
        adRevenueObserver.getClass();
        maxAdRevenueObserver.getClass();
        lifecycleEventObserver.getClass();
        triggerInitializationCompletedRequest.getClass();
        sessionRepository.getClass();
        ku3Var.getClass();
        handleDebugSettings.getClass();
        getSafeguardedInitializationPolicy.getClass();
        nativeConfiguration.getClass();
        initializeAdQuality.getClass();
        this.transactionEventManager = transactionEventManager;
        this.adRevenueObserver = adRevenueObserver;
        this.maxAdRevenueObserver = maxAdRevenueObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = ku3Var;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
        this.defaultNativeConfiguration = nativeConfiguration;
        this.initializeAdQuality = initializeAdQuality;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    @Nullable
    public Object invoke(@NotNull UniversalResponseOuterClass.UniversalResponse universalResponse, @NotNull rq3<? super Unit> rq3Var) {
        String universalRequestUrl;
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse() && universalResponse.getPayload().getInitializationResponse().hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            errorCode.getClass();
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            }
            String str = initErrorMsg;
            str.getClass();
            IllegalStateException illegalStateException = new IllegalStateException(universalResponse.getPayload().getInitializationResponse().getError().getErrorText());
            String errorText = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            ErrorOuterClass.Error error = universalResponse.getPayload().getInitializationResponse().getError();
            error.getClass();
            throw new GatewayException(str, illegalStateException, "gateway_initialization", errorText, errorCode2, ErrorExtensionsKt.getErrorTokenOrNull(error));
        }
        if (universalResponse.hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode3 = universalResponse.getError().getErrorCode();
            errorCode3.getClass();
            String initErrorMsg2 = UnityAdsErrorKt.getInitErrorMsg(errorCode3, this.sessionRepository.getGameId());
            if (initErrorMsg2 == null) {
                initErrorMsg2 = universalResponse.getError().getErrorText();
            }
            String str2 = initErrorMsg2;
            str2.getClass();
            IllegalStateException illegalStateException2 = new IllegalStateException(universalResponse.getError().getErrorText());
            String errorText2 = universalResponse.getError().getErrorText();
            ErrorOuterClass.PublicErrorCode errorCode4 = universalResponse.getError().getErrorCode();
            ErrorOuterClass.Error error2 = universalResponse.getError();
            error2.getClass();
            throw new InitializationException(str2, illegalStateException2, "gateway_initialization", errorText2, errorCode4, ErrorExtensionsKt.getErrorTokenOrNull(error2));
        }
        if (!universalResponse.hasPayload() || !universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_PARSING_ERROR, null, "gateway", "No payload", ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO, null, 34, null);
        }
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        nativeConfiguration.getClass();
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        builder.getClass();
        NativeConfigurationKt.Dsl _create = companion._create(builder);
        _create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(_create.getInitPolicy()));
        _create.setMaxExtrasSizeKb(_create.getMaxExtrasSizeKb() == 0 ? this.defaultNativeConfiguration.getMaxExtrasSizeKb() : _create.getMaxExtrasSizeKb());
        sessionRepository.setNativeConfiguration(_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            universalRequestUrl2.getClass();
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = initializationResponse.getRequestUrlOverridesList();
        if (requestUrlOverridesList != null) {
            this.sessionRepository.setRequestUrlOverrides(requestUrlOverridesList);
        }
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            xw3.L(this.sdkScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$4(this, null), 3);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectIlrData()) {
            this.adRevenueObserver.invoke();
        }
        this.maxAdRevenueObserver.invoke();
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectLifecycleEvents()) {
            this.lifecycleEventObserver.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            debugSettings.getClass();
            handleDebugSettings.invoke(debugSettings);
        }
        String levelPlayAppKey = initializationResponse.getNativeConfiguration().getLevelPlayAppKey();
        if (initializationResponse.getNativeConfiguration().hasLevelPlayAppKey()) {
            levelPlayAppKey.getClass();
            if (!StringsKt.R(levelPlayAppKey)) {
                this.initializeAdQuality.invoke(levelPlayAppKey, this.sessionRepository.getSessionToken());
                return Unit.a;
            }
        }
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getShouldInitAdqWithGameId()) {
            this.initializeAdQuality.invokeWithGameId(this.sessionRepository.getSessionToken());
        }
        return Unit.a;
    }
}
