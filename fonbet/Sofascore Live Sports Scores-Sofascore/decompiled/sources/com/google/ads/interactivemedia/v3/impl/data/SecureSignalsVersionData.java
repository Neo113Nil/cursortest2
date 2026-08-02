package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.iok;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_SecureSignalsVersionData.class)
/* loaded from: classes2.dex */
public abstract class SecureSignalsVersionData {
    @NonNull
    public static SecureSignalsVersionData create(int i, int i2, int i3) {
        return new AutoValue_SecureSignalsVersionData(i, i2, i3);
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();

    @NonNull
    public static SecureSignalsVersionData create(@NonNull iok iokVar) {
        throw null;
    }
}
