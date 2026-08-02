package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.AssembledChronology;
import org.joda.time.field.SkipDateTimeField;

/* loaded from: classes10.dex */
public final class JulianChronology extends BasicGJChronology {
    private static final long serialVersionUID = -8731039522547897247L;

    /* renamed from: D0, reason: collision with root package name */
    private static final ConcurrentHashMap<DateTimeZone, JulianChronology[]> f79168D0 = new ConcurrentHashMap<>();

    /* renamed from: C0, reason: collision with root package name */
    private static final JulianChronology f79167C0 = K0(DateTimeZone.f78989a, 4);

    public static JulianChronology K0(DateTimeZone dateTimeZone, int i11) {
        JulianChronology julianChronology;
        JulianChronology[] putIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        ConcurrentHashMap<DateTimeZone, JulianChronology[]> concurrentHashMap = f79168D0;
        JulianChronology[] julianChronologyArr = concurrentHashMap.get(dateTimeZone);
        if (julianChronologyArr == null && (putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (julianChronologyArr = new JulianChronology[7]))) != null) {
            julianChronologyArr = putIfAbsent;
        }
        int i12 = i11 - 1;
        try {
            JulianChronology julianChronology2 = julianChronologyArr[i12];
            if (julianChronology2 != null) {
                return julianChronology2;
            }
            synchronized (julianChronologyArr) {
                try {
                    julianChronology = julianChronologyArr[i12];
                    if (julianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.f78989a;
                        julianChronology = dateTimeZone == dateTimeZone2 ? new JulianChronology(null, i11) : new JulianChronology(ZonedChronology.i0(K0(dateTimeZone2, i11), dateTimeZone), i11);
                        julianChronologyArr[i12] = julianChronology;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return julianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Invalid min days in first week: "));
        }
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
        return (i11 & 3) == 0;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final org.joda.time.a W() {
        return f79167C0;
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
            aVar.f79093E = new SkipDateTimeField(this, aVar.f79093E);
            aVar.f79090B = new SkipDateTimeField(this, aVar.f79090B);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long i0(int i11) {
        int i12;
        int i13 = i11 - 1968;
        if (i13 <= 0) {
            i12 = (i11 - 1965) >> 2;
        } else {
            int i14 = i13 >> 2;
            i12 = !I0(i11) ? i14 + 1 : i14;
        }
        return (((i13 * 365) + i12) * 86400000) - 62035200000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long j0() {
        return 31083663600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long k0() {
        return 2629800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long l0() {
        return 31557600000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long m0() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final long n0(int i11, int i12, int i13) throws IllegalArgumentException {
        if (i11 <= 0) {
            if (i11 == 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.e0(), Integer.valueOf(i11), (Integer) null, (Integer) null);
            }
            i11++;
        }
        return super.n0(i11, i12, i13);
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int u0() {
        return 292272992;
    }

    @Override // org.joda.time.chrono.BasicChronology
    final int w0() {
        return -292269054;
    }
}
