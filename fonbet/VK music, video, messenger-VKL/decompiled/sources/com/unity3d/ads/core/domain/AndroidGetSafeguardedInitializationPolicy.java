package com.unity3d.ads.core.domain;

import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import xsna.swe0;

/* compiled from: AndroidGetSafeguardedInitializationPolicy.kt */
/* loaded from: classes14.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    public NativeConfigurationOuterClass.RequestPolicy invoke(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        RequestPolicyKt.Dsl _create = RequestPolicyKt.Dsl.Companion._create(requestPolicy.toBuilder());
        RequestRetryPolicyKt.Dsl _create2 = RequestRetryPolicyKt.Dsl.Companion._create(_create.getRetryPolicy().toBuilder());
        int maxDuration = _create2.getMaxDuration();
        if (maxDuration < 5000) {
            maxDuration = 5000;
        }
        _create2.setMaxDuration(maxDuration);
        int retryWaitBase = _create2.getRetryWaitBase();
        if (retryWaitBase < 0) {
            retryWaitBase = 0;
        }
        _create2.setRetryWaitBase(retryWaitBase);
        int retryMaxInterval = _create2.getRetryMaxInterval();
        _create2.setRetryMaxInterval(retryMaxInterval >= 0 ? retryMaxInterval : 0);
        float retryScalingFactor = _create2.getRetryScalingFactor();
        if (retryScalingFactor < 0.1f) {
            retryScalingFactor = 0.1f;
        }
        _create2.setRetryScalingFactor(retryScalingFactor);
        _create2.setRetryJitterPct(swe0.f(_create2.getRetryJitterPct(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f));
        _create.setRetryPolicy(_create2._build());
        RequestTimeoutPolicyKt.Dsl _create3 = RequestTimeoutPolicyKt.Dsl.Companion._create(_create.getTimeoutPolicy().toBuilder());
        int connectTimeoutMs = _create3.getConnectTimeoutMs();
        if (connectTimeoutMs < 1000) {
            connectTimeoutMs = 1000;
        }
        _create3.setConnectTimeoutMs(connectTimeoutMs);
        int readTimeoutMs = _create3.getReadTimeoutMs();
        if (readTimeoutMs < 1000) {
            readTimeoutMs = 1000;
        }
        _create3.setReadTimeoutMs(readTimeoutMs);
        int writeTimeoutMs = _create3.getWriteTimeoutMs();
        if (writeTimeoutMs < 1000) {
            writeTimeoutMs = 1000;
        }
        _create3.setWriteTimeoutMs(writeTimeoutMs);
        int overallTimeoutMs = _create3.getOverallTimeoutMs();
        _create3.setOverallTimeoutMs(overallTimeoutMs >= 1000 ? overallTimeoutMs : 1000);
        _create.setTimeoutPolicy(_create3._build());
        return _create._build();
    }
}
