package g90;

import A30.m;
import Jb.j;
import We.E;
import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import g90.g;
import h90.k;
import i90.InterfaceC7024a;
import j90.C7312c;
import j90.InterfaceC7310a;
import ru.ozon.fintech.notifications.network.FintechNotificationApi;
import y30.InterfaceC10835a;

/* renamed from: g90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6680a implements InterfaceC6681b {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<E> f64117a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<ru.ozon.fintech.settings.domain.a> f64118b;

    /* renamed from: c, reason: collision with root package name */
    private Pc.a<FintechNotificationApi> f64119c;

    /* renamed from: d, reason: collision with root package name */
    private Pc.a<InterfaceC7310a> f64120d;

    /* renamed from: e, reason: collision with root package name */
    private Pc.a<Context> f64121e;

    /* renamed from: f, reason: collision with root package name */
    private Pc.a<InterfaceC7024a> f64122f;

    /* renamed from: g, reason: collision with root package name */
    private Pc.a<m> f64123g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<S30.a> f64124h;

    /* renamed from: i, reason: collision with root package name */
    private Pc.a<InterfaceC6618a> f64125i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<SharedPreferences> f64126j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<R30.a> f64127k;

    /* renamed from: l, reason: collision with root package name */
    private Pc.a<h90.f> f64128l;

    /* renamed from: m, reason: collision with root package name */
    private Pc.a<Moshi> f64129m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<k> f64130n;

    /* renamed from: g90.a$a, reason: collision with other inner class name */
    private static final class C1038a implements Pc.a<S30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f64131a;

        C1038a(P30.b bVar) {
            this.f64131a = bVar;
        }

        @Override // Pc.a
        public final S30.a get() {
            S30.a applicationInfoDataSource = this.f64131a.getApplicationInfoDataSource();
            j.c(applicationInfoDataSource);
            return applicationInfoDataSource;
        }
    }

    /* renamed from: g90.a$b */
    private static final class b implements Pc.a<InterfaceC6618a> {

        /* renamed from: a, reason: collision with root package name */
        private final Y20.a f64132a;

        b(Y20.a aVar) {
            this.f64132a = aVar;
        }

        @Override // Pc.a
        public final InterfaceC6618a get() {
            InterfaceC6618a B11 = this.f64132a.B();
            j.c(B11);
            return B11;
        }
    }

    /* renamed from: g90.a$c */
    private static final class c implements Pc.a<m> {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC10835a f64133a;

        c(InterfaceC10835a interfaceC10835a) {
            this.f64133a = interfaceC10835a;
        }

        @Override // Pc.a
        public final m get() {
            m a12 = this.f64133a.a1();
            j.c(a12);
            return a12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g90.a$d */
    static final class d implements Pc.a<ru.ozon.fintech.settings.domain.a> {

        /* renamed from: a, reason: collision with root package name */
        private final O90.a f64134a;

        d(O90.a aVar) {
            this.f64134a = aVar;
        }

        @Override // Pc.a
        public final ru.ozon.fintech.settings.domain.a get() {
            ru.ozon.fintech.settings.domain.a w02 = this.f64134a.w0();
            j.c(w02);
            return w02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g90.a$e */
    static final class e implements Pc.a<E> {

        /* renamed from: a, reason: collision with root package name */
        private final Z80.a f64135a;

        e(Z80.a aVar) {
            this.f64135a = aVar;
        }

        @Override // Pc.a
        public final E get() {
            E okHttpClient = this.f64135a.getOkHttpClient();
            j.c(okHttpClient);
            return okHttpClient;
        }
    }

    /* renamed from: g90.a$f */
    private static final class f implements Pc.a<SharedPreferences> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f64136a;

        f(P30.b bVar) {
            this.f64136a = bVar;
        }

        @Override // Pc.a
        public final SharedPreferences get() {
            SharedPreferences sharedPreferences = this.f64136a.getSharedPreferences();
            j.c(sharedPreferences);
            return sharedPreferences;
        }
    }

    /* renamed from: g90.a$g */
    private static final class g implements Pc.a<R30.a> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f64137a;

        g(P30.b bVar) {
            this.f64137a = bVar;
        }

        @Override // Pc.a
        public final R30.a get() {
            R30.a f7 = this.f64137a.f();
            j.c(f7);
            return f7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g90.a$h */
    static final class h implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f64138a;

        h(P30.b bVar) {
            this.f64138a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f64138a.h();
            j.c(h11);
            return h11;
        }
    }

    C6680a(O90.a aVar, P30.b bVar, Y20.a aVar2, Z80.a aVar3, InterfaceC10835a interfaceC10835a) {
        g90.g gVar;
        e eVar = new e(aVar3);
        this.f64117a = eVar;
        d dVar = new d(aVar);
        this.f64118b = dVar;
        Pc.a<FintechNotificationApi> b11 = Jb.d.b(new g90.f(eVar, dVar));
        this.f64119c = b11;
        this.f64120d = Jb.d.b(new C7312c(b11, 0));
        h hVar = new h(bVar);
        this.f64121e = hVar;
        Pc.a<InterfaceC7024a> b12 = Jb.d.b(new P80.c(hVar, 2));
        this.f64122f = b12;
        c cVar = new c(interfaceC10835a);
        this.f64123g = cVar;
        C1038a c1038a = new C1038a(bVar);
        this.f64124h = c1038a;
        b bVar2 = new b(aVar2);
        this.f64125i = bVar2;
        f fVar = new f(bVar);
        this.f64126j = fVar;
        g gVar2 = new g(bVar);
        this.f64127k = gVar2;
        this.f64128l = Jb.d.b(new h90.j(this.f64120d, b12, this.f64118b, this.f64121e, cVar, c1038a, bVar2, fVar, gVar2));
        gVar = g.a.f64143a;
        Pc.a<Moshi> b13 = Jb.d.b(gVar);
        this.f64129m = b13;
        this.f64130n = Jb.d.b(new h90.e(this.f64128l, this.f64125i, this.f64120d, this.f64118b, b13, new g90.e(this.f64121e)));
    }

    @Override // f90.InterfaceC6469a
    public final h90.f g1() {
        return this.f64128l.get();
    }

    @Override // f90.InterfaceC6469a
    public final k q() {
        return this.f64130n.get();
    }
}
