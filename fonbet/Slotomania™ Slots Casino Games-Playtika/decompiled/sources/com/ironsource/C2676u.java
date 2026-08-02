package com.ironsource;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2676u {
    public static final c d = new c(null);
    public static final String e = "capping";
    public static final String f = "pacing";
    public static final String g = "delivery";
    public static final String h = "progressiveLoadingConfig";
    public static final String i = "expiredDurationInMinutes";
    public static final String j = "reward";
    public static final String k = "name";
    public static final String l = "amount";
    public static final String m = "virtualItemName";
    public static final String n = "virtualItemCount";
    public static final long o = 60;
    private final Map<String, d> a;
    private final d b;
    private final Map<String, d> c;

    /* renamed from: com.ironsource.u$a */
    static final class a extends Lambda implements Function1<JSONObject, d> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.u$b */
    static final class b extends Lambda implements Function1<JSONObject, d> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: com.ironsource.u$d */
    public static final class d {
        private final C3 a;
        private final C2332ad b;
        private final M4 c;
        private final Long d;
        private final Qd e;
        private final Qd f;
        private final Ad g;

        public d(JSONObject features) {
            C3 c3;
            C2332ad c2332ad;
            Intrinsics.checkNotNullParameter(features, "features");
            Ad ad = null;
            if (features.has(C2676u.e)) {
                JSONObject jSONObject = features.getJSONObject(C2676u.e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c3 = new C3(jSONObject);
            } else {
                c3 = null;
            }
            this.a = c3;
            if (features.has(C2676u.f)) {
                JSONObject jSONObject2 = features.getJSONObject(C2676u.f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c2332ad = new C2332ad(jSONObject2);
            } else {
                c2332ad = null;
            }
            this.b = c2332ad;
            this.c = features.has(C2676u.g) ? new M4(features.getBoolean(C2676u.g)) : null;
            this.d = features.has(C2676u.i) ? Long.valueOf(features.getLong(C2676u.i)) : null;
            JSONObject optJSONObject = features.optJSONObject(C2676u.j);
            this.e = optJSONObject != null ? new Qd(optJSONObject, "name", "amount") : null;
            Qd qd = new Qd(features, C2676u.m, C2676u.n);
            String b = qd.b();
            this.f = (b == null || b.length() == 0 || qd.a() == null) ? null : qd;
            if (features.has(C2676u.h)) {
                JSONObject jSONObject3 = features.getJSONObject(C2676u.h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                ad = new Ad(jSONObject3);
            }
            this.g = ad;
        }

        public final Qd a() {
            return this.e;
        }

        public final C3 b() {
            return this.a;
        }

        public final M4 c() {
            return this.c;
        }

        public final Long d() {
            return this.d;
        }

        public final C2332ad e() {
            return this.b;
        }

        public final Qd f() {
            return this.f;
        }

        public final Ad g() {
            return this.g;
        }
    }

    public C2676u(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = new C2601pd(configurations).a(b.a);
        this.b = new d(configurations);
        this.c = new C2320a1(configurations).a(a.a);
    }

    public final Map<String, d> a() {
        return this.c;
    }

    public final d b() {
        return this.b;
    }

    public final Map<String, d> c() {
        return this.a;
    }
}
