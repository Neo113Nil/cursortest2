package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzk
/* loaded from: classes.dex */
public final class EnableBillingProgramParams {
    public final int a;
    public final DeveloperProvidedBillingListener b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public int a;
        public DeveloperProvidedBillingListener b;

        @NonNull
        public EnableBillingProgramParams build() {
            return new EnableBillingProgramParams(this);
        }

        @NonNull
        public Builder setBillingProgram(int i) {
            this.a = i;
            return this;
        }

        @NonNull
        public Builder setDeveloperProvidedBillingListener(@Nullable DeveloperProvidedBillingListener developerProvidedBillingListener) {
            this.b = developerProvidedBillingListener;
            return this;
        }
    }

    public /* synthetic */ EnableBillingProgramParams(Builder builder) {
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

    @Nullable
    public DeveloperProvidedBillingListener getDeveloperProvidedBillingListener() {
        return this.b;
    }
}
