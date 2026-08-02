package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.a70;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class BillingProgramReportingDetailsParams {
    public final int a;
    public final int b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public int a;
        public int b;

        @NonNull
        public BillingProgramReportingDetailsParams build() {
            int i = this.a;
            if (i == 0) {
                a70.p("Billing program is not specified.");
                return null;
            }
            if (i != 5 || this.b != 0) {
                return new BillingProgramReportingDetailsParams(this);
            }
            a70.p("Developer billing type must be specified for billing choice.");
            return null;
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.a = i;
            return this;
        }

        @NonNull
        @zze
        public Builder setDeveloperBillingType(int i) {
            this.b = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zze
    @Retention(RetentionPolicy.SOURCE)
    public @interface DeveloperBillingType {
        public static final int DEVELOPER_BILLING_TYPE_UNSPECIFIED = 0;
        public static final int EXTERNAL_LINK = 2;
        public static final int IN_APP = 1;
    }

    public /* synthetic */ BillingProgramReportingDetailsParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @NonNull
    public static Builder newBuilder() {
        Builder builder = new Builder();
        builder.a = 0;
        builder.b = 0;
        return builder;
    }

    public int getBillingProgram() {
        return this.a;
    }

    @zze
    public int getDeveloperBillingType() {
        return this.b;
    }
}
