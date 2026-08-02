package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@zzh
/* loaded from: classes12.dex */
public final class BillingConfig {
    private final String countryCode;

    private BillingConfig(@Nullable String str, String str2) {
        this.countryCode = str2;
    }

    public static BillingConfig forCountryCode(String str) {
        return new BillingConfig(null, str);
    }

    @NonNull
    public String getCountryCode() {
        return this.countryCode;
    }

    public BillingConfig(String str) throws JSONException {
        this.countryCode = new JSONObject(str).optString(CommonConstant.KEY_COUNTRY_CODE);
    }
}
