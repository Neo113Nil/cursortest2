package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class BillingProgramAvailabilityDetails {
    public final int a;
    public final BillingChoiceAvailabilityDetails b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zze
    public static final class BillingChoiceAvailabilityDetails {
        public final int a;
        public final boolean b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zze
        @Retention(RetentionPolicy.SOURCE)
        public @interface ChoiceScreenType {
            public static final int DEVELOPER_RENDERED = 1;
            public static final int GOOGLE_RENDERED = 2;
            public static final int UNSPECIFIED = 0;
        }

        public BillingChoiceAvailabilityDetails(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingChoiceAvailabilityDetails)) {
                return false;
            }
            BillingChoiceAvailabilityDetails billingChoiceAvailabilityDetails = (BillingChoiceAvailabilityDetails) obj;
            return this.a == billingChoiceAvailabilityDetails.a && this.b == billingChoiceAvailabilityDetails.b;
        }

        public int getChoiceScreenType() {
            return this.a;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b));
        }

        public boolean isExternalLinkAvailable() {
            return this.b;
        }
    }

    public BillingProgramAvailabilityDetails(int i) {
        this.a = i;
        this.b = null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingProgramAvailabilityDetails)) {
            return false;
        }
        BillingProgramAvailabilityDetails billingProgramAvailabilityDetails = (BillingProgramAvailabilityDetails) obj;
        return this.a == billingProgramAvailabilityDetails.a && Objects.equals(this.b, billingProgramAvailabilityDetails.b);
    }

    @Nullable
    @zze
    public BillingChoiceAvailabilityDetails getBillingChoiceAvailabilityDetails() {
        return this.b;
    }

    public int getBillingProgram() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public BillingProgramAvailabilityDetails(BillingChoiceAvailabilityDetails billingChoiceAvailabilityDetails) {
        this.a = 5;
        this.b = billingChoiceAvailabilityDetails;
    }
}
