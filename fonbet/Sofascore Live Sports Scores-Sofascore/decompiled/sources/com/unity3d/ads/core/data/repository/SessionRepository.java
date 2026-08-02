package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.ironsource.U3;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import defpackage.rq3;
import defpackage.xdh;
import defpackage.z88;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0006H&¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019H&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019H&¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010\u000eR\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001c\u00101\u001a\u00020,8&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00107\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010=\u001a\u0002088&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010C\u001a\u0004\u0018\u00010>8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010J\u001a\b\u0012\u0004\u0012\u00020E0D8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u0002080K8&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010QR\u0014\u0010S\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u001c\u0010Y\u001a\u00020T8&@&X¦\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001c\u0010_\u001a\u00020Z8&@&X¦\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010b\u001a\u0004\u0018\u0001028&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\u001c\u0010f\u001a\u00020O8&@&X¦\u000e¢\u0006\f\u001a\u0004\bc\u0010Q\"\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010%R\u0014\u0010i\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010QR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010QR\u0014\u0010w\u001a\u00020O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010QR\u0016\u0010y\u001a\u0004\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\bx\u00104R\u0016\u0010{\u001a\u0004\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u00104R \u0010\u0081\u0001\u001a\u0004\u0018\u00010|8&@&X¦\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0082\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "Lcom/google/protobuf/ByteString;", "getGatewayCache", "(Lrq3;)Ljava/lang/Object;", U3.i.X, "", "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lrq3;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "incrementLoadRequestCount", "()V", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "persistNativeConfiguration", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "incrementGlobalAdsFocusChangeCount", "", "timeMs", "addTimeToGlobalAdsFocusTime", "(I)V", "incrementFocusChangeCount", "ms", "setInitializationLatency", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "sessionToken", "getGatewayState", "setGatewayState", "gatewayState", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "nativeConfiguration", "", "getGatewayUrl", "()Ljava/lang/String;", "setGatewayUrl", "(Ljava/lang/String;)V", "gatewayUrl", "Lcom/unity3d/ads/core/data/model/InitializationState;", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "initializationState", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "initializationError", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "getRequestUrlOverrides", "()Ljava/util/List;", "setRequestUrlOverrides", "(Ljava/util/List;)V", "requestUrlOverrides", "Lz88;", "getObserveInitializationState", "()Lz88;", "observeInitializationState", "", "isSdkInitialized", "()Z", "isNativeConfigReady", "isDiagnosticsEnabled", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "tokenCounters", "getGameId", "setGameId", AndroidGetAdPlayerContext.KEY_GAME_ID, "getShouldInitialize", "setShouldInitialize", "(Z)V", "shouldInitialize", "getSessionId", "sessionId", "isTestModeEnabled", "Lxdh;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "getOnChange", "()Lxdh;", "onChange", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getHeaderBiddingTokenCounter", "()I", "headerBiddingTokenCounter", "isOmEnabled", "isFirstInitAttempt", "getUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "unityMegaSessionId", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "initializationConfiguration", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int timeMs);

    @NotNull
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    @Nullable
    String getGameId();

    @Nullable
    Object getGatewayCache(@NotNull rq3<? super ByteString> rq3Var);

    @NotNull
    ByteString getGatewayState();

    @NotNull
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @Nullable
    InitializationConfigurationInternal getInitializationConfiguration();

    @Nullable
    InitializationException getInitializationError();

    @NotNull
    InitializationState getInitializationState();

    @NotNull
    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    @NotNull
    z88 getObserveInitializationState();

    @NotNull
    xdh getOnChange();

    @Nullable
    Object getPrivacy(@NotNull rq3<? super ByteString> rq3Var);

    @Nullable
    Object getPrivacyFsm(@NotNull rq3<? super ByteString> rq3Var);

    @NotNull
    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    @NotNull
    SessionCountersOuterClass.SessionCounters getSessionCounters();

    @NotNull
    ByteString getSessionId();

    @NotNull
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @NotNull
    TokenCounters getTokenCounters();

    @Nullable
    String getUnityInstallationId();

    @Nullable
    String getUnityMegaSessionId();

    void incrementAllErrorsCount();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementCacheTimeoutErrorsCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementSuccessCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isNativeConfigReady();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @Nullable
    Object persistNativeConfiguration(@NotNull rq3<? super Unit> rq3Var);

    void resetTokenCounters();

    void setGameId(@Nullable String str);

    @Nullable
    Object setGatewayCache(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var);

    void setGatewayState(@NotNull ByteString byteString);

    void setGatewayUrl(@NotNull String str);

    void setInitializationConfiguration(@Nullable InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(@Nullable InitializationException initializationException);

    void setInitializationLatency(int ms);

    void setInitializationState(@NotNull InitializationState initializationState);

    void setLastLoadLatency(int ms);

    void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    @Nullable
    Object setPrivacy(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull rq3<? super Unit> rq3Var);

    void setRequestUrlOverrides(@NotNull List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(@NotNull ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(@NotNull TokenCounters tokenCounters);
}
