package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_GestureSignalData;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_GestureSignalData.class)
/* loaded from: classes2.dex */
public abstract class GestureSignalData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Builder {
        @NonNull
        GestureSignalData build();

        @NonNull
        Builder gestureSignal(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_GestureSignalData.Builder();
    }

    @NonNull
    public abstract String gestureSignal();
}
