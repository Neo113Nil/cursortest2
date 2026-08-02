package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q1p;
import defpackage.vf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_InstrumentationData.class)
/* loaded from: classes2.dex */
public abstract class InstrumentationData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum Component {
        ADS_LOADER,
        IDENTITY_MANAGER,
        NATIVE_ESP,
        PLATFORM_SIGNAL_COLLECTOR,
        ADS_IDENTITY_TOKEN_LOADER,
        SPAM_MS_PARAMETER_LOADER,
        LATENCY_MEASUREMENT_TRACKER,
        IDENTIFIER_INFO_FACTORY
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum Method {
        CREATE_SDK_OWNED_PLAYER,
        REQUEST_ADS,
        REQUEST_STREAM,
        PLATFORM_COLLECT_SIGNALS,
        COLLECT_SIGNALS,
        INIT,
        LOAD_ADAPTER,
        GET_ADSIDENTITY_TOKEN,
        GET_CONSENT_SETTINGS,
        SETUP_AD_SHIELD,
        GET_SPAM_MS_PARAMETER,
        GET_SPAM_MS_PARAMETER_FROM_ADSHIELD,
        FLUSH_LATENCY_MEASUREMENT,
        SAFE_BLOCKING_GET_IDLESS,
        GET_IDLESS_STATE
    }

    @NonNull
    public static InstrumentationData create(long j, @NonNull Component component, @NonNull Method method, @NonNull Throwable th, @NonNull String str) {
        return create(j, component, method, null, LoggableException.create(th), str);
    }

    @NonNull
    public static InstrumentationData createForLatencyMeasurement(long j, @NonNull Component component, @NonNull Method method, @NonNull String str) {
        return new AutoValue_InstrumentationData(j, component, method, null, null, str, null);
    }

    @Nullable
    public abstract vf adErrorEvent();

    @Nullable
    public abstract String androidDeviceInfoProtoBase64String();

    @Nullable
    public abstract Component component();

    @Nullable
    public abstract String latencyMeasurementProtoBase64String();

    @Nullable
    public abstract LoggableException loggableException();

    @Nullable
    public abstract Method method();

    public abstract long timestamp();

    private static InstrumentationData create(long j, Component component, Method method, vf vfVar, LoggableException loggableException, String str) {
        return new AutoValue_InstrumentationData(j, component, method, vfVar, loggableException, null, str);
    }

    @NonNull
    public static InstrumentationData create(long j, @NonNull Component component, @NonNull Method method, @NonNull String str) {
        return create(j, component, method, null, null, str);
    }

    @NonNull
    public static InstrumentationData create(long j, @NonNull vf vfVar, @NonNull String str) {
        return create(j, null, null, vfVar, null, str);
    }
}
