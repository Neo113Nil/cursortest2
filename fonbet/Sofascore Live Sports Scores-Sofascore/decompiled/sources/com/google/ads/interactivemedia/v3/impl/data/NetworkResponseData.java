package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import defpackage.q1p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_NetworkResponseData.class)
/* loaded from: classes2.dex */
public abstract class NetworkResponseData {

    @NonNull
    public static final String UNKNOWN_CONTENT_TYPE = "unknown";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int API_NOT_AVAILABLE = 102;
        public static final int NETWORK_TIMEOUT = 101;
        public static final int NO_ERROR = 0;
        public static final int UNKNOWN_ERROR = 100;
    }

    private static NetworkResponseData create(String str, String str2, String str3, int i) {
        return new AutoValue_NetworkResponseData(str, str2, str3, i);
    }

    @NonNull
    public static NetworkResponseData forError(@NonNull String str, int i) {
        return create(str, "", "unknown", i);
    }

    @NonNull
    public static NetworkResponseData forResponse(@NonNull String str, @NonNull String str2) {
        return forResponse(str, str2, "unknown");
    }

    @NonNull
    public abstract String content();

    @NonNull
    public abstract String contentType();

    public abstract int errorCode();

    @NonNull
    public abstract String id();

    @NonNull
    public static NetworkResponseData forResponse(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return create(str, str2, str3, 0);
    }
}
