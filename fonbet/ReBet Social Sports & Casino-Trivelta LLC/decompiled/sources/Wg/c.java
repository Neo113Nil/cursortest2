package Wg;

import Ph.C0;
import Ph.X0;
import ah.C2020l;
import ah.C2027t;
import ah.F;
import ah.InterfaceC2019k;
import ah.N;
import ah.P;
import ah.r;
import bh.AbstractC2423b;
import ch.AbstractC2922B;
import ch.AbstractC2927d;
import ch.InterfaceC2925b;
import hh.C4508a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class c implements r {

    /* renamed from: g, reason: collision with root package name */
    public static final a f13245g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final F f13246a = new F(null, null, 0, null, null, null, null, null, false, 511, null);

    /* renamed from: b, reason: collision with root package name */
    public C2027t f13247b = C2027t.f16165b.a();

    /* renamed from: c, reason: collision with root package name */
    public final C2020l f13248c = new C2020l(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public Object f13249d = Yg.d.f14256a;

    /* renamed from: e, reason: collision with root package name */
    public C0 f13250e = X0.b(null, 1, null);

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2925b f13251f = AbstractC2927d.a(true);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f13252d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // ah.r
    public C2020l a() {
        return this.f13248c;
    }

    public final d b() {
        P b10 = this.f13246a.b();
        C2027t c2027t = this.f13247b;
        InterfaceC2019k p10 = a().p();
        Object obj = this.f13249d;
        AbstractC2423b abstractC2423b = obj instanceof AbstractC2423b ? (AbstractC2423b) obj : null;
        if (abstractC2423b != null) {
            return new d(b10, c2027t, p10, abstractC2423b, this.f13250e, this.f13251f);
        }
        throw new IllegalStateException(("No request transformation found: " + this.f13249d).toString());
    }

    public final InterfaceC2925b c() {
        return this.f13251f;
    }

    public final Object d() {
        return this.f13249d;
    }

    public final C4508a e() {
        return (C4508a) this.f13251f.f(i.a());
    }

    public final Object f(Qg.e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f13251f.f(Qg.f.a());
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final C0 g() {
        return this.f13250e;
    }

    public final C2027t h() {
        return this.f13247b;
    }

    public final F i() {
        return this.f13246a;
    }

    public final void j(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.f13249d = obj;
    }

    public final void k(C4508a c4508a) {
        if (c4508a != null) {
            this.f13251f.b(i.a(), c4508a);
        } else {
            this.f13251f.e(i.a());
        }
    }

    public final void l(Qg.e key, Object capability) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(capability, "capability");
        ((Map) this.f13251f.c(Qg.f.a(), b.f13252d)).put(key, capability);
    }

    public final void m(C0 c02) {
        Intrinsics.checkNotNullParameter(c02, "<set-?>");
        this.f13250e = c02;
    }

    public final void n(C2027t c2027t) {
        Intrinsics.checkNotNullParameter(c2027t, "<set-?>");
        this.f13247b = c2027t;
    }

    public final c o(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f13247b = builder.f13247b;
        this.f13249d = builder.f13249d;
        k(builder.e());
        N.g(this.f13246a, builder.f13246a);
        F f10 = this.f13246a;
        f10.u(f10.g());
        AbstractC2922B.c(a(), builder.a());
        ch.e.a(this.f13251f, builder.f13251f);
        return this;
    }

    public final c p(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f13250e = builder.f13250e;
        return o(builder);
    }
}
