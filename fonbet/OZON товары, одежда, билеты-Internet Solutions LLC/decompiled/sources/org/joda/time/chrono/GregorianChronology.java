package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

/* loaded from: classes6.dex */
public final class GregorianChronology extends BasicGJChronology {
    private static final long serialVersionUID = -861407383323710522L;

    /* renamed from: D0, reason: collision with root package name */
    private static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> f79163D0 = new ConcurrentHashMap<>();

    /* renamed from: C0, reason: collision with root package name */
    private static final GregorianChronology f79162C0 = K0(DateTimeZone.f78989a, 4);

    public static GregorianChronology K0(DateTimeZone dateTimeZone, int i11) {
        GregorianChronology gregorianChronology;
        GregorianChronology[] putIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        ConcurrentHashMap<DateTimeZone, GregorianChronology[]> concurrentHashMap = f79163D0;
        GregorianChronology[] gregorianChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (gregorianChronologyArr == null && (putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (gregorianChronologyArr = new GregorianChronology[7]))) != null) {
            gregorianChronologyArr = putIfAbsent;
        }
        int i12 = i11 - 1;
        try {
            GregorianChronology gregorianChronology2 = gregorianChronologyArr[i12];
            if (gregorianChronology2 != null) {
                return gregorianChronology2;
            }
            synchronized (gregorianChronologyArr) {
                try {
                    gregorianChronology = gregorianChronologyArr[i12];
                    if (gregorianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.f78989a;
                        gregorianChronology = dateTimeZone == dateTimeZone2 ? new GregorianChronology(null, i11) : new GregorianChronology(ZonedChronology.i0(K0(dateTimeZone2, i11), dateTimeZone), i11);
                        gregorianChronologyArr[i12] = gregorianChronology;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return gregorianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Invalid min days in first week: "));
        }
    }

    public static GregorianChronology L0() {
        return f79162C0;
    }

    private Object readResolve() {
        org.joda.time.a d02 = d0();
        int x02 = super.x0();
        if (x02 == 0) {
            x02 = 4;
        }
        return d02 == null ? K0(DateTimeZone.f78989a, x02) : K0(d02.y(), x02);
    }

    @Override // org.joda.time.chrono.BasicChronology
    final boolean I0(int i11) {
        if ((i11 & 3) == 0) {
            return i11 % 100 != 0 || i11 % 400 == 0;
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final org.joda.time.a W() {
        return f79162C0;
    }

    @Override // org.joda.time.a
    public final org.joda.time.a X(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        return dateTimeZone == super.y() ? this : K0(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    protected final void c0(AssembledChronology.a aVar) {
        if (d0() == null) {
            super.c0(aVar);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long i0(int i11) {
        int i12;
        int i13 = i11 / 100;
        if (i11 < 0) {
            i12 = ((((i11 + 3) >> 2) - i13) + ((i13 + 3) >> 2)) - 1;
        } else {
            i12 = ((i11 >> 2) - i13) + (i13 >> 2);
            if (I0(i11)) {
                i12--;
            }
        }
        return ((i11 * 365) + (i12 - 719527)) * 86400000;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long j0() {
        return 31083597720000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long k0() {
        return 2629746000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long l0() {
        return 31556952000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long m0() {
        return 15778476000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int u0() {
        return 292278993;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int w0() {
        return -292275054;
    }
}
