package s10;

import Hj0.B;
import Hj0.C3164v;
import Hj0.E;
import Hj0.y;
import P10.c;
import QZ.a;
import f00.InterfaceC6396b;
import h20.C6787b;
import j10.InterfaceC7238a;
import l10.InterfaceC7851b;
import l10.f;
import m10.C8040b;
import m10.C8041c;
import m20.InterfaceC8046a;
import n20.k;
import r10.C9158a;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.composer.ui.widget.o;
import x10.C10644a;

/* loaded from: classes7.dex */
final class j implements InterfaceC9583b {

    /* renamed from: A, reason: collision with root package name */
    private Pc.a<C10644a> f98142A;

    /* renamed from: a, reason: collision with root package name */
    private final k<? extends InterfaceC8046a<?, ? extends l20.c>> f98143a;

    /* renamed from: b, reason: collision with root package name */
    private final RZ.a f98144b;

    /* renamed from: c, reason: collision with root package name */
    private final X10.f f98145c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6396b f98146d;

    /* renamed from: e, reason: collision with root package name */
    private Jb.f f98147e;

    /* renamed from: f, reason: collision with root package name */
    private Jb.f f98148f;

    /* renamed from: g, reason: collision with root package name */
    private Jb.f f98149g;

    /* renamed from: h, reason: collision with root package name */
    private Pc.a<C6787b> f98150h;

    /* renamed from: i, reason: collision with root package name */
    private Jb.f f98151i;

    /* renamed from: j, reason: collision with root package name */
    private Pc.a<o> f98152j;

    /* renamed from: k, reason: collision with root package name */
    private Pc.a<K00.i<l>> f98153k;

    /* renamed from: l, reason: collision with root package name */
    private Jb.f f98154l;

    /* renamed from: m, reason: collision with root package name */
    private Jb.f f98155m;

    /* renamed from: n, reason: collision with root package name */
    private Pc.a<M10.a> f98156n;

    /* renamed from: o, reason: collision with root package name */
    private Pc.a<ru.ozon.composer.ui.widget.f> f98157o;

    /* renamed from: p, reason: collision with root package name */
    private H10.e f98158p;

    /* renamed from: q, reason: collision with root package name */
    private K10.b f98159q;

    /* renamed from: r, reason: collision with root package name */
    private Pc.a<H10.a> f98160r;

    /* renamed from: s, reason: collision with root package name */
    private Pc.a<QZ.a<l>> f98161s;

    /* renamed from: t, reason: collision with root package name */
    private Pc.a<InterfaceC7238a<l>> f98162t;

    /* renamed from: u, reason: collision with root package name */
    private Pc.a<InterfaceC7851b> f98163u;

    /* renamed from: v, reason: collision with root package name */
    private Pc.a<ru.ozon.composer.ui.widget.a> f98164v;

    /* renamed from: w, reason: collision with root package name */
    private Pc.a<C8040b> f98165w;

    /* renamed from: x, reason: collision with root package name */
    private Pc.a<jk0.g<ru.ozon.composer.ui.widget.k<l20.c>>> f98166x;

    /* renamed from: y, reason: collision with root package name */
    private Jb.f f98167y;

    /* renamed from: z, reason: collision with root package name */
    private Pc.a<C9158a> f98168z;

