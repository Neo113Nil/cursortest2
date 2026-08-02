package com.appsflyer.internal;

import expo.modules.kotlin.activityresult.DataPersistorKt;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFh1dSDK {
    public final AFh1bSDK getCurrencyIso4217Code;
    public AFi1vSDK getMediationNetwork;
    public final AFh1cSDK getMonetizationNetwork;

    public AFh1dSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getRevenue(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
    }

    private static AFh1cSDK getMediationNetwork(JSONObject jSONObject) {
        Object m13470constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            m13470constructorimpl = Result.m13470constructorimpl(mediationNetwork != null ? new AFh1cSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1cSDK) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
    }

    private static AFh1bSDK getRevenue(JSONObject jSONObject) {
        Object m13470constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            m13470constructorimpl = Result.m13470constructorimpl(mediationNetwork != null ? new AFh1bSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt("min", -1), mediationNetwork.optInt(DataPersistorKt.EXPIRE_KEY, -1), mediationNetwork.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1bSDK) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
    }

    private static AFi1vSDK AFAdRevenueData(JSONObject jSONObject) {
        Object m13470constructorimpl;
        AFi1vSDK aFi1vSDK;
        ArrayList emptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i = mediationNetwork.getInt("counter");
                String optString = mediationNetwork.optString("app_ver", "");
                String optString2 = mediationNetwork.optString("sdk_ver", "");
                float optDouble = (float) mediationNetwork.optDouble(MetricsUnit.Fraction.RATIO, 1.0d);
                JSONArray optJSONArray = mediationNetwork.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    emptyList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        emptyList.add(string);
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFi1vSDK = new AFi1vSDK(j, optDouble, emptyList, i, optString, optString2);
            } else {
                aFi1vSDK = null;
            }
            m13470constructorimpl = Result.m13470constructorimpl(aFi1vSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (AFi1vSDK) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFh1dSDK aFh1dSDK = (AFh1dSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFh1dSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFh1dSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFh1dSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1bSDK aFh1bSDK = this.getCurrencyIso4217Code;
        int hashCode = (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0) * 31;
        AFh1cSDK aFh1cSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0)) * 31;
        AFi1vSDK aFi1vSDK = this.getMediationNetwork;
        return hashCode2 + (aFi1vSDK != null ? aFi1vSDK.hashCode() : 0);
    }
}
