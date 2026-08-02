package com.ironsource;

import com.google.android.exoplayer2.ExoPlayer;
import com.ironsource.InterfaceC2774z7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.n5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2557n5 implements InterfaceC2774z7, InterfaceC2774z7.a {
    private JSONObject a = IronSourceNetworkBridge.jsonObjectInit();
    private final Lazy b = LazyKt.lazy(new g());
    private final Lazy c = LazyKt.lazy(new j());
    private final Lazy d = LazyKt.lazy(new e());
    private final Lazy e = LazyKt.lazy(new d());
    private final Lazy f = LazyKt.lazy(new c());
    private final Lazy g = LazyKt.lazy(new i());
    private final Lazy h = LazyKt.lazy(new f());
    private final Lazy i = LazyKt.lazy(new h());
    private final Lazy j = LazyKt.lazy(new b());
    private final Lazy k = LazyKt.lazy(new a());

    /* renamed from: com.ironsource.n5$a */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.v, false));
        }
    }

    /* renamed from: com.ironsource.n5$b */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.p, false));
        }
    }

    /* renamed from: com.ironsource.n5$c */
    static final class c extends Lambda implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.w, false));
        }
    }

    /* renamed from: com.ironsource.n5$d */
    static final class d extends Lambda implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.A, false));
        }
    }

    /* renamed from: com.ironsource.n5$e */
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.z, false));
        }
    }

    /* renamed from: com.ironsource.n5$f */
    static final class f extends Lambda implements Function0<Boolean> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.r, false));
        }
    }

    /* renamed from: com.ironsource.n5$g */
    static final class g extends Lambda implements Function0<Boolean> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.x, false));
        }
    }

    /* renamed from: com.ironsource.n5$h */
    static final class h extends Lambda implements Function0<Boolean> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.q, false));
        }
    }

    /* renamed from: com.ironsource.n5$i */
    static final class i extends Lambda implements Function0<Boolean> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.s, false));
        }
    }

    /* renamed from: com.ironsource.n5$j */
    static final class j extends Lambda implements Function0<Boolean> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2557n5.this.T().optBoolean(C2611q5.y, false));
        }
    }

    private final boolean J() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    private final boolean K() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    private final boolean L() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    private final boolean M() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    private final boolean N() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final boolean O() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    private final boolean P() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    private final boolean Q() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    private final boolean R() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    private final boolean S() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject T() {
        JSONObject optJSONObject = this.a.optJSONObject(C2575o5.a);
        return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public int A() {
        String optString = T().optString(C2611q5.a);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean B() {
        return T().optBoolean(C2611q5.m, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean C() {
        return T().optBoolean(C2611q5.o, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean D() {
        return T().optBoolean(C2611q5.I, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean E() {
        return O();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean F() {
        return R();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public long G() {
        String optString = T().optString(C2611q5.c);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CTRL_LOAD_TIME)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 50L;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean H() {
        return K();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public int I() {
        String optString = T().optString(C2611q5.u);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(PRELOAD…RALLEL_LOAD_INTERSTITIAL)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean b() {
        return L();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public int c() {
        String optString = T().optString(C2611q5.b);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CTRL_LOAD_ATTEMPTS)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 3;
    }

    @Override // com.ironsource.InterfaceC2774z7
    public JSONObject config() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean d() {
        return T().optBoolean(C2611q5.i, true);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean e() {
        return T().optBoolean(C2611q5.D, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public long f() {
        String optString = T().optString(C2611q5.d);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean g() {
        return T().optBoolean(C2611q5.H, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean h() {
        return T().optBoolean(C2611q5.E, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public int i() {
        String optString = T().optString(C2611q5.g);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(MAX_LOA…C_INSTANCES_INTERSTITIAL)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean j() {
        return T().optBoolean(C2611q5.k, true);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean k() {
        return N();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean l() {
        return T().optBoolean(C2611q5.f, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean m() {
        return J();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public long n() {
        String optString = T().optString(C2611q5.e);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long longOrNull = StringsKt.toLongOrNull(optString);
        return longOrNull != null ? longOrNull.longValue() : ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean o() {
        return P();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean p() {
        return M();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean q() {
        return S();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean r() {
        return Q();
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean s() {
        return T().optBoolean(C2611q5.n, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean t() {
        return T().optBoolean(C2611q5.F, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean u() {
        return T().optBoolean(C2611q5.B, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean v() {
        return T().optBoolean(C2611q5.l, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean w() {
        return T().optBoolean(C2611q5.j, false);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public int x() {
        String optString = T().optString(C2611q5.h);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(MAX_LOA…TATIC_INSTANCES_REWARDED)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC2593p5
    public boolean y() {
        return T().optBoolean(C2611q5.G, true);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public int z() {
        String optString = T().optString(C2611q5.t);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(PRELOAD_PARALLEL_LOAD_REWARDED)");
        Integer intOrNull = StringsKt.toIntOrNull(optString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 2;
    }

    @Override // com.ironsource.InterfaceC2774z7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.a;
        }
        this.a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC2593p5
    public String a() {
        String optString = T().optString("controllerUrl", "");
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(CONTROLLER_URL, \"\")");
        return optString;
    }
}
