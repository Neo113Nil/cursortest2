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
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import xsna.drm0;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.yvj;

/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final AdRevenueObserver adRevenueObserver;
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final InitializeAdQuality initializeAdQuality;
    private final LifecycleEventObserver lifecycleEventObserver;
    private final MaxAdRevenueObserver maxAdRevenueObserver;
    private final yvj sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, AdRevenueObserver adRevenueObserver, MaxAdRevenueObserver maxAdRevenueObserver, LifecycleEventObserver lifecycleEventObserver, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, yvj yvjVar, HandleDebugSettings handleDebugSettings, GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, InitializeAdQuality initializeAdQuality) {
        this.transactionEventManager = transactionEventManager;
        this.adRevenueObserver = adRevenueObserver;
        this.maxAdRevenueObserver = maxAdRevenueObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = yvjVar;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
        this.defaultNativeConfiguration = nativeConfiguration;
        this.initializeAdQuality = initializeAdQuality;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, spj<? super s3q0> spjVar) {
        String universalRequestUrl;
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse() && universalResponse.getPayload().getInitializationResponse().hasError()) {
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(universalResponse.getPayload().getInitializationResponse().getError().getErrorCode(), this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            }
            throw new GatewayException(initErrorMsg, new IllegalStateException(universalResponse.getPayload().getInitializationResponse().getError().getErrorText()), "gateway_initialization", universalResponse.getPayload().getInitializationResponse().getError().getErrorText(), universalResponse.getPayload().getInitializationResponse().getError().getErrorCode(), ErrorExtensionsKt.getErrorTokenOrNull(universalResponse.getPayload().getInitializationResponse().getError()));
        }
        if (universalResponse.hasError()) {
            String initErrorMsg2 = UnityAdsErrorKt.getInitErrorMsg(universalResponse.getError().getErrorCode(), this.sessionRepository.getGameId());
            if (initErrorMsg2 == null) {
                initErrorMsg2 = universalResponse.getError().getErrorText();
            }
            throw new InitializationException(initErrorMsg2, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_initialization", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode(), ErrorExtensionsKt.getErrorTokenOrNull(universalResponse.getError()));
        }
        if (!universalResponse.hasPayload() || !universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_PARSING_ERROR, null, "gateway", "No payload", ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO, null, 34, null);
        }
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationKt.Dsl _create = NativeConfigurationKt.Dsl.Companion._create(initializationResponse.getNativeConfiguration().toBuilder());
        _create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(_create.getInitPolicy()));
        _create.setMaxExtrasSizeKb(_create.getMaxExtrasSizeKb() == 0 ? this.defaultNativeConfiguration.getMaxExtrasSizeKb() : _create.getMaxExtrasSizeKb());
        sessionRepository.setNativeConfiguration(_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            this.sessionRepository.setGatewayUrl(initializationResponse.getUniversalRequestUrl());
        }
        List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = initializationResponse.getRequestUrlOverridesList();
        if (requestUrlOverridesList != null) {
            this.sessionRepository.setRequestUrlOverrides(requestUrlOverridesList);
        }
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            myc0.h(this.sdkScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$4(this, null), 3);
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
            this.handleDebugSettings.invoke(initializationResponse.getNativeConfiguration().getDebugSettings());
        }
        String levelPlayAppKey = initializationResponse.getNativeConfiguration().getLevelPlayAppKey();
        if (initializationResponse.getNativeConfiguration().hasLevelPlayAppKey() && !drm0.N(levelPlayAppKey)) {
            this.initializeAdQuality.invoke(levelPlayAppKey, this.sessionRepository.getSessionToken());
        } else if (initializationResponse.getNativeConfiguration().getFeatureFlags().getShouldInitAdqWithGameId()) {
            this.initializeAdQuality.invokeWithGameId(this.sessionRepository.getSessionToken());
        }
        return s3q0.a;
    }
}
