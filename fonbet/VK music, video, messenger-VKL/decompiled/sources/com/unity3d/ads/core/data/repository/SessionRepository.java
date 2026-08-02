package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import xsna.baj0;
import xsna.ksr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SessionRepository.kt */
/* loaded from: classes14.dex */
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int i);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(spj<? super ByteString> spjVar);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationConfigurationInternal getInitializationConfiguration();

    InitializationException getInitializationError();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    ksr<InitializationState> getObserveInitializationState();

    baj0<SessionChange> getOnChange();

    Object getPrivacy(spj<? super ByteString> spjVar);

    Object getPrivacyFsm(spj<? super ByteString> spjVar);

    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    String getUnityInstallationId();

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

    Object persistNativeConfiguration(spj<? super s3q0> spjVar);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, spj<? super s3q0> spjVar);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(InitializationException initializationException);

    void setInitializationLatency(int i);

    void setInitializationState(InitializationState initializationState);

    void setLastLoadLatency(int i);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, spj<? super s3q0> spjVar);

    Object setPrivacyFsm(ByteString byteString, spj<? super s3q0> spjVar);

    void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(TokenCounters tokenCounters);
}
