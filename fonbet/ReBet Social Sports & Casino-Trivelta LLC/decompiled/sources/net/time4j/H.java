package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import li.AbstractC5469c;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;
import oi.EnumC5900A;
import oi.EnumC5901B;
import oi.H;
import oi.InterfaceC5903D;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import qi.EnumC6185f;

/* loaded from: classes5.dex */
public final class H extends oi.K implements InterfaceC5467a, InterfaceC5473g, InterfaceC5903D, net.time4j.format.h {

    /* renamed from: c, reason: collision with root package name */
    public static final H f57611c;

    /* renamed from: d, reason: collision with root package name */
    public static final H f57612d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f57613e;

    /* renamed from: f, reason: collision with root package name */
    public static final oi.H f57614f;

    /* renamed from: g, reason: collision with root package name */
    public static final oi.J f57615g;
    private static final long serialVersionUID = 7458380065762437714L;

    /* renamed from: a, reason: collision with root package name */
    public final transient F f57616a;

    /* renamed from: b, reason: collision with root package name */
    public final transient G f57617b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$ClockUnit;

        static {
            int[] iArr = new int[EnumC5714g.values().length];
            $SwitchMap$net$time4j$ClockUnit = iArr;
            try {
                iArr[EnumC5714g.f58143a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58144b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58145c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58146d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58147e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58148f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class d implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f57620a;

        public /* synthetic */ d(oi.p pVar, a aVar) {
            this(pVar);
        }

        public static d l(oi.p pVar) {
            return new d(pVar);
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(H h10) {
            return (oi.p) H.f57613e.get(this.f57620a);
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(H h10) {
            return (oi.p) H.f57613e.get(this.f57620a);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object e(H h10) {
            if (this.f57620a.Y()) {
                return h10.f57616a.c(this.f57620a);
            }
            if (this.f57620a.e0()) {
                return this.f57620a.c();
            }
            throw new oi.r("Missing rule for: " + this.f57620a.name());
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object i(H h10) {
            if (this.f57620a.Y()) {
                return h10.f57616a.m(this.f57620a);
            }
            if (this.f57620a.e0()) {
                return this.f57620a.d0();
            }
            throw new oi.r("Missing rule for: " + this.f57620a.name());
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Object p(H h10) {
            if (this.f57620a.Y()) {
                return h10.f57616a.j(this.f57620a);
            }
            if (this.f57620a.e0()) {
                return h10.f57617b.j(this.f57620a);
            }
            throw new oi.r("Missing rule for: " + this.f57620a.name());
        }

        public final long m(Object obj) {
            return ((Number) Number.class.cast(obj)).longValue();
        }

        @Override // oi.z
        public H q(H h10, Object obj, boolean z10) {
            if (obj == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            if (obj.equals(p(h10))) {
                return h10;
            }
            if (z10) {
                return (H) h10.E(AbstractC5469c.m(m(obj), m(p(h10))), (InterfaceC5729w) H.f57614f.G(this.f57620a));
            }
            if (this.f57620a.Y()) {
                return H.V((F) h10.f57616a.y(this.f57620a, obj), h10.f57617b);
            }
            if (!this.f57620a.e0()) {
                throw new oi.r("Missing rule for: " + this.f57620a.name());
            }
            if (Number.class.isAssignableFrom(this.f57620a.getType())) {
                long m10 = m(this.f57620a.d0());
                long m11 = m(this.f57620a.c());
                long m12 = m(obj);
                if (m10 > m12 || m11 < m12) {
                    throw new IllegalArgumentException("Out of range: " + obj);
                }
            } else if (this.f57620a.equals(G.f57584n) && obj.equals(G.f57583m)) {
                throw new IllegalArgumentException("Out of range: " + obj);
            }
            return H.V(h10.f57616a, (G) h10.f57617b.y(this.f57620a, obj));
        }

        public d(oi.p pVar) {
            this.f57620a = pVar;
        }

        @Override // oi.z
        public boolean isValid(H h10, Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.f57620a.Y()) {
                return h10.f57616a.isValid(this.f57620a, (oi.p) obj);
            }
            if (!this.f57620a.e0()) {
                throw new oi.r("Missing rule for: " + this.f57620a.name());
            }
            if (Number.class.isAssignableFrom(this.f57620a.getType())) {
                long m10 = m(this.f57620a.d0());
                long m11 = m(this.f57620a.c());
                long m12 = m(obj);
                return m10 <= m12 && m11 >= m12;
            }
            if (this.f57620a.equals(G.f57584n) && G.f57583m.equals(obj)) {
                return false;
            }
            return h10.f57617b.isValid(this.f57620a, (oi.p) obj);
        }
    }

    public static class e implements oi.u {
        public e() {
        }

        @Override // oi.u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H e(oi.q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
            G g10;
            net.time4j.tz.k kVar;
            if (qVar instanceof InterfaceC5472f) {
                InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57805d;
                if (interfaceC5908d.c(interfaceC5907c)) {
                    kVar = (net.time4j.tz.k) interfaceC5908d.a(interfaceC5907c);
                } else {
                    if (!z10) {
                        throw new IllegalArgumentException("Missing timezone attribute for type conversion.");
                    }
                    kVar = net.time4j.tz.p.f58410k;
                }
                return A.U((InterfaceC5472f) InterfaceC5472f.class.cast(qVar)).n0(kVar);
            }
            boolean z12 = z11 && qVar.e(G.f57594x) == 60;
            if (z12) {
                qVar.w(G.f57594x, 59);
            }
            oi.p pVar = F.f57534l;
            F f10 = qVar.f(pVar) ? (F) qVar.j(pVar) : (F) F.l0().e(qVar, interfaceC5908d, z10, false);
            if (f10 == null) {
                return null;
            }
            oi.p pVar2 = G.f57584n;
            if (qVar.f(pVar2)) {
                g10 = (G) qVar.j(pVar2);
            } else {
                g10 = (G) G.c0().e(qVar, interfaceC5908d, z10, false);
                if (g10 == null && z10) {
                    g10 = G.f57582l;
                }
            }
            if (g10 == null) {
                return null;
            }
            oi.p pVar3 = C5730x.f58414g;
            if (qVar.f(pVar3)) {
                f10 = (F) f10.E(((Long) qVar.j(pVar3)).longValue(), EnumC5706f.f57798h);
            }
            if (z12) {
                EnumC5901B enumC5901B = EnumC5901B.LEAP_SECOND;
                Boolean bool = Boolean.TRUE;
                if (qVar.isValid((oi.p) enumC5901B, (EnumC5901B) bool)) {
                    qVar.y(enumC5901B, bool);
                }
            }
            return H.V(f10, g10);
        }

        @Override // oi.u
        public oi.F b() {
            return oi.F.f61255a;
        }

        @Override // oi.u
        public oi.x d() {
            return null;
        }

        @Override // oi.u
        public int h() {
            return F.l0().h();
        }

        @Override // oi.u
        public String n(oi.y yVar, Locale locale) {
            net.time4j.format.e b10 = net.time4j.format.e.b(yVar.a());
            return net.time4j.format.b.u(b10, b10, locale);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // oi.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.o i(H h10, InterfaceC5908d interfaceC5908d) {
            return h10;
        }
    }

    static {
        H h10 = new H(F.f57526d, G.f57582l);
        f57611c = h10;
        F f10 = F.f57527e;
        oi.p pVar = G.f57584n;
        H h11 = new H(f10, (G) pVar.c());
        f57612d = h11;
        HashMap hashMap = new HashMap();
        oi.p pVar2 = F.f57534l;
        hashMap.put(pVar2, pVar);
        InterfaceC5703c interfaceC5703c = F.f57536n;
        K k10 = F.f57540r;
        hashMap.put(interfaceC5703c, k10);
        InterfaceC5703c interfaceC5703c2 = F.f57537o;
        hashMap.put(interfaceC5703c2, a0.f57689m.n());
        C c10 = F.f57538p;
        K k11 = F.f57544v;
        hashMap.put(c10, k11);
        C c11 = F.f57539q;
        K k12 = F.f57541s;
        hashMap.put(c11, k12);
        hashMap.put(k10, k12);
        hashMap.put(k12, pVar);
        C c12 = F.f57542t;
        hashMap.put(c12, pVar);
        K k13 = F.f57543u;
        hashMap.put(k13, pVar);
        hashMap.put(k11, pVar);
        D d10 = F.f57545w;
        hashMap.put(d10, pVar);
        d0 d0Var = G.f57586p;
        K k14 = G.f57589s;
        hashMap.put(d0Var, k14);
        InterfaceC5703c interfaceC5703c3 = G.f57587q;
        K k15 = G.f57592v;
        hashMap.put(interfaceC5703c3, k15);
        InterfaceC5703c interfaceC5703c4 = G.f57588r;
        hashMap.put(interfaceC5703c4, k15);
        hashMap.put(k14, k15);
        K k16 = G.f57590t;
        hashMap.put(k16, k15);
        K k17 = G.f57591u;
        hashMap.put(k17, k15);
        K k18 = G.f57594x;
        hashMap.put(k15, k18);
        K k19 = G.f57593w;
        hashMap.put(k19, k18);
        K k20 = G.f57562B;
        hashMap.put(k18, k20);
        K k21 = G.f57595y;
        hashMap.put(k21, k20);
        f57613e = Collections.unmodifiableMap(hashMap);
        H.b k22 = H.b.k(InterfaceC5729w.class, H.class, new e(null), h10, h11);
        d l10 = d.l(pVar2);
        EnumC5706f enumC5706f = EnumC5706f.f57798h;
        H.b e10 = k22.e(pVar2, l10, enumC5706f);
        d l11 = d.l(interfaceC5703c);
        EnumC5706f enumC5706f2 = EnumC5706f.f57794d;
        H.b e11 = e10.e(interfaceC5703c, l11, enumC5706f2).e(interfaceC5703c2, d.l(interfaceC5703c2), X.f57677a).e(c10, d.l(c10), EnumC5706f.f57795e);
        d l12 = d.l(c11);
        EnumC5706f enumC5706f3 = EnumC5706f.f57796f;
        H.b d11 = e11.e(c11, l12, enumC5706f3).e(k10, d.l(k10), enumC5706f3).e(k12, d.l(k12), enumC5706f).e(c12, d.l(c12), enumC5706f).e(k13, d.l(k13), enumC5706f).e(k11, d.l(k11), enumC5706f).e(d10, d.l(d10), EnumC5706f.f57797g).d(pVar, d.l(pVar)).d(d0Var, d.l(d0Var));
        d l13 = d.l(interfaceC5703c3);
        EnumC5714g enumC5714g = EnumC5714g.f58143a;
        H.b e12 = d11.e(interfaceC5703c3, l13, enumC5714g).e(interfaceC5703c4, d.l(interfaceC5703c4), enumC5714g).e(k14, d.l(k14), enumC5714g).e(k16, d.l(k16), enumC5714g).e(k17, d.l(k17), enumC5714g);
        d l14 = d.l(k15);
        EnumC5714g enumC5714g2 = EnumC5714g.f58144b;
        H.b e13 = e12.e(k15, l14, enumC5714g2).e(k19, d.l(k19), enumC5714g2);
        d l15 = d.l(k18);
        EnumC5714g enumC5714g3 = EnumC5714g.f58145c;
        H.b e14 = e13.e(k18, l15, enumC5714g3).e(k21, d.l(k21), enumC5714g3);
        K k23 = G.f57596z;
        d l16 = d.l(k23);
        EnumC5714g enumC5714g4 = EnumC5714g.f58146d;
        H.b e15 = e14.e(k23, l16, enumC5714g4);
        K k24 = G.f57561A;
        d l17 = d.l(k24);
        EnumC5714g enumC5714g5 = EnumC5714g.f58147e;
        H.b e16 = e15.e(k24, l17, enumC5714g5);
        d l18 = d.l(k20);
        EnumC5714g enumC5714g6 = EnumC5714g.f58148f;
        H.b e17 = e16.e(k20, l18, enumC5714g6);
        K k25 = G.f57563C;
        H.b e18 = e17.e(k25, d.l(k25), enumC5714g4);
        K k26 = G.f57564D;
        H.b e19 = e18.e(k26, d.l(k26), enumC5714g5);
        K k27 = G.f57565E;
        H.b e20 = e19.e(k27, d.l(k27), enumC5714g6);
        d0 d0Var2 = G.f57566F;
        H.b d12 = e20.d(d0Var2, new c(d0Var2));
        d0 d0Var3 = G.f57567G;
        H.b d13 = d12.d(d0Var3, new c(d0Var3));
        d0 d0Var4 = G.f57568H;
        H.b d14 = d13.d(d0Var4, new c(d0Var4));
        oi.p pVar3 = G.f57569I;
        H.b d15 = d14.d(pVar3, d.l(pVar3));
        W(d15);
        X(d15);
        Y(d15);
        f57614f = d15.h();
        f57615g = C5721n.g(enumC5706f2, enumC5706f3, enumC5706f, enumC5714g, enumC5714g2, enumC5714g3, enumC5714g6);
    }

    public H(F f10, G g10) {
        if (g10.q() == 24) {
            this.f57616a = (F) f10.E(1L, EnumC5706f.f57798h);
            this.f57617b = G.f57582l;
        } else {
            if (f10 == null) {
                throw new NullPointerException("Missing date.");
            }
            this.f57616a = f10;
            this.f57617b = g10;
        }
    }

    public static oi.H M() {
        return f57614f;
    }

    public static H O(InterfaceC5472f interfaceC5472f, net.time4j.tz.p pVar) {
        long k10 = interfaceC5472f.k() + pVar.j();
        int a10 = interfaceC5472f.a() + pVar.i();
        if (a10 < 0) {
            a10 += 1000000000;
            k10--;
        } else if (a10 >= 1000000000) {
            a10 -= 1000000000;
            k10++;
        }
        F G02 = F.G0(AbstractC5469c.b(k10, 86400), EnumC5900A.UNIX);
        int d10 = AbstractC5469c.d(k10, 86400);
        int i10 = d10 % 60;
        int i11 = d10 / 60;
        return V(G02, G.D0(i11 / 60, i11 % 60, i10, a10));
    }

    public static H U(int i10, int i11, int i12, int i13, int i14, int i15) {
        return V(F.B0(i10, i11, i12), G.C0(i13, i14, i15));
    }

    public static H V(F f10, G g10) {
        return new H(f10, g10);
    }

    public static void W(H.b bVar) {
        EnumSet range = EnumSet.range(EnumC5706f.f57791a, EnumC5706f.f57796f);
        EnumSet range2 = EnumSet.range(EnumC5706f.f57797g, EnumC5706f.f57798h);
        EnumC5706f[] values = EnumC5706f.values();
        int length = values.length;
        int i10 = 0;
        while (i10 < length) {
            EnumC5706f enumC5706f = values[i10];
            H.b bVar2 = bVar;
            bVar2.g(enumC5706f, new b(enumC5706f), enumC5706f.getLength(), enumC5706f.compareTo(EnumC5706f.f57797g) < 0 ? range : range2);
            i10++;
            bVar = bVar2;
        }
    }

    public static void X(H.b bVar) {
        for (EnumC5714g enumC5714g : EnumC5714g.values()) {
            bVar.g(enumC5714g, new b(enumC5714g), enumC5714g.getLength(), EnumSet.allOf(EnumC5714g.class));
        }
    }

    private static void Y(H.b bVar) {
        Iterator it = F.l0().t().iterator();
        while (it.hasNext()) {
            bVar.f((oi.s) it.next());
        }
        Iterator it2 = G.c0().t().iterator();
        while (it2.hasNext()) {
            bVar.f((oi.s) it2.next());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 8);
    }

    @Override // oi.q
    /* renamed from: B */
    public oi.H s() {
        return f57614f;
    }

    public A K(net.time4j.tz.p pVar) {
        long i10 = AbstractC5469c.i(this.f57616a.w0() + 730, 86400L) + (this.f57617b.q() * 3600) + (this.f57617b.l() * 60) + this.f57617b.i();
        long j10 = i10 - pVar.j();
        int a10 = this.f57617b.a() - pVar.i();
        if (a10 < 0) {
            a10 += 1000000000;
            j10--;
        } else if (a10 >= 1000000000) {
            a10 -= 1000000000;
            j10++;
        }
        return A.f0(j10, a10, EnumC6185f.POSIX);
    }

    public A L() {
        return K(net.time4j.tz.p.f58410k);
    }

    @Override // java.lang.Comparable
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public int compareTo(H h10) {
        if (this.f57616a.J(h10.f57616a)) {
            return 1;
        }
        if (this.f57616a.K(h10.f57616a)) {
            return -1;
        }
        return this.f57617b.A(h10.f57617b);
    }

    public F P() {
        return this.f57616a;
    }

    @Override // oi.q
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public H t() {
        return this;
    }

    public G R() {
        return this.f57617b;
    }

    public A S(net.time4j.tz.l lVar) {
        if (lVar.J()) {
            return K(lVar.A(this.f57616a, this.f57617b));
        }
        net.time4j.tz.o E10 = lVar.E();
        long b10 = E10.b(this.f57616a, this.f57617b, lVar);
        A f02 = A.f0(b10, this.f57617b.a(), EnumC6185f.POSIX);
        if (E10 == net.time4j.tz.l.f58349e) {
            A.Q(b10, this);
        }
        return f02;
    }

    public A T(net.time4j.tz.k kVar) {
        return S(net.time4j.tz.l.N(kVar));
    }

    public F Z() {
        return this.f57616a;
    }

    @Override // li.InterfaceC5473g
    public int a() {
        return this.f57617b.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            H h10 = (H) obj;
            if (this.f57616a.equals(h10.f57616a) && this.f57617b.equals(h10.f57617b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f57616a.hashCode() * 13) + (this.f57617b.hashCode() * 37);
    }

    @Override // li.InterfaceC5473g
    public int i() {
        return this.f57617b.i();
    }

    public boolean isValid(net.time4j.tz.k kVar) {
        if (kVar == null) {
            return false;
        }
        return !net.time4j.tz.l.N(kVar).K(this.f57616a, this.f57617b);
    }

    @Override // li.InterfaceC5473g
    public int l() {
        return this.f57617b.l();
    }

    @Override // li.InterfaceC5467a
    public int n() {
        return this.f57616a.n();
    }

    @Override // li.InterfaceC5467a
    public int o() {
        return this.f57616a.o();
    }

    @Override // li.InterfaceC5467a
    public int p() {
        return this.f57616a.p();
    }

    @Override // li.InterfaceC5473g
    public int q() {
        return this.f57617b.q();
    }

    @Override // li.InterfaceC5467a
    public String toString() {
        return this.f57616a.toString() + this.f57617b.toString();
    }

    public static class c extends d {
        public c(oi.p pVar) {
            super(pVar, null);
        }

        @Override // net.time4j.H.d
        /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public H q(H h10, BigDecimal bigDecimal, boolean z10) {
            if (isValid(h10, bigDecimal)) {
                return H.V(h10.f57616a, (G) h10.f57617b.y(this.f57620a, bigDecimal));
            }
            throw new IllegalArgumentException("Out of range: " + bigDecimal);
        }

        @Override // net.time4j.H.d
        public boolean isValid(H h10, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                return false;
            }
            return ((BigDecimal) this.f57620a.d0()).compareTo(bigDecimal) <= 0 && bigDecimal.compareTo((BigDecimal) this.f57620a.c()) <= 0;
        }
    }

    public static class b implements oi.M {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC5706f f57618a;

        /* renamed from: b, reason: collision with root package name */
        public final EnumC5714g f57619b;

        public b(EnumC5706f enumC5706f) {
            this.f57618a = enumC5706f;
            this.f57619b = null;
        }

        @Override // oi.M
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public H b(H h10, long j10) {
            F f10;
            G g10;
            if (this.f57618a != null) {
                f10 = (F) h10.f57616a.E(j10, this.f57618a);
                g10 = h10.f57617b;
            } else {
                C5717j J02 = h10.f57617b.J0(j10, this.f57619b);
                F f11 = (F) h10.f57616a.E(J02.a(), EnumC5706f.f57798h);
                G b10 = J02.b();
                f10 = f11;
                g10 = b10;
            }
            return H.V(f10, g10);
        }

        @Override // oi.M
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(H h10, H h11) {
            long f10;
            EnumC5706f enumC5706f = this.f57618a;
            if (enumC5706f != null) {
                long c10 = enumC5706f.c(h10.f57616a, h11.f57616a);
                if (c10 == 0) {
                    return c10;
                }
                if (this.f57618a != EnumC5706f.f57798h && ((F) h10.f57616a.E(c10, this.f57618a)).G(h11.f57616a) != 0) {
                    return c10;
                }
                G g10 = h10.f57617b;
                G g11 = h11.f57617b;
                return (c10 <= 0 || !g10.r0(g11)) ? (c10 >= 0 || !g10.s0(g11)) ? c10 : c10 + 1 : c10 - 1;
            }
            if (h10.f57616a.J(h11.f57616a)) {
                return -a(h11, h10);
            }
            long F10 = h10.f57616a.F(h11.f57616a, EnumC5706f.f57798h);
            if (F10 == 0) {
                return this.f57619b.c(h10.f57617b, h11.f57617b);
            }
            if (this.f57619b.compareTo(EnumC5714g.f58145c) <= 0) {
                long i10 = AbstractC5469c.i(F10, 86400L);
                G g12 = h11.f57617b;
                K k10 = G.f57595y;
                f10 = AbstractC5469c.f(i10, AbstractC5469c.m(((Integer) g12.j(k10)).longValue(), ((Integer) h10.f57617b.j(k10)).longValue()));
                if (h10.f57617b.a() > h11.f57617b.a()) {
                    f10--;
                }
            } else {
                long i11 = AbstractC5469c.i(F10, 86400000000000L);
                G g13 = h11.f57617b;
                K k11 = G.f57565E;
                f10 = AbstractC5469c.f(i11, AbstractC5469c.m(((Long) g13.j(k11)).longValue(), ((Long) h10.f57617b.j(k11)).longValue()));
            }
            switch (a.$SwitchMap$net$time4j$ClockUnit[this.f57619b.ordinal()]) {
                case 1:
                    return f10 / 3600;
                case 2:
                    return f10 / 60;
                case 3:
                case 6:
                    return f10;
                case 4:
                    return f10 / 1000000;
                case 5:
                    return f10 / 1000;
                default:
                    throw new UnsupportedOperationException(this.f57619b.name());
            }
        }

        public b(EnumC5714g enumC5714g) {
            this.f57618a = null;
            this.f57619b = enumC5714g;
        }
    }
}
