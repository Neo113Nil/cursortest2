package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_JavaScriptMsgDataWebViewCompat;
import defpackage.q1p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_JavaScriptMsgDataWebViewCompat.class)
/* loaded from: classes2.dex */
public abstract class JavaScriptMsgDataWebViewCompat {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Builder {
        @NonNull
        public abstract JavaScriptMsgDataWebViewCompat build();

        @NonNull
        public abstract Builder setData(@NonNull String str);

        @NonNull
        public abstract Builder setId(@NonNull String str);

        @NonNull
        public abstract Builder setName(@NonNull String str);

        @NonNull
        public abstract Builder setSid(@NonNull String str);

        @NonNull
        public abstract Builder setType(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_JavaScriptMsgDataWebViewCompat.Builder();
    }

    @NonNull
    public abstract String data();

    @NonNull
    public abstract String id();

    @NonNull
    public abstract String name();

    @NonNull
    public abstract String sid();

    @NonNull
    public abstract String type();
}
