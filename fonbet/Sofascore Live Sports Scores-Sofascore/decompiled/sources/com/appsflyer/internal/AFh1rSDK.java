package com.appsflyer.internal;

import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import defpackage.km5;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFh1rSDK {

    @Nullable
    public AFh1mSDK AFLogger;

    @Nullable
    public ExceptionManagerConfiguration d;

    @Nullable
    public AFh1jSDK unregisterClient;

    public AFh1rSDK(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.unregisterClient = AFKeystoreWrapper(jSONObject);
        this.d = AFLogger(jSONObject);
        this.AFLogger = unregisterClient(jSONObject);
    }

    private static AFh1jSDK AFKeystoreWrapper(JSONObject jSONObject) {
        Object u2gVar;
        List list;
        try {
            p2g p2gVar = w2g.b;
            JSONObject d = d(jSONObject, "r_debugger");
            if (d != null) {
                long j = d.getLong("ttl");
                int i = d.getInt("counter");
                String optString = d.optString("app_ver", "");
                String optString2 = d.optString("sdk_ver", "");
                float optDouble = (float) d.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = d.optJSONArray("tags");
                if (optJSONArray != null) {
                    list = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = optJSONArray.getString(i2);
                        string.getClass();
                        list.add(string);
                    }
                } else {
                    list = km5.a;
                }
                List list2 = list;
                optString.getClass();
                optString2.getClass();
                u2gVar = new AFh1jSDK(j, optDouble, list2, i, optString, optString2);
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        p2g p2gVar3 = w2g.b;
        return (AFh1jSDK) (u2gVar instanceof u2g ? null : u2gVar);
    }

    private static ExceptionManagerConfiguration AFLogger(JSONObject jSONObject) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            JSONObject d = d(jSONObject, "exc_mngr");
            if (d != null) {
                String string = d.getString("sdk_ver");
                int optInt = d.optInt("min", -1);
                int optInt2 = d.optInt("expire", -1);
                long optLong = d.optLong("ttl", -1L);
                string.getClass();
                u2gVar = new ExceptionManagerConfiguration(string, optInt, optInt2, optLong);
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        return (ExceptionManagerConfiguration) (u2gVar instanceof u2g ? null : u2gVar);
    }

    private static JSONObject d(JSONObject jSONObject, String str) throws JSONException, NullPointerException {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }

    private static AFh1mSDK unregisterClient(JSONObject jSONObject) {
        Object u2gVar;
        try {
            p2g p2gVar = w2g.b;
            JSONObject d = d(jSONObject, "meta_data");
            u2gVar = d != null ? new AFh1mSDK(d.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        return (AFh1mSDK) (u2gVar instanceof u2g ? null : u2gVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AFh1rSDK.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        AFh1rSDK aFh1rSDK = (AFh1rSDK) obj;
        return Intrinsics.c(this.d, aFh1rSDK.d) && Intrinsics.c(this.AFLogger, aFh1rSDK.AFLogger) && Intrinsics.c(this.unregisterClient, aFh1rSDK.unregisterClient);
    }

    public final int hashCode() {
        ExceptionManagerConfiguration exceptionManagerConfiguration = this.d;
        int hashCode = (exceptionManagerConfiguration != null ? exceptionManagerConfiguration.hashCode() : 0) * 31;
        AFh1mSDK aFh1mSDK = this.AFLogger;
        int hashCode2 = (hashCode + (aFh1mSDK != null ? aFh1mSDK.hashCode() : 0)) * 31;
        AFh1jSDK aFh1jSDK = this.unregisterClient;
        return hashCode2 + (aFh1jSDK != null ? aFh1jSDK.hashCode() : 0);
    }
}
