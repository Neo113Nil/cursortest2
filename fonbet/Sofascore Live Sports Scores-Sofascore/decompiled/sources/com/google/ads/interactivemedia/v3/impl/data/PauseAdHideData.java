package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_PauseAdHideData.class)
/* loaded from: classes2.dex */
public abstract class PauseAdHideData {
    @NonNull
    public static PauseAdHideData create(@NonNull String str, double d) {
        return new AutoValue_PauseAdHideData(str, d);
    }

    public abstract double fadeDuration();

    @NonNull
    public abstract String pauseAdId();
}
