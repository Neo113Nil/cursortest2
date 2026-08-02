package ri0;

import Gi0.g;
import Jb.f;
import Jb.i;
import Mi0.o;
import Mi0.s;
import d70.l;
import ei0.InterfaceC6369b;
import f30.k;
import ij0.InterfaceC7086a;
import ij0.InterfaceC7087b;
import ij0.InterfaceC7088c;
import lj0.C7967a;
import nj0.InterfaceC8600a;
import oi0.e;
import pi0.h;
import ri0.InterfaceC9284c;
import ru.ozon.android.messenger.framework.data.i;
import ru.ozon.android.messenger.framework.domain.usecases.C;
import ru.ozon.android.messenger.framework.domain.usecases.C9401s;
import si0.C9700a;
import sj0.InterfaceC9701a;
import tj0.InterfaceC9881a;
import tj0.InterfaceC9882b;
import ui0.C10062a;
import vj0.C10326a;
import yi0.C10908a;
import yi0.C10909b;

/* renamed from: ri0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9282a {

    /* renamed from: ri0.a$a, reason: collision with other inner class name */
    private static final class C1427a implements InterfaceC9284c {

        /* renamed from: A, reason: collision with root package name */
        private Pc.a<InterfaceC9882b> f83538A;

        /* renamed from: B, reason: collision with root package name */
        private Pc.a<InterfaceC9881a> f83539B;

        /* renamed from: C, reason: collision with root package name */
        private R70.c f83540C;

        /* renamed from: D, reason: collision with root package name */
        private Pc.a<C10062a> f83541D;

        /* renamed from: E, reason: collision with root package name */
        private Pc.a<InterfaceC7087b> f83542E;

        /* renamed from: F, reason: collision with root package name */
        private Pc.a<xi0.d> f83543F;

        /* renamed from: G, reason: collision with root package name */
        private Pc.a<ij0.d> f83544G;

        /* renamed from: H, reason: collision with root package name */
        private Pc.a<C10908a> f83545H;

        /* renamed from: I, reason: collision with root package name */
        private Pc.a<e> f83546I;

        /* renamed from: a, reason: collision with root package name */
        private Pc.a<Gi0.a> f83547a = Jb.d.b(Gi0.b.a());

        /* renamed from: b, reason: collision with root package name */
        private f f83548b;

        /* renamed from: c, reason: collision with root package name */
        private Pc.a<ij0.e> f83549c;

        /* renamed from: d, reason: collision with root package name */
        private Ri0.c f83550d;

        /* renamed from: e, reason: collision with root package name */
        private Pc.a<InterfaceC7088c> f83551e;

        /* renamed from: f, reason: collision with root package name */
        private Pc.a<kj0.b> f83552f;

        /* renamed from: g, reason: collision with root package name */
        private Pc.a<Gi0.e> f83553g;

        /* renamed from: h, reason: collision with root package name */
        private f f83554h;

        /* renamed from: i, reason: collision with root package name */
        private Pc.a<InterfaceC8600a> f83555i;

        /* renamed from: j, reason: collision with root package name */
        private Pc.a<InterfaceC7086a> f83556j;

        /* renamed from: k, reason: collision with root package name */
        private Pc.a<ij0.f> f83557k;

        /* renamed from: l, reason: collision with root package name */
        private Vi0.e f83558l;

        /* renamed from: m, reason: collision with root package name */
        private f f83559m;

        /* renamed from: n, reason: collision with root package name */
        private Pa0.e f83560n;

        /* renamed from: o, reason: collision with root package name */
        private Pc.a<Ai0.a> f83561o;

        /* renamed from: p, reason: collision with root package name */
        private Pc.a<Ai0.c> f83562p;

        /* renamed from: q, reason: collision with root package name */
        private Pc.a<Ai0.a> f83563q;

        /* renamed from: r, reason: collision with root package name */
        private Pc.a<Ai0.b> f83564r;

        /* renamed from: s, reason: collision with root package name */
        private s f83565s;

        /* renamed from: t, reason: collision with root package name */
        private Pc.a<kj0.b> f83566t;

        /* renamed from: u, reason: collision with root package name */
        private Pc.a<InterfaceC9701a<Hi0.a>> f83567u;

        /* renamed from: v, reason: collision with root package name */
        private Pc.a<InterfaceC8600a> f83568v;

        /* renamed from: w, reason: collision with root package name */
        private Ui0.e f83569w;

        /* renamed from: x, reason: collision with root package name */
        private Pc.a<g> f83570x;

        /* renamed from: y, reason: collision with root package name */
        private Pc.a<C10326a> f83571y;

        /* renamed from: z, reason: collision with root package name */
        private Pc.a<InterfaceC9882b> f83572z;

        C1427a(C9700a c9700a, C7967a c7967a, InterfaceC6369b interfaceC6369b, h hVar) {
            f a11 = f.a(c7967a);
            this.f83548b = a11;
            Pc.a<ij0.e> b11 = Jb.d.b(new O70.c(c9700a, a11));
            this.f83549c = b11;
            this.f83550d = new Ri0.c(this.f83547a, b11);
            Pc.a<InterfaceC7088c> b12 = Jb.d.b(new ru.ozon.android.messenger.framework.data.remote.serialize.d(c9700a, this.f83548b));
            this.f83551e = b12;
            this.f83552f = Jb.d.b(new C9401s(c9700a, b12));
            this.f83553g = Jb.d.b(Gi0.f.a());
            this.f83554h = f.a(hVar);
            this.f83555i = Jb.d.b(new si0.d(c9700a));
            this.f83556j = Jb.d.b(new Ua0.b(c9700a, this.f83548b));
            Pc.a<ij0.f> b13 = Jb.d.b(new O80.b(c9700a, this.f83548b));
            this.f83557k = b13;
            this.f83558l = new Vi0.e(this.f83554h, this.f83552f, this.f83553g, this.f83555i, this.f83556j, b13);
            f a12 = f.a(interfaceC6369b);
            this.f83559m = a12;
            this.f83560n = new Pa0.e(a12, 3);
            this.f83561o = Jb.d.b(new Pa0.b(a12, 3));
            this.f83562p = Jb.d.b(new Bi0.h(this.f83559m, 0));
            this.f83563q = Jb.d.b(new Bi0.b(this.f83559m, 0));
            Pc.a<Ai0.b> b14 = Jb.d.b(new Bi0.e(this.f83559m, 0));
            this.f83564r = b14;
            this.f83565s = new s(this.f83559m, new Ni0.b(this.f83560n, this.f83561o, this.f83562p, this.f83563q, b14));
            this.f83566t = Jb.d.b(new si0.c(c9700a, this.f83551e));
            this.f83567u = Jb.d.b(Gi0.d.a());
            Pc.a<InterfaceC8600a> b15 = Jb.d.b(new k(c9700a, 2));
            this.f83568v = b15;
            this.f83569w = new Ui0.e(this.f83554h, this.f83566t, this.f83567u, b15, this.f83556j, this.f83557k);
            this.f83570x = Jb.d.b(Gi0.h.a());
            Pc.a<C10326a> b16 = Jb.d.b(new i(this.f83559m));
            this.f83571y = b16;
            this.f83572z = Jb.d.b(new P80.a(b16, 1));
            this.f83538A = Jb.d.b(new si0.e(this.f83571y));
            Pc.a<InterfaceC9881a> b17 = Jb.d.b(new C(this.f83571y, 1));
            this.f83539B = b17;
            this.f83540C = new R70.c(this.f83570x, this.f83572z, this.f83538A, b17);
            i.a b18 = Jb.i.b(5);
            b18.b(Ri0.b.class, this.f83550d);
            b18.b(Vi0.d.class, this.f83558l);
            b18.b(o.class, this.f83565s);
            b18.b(Ui0.d.class, this.f83569w);
            b18.b(Wi0.b.class, this.f83540C);
            this.f83541D = Jb.d.b(new La0.b(b18.a(), 3));
            Pc.a<InterfaceC7087b> b19 = Jb.d.b(new si0.b(c9700a, this.f83548b));
            this.f83542E = b19;
            this.f83543F = Jb.d.b(new P30.e(b19, this.f83554h, 3));
            Pc.a<ij0.d> b21 = Jb.d.b(new L30.e(c9700a, this.f83548b));
            this.f83544G = b21;
            this.f83545H = Jb.d.b(new C10909b(this.f83559m, b21));
            this.f83546I = Jb.d.b(new l(this.f83559m, (Pc.a) this.f83542E, this.f83560n, (Pc.a) this.f83561o, (Pc.a) this.f83562p, (Pc.a) this.f83563q, (Pc.a) this.f83564r, (Pc.a) this.f83549c, (Pc.a) this.f83572z, (Pc.a) this.f83539B));
        }

        @Override // ri0.InterfaceC9284c
        public final xi0.d a() {
            return this.f83543F.get();
        }

        @Override // ri0.InterfaceC9284c
        public final C10908a b() {
            return this.f83545H.get();
        }

        @Override // ri0.InterfaceC9284c
        public final e getActionHandler() {
            return this.f83546I.get();
        }

        @Override // ri0.InterfaceC9284c
        public final C10062a getViewModelFactory() {
            return this.f83541D.get();
        }
    }

    /* renamed from: ri0.a$b */
    private static final class b implements InterfaceC9284c.a {
        @Override // ri0.InterfaceC9284c.a
        public final InterfaceC9284c a(C7967a c7967a, InterfaceC6369b interfaceC6369b, Xi0.a aVar, h hVar) {
            c7967a.getClass();
            interfaceC6369b.getClass();
            aVar.getClass();
            return new C1427a(new C9700a(), c7967a, interfaceC6369b, hVar);
        }
    }

    public static InterfaceC9284c.a a() {
        return new b();
    }
}
