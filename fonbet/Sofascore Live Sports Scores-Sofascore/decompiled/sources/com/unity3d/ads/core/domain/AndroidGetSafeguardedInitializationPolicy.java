package com.unity3d.ads.core.domain;

import com.unity3d.services.UnityAdsConstants;
import defpackage.llf;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.RequestPolicyKt;
import gatewayprotocol.v1.RequestRetryPolicyKt;
import gatewayprotocol.v1.RequestTimeoutPolicyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSafeguardedInitializationPolicy;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "<init>", "()V", "invoke", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "requestPolicy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetSafeguardedInitializationPolicy implements GetSafeguardedInitializationPolicy {
    @Override // com.unity3d.ads.core.domain.GetSafeguardedInitializationPolicy
    @NotNull
    public NativeConfigurationOuterClass.RequestPolicy invoke(@NotNull NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
        requestPolicy.getClass();
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestPolicy.Builder builder = requestPolicy.toBuilder();
        builder.getClass();
        RequestPolicyKt.Dsl _create = companion._create(builder);
        NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = _create.getRetryPolicy();
        RequestRetryPolicyKt.Dsl.Companion companion2 = RequestRetryPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder2 = retryPolicy.toBuilder();
        builder2.getClass();
        RequestRetryPolicyKt.Dsl _create2 = companion2._create(builder2);
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
        _create2.setRetryJitterPct(llf.b(_create2.getRetryJitterPct(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f));
        _create.setRetryPolicy(_create2._build());
        NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = _create.getTimeoutPolicy();
        RequestTimeoutPolicyKt.Dsl.Companion companion3 = RequestTimeoutPolicyKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder3 = timeoutPolicy.toBuilder();
        builder3.getClass();
        RequestTimeoutPolicyKt.Dsl _create3 = companion3._create(builder3);
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
