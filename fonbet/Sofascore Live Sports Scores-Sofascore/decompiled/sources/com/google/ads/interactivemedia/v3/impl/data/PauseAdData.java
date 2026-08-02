package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AdViewData;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_PauseAdData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_PauseAdData.class)
/* loaded from: classes2.dex */
public abstract class PauseAdData {
    private String pauseAdId = "";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        private String pauseAdId = "";

        public abstract PauseAdData autoBuild();

        @NonNull
        public PauseAdData build() {
            PauseAdData autoBuild = autoBuild();
            autoBuild.zza(this.pauseAdId);
            return autoBuild;
        }

        @NonNull
        public abstract Builder setClickThroughUrl(@NonNull String str);

        @NonNull
        public abstract Builder setFadeDuration(double d);

        @NonNull
        public abstract Builder setHeight(int i);

        @NonNull
        public Builder setPauseAdId(@NonNull String str) {
            this.pauseAdId = str;
            return this;
        }

        @NonNull
        public abstract Builder setScaleTolerance(double d);

        @NonNull
        public abstract Builder setSrc(@NonNull String str);

        @NonNull
        public abstract Builder setType(@NonNull AdViewData.Type type);

        @NonNull
        public abstract Builder setUseMask(boolean z);

        @NonNull
        public abstract Builder setWidth(int i);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_PauseAdData.Builder();
    }

    @NonNull
    public abstract String clickThroughUrl();

    public abstract double fadeDuration();

    public abstract int height();

    @NonNull
    public String pauseAdId() {
        return this.pauseAdId;
    }

    public abstract double scaleTolerance();

    @NonNull
    public abstract String src();

    @Nullable
    public abstract AdViewData.Type type();

    public abstract boolean useMask();

    public abstract int width();

    public final /* synthetic */ void zza(String str) {
        this.pauseAdId = str;
    }
}
