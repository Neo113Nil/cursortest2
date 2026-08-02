package Ej;

import Ej.p;
import Fj.A;
import Fj.C1155a;
import Fj.C1156b;
import Fj.C1159e;
import Fj.C1161g;
import Fj.C1162h;
import Fj.H;
import Fj.I;
import Fj.InterfaceC1157c;
import Fj.u;
import Fj.v;
import android.media.AudioManager;
import retrofit2.Retrofit;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_GetApplicationConfigurationFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetExecutorServiceFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.talk.android.internal.call.TalkCallActivity;
import zendesk.talk.android.internal.call.service.TalkCallService;
import zendesk.talk.android.internal.call.setup.TalkCallSetupActivity;
import zendesk.talk.android.internal.call.setup.b;

/* loaded from: classes5.dex */
public abstract class k {

    public static final class b implements InterfaceC1157c.a {

        /* renamed from: a, reason: collision with root package name */
        public final g f3147a;

        @Override // Fj.InterfaceC1157c.a
        public InterfaceC1157c create() {
            return new c(this.f3147a);
        }

        public b(g gVar) {
            this.f3147a = gVar;
        }
    }

    public static final class c implements InterfaceC1157c {

        /* renamed from: a, reason: collision with root package name */
        public final g f3148a;

        /* renamed from: b, reason: collision with root package name */
        public final c f3149b = this;

        /* renamed from: c, reason: collision with root package name */
        public Gg.e f3150c;

        /* renamed from: d, reason: collision with root package name */
        public Gg.e f3151d;

        /* renamed from: e, reason: collision with root package name */
        public Gg.e f3152e;

        /* renamed from: f, reason: collision with root package name */
        public Gg.e f3153f;

        /* renamed from: g, reason: collision with root package name */
        public Gg.e f3154g;

        /* renamed from: h, reason: collision with root package name */
        public Gg.e f3155h;

        public c(g gVar) {
            this.f3148a = gVar;
            c();
        }

        @Override // Fj.InterfaceC1157c
        public void a(TalkCallActivity talkCallActivity) {
            d(talkCallActivity);
        }

        @Override // Fj.InterfaceC1157c
        public void b(TalkCallService talkCallService) {
            e(talkCallService);
        }

        public final void c() {
            this.f3150c = C1159e.a(i.a(), o.a());
            Gg.e eVar = this.f3148a.f3171L;
            i a10 = i.a();
            g gVar = this.f3148a;
            this.f3151d = Jj.e.a(eVar, a10, gVar.f3187l, gVar.f3172M, gVar.f3173N);
            this.f3152e = Gg.a.d(Kj.c.a(this.f3148a.f3170K, A.a(), v.a(), this.f3150c, this.f3151d, i.a()));
            this.f3153f = u.a(this.f3148a.f3187l);
            C1161g a11 = C1161g.a(this.f3148a.f3174O);
            this.f3154g = a11;
            this.f3155h = I.a(this.f3152e, this.f3153f, a11, this.f3148a.f3175P);
        }

        public final TalkCallActivity d(TalkCallActivity talkCallActivity) {
            Fj.q.b(talkCallActivity, h());
            Fj.q.a(talkCallActivity, new C1162h());
            return talkCallActivity;
        }

        public final TalkCallService e(TalkCallService talkCallService) {
            Lj.d.d(talkCallService, g());
            Lj.d.b(talkCallService, f());
            Lj.d.c(talkCallService, (Kj.b) this.f3152e.get());
            Lj.d.a(talkCallService, (C1155a) this.f3148a.f3175P.get());
            return talkCallService;
        }

        public Lj.a f() {
            return new Lj.a(CoreModule_GetApplicationContextFactory.getApplicationContext(this.f3148a.f3177b), Ej.e.c(this.f3148a.f3179d));
        }

        public Lj.b g() {
            return new Lj.b(CoreModule_GetApplicationContextFactory.getApplicationContext(this.f3148a.f3177b), new C1162h());
        }

        public H h() {
            return new H(this.f3155h);
        }
    }

    public static final class d implements p.a {
        public d() {
        }

