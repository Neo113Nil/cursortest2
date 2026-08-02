package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_UniversalAdIdData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_UniversalAdIdData.class)
/* loaded from: classes2.dex */
public abstract class UniversalAdIdData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract UniversalAdIdData build();

        @NonNull
        public abstract Builder setAdIdRegistry(@NonNull String str);

        @NonNull
        public abstract Builder setAdIdValue(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_UniversalAdIdData.Builder();
    }

    @Nullable
    public abstract String adIdRegistry();

    @Nullable
    public abstract String adIdValue();
}
