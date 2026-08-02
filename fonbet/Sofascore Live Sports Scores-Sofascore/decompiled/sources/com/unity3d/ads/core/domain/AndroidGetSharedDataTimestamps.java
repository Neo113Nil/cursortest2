package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetSharedDataTimestamps;", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "foregroundDurationReader", "Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;", "<init>", "(Lcom/unity3d/ads/core/data/datasource/ForegroundDurationReader;)V", "invoke", "Lgatewayprotocol/v1/TimestampsOuterClass$Timestamps;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetSharedDataTimestamps implements GetSharedDataTimestamps {

    @NotNull
    private final ForegroundDurationReader foregroundDurationReader;

    public AndroidGetSharedDataTimestamps(@NotNull ForegroundDurationReader foregroundDurationReader) {
        foregroundDurationReader.getClass();
        this.foregroundDurationReader = foregroundDurationReader;
    }

    @Override // com.unity3d.ads.core.domain.GetSharedDataTimestamps
    @NotNull
    public TimestampsOuterClass.Timestamps invoke() {
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.INSTANCE;
        TimestampsOuterClass.Timestamps.Builder newBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        newBuilder.getClass();
        TimestampsKt.Dsl _create = companion._create(newBuilder);
        _create.setTimestamp(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
        _create.setSessionTimestamp(SystemClock.elapsedRealtime() - SdkProperties.getInitializationTime());
        _create.setSessionDurationInForeground(this.foregroundDurationReader.getSessionDurationInForegroundMs());
        return _create._build();
    }
}
