package com.ironsource;

import defpackage.xka;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R2 {

    @NotNull
    private final b a;

    @NotNull
    private final Map<String, b> b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function1<JSONObject, b> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            return new b(jSONObject);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @Nullable
        private final JSONObject a;
        private final int b;
        private final boolean c;
        private final long d;
        private final float e;

        @NotNull
        private final List<String> f;

        public b(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            JSONObject jSONObject2 = jSONObject.has(T2.a) ? jSONObject : null;
            JSONObject optJSONObject = jSONObject2 != null ? jSONObject2.optJSONObject(T2.a) : null;
            this.a = optJSONObject;
            int optInt = optJSONObject != null ? optJSONObject.optInt(T2.b, 25000) : 25000;
            this.b = optInt;
            this.c = optJSONObject != null ? optJSONObject.optBoolean("enabled", true) : true;
            this.d = (optJSONObject == null || !optJSONObject.has(T2.d) || optJSONObject.isNull(T2.d)) ? optInt : optJSONObject.optLong(T2.d);
            this.e = jSONObject.has(T2.e) ? jSONObject.optInt(T2.e) / 100.0f : 0.15f;
            List<String> b = jSONObject.has(T2.f) ? C4110ha.b(jSONObject.getJSONArray(T2.f)) : kotlin.collections.b.j(com.ironsource.mediationsdk.j.a, com.ironsource.mediationsdk.j.d);
            b.getClass();
            this.f = b;
        }

        @NotNull
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

    public R2(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = new b(jSONObject);
        this.b = new Y0(jSONObject).a(a.a);
    }

    @NotNull
    public final Map<String, b> a() {
        return this.b;
    }

    @NotNull
    public final b b() {
        return this.a;
    }
}
