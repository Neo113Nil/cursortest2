package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_AdData;
import defpackage.e9k;
import defpackage.q1p;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_AdData.class)
/* loaded from: classes2.dex */
public abstract class AdData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract AdData build();

        @NonNull
        public abstract Builder setAdId(@NonNull String str);

        @NonNull
        public abstract Builder setAdPodInfo(@NonNull AdPodInfoData adPodInfoData);

        @NonNull
        public abstract Builder setAdSystem(@NonNull String str);

        @NonNull
        public abstract Builder setAdWrapperCreativeIds(@NonNull List<String> list);

        @NonNull
        public abstract Builder setAdWrapperIds(@NonNull List<String> list);

        @NonNull
        public abstract Builder setAdWrapperSystems(@NonNull List<String> list);

        @NonNull
        public abstract Builder setAdvertiserName(@NonNull String str);

        @NonNull
        public abstract Builder setClickThroughUrl(@NonNull String str);

        @NonNull
        public abstract Builder setCompanions(@NonNull List<CompanionAdData> list);

        @NonNull
        public abstract Builder setContentType(@NonNull String str);

        @NonNull
        public abstract Builder setCreativeAdId(@NonNull String str);

        @NonNull
        public abstract Builder setCreativeId(@NonNull String str);

        @NonNull
        public abstract Builder setDealId(@NonNull String str);

        @NonNull
        public abstract Builder setDescription(@NonNull String str);

        @NonNull
        public abstract Builder setDisableUi(@NonNull Boolean bool);

        @NonNull
        public abstract Builder setDuration(@NonNull Double d);

        @NonNull
        public abstract Builder setHeight(@NonNull Integer num);

        @NonNull
        public abstract Builder setLinear(@NonNull Boolean bool);

        @NonNull
        public abstract Builder setSkipTimeOffset(@NonNull Double d);

        @NonNull
        public abstract Builder setSkippable(@NonNull Boolean bool);

        @NonNull
        public abstract Builder setSurveyUrl(@NonNull String str);

        @NonNull
        public abstract Builder setTitle(@NonNull String str);

        @NonNull
        public abstract Builder setTraffickingParameters(@NonNull String str);

        @NonNull
        public abstract Builder setUiElements(@NonNull Set<e9k> set);

        @NonNull
        public abstract Builder setUniversalAdIds(@NonNull List<UniversalAdIdData> list);

        @NonNull
        public abstract Builder setVastMediaBitrate(@NonNull Integer num);

        @NonNull
        public abstract Builder setVastMediaHeight(@NonNull Integer num);

        @NonNull
        public abstract Builder setVastMediaWidth(@NonNull Integer num);

        @NonNull
        public abstract Builder setWidth(@NonNull Integer num);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AdData.Builder();
    }

    @Nullable
    public abstract String adId();

    @Nullable
    public abstract AdPodInfoData adPodInfo();

    @Nullable
    public abstract String adSystem();

    @Nullable
    public abstract List<String> adWrapperCreativeIds();

    @Nullable
    public abstract List<String> adWrapperIds();

    @Nullable
    public abstract List<String> adWrapperSystems();

    @Nullable
    public abstract String advertiserName();

    @Nullable
    public abstract String clickThroughUrl();

    @Nullable
    public abstract List<CompanionAdData> companions();

    @Nullable
    public abstract String contentType();

    @Nullable
    public abstract String creativeAdId();

    @Nullable
    public abstract String creativeId();

    @Nullable
    public abstract String dealId();

    @Nullable
    public abstract String description();

    @Nullable
    public abstract Boolean disableUi();

    @Nullable
    public abstract Double duration();

    @Nullable
    public abstract Integer height();

    @Nullable
    public abstract Boolean linear();

    @Nullable
    public abstract Double skipTimeOffset();

    @Nullable
    public abstract Boolean skippable();

    @Nullable
    public abstract String surveyUrl();

    @Nullable
    public abstract String title();

    @Nullable
    public abstract String traffickingParameters();

    @Nullable
    public abstract Set<e9k> uiElements();

    @Nullable
    public abstract List<UniversalAdIdData> universalAdIds();

    @Nullable
    public abstract Integer vastMediaBitrate();

    @Nullable
    public abstract Integer vastMediaHeight();

    @Nullable
    public abstract Integer vastMediaWidth();

    @Nullable
    public abstract Integer width();
}
