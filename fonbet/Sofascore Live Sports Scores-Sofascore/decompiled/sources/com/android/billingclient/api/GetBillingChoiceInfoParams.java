package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a70;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zze
/* loaded from: classes.dex */
public final class GetBillingChoiceInfoParams {
    public final Locale a;
    public final int b;
    public final String c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public Locale a;
        public int b;
        public String c;

        @NonNull
        public GetBillingChoiceInfoParams build() {
            if (this.b != 5) {
                a70.p("Only billing choice is allowed for this API.");
                return null;
            }
            if (this.c != null) {
                return new GetBillingChoiceInfoParams(this);
            }
            a70.p("Play Billing choice image layout is required.");
            return null;
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.b = i;
            return this;
        }

        @NonNull
        public Builder setPlayBillingChoiceImageLayout(@NonNull String str) {
            this.c = str;
            return this;
        }

        @NonNull
        public Builder setUserLocale(@Nullable Locale locale) {
            this.a = locale;
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageLayout {

        @NonNull
        public static final String RECTANGULAR_FOUR_BY_ONE = "RECTANGULAR_FOUR_BY_ONE";

        @NonNull
        public static final String RECTANGULAR_THREE_BY_ONE = "RECTANGULAR_THREE_BY_ONE";

        @NonNull
        public static final String RECTANGULAR_TWO_BY_TWO = "RECTANGULAR_TWO_BY_TWO";
    }

    public GetBillingChoiceInfoParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.b = 0;
        return builder;
    }

    public int getBillingProgram() {
        return this.b;
    }

    @NonNull
    public String getPlayBillingChoiceImageLayout() {
        return this.c;
    }

    @Nullable
    public Locale getUserLocale() {
        return this.a;
    }
}
