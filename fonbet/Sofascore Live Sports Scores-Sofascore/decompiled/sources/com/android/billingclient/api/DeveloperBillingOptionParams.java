package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a70;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class DeveloperBillingOptionParams {
    public final Uri a;
    public final int b;
    public final int c;
    public final String d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public Uri a;
        public int b;
        public int c;
        public String d;

        @NonNull
        public DeveloperBillingOptionParams build() {
            int i = this.c;
            if (i == 0) {
                a70.p("Billing program is required.");
                return null;
            }
            if (i == 5 && this.a != null && TextUtils.isEmpty(this.d)) {
                a70.p("External transaction token is required for billing choice with an external link.");
                return null;
            }
            Uri uri = this.a;
            if (uri == null || uri.getScheme() != null) {
                return new DeveloperBillingOptionParams(this);
            }
            a70.p("URI must have a scheme.");
            return null;
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.c = i;
            return this;
        }

        @NonNull
        @zze
        public Builder setExternalTransactionToken(@Nullable String str) {
            this.d = str;
            return this;
        }

        @NonNull
        public Builder setLaunchMode(int i) {
            this.b = i;
            return this;
        }

        @NonNull
        public Builder setLinkUri(@NonNull Uri uri) {
            this.a = uri;
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {
        public static final int CALLER_WILL_LAUNCH_LINK = 2;
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    public /* synthetic */ DeveloperBillingOptionParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.b = 0;
        builder.c = 0;
        return builder;
    }

    public int getBillingProgram() {
        return this.c;
    }

    @Nullable
    @zze
    public String getExternalTransactionToken() {
        return this.d;
    }

    public int getLaunchMode() {
        return this.b;
    }

    @Nullable
    public Uri getLinkUri() {
        return this.a;
    }
}
