package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a70;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzn
/* loaded from: classes.dex */
public final class LaunchExternalLinkParams {
    public final Uri a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzn
    public static final class Builder {
        public Uri a;
        public int b;
        public int c;
        public int d;
        public String e;

        @NonNull
        @zzn
        public LaunchExternalLinkParams build() {
            int i = this.c;
            if (i == 0) {
                a70.p("Link type is required.");
                return null;
            }
            int i2 = this.b;
            if (i2 == 0) {
                a70.p("Launch mode is required.");
                return null;
            }
            if (i2 != 1 && i == 2) {
                a70.p("App downloads must launch in an external browser or app.");
                return null;
            }
            int i3 = this.d;
            if (i3 == 0) {
                a70.p("Billing program is required.");
                return null;
            }
            if (i3 == 5) {
                if (TextUtils.isEmpty(this.e)) {
                    a70.p("External transaction token is required for billing choice with an external link.");
                    return null;
                }
                if (this.c != 1) {
                    a70.p("Link type must be LINK_TO_DIGITAL_CONTENT_OFFER for billing choice with an external link.");
                    return null;
                }
            }
            Uri uri = this.a;
            if (uri == null) {
                a70.p("URI must be set.");
                return null;
            }
            if (uri.getScheme() != null) {
                return new LaunchExternalLinkParams(this);
            }
            a70.p("URI must have a scheme.");
            return null;
        }

        @NonNull
        @zzn
        public Builder setBillingProgram(int i) {
            this.d = i;
            return this;
        }

        @NonNull
        @zze
        public Builder setExternalTransactionToken(@NonNull String str) {
            this.e = str;
            return this;
        }

        @NonNull
        @zzn
        public Builder setLaunchMode(int i) {
            this.b = i;
            return this;
        }

        @NonNull
        @zzn
        public Builder setLinkType(int i) {
            this.c = i;
            return this;
        }

        @NonNull
        @zzn
        public Builder setLinkUri(@NonNull Uri uri) {
            this.a = uri;
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzn
    @Retention(RetentionPolicy.SOURCE)
    public @interface LaunchMode {

        @zzn
        public static final int CALLER_WILL_LAUNCH_LINK = 2;

        @zzn
        public static final int LAUNCH_IN_EXTERNAL_BROWSER_OR_APP = 1;

        @zzn
        public static final int LAUNCH_MODE_UNSPECIFIED = 0;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzn
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkType {

        @zzo
        public static final int LINK_TO_APP_DOWNLOAD = 2;

        @zzn
        public static final int LINK_TO_DIGITAL_CONTENT_OFFER = 1;

        @zzn
        public static final int LINK_TYPE_UNSPECIFIED = 0;
    }

    public /* synthetic */ LaunchExternalLinkParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
    }

    @NonNull
    @zzn
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.b = 0;
        builder.c = 0;
        builder.d = 0;
        return builder;
    }

    @zzn
    public int getBillingProgram() {
        return this.d;
    }

    @Nullable
    @zze
    public String getExternalTransactionToken() {
        return this.e;
    }

    @zzn
    public int getLaunchMode() {
        return this.b;
    }

    @zzn
    public int getLinkType() {
        return this.c;
    }

    @NonNull
    @zzn
    public Uri getLinkUri() {
        return this.a;
    }
}
