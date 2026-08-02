package com.ironsource;

import defpackage.xka;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4331u {

    @NotNull
    public static final c d = new c(null);

    @NotNull
    public static final String e = "capping";

    @NotNull
    public static final String f = "pacing";

    @NotNull
    public static final String g = "delivery";

    @NotNull
    public static final String h = "progressiveLoadingConfig";

    @NotNull
    public static final String i = "expiredDurationInMinutes";

    @NotNull
    public static final String j = "reward";

    @NotNull
    public static final String k = "name";

    @NotNull
    public static final String l = "amount";

    @NotNull
    public static final String m = "virtualItemName";

    @NotNull
    public static final String n = "virtualItemCount";
    public static final long o = 60;

    @NotNull
    private final Map<String, d> a;

    @NotNull
    private final d b;

    @NotNull
    private final Map<String, d> c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u$a */
    public static final class a extends xka implements Function1<JSONObject, d> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            return new d(jSONObject);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u$b */
    public static final class b extends xka implements Function1<JSONObject, d> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            return new d(jSONObject);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u$d */
    public static final class d {

        @Nullable
        private final C4425z3 a;

        @Nullable
        private final C3962ad b;

        @Nullable
        private final J4 c;

        @Nullable
        private final Long d;

        @Nullable
        private final Pd e;

        @Nullable
        private final Pd f;

        @Nullable
        private final C4435zd g;

        public d(@NotNull JSONObject jSONObject) {
            C4425z3 c4425z3;
            C3962ad c3962ad;
            jSONObject.getClass();
            C4435zd c4435zd = null;
            if (jSONObject.has(C4331u.e)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(C4331u.e);
                jSONObject2.getClass();
                c4425z3 = new C4425z3(jSONObject2);
            } else {
                c4425z3 = null;
            }
            this.a = c4425z3;
            if (jSONObject.has(C4331u.f)) {
                JSONObject jSONObject3 = jSONObject.getJSONObject(C4331u.f);
                jSONObject3.getClass();
                c3962ad = new C3962ad(jSONObject3);
            } else {
                c3962ad = null;
            }
            this.b = c3962ad;
            this.c = jSONObject.has(C4331u.g) ? new J4(jSONObject.getBoolean(C4331u.g)) : null;
            this.d = jSONObject.has(C4331u.i) ? Long.valueOf(jSONObject.getLong(C4331u.i)) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject(C4331u.j);
            this.e = optJSONObject != null ? new Pd(optJSONObject, "name", "amount") : null;
            Pd pd = new Pd(jSONObject, C4331u.m, C4331u.n);
            String b = pd.b();
            this.f = (b == null || b.length() == 0 || pd.a() == null) ? null : pd;
            if (jSONObject.has(C4331u.h)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C4331u.h);
                jSONObject4.getClass();
                c4435zd = new C4435zd(jSONObject4);
            }
            this.g = c4435zd;
        }

        @Nullable
        public final Pd a() {
            return this.e;
        }

        @Nullable
        public final C4425z3 b() {
            return this.a;
        }

        @Nullable
        public final J4 c() {
            return this.c;
        }

        @Nullable
        public final Long d() {
            return this.d;
        }

        @Nullable
        public final C3962ad e() {
            return this.b;
        }

        @Nullable
        public final Pd f() {
            return this.f;
        }

        @Nullable
        public final C4435zd g() {
            return this.g;
        }
    }

    public C4331u(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.a = new C4238od(jSONObject).a(b.a);
        this.b = new d(jSONObject);
        this.c = new Y0(jSONObject).a(a.a);
    }

    @NotNull
    public final Map<String, d> a() {
        return this.c;
    }

    @NotNull
    public final d b() {
        return this.b;
    }

    @NotNull
    public final Map<String, d> c() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
