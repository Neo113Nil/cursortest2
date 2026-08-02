package com.appsflyer.internal;

import com.moloco.sdk.internal.services.init.i;
import io.sentry.protocol.MetricSummary;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AFh1iSDK {
    public final AFh1hSDK AFAdRevenueData;
    public final AFh1gSDK getMediationNetwork;
    public AFh1bSDK getRevenue;

    public AFh1iSDK(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getRevenue = getMediationNetwork(jSONObject);
        this.getMediationNetwork = getMonetizationNetwork(jSONObject);
        this.AFAdRevenueData = getRevenue(jSONObject);
    }

    private static AFh1hSDK getRevenue(JSONObject jSONObject) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "meta_data");
            m11180constructorimpl = Result.m11180constructorimpl(mediationNetwork != null ? new AFh1hSDK(mediationNetwork.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1hSDK) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
    }

    private static AFh1gSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object m11180constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "exc_mngr");
            m11180constructorimpl = Result.m11180constructorimpl(mediationNetwork != null ? new AFh1gSDK(mediationNetwork.getString("sdk_ver"), mediationNetwork.optInt(MetricSummary.JsonKeys.MIN, -1), mediationNetwork.optInt("expire", -1), mediationNetwork.optLong("ttl", -1L)) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1gSDK) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
    }

    private static AFh1bSDK getMediationNetwork(JSONObject jSONObject) {
        Object m11180constructorimpl;
        AFh1bSDK aFh1bSDK;
        ArrayList emptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject mediationNetwork = getMediationNetwork(jSONObject, "r_debugger");
            if (mediationNetwork != null) {
                long j = mediationNetwork.getLong("ttl");
                int i = mediationNetwork.getInt("counter");
                String optString = mediationNetwork.optString("app_ver", "");
                String optString2 = mediationNetwork.optString("sdk_ver", "");
                float optDouble = (float) mediationNetwork.optDouble("ratio", 1.0d);
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
                aFh1bSDK = new AFh1bSDK(j, optDouble, emptyList, i, optString, optString2);
            } else {
                aFh1bSDK = null;
            }
            m11180constructorimpl = Result.m11180constructorimpl(aFh1bSDK);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return (AFh1bSDK) (Result.m11186isFailureimpl(m11180constructorimpl) ? null : m11180constructorimpl);
    }

    private static JSONObject getMediationNetwork(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject(i.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFh1iSDK aFh1iSDK = (AFh1iSDK) obj;
        return Intrinsics.areEqual(this.getMediationNetwork, aFh1iSDK.getMediationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFh1iSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getRevenue, aFh1iSDK.getRevenue);
    }

    public final int hashCode() {
        AFh1gSDK aFh1gSDK = this.getMediationNetwork;
        int hashCode = (aFh1gSDK != null ? aFh1gSDK.hashCode() : 0) * 31;
        AFh1hSDK aFh1hSDK = this.AFAdRevenueData;
        int hashCode2 = (hashCode + (aFh1hSDK != null ? aFh1hSDK.hashCode() : 0)) * 31;
        AFh1bSDK aFh1bSDK = this.getRevenue;
        return hashCode2 + (aFh1bSDK != null ? aFh1bSDK.hashCode() : 0);
    }
}
