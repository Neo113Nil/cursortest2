package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import defpackage.llf;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.v6a;
import defpackage.w2g;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4155k2 {

    @NotNull
    public static final b h = new b(null);

    @Nullable
    private final String a;

    @NotNull
    private final com.ironsource.mediationsdk.demandOnly.a b;

    @NotNull
    private final C4227o2 c;

    @Nullable
    private final JSONObject d;

    @Nullable
    private final JSONObject e;

    @Nullable
    private final C4048e2 f;

    @Nullable
    private final C4245p2 g;

    public C4155k2(@Nullable String str, @NotNull com.ironsource.mediationsdk.demandOnly.a aVar, @NotNull C4227o2 c4227o2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable C4048e2 c4048e2, @Nullable C4245p2 c4245p2) {
        aVar.getClass();
        c4227o2.getClass();
        this.a = str;
        this.b = aVar;
        this.c = c4227o2;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c4048e2;
        this.g = c4245p2;
    }

    @Nullable
    public final String a() {
        C4245p2 c4245p2 = this.g;
        if (c4245p2 != null) {
            return c4245p2.d();
        }
        return null;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    @Nullable
    public final C4048e2 c() {
        return this.f;
    }

    @Nullable
    public final JSONObject d() {
        return this.e;
    }

    @NotNull
    public final C4227o2 e() {
        return this.c;
    }

    @Nullable
    public final JSONObject f() {
        return this.d;
    }

    @Nullable
    public final C4245p2 g() {
        return this.g;
    }

    @NotNull
    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.k2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object a(C4155k2 c4155k2, String str) {
            String b = c4155k2.b();
            if (b == null || b.length() == 0) {
                p2g p2gVar = w2g.b;
                return new u2g(new Y7(C4301s5.a.i()));
            }
            if (c4155k2.i()) {
                p2g p2gVar2 = w2g.b;
                return new u2g(new Y7(C4301s5.a.f()));
            }
            C4227o2 a = c4155k2.a(str);
            if (a == null) {
                p2g p2gVar3 = w2g.b;
                return new u2g(new Y7(C4301s5.a.j()));
            }
            String k = a.k();
            if (k == null || k.length() == 0) {
                p2g p2gVar4 = w2g.b;
                return new u2g(new Y7(C4301s5.a.e()));
            }
            p2g p2gVar5 = w2g.b;
            return c4155k2;
        }

        private b() {
        }

        @NotNull
        public final Object a(@NotNull JSONObject jSONObject, @NotNull String str) {
            jSONObject.getClass();
            str.getClass();
            return a(new a(jSONObject, str).a(), str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.k2$a */
    public static final class a {

        @NotNull
        private final JSONObject a;

        @NotNull
        private final String b;

        @Nullable
        private final String c;

        @NotNull
        private final com.ironsource.mediationsdk.demandOnly.a d;

        @NotNull
        private final C4227o2 e;

        @Nullable
        private final JSONObject f;

        @Nullable
        private final JSONObject g;

        @Nullable
        private final C4048e2 h;

        @Nullable
        private final C4245p2 i;

        public a(@NotNull JSONObject jSONObject, @NotNull String str) {
            jSONObject.getClass();
            str.getClass();
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

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (optJSONArray != null) {
                IntRange j = llf.j(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                v6a it = j.iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    C4227o2 c4227o2 = new C4227o2(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c4227o2.n()) {
                        c4227o2 = null;
                    }
                    if (c4227o2 != null) {
                        arrayList2.add(c4227o2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C1208a(arrayList);
        }

        private final C4245p2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4227o2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            String k = a.k();
            k.getClass();
            return new C4245p2(k);
        }

        private final C4227o2 c(JSONObject jSONObject) {
            return new C4227o2(jSONObject);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        @NotNull
        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        @NotNull
        public final JSONObject b() {
            return this.a;
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        @NotNull
        public final C4155k2 a() {
            return new C4155k2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        private final C4048e2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4227o2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            C4048e2 c4048e2 = new C4048e2();
            c4048e2.a(a.b());
            c4048e2.c(a.h());
            c4048e2.b(a.g());
            return c4048e2;
        }
    }

    @Nullable
    public final C4227o2 a(@NotNull String str) {
        str.getClass();
        return a(this.b, str);
    }

    private final C4227o2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
