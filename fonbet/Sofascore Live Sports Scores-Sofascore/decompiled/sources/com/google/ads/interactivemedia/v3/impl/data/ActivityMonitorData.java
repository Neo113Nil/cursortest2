package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_ActivityMonitorData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_ActivityMonitorData.class)
/* loaded from: classes2.dex */
public abstract class ActivityMonitorData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Builder {
        @NonNull
        Builder appState(@NonNull String str);

        @NonNull
        ActivityMonitorData build();

        @NonNull
        Builder eventId(@NonNull String str);

        @NonNull
        Builder nativeTime(long j);

        @NonNull
        Builder nativeViewBounds(@NonNull BoundingRectData boundingRectData);

        @NonNull
        Builder nativeViewHidden(boolean z);

        @NonNull
        Builder nativeViewVisibleBounds(@NonNull BoundingRectData boundingRectData);

        @NonNull
        Builder nativeVolume(double d);

        @NonNull
        Builder queryId(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ActivityMonitorData.Builder();
    }

    @NonNull
    public abstract String appState();

    @NonNull
    public abstract String eventId();

    public abstract long nativeTime();

    @NonNull
    public abstract BoundingRectData nativeViewBounds();

    public abstract boolean nativeViewHidden();

    @NonNull
    public abstract BoundingRectData nativeViewVisibleBounds();

    public abstract double nativeVolume();

    @NonNull
    public abstract String queryId();
}
