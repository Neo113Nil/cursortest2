package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_VideoEnvironmentData.class)
/* loaded from: classes2.dex */
public abstract class VideoEnvironmentData {
    @NonNull
    public static VideoEnvironmentData create(@Nullable Integer num, boolean z) {
        return new AutoValue_VideoEnvironmentData(num, z);
    }

    @Nullable
    public abstract Integer downloadBandwidthKbps();

    public abstract boolean rendersUiNatively();
}
