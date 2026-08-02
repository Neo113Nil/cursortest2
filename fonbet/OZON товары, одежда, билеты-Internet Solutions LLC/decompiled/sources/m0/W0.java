package m0;

import k1.C7459e;
import k1.C7460f;
import k1.C7464j;
import k1.C7465k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final U0<Float, C8008p> f73616a = new V0(e.f73630b, f.f73631b);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final U0<Integer, C8008p> f73617b = new V0(k.f73636b, l.f73637b);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final U0<Z1.h, C8008p> f73618c = new V0(c.f73628b, d.f73629b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final U0<Z1.i, C8010q> f73619d = new V0(a.f73626b, b.f73627b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final U0<C7464j, C8010q> f73620e = new V0(q.f73642b, r.f73643b);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final U0<C7459e, C8010q> f73621f = new V0(m.f73638b, n.f73639b);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final U0<Z1.m, C8010q> f73622g = new V0(g.f73632b, h.f73633b);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final U0<Z1.q, C8010q> f73623h = new V0(i.f73634b, j.f73635b);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final U0<C7460f, C8013s> f73624i = new V0(o.f73640b, p.f73641b);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f73625j = 0;

    static final class a extends AbstractC7737t implements Function1<Z1.i, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f73626b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(Z1.i iVar) {
            long c11 = iVar.c();
            return new C8010q(Float.intBitsToFloat((int) (c11 >> 32)), Float.intBitsToFloat((int) (c11 & 4294967295L)));
        }
    }

    static final class b extends AbstractC7737t implements Function1<C8010q, Z1.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f73627b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Z1.i invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            return Z1.i.a(Ra.h.c(c8010q2.f(), c8010q2.g()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<Z1.h, C8008p> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f73628b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8008p invoke(Z1.h hVar) {
            return new C8008p(hVar.d());
        }
    }

    static final class d extends AbstractC7737t implements Function1<C8008p, Z1.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f73629b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Z1.h invoke(C8008p c8008p) {
            return Z1.h.a(c8008p.f());
        }
    }

    static final class e extends AbstractC7737t implements Function1<Float, C8008p> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f73630b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8008p invoke(Float f7) {
            return new C8008p(f7.floatValue());
        }
    }

    static final class f extends AbstractC7737t implements Function1<C8008p, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f73631b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(C8008p c8008p) {
            return Float.valueOf(c8008p.f());
        }
    }

    static final class g extends AbstractC7737t implements Function1<Z1.m, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f73632b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(Z1.m mVar) {
            long g10 = mVar.g();
            return new C8010q((int) (g10 >> 32), (int) (g10 & 4294967295L));
        }
    }

    static final class h extends AbstractC7737t implements Function1<C8010q, Z1.m> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f73633b = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Z1.m invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            return Z1.m.a(Z1.n.a(Math.round(c8010q2.f()), Math.round(c8010q2.g())));
        }
    }

    static final class i extends AbstractC7737t implements Function1<Z1.q, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f73634b = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(Z1.q qVar) {
            long e11 = qVar.e();
            return new C8010q((int) (e11 >> 32), (int) (e11 & 4294967295L));
        }
    }

    static final class j extends AbstractC7737t implements Function1<C8010q, Z1.q> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f73635b = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final Z1.q invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            int round = Math.round(c8010q2.f());
            if (round < 0) {
                round = 0;
            }
            int round2 = Math.round(c8010q2.g());
            return Z1.q.a(Z1.r.a(round, round2 >= 0 ? round2 : 0));
        }
    }

    static final class k extends AbstractC7737t implements Function1<Integer, C8008p> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f73636b = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8008p invoke(Integer num) {
            return new C8008p(num.intValue());
        }
    }

    static final class l extends AbstractC7737t implements Function1<C8008p, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f73637b = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(C8008p c8008p) {
            return Integer.valueOf((int) c8008p.f());
        }
    }

    static final class m extends AbstractC7737t implements Function1<C7459e, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f73638b = new m(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(C7459e c7459e) {
            long n11 = c7459e.n();
            return new C8010q(C7459e.g(n11), C7459e.h(n11));
        }
    }

    static final class n extends AbstractC7737t implements Function1<C8010q, C7459e> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f73639b = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final C7459e invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            return C7459e.a(P9.a.a(c8010q2.f(), c8010q2.g()));
        }
    }

    static final class o extends AbstractC7737t implements Function1<C7460f, C8013s> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f73640b = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8013s invoke(C7460f c7460f) {
            C7460f c7460f2 = c7460f;
            return new C8013s(c7460f2.n(), c7460f2.q(), c7460f2.o(), c7460f2.h());
        }
    }

    static final class p extends AbstractC7737t implements Function1<C8013s, C7460f> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f73641b = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final C7460f invoke(C8013s c8013s) {
            C8013s c8013s2 = c8013s;
            return new C7460f(c8013s2.f(), c8013s2.g(), c8013s2.h(), c8013s2.i());
        }
    }

    static final class q extends AbstractC7737t implements Function1<C7464j, C8010q> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f73642b = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final C8010q invoke(C7464j c7464j) {
            long i11 = c7464j.i();
            return new C8010q(C7464j.f(i11), C7464j.d(i11));
        }
    }

    static final class r extends AbstractC7737t implements Function1<C8010q, C7464j> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f73643b = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final C7464j invoke(C8010q c8010q) {
            C8010q c8010q2 = c8010q;
            return C7464j.a(C7465k.a(c8010q2.f(), c8010q2.g()));
        }
    }

    @NotNull
    public static final <T, V extends AbstractC8015t> U0<T, V> a(@NotNull Function1<? super T, ? extends V> function1, @NotNull Function1<? super V, ? extends T> function12) {
        return new V0(function1, function12);
    }

    @NotNull
    public static final U0 b() {
        return f73616a;
    }

    @NotNull
    public static final U0 c() {
        return f73617b;
    }

    @NotNull
    public static final U0 d() {
        return f73624i;
    }

    @NotNull
    public static final U0 e() {
        return f73618c;
    }

    @NotNull
    public static final U0 f() {
        return f73619d;
    }

    @NotNull
    public static final U0 g() {
        return f73620e;
    }

    @NotNull
    public static final U0 h() {
        return f73621f;
    }

    @NotNull
    public static final U0 i() {
        return f73622g;
    }

    @NotNull
    public static final U0 j() {
        return f73623h;
    }
}
