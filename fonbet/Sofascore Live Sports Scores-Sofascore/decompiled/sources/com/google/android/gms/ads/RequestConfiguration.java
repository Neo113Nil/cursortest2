package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class RequestConfiguration {

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_G = "G";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_T = "T";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;

    @Deprecated
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    public final AgeRestrictedTreatment a;
    public final int b;
    public final int c;
    public final String d;
    public final List e;
    public final PublisherPrivacyPersonalizationState f;

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";

    @NonNull
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";

    @NonNull
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, "T", MAX_AD_CONTENT_RATING_PG, "G");

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public AgeRestrictedTreatment a = null;
        public int b = -1;
        public int c = -1;
        public String d = null;
        public final ArrayList e = new ArrayList();
        public PublisherPrivacyPersonalizationState f = PublisherPrivacyPersonalizationState.DEFAULT;

        @NonNull
        public RequestConfiguration build() {
            return new RequestConfiguration(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @NonNull
        public Builder setAgeRestrictedTreatment(AgeRestrictedTreatment ageRestrictedTreatment) {
            this.a = ageRestrictedTreatment;
            return this;
        }

        @NonNull
        public Builder setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.d = null;
                return this;
            }
            if ("G".equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) || "T".equals(str) || RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.d = str;
                return this;
            }
            zzo.zzi("Invalid value passed to setMaxAdContentRating: ".concat(str));
            return this;
        }

        @NonNull
        public Builder setPublisherPrivacyPersonalizationState(@NonNull PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
            this.f = publisherPrivacyPersonalizationState;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForChildDirectedTreatment(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.b = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
            sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
            sb.append(i);
            zzo.zzi(sb.toString());
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setTagForUnderAgeOfConsent(int i) {
            if (i == -1 || i == 0 || i == 1) {
                this.c = i;
                return this;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 52);
            sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
            sb.append(i);
            zzo.zzi(sb.toString());
            return this;
        }

        @NonNull
        public Builder setTestDeviceIds(List<String> list) {
            ArrayList arrayList = this.e;
            arrayList.clear();
            if (list != null) {
                arrayList.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        public final int a;

        PublisherPrivacyPersonalizationState(int i) {
            this.a = i;
        }

        public int getValue() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(AgeRestrictedTreatment ageRestrictedTreatment, int i, int i2, String str, ArrayList arrayList, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.a = ageRestrictedTreatment;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = arrayList;
        this.f = publisherPrivacyPersonalizationState;
    }

    @NonNull
    public AgeRestrictedTreatment getAgeRestrictedTreatment() {
        AgeRestrictedTreatment ageRestrictedTreatment = this.a;
        return ageRestrictedTreatment == null ? AgeRestrictedTreatment.UNSPECIFIED : ageRestrictedTreatment;
    }

    @NonNull
    public String getMaxAdContentRating() {
        String str = this.d;
        return str == null ? "" : str;
    }

    @NonNull
    public PublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState() {
        return this.f;
    }

    @Deprecated
    public int getTagForChildDirectedTreatment() {
        return this.b;
    }

    @Deprecated
    public int getTagForUnderAgeOfConsent() {
        return this.c;
    }

    @NonNull
    public List<String> getTestDeviceIds() {
        return new ArrayList(this.e);
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setAgeRestrictedTreatment(this.a);
        builder.setTagForChildDirectedTreatment(this.b);
        builder.setTagForUnderAgeOfConsent(this.c);
        builder.setMaxAdContentRating(this.d);
        builder.setTestDeviceIds(this.e);
        builder.setPublisherPrivacyPersonalizationState(this.f);
        return builder;
    }

    @Nullable
    public final AgeRestrictedTreatment zza() {
        return this.a;
    }
}
