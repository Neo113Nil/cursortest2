package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "transactionEventManager", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sdkScope", "Lkotlinx/coroutines/CoroutineScope;", "handleDebugSettings", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "getSafeguardedInitializationPolicy", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "defaultNativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/HandleDebugSettings;Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "invoke", "", "response", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final CoroutineScope sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, CoroutineScope sdkScope, HandleDebugSettings handleDebugSettings, GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration) {
        Intrinsics.checkNotNullParameter(transactionEventManager, "transactionEventManager");
        Intrinsics.checkNotNullParameter(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sdkScope, "sdkScope");
        Intrinsics.checkNotNullParameter(handleDebugSettings, "handleDebugSettings");
        Intrinsics.checkNotNullParameter(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        Intrinsics.checkNotNullParameter(defaultNativeConfiguration, "defaultNativeConfiguration");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
        this.defaultNativeConfiguration = defaultNativeConfiguration;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, Continuation<? super Unit> continuation) {
        String universalRequestUrl;
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse() && universalResponse.getPayload().getInitializationResponse().hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode, "response.payload.initial…nResponse.error.errorCode");
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            }
            String str = initErrorMsg;
            Intrinsics.checkNotNullExpressionValue(str, "response.payload.initial…nResponse.error.errorText");
            throw new GatewayException(str, new IllegalStateException(universalResponse.getPayload().getInitializationResponse().getError().getErrorText()), "gateway_initialization", universalResponse.getPayload().getInitializationResponse().getError().getErrorText(), universalResponse.getPayload().getInitializationResponse().getError().getErrorCode());
        }
        if (universalResponse.hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
            Intrinsics.checkNotNullExpressionValue(errorCode2, "response.error.errorCode");
            String initErrorMsg2 = UnityAdsErrorKt.getInitErrorMsg(errorCode2, this.sessionRepository.getGameId());
            if (initErrorMsg2 == null) {
                initErrorMsg2 = universalResponse.getError().getErrorText();
            }
            String str2 = initErrorMsg2;
            Intrinsics.checkNotNullExpressionValue(str2, "response.error.errorCode… response.error.errorText");
            throw new InitializationException(str2, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_initialization", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode());
        }
        if (!universalResponse.hasPayload() || !universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_PARSING_ERROR, null, "gateway", "No payload", ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO, 2, null);
        }
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        Intrinsics.checkNotNullExpressionValue(nativeConfiguration, "initResponse.nativeConfiguration");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl _create = companion._create(builder);
        _create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(_create.getInitPolicy()));
        _create.setMaxExtrasSizeKb(_create.getMaxExtrasSizeKb() == 0 ? this.defaultNativeConfiguration.getMaxExtrasSizeKb() : _create.getMaxExtrasSizeKb());
        sessionRepository.setNativeConfiguration(_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            Intrinsics.checkNotNullExpressionValue(universalRequestUrl2, "initResponse.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = initializationResponse.getRequestUrlOverridesList();
        if (requestUrlOverridesList != null) {
            this.sessionRepository.setRequestUrlOverrides(requestUrlOverridesList);
        }
        List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        Intrinsics.checkNotNullExpressionValue(scarEligibleFormatsList, "initResponse.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            BuildersKt__Builders_commonKt.launch$default(this.sdkScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$4(this, null), 3, null);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            Intrinsics.checkNotNullExpressionValue(debugSettings, "initResponse.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        return Unit.INSTANCE;
    }
}
