package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.fc6;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzu
/* loaded from: classes.dex */
public final class UnfetchedProduct {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {

        @zzu
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;

        @zzu
        public static final int NO_ELIGIBLE_OFFER = 4;

        @zzu
        public static final int PRODUCT_NOT_FOUND = 3;

        @zzu
        public static final int UNKNOWN = 0;
    }

    public UnfetchedProduct(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String optString = jSONObject.optString("type");
        this.c = optString;
        this.d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(optString)) {
            a70.p("Product type cannot be empty.");
            throw null;
        }
        this.e = jSONObject.optString("serializedDocid");
    }

    @NonNull
    public static UnfetchedProduct fromJson(@NonNull String str) throws JSONException {
        return new UnfetchedProduct(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnfetchedProduct) {
            return TextUtils.equals(this.a, ((UnfetchedProduct) obj).a);
        }
        return false;
    }

    @NonNull
    @zzu
    public String getProductId() {
        return this.b;
    }

    @NonNull
    @zzu
    public String getProductType() {
        return this.c;
    }

    @Nullable
    public String getSerializedDocid() {
        return this.e;
    }

    @zzu
    public int getStatusCode() {
        return this.d;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.b);
        sb.append("', productType='");
        sb.append(this.c);
        sb.append("', statusCode=");
        return fc6.h(this.d, "}", sb);
    }
}
