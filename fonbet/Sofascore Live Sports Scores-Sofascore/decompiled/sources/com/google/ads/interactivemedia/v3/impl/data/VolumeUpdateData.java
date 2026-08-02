package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_VolumeUpdateData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_VolumeUpdateData.class)
/* loaded from: classes2.dex */
public abstract class VolumeUpdateData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract VolumeUpdateData build();

        @NonNull
        public abstract Builder volume(float f);

        @NonNull
        public Builder volumePercentage(int i) {
            return volume(Math.min(Math.max(i, 0), 100) / 100.0f);
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_VolumeUpdateData.Builder();
    }

    public abstract float volume();
}
