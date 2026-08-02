package f30;

import We.E;
import android.content.Context;
import android.content.SharedPreferences;
import c30.C5742a;
import com.appsflyer.AppsFlyerLib;
import com.squareup.moshi.Moshi;
import d30.InterfaceC6070a;
import f30.d;
import f30.e;
import g30.InterfaceC6618a;
import h30.C6793a;
import i30.C7004a;
import i30.C7005b;
import l30.C7864b;
import m90.C8110a;
import n30.C8438b;
import p30.C8850b;
import q30.C8982b;
import ru.ozon.fintech.analytic.db.GraylogDatabase;
import ru.ozon.fintech.analytic.db.MobileHealthDatabase;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;
import ru.ozon.fintech.analytic.network.GraylogNetwork;
import ru.ozon.fintech.analytic.network.MobileHealthNetwork;

/* loaded from: classes3.dex */
final class q implements InterfaceC6415a {

    /* renamed from: A, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f62559A;

    /* renamed from: B, reason: collision with root package name */
    private Pc.a<E> f62560B;

    /* renamed from: C, reason: collision with root package name */
    private Pc.a<GraylogNetwork> f62561C;

    /* renamed from: D, reason: collision with root package name */
    private Pc.a<MobileHealthNetwork> f62562D;

    /* renamed from: a, reason: collision with root package name */
    private final C7004a f62563a;

    /* renamed from: b, reason: collision with root package name */
    private final C7005b f62564b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<Context> f62565c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<AppsFlyerLib> f62566d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<SharedPreferences> f62567e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<C6793a> f62568f;

    /* renamed from: g, reason: collision with root package name */
    private Jb.f f62569g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<C8438b> f62570h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<S30.a> f62571i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<GraylogDatabase> f62572j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<InterfaceC6070a> f62573k;

    /* renamed from: l, reason: collision with root package name */
    private Jb.f f62574l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<C8982b> f62575m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<R30.a> f62576n;

    /* renamed from: o, reason: collision with root package name */
    private Pc.a<O30.b> f62577o;

    /* renamed from: p, reason: collision with root package name */
    private Pc.a<j30.c> f62578p;

    /* renamed from: q, reason: collision with root package name */
    private Pc.a<MobileHealthDatabase> f62579q;

    /* renamed from: r, reason: collision with root package name */
    private Pc.a<d30.l> f62580r;

    /* renamed from: s, reason: collision with root package name */
    private Jb.f f62581s;

    /* renamed from: t, reason: collision with root package name */
    private Pc.a<Moshi> f62582t;

    /* renamed from: u, reason: collision with root package name */
    private Pc.a<c30.i> f62583u;

    /* renamed from: v, reason: collision with root package name */
    private Pc.a<c30.j> f62584v;

    /* renamed from: w, reason: collision with root package name */
    private Pc.a<C5742a> f62585w;

    /* renamed from: x, reason: collision with root package name */
    private Pc.a<c30.b> f62586x;

    /* renamed from: y, reason: collision with root package name */
    private Pc.a<q30.c> f62587y;

    /* renamed from: z, reason: collision with root package name */
    private Pc.a<k30.g> f62588z;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Pc.a<S30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f62589a;

        a(P30.b bVar) {
            this.f62589a = bVar;
        }

