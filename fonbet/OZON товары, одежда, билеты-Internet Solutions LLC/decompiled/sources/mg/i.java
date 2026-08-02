package mg;

import ig.p;
import ig.q;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    static final j<p> f74852a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final j<jg.g> f74853b = new b();

    /* renamed from: c, reason: collision with root package name */
    static final j<k> f74854c = new c();

    /* renamed from: d, reason: collision with root package name */
    static final j<p> f74855d = new d();

    /* renamed from: e, reason: collision with root package name */
    static final j<q> f74856e = new e();

    /* renamed from: f, reason: collision with root package name */
    static final j<ig.f> f74857f = new f();

    /* renamed from: g, reason: collision with root package name */
    static final j<ig.h> f74858g = new g();

    final class a implements j<p> {
        @Override // mg.j
        public final p a(mg.e eVar) {
            return (p) eVar.d(this);
        }
    }

    final class b implements j<jg.g> {
        @Override // mg.j
        public final jg.g a(mg.e eVar) {
            return (jg.g) eVar.d(this);
        }
    }

    final class c implements j<k> {
        @Override // mg.j
        public final k a(mg.e eVar) {
            return (k) eVar.d(this);
        }
    }

    final class d implements j<p> {
        @Override // mg.j
        public final p a(mg.e eVar) {
            p pVar = (p) eVar.d(i.f74852a);
            return pVar != null ? pVar : (p) eVar.d(i.f74856e);
        }
    }

    final class e implements j<q> {
        @Override // mg.j
        public final q a(mg.e eVar) {
            EnumC8145a enumC8145a = EnumC8145a.OFFSET_SECONDS;
            if (eVar.L(enumC8145a)) {
                return q.u(eVar.Q(enumC8145a));
            }
            return null;
        }
    }

    final class f implements j<ig.f> {
        @Override // mg.j
        public final ig.f a(mg.e eVar) {
            EnumC8145a enumC8145a = EnumC8145a.EPOCH_DAY;
            if (eVar.L(enumC8145a)) {
                return ig.f.J1(eVar.m(enumC8145a));
            }
            return null;
        }
    }

    final class g implements j<ig.h> {
        @Override // mg.j
        public final ig.h a(mg.e eVar) {
            EnumC8145a enumC8145a = EnumC8145a.NANO_OF_DAY;
            if (eVar.L(enumC8145a)) {
                return ig.h.c1(eVar.m(enumC8145a));
            }
            return null;
        }
    }

    public static final j<jg.g> a() {
        return f74853b;
    }

    public static final j<ig.f> b() {
        return f74857f;
    }

    public static final j<ig.h> c() {
        return f74858g;
    }

    public static final j<q> d() {
        return f74856e;
    }

    public static final j<k> e() {
        return f74854c;
    }

    public static final j<p> f() {
        return f74855d;
    }

    public static final j<p> g() {
        return f74852a;
    }
}
