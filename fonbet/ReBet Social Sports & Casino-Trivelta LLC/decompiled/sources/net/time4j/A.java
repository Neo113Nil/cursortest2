package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationKt;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.InterfaceC5472f;
import oi.AbstractC5914j;
import oi.EnumC5900A;
import oi.EnumC5901B;
import oi.H;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import qi.C6183d;
import qi.EnumC6185f;
import qi.InterfaceC6181b;
import qi.InterfaceC6186g;

/* loaded from: classes5.dex */
public final class A extends oi.K implements InterfaceC6186g {

    /* renamed from: c, reason: collision with root package name */
    public static final long f57495c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f57496d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f57497e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f57498f;

    /* renamed from: g, reason: collision with root package name */
    public static final A f57499g;

    /* renamed from: h, reason: collision with root package name */
    public static final Set f57500h;

    /* renamed from: i, reason: collision with root package name */
    public static final Map f57501i;

    /* renamed from: j, reason: collision with root package name */
    public static final Map f57502j;

    /* renamed from: k, reason: collision with root package name */
    public static final oi.H f57503k;

    /* renamed from: l, reason: collision with root package name */
    public static final A f57504l;

    /* renamed from: m, reason: collision with root package name */
    public static final oi.p f57505m;

    /* renamed from: n, reason: collision with root package name */
    public static final oi.p f57506n;

    /* renamed from: o, reason: collision with root package name */
    public static final oi.p f57507o;

    /* renamed from: p, reason: collision with root package name */
    public static final oi.v f57508p;
    private static final long serialVersionUID = -3192884724477742274L;