    j(d dVar, K00.a aVar, RZ.a aVar2, k kVar, a.C0454a c0454a, E10.c cVar, X10.f fVar, f.EnumC1196f enumC1196f, InterfaceC6396b interfaceC6396b) {
        this.f98143a = kVar;
        this.f98144b = aVar2;
        this.f98145c = fVar;
        this.f98146d = interfaceC6396b;
        this.f98147e = Jb.f.a(c0454a);
        this.f98148f = Jb.f.a(aVar);
        this.f98149g = Jb.f.a(kVar);
        this.f98150h = Jb.d.b(new Ed0.f(dVar));
        Jb.f a11 = Jb.f.a(fVar);
        this.f98151i = a11;
        Pc.a<o> b11 = Jb.d.b(new B(dVar, this.f98149g, this.f98150h, a11));
        this.f98152j = b11;
        this.f98153k = Jb.d.b(new i(dVar, this.f98148f, b11, this.f98149g));
        this.f98154l = Jb.f.a(aVar2);
        this.f98155m = Jb.f.a(cVar);
        this.f98156n = Jb.d.b(new h(dVar));
        Pc.a<ru.ozon.composer.ui.widget.f> b12 = Jb.d.b(new E(dVar));
        this.f98157o = b12;
        this.f98158p = new H10.e(this.f98155m, this.f98156n, b12, this.f98151i);
        this.f98159q = new K10.b(Jb.f.a(enumC1196f));
        this.f98160r = Jb.d.b(H10.b.a());
        Pc.a<QZ.a<l>> b13 = Jb.d.b(new e(dVar, this.f98147e, this.f98148f, this.f98153k, this.f98154l, this.f98149g, this.f98152j, this.f98158p, this.f98159q, K10.d.a(), this.f98160r, I10.b.a(), J10.c.a()));
        this.f98161s = b13;
        this.f98162t = Jb.d.b(new y(dVar, b13, 1));
        this.f98163u = Jb.d.b(new C3164v(dVar, this.f98161s, 1));
        Pc.a<ru.ozon.composer.ui.widget.a> b14 = Jb.d.b(new g(dVar, this.f98149g));
        this.f98164v = b14;
        this.f98165w = Jb.d.b(new C8041c(b14));
        Pc.a<jk0.g<ru.ozon.composer.ui.widget.k<l20.c>>> b15 = Jb.d.b(new f(dVar, 0));
        this.f98166x = b15;
        this.f98167y = m10.f.b(new m10.g(this.f98149g, this.f98164v, this.f98157o, this.f98150h, this.f98156n, b15, this.f98165w));
        this.f98168z = Jb.d.b(new Ed0.d(dVar, this.f98162t, 1));
        this.f98142A = Jb.d.b(new Ed0.a(dVar, Jb.f.a(interfaceC6396b), 1));
    }

    @Override // s10.InterfaceC9583b
    public final C10644a a() {
        return this.f98142A.get();
    }

    @Override // s10.InterfaceC9583b
    public final m10.e b() {
        return (m10.e) this.f98167y.get();
    }

    @Override // s10.InterfaceC9583b
    public final InterfaceC6396b c() {
        return this.f98146d;
    }

    @Override // s10.InterfaceC9583b
    public final M10.a d() {
        return this.f98156n.get();
    }

    @Override // s10.InterfaceC9583b
    public final c.a e() {
        return new c.a(this.f98143a, new P10.k(this.f98165w.get()));
    }

    @Override // s10.InterfaceC9583b
    public final C9158a f() {
        return this.f98168z.get();
    }

    @Override // s10.InterfaceC9582a
    public final ru.ozon.composer.ui.widget.a g() {
        return this.f98164v.get();
    }

    @Override // s10.InterfaceC9582a
    public final QZ.a<l> getComposer() {
        return this.f98161s.get();
    }

    @Override // s10.InterfaceC9583b
    public final RZ.a getComposerAnalytics() {
        return this.f98144b;
    }

    @Override // s10.InterfaceC9582a
    public final InterfaceC7851b getComposerController() {
        return this.f98163u.get();
    }

    @Override // s10.InterfaceC9582a
    public final InterfaceC7238a<l> getComposerStore() {
        return this.f98162t.get();
    }

    @Override // s10.InterfaceC9582a
    public final ru.ozon.composer.ui.widget.f getViewedPond() {
        return this.f98157o.get();
    }

    @Override // s10.InterfaceC9583b
    public final k<? extends InterfaceC8046a<?, ? extends l20.c>> getWidgetStore() {
        return this.f98143a;
    }

    @Override // s10.InterfaceC9583b
    public final X10.f h() {
        return this.f98145c;
    }

    public final C6787b i() {
        return this.f98150h.get();
    }
}
