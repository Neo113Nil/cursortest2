package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class yo {

    /* renamed from: a, reason: collision with root package name */
    public final Bo f14980a;

    /* renamed from: b, reason: collision with root package name */
    public final Bo f14981b;

    /* renamed from: c, reason: collision with root package name */
    public final zo f14982c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f14983d;

    public yo(Bo bo, Bo bo2, zo zoVar) {
        this.f14980a = bo;
        this.f14981b = bo2;
        this.f14982c = zoVar;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f14983d == null) {
                JSONObject a7 = this.f14982c.a(a(this.f14980a), a(this.f14981b));
                this.f14983d = a7;
                a(a7);
            }
            jSONObject = this.f14983d;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileContents");
                jSONObject = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public static JSONObject a(Bo bo) {
        try {
            String a7 = bo.a();
            return a7 != null ? new JSONObject(a7) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f14980a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f14981b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
