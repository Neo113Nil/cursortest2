package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_EventTimestampMetadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class EventTimestampMetadata {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Builder {
        @NonNull
        Builder androidVersion(@NonNull String str);

        @NonNull
        EventTimestampMetadata build();

        @NonNull
        Builder manufacturer(@NonNull String str);

        @NonNull
        Builder model(@NonNull String str);

        @NonNull
        Builder requestCounter(int i);

        @NonNull
        Builder sdkVersion(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_EventTimestampMetadata.Builder();
    }

    @NonNull
    public abstract String androidVersion();

    @NonNull
    public abstract String manufacturer();

    @NonNull
    public abstract String model();

    public abstract int requestCounter();

    @NonNull
    public abstract String sdkVersion();
}
