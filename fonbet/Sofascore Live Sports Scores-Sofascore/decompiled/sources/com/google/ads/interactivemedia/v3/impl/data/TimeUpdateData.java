package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.q1p;
import defpackage.rqk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_TimeUpdateData.class)
/* loaded from: classes2.dex */
public abstract class TimeUpdateData {
    private static final String DEFAULT_TIME_UNIT = "ms";

    @NonNull
    public static TimeUpdateData create(@NonNull rqk rqkVar) {
        return new AutoValue_TimeUpdateData(rqkVar.a, rqkVar.b, DEFAULT_TIME_UNIT);
    }

    public abstract long currentTime();

    public abstract long duration();

    @NonNull
    public abstract String timeUnit();
}
