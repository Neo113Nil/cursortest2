package w90;

import B90.v0;
import B90.w0;
import Jb.i;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.z0;
import c90.InterfaceC5773a;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import g30.InterfaceC6618a;
import m40.InterfaceC8077a;
import n90.InterfaceC8456a;
import o40.InterfaceC8640a;
import ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonFragment;
import ru.ozon.fintech.preferences.presentation.camera.FintechCameraSettingsFragment;
import ru.ozon.fintech.preferences.presentation.cbdc.FintechCbdcFragment;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.ozon.fintech.preferences.presentation.logcat.FintechLogCatFragment;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.fintech.preferences.presentation.playground.InputPlaygroundFragment;
import ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV1.TestingFeaturesV1EditFragment;
import ru.ozon.fintech.preferences.presentation.testingFeaturesV2.TestingFeaturesV2EditFragment;
import ru.ozon.fintech.preferences.presentation.theme.FintechThemeFragment;
import s30.InterfaceC9590a;
import w90.f;
import y30.InterfaceC10835a;

/* renamed from: w90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10450a implements w90.b {

    /* renamed from: A, reason: collision with root package name */
    private z90.f f103632A;

    /* renamed from: B, reason: collision with root package name */
    private Pc.a<v30.d> f103633B;

    /* renamed from: C, reason: collision with root package name */
    private y90.c f103634C;

    /* renamed from: D, reason: collision with root package name */
    private G90.b f103635D;

    /* renamed from: E, reason: collision with root package name */
    private H90.c f103636E;

    /* renamed from: F, reason: collision with root package name */
    private Pc.a<Moshi> f103637F;

    /* renamed from: G, reason: collision with root package name */
    private E90.n f103638G;

    /* renamed from: H, reason: collision with root package name */
    private Pc.a<R30.a> f103639H;

    /* renamed from: I, reason: collision with root package name */
    private A90.h f103640I;

    /* renamed from: J, reason: collision with root package name */
    private Pc.a<z0.b> f103641J;

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f103642a;

    /* renamed from: b, reason: collision with root package name */
    private final O90.a f103643b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<Application> f103644c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f103645d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<S80.b> f103646e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<S30.a> f103647f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<A30.m> f103648g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<h90.f> f103649h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<K40.a> f103650i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<InterfaceC5773a> f103651j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<V70.b> f103652k;

    /* renamed from: l, reason: collision with root package name */
    private Pc.a<P60.o> f103653l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f103654m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<SharedPreferences> f103655n;

    /* renamed from: o, reason: collision with root package name */
    private Pc.a<InterfaceC8640a> f103656o;

    /* renamed from: p, reason: collision with root package name */
    private Pc.a<Q90.n> f103657p;

    /* renamed from: q, reason: collision with root package name */
    private Pc.a<O30.b> f103658q;

    /* renamed from: r, reason: collision with root package name */
    private w0 f103659r;

    /* renamed from: s, reason: collision with root package name */
    private D90.k f103660s;

    /* renamed from: t, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f103661t;

    /* renamed from: u, reason: collision with root package name */
    private I90.h f103662u;

    /* renamed from: v, reason: collision with root package name */
    private Pc.a<Context> f103663v;

    /* renamed from: w, reason: collision with root package name */
    private Pc.a<U30.a> f103664w;

    /* renamed from: x, reason: collision with root package name */
    private Pc.a<r90.f> f103665x;

    /* renamed from: y, reason: collision with root package name */
    private C90.e f103666y;

    /* renamed from: z, reason: collision with root package name */
    private F90.f f103667z;

    /* renamed from: w90.a$a, reason: collision with other inner class name */
    private static final class C2248a implements Pc.a<S30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103668a;

        C2248a(P30.b bVar) {
            this.f103668a = bVar;
        }

        @Override // Pc.a
        public final S30.a get() {
            S30.a applicationInfoDataSource = this.f103668a.getApplicationInfoDataSource();
            Jb.j.c(applicationInfoDataSource);
            return applicationInfoDataSource;
        }
    }

    /* renamed from: w90.a$b */
    private static final class b implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f103669a;

        b(InterfaceC6422b interfaceC6422b) {
            this.f103669a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f103669a.G0();
            Jb.j.c(G02);
            return G02;
        }
    }

    /* renamed from: w90.a$c */
    private static final class c implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f103670a;

        c(Y20.a aVar) {
            this.f103670a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f103670a.B();
            Jb.j.c(B11);
            return B11;
        }
    }

    /* renamed from: w90.a$d */
    private static final class d implements Pc.a<A30.m> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC10835a f103671a;

        d(InterfaceC10835a interfaceC10835a) {
            this.f103671a = interfaceC10835a;
        }

        @Override // Pc.a
        public final A30.m get() {
            A30.m a12 = this.f103671a.a1();
            Jb.j.c(a12);
            return a12;
        }
    }

    /* renamed from: w90.a$e */
    private static final class e implements Pc.a<U30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103672a;

        e(P30.b bVar) {
            this.f103672a = bVar;
        }

        @Override // Pc.a
        public final U30.a get() {
            U30.a r12 = this.f103672a.r1();
            Jb.j.c(r12);
            return r12;
        }
    }

    /* renamed from: w90.a$f */
    private static final class f implements Pc.a<r90.f> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8456a f103673a;

        f(InterfaceC8456a interfaceC8456a) {
            this.f103673a = interfaceC8456a;
        }

        @Override // Pc.a
        public final r90.f get() {
            return this.f103673a.f0();
        }
    }

    /* renamed from: w90.a$g */
    private static final class g implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f103674a;

        g(O90.a aVar) {
            this.f103674a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f103674a.w0();
            Jb.j.c(w02);
            return w02;
        }
    }

    /* renamed from: w90.a$h */
    private static final class h implements Pc.a<Q90.n> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f103675a;

        h(O90.a aVar) {
            this.f103675a = aVar;
        }

        @Override // Pc.a
        public final Q90.n get() {
            Q90.n e12 = this.f103675a.e1();
            Jb.j.c(e12);
            return e12;
        }
    }

    /* renamed from: w90.a$i */
    private static final class i implements Pc.a<InterfaceC8640a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8077a f103676a;

        i(InterfaceC8077a interfaceC8077a) {
            this.f103676a = interfaceC8077a;
        }

        @Override // Pc.a
        public final InterfaceC8640a get() {
            InterfaceC8640a T11 = this.f103676a.T();
            Jb.j.c(T11);
            return T11;
        }
    }

    /* renamed from: w90.a$j */
    private static final class j implements Pc.a<h90.f> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6469a f103677a;

        j(InterfaceC6469a interfaceC6469a) {
            this.f103677a = interfaceC6469a;
        }

        @Override // Pc.a
        public final h90.f get() {
            h90.f g12 = this.f103677a.g1();
            Jb.j.c(g12);
            return g12;
        }
    }

    /* renamed from: w90.a$k */
    private static final class k implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103678a;

        k(P30.b bVar) {
            this.f103678a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f103678a.getSharedPreferences();
            Jb.j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    /* renamed from: w90.a$l */
    private static final class l implements Pc.a<InterfaceC5773a> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f103679a;

        l(Z80.a aVar) {
            this.f103679a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC5773a get() {
            InterfaceC5773a T02 = this.f103679a.T0();
            Jb.j.c(T02);
            return T02;
        }
    }

    /* renamed from: w90.a$m */
    private static final class m implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103680a;

        m(P30.b bVar) {
            this.f103680a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f103680a.f();
            Jb.j.c(f7);
            return f7;
        }
    }

    /* renamed from: w90.a$n */
    private static final class n implements Pc.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103681a;

        n(P30.b bVar) {
            this.f103681a = bVar;
        }

        @Override // Pc.a
        public final Application get() {
            Application m12 = this.f103681a.m1();
            Jb.j.c(m12);
            return m12;
        }
    }

    /* renamed from: w90.a$o */
    private static final class o implements Pc.a<V70.b> {

        /* renamed from: a, reason: collision with root package name */
        private final T70.a f103682a;

        o(T70.a aVar) {
            this.f103682a = aVar;
        }

        @Override // Pc.a
        public final V70.b get() {
            V70.b L11 = this.f103682a.L();
            Jb.j.c(L11);
            return L11;
        }
    }

    /* renamed from: w90.a$p */
    private static final class p implements Pc.a<K40.a> {

        /* renamed from: a, reason: collision with root package name */
        private final I40.a f103683a;

        p(I40.a aVar) {
            this.f103683a = aVar;
        }

        @Override // Pc.a
        public final K40.a get() {
            K40.a D02 = this.f103683a.D0();
            Jb.j.c(D02);
            return D02;
        }
    }

    /* renamed from: w90.a$q */
    private static final class q implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103684a;

        q(P30.b bVar) {
            this.f103684a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f103684a.h();
            Jb.j.c(h11);
            return h11;
        }
    }

    /* renamed from: w90.a$r */
    private static final class r implements Pc.a<v30.d> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC9590a f103685a;

        r(InterfaceC9590a interfaceC9590a) {
            this.f103685a = interfaceC9590a;
        }

        @Override // Pc.a
        public final v30.d get() {
            v30.d o12 = this.f103685a.o1();
            Jb.j.c(o12);
            return o12;
        }
    }

    /* renamed from: w90.a$s */
    private static final class s implements Pc.a<O30.b> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f103686a;

        s(P30.b bVar) {
            this.f103686a = bVar;
        }

        @Override // Pc.a
        public final O30.b get() {
            O30.b M02 = this.f103686a.M0();
            Jb.j.c(M02);
            return M02;
        }
    }

    /* renamed from: w90.a$t */
    private static final class t implements Pc.a<P60.o> {

        /* renamed from: a, reason: collision with root package name */
        private final N60.a f103687a;

        t(N60.a aVar) {
            this.f103687a = aVar;
        }

        @Override // Pc.a
        public final P60.o get() {
            P60.o b12 = this.f103687a.b1();
            Jb.j.c(b12);
            return b12;
        }
    }

    /* renamed from: w90.a$u */
    private static final class u implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f103688a;

        u(M80.a aVar) {
            this.f103688a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f103688a.d0();
            Jb.j.c(d02);
            return d02;
        }
    }

    C10450a(InterfaceC10835a interfaceC10835a, P30.b bVar, M80.a aVar, O90.a aVar2, InterfaceC6469a interfaceC6469a, I40.a aVar3, InterfaceC8456a interfaceC8456a, T70.a aVar4, N60.a aVar5, InterfaceC6422b interfaceC6422b, Z80.a aVar6, Y20.a aVar7, InterfaceC8077a interfaceC8077a, InterfaceC9590a interfaceC9590a, Z30.a aVar8) {
        w90.f fVar;
        this.f103642a = aVar7;
        this.f103643b = aVar2;
        n nVar = new n(bVar);
        this.f103644c = nVar;
        g gVar = new g(aVar2);
        this.f103645d = gVar;
        u uVar = new u(aVar);
        this.f103646e = uVar;
        C2248a c2248a = new C2248a(bVar);
        this.f103647f = c2248a;
        d dVar = new d(interfaceC10835a);
        this.f103648g = dVar;
        j jVar = new j(interfaceC6469a);
        this.f103649h = jVar;
        p pVar = new p(aVar3);
        this.f103650i = pVar;
        l lVar = new l(aVar6);
        this.f103651j = lVar;
        o oVar = new o(aVar4);
        this.f103652k = oVar;
        t tVar = new t(aVar5);
        this.f103653l = tVar;
        c cVar = new c(aVar7);
        this.f103654m = cVar;
        k kVar = new k(bVar);
        this.f103655n = kVar;
        i iVar = new i(interfaceC8077a);
        this.f103656o = iVar;
        h hVar = new h(aVar2);
        this.f103657p = hVar;
        s sVar = new s(bVar);
        this.f103658q = sVar;
        this.f103659r = new w0(nVar, gVar, uVar, c2248a, dVar, jVar, pVar, lVar, oVar, tVar, cVar, kVar, iVar, hVar, sVar);
        this.f103660s = new D90.k(uVar, 0);
        b bVar2 = new b(interfaceC6422b);
        this.f103661t = bVar2;
        this.f103662u = new I90.h(gVar, uVar, pVar, hVar, bVar2, nVar, uVar, cVar);
        q qVar = new q(bVar);
        this.f103663v = qVar;
        e eVar = new e(bVar);
        this.f103664w = eVar;
        f fVar2 = new f(interfaceC8456a);
        this.f103665x = fVar2;
        this.f103666y = new C90.e(qVar, eVar, jVar, fVar2, uVar, gVar);
        this.f103667z = new F90.f(qVar, uVar, bVar2, 0);
        this.f103632A = new z90.f(nVar, uVar, gVar, bVar2, pVar, qVar);
        r rVar = new r(interfaceC9590a);
        this.f103633B = rVar;
        this.f103634C = new y90.c(rVar, uVar);
        this.f103635D = new G90.b(nVar, gVar, uVar, lVar);
        this.f103636E = new H90.c(nVar, gVar, uVar, lVar, 0);
        fVar = f.a.f103691a;
        Pc.a<Moshi> b11 = Jb.d.b(fVar);
        this.f103637F = b11;
        this.f103638G = new E90.n(this.f103646e, b11, 0);
        Jb.f a11 = Jb.f.a(aVar8);
        m mVar = new m(bVar);
        this.f103639H = mVar;
        this.f103640I = new A90.h(a11, this.f103663v, this.f103655n, this.f103646e, mVar);
        i.a b12 = Jb.i.b(11);
        b12.b(v0.class, this.f103659r);
        b12.b(D90.j.class, this.f103660s);
        b12.b(I90.f.class, this.f103662u);
        b12.b(ru.ozon.fintech.preferences.presentation.logcat.b.class, this.f103666y);
        b12.b(F90.e.class, this.f103667z);
        b12.b(z90.e.class, this.f103632A);
        b12.b(y90.b.class, this.f103634C);
        b12.b(G90.a.class, this.f103635D);
        b12.b(H90.b.class, this.f103636E);
        b12.b(E90.m.class, this.f103638G);
        b12.b(ru.ozon.fintech.preferences.presentation.cbdc.a.class, this.f103640I);
        this.f103641J = Jb.d.b(new w90.g(b12.a()));
    }

    @Override // w90.b
    public final void A0(FintechNativeBridgeTestingFragment fintechNativeBridgeTestingFragment) {
        fintechNativeBridgeTestingFragment.factory = this.f103641J.get();
        InterfaceC6618a B11 = this.f103642a.B();
        Jb.j.c(B11);
        fintechNativeBridgeTestingFragment.analyticsInteractor = B11;
    }

    @Override // w90.b
    public final void H0(AntifraudJsonFragment antifraudJsonFragment) {
        antifraudJsonFragment.f96637b = this.f103641J.get();
    }

    @Override // w90.b
    public final void L0(FintechPreferencesFragment fintechPreferencesFragment) {
        fintechPreferencesFragment.f96744i = this.f103641J.get();
    }

    @Override // w90.b
    public final void Z0(FintechCbdcFragment fintechCbdcFragment) {
        fintechCbdcFragment.f96682c = this.f103641J.get();
    }

    @Override // w90.b
    public final void i(FintechScannerSettingsFragment fintechScannerSettingsFragment) {
        fintechScannerSettingsFragment.f96912a = this.f103641J.get();
    }

    @Override // w90.b
    public final void o0(TestingFeaturesV1EditFragment testingFeaturesV1EditFragment) {
        testingFeaturesV1EditFragment.f96938b = this.f103641J.get();
    }

    @Override // w90.b
    public final void p1(FintechThemeFragment fintechThemeFragment) {
        fintechThemeFragment.factory = this.f103641J.get();
        InterfaceC6618a B11 = this.f103642a.B();
        Jb.j.c(B11);
        fintechThemeFragment.analyticsInteractor = B11;
        ru.ozon.fintech.settings.domain.a w02 = this.f103643b.w0();
        Jb.j.c(w02);
        fintechThemeFragment.f96991a = w02;
    }

    @Override // w90.b
    public final void q0(TestingFeaturesV2EditFragment testingFeaturesV2EditFragment) {
        testingFeaturesV2EditFragment.f96965b = this.f103641J.get();
    }

    @Override // w90.b
    public final void r(InputPlaygroundFragment inputPlaygroundFragment) {
        inputPlaygroundFragment.f96880a = this.f103641J.get();
    }

    @Override // w90.b
    public final void s(FintechCameraSettingsFragment fintechCameraSettingsFragment) {
        fintechCameraSettingsFragment.factory = this.f103641J.get();
        InterfaceC6618a B11 = this.f103642a.B();
        Jb.j.c(B11);
        fintechCameraSettingsFragment.analyticsInteractor = B11;
    }

    @Override // w90.b
    public final void v(FintechLogCatFragment fintechLogCatFragment) {
        fintechLogCatFragment.f96771b = this.f103641J.get();
    }
}
