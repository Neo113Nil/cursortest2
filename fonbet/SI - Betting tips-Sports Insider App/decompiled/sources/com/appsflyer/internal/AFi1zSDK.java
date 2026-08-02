package com.appsflyer.internal;

import gf.p;
import gf.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
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
        this.getMonetizationNetwork = getCurrencyIso4217Code(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.e0] */
    private static AFi1xSDK AFAdRevenueData(JSONObject jSONObject) {
        Object h10;
        ?? r22;
        try {
            gf.o oVar = q.f10031a;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (AFAdRevenueData != null) {
                long j = AFAdRevenueData.getLong("ttl");
                int i5 = AFAdRevenueData.getInt("counter");
                String optString = AFAdRevenueData.optString("app_ver", "");
                String optString2 = AFAdRevenueData.optString("sdk_ver", "");
                float optDouble = (float) AFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFAdRevenueData.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    r22 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = optJSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        r22.add(string);
                    }
                } else {
                    r22 = e0.f19204a;
                }
                List list = r22;
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                h10 = new AFi1xSDK(j, optDouble, list, i5, optString, optString2);
            } else {
                h10 = null;
            }
        } catch (Throwable th2) {
            gf.o oVar2 = q.f10031a;
            h10 = h8.b.h(th2);
        }
        gf.o oVar3 = q.f10031a;
        return (AFi1xSDK) (h10 instanceof p ? null : h10);
    }

    private static AFi1uSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object h10;
        try {
            gf.o oVar = q.f10031a;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            h10 = AFAdRevenueData != null ? new AFi1uSDK(AFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th2) {
            gf.o oVar2 = q.f10031a;
            h10 = h8.b.h(th2);
        }
        return (AFi1uSDK) (h10 instanceof p ? null : h10);
    }

    private static AFh1aSDK getMediationNetwork(JSONObject jSONObject) {
        Object h10;
        try {
            gf.o oVar = q.f10031a;
            JSONObject AFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            h10 = AFAdRevenueData != null ? new AFh1aSDK(AFAdRevenueData.getString("sdk_ver"), AFAdRevenueData.optInt("min", -1), AFAdRevenueData.optInt("expire", -1), AFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th2) {
            gf.o oVar2 = q.f10031a;
            h10 = h8.b.h(th2);
        }
        return (AFh1aSDK) (h10 instanceof p ? null : h10);
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

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
