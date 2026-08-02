package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_IdentifierInfo.class)
/* loaded from: classes2.dex */
public abstract class IdentifierInfo {
    @NonNull
    public static IdentifierInfo create(@Nullable String str, @NonNull String str2, boolean z, @NonNull String str3, int i, @NonNull String str4) {
        return new AutoValue_IdentifierInfo(str, str2, z, str3, i, str4);
    }

    @NonNull
    public abstract String adsIdentityToken();

    @NonNull
    public abstract String appSetId();

    public abstract int appSetIdScope();

    @Nullable
    public abstract String deviceId();

    @NonNull
    public abstract String idType();

    public abstract boolean isLimitedAdTracking();
}
