package com.ironsource;

import com.ironsource.A7;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.arm0;
import xsna.bpn0;
import xsna.gzs;

/* renamed from: com.ironsource.n5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4453n5 implements A7, A7.a {
    private JSONObject a = new JSONObject();
    private final Lazy b = new bpn0(new g());
    private final Lazy c = new bpn0(new j());
    private final Lazy d = new bpn0(new e());
    private final Lazy e = new bpn0(new d());
    private final Lazy f = new bpn0(new c());
    private final Lazy g = new bpn0(new i());
    private final Lazy h = new bpn0(new f());
    private final Lazy i = new bpn0(new h());
    private final Lazy j = new bpn0(new b());
    private final Lazy k = new bpn0(new a());

    /* renamed from: com.ironsource.n5$a */
    public static final class a extends Lambda implements gzs<Boolean> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.v, false));
        }
    }

    /* renamed from: com.ironsource.n5$b */
    public static final class b extends Lambda implements gzs<Boolean> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.p, false));
        }
    }

    /* renamed from: com.ironsource.n5$c */
    public static final class c extends Lambda implements gzs<Boolean> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.w, false));
        }
    }

    /* renamed from: com.ironsource.n5$d */
    public static final class d extends Lambda implements gzs<Boolean> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.A, false));
        }
    }

    /* renamed from: com.ironsource.n5$e */
    public static final class e extends Lambda implements gzs<Boolean> {
        public e() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.z, false));
        }
    }

    /* renamed from: com.ironsource.n5$f */
    public static final class f extends Lambda implements gzs<Boolean> {
        public f() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.r, false));
        }
    }

    /* renamed from: com.ironsource.n5$g */
    public static final class g extends Lambda implements gzs<Boolean> {
        public g() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.x, false));
        }
    }

    /* renamed from: com.ironsource.n5$h */
    public static final class h extends Lambda implements gzs<Boolean> {
        public h() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.q, false));
        }
    }

    /* renamed from: com.ironsource.n5$i */
    public static final class i extends Lambda implements gzs<Boolean> {
        public i() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.s, false));
        }
    }

    /* renamed from: com.ironsource.n5$j */
    public static final class j extends Lambda implements gzs<Boolean> {
        public j() {
            super(0);
        }

        @Override // xsna.gzs
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C4453n5.this.V().optBoolean(C4507q5.y, false));
        }
    }

    private final boolean L() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final boolean M() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    private final boolean N() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    private final boolean O() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    private final boolean P() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final boolean Q() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean R() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    private final boolean S() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final boolean T() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean U() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject V() {
        JSONObject optJSONObject = this.a.optJSONObject("traits");
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public int A() {
        Integer m = arm0.m(10, V().optString(C4507q5.t));
        if (m != null) {
            return m.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean B() {
        return V().optBoolean(C4507q5.J, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public int C() {
        Integer m = arm0.m(10, V().optString(C4507q5.a));
        if (m != null) {
            return m.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean D() {
        return V().optBoolean(C4507q5.m, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean E() {
        return V().optBoolean(C4507q5.o, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean F() {
        return V().optBoolean(C4507q5.I, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean G() {
        return Q();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean H() {
        return T();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public long I() {
        Long n = arm0.n(V().optString(C4507q5.c));
        if (n != null) {
            return n.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean J() {
        return M();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public int K() {
        Integer m = arm0.m(10, V().optString(C4507q5.u));
        if (m != null) {
            return m.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean b() {
        return N();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public int c() {
        Integer m = arm0.m(10, V().optString(C4507q5.b));
        if (m != null) {
            return m.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.A7
    public JSONObject config() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean d() {
        return V().optBoolean(C4507q5.i, true);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean e() {
        return V().optBoolean(C4507q5.D, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public long f() {
        Long n = arm0.n(V().optString(C4507q5.d));
        if (n != null) {
            return n.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean g() {
        return V().optBoolean(C4507q5.H, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean h() {
        return V().optBoolean(C4507q5.E, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public int i() {
        Integer m = arm0.m(10, V().optString(C4507q5.g));
        if (m != null) {
            return m.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean j() {
        return V().optBoolean(C4507q5.k, true);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean k() {
        return P();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean l() {
        return V().optBoolean(C4507q5.f, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean m() {
        return L();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public long n() {
        Long n = arm0.n(V().optString(C4507q5.e));
        if (n != null) {
            return n.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean o() {
        return R();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean p() {
        return O();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean q() {
        return U();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean r() {
        return S();
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean s() {
        return V().optBoolean(C4507q5.n, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean t() {
        return V().optBoolean(C4507q5.F, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean u() {
        return V().optBoolean(C4507q5.B, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean v() {
        return V().optBoolean(C4507q5.l, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean w() {
        return V().optBoolean(C4507q5.j, false);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public int x() {
        Integer m = arm0.m(10, V().optString(C4507q5.h));
        if (m != null) {
            return m.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean y() {
        return V().optBoolean(C4507q5.G, true);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public boolean z() {
        return V().optBoolean(C4507q5.K, false);
    }

    @Override // com.ironsource.A7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.a;
        }
        this.a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC4489p5
    public String a() {
        return V().optString("controllerUrl", "");
    }
}
