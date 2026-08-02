package c70;

import Jb.i;
import We.E;
import a70.InterfaceC4958a;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.z0;
import com.squareup.moshi.Moshi;
import d40.InterfaceC6083a;
import f40.InterfaceC6422b;
import g30.InterfaceC6618a;
import i70.q;
import k70.C7605f;
import m70.C8101a;
import m70.C8102b;
import n90.InterfaceC8456a;
import ru.ozon.fintech.features.offline.data.model.cbottom.CbottomData;
import ru.ozon.fintech.features.offline.data.model.main.MainData;
import ru.ozon.fintech.features.offline.data.model.transfer.TransferData;
import ru.ozon.fintech.features.offline.network.OfflineNetwork;
import ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;
import ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment;
import ru.ozon.fintech.features.offline.presentation.sheethow.OfflineSheetHow;
import v40.C10226b;
import y30.InterfaceC10835a;

/* renamed from: c70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5759a implements InterfaceC5760b {

    /* renamed from: A, reason: collision with root package name */
    private Pc.a<r90.f> f56622A;

    /* renamed from: B, reason: collision with root package name */
    private C7605f f56623B;

    /* renamed from: C, reason: collision with root package name */
    private C8102b f56624C;

    /* renamed from: D, reason: collision with root package name */
    private Pc.a<K40.a> f56625D;

    /* renamed from: E, reason: collision with root package name */
    private q f56626E;

    /* renamed from: F, reason: collision with root package name */
    private Pc.a<z0.b> f56627F;

    /* renamed from: a, reason: collision with root package name */
    private final Y20.a f56628a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<S80.b> f56629b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f56630c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<E> f56631d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<U30.a> f56632e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<SharedPreferences> f56633f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<Z60.a> f56634g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<OfflineNetwork> f56635h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<InterfaceC4958a> f56636i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<K70.b> f56637j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<Moshi> f56638k;

    /* renamed from: l, reason: collision with root package name */
    private Pc.a<X60.a> f56639l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<Y60.b<MainData>> f56640m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<Y60.b<TransferData>> f56641n;

    /* renamed from: o, reason: collision with root package name */
    private Pc.a<Y60.b<CbottomData>> f56642o;

    /* renamed from: p, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f56643p;

    /* renamed from: q, reason: collision with root package name */
    private Pc.a<V60.a> f56644q;

    /* renamed from: r, reason: collision with root package name */
    private Pc.a<Q90.c> f56645r;

    /* renamed from: s, reason: collision with root package name */
    private Pc.a<R30.a> f56646s;

    /* renamed from: t, reason: collision with root package name */
    private Pc.a<c30.j> f56647t;

    /* renamed from: u, reason: collision with root package name */
    private Pc.a<K80.b> f56648u;

    /* renamed from: v, reason: collision with root package name */
    private Pc.a<A30.m> f56649v;

    /* renamed from: w, reason: collision with root package name */
    private Pc.a<d70.d> f56650w;

    /* renamed from: x, reason: collision with root package name */
    private Pc.a<Context> f56651x;

    /* renamed from: y, reason: collision with root package name */
    private g70.g f56652y;

    /* renamed from: z, reason: collision with root package name */
    private Pc.a<InterfaceC6083a> f56653z;

    /* renamed from: c70.a$a, reason: collision with other inner class name */
    private static final class C0853a implements Pc.a<InterfaceC6083a> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6422b f56654a;

        C0853a(InterfaceC6422b interfaceC6422b) {
            this.f56654a = interfaceC6422b;
        }

        @Override // Pc.a
        public final InterfaceC6083a get() {
            InterfaceC6083a G02 = this.f56654a.G0();
            Jb.j.c(G02);
            return G02;
        }
    }

    /* renamed from: c70.a$b */
    private static final class b implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f56655a;

        b(O90.a aVar) {
            this.f56655a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f56655a.F0();
            Jb.j.c(F02);
            return F02;
        }
    }

    /* renamed from: c70.a$c */
    private static final class c implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f56656a;

        c(Y20.a aVar) {
            this.f56656a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f56656a.B();
            Jb.j.c(B11);
            return B11;
        }
    }

    /* renamed from: c70.a$d */
    private static final class d implements Pc.a<A30.m> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC10835a f56657a;

        d(InterfaceC10835a interfaceC10835a) {
            this.f56657a = interfaceC10835a;
        }

        @Override // Pc.a
        public final A30.m get() {
            A30.m a12 = this.f56657a.a1();
            Jb.j.c(a12);
            return a12;
        }
    }

    /* renamed from: c70.a$e */
    private static final class e implements Pc.a<U30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f56658a;

        e(P30.b bVar) {
            this.f56658a = bVar;
        }

        @Override // Pc.a
        public final U30.a get() {
            U30.a r12 = this.f56658a.r1();
            Jb.j.c(r12);
            return r12;
        }
    }

    /* renamed from: c70.a$f */
    private static final class f implements Pc.a<r90.f> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC8456a f56659a;

        f(InterfaceC8456a interfaceC8456a) {
            this.f56659a = interfaceC8456a;
        }

        @Override // Pc.a
        public final r90.f get() {
            return this.f56659a.f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c70.a$g */
    static final class g implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f56660a;

        g(O90.a aVar) {
            this.f56660a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f56660a.w0();
            Jb.j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c70.a$h */
    static final class h implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f56661a;

        h(Z80.a aVar) {
            this.f56661a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f56661a.getOkHttpClient();
            Jb.j.c(okHttpClient);
            return okHttpClient;
        }
    }

    /* renamed from: c70.a$i */
    private static final class i implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f56662a;

        i(P30.b bVar) {
            this.f56662a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f56662a.getSharedPreferences();
            Jb.j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    /* renamed from: c70.a$j */
    private static final class j implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f56663a;

        j(P30.b bVar) {
            this.f56663a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f56663a.f();
            Jb.j.c(f7);
            return f7;
        }
    }

    /* renamed from: c70.a$k */
    private static final class k implements Pc.a<K40.a> {

        /* renamed from: a, reason: collision with root package name */
        private final I40.a f56664a;

        k(I40.a aVar) {
            this.f56664a = aVar;
        }

        @Override // Pc.a
        public final K40.a get() {
            K40.a D02 = this.f56664a.D0();
            Jb.j.c(D02);
            return D02;
        }
    }

    /* renamed from: c70.a$l */
    private static final class l implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f56665a;

        l(P30.b bVar) {
            this.f56665a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f56665a.h();
            Jb.j.c(h11);
            return h11;
        }
    }

    /* renamed from: c70.a$m */
    private static final class m implements Pc.a<K80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final H80.a f56666a;

        m(H80.a aVar) {
            this.f56666a = aVar;
        }

        @Override // Pc.a
        public final K80.b get() {
            K80.b u02 = this.f56666a.u0();
            Jb.j.c(u02);
            return u02;
        }
    }

    /* renamed from: c70.a$n */
    private static final class n implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f56667a;

        n(M80.a aVar) {
            this.f56667a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f56667a.d0();
            Jb.j.c(d02);
            return d02;
        }
    }

    /* renamed from: c70.a$o */
    private static final class o implements Pc.a<c30.j> {

        /* renamed from: a, reason: collision with root package name */
        private final Z20.a f56668a;

        o(Z20.a aVar) {
            this.f56668a = aVar;
        }

        @Override // Pc.a
        public final c30.j get() {
            c30.j H11 = this.f56668a.H();
            Jb.j.c(H11);
            return H11;
        }
    }

    /* renamed from: c70.a$p */
    private static final class p implements Pc.a<K70.b> {

        /* renamed from: a, reason: collision with root package name */
        private final I70.a f56669a;

        p(I70.a aVar) {
            this.f56669a = aVar;
        }

        @Override // Pc.a
        public final K70.b get() {
            K70.b G11 = this.f56669a.G();
            Jb.j.c(G11);
            return G11;
        }
    }

    C5759a(Y20.a aVar, Z80.a aVar2, P30.b bVar, M80.a aVar3, InterfaceC6422b interfaceC6422b, H80.a aVar4, O90.a aVar5, InterfaceC8456a interfaceC8456a, I40.a aVar6, InterfaceC10835a interfaceC10835a, I70.a aVar7, Z20.a aVar8) {
        this.f56628a = aVar;
        this.f56629b = new n(aVar3);
        this.f56630c = new g(aVar5);
        this.f56631d = new h(aVar2);
        e eVar = new e(bVar);
        this.f56632e = eVar;
        i iVar = new i(bVar);
        this.f56633f = iVar;
        Pc.a<Z60.a> b11 = Jb.d.b(new Z60.c(eVar, iVar));
        this.f56634g = b11;
        Pc.a<OfflineNetwork> b12 = Jb.d.b(new c70.g(this.f56630c, this.f56631d, new c80.e(b11, 1)));
        this.f56635h = b12;
        this.f56636i = Jb.d.b(new K80.i(b12, 1));
        this.f56637j = new p(aVar7);
        this.f56638k = Jb.d.b(C10226b.a());
        Pc.a<X60.a> b13 = Jb.d.b(new X60.d(this.f56636i, this.f56634g, 0));
        this.f56639l = b13;
        this.f56640m = Jb.d.b(new c70.i(this.f56638k, b13, this.f56634g));
        this.f56641n = Jb.d.b(new c70.h(this.f56638k, this.f56639l, this.f56634g, 0));
        Pc.a<Y60.b<CbottomData>> b14 = Jb.d.b(new c70.f(this.f56638k, this.f56634g));
        this.f56642o = b14;
        c cVar = new c(aVar);
        this.f56643p = cVar;
        Pc.a<V60.a> b15 = Jb.d.b(new V60.k(this.f56636i, this.f56634g, this.f56637j, this.f56640m, this.f56641n, b14, cVar));
        this.f56644q = b15;
        b bVar2 = new b(aVar5);
        this.f56645r = bVar2;
        j jVar = new j(bVar);
        this.f56646s = jVar;
        o oVar = new o(aVar8);
        this.f56647t = oVar;
        m mVar = new m(aVar4);
        this.f56648u = mVar;
        d dVar = new d(interfaceC10835a);
        this.f56649v = dVar;
        Pc.a<d70.d> b16 = Jb.d.b(new d70.l(this.f56629b, b15, bVar2, jVar, oVar, this.f56643p, mVar, this.f56633f, this.f56638k, dVar));
        this.f56650w = b16;
        l lVar = new l(bVar);
        this.f56651x = lVar;
        Pc.a<S80.b> aVar9 = this.f56629b;
        Pc.a<V60.a> aVar10 = this.f56644q;
        Pc.a<InterfaceC6618a> aVar11 = this.f56643p;
        this.f56652y = new g70.g(lVar, aVar9, b16, aVar10, aVar11);
        C0853a c0853a = new C0853a(interfaceC6422b);
        this.f56653z = c0853a;
        f fVar = new f(interfaceC8456a);
        this.f56622A = fVar;
        this.f56623B = new C7605f(lVar, aVar9, c0853a, fVar, aVar10, aVar11);
        this.f56624C = new C8102b(new Pa0.e(this.f56638k, 2), c0853a, aVar9, aVar10, aVar11);
        k kVar = new k(aVar6);
        this.f56625D = kVar;
        this.f56626E = new q(lVar, aVar9, b16, c0853a, kVar, this.f56646s, this.f56645r, this.f56630c, aVar10, aVar11);
        i.a b17 = Jb.i.b(4);
        b17.b(g70.f.class, this.f56652y);
        b17.b(ru.ozon.fintech.features.offline.presentation.select.a.class, this.f56623B);
        b17.b(C8101a.class, this.f56624C);
        b17.b(i70.l.class, this.f56626E);
        this.f56627F = Jb.d.b(new c70.j(b17.a()));
    }

    @Override // c70.InterfaceC5760b
    public final void K0(OfflineMainFragment offlineMainFragment) {
        offlineMainFragment.factory = this.f56627F.get();
        InterfaceC6618a B11 = this.f56628a.B();
        Jb.j.c(B11);
        offlineMainFragment.analyticsInteractor = B11;
    }

    @Override // U60.a
    public final d70.d j() {
        return this.f56650w.get();
    }

    @Override // c70.InterfaceC5760b
    public final void t1(OfflinePayFragment offlinePayFragment) {
        offlinePayFragment.factory = this.f56627F.get();
        InterfaceC6618a B11 = this.f56628a.B();
        Jb.j.c(B11);
        offlinePayFragment.analyticsInteractor = B11;
    }

    @Override // c70.InterfaceC5760b
    public final void v1(OfflineSelectFragment offlineSelectFragment) {
        offlineSelectFragment.factory = this.f56627F.get();
        InterfaceC6618a B11 = this.f56628a.B();
        Jb.j.c(B11);
        offlineSelectFragment.analyticsInteractor = B11;
    }

    @Override // c70.InterfaceC5760b
    public final void y0(OfflineSheetHow offlineSheetHow) {
        offlineSheetHow.factory = this.f56627F.get();
        InterfaceC6618a B11 = this.f56628a.B();
        Jb.j.c(B11);
        offlineSheetHow.analyticsInteractor = B11;
        offlineSheetHow.f95789f = this.f56627F.get();
    }
}
