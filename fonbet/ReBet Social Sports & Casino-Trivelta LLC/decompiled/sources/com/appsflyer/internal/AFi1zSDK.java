package com.appsflyer.internal;

import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFi1zSDK {

    @Nullable
    public final AFh1aSDK getCurrencyIso4217Code;

    @Nullable
    public AFi1xSDK getMediationNetwork;

    @Nullable
    public final AFi1uSDK getMonetizationNetwork;

    public AFi1zSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = AFAdRevenueData(jSONObject);
        this.getCurrencyIso4217Code = getMediationNetwork(jSONObject);
        this.getMonetizationNetwork = getRevenue(jSONObject);
    }

    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object m147constructorimpl;
        AFi1xSDK aFi1xSDK;
        List emptyList;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (AFAdRevenueData != null) {
                long j10 = AFAdRevenueData.getLong("ttl");
                int i10 = AFAdRevenueData.getInt("counter");
                String optString = AFAdRevenueData.optString("app_ver", "");
                String optString2 = AFAdRevenueData.optString("sdk_ver", "");
                float optDouble = (float) AFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFAdRevenueData.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    emptyList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = optJSONArray.getString(i11);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        emptyList.add(string);
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                List list = emptyList;
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                aFi1xSDK = new AFi1xSDK(j10, optDouble, list, i10, optString, optString2);
            } else {
                aFi1xSDK = null;
            }
            m147constructorimpl = Result.m147constructorimpl(aFi1xSDK);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (AFi1xSDK) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            m147constructorimpl = Result.m147constructorimpl(AFAdRevenueData != null ? new AFh1aSDK(AFAdRevenueData.getString("sdk_ver"), AFAdRevenueData.optInt("min", -1), AFAdRevenueData.optInt("expire", -1), AFAdRevenueData.optLong("ttl", -1L)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (AFh1aSDK) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    private static AFi1uSDK getRevenue(JSONObject jSONObject) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            m147constructorimpl = Result.m147constructorimpl(AFAdRevenueData != null ? new AFi1uSDK(AFAdRevenueData.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (AFi1uSDK) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1zSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int hashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1uSDK aFi1uSDK = this.getMonetizationNetwork;
        int hashCode2 = (hashCode + (aFi1uSDK != null ? aFi1uSDK.hashCode() : 0)) * 31;
        AFi1xSDK aFi1xSDK = this.getMediationNetwork;
        return hashCode2 + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject(EventKeys.DATA)) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
