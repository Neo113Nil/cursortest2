package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_NetworkRequestData.class)
/* loaded from: classes2.dex */
public abstract class NetworkRequestData {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum RequestType {
        GET,
        POST
    }

    @NonNull
    public static NetworkRequestData create(@NonNull RequestType requestType, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, int i, int i2) {
        return new AutoValue_NetworkRequestData(requestType, str, str2, str4, str3, i, i2);
    }

    public abstract int connectionTimeoutMs();

    @Nullable
    public abstract String content();

    @NonNull
    public abstract String id();

    public abstract int readTimeoutMs();

    @NonNull
    public abstract RequestType requestType();

    @NonNull
    public abstract String url();

    @NonNull
    public abstract String userAgent();
}
