package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.e43;
import xsna.izs;

/* loaded from: classes13.dex */
public final class T2 {
    private final b a;
    private final Map<String, b> b;

    public static final class a extends Lambda implements izs<JSONObject, b> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject jSONObject) {
            return new b(jSONObject);
        }
    }

    public static final class b {
        private final JSONObject a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;
        private final List<String> f;

        public b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.has(V2.a) ? jSONObject : null;
            JSONObject optJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(V2.a) : null;
            this.a = optJSONObject;
            int optInt = optJSONObject != null ? optJSONObject.optInt(V2.b, 25000) : 25000;
            this.b = optInt;
            this.c = optJSONObject != null ? optJSONObject.optBoolean("enabled", true) : true;
            this.d = (optJSONObject == null || !optJSONObject.has(V2.d) || optJSONObject.isNull(V2.d)) ? optInt : optJSONObject.optLong(V2.d);
            this.e = jSONObject.has(V2.e) ? jSONObject.optInt(V2.e) / 100.0f : 0.15f;
            this.f = jSONObject.has(V2.f) ? C4369ia.b(jSONObject.getJSONArray(V2.f)) : e43.l("BANNER", com.ironsource.mediationsdk.j.d);
        }

        public final List<String> a() {
            return this.f;
        }

        public final float b() {
            return this.e;
        }

        public final int c() {
            return this.b;
        }

        public final long d() {
            return this.d;
        }

        public final boolean e() {
            return this.c;
        }
    }

    public T2(JSONObject jSONObject) {
        this.a = new b(jSONObject);
        this.b = new C4216a1(jSONObject).a(a.a);
    }

    public final Map<String, b> a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }
}