    /* renamed from: a, reason: collision with root package name */
    public final transient long f57509a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f57510b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$SI;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$scale$TimeScale;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.NANOSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[N.values().length];
            $SwitchMap$net$time4j$SI = iArr2;
            try {
                iArr2[N.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$time4j$SI[N.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[EnumC6185f.values().length];
            $SwitchMap$net$time4j$scale$TimeScale = iArr3;
            try {
                iArr3[EnumC6185f.POSIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.UTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.TAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.GPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.TT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$net$time4j$scale$TimeScale[EnumC6185f.UT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static class b implements oi.I {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(A a10, A a11) {
            return a10.compareTo(a11);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c implements oi.p, oi.z {
        FRACTION;

        @Override // oi.p
        public boolean Y() {
            return false;
        }

        @Override // oi.p
        public char a() {
            return (char) 0;
        }

        @Override // oi.p
        public boolean e0() {
            return false;
        }

        @Override // oi.p
        public boolean g() {
            return false;
        }

        @Override // oi.p
        public Class getType() {
            return Integer.class;
        }

        @Override // java.util.Comparator
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compare(oi.o oVar, oi.o oVar2) {
            return ((Integer) oVar.j(this)).compareTo((Integer) oVar2.j(this));
        }

        @Override // oi.z
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public oi.p b(A a10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public oi.p d(A a10) {
            return null;
        }

        @Override // oi.p
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public Integer c() {
            return 999999999;
        }

        @Override // oi.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public Integer d0() {
            return 0;
        }

        @Override // oi.z
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public Integer e(A a10) {
            return c();
        }

        @Override // oi.z
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Integer i(A a10) {
            return d0();
        }

        @Override // oi.z
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer p(A a10) {
            return Integer.valueOf(a10.a());
        }

        @Override // oi.z
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public A q(A a10, Integer num, boolean z10) {
            if (num == null) {
                throw new IllegalArgumentException("Missing fraction value.");
            }
            if (!C6183d.q().u()) {
                return A.f0(a10.k(), num.intValue(), EnumC6185f.POSIX);
            }
            EnumC6185f enumC6185f = EnumC6185f.UTC;
            return A.f0(a10.h(enumC6185f), num.intValue(), enumC6185f);
        }

        @Override // oi.z
        public boolean isValid(A a10, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 0 && intValue < 1000000000;
        }
    }

    public enum d implements oi.p, oi.z {
        POSIX_TIME;

        @Override // oi.p
        public boolean Y() {
            return false;
        }

        @Override // oi.p
        public char a() {
            return (char) 0;
        }

        @Override // oi.p
        public boolean e0() {
            return false;
        }

        @Override // oi.p
        public boolean g() {
            return false;
        }

        @Override // oi.p
        public Class getType() {
            return Long.class;
        }

        @Override // java.util.Comparator
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public int compare(oi.o oVar, oi.o oVar2) {
            return ((Long) oVar.j(this)).compareTo((Long) oVar2.j(this));
        }

        @Override // oi.z
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public oi.p b(A a10) {
            return c.FRACTION;
        }

        @Override // oi.z
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public oi.p d(A a10) {
            return c.FRACTION;
        }

        @Override // oi.p
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public Long c() {
            return Long.valueOf(A.f57496d);
        }

        @Override // oi.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public Long d0() {
            return Long.valueOf(A.f57495c);
        }

        @Override // oi.z
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public Long e(A a10) {
            return Long.valueOf(A.f57496d);
        }

        @Override // oi.z
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Long i(A a10) {
            return Long.valueOf(A.f57495c);
        }

        @Override // oi.z
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Long p(A a10) {
            return Long.valueOf(a10.k());
        }

        @Override // oi.z
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public A q(A a10, Long l10, boolean z10) {
            if (l10 != null) {
                return A.f0(l10.longValue(), a10.a(), EnumC6185f.POSIX);
            }
            throw new IllegalArgumentException("Missing elapsed seconds.");
        }

        @Override // oi.z
        public boolean isValid(A a10, Long l10) {
            if (l10 == null) {
                return false;
            }
            long longValue = l10.longValue();
            return longValue >= A.f57495c && longValue <= A.f57496d;
        }
    }

    public static class e implements oi.u {
        public e() {
        }

        @Override // oi.u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A e(oi.q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
            net.time4j.tz.k kVar;
            A a10;
            EnumC6185f enumC6185f = (EnumC6185f) interfaceC5908d.b(net.time4j.format.a.f57824w, EnumC6185f.UTC);
            if (qVar instanceof InterfaceC5472f) {
                return A.U((InterfaceC5472f) InterfaceC5472f.class.cast(qVar)).o0(enumC6185f);
            }
            d dVar = d.POSIX_TIME;
            if (qVar.f(dVar)) {
                long longValue = ((Long) qVar.j(dVar)).longValue();
                c cVar = c.FRACTION;
                return A.f0(longValue, qVar.f(cVar) ? ((Integer) qVar.j(cVar)).intValue() : 0, EnumC6185f.POSIX).o0(enumC6185f);
            }
            if (qVar.f(EnumC5901B.LEAP_SECOND)) {
                qVar.w(G.f57594x, 60);
                r3 = 1;
            }
            oi.p F10 = H.M().F();
            H h10 = qVar.f(F10) ? (H) qVar.j(F10) : (H) H.M().e(qVar, interfaceC5908d, z10, z11);
            a aVar = null;
            if (h10 == null) {
                return null;
            }
            if (qVar.d()) {
                kVar = qVar.r();
            } else {
                InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57805d;
                kVar = interfaceC5908d.c(interfaceC5907c) ? (net.time4j.tz.k) interfaceC5908d.a(interfaceC5907c) : null;
            }
            if (kVar != null) {
                EnumC5901B enumC5901B = EnumC5901B.DAYLIGHT_SAVING;
                if (qVar.f(enumC5901B)) {
                    a10 = h10.S(net.time4j.tz.l.N(kVar).Q(((net.time4j.tz.o) interfaceC5908d.b(net.time4j.format.a.f57806e, net.time4j.tz.l.f58348d)).a(((Boolean) qVar.j(enumC5901B)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)));
                } else {
                    InterfaceC5907c interfaceC5907c2 = net.time4j.format.a.f57806e;
                    a10 = interfaceC5908d.c(interfaceC5907c2) ? h10.S(net.time4j.tz.l.N(kVar).Q((net.time4j.tz.o) interfaceC5908d.a(interfaceC5907c2))) : h10.T(kVar);
                }
            } else {
                a10 = null;
            }
            if (a10 == null) {
                return null;
            }
            if (r3 != 0) {
                net.time4j.tz.p B10 = kVar instanceof net.time4j.tz.p ? (net.time4j.tz.p) kVar : net.time4j.tz.l.N(kVar).B(a10);
                if (B10.i() != 0 || B10.h() % 60 != 0) {
                    throw new IllegalArgumentException("Leap second is only allowed  with timezone-offset in full minutes: " + B10);
                }
                A h02 = a10.W().n() >= 1972 ? a10.h0(1L, N.SECONDS) : new A(a10.a(), a10.k() + 1, aVar);
                if (!z10) {
                    if (C6183d.q().u()) {
                        if (!h02.e0()) {
                            throw new IllegalArgumentException("SECOND_OF_MINUTE parsed as invalid leapsecond before " + h02);
                        }
                    }
                }
                a10 = h02;
            }
            return a10.o0(enumC6185f);
        }

        @Override // oi.u
        public oi.F b() {
            return oi.F.f61255a;
        }

        @Override // oi.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.o i(A a10, InterfaceC5908d interfaceC5908d) {
            InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57805d;
            if (!interfaceC5908d.c(interfaceC5907c)) {
                throw new IllegalArgumentException("Cannot print moment without timezone.");
            }
            return a10.p0((EnumC6185f) interfaceC5908d.b(net.time4j.format.a.f57824w, EnumC6185f.UTC)).b0((net.time4j.tz.k) interfaceC5908d.a(interfaceC5907c));
        }

        @Override // oi.u
        public oi.x d() {
            return H.M();
        }

        @Override // oi.u
        public int h() {
            return F.l0().h();
        }

        @Override // oi.u
        public String n(oi.y yVar, Locale locale) {
            net.time4j.format.e b10 = net.time4j.format.e.b(yVar.a());
            return net.time4j.format.b.s(b10, b10, locale);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static class f implements oi.v {
        public f() {
        }

        @Override // oi.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public A apply(A a10) {
            InterfaceC6181b r10;
            C6183d q10 = C6183d.q();
            if (!q10.u() || (r10 = q10.r(a10.h(EnumC6185f.UTC))) == null) {
                return null;
            }
            return F.q0(r10.c()).k0(23, 59, 59).L().h0(r10.a(), N.SECONDS);
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public static class g implements oi.z {
        public g() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(A a10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(A a10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public TimeUnit e(A a10) {
            return TimeUnit.NANOSECONDS;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public TimeUnit i(A a10) {
            return TimeUnit.DAYS;
        }

        @Override // oi.z
        public boolean isValid(A a10, TimeUnit timeUnit) {
            return timeUnit != null;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public TimeUnit p(A a10) {
            int a11 = a10.a();
            if (a11 != 0) {
                return a11 % DurationKt.NANOS_IN_MILLIS == 0 ? TimeUnit.MILLISECONDS : a11 % 1000 == 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
            }
            long j10 = a10.f57509a;
            return AbstractC5469c.d(j10, 86400) == 0 ? TimeUnit.DAYS : AbstractC5469c.d(j10, 3600) == 0 ? TimeUnit.HOURS : AbstractC5469c.d(j10, 60) == 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public A q(A a10, TimeUnit timeUnit, boolean z10) {
            A f02;
            if (timeUnit == null) {
                throw new IllegalArgumentException("Missing precision.");
            }
            switch (a.$SwitchMap$java$util$concurrent$TimeUnit[timeUnit.ordinal()]) {
                case 1:
                    return A.g0(AbstractC5469c.b(a10.f57509a, 86400) * 86400, EnumC6185f.POSIX);
                case 2:
                    return A.g0(AbstractC5469c.b(a10.f57509a, 3600) * 3600, EnumC6185f.POSIX);
                case 3:
                    return A.g0(AbstractC5469c.b(a10.f57509a, 60) * 60, EnumC6185f.POSIX);
                case 4:
                    f02 = A.f0(a10.f57509a, 0, EnumC6185f.POSIX);
                    break;
                case 5:
                    f02 = A.f0(a10.f57509a, (a10.a() / DurationKt.NANOS_IN_MILLIS) * DurationKt.NANOS_IN_MILLIS, EnumC6185f.POSIX);
                    break;
                case 6:
                    f02 = A.f0(a10.f57509a, (a10.a() / 1000) * 1000, EnumC6185f.POSIX);
                    break;
                case 7:
                    return a10;
                default:
                    throw new UnsupportedOperationException(timeUnit.name());
            }
            return (a10.d0() && C6183d.q().u()) ? f02.h0(1L, N.SECONDS) : f02;
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static class h implements oi.M {

        /* renamed from: a, reason: collision with root package name */
        public final TimeUnit f57513a;

        public h(TimeUnit timeUnit) {
            this.f57513a = timeUnit;
        }

        @Override // oi.M
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public A b(A a10, long j10) {
            if (this.f57513a.compareTo(TimeUnit.SECONDS) >= 0) {
                return A.f0(AbstractC5469c.f(a10.k(), AbstractC5469c.i(j10, this.f57513a.toSeconds(1L))), a10.a(), EnumC6185f.POSIX);
            }
            long f10 = AbstractC5469c.f(a10.a(), AbstractC5469c.i(j10, this.f57513a.toNanos(1L)));
            return A.f0(AbstractC5469c.f(a10.k(), AbstractC5469c.b(f10, 1000000000)), AbstractC5469c.d(f10, 1000000000), EnumC6185f.POSIX);
        }

        @Override // oi.M
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(A a10, A a11) {
            long f10;
            if (this.f57513a.compareTo(TimeUnit.SECONDS) >= 0) {
                f10 = a11.k() - a10.k();
                if (f10 < 0) {
                    if (a11.a() > a10.a()) {
                        f10++;
                    }
                } else if (f10 > 0 && a11.a() < a10.a()) {
                    f10--;
                }
            } else {
                f10 = AbstractC5469c.f(AbstractC5469c.i(AbstractC5469c.m(a11.k(), a10.k()), 1000000000L), a11.a() - a10.a());
            }
            switch (a.$SwitchMap$java$util$concurrent$TimeUnit[this.f57513a.ordinal()]) {
                case 1:
                    return f10 / 86400;
                case 2:
                    return f10 / 3600;
                case 3:
                    return f10 / 60;
                case 4:
                case 7:
                    return f10;
                case 5:
                    return f10 / 1000000;
                case 6:
                    return f10 / 1000;
                default:
                    throw new UnsupportedOperationException(this.f57513a.name());
            }
        }
    }

    static {
        long i10 = AbstractC5468b.i(-999999999, 1, 1);
        long i11 = AbstractC5468b.i(999999999, 12, 31);
        EnumC5900A enumC5900A = EnumC5900A.UNIX;
        EnumC5900A enumC5900A2 = EnumC5900A.MODIFIED_JULIAN_DATE;
        long i12 = enumC5900A.i(i10, enumC5900A2) * 86400;
        f57495c = i12;
        long i13 = (enumC5900A.i(i11, enumC5900A2) * 86400) + 86399;
        f57496d = i13;
        EnumC6185f enumC6185f = EnumC6185f.POSIX;
        A a10 = new A(i12, 0, enumC6185f);
        f57497e = a10;
        A a11 = new A(i13, 999999999, enumC6185f);
        f57498f = a11;
        f57499g = new A(63158400L, 0, enumC6185f);
        HashSet hashSet = new HashSet();
        hashSet.add(G.f57591u);
        hashSet.add(G.f57590t);
        hashSet.add(G.f57589s);
        hashSet.add(G.f57588r);
        hashSet.add(G.f57587q);
        hashSet.add(G.f57586p);
        hashSet.add(G.f57592v);
        hashSet.add(G.f57593w);
        f57500h = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        hashMap.put(G.f57594x, 1);
        hashMap.put(G.f57595y, 1);
        hashMap.put(G.f57596z, 1000);
        hashMap.put(G.f57563C, 1000);
        K k10 = G.f57561A;
        Integer valueOf = Integer.valueOf(DurationKt.NANOS_IN_MILLIS);
        hashMap.put(k10, valueOf);
        hashMap.put(G.f57564D, valueOf);
        hashMap.put(G.f57562B, 1000000000);
        hashMap.put(G.f57565E, 1000000000);
        f57501i = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put((EnumMap) TimeUnit.DAYS, (TimeUnit) Double.valueOf(86400.0d));
        enumMap.put((EnumMap) TimeUnit.HOURS, (TimeUnit) Double.valueOf(3600.0d));
        enumMap.put((EnumMap) TimeUnit.MINUTES, (TimeUnit) Double.valueOf(60.0d));
        enumMap.put((EnumMap) TimeUnit.SECONDS, (TimeUnit) Double.valueOf(1.0d));
        enumMap.put((EnumMap) TimeUnit.MILLISECONDS, (TimeUnit) Double.valueOf(0.001d));
        enumMap.put((EnumMap) TimeUnit.MICROSECONDS, (TimeUnit) Double.valueOf(1.0E-6d));
        enumMap.put((EnumMap) TimeUnit.NANOSECONDS, (TimeUnit) Double.valueOf(1.0E-9d));
        f57502j = Collections.unmodifiableMap(enumMap);
        a aVar = null;
        H.b k11 = H.b.k(TimeUnit.class, A.class, new e(aVar), a10, a11);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            h hVar = new h(timeUnit);
            Map map = f57502j;
            k11.g(timeUnit, hVar, ((Double) map.get(timeUnit)).doubleValue(), map.keySet());
        }
        d dVar = d.POSIX_TIME;
        k11.e(dVar, dVar, TimeUnit.SECONDS);
        c cVar = c.FRACTION;
        k11.e(cVar, cVar, TimeUnit.NANOSECONDS);
        oi.p pVar = I.f57622e;
        k11.d(pVar, new g(aVar));
        f57503k = k11.l(new b(aVar)).h();
        f57504l = new A(0L, 0, EnumC6185f.POSIX);
        f57505m = dVar;
        f57506n = cVar;
        f57507o = pVar;
        f57508p = new f(aVar);
    }

    public /* synthetic */ A(int i10, long j10, a aVar) {
        this(i10, j10);
    }

    public static oi.H N() {
        return f57503k;
    }

    public static void O(A a10) {
        if (a10.f57509a < 63072000) {
            throw new UnsupportedOperationException("Cannot calculate SI-duration before 1972-01-01.");
        }
    }

    public static void P(int i10) {
        if (i10 >= 1000000000 || i10 < 0) {
            throw new IllegalArgumentException("Nanosecond out of range: " + i10);
        }
    }

    public static void Q(long j10, H h10) {
        C6183d q10 = C6183d.q();
        if (!q10.x() || q10.w(q10.h(j10)) <= j10) {
            return;
        }
        throw new oi.r("Illegal local timestamp due to negative leap second: " + h10);
    }

    public static void R(long j10) {
        if (j10 > f57496d || j10 < f57495c) {
            throw new IllegalArgumentException("UNIX time (UT) out of supported range: " + j10);
        }
    }

    public static void T(int i10, int i11, StringBuilder sb2) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11 - 1; i13++) {
            i12 *= 10;
        }
        while (i10 < i12 && i12 >= 10) {
            sb2.append('0');
            i12 /= 10;
        }
        sb2.append(String.valueOf(i10));
    }

    public static A U(InterfaceC5472f interfaceC5472f) {
        if (interfaceC5472f instanceof A) {
            return (A) A.class.cast(interfaceC5472f);
        }
        if (!(interfaceC5472f instanceof InterfaceC6186g) || !C6183d.q().u()) {
            return f0(interfaceC5472f.k(), interfaceC5472f.a(), EnumC6185f.POSIX);
        }
        InterfaceC6186g interfaceC6186g = (InterfaceC6186g) InterfaceC6186g.class.cast(interfaceC5472f);
        EnumC6185f enumC6185f = EnumC6185f.UTC;
        return f0(interfaceC6186g.h(enumC6185f), interfaceC6186g.g(enumC6185f), enumC6185f);
    }

    public static int Z(A a10) {
        return AbstractC5469c.d(a10.f57509a, 86400);
    }

    public static A f0(long j10, int i10, EnumC6185f enumC6185f) {
        return (j10 == 0 && i10 == 0 && enumC6185f == EnumC6185f.POSIX) ? f57504l : new A(j10, i10, enumC6185f);
    }

    public static A g0(long j10, EnumC6185f enumC6185f) {
        return f0(j10, 0, enumC6185f);
    }

    public static A i0(DataInput dataInput, boolean z10, boolean z11) {
        long readLong = dataInput.readLong();
        int readInt = z11 ? dataInput.readInt() : 0;
        if (readLong == 0) {
            if (z10) {
                throw new InvalidObjectException("UTC epoch is no leap second.");
            }
            if (readInt == 0) {
                return f57504l;
            }
        }
        if (readLong == f57495c && readInt == 0) {
            if (z10) {
                throw new InvalidObjectException("Minimum is no leap second.");
            }
            return f57497e;
        }
        if (readLong == f57496d && readInt == 999999999) {
            if (z10) {
                throw new InvalidObjectException("Maximum is no leap second.");
            }
            return f57498f;
        }
        P(readInt);
        if (z10) {
            C6183d q10 = C6183d.q();
            if (q10.u() && !q10.v(q10.h(readLong) + 1)) {
                long k10 = AbstractC5468b.k(readLong);
                int g10 = AbstractC5468b.g(k10);
                int f10 = AbstractC5468b.f(k10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Not registered as leap second event: ");
                sb2.append(AbstractC5468b.h(k10));
                sb2.append("-");
                sb2.append(g10 < 10 ? "0" : "");
                sb2.append(g10);
                sb2.append(f10 < 10 ? "0" : "");
                sb2.append(f10);
                sb2.append(" [Please check leap second configurations ");
                sb2.append("either of emitter vm or this target vm]");
                throw new InvalidObjectException(sb2.toString());
            }
            readInt |= 1073741824;
        }
        return new A(readInt, readLong);
    }

    public static int l0(double d10, long j10) {
        try {
            return (int) ((d10 * 1.0E9d) - AbstractC5469c.i(j10, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d10 - j10) * 1.0E9d);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 4);
    }

    @Override // oi.q
    /* renamed from: B */
    public oi.H s() {
        return f57503k;
    }

    @Override // java.lang.Comparable
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public int compareTo(A a10) {
        int a11;
        long X10 = X();
        long X11 = a10.X();
        if (X10 < X11) {
            return -1;
        }
        if (X10 <= X11 && (a11 = a() - a10.a()) <= 0) {
            return a11 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // oi.q
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public A t() {
        return this;
    }

    public final F W() {
        return F.G0(AbstractC5469c.b(this.f57509a, 86400), EnumC5900A.UNIX);
    }

    public final long X() {
        if (!C6183d.q().u()) {
            return this.f57509a - 63072000;
        }
        long h10 = C6183d.q().h(this.f57509a);
        return e0() ? h10 + 1 : h10;
    }

    public final double Y() {
        double X10 = ((X() + 42.184d) + (a() / 1.0E9d)) - EnumC6185f.c(W());
        return Double.compare(1.0E9d - ((X10 - ((double) ((long) Math.floor(X10)))) * 1.0E9d), 1.0d) < 0 ? r3 + 1 : X10;
    }

    @Override // li.InterfaceC5472f
    public int a() {
        return this.f57510b & (-1073741825);
    }

    public final H a0(net.time4j.tz.l lVar) {
        return H.O(this, lVar.B(this));
    }

    public c0 b0(net.time4j.tz.k kVar) {
        return c0.l(this, net.time4j.tz.l.N(kVar));
    }

    public boolean c0(InterfaceC6186g interfaceC6186g) {
        return compareTo(U(interfaceC6186g)) < 0;
    }

    public boolean d0() {
        return e0() && C6183d.q().u();
    }

    public final boolean e0() {
        return (this.f57510b >>> 30) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            A a10 = (A) obj;
            if (this.f57509a != a10.f57509a) {
                return false;
            }
            if (C6183d.q().u()) {
                return this.f57510b == a10.f57510b;
            }
            if (a() == a10.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // qi.InterfaceC6186g
    public int g(EnumC6185f enumC6185f) {
        long X10;
        int a10;
        int i10 = 0;
        switch (a.$SwitchMap$net$time4j$scale$TimeScale[enumC6185f.ordinal()]) {
            case 1:
            case 2:
                return a();
            case 3:
                if (X() < 0) {
                    double c10 = EnumC6185f.c(W()) + (this.f57509a - 63072000) + (a() / 1.0E9d);
                    long floor = (long) Math.floor(c10);
                    if (Double.compare(1.0E9d - ((c10 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                    } else {
                        i10 = l0(c10, floor);
                    }
                    X10 = floor - (-441763168);
                    a10 = i10 - 184000000;
                    if (a10 < 0) {
                        X10 = floor - (-441763167);
                        a10 = i10 - (-816000000);
                    }
                } else {
                    X10 = X() + 441763200;
                    a10 = a();
                }
                if (X10 >= 0) {
                    return a10;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                if (C6183d.q().w(X()) >= 315964800) {
                    return a();
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f57509a >= 63072000) {
                    int a11 = a();
                    int i11 = 184000000 + a11;
                    return i11 >= 1000000000 ? a11 - 816000000 : i11;
                }
                double c11 = EnumC6185f.c(W()) + (this.f57509a - 63072000) + (a() / 1.0E9d);
                long floor2 = (long) Math.floor(c11);
                if (Double.compare(1.0E9d - ((c11 - floor2) * 1.0E9d), 1.0d) < 0) {
                    return 0;
                }
                return l0(c11, floor2);
            case 6:
                if (this.f57509a < 63072000) {
                    return a();
                }
                double Y10 = Y();
                return l0(Y10, (long) Math.floor(Y10));
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + enumC6185f);
        }
    }

    @Override // qi.InterfaceC6186g
    public long h(EnumC6185f enumC6185f) {
        long X10;
        int l02;
        switch (a.$SwitchMap$net$time4j$scale$TimeScale[enumC6185f.ordinal()]) {
            case 1:
                return this.f57509a;
            case 2:
                return X();
            case 3:
                if (X() < 0) {
                    double c10 = EnumC6185f.c(W()) + (this.f57509a - 63072000) + (a() / 1.0E9d);
                    long floor = (long) Math.floor(c10);
                    if (Double.compare(1.0E9d - ((c10 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        l02 = 0;
                    } else {
                        l02 = l0(c10, floor);
                    }
                    X10 = floor - (-441763168);
                    if (l02 - 184000000 < 0) {
                        X10 = floor - (-441763167);
                    }
                } else {
                    X10 = X() + 441763210;
                }
                if (X10 >= 0) {
                    return X10;
                }
                throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + this);
            case 4:
                long X11 = X();
                if (C6183d.q().w(X11) >= 315964800) {
                    if (!C6183d.q().u()) {
                        X11 += 9;
                    }
                    return X11 - 252892809;
                }
                throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + this);
            case 5:
                if (this.f57509a >= 63072000) {
                    long X12 = X();
                    return a() + 184000000 >= 1000000000 ? X12 + 43 : 42 + X12;
                }
                double c11 = EnumC6185f.c(W()) + (this.f57509a - 63072000) + (a() / 1.0E9d);
                long floor2 = (long) Math.floor(c11);
                return Double.compare(1.0E9d - ((c11 - ((double) floor2)) * 1.0E9d), 1.0d) < 0 ? floor2 + 1 : floor2;
            case 6:
                long j10 = this.f57509a;
                return j10 < 63072000 ? j10 - 63072000 : (long) Math.floor(Y());
            default:
                throw new UnsupportedOperationException("Not yet implemented: " + enumC6185f);
        }
    }

    public A h0(long j10, N n10) {
        A a10;
        O(this);
        if (j10 == 0) {
            return this;
        }
        try {
            int i10 = a.$SwitchMap$net$time4j$SI[n10.ordinal()];
            if (i10 == 1) {
                a10 = C6183d.q().u() ? new A(AbstractC5469c.f(X(), j10), a(), EnumC6185f.UTC) : f0(AbstractC5469c.f(this.f57509a, j10), a(), EnumC6185f.POSIX);
            } else {
                if (i10 != 2) {
                    throw new UnsupportedOperationException();
                }
                long f10 = AbstractC5469c.f(a(), j10);
                int d10 = AbstractC5469c.d(f10, 1000000000);
                long b10 = AbstractC5469c.b(f10, 1000000000);
                a10 = C6183d.q().u() ? new A(AbstractC5469c.f(X(), b10), d10, EnumC6185f.UTC) : f0(AbstractC5469c.f(this.f57509a, b10), d10, EnumC6185f.POSIX);
            }
            if (j10 < 0) {
                O(a10);
            }
            return a10;
        } catch (IllegalArgumentException e10) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e10);
            throw arithmeticException;
        }
    }

    public int hashCode() {
        long j10 = this.f57509a;
        return (((int) (j10 ^ (j10 >>> 32))) * 19) + (a() * 37);
    }

    public r j0(AbstractC5914j abstractC5914j, String str, net.time4j.tz.k kVar, oi.F f10) {
        H n02 = n0(kVar);
        n02.R();
        ((H) n02.D(f10.b(n02.P(), kVar), EnumC5714g.f58145c)).P();
        throw null;
    }

    @Override // li.InterfaceC5472f
    public long k() {
        return this.f57509a;
    }

    public r k0(oi.x xVar, net.time4j.tz.k kVar, oi.F f10) {
        H n02 = n0(kVar);
        return r.b(((H) n02.D(f10.b(n02.P(), kVar), EnumC5714g.f58145c)).P().N(xVar.r()), n02.R());
    }

    public final String m0(boolean z10) {
        F W10 = W();
        int Z10 = Z(this);
        int i10 = Z10 / 60;
        int i11 = i10 / 60;
        int i12 = i10 % 60;
        int s10 = (Z10 % 60) + C6183d.q().s(X());
        int a10 = a();
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(W10);
        sb2.append('T');
        T(i11, 2, sb2);
        if (z10 || (i12 | s10 | a10) != 0) {
            sb2.append(':');
            T(i12, 2, sb2);
            if (z10 || (s10 | a10) != 0) {
                sb2.append(':');
                T(s10, 2, sb2);
                if (a10 > 0) {
                    sb2.append(',');
                    T(a10, 9, sb2);
                }
            }
        }
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return sb2.toString();
    }

    public H n0(net.time4j.tz.k kVar) {
        return a0(net.time4j.tz.l.N(kVar));
    }

    public final A o0(EnumC6185f enumC6185f) {
        if (enumC6185f != EnumC6185f.UTC) {
            if (d0()) {
                throw new IllegalArgumentException("Leap seconds do not exist on continuous time scale: " + enumC6185f);
            }
            int i10 = a.$SwitchMap$net$time4j$scale$TimeScale[enumC6185f.ordinal()];
            if (i10 != 1) {
                if (i10 == 3) {
                    return new A(AbstractC5469c.m(this.f57509a, -378691200L), a(), enumC6185f);
                }
                if (i10 == 4) {
                    return new A(AbstractC5469c.m(this.f57509a, 315964800L), a(), enumC6185f);
                }
                if (i10 == 5 || i10 == 6) {
                    return new A(AbstractC5469c.m(this.f57509a, 63072000L), a(), enumC6185f);
                }
                throw new UnsupportedOperationException(enumC6185f.name());
            }
        }
        return this;
    }

    public final A p0(EnumC6185f enumC6185f) {
        switch (a.$SwitchMap$net$time4j$scale$TimeScale[enumC6185f.ordinal()]) {
            case 1:
                if (d0()) {
                    return new A(a(), this.f57509a);
                }
            case 2:
                return this;
            case 3:
                return new A(g(enumC6185f), AbstractC5469c.f(h(enumC6185f), -378691200L));
            case 4:
                return new A(a(), AbstractC5469c.f(h(EnumC6185f.GPS), 315964800L));
            case 5:
            case 6:
                return new A(g(enumC6185f), AbstractC5469c.f(h(enumC6185f), 63072000L));
            default:
                throw new UnsupportedOperationException(enumC6185f.name());
        }
    }

    public void q0(DataOutput dataOutput) {
        int i10 = e0() ? 65 : 64;
        int a10 = a();
        if (a10 > 0) {
            i10 |= 2;
        }
        dataOutput.writeByte(i10);
        dataOutput.writeLong(this.f57509a);
        if (a10 > 0) {
            dataOutput.writeInt(a10);
        }
    }

    public String toString() {
        return m0(true);
    }

    public A(long j10, int i10, EnumC6185f enumC6185f) {
        long j11;
        long floor;
        int l02;
        long h10;
        long j12 = j10;
        int i11 = i10;
        if (enumC6185f == EnumC6185f.POSIX) {
            this.f57509a = j12;
            this.f57510b = i11;
        } else {
            C6183d q10 = C6183d.q();
            if (!q10.u()) {
                throw new IllegalStateException("Leap seconds are not supported by configuration.");
            }
            if (enumC6185f == EnumC6185f.UTC) {
                j11 = 0;
            } else {
                j11 = 0;
                if (enumC6185f == EnumC6185f.TAI) {
                    if (j12 < 0) {
                        throw new IllegalArgumentException("TAI not supported before 1958-01-01: " + j12);
                    }
                    if (j12 < 441763200) {
                        long f10 = AbstractC5469c.f(j12, -441763168L);
                        int e10 = AbstractC5469c.e(i11, 184000000);
                        if (e10 >= 1000000000) {
                            f10 = AbstractC5469c.f(f10, 1L);
                            e10 = AbstractC5469c.l(e10, 1000000000);
                        }
                        double d10 = f10 + (e10 / 1.0E9d);
                        double c10 = d10 - EnumC6185f.c(F.G0(AbstractC5469c.b((long) (d10 - 42.184d), 86400), EnumC5900A.UTC));
                        floor = (long) Math.floor(c10);
                        l02 = l0(c10, floor);
                    } else {
                        l02 = i11;
                        floor = AbstractC5469c.m(j12, 441763210L);
                    }
                } else if (enumC6185f == EnumC6185f.GPS) {
                    long f11 = AbstractC5469c.f(j12, 252892809L);
                    if (f11 < 252892809) {
                        throw new IllegalArgumentException("GPS not supported before 1980-01-06: " + j12);
                    }
                    l02 = i11;
                    floor = f11;
                } else if (enumC6185f == EnumC6185f.TT) {
                    if (j12 < 42 || (j12 == 42 && i11 < 184000000)) {
                        double d11 = j12 + (i11 / 1.0E9d);
                        double c11 = d11 - EnumC6185f.c(F.G0(AbstractC5469c.b((long) (d11 - 42.184d), 86400), EnumC5900A.UTC));
                        floor = (long) Math.floor(c11);
                        l02 = l0(c11, floor);
                    } else {
                        j12 = AbstractC5469c.m(j12, 42L);
                        i11 = AbstractC5469c.l(i11, 184000000);
                        if (i11 < 0) {
                            j12 = AbstractC5469c.m(j12, 1L);
                            i11 = AbstractC5469c.e(i11, 1000000000);
                        }
                    }
                } else {
                    if (enumC6185f != EnumC6185f.UT) {
                        throw new UnsupportedOperationException("Not yet implemented: " + enumC6185f.name());
                    }
                    if (j12 >= 0) {
                        double c12 = ((j12 + (i11 / 1.0E9d)) + EnumC6185f.c(F.G0(AbstractC5469c.b(j12, 86400), EnumC5900A.UTC))) - 42.184d;
                        floor = (long) Math.floor(c12);
                        l02 = l0(c12, floor);
                    }
                }
                long w10 = q10.w(floor);
                h10 = floor - q10.h(w10);
                this.f57509a = w10;
                if (h10 != j11 || w10 == f57496d) {
                    this.f57510b = l02;
                } else {
                    if (h10 != 1) {
                        throw new IllegalStateException("Cannot handle leap shift of " + j12 + ".");
                    }
                    this.f57510b = 1073741824 | l02;
                }
                i11 = l02;
            }
            l02 = i11;
            floor = j12;
            long w102 = q10.w(floor);
            h10 = floor - q10.h(w102);
            this.f57509a = w102;
            if (h10 != j11) {
            }
            this.f57510b = l02;
            i11 = l02;
        }
        R(this.f57509a);
        P(i11);
    }

    public A(int i10, long j10) {
        R(j10);
        this.f57509a = j10;
        this.f57510b = i10;
    }
}
