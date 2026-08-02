package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import java.util.ArrayList;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.j9x;
import xsna.k9x;
import xsna.swe0;
import xsna.zcl;

/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4432m2 {
    public static final b h = new b(null);
    private final String a;
    private final com.ironsource.mediationsdk.demandOnly.a b;
    private final C4504q2 c;
    private final JSONObject d;
    private final JSONObject e;
    private final C4325g2 f;
    private final C4521r2 g;

    /* renamed from: com.ironsource.m2$a */
    public static final class a {
        private final JSONObject a;
        private final String b;
        private final String c;
        private final com.ironsource.mediationsdk.demandOnly.a d;
        private final C4504q2 e;
        private final JSONObject f;
        private final JSONObject g;
        private final C4325g2 h;
        private final C4521r2 i;

        public a(JSONObject jSONObject, String str) {
            this.a = jSONObject;
            this.b = str;
            JSONObject a = a(jSONObject);
            this.c = jSONObject.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a2 = a(jSONObject, a);
            this.d = a2;
            this.e = c(a);
            this.f = d(a);
            this.g = b(a);
            this.h = a(a2, str);
            this.i = b(a2, str);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C4432m2 a() {
            return new C4432m2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final JSONObject b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C4504q2 c(JSONObject jSONObject) {
            return new C4504q2(jSONObject);
        }

        private final C4521r2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4504q2 a = aVar.a(str);
            if (a != null) {
                return new C4521r2(a.k());
            }
            return null;
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (optJSONArray != null) {
                k9x q = swe0.q(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                j9x it = q.iterator();
                while (it.d) {
                    int nextInt = it.nextInt();
                    C4504q2 c4504q2 = new C4504q2(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c4504q2.n()) {
                        c4504q2 = null;
                    }
                    if (c4504q2 != null) {
                        arrayList2.add(c4504q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0227a(arrayList);
        }

        private final C4325g2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4504q2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            C4325g2 c4325g2 = new C4325g2();
            c4325g2.a(a.b());
            c4325g2.c(a.h());
            c4325g2.b(a.g());
            return c4325g2;
        }
    }

    /* renamed from: com.ironsource.m2$b */
    public static final class b {
        public /* synthetic */ b(zcl zclVar) {
            this();
        }

        public final Object a(JSONObject jSONObject, String str) {
            return a(new a(jSONObject, str).a(), str);
        }

        private b() {
        }

        private final Object a(C4432m2 c4432m2, String str) {
            String b = c4432m2.b();
            if (b != null && b.length() != 0) {
                if (c4432m2.i()) {
                    return new Result.Failure(new C4241b8(C4578u5.a.f()));
                }
                C4504q2 a = c4432m2.a(str);
                if (a == null) {
                    return new Result.Failure(new C4241b8(C4578u5.a.j()));
                }
                String k = a.k();
                return (k == null || k.length() == 0) ? new Result.Failure(new C4241b8(C4578u5.a.e())) : c4432m2;
            }
            return new Result.Failure(new C4241b8(C4578u5.a.i()));
        }
    }

    public C4432m2(String str, com.ironsource.mediationsdk.demandOnly.a aVar, C4504q2 c4504q2, JSONObject jSONObject, JSONObject jSONObject2, C4325g2 c4325g2, C4521r2 c4521r2) {
        this.a = str;
        this.b = aVar;
        this.c = c4504q2;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c4325g2;
        this.g = c4521r2;
    }

    public final String a() {
        C4521r2 c4521r2 = this.g;
        if (c4521r2 != null) {
            return c4521r2.d();
        }
        return null;
    }

    public final String b() {
        return this.a;
    }

    public final C4325g2 c() {
        return this.f;
    }

    public final JSONObject d() {
        return this.e;
    }

    public final C4504q2 e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.d;
    }

    public final C4521r2 g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public final C4504q2 a(String str) {
        return a(this.b, str);
    }

    private final C4504q2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
