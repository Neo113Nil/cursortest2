package com.braze.triggers.config;

import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class c implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final long f810a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final b f;
    public final int g;

    public c(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f810a = json.optLong("start_time", -1L);
        this.b = json.optLong(SDKConstants.PARAM_TOURNAMENTS_END_TIME, -1L);
        this.c = json.optInt("priority", 0);
        this.g = json.optInt("min_seconds_since_last_trigger", -1);
        this.d = json.optInt("delay", 0);
        this.e = json.optInt("timeout", -1);
        this.f = new b(json);
    }

    public static final String c() {
        return "Could not convert ScheduleConfig to JSON";
    }

    public final int d() {
        return this.d;
    }

    public final b e() {
        return this.f;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        try {
            JSONObject propertiesJSONObject = this.f.getPropertiesJSONObject();
            if (propertiesJSONObject == null) {
                return null;
            }
            propertiesJSONObject.put("start_time", this.f810a);
            propertiesJSONObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, this.b);
            propertiesJSONObject.put("priority", this.c);
            propertiesJSONObject.put("min_seconds_since_last_trigger", this.g);
            propertiesJSONObject.put("timeout", this.e);
            propertiesJSONObject.put("delay", this.d);
            return propertiesJSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.config.c$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.c();
                }
            }, 4, (Object) null);
            return null;
        }
    }
}
