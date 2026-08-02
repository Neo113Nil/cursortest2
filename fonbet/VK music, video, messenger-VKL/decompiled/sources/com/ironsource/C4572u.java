package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.izs;
import xsna.zcl;

/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4572u {
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
    public static final class a extends Lambda implements izs<JSONObject, d> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject jSONObject) {
            return new d(jSONObject);
        }
    }

    /* renamed from: com.ironsource.u$b */
    public static final class b extends Lambda implements izs<JSONObject, d> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // xsna.izs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject jSONObject) {
            return new d(jSONObject);
        }
    }

    /* renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(zcl zclVar) {
            this();
        }

        private c() {
        }
    }

    /* renamed from: com.ironsource.u$d */
    public static final class d {
        private final C3 a;
        private final C4246bd b;
        private final M4 c;
        private final Long d;
        private final Qd e;
        private final Qd f;
        private final Ad g;

        public d(JSONObject jSONObject) {
            this.a = jSONObject.has(C4572u.e) ? new C3(jSONObject.getJSONObject(C4572u.e)) : null;
            this.b = jSONObject.has(C4572u.f) ? new C4246bd(jSONObject.getJSONObject(C4572u.f)) : null;
            this.c = jSONObject.has(C4572u.g) ? new M4(jSONObject.getBoolean(C4572u.g)) : null;
            this.d = jSONObject.has(C4572u.i) ? Long.valueOf(jSONObject.getLong(C4572u.i)) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject(C4572u.j);
            this.e = optJSONObject != null ? new Qd(optJSONObject, "name", "amount") : null;
            Qd qd = new Qd(jSONObject, C4572u.m, C4572u.n);
            String b = qd.b();
            this.f = (b == null || b.length() == 0 || qd.a() == null) ? null : qd;
            this.g = jSONObject.has(C4572u.h) ? new Ad(jSONObject.getJSONObject(C4572u.h)) : null;
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

        public final C4246bd e() {
            return this.b;
        }

        public final Qd f() {
            return this.f;
        }

        public final Ad g() {
            return this.g;
        }
    }

    public C4572u(JSONObject jSONObject) {
        this.a = new C4497pd(jSONObject).a(b.a);
        this.b = new d(jSONObject);
        this.c = new C4216a1(jSONObject).a(a.a);
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
