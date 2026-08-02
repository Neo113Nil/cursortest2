package z30;

import A30.m;
import We.E;
import android.content.Context;
import android.content.SharedPreferences;
import g30.InterfaceC6618a;
import r.n;
import retrofit2.Retrofit;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.auth.network.AuthNetworkApiV2;
import y30.InterfaceC10835a;
import z30.f;
import z30.g;

/* loaded from: classes3.dex */
final class j implements InterfaceC10835a {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f107231a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f107232b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<S80.b> f107233c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<E> f107234d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<Retrofit> f107235e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<AuthNetworkApiV2> f107236f;

    /* renamed from: g, reason: collision with root package name */
    private Jb.f f107237g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<SharedPreferences> f107238h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<C30.a> f107239i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<Context> f107240j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<n> f107241k;

    /* renamed from: l, reason: collision with root package name */
    private Pc.a<B30.a> f107242l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<Q90.c> f107243m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<A30.b> f107244n;

    /* renamed from: o, reason: collision with root package name */
    private Pc.a<B30.f> f107245o;

    /* renamed from: p, reason: collision with root package name */
    private Pc.a<m> f107246p;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Pc.a<Q90.c> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f107247a;

        a(O90.a aVar) {
            this.f107247a = aVar;
        }

        @Override // Pc.a
        public final Q90.c get() {
            Q90.c F02 = this.f107247a.F0();
            Jb.j.c(F02);
            return F02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f107248a;

        b(Y20.a aVar) {
            this.f107248a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f107248a.B();
            Jb.j.c(B11);
            return B11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f107249a;

        c(O90.a aVar) {
            this.f107249a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f107249a.w0();
            Jb.j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f107250a;

        d(Z80.a aVar) {
            this.f107250a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f107250a.getOkHttpClient();
            Jb.j.c(okHttpClient);
            return okHttpClient;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class e implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f107251a;

        e(P30.b bVar) {
            this.f107251a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f107251a.getSharedPreferences();
            Jb.j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    private static final class f implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f107252a;

        f(P30.b bVar) {
            this.f107252a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f107252a.h();
            Jb.j.c(h11);
            return h11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g implements Pc.a<S80.b> {

        /* renamed from: a, reason: collision with root package name */
        private final M80.a f107253a;

        g(M80.a aVar) {
            this.f107253a = aVar;
        }

        @Override // Pc.a
        public final S80.b get() {
            S80.b d02 = this.f107253a.d0();
            Jb.j.c(d02);
            return d02;
        }
    }

    j(Y20.a aVar, P30.b bVar, O90.a aVar2, Z80.a aVar3, M80.a aVar4, ExternalFintechAuth externalFintechAuth) {
        z30.f fVar;
        z30.g gVar;
        this.f107231a = new b(aVar);
        c cVar = new c(aVar2);
        this.f107232b = cVar;
        this.f107233c = new g(aVar4);
        d dVar = new d(aVar3);
        this.f107234d = dVar;
        Pc.a<Retrofit> b11 = Jb.d.b(new h(cVar, dVar));
        this.f107235e = b11;
        this.f107236f = Jb.d.b(new f30.g(b11, 1));
        this.f107237g = Jb.f.a(externalFintechAuth);
        this.f107238h = new e(bVar);
        fVar = f.a.f107216a;
        this.f107239i = Jb.d.b(fVar);
        f fVar2 = new f(bVar);
        this.f107240j = fVar2;
        Pc.a<n> b12 = Jb.d.b(new si0.b(fVar2));
        this.f107241k = b12;
        this.f107242l = Jb.d.b(new z30.d(b12, this.f107231a));
        a aVar5 = new a(aVar2);
        this.f107243m = aVar5;
        Pc.a<A30.b> b13 = Jb.d.b(new A30.c(this.f107238h, aVar5));
        this.f107244n = b13;
        Pc.a<B30.f> b14 = Jb.d.b(new z30.e(this.f107232b, this.f107238h, this.f107239i, this.f107242l, this.f107243m, b13, this.f107231a));
        this.f107245o = b14;
        Pc.a<InterfaceC6618a> aVar6 = this.f107231a;
        Pc.a<ru.ozon.fintech.settings.domain.a> aVar7 = this.f107232b;
        Pc.a<S80.b> aVar8 = this.f107233c;
        Pc.a<AuthNetworkApiV2> aVar9 = this.f107236f;
        Jb.f fVar3 = this.f107237g;
        Pc.a<Retrofit> aVar10 = this.f107235e;
        Pc.a<A30.b> aVar11 = this.f107244n;
        gVar = g.a.f107217a;
        this.f107246p = Jb.d.b(new i(aVar6, aVar7, aVar8, aVar9, fVar3, aVar10, b14, aVar11, gVar, this.f107243m, this.f107242l));
    }

    @Override // y30.InterfaceC10835a
    public final B30.a D() {
        return this.f107242l.get();
    }

    @Override // y30.InterfaceC10835a
    public final B30.f R0() {
        return this.f107245o.get();
    }

    @Override // y30.InterfaceC10835a
    public final m a1() {
        return this.f107246p.get();
    }
}
