package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433qf implements T7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14513a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final JSONObject f14514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14516d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final S7 f14517e;

    public C0433qf(String str, @NonNull JSONObject jSONObject, boolean z5, boolean z7, @NonNull S7 s72) {
        this.f14513a = str;
        this.f14514b = jSONObject;
        this.f14515c = z5;
        this.f14516d = z7;
        this.f14517e = s72;
    }

    @Override // io.appmetrica.analytics.impl.T7
    @NonNull
    public final S7 a() {
        return this.f14517e;
    }

    public final JSONObject b() {
        if (!this.f14515c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f14513a);
            if (this.f14514b.length() > 0) {
                jSONObject.put("additionalParams", this.f14514b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @NonNull
    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f14513a);
            jSONObject.put("additionalParams", this.f14514b);
            jSONObject.put("wasSet", this.f14515c);
            jSONObject.put("autoTracking", this.f14516d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f14517e.f12866a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f14513a + "', additionalParameters=" + this.f14514b + ", wasSet=" + this.f14515c + ", autoTrackingEnabled=" + this.f14516d + ", source=" + this.f14517e + '}';
    }

    @NonNull
    public static C0433qf a(JSONObject jSONObject) {
        S7 s72;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i5 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        S7[] values = S7.values();
        int length = values.length;
        while (true) {
            if (i5 >= length) {
                s72 = null;
                break;
            }
            s72 = values[i5];
            if (Intrinsics.areEqual(s72.f12866a, optStringOrNull2)) {
                break;
            }
            i5++;
        }
        if (s72 == null) {
            s72 = S7.f12861b;
        }
        return new C0433qf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, s72);
    }
}
