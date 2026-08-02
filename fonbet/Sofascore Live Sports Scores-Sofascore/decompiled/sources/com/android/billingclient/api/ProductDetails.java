package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.bf3;
import defpackage.fc6;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ProductDetails {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final ArrayList j;
    public final ArrayList k;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzm
    public static final class InstallmentPlanDetails {
        public final int a;
        public final int b;

        public InstallmentPlanDetails(JSONObject jSONObject) {
            this.a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzm
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.a;
        }

        @zzm
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.b;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class OneTimePurchaseOfferDetails {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final ArrayList g;
        public final Long h;
        public final DiscountDisplayInfo i;
        public final ValidTimeWindow j;
        public final LimitedQuantityInfo k;
        public final String l;
        public final PreorderDetails m;
        public final RentalDetails n;
        public final zzec o;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zzq
        public static final class DiscountDisplayInfo {
            public final Integer a;
            public final DiscountAmount b;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            @zzq
            public static final class DiscountAmount {
                public final String a;
                public final long b;
                public final String c;

                public DiscountAmount(JSONObject jSONObject) {
                    this.a = jSONObject.optString("formattedDiscountAmount");
                    this.b = jSONObject.optLong("discountAmountMicros");
                    this.c = jSONObject.optString("discountAmountCurrencyCode");
                }

                @NonNull
                public String getDiscountAmountCurrencyCode() {
                    return this.c;
                }

                public long getDiscountAmountMicros() {
                    return this.b;
                }

                @NonNull
                public String getFormattedDiscountAmount() {
                    return this.a;
                }
            }

            public DiscountDisplayInfo(JSONObject jSONObject) {
                this.a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject optJSONObject = jSONObject.optJSONObject("discountAmount");
                this.b = optJSONObject != null ? new DiscountAmount(optJSONObject) : null;
            }

            @Nullable
            @zzq
            public DiscountAmount getDiscountAmount() {
                return this.b;
            }

            @Nullable
            @zzq
            public Integer getPercentageDiscount() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zzq
        public static final class LimitedQuantityInfo {
            public final int a;
            public final int b;

            public LimitedQuantityInfo(JSONObject jSONObject) {
                this.a = jSONObject.getInt("maximumQuantity");
                this.b = jSONObject.getInt("remainingQuantity");
            }

            @zzq
            public int getMaximumQuantity() {
                return this.a;
            }

            @zzq
            public int getRemainingQuantity() {
                return this.b;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zzr
        public static final class PreorderDetails {
            public final long a;
            public final long b;

            public PreorderDetails(JSONObject jSONObject) {
                this.a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }

            @zzr
            public long getPreorderPresaleEndTimeMillis() {
                return this.b;
            }

            @zzr
            public long getPreorderReleaseTimeMillis() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zzs
        public static final class RentalDetails {
            public final String a;
            public final String b;

            public RentalDetails(JSONObject jSONObject) {
                this.a = jSONObject.getString("rentalPeriod");
                String optString = jSONObject.optString("rentalExpirationPeriod");
                this.b = true == optString.isEmpty() ? null : optString;
            }

            @Nullable
            @zzs
            public String getRentalExpirationPeriod() {
                return this.b;
            }

            @NonNull
            @zzs
            public String getRentalPeriod() {
                return this.a;
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @zzq
        public static final class ValidTimeWindow {
            public final Long a;
            public final Long b;

            public ValidTimeWindow(JSONObject jSONObject) {
                this.a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            @Nullable
            @zzq
            public Long getEndTimeMillis() {
                return this.b;
            }

            @Nullable
            @zzq
            public Long getStartTimeMillis() {
                return this.a;
            }
        }

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) {
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.c = jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            zzec zzecVar = null;
            this.d = true == optString.isEmpty() ? null : optString;
            String optString2 = jSONObject.optString("offerId");
            this.e = true == optString2.isEmpty() ? null : optString2;
            String optString3 = jSONObject.optString("purchaseOptionId");
            this.f = true == optString3.isEmpty() ? null : optString3;
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            this.g = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.g.add(optJSONArray.getString(i));
                }
            }
            this.h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.i = optJSONObject == null ? null : new DiscountDisplayInfo(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.j = optJSONObject2 == null ? null : new ValidTimeWindow(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.k = optJSONObject3 == null ? null : new LimitedQuantityInfo(optJSONObject3);
            this.l = jSONObject.optString("serializedDocid");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.m = optJSONObject4 == null ? null : new PreorderDetails(optJSONObject4);
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.n = optJSONObject5 == null ? null : new RentalDetails(optJSONObject5);
            JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            if (optJSONObject6 != null) {
                zzecVar = new zzec();
                optJSONObject6.getString("type");
            }
            this.o = zzecVar;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (optJSONArray2 == null) {
                return;
            }
            new PricingPhases(optJSONArray2);
        }

        @Nullable
        @zzq
        public DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.i;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.a;
        }

        @Nullable
        @zzq
        public Long getFullPriceMicros() {
            return this.h;
        }

        @Nullable
        @zzq
        public LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.k;
        }

        @Nullable
        @zzs
        @zzq
        public String getOfferId() {
            return this.e;
        }

        @Nullable
        @zzq
        public List<String> getOfferTags() {
            return this.g;
        }

        @Nullable
        @zzs
        @zzq
        public String getOfferToken() {
            return this.d;
        }

        @Nullable
        @zzr
        public PreorderDetails getPreorderDetails() {
            return this.m;
        }

        public long getPriceAmountMicros() {
            return this.b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.c;
        }

        @Nullable
        @zzs
        public String getPurchaseOptionId() {
            return this.f;
        }

        @Nullable
        @zzs
        public RentalDetails getRentalDetails() {
            return this.n;
        }

        @Nullable
        @zzq
        public ValidTimeWindow getValidTimeWindow() {
            return this.j;
        }

        @Nullable
        public final zzec zza() {
            return this.o;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class PricingPhase {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;

        public PricingPhase(JSONObject jSONObject) {
            this.d = jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f = jSONObject.optInt("recurrenceMode");
            this.e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.e;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.d;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.a;
        }

        public long getPriceAmountMicros() {
            return this.b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.c;
        }

        public int getRecurrenceMode() {
            return this.f;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class PricingPhases {
        public final ArrayList a;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new PricingPhase(optJSONObject));
                    }
                }
            }
            this.a = arrayList;
        }

        @NonNull
        public List<PricingPhase> getPricingPhaseList() {
            return this.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class SubscriptionOfferDetails {
        public final String a;
        public final String b;
        public final String c;
        public final PricingPhases d;
        public final ArrayList e;
        public final InstallmentPlanDetails f;

        public SubscriptionOfferDetails(JSONObject jSONObject) {
            this.a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.b = true == optString.isEmpty() ? null : optString;
            this.c = jSONObject.getString("offerIdToken");
            this.d = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f = optJSONObject != null ? new InstallmentPlanDetails(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                optJSONObject2.optString("title");
                optJSONObject2.optString("name");
                optJSONObject2.optString("description");
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    new PricingPhase(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.e = arrayList;
        }

        @NonNull
        public String getBasePlanId() {
            return this.a;
        }

        @Nullable
        @zzm
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f;
        }

        @Nullable
        public String getOfferId() {
            return this.b;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.e;
        }

        @NonNull
        public String getOfferToken() {
            return this.c;
        }

        @NonNull
        public PricingPhases getPricingPhases() {
            return this.d;
        }
    }

    public ProductDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            a70.p("Product id cannot be empty.");
            throw null;
        }
        if (TextUtils.isEmpty(optString2)) {
            a70.p("Product type cannot be empty.");
            throw null;
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.h = jSONObject.optString("skuDetailsToken");
        this.i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new SubscriptionOfferDetails(optJSONArray.getJSONObject(i)));
            }
            this.j = arrayList;
        } else {
            this.j = (optString2.equals(BillingClient.ProductType.SUBS) || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(optJSONArray2.getJSONObject(i2)));
            }
            this.k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.k = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(optJSONObject));
            this.k = arrayList2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.a, ((ProductDetails) obj).a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.g;
    }

    @NonNull
    public String getName() {
        return this.f;
    }

    @Nullable
    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        ArrayList arrayList = this.k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) arrayList.get(0);
    }

    @Nullable
    @zzs
    @zzq
    public List<OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetailsList() {
        return this.k;
    }

    @NonNull
    public String getProductId() {
        return this.c;
    }

    @NonNull
    public String getProductType() {
        return this.d;
    }

    @Nullable
    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.j;
    }

    @NonNull
    public String getTitle() {
        return this.e;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.j);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        bf3.v(sb, this.a, "', parsedJson=", obj, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        return fc6.o(sb, this.h, "', subscriptionOfferDetails=", valueOf, "}");
    }

    @NonNull
    public final String zza() {
        return this.b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }
}
