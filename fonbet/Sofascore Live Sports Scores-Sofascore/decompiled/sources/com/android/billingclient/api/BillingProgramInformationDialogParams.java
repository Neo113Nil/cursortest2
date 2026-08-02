package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zze
/* loaded from: classes.dex */
public final class BillingProgramInformationDialogParams {
    public final int a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public int a;
        public String b;

        @NonNull
        public BillingProgramInformationDialogParams build() {
            int i = this.a;
            if (i == 0) {
                a70.p("Billing program must be set.");
                return null;
            }
            if (i != 5) {
                a70.p("The requested billing program is not supported for the billing program information dialog API.");
                return null;
            }
            if (this.b != null) {
                return new BillingProgramInformationDialogParams(this);
            }
            a70.p("External transaction token must be set.");
            return null;
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.a = i;
            return this;
        }

        @NonNull
        public Builder setExternalTransactionToken(@NonNull String str) {
            this.b = str;
            return this;
        }
    }

    public BillingProgramInformationDialogParams(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public int getBillingProgram() {
        return this.a;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.b;
    }
}
