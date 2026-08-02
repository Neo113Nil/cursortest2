package com.appsflyer.internal;

import Sc.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1gSDK {
    public final AFh1fSDK AFInAppEventType;
    public final AFh1nSDK AFKeystoreWrapper;
    public AFh1iSDK valueOf;

    public AFh1gSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.valueOf = values(jSONObject);
        this.AFKeystoreWrapper = AFInAppEventParameterName(jSONObject);
        this.AFInAppEventType = AFKeystoreWrapper(jSONObject);
    }

    private static AFh1nSDK AFInAppEventParameterName(JSONObject jSONObject) {
        Object a11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "exc_mngr");
            a11 = AFKeystoreWrapper != null ? new AFh1nSDK(AFKeystoreWrapper.getString("sdk_ver"), AFKeystoreWrapper.optInt("min", -1), AFKeystoreWrapper.optInt("expire", -1), AFKeystoreWrapper.optLong("ttl", -1L)) : null;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        return (AFh1nSDK) (a11 instanceof r.b ? null : a11);
    }

    private static AFh1fSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object a11;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "meta_data");
            a11 = AFKeystoreWrapper != null ? new AFh1fSDK(AFKeystoreWrapper.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        return (AFh1fSDK) (a11 instanceof r.b ? null : a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.K] */
    private static AFh1iSDK values(JSONObject jSONObject) {
        Object a11;
        ?? r22;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            JSONObject AFKeystoreWrapper = AFKeystoreWrapper(jSONObject, "r_debugger");
            if (AFKeystoreWrapper != null) {
                long j11 = AFKeystoreWrapper.getLong("ttl");
                int i11 = AFKeystoreWrapper.getInt("counter");
                String optString = AFKeystoreWrapper.optString("app_ver", "");
                String optString2 = AFKeystoreWrapper.optString("sdk_ver", "");
                float optDouble = (float) AFKeystoreWrapper.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = AFKeystoreWrapper.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    r22 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        String string = optJSONArray.getString(i12);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        r22.add(string);
                    }
                } else {
                    r22 = K.f71697a;
                }
                List list = r22;
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                a11 = new AFh1iSDK(j11, optDouble, list, i11, optString, optString2);
            } else {
                a11 = null;
            }
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        r.Companion companion3 = Sc.r.INSTANCE;
        return (AFh1iSDK) (a11 instanceof r.b ? null : a11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1gSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.Features");
        }
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.d(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.d(this.AFInAppEventType, aFh1gSDK.AFInAppEventType) && Intrinsics.d(this.valueOf, aFh1gSDK.valueOf);
    }

    public final int hashCode() {
        AFh1nSDK aFh1nSDK = this.AFKeystoreWrapper;
        int hashCode = (aFh1nSDK != null ? aFh1nSDK.hashCode() : 0) * 31;
        AFh1fSDK aFh1fSDK = this.AFInAppEventType;
        int hashCode2 = (hashCode + (aFh1fSDK != null ? aFh1fSDK.hashCode() : 0)) * 31;
        AFh1iSDK aFh1iSDK = this.valueOf;
        return hashCode2 + (aFh1iSDK != null ? aFh1iSDK.hashCode() : 0);
    }

    private static JSONObject AFKeystoreWrapper(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
