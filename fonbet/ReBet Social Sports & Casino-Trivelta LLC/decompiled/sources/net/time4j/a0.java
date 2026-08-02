package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.AbstractC5470d;
import li.InterfaceC5467a;
import oi.AbstractC5909e;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.InterfaceC5918n;

/* loaded from: classes5.dex */
public final class a0 implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final Map f57688l = new ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final a0 f57689m = new a0(Y.MONDAY, 4, Y.SATURDAY, Y.SUNDAY);

    /* renamed from: n, reason: collision with root package name */
    public static final net.time4j.format.y f57690n;
    private static final long serialVersionUID = 7794495882610436763L;

    /* renamed from: a, reason: collision with root package name */
    public final transient Y f57691a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f57692b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Y f57693c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Y f57694d;

    /* renamed from: e, reason: collision with root package name */
    public final transient InterfaceC5703c f57695e;

    /* renamed from: f, reason: collision with root package name */
    public final transient InterfaceC5703c f57696f;

    /* renamed from: g, reason: collision with root package name */
    public final transient InterfaceC5703c f57697g;

    /* renamed from: h, reason: collision with root package name */
    public final transient InterfaceC5703c f57698h;

    /* renamed from: i, reason: collision with root package name */
    public final transient C f57699i;

    /* renamed from: j, reason: collision with root package name */
    public final transient Set f57700j;

    /* renamed from: k, reason: collision with root package name */
    public final transient InterfaceC5918n f57701k;

    public class a implements InterfaceC5918n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y f57702a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y f57703b;

        public a(Y y10, Y y11) {
            this.f57702a = y10;
            this.f57703b = y11;
        }

        @Override // oi.InterfaceC5918n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(InterfaceC5467a interfaceC5467a) {
            Y f10 = Y.f(AbstractC5468b.c(interfaceC5467a.n(), interfaceC5467a.o(), interfaceC5467a.p()));
            return f10 == this.f57702a || f10 == this.f57703b;
        }
    }

    public static class b implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final d f57705a;

        public /* synthetic */ b(d dVar, a aVar) {
            this(dVar);
        }

        public final oi.p a(oi.q qVar, boolean z10) {
            F f10 = (F) qVar.j(F.f57534l);
            C i10 = this.f57705a.C().i();
            int intValue = p(qVar).intValue();
            if (z10) {
                if (intValue >= (this.f57705a.E() ? 52 : 4)) {
                    F f11 = (F) f10.y(i10, qVar.c(i10));
                    if (this.f57705a.E()) {
                        if (f11.v0() < f10.v0()) {
                            return F.f57543u;
                        }
                    } else if (f11.p() < f10.p()) {
                        return F.f57541s;
                    }
                }
            } else if (intValue <= 1) {
                F f12 = (F) f10.y(i10, qVar.m(i10));
                if (this.f57705a.E()) {
                    if (f12.v0() > f10.v0()) {
                        return F.f57543u;
                    }
                } else if (f12.p() > f10.p()) {
                    return F.f57541s;
                }
            }
            return i10;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            return a(qVar, true);
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            return a(qVar, false);
        }

        public final int g(F f10) {
            return this.f57705a.E() ? AbstractC5468b.e(f10.n()) ? 366 : 365 : AbstractC5468b.d(f10.n(), f10.o());
        }

        public final int j(F f10) {
            return s(f10, 1);
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer e(oi.q qVar) {
            return Integer.valueOf(j((F) qVar.j(F.f57534l)));
        }

        public final int l(F f10) {
            return s(f10, -1);
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer i(oi.q qVar) {
            return Integer.valueOf(l((F) qVar.j(F.f57534l)));
        }

        @Override // oi.z
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Integer p(oi.q qVar) {
            return Integer.valueOf(r((F) qVar.j(F.f57534l)));
        }

        public final int r(F f10) {
            return s(f10, 0);
        }

        public final int s(F f10, int i10) {
            int v02 = this.f57705a.E() ? f10.v0() : f10.p();
            int c10 = a0.c((f10.w0() - v02) + 1).c(this.f57705a.C());
            int i11 = c10 <= 8 - this.f57705a.C().g() ? 2 - c10 : 9 - c10;
            if (i10 == -1) {
                v02 = 1;
            } else if (i10 != 0) {
                if (i10 != 1) {
                    throw new AssertionError("Unexpected: " + i10);
                }
                v02 = g(f10);
            }
            return AbstractC5469c.a(v02 - i11, 7) + 1;
        }

        public final F t(F f10, int i10) {
            if (i10 == r(f10)) {
                return f10;
            }
            return f10.M0(f10.w0() + ((i10 - r0) * 7));
        }

        @Override // oi.z
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, Integer num, boolean z10) {
            oi.p pVar = F.f57534l;
            F f10 = (F) qVar.j(pVar);
            if (num != null && (z10 || isValid(qVar, num))) {
                return qVar.y(pVar, t(f10, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + qVar + ")");
        }

        public b(d dVar) {
            this.f57705a = dVar;
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            F f10 = (F) qVar.j(F.f57534l);
            return intValue >= l(f10) && intValue <= j(f10);
        }
    }

    public static class c implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final d f57706a;

        public /* synthetic */ c(d dVar, a aVar) {
            this(dVar);
        }

        private oi.p c() {
            return this.f57706a.C().i();
        }

        public final int a(F f10) {
            int v02 = this.f57706a.E() ? f10.v0() : f10.p();
            int j10 = j(f10, 0);
            if (j10 > v02) {
                return (((v02 + k(f10, -1)) - j(f10, -1)) / 7) + 1;
            }
            int i10 = ((v02 - j10) / 7) + 1;
            if ((i10 >= 53 || (!this.f57706a.E() && i10 >= 5)) && j(f10, 1) + k(f10, 0) <= v02) {
                return 1;
            }
            return i10;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            return c();
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            return c();
        }

        public final int j(F f10, int i10) {
            Y s10 = s(f10, i10);
            a0 C10 = this.f57706a.C();
            int c10 = s10.c(C10);
            return c10 <= 8 - C10.g() ? 2 - c10 : 9 - c10;
        }

        public final int k(F f10, int i10) {
            if (this.f57706a.E()) {
                return AbstractC5468b.e(f10.n() + i10) ? 366 : 365;
            }
            int n10 = f10.n();
            int o10 = f10.o() + i10;
            if (o10 == 0) {
                n10--;
                o10 = 12;
            } else if (o10 == 13) {
                n10++;
                o10 = 1;
            }
            return AbstractC5468b.d(n10, o10);
        }

        public final int l(F f10) {
            int v02 = this.f57706a.E() ? f10.v0() : f10.p();
            int j10 = j(f10, 0);
            if (j10 > v02) {
                return ((j10 + k(f10, -1)) - j(f10, -1)) / 7;
            }
            int j11 = j(f10, 1) + k(f10, 0);
            if (j11 <= v02) {
                try {
                    int j12 = j(f10, 1);
                    j11 = j(f10, 2) + k(f10, 1);
                    j10 = j12;
                } catch (RuntimeException unused) {
                    j11 += 7;
                }
            }
            return (j11 - j10) / 7;
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer e(oi.q qVar) {
            return Integer.valueOf(l((F) qVar.j(F.f57534l)));
        }

        @Override // oi.z
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Integer i(oi.q qVar) {
            return 1;
        }

        @Override // oi.z
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public Integer p(oi.q qVar) {
            return Integer.valueOf(a((F) qVar.j(F.f57534l)));
        }

        public final Y s(F f10, int i10) {
            if (this.f57706a.E()) {
                return Y.f(AbstractC5468b.c(f10.n() + i10, 1, 1));
            }
            int n10 = f10.n();
            int o10 = f10.o() + i10;
            if (o10 == 0) {
                n10--;
                o10 = 12;
            } else if (o10 == 13) {
                n10++;
                o10 = 1;
            } else if (o10 == 14) {
                n10++;
                o10 = 2;
            }
            return Y.f(AbstractC5468b.c(n10, o10, 1));
        }

        public final F t(F f10, int i10) {
            if (i10 == a(f10)) {
                return f10;
            }
            return f10.M0(f10.w0() + ((i10 - r0) * 7));
        }

        @Override // oi.z
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, Integer num, boolean z10) {
            oi.p pVar = F.f57534l;
            F f10 = (F) qVar.j(pVar);
            if (num != null && (z10 || isValid(qVar, num))) {
                return qVar.y(pVar, t(f10, num.intValue()));
            }
            throw new IllegalArgumentException("Invalid value: " + num + " (context=" + qVar + ")");
        }

        public c(d dVar) {
            this.f57706a = dVar;
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, Integer num) {
            if (num == null) {
                return false;
            }
            int intValue = num.intValue();
            if (this.f57706a.E() && intValue >= 1 && intValue <= 52) {
                return true;
            }
            if (!this.f57706a.E() || intValue == 53) {
                return intValue >= 1 && intValue <= l((F) qVar.j(F.f57534l));
            }
            return false;
        }
    }

    public class d extends AbstractC5701a {
        private static final long serialVersionUID = -5936254509996557266L;
        private final int category;

        public d(String str, int i10) {
            super(str);
            this.category = i10;
        }

        private Object readResolve() {
            a0 C10 = C();
            int i10 = this.category;
            if (i10 == 0) {
                return C10.n();
            }
            if (i10 == 1) {
                return C10.m();
            }
            if (i10 == 2) {
                return C10.b();
            }
            if (i10 == 3) {
                return C10.a();
            }
            throw new InvalidObjectException("Unknown category: " + this.category);
        }

        @Override // oi.p
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Integer c() {
            return Integer.valueOf(E() ? 52 : 5);
        }

        @Override // oi.p
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Integer d0() {
            return 1;
        }

        public final a0 C() {
            return a0.this;
        }

        public final boolean D() {
            return this.category >= 2;
        }

        public final boolean E() {
            return this.category % 2 == 0;
        }

        @Override // oi.p
        public boolean Y() {
            return true;
        }

        @Override // oi.AbstractC5909e, oi.p
        public char a() {
            int i10 = this.category;
            if (i10 == 0) {
                return 'w';
            }
            if (i10 != 1) {
                return super.a();
            }
            return 'W';
        }

        @Override // oi.p
        public boolean e0() {
            return false;
        }

        @Override // oi.AbstractC5909e, oi.p
        public boolean g() {
            return true;
        }

        @Override // oi.p
        public Class getType() {
            return Integer.class;
        }

        @Override // oi.AbstractC5909e
        public oi.z r(oi.x xVar) {
            a aVar = null;
            if (xVar.x(F.f57534l)) {
                return D() ? new b(this, aVar) : new c(this, aVar);
            }
            return null;
        }

        @Override // oi.AbstractC5909e
        public boolean s(AbstractC5909e abstractC5909e) {
            return C().equals(((d) abstractC5909e).C());
        }

        @Override // oi.AbstractC5909e
        public oi.p t() {
            return F.f57545w;
        }
    }

    public static class e implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final f f57707a;

        public /* synthetic */ e(f fVar, a aVar) {
            this(fVar);
        }

        public final oi.p a(oi.q qVar) {
            oi.p pVar = G.f57584n;
            if (qVar.f(pVar)) {
                return pVar;
            }
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            return a(qVar);
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            return a(qVar);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Y e(oi.q qVar) {
            F f10 = (F) qVar.j(F.f57534l);
            return (f10.b() + 7) - ((long) f10.u0().c(this.f57707a.C())) > F.l0().q().a() ? Y.FRIDAY : this.f57707a.c();
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Y i(oi.q qVar) {
            F f10 = (F) qVar.j(F.f57534l);
            return (f10.b() + 1) - ((long) f10.u0().c(this.f57707a.C())) < F.l0().q().d() ? Y.MONDAY : this.f57707a.d0();
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Y p(oi.q qVar) {
            return ((F) qVar.j(F.f57534l)).u0();
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, Y y10, boolean z10) {
            if (y10 == null) {
                throw new IllegalArgumentException("Missing weekday.");
            }
            oi.p pVar = F.f57534l;
            F f10 = (F) qVar.j(pVar);
            long w02 = f10.w0();
            if (y10 == a0.c(w02)) {
                return qVar;
            }
            return qVar.y(pVar, f10.M0((w02 + y10.c(this.f57707a.C())) - r3.c(this.f57707a.C())));
        }

        public e(f fVar) {
            this.f57707a = fVar;
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, Y y10) {
            if (y10 == null) {
                return false;
            }
            try {
                o(qVar, y10, false);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }
    }

    public class f extends AbstractC5701a implements C, net.time4j.format.l, net.time4j.format.t {
        private static final long serialVersionUID = 1945670789283677398L;

        public f() {
            super("LOCAL_DAY_OF_WEEK");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a0 C() {
            return a0.this;
        }

        private Object readResolve() {
            return a0.this.i();
        }

        @Override // oi.p
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public Y c() {
            return a0.this.f().d(6);
        }

        @Override // oi.p
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Y d0() {
            return a0.this.f();
        }

        public int D(Y y10) {
            return y10.c(a0.this);
        }

        @Override // net.time4j.format.t
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Y a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
            int index = parsePosition.getIndex();
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57809h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) interfaceC5908d.b(interfaceC5907c, mVar);
            Y y10 = (Y) z(interfaceC5908d, mVar2).d(charSequence, parsePosition, getType(), interfaceC5908d);
            if (y10 != null || !((Boolean) interfaceC5908d.b(net.time4j.format.a.f57812k, Boolean.TRUE)).booleanValue()) {
                return y10;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return (Y) z(interfaceC5908d, mVar).d(charSequence, parsePosition, getType(), interfaceC5908d);
        }

        @Override // net.time4j.format.l
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public int j(Y y10, oi.o oVar, InterfaceC5908d interfaceC5908d) {
            return D(y10);
        }

        @Override // net.time4j.format.l
        public boolean N(oi.q qVar, int i10) {
            for (Y y10 : Y.values()) {
                if (y10.c(a0.this) == i10) {
                    qVar.y(this, y10);
                    return true;
                }
            }
            return false;
        }

        @Override // oi.p
        public boolean Y() {
            return true;
        }

        @Override // net.time4j.format.t
        public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
            appendable.append(z(interfaceC5908d, (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT)).f((Enum) oVar.j(this)));
        }

        @Override // oi.AbstractC5909e, oi.p
        public char a() {
            return 'e';
        }

        @Override // oi.p
        public boolean e0() {
            return false;
        }

        @Override // oi.p
        public Class getType() {
            return Y.class;
        }

        @Override // oi.AbstractC5909e, java.util.Comparator
        /* renamed from: q */
        public int compare(oi.o oVar, oi.o oVar2) {
            int c10 = ((Y) oVar.j(this)).c(a0.this);
            int c11 = ((Y) oVar2.j(this)).c(a0.this);
            if (c10 < c11) {
                return -1;
            }
            return c10 == c11 ? 0 : 1;
        }

        @Override // oi.AbstractC5909e
        public oi.z r(oi.x xVar) {
            a aVar = null;
            if (xVar.x(F.f57534l)) {
                return new e(this, aVar);
            }
            return null;
        }

        @Override // oi.AbstractC5909e
        public boolean s(AbstractC5909e abstractC5909e) {
            return C().equals(((f) abstractC5909e).C());
        }

        @Override // oi.AbstractC5909e
        public oi.p t() {
            return F.f57542t;
        }

        public final net.time4j.format.s z(InterfaceC5908d interfaceC5908d, net.time4j.format.m mVar) {
            return net.time4j.format.b.d((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT)).p((net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE), mVar);
        }
    }

    static {
        Iterator it = AbstractC5470d.c().g(net.time4j.format.y.class).iterator();
        f57690n = it.hasNext() ? (net.time4j.format.y) it.next() : null;
    }

    public a0(Y y10, int i10, Y y11, Y y12) {
        if (y10 == null) {
            throw new NullPointerException("Missing first day of week.");
        }
        if (i10 < 1 || i10 > 7) {
            throw new IllegalArgumentException("Minimal days in first week out of range: " + i10);
        }
        if (y11 == null) {
            throw new NullPointerException("Missing start of weekend.");
        }
        if (y12 == null) {
            throw new NullPointerException("Missing end of weekend.");
        }
        this.f57691a = y10;
        this.f57692b = i10;
        this.f57693c = y11;
        this.f57694d = y12;
        d dVar = new d("WEEK_OF_YEAR", 0);
        this.f57695e = dVar;
        d dVar2 = new d("WEEK_OF_MONTH", 1);
        this.f57696f = dVar2;
        d dVar3 = new d("BOUNDED_WEEK_OF_YEAR", 2);
        this.f57697g = dVar3;
        d dVar4 = new d("BOUNDED_WEEK_OF_MONTH", 3);
        this.f57698h = dVar4;
        f fVar = new f();
        this.f57699i = fVar;
        this.f57701k = new a(y11, y12);
        HashSet hashSet = new HashSet();
        hashSet.add(dVar);
        hashSet.add(dVar2);
        hashSet.add(fVar);
        hashSet.add(dVar3);
        hashSet.add(dVar4);
        this.f57700j = Collections.unmodifiableSet(hashSet);
    }

    public static Y c(long j10) {
        return Y.f(AbstractC5469c.d(j10 + 5, 7) + 1);
    }

    public static a0 j(Locale locale) {
        if (locale.getCountry().isEmpty()) {
            return f57689m;
        }
        Map map = f57688l;
        a0 a0Var = (a0) map.get(locale);
        if (a0Var != null) {
            return a0Var;
        }
        net.time4j.format.y yVar = f57690n;
        if (yVar == null) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(locale);
            int firstDayOfWeek = gregorianCalendar.getFirstDayOfWeek();
            return k(Y.f(firstDayOfWeek == 1 ? 7 : firstDayOfWeek - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
        }
        a0 a0Var2 = new a0(Y.f(yVar.d(locale)), yVar.b(locale), Y.f(yVar.c(locale)), Y.f(yVar.a(locale)));
        if (map.size() > 150) {
            map.clear();
        }
        map.put(locale, a0Var2);
        return a0Var2;
    }

    public static a0 k(Y y10, int i10) {
        return l(y10, i10, Y.SATURDAY, Y.SUNDAY);
    }

    public static a0 l(Y y10, int i10, Y y11, Y y12) {
        return (y10 == Y.MONDAY && i10 == 4 && y11 == Y.SATURDAY && y12 == Y.SUNDAY) ? f57689m : new a0(y10, i10, y11, y12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    public InterfaceC5703c a() {
        return this.f57698h;
    }

    public InterfaceC5703c b() {
        return this.f57697g;
    }

    public Set d() {
        return this.f57700j;
    }

    public Y e() {
        return this.f57694d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f57691a == a0Var.f57691a && this.f57692b == a0Var.f57692b && this.f57693c == a0Var.f57693c && this.f57694d == a0Var.f57694d) {
                return true;
            }
        }
        return false;
    }

    public Y f() {
        return this.f57691a;
    }

    public int g() {
        return this.f57692b;
    }

    public Y h() {
        return this.f57693c;
    }

    public int hashCode() {
        return (this.f57691a.name().hashCode() * 17) + (this.f57692b * 37);
    }

    public C i() {
        return this.f57699i;
    }

    public InterfaceC5703c m() {
        return this.f57696f;
    }

    public InterfaceC5703c n() {
        return this.f57695e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(a0.class.getName());
        sb2.append("[firstDayOfWeek=");
        sb2.append(this.f57691a);
        sb2.append(",minimalDaysInFirstWeek=");
        sb2.append(this.f57692b);
        sb2.append(",startOfWeekend=");
        sb2.append(this.f57693c);
        sb2.append(",endOfWeekend=");
        sb2.append(this.f57694d);
        sb2.append(']');
        return sb2.toString();
    }
}
