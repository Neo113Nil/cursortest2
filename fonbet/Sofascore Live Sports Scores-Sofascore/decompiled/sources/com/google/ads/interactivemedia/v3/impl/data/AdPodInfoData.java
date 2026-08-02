package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_AdPodInfoData;
import defpackage.q1p;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_AdPodInfoData.class)
/* loaded from: classes2.dex */
public abstract class AdPodInfoData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract AdPodInfoData build();

        @NonNull
        public abstract Builder setAdPosition(int i);

        @NonNull
        public abstract Builder setAdsDurationMs(@NonNull List<Long> list);

        @NonNull
        public abstract Builder setIsBumper(boolean z);

        @NonNull
        public abstract Builder setMaxDuration(double d);

        @NonNull
        public abstract Builder setPodIndex(@Nullable Integer num);

        @NonNull
        public abstract Builder setTimeOffset(@Nullable Double d);

        @NonNull
        public abstract Builder setTotalAds(int i);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AdPodInfoData.Builder();
    }

    @Nullable
    public abstract Integer adPosition();

    @Nullable
    public abstract List<Long> adsDurationMs();

    @Nullable
    public abstract Boolean isBumper();

    @Nullable
    public abstract Double maxDuration();

    @Nullable
    public abstract Integer podIndex();

    @Nullable
    public abstract Double timeOffset();

    @Nullable
    public abstract Integer totalAds();
}
