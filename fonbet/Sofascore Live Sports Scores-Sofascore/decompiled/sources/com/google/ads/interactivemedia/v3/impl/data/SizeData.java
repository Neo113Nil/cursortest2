package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_SizeData.class)
/* loaded from: classes2.dex */
public abstract class SizeData {
    @NonNull
    public static SizeData create(@NonNull Integer num, @NonNull Integer num2) {
        return new AutoValue_SizeData(num, num2);
    }

    @NonNull
    public abstract Integer height();

    @NonNull
    public abstract Integer width();
}
