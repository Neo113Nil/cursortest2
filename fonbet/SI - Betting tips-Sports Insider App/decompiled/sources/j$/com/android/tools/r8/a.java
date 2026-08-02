package j$.com.android.tools.r8;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.f0;
import j$.time.chrono.h;
import j$.time.chrono.k;
import j$.time.chrono.l;
import j$.time.chrono.n;
import j$.time.chrono.r;
import j$.time.chrono.u;
import j$.time.chrono.z;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.x;
import j$.util.Comparator;
import j$.util.List;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.a0;
import j$.util.b0;
import j$.util.c0;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.j;
import j$.util.d0;
import j$.util.function.b;
import j$.util.function.d;
import j$.util.function.e;
import j$.util.h0;
import j$.util.l0;
import j$.util.s1;
import j$.util.t0;
import j$.util.w0;
import j$.util.z0;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int M(long j) {
        int i5 = (int) j;
        if (j == i5) {
            return i5;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long N(long j, long j6) {
        long j10 = j + j6;
        if (((j6 ^ j) < 0) || ((j ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ List O(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Map.Entry P(Object obj, Object obj2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(obj), Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean Q(Unsafe unsafe, Object obj, long j, j jVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j6 = j;
            j jVar2 = jVar;
            if (unsafe2.compareAndSwapObject(obj2, j6, (Object) null, jVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j6) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j6;
            jVar = jVar2;
        }
    }

    public static /* synthetic */ long R(long j, long j6) {
        long j10 = j % j6;
        if (j10 == 0) {
            return 0L;
        }
        return (((j ^ j6) >> 63) | 1) > 0 ? j10 : j10 + j6;
    }

    public static /* synthetic */ long S(long j, long j6) {
        long j10 = j / j6;
        return (j - (j6 * j10) != 0 && (((j ^ j6) >> 63) | 1) < 0) ? j10 - 1 : j10;
    }

    public static /* synthetic */ long T(long j, long j6) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j6;
        }
        if (numberOfLeadingZeros >= 64) {
            if ((j6 != Long.MIN_VALUE) | (j >= 0)) {
                long j10 = j * j6;
                if (j == 0 || j10 / j == j6) {
                    return j10;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long U(long j, long j6) {
        long j10 = j - j6;
        if (((j6 ^ j) >= 0) || ((j ^ j10) >= 0)) {
            return j10;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ void X(List list, Comparator comparator) {
        if (list instanceof j$.util.List) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    public static /* synthetic */ Comparator Z(Comparator comparator, Comparator comparator2) {
        return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static Optional D(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (!optional.isPresent()) {
            return Optional.f17602b;
        }
        return new Optional(optional.get());
    }

    public static a0 E(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return a0.f17612c;
        }
        return new a0(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b b(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.b(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                DoubleConsumer.this.accept(d10);
                doubleConsumer2.accept(d10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.d] */
    public static d c(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.c(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i5) {
                IntConsumer.this.accept(i5);
                intConsumer2.accept(i5);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e d(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.d(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static c0 G(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return c0.f17622c;
        }
        return new c0(optionalLong.getAsLong());
    }

    public static String C(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static b0 F(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return b0.f17616c;
        }
        return new b0(optionalInt.getAsInt());
    }

    public static void h(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static String V(Object obj, Object obj2) {
        String str;
        String obj3;
        String str2 = "null";
        if (obj == null || (str = obj.toString()) == null) {
            str = "null";
        }
        int length = str.length();
        if (obj2 != null && (obj3 = obj2.toString()) != null) {
            str2 = obj3;
        }
        int length2 = str2.length();
        char[] cArr = new char[length + length2 + 1];
        str.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str2.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static String B(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static OptionalDouble I(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        boolean z5 = a0Var.f17613a;
        if (!z5) {
            return OptionalDouble.empty();
        }
        if (z5) {
            return OptionalDouble.of(a0Var.f17614b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt J(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        boolean z5 = b0Var.f17617a;
        if (!z5) {
            return OptionalInt.empty();
        }
        if (z5) {
            return OptionalInt.of(b0Var.f17618b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong K(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        boolean z5 = c0Var.f17623a;
        if (!z5) {
            return OptionalLong.empty();
        }
        if (z5) {
            return OptionalLong.of(c0Var.f17624b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static boolean r(l lVar, p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.i(lVar);
    }

    public static java.util.Optional H(Optional optional) {
        if (optional == null) {
            return null;
        }
        Object obj = optional.f17603a;
        if (obj == null) {
            return java.util.Optional.empty();
        }
        if (obj != null) {
            return java.util.Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static k L(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Object obj = (k) temporalAccessor.z(q.f17531b);
        r rVar = r.f17346c;
        if (obj == null) {
            obj = Objects.requireNonNull(rVar, "defaultObj");
        }
        return (k) obj;
    }

    public static j$.time.a Y() {
        return new j$.time.a(ZoneId.systemDefault());
    }

    public static int l(ChronoZonedDateTime chronoZonedDateTime, p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i5 = h.f17323a[((j$.time.temporal.a) pVar).ordinal()];
            if (i5 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i5 != 2) {
                return chronoZonedDateTime.o().i(pVar);
            }
            return chronoZonedDateTime.g().f17297b;
        }
        return q.a(chronoZonedDateTime, pVar);
    }

    public static int m(l lVar, p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        return q.a(lVar, pVar);
    }

    public static long o(l lVar, p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return lVar.getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
        return pVar.x(lVar);
    }

    public static k W(String str) {
        ConcurrentHashMap concurrentHashMap = j$.time.chrono.a.f17304a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = j$.time.chrono.a.f17304a;
            k kVar = (k) concurrentHashMap2.get(str);
            if (kVar == null) {
                kVar = (k) j$.time.chrono.a.f17305b.get(str);
            }
            if (kVar != null) {
                return kVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                Iterator it = ServiceLoader.load(k.class).iterator();
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    if (str.equals(kVar2.getId()) || str.equals(kVar2.l())) {
                        return kVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            n nVar = n.f17331l;
            nVar.getClass();
            j$.time.chrono.a.k(nVar, "Hijrah-umalqura");
            u uVar = u.f17349c;
            uVar.getClass();
            j$.time.chrono.a.k(uVar, "Japanese");
            z zVar = z.f17361c;
            zVar.getClass();
            j$.time.chrono.a.k(zVar, "Minguo");
            f0 f0Var = f0.f17316c;
            f0Var.getClass();
            j$.time.chrono.a.k(f0Var, "ThaiBuddhist");
            try {
                for (j$.time.chrono.a aVar : Arrays.asList(new j$.time.chrono.a[0])) {
                    if (!aVar.getId().equals("ISO")) {
                        j$.time.chrono.a.k(aVar, aVar.getId());
                    }
                }
                r rVar = r.f17346c;
                rVar.getClass();
                j$.time.chrono.a.k(rVar, "ISO");
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static Object v(l lVar, x xVar) {
        if (xVar == q.f17532c) {
            return ChronoUnit.ERAS;
        }
        return q.c(lVar, xVar);
    }

    public static Object t(ChronoLocalDateTime chronoLocalDateTime, x xVar) {
        if (xVar == q.f17530a || xVar == q.f17534e || xVar == q.f17533d) {
            return null;
        }
        if (xVar == q.f17536g) {
            return chronoLocalDateTime.b();
        }
        if (xVar == q.f17531b) {
            return chronoLocalDateTime.a();
        }
        if (xVar == q.f17532c) {
            return ChronoUnit.NANOS;
        }
        return xVar.g(chronoLocalDateTime);
    }

    public static boolean q(j$.time.chrono.b bVar, p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.i(bVar);
    }

    public static long n(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean p(Spliterator spliterator, int i5) {
        return (spliterator.characteristics() & i5) == i5;
    }

    public static long w(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.f().D() * 86400) + chronoLocalDateTime.b().c0()) - zoneOffset.f17297b;
    }

    public static Object u(ChronoZonedDateTime chronoZonedDateTime, x xVar) {
        if (xVar == q.f17534e || xVar == q.f17530a) {
            return chronoZonedDateTime.B();
        }
        if (xVar == q.f17533d) {
            return chronoZonedDateTime.g();
        }
        if (xVar == q.f17536g) {
            return chronoZonedDateTime.b();
        }
        if (xVar == q.f17531b) {
            return chronoZonedDateTime.a();
        }
        if (xVar == q.f17532c) {
            return ChronoUnit.NANOS;
        }
        return xVar.g(chronoZonedDateTime);
    }

    public static int f(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int compareTo = chronoLocalDateTime.f().compareTo(chronoLocalDateTime2.f());
        return (compareTo == 0 && (compareTo = chronoLocalDateTime.b().compareTo(chronoLocalDateTime2.b())) == 0) ? ((j$.time.chrono.a) chronoLocalDateTime.a()).getId().compareTo(chronoLocalDateTime2.a().getId()) : compareTo;
    }

    public static Object s(j$.time.chrono.b bVar, x xVar) {
        if (xVar == q.f17530a || xVar == q.f17534e || xVar == q.f17533d || xVar == q.f17536g) {
            return null;
        }
        if (xVar == q.f17531b) {
            return bVar.a();
        }
        if (xVar == q.f17532c) {
            return ChronoUnit.DAYS;
        }
        return xVar.g(bVar);
    }

    public static j$.time.temporal.l a(j$.time.chrono.b bVar, j$.time.temporal.l lVar) {
        return lVar.c(bVar.D(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long x(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.f().D() * 86400) + chronoZonedDateTime.b().c0()) - chronoZonedDateTime.g().f17297b;
    }

    public static int g(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int compare = Long.compare(chronoZonedDateTime.toEpochSecond(), chronoZonedDateTime2.toEpochSecond());
        return (compare == 0 && (compare = chronoZonedDateTime.b().f17485d - chronoZonedDateTime2.b().f17485d) == 0 && (compare = chronoZonedDateTime.o().H(chronoZonedDateTime2.o())) == 0 && (compare = chronoZonedDateTime.B().getId().compareTo(chronoZonedDateTime2.B().getId())) == 0) ? ((j$.time.chrono.a) chronoZonedDateTime.a()).getId().compareTo(chronoZonedDateTime2.a().getId()) : compare;
    }

    public static boolean z(w0 w0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return w0Var.tryAdvance((IntConsumer) consumer);
        }
        if (s1.f17782a) {
            s1.a(w0Var.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w0Var.tryAdvance((IntConsumer) new h0(consumer, 0));
    }

    public static void j(w0 w0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            w0Var.forEachRemaining((IntConsumer) consumer);
        } else {
            if (s1.f17782a) {
                s1.a(w0Var.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            w0Var.forEachRemaining((IntConsumer) new h0(consumer, 0));
        }
    }

    public static int e(j$.time.chrono.b bVar, j$.time.chrono.b bVar2) {
        int compare = Long.compare(bVar.D(), bVar2.D());
        if (compare != 0) {
            return compare;
        }
        return ((j$.time.chrono.a) bVar.a()).getId().compareTo(bVar2.a().getId());
    }

    public static boolean A(z0 z0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return z0Var.tryAdvance((LongConsumer) consumer);
        }
        if (s1.f17782a) {
            s1.a(z0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z0Var.tryAdvance((LongConsumer) new l0(consumer, 0));
    }

    public static void k(z0 z0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            z0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (s1.f17782a) {
                s1.a(z0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            z0Var.forEachRemaining((LongConsumer) new l0(consumer, 0));
        }
    }

    public static boolean y(t0 t0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return t0Var.tryAdvance((DoubleConsumer) consumer);
        }
        if (s1.f17782a) {
            s1.a(t0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return t0Var.tryAdvance((DoubleConsumer) new d0(consumer, 0));
    }

    public static void i(t0 t0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            t0Var.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (s1.f17782a) {
                s1.a(t0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            t0Var.forEachRemaining((DoubleConsumer) new d0(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