        @Override // Ej.p.a
        public p a(CoreModule coreModule) {
            Gg.d.b(coreModule);
            return new g(new l(), coreModule, new Vj.a(), new Wj.a(), new Ej.a());
        }
    }

    public static final class e implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final g f3156a;

        @Override // zendesk.talk.android.internal.call.setup.b.a
        public zendesk.talk.android.internal.call.setup.b create() {
            return new f(this.f3156a);
        }

        public e(g gVar) {
            this.f3156a = gVar;
        }
    }

    public static final class f implements zendesk.talk.android.internal.call.setup.b {

        /* renamed from: a, reason: collision with root package name */
        public final g f3157a;

        /* renamed from: b, reason: collision with root package name */
        public final f f3158b = this;

        /* renamed from: c, reason: collision with root package name */
        public Gg.e f3159c;

        public f(g gVar) {
            this.f3157a = gVar;
            g();
        }

        @Override // zendesk.talk.android.internal.call.setup.b
        public void a(Oj.d dVar) {
            i(dVar);
        }

        @Override // zendesk.talk.android.internal.call.setup.b
        public void b(zendesk.talk.android.internal.call.setup.a aVar) {
            j(aVar);
        }

        @Override // zendesk.talk.android.internal.call.setup.b
        public void c(Qj.g gVar) {
            l(gVar);
        }

        @Override // zendesk.talk.android.internal.call.setup.b
        public void d(Oj.i iVar) {
            m(iVar);
        }

        @Override // zendesk.talk.android.internal.call.setup.b
        public void e(TalkCallSetupActivity talkCallSetupActivity) {
            h(talkCallSetupActivity);
        }

        @Override // zendesk.talk.android.internal.call.setup.b
        public void f(Nj.e eVar) {
            k(eVar);
        }

        public final void g() {
            this.f3159c = Mj.p.a(Mj.n.a(), this.f3157a.f3170K);
        }

        public final TalkCallSetupActivity h(TalkCallSetupActivity talkCallSetupActivity) {
            Mj.e.b(talkCallSetupActivity, n());
            Mj.e.a(talkCallSetupActivity, this.f3157a.r());
            return talkCallSetupActivity;
        }

        public final Oj.d i(Oj.d dVar) {
            Oj.e.a(dVar, n());
            return dVar;
        }

        public final zendesk.talk.android.internal.call.setup.a j(zendesk.talk.android.internal.call.setup.a aVar) {
            Mj.m.a(aVar, n());
            return aVar;
        }

        public final Nj.e k(Nj.e eVar) {
            Nj.f.a(eVar, n());
            return eVar;
        }

        public final Qj.g l(Qj.g gVar) {
            Qj.h.a(gVar, n());
            return gVar;
        }

        public final Oj.i m(Oj.i iVar) {
            Oj.j.a(iVar, n());
            return iVar;
        }

        public Mj.o n() {
            return new Mj.o(this.f3159c);
        }
    }

    public static final class g implements p {

        /* renamed from: A, reason: collision with root package name */
        public Gg.e f3160A;

        /* renamed from: B, reason: collision with root package name */
        public Gg.e f3161B;

        /* renamed from: C, reason: collision with root package name */
        public Gg.e f3162C;

        /* renamed from: D, reason: collision with root package name */
        public Gg.e f3163D;

        /* renamed from: E, reason: collision with root package name */
        public Gg.e f3164E;

        /* renamed from: F, reason: collision with root package name */
        public Gg.e f3165F;

        /* renamed from: G, reason: collision with root package name */
        public Gg.e f3166G;

        /* renamed from: H, reason: collision with root package name */
        public Gg.e f3167H;

        /* renamed from: I, reason: collision with root package name */
        public Gg.e f3168I;

        /* renamed from: J, reason: collision with root package name */
        public Gg.e f3169J;

        /* renamed from: K, reason: collision with root package name */
        public Gg.e f3170K;

        /* renamed from: L, reason: collision with root package name */
        public Gg.e f3171L;

        /* renamed from: M, reason: collision with root package name */
        public Gg.e f3172M;

        /* renamed from: N, reason: collision with root package name */
        public Gg.e f3173N;

        /* renamed from: O, reason: collision with root package name */
        public Gg.e f3174O;

        /* renamed from: P, reason: collision with root package name */
        public Gg.e f3175P;

        /* renamed from: a, reason: collision with root package name */
        public final Vj.a f3176a;

        /* renamed from: b, reason: collision with root package name */
        public final CoreModule f3177b;

        /* renamed from: c, reason: collision with root package name */
        public final Wj.a f3178c;

        /* renamed from: d, reason: collision with root package name */
        public final Ej.a f3179d;

        /* renamed from: e, reason: collision with root package name */
        public final g f3180e = this;

        /* renamed from: f, reason: collision with root package name */
        public Gg.e f3181f;

        /* renamed from: g, reason: collision with root package name */
        public Gg.e f3182g;

        /* renamed from: h, reason: collision with root package name */
        public Gg.e f3183h;

        /* renamed from: i, reason: collision with root package name */
        public Gg.e f3184i;

        /* renamed from: j, reason: collision with root package name */
        public Gg.e f3185j;

        /* renamed from: k, reason: collision with root package name */
        public Gg.e f3186k;

        /* renamed from: l, reason: collision with root package name */
        public Gg.e f3187l;

        /* renamed from: m, reason: collision with root package name */
        public Gg.e f3188m;

        /* renamed from: n, reason: collision with root package name */
        public Gg.e f3189n;

        /* renamed from: o, reason: collision with root package name */
        public Gg.e f3190o;

        /* renamed from: p, reason: collision with root package name */
        public Gg.e f3191p;

        /* renamed from: q, reason: collision with root package name */
        public Gg.e f3192q;

        /* renamed from: r, reason: collision with root package name */
        public Gg.e f3193r;

        /* renamed from: s, reason: collision with root package name */
        public Gg.e f3194s;

        /* renamed from: t, reason: collision with root package name */
        public Gg.e f3195t;

        /* renamed from: u, reason: collision with root package name */
        public Gg.e f3196u;

        /* renamed from: v, reason: collision with root package name */
        public Gg.e f3197v;

        /* renamed from: w, reason: collision with root package name */
        public Gg.e f3198w;

        /* renamed from: x, reason: collision with root package name */
        public Gg.e f3199x;

        /* renamed from: y, reason: collision with root package name */
        public Gg.e f3200y;

        /* renamed from: z, reason: collision with root package name */
        public Gg.e f3201z;

        public g(l lVar, CoreModule coreModule, Vj.a aVar, Wj.a aVar2, Ej.a aVar3) {
            this.f3176a = aVar;
            this.f3177b = coreModule;
            this.f3178c = aVar2;
            this.f3179d = aVar3;
            n(lVar, coreModule, aVar, aVar2, aVar3);
            o(lVar, coreModule, aVar, aVar2, aVar3);
        }

        @Override // Ej.p
        public InterfaceC1157c.a a() {
            return new b(this.f3180e);
        }

        @Override // Ej.p
        public b.a b() {
            return new e(this.f3180e);
        }

        @Override // Ej.p
        public s c() {
            return new s(p(), r(), l());
        }

        public Wj.c f() {
            return new Wj.c(g(), new Wj.g());
        }

        public Wj.i g() {
            return Wj.b.c(this.f3178c, t());
        }

        public Gj.d h() {
            return new Gj.d(k(), i());
        }

        public Gj.f i() {
            return Ej.b.c(this.f3179d, j());
        }

        public Gj.i j() {
            return new Gj.i(new Gj.t(), k(), new Gj.n());
        }

        public AudioManager k() {
            return Ej.c.c(this.f3179d, CoreModule_GetApplicationContextFactory.getApplicationContext(this.f3177b));
        }

        public Ij.a l() {
            return new Ij.a(f(), m(), u(), new h(), s());
        }

        public Ij.c m() {
            return new Ij.c(new Rj.a());
        }

        public final void n(l lVar, CoreModule coreModule, Vj.a aVar, Wj.a aVar2, Ej.a aVar3) {
            this.f3181f = m.a(lVar);
            this.f3182g = CoreModule_GetApplicationConfigurationFactory.create(coreModule);
            this.f3183h = CoreModule_GetRestServiceProviderFactory.create(coreModule);
            Gg.e d10 = Gg.a.d(Sj.e.a());
            this.f3184i = d10;
            Gg.e d11 = Gg.a.d(Sj.c.a(this.f3183h, d10));
            this.f3185j = d11;
            this.f3186k = Gg.a.d(Sj.d.a(this.f3181f, this.f3182g, d11));
            CoreModule_GetApplicationContextFactory create = CoreModule_GetApplicationContextFactory.create(coreModule);
            this.f3187l = create;
            this.f3188m = Ej.c.a(aVar3, create);
            Xj.e a10 = Xj.e.a(this.f3187l);
            this.f3189n = a10;
            this.f3190o = Hj.h.a(a10);
            this.f3191p = Hj.d.a(this.f3187l);
            this.f3192q = Hj.l.a(this.f3187l);
            this.f3193r = Hj.f.a(this.f3189n);
            this.f3194s = Hj.j.a(i.a(), this.f3188m);
            this.f3195t = Ej.d.a(aVar3, this.f3187l);
            Hj.b a11 = Hj.b.a(this.f3190o, this.f3191p, this.f3192q, this.f3193r, this.f3194s, this.f3188m, i.a(), this.f3195t, this.f3187l);
            this.f3196u = a11;
            Gj.s a12 = Gj.s.a(this.f3188m, a11, Gj.b.a());
            this.f3197v = a12;
            this.f3198w = Gg.a.d(a12);
            r a13 = r.a(this.f3183h, this.f3186k, Sj.g.a());
            this.f3199x = a13;
            Vj.b a14 = Vj.b.a(aVar, a13);
            this.f3200y = a14;
            this.f3201z = Vj.d.a(a14, Vj.g.a(), i.a());
            this.f3160A = Qj.b.a(this.f3187l);
            Wj.b a15 = Wj.b.a(aVar2, this.f3199x);
            this.f3161B = a15;
            this.f3162C = Wj.d.a(a15, Wj.h.a());
            this.f3163D = Ij.d.a(Rj.b.a());
        }

        public final void o(l lVar, CoreModule coreModule, Vj.a aVar, Wj.a aVar2, Ej.a aVar3) {
            this.f3164E = Ij.f.a(this.f3187l, this.f3198w);
            Gj.j a10 = Gj.j.a(Gj.u.a(), this.f3188m, Gj.o.a());
            this.f3165F = a10;
            Ej.b a11 = Ej.b.a(aVar3, a10);
            this.f3166G = a11;
            Gj.e a12 = Gj.e.a(this.f3188m, a11);
            this.f3167H = a12;
            this.f3168I = Fj.s.a(a12);
            Ij.b a13 = Ij.b.a(this.f3162C, this.f3163D, this.f3164E, i.a(), this.f3168I);
            this.f3169J = a13;
            this.f3170K = t.a(this.f3201z, this.f3160A, a13);
            this.f3171L = Ej.g.a(aVar3, this.f3187l);
            this.f3172M = Ej.e.a(aVar3);
            this.f3173N = CoreModule_GetExecutorServiceFactory.create(coreModule);
            this.f3174O = Ej.f.a(aVar3, this.f3187l);
            this.f3175P = Gg.a.d(C1156b.a());
        }

        public Vj.c p() {
            return new Vj.c(q(), new Vj.f(), new h());
        }

        public Vj.h q() {
            return Vj.b.c(this.f3176a, t());
        }

        public Qj.a r() {
            return new Qj.a(CoreModule_GetApplicationContextFactory.getApplicationContext(this.f3177b));
        }

        public Fj.r s() {
            return new Fj.r(h());
        }

        public q t() {
            return new q(CoreModule_GetRestServiceProviderFactory.getRestServiceProvider(this.f3177b), (Retrofit) this.f3186k.get(), new Sj.f());
        }

        public Ij.e u() {
            return new Ij.e(CoreModule_GetApplicationContextFactory.getApplicationContext(this.f3177b), (Gj.q) this.f3198w.get());
        }
    }

    public static p.a a() {
        return new d();
    }
}
