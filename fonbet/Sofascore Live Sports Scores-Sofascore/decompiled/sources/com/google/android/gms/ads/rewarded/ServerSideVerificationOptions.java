package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ServerSideVerificationOptions {
    public final String a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public String a = "";
        public String b = "";

        @NonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }

        @NonNull
        public Builder setCustomData(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public Builder setUserId(@NonNull String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ ServerSideVerificationOptions(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @NonNull
    public String getCustomData() {
        return this.b;
    }

    @NonNull
    public String getUserId() {
        return this.a;
    }
}
