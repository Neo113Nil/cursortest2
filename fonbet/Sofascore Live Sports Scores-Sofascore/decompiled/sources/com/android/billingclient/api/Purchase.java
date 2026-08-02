package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzcf;
import com.sofascore.model.mvvm.model.StatusKt;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Purchase {
    public final String a;
    public final String b;
    public final JSONObject c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @zzt
    public static final class PendingPurchaseUpdate {
        public final JSONObject a;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @NonNull
        public List<String> getProducts() {
            JSONArray optJSONArray;
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = this.a;
            if (jSONObject.has("productIds") && (optJSONArray = jSONObject.optJSONArray("productIds")) != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
            return arrayList;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.a.optString("purchaseToken");
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
        int i = zzcf.c;
        Object[] objArr = com.google.android.gms.internal.play_billing.b.i;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.getOriginalJson()) && TextUtils.equals(this.b, purchase.getSignature());
    }

    @Nullable
    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new AccountIdentifiers(optString, optString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.c.optString("developerPayload");
    }

    @Nullable
    public String getOrderId() {
        String optString = this.c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    @NonNull
    public String getOriginalJson() {
        return this.a;
    }

    @NonNull
    public String getPackageName() {
        return this.c.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @Nullable
    @zzt
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject optJSONObject = this.c.optJSONObject("pendingPurchaseUpdate");
        if (optJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(optJSONObject);
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.c.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.c.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.c.optBoolean("autoRenewing");
    }

    public boolean isSuspended() {
        return this.c.optBoolean(StatusKt.STATUS_SUSPENDED);
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