        @Override // Pc.a
        public final S30.a get() {
            S30.a applicationInfoDataSource = this.f62589a.getApplicationInfoDataSource();
            Jb.j.c(applicationInfoDataSource);
            return applicationInfoDataSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f62590a;

        b(Z80.a aVar) {
            this.f62590a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f62590a.getOkHttpClient();
            Jb.j.c(okHttpClient);
            return okHttpClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f62591a;

        c(P30.b bVar) {
            this.f62591a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f62591a.getSharedPreferences();
            Jb.j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f62592a;

        d(P30.b bVar) {
            this.f62592a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f62592a.f();
            Jb.j.c(f7);
            return f7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements Pc.a<C5742a> {

        /* renamed from: a, reason: collision with root package name */
        private final Z20.a f62593a;

        e(Z20.a aVar) {
            this.f62593a = aVar;
        }

        @Override // Pc.a
        public final C5742a get() {
            C5742a p02 = this.f62593a.p0();
            Jb.j.c(p02);
            return p02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f62594a;

        f(P30.b bVar) {
            this.f62594a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f62594a.h();
            Jb.j.c(h11);
            return h11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g implements Pc.a<c30.b> {

        /* renamed from: a, reason: collision with root package name */
        private final Z20.a f62595a;

        g(Z20.a aVar) {
            this.f62595a = aVar;
        }

        @Override // Pc.a
        public final c30.b get() {
            c30.b s12 = this.f62595a.s1();
            Jb.j.c(s12);
            return s12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h implements Pc.a<O30.b> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f62596a;

        h(P30.b bVar) {
            this.f62596a = bVar;
        }

        @Override // Pc.a
        public final O30.b get() {
            O30.b M02 = this.f62596a.M0();
            Jb.j.c(M02);
            return M02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i implements Pc.a<c30.i> {

        /* renamed from: a, reason: collision with root package name */
        private final Z20.a f62597a;

        i(Z20.a aVar) {
            this.f62597a = aVar;
        }

        @Override // Pc.a
        public final c30.i get() {
            c30.i l12 = this.f62597a.l1();
            Jb.j.c(l12);
            return l12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j implements Pc.a<c30.j> {

        /* renamed from: a, reason: collision with root package name */
        private final Z20.a f62598a;

        j(Z20.a aVar) {
            this.f62598a = aVar;
        }

        @Override // Pc.a
        public final c30.j get() {
            c30.j H11 = this.f62598a.H();
            Jb.j.c(H11);
            return H11;
        }
    }

    q(P30.b bVar, AnalyticsConfig analyticsConfig, Z80.a aVar, C7004a c7004a, C8110a c8110a, C7005b c7005b, Z20.a aVar2) {
        f30.e eVar;
        f30.d dVar;
        this.f62563a = c7004a;
        this.f62564b = c7005b;
        this.f62565c = new f(bVar);
        eVar = e.a.f62513a;
        Pc.a<AppsFlyerLib> b11 = Jb.d.b(eVar);
        this.f62566d = b11;
        c cVar = new c(bVar);
        this.f62567e = cVar;
        this.f62568f = Jb.d.b(new f30.f(this.f62565c, b11, cVar));
        this.f62569g = Jb.f.a(analyticsConfig);
        this.f62570h = Jb.d.b(new O80.b(Jb.f.a(c8110a), 1));
        this.f62571i = new a(bVar);
        Pc.a<GraylogDatabase> b12 = Jb.d.b(new f30.h(this.f62565c));
        this.f62572j = b12;
        this.f62573k = Jb.m.a(new f30.g(b12, 0));
        Jb.f a11 = Jb.f.a(c7004a);
        this.f62574l = a11;
        Pc.a<C8982b> b13 = Jb.d.b(new d80.e(this.f62573k, a11, 1));
        this.f62575m = b13;
        d dVar2 = new d(bVar);
        this.f62576n = dVar2;
        h hVar = new h(bVar);
        this.f62577o = hVar;
        this.f62578p = Jb.d.b(new f30.i(this.f62574l, this.f62565c, b13, dVar2, hVar, this.f62571i));
        Pc.a<MobileHealthDatabase> b14 = Jb.d.b(new l(this.f62565c));
        this.f62579q = b14;
        this.f62580r = Jb.m.a(new k(b14, 0));
        this.f62581s = Jb.f.a(c7005b);
        dVar = d.a.f62512a;
        Pc.a<Moshi> a12 = Jb.m.a(dVar);
        this.f62582t = a12;
        i iVar = new i(aVar2);
        this.f62583u = iVar;
        j jVar = new j(aVar2);
        this.f62584v = jVar;
        e eVar2 = new e(aVar2);
        this.f62585w = eVar2;
        g gVar = new g(aVar2);
        this.f62586x = gVar;
        Pc.a<q30.c> b15 = Jb.d.b(new o(this.f62581s, this.f62565c, this.f62580r, this.f62577o, this.f62571i, a12, iVar, jVar, this.f62567e, eVar2, gVar));
        this.f62587y = b15;
        Pc.a<Context> aVar3 = this.f62565c;
        Pc.a<k30.g> b16 = Jb.d.b(new m(aVar3, b15, this.f62576n, this.f62577o, this.f62581s, new k30.c(aVar3, 0), this.f62567e));
        this.f62588z = b16;
        this.f62559A = Jb.d.b(new p(this.f62569g, this.f62565c, this.f62568f, this.f62570h, this.f62571i, this.f62578p, b16, this.f62582t, this.f62584v));
        b bVar2 = new b(aVar);
        this.f62560B = bVar2;
        this.f62561C = Jb.d.b(new f30.j(bVar2, C8850b.a()));
        this.f62562D = Jb.d.b(new n(this.f62581s, this.f62560B));
    }

    @Override // Y20.a
    public final InterfaceC6618a B() {
        return this.f62559A.get();
    }

    @Override // f30.InterfaceC6415a
    public final C7005b I() {
        return this.f62564b;
    }

    @Override // f30.InterfaceC6415a
    public final C7004a M() {
        return this.f62563a;
    }

    @Override // f30.InterfaceC6415a
    public final j30.c O0() {
        return this.f62578p.get();
    }

    @Override // Y20.a
    public final C7864b S0() {
        return new C7864b(this.f62559A.get());
    }

    @Override // f30.InterfaceC6415a
    public final C8982b c1() {
        return this.f62575m.get();
    }

    @Override // f30.InterfaceC6415a
    public final Moshi e() {
        return this.f62582t.get();
    }

    @Override // Y20.a
    public final m30.c g0() {
        return new m30.c(this.f62570h.get());
    }

    @Override // f30.InterfaceC6415a
    public final GraylogNetwork l0() {
        return this.f62561C.get();
    }

    @Override // f30.InterfaceC6415a
    public final q30.c s0() {
        return this.f62587y.get();
    }

    @Override // f30.InterfaceC6415a
    public final MobileHealthNetwork x0() {
        return this.f62562D.get();
    }
}
