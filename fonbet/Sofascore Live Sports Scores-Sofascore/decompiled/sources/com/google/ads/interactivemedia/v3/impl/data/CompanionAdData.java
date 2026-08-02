package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_CompanionAdData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_CompanionAdData.class)
/* loaded from: classes2.dex */
public abstract class CompanionAdData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract CompanionAdData build();

        @NonNull
        public abstract Builder setApiFramework(@NonNull String str);

        @NonNull
        public abstract Builder setResourceValue(@NonNull String str);

        @NonNull
        public abstract Builder setSize(@NonNull SizeData sizeData);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_CompanionAdData.Builder();
    }

    @Nullable
    public abstract String apiFramework();

    @Nullable
    public abstract String resourceValue();

    @Nullable
    public abstract SizeData size();
}
