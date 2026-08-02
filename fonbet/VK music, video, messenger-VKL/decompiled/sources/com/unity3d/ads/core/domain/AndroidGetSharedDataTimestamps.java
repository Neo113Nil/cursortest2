package com.unity3d.ads.core.domain;

import android.os.SystemClock;
import com.unity3d.ads.core.data.datasource.ForegroundDurationReader;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;

/* compiled from: AndroidGetSharedDataTimestamps.kt */
/* loaded from: classes14.dex */
public final class AndroidGetSharedDataTimestamps implements GetSharedDataTimestamps {
    private final ForegroundDurationReader foregroundDurationReader;

    public AndroidGetSharedDataTimestamps(ForegroundDurationReader foregroundDurationReader) {
        this.foregroundDurationReader = foregroundDurationReader;
    }

    @Override // com.unity3d.ads.core.domain.GetSharedDataTimestamps
    public TimestampsOuterClass.Timestamps invoke() {
        TimestampsKt.Dsl _create = TimestampsKt.Dsl.Companion._create(TimestampsOuterClass.Timestamps.newBuilder());
        _create.setTimestamp(TimestampExtensionsKt.fromMillis(System.currentTimeMillis()));
        _create.setSessionTimestamp(SystemClock.elapsedRealtime() - SdkProperties.getInitializationTime());
        _create.setSessionDurationInForeground(this.foregroundDurationReader.getSessionDurationInForegroundMs());
        return _create._build();
    }
}
