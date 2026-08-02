package j$.time.zone;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.r;
import j$.time.j;
import j$.time.l;
import j$.time.temporal.n;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f17586i = new long[0];
    public static final e[] j = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f17587k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    public static final b[] f17588l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f17589a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f17590b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f17591c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f17592d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f17593e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f17594f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeZone f17595g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f17596h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f17572b;
        if (bVar.i()) {
            if (localDateTime.R(localDateTime2)) {
                return bVar.f17573c;
            }
            if (!localDateTime.R(bVar.f17572b.U(bVar.f17574d.f17297b - bVar.f17573c.f17297b))) {
                return bVar.f17574d;
            }
        } else {
            if (!localDateTime.R(localDateTime2)) {
                return bVar.f17574d;
            }
            if (localDateTime.R(bVar.f17572b.U(bVar.f17574d.f17297b - bVar.f17573c.f17297b))) {
                return bVar.f17573c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f17589a = jArr;
        this.f17590b = zoneOffsetArr;
        this.f17591c = jArr2;
        this.f17593e = zoneOffsetArr2;
        this.f17594f = eVarArr;
        if (jArr2.length == 0) {
            this.f17592d = f17587k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 < jArr2.length) {
                int i10 = i5 + 1;
                b bVar = new b(jArr2[i5], zoneOffsetArr2[i5], zoneOffsetArr2[i10]);
                if (bVar.i()) {
                    arrayList.add(bVar.f17572b);
                    arrayList.add(bVar.f17572b.U(bVar.f17574d.f17297b - bVar.f17573c.f17297b));
                } else {
                    arrayList.add(bVar.f17572b.U(bVar.f17574d.f17297b - bVar.f17573c.f17297b));
                    arrayList.add(bVar.f17572b);
                }
                i5 = i10;
            }
            this.f17592d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f17595g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f17590b = zoneOffsetArr;
        long[] jArr = f17586i;
        this.f17589a = jArr;
        this.f17591c = jArr;
        this.f17592d = f17587k;
        this.f17593e = zoneOffsetArr;
        this.f17594f = j;
        this.f17595g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.f17590b = zoneOffsetArr;
        long[] jArr = f17586i;
        this.f17589a = jArr;
        this.f17591c = jArr;
        this.f17592d = f17587k;
        this.f17593e = zoneOffsetArr;
        this.f17594f = j;
        this.f17595g = timeZone;
    }

    public static ZoneOffset h(int i5) {
        return ZoneOffset.X(i5 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f17595g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j6, ZoneOffset zoneOffset) {
        return j$.time.g.a0(j$.com.android.tools.r8.a.S(j6 + zoneOffset.f17297b, 86400)).f17472a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f17595g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f17591c.length == 0) {
            return this.f17590b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f17594f.length > 0) {
            if (epochSecond > this.f17591c[r7.length - 1]) {
                b[] b10 = b(c(epochSecond, this.f17593e[r7.length - 1]));
                b bVar = null;
                for (int i5 = 0; i5 < b10.length; i5++) {
                    bVar = b10[i5];
                    if (epochSecond < bVar.f17571a) {
                        return bVar.f17573c;
                    }
                }
                return bVar.f17574d;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f17591c, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f17593e[binarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object e7 = e(localDateTime);
        if (!(e7 instanceof b)) {
            return Collections.singletonList((ZoneOffset) e7);
        }
        b bVar = (b) e7;
        return bVar.i() ? Collections.EMPTY_LIST : j$.com.android.tools.r8.a.O(new Object[]{bVar.f17573c, bVar.f17574d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r8.P(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r8.f17288b.b0() <= r0.f17288b.b0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        int i5 = 0;
        if (this.f17595g != null) {
            b[] b10 = b(localDateTime.f17287a.f17472a);
            if (b10.length == 0) {
                return h(this.f17595g.getOffset(j$.com.android.tools.r8.a.w(localDateTime, this.f17590b[0]) * 1000));
            }
            int length = b10.length;
            while (i5 < length) {
                b bVar = b10[i5];
                Object a7 = a(localDateTime, bVar);
                if ((a7 instanceof b) || a7.equals(bVar.f17573c)) {
                    return a7;
                }
                i5++;
                obj = a7;
            }
            return obj;
        }
        if (this.f17591c.length == 0) {
            return this.f17590b[0];
        }
        if (this.f17594f.length > 0) {
            LocalDateTime localDateTime2 = this.f17592d[r0.length - 1];
            if (localDateTime2 == null) {
                long D = localDateTime.f17287a.D();
                long D2 = localDateTime2.f17287a.D();
                if (D <= D2) {
                    if (D == D2) {
                    }
                }
                b[] b11 = b(localDateTime.f17287a.f17472a);
                int length2 = b11.length;
                while (i5 < length2) {
                    b bVar2 = b11[i5];
                    Object a10 = a(localDateTime, bVar2);
                    if ((a10 instanceof b) || a10.equals(bVar2.f17573c)) {
                        return a10;
                    }
                    i5++;
                    obj = a10;
                }
                return obj;
            }
            localDateTime.getClass();
        }
        int binarySearch = Arrays.binarySearch(this.f17592d, localDateTime);
        if (binarySearch == -1) {
            return this.f17593e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.f17592d;
            if (binarySearch < objArr.length - 1) {
                int i10 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i10])) {
                    binarySearch = i10;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f17593e[(binarySearch / 2) + 1];
        }
        LocalDateTime[] localDateTimeArr = this.f17592d;
        LocalDateTime localDateTime3 = localDateTimeArr[binarySearch];
        LocalDateTime localDateTime4 = localDateTimeArr[binarySearch + 1];
        ZoneOffset[] zoneOffsetArr = this.f17593e;
        int i11 = binarySearch / 2;
        ZoneOffset zoneOffset = zoneOffsetArr[i11];
        ZoneOffset zoneOffset2 = zoneOffsetArr[i11 + 1];
        return zoneOffset2.f17297b > zoneOffset.f17297b ? new b(localDateTime3, zoneOffset, zoneOffset2) : new b(localDateTime4, zoneOffset, zoneOffset2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b[] b(int i5) {
        j$.time.g Q;
        b[] bVarArr = f17588l;
        Integer valueOf = Integer.valueOf(i5);
        b[] bVarArr2 = (b[]) this.f17596h.get(valueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j6 = 1;
        int i10 = 0;
        int i11 = 1;
        if (this.f17595g != null) {
            if (i5 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f17285c;
            j$.time.g Z = j$.time.g.Z(i5 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.C(0);
            long w10 = j$.com.android.tools.r8.a.w(new LocalDateTime(Z, j.f17481h[0]), this.f17590b[0]);
            long j10 = 1000;
            int offset = this.f17595g.getOffset(w10 * 1000);
            long j11 = 31968000 + w10;
            while (w10 < j11) {
                long j12 = w10 + 7776000;
                long j13 = j10;
                if (offset != this.f17595g.getOffset(j12 * j13)) {
                    while (j12 - w10 > j6) {
                        long S = j$.com.android.tools.r8.a.S(j12 + w10, 2L);
                        if (this.f17595g.getOffset(S * j13) == offset) {
                            w10 = S;
                        } else {
                            j12 = S;
                        }
                        j6 = 1;
                    }
                    if (this.f17595g.getOffset(w10 * j13) == offset) {
                        w10 = j12;
                    }
                    ZoneOffset h10 = h(offset);
                    int offset2 = this.f17595g.getOffset(w10 * j13);
                    ZoneOffset h11 = h(offset2);
                    if (c(w10, h11) == i5) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(w10, h10, h11);
                    }
                    offset = offset2;
                } else {
                    w10 = j12;
                }
                j10 = j13;
                j6 = 1;
            }
            if (1916 <= i5 && i5 < 2100) {
                this.f17596h.putIfAbsent(valueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f17594f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i12 = 0;
        while (i12 < eVarArr.length) {
            e eVar = eVarArr[i12];
            byte b10 = eVar.f17578b;
            if (b10 < 0) {
                l lVar = eVar.f17577a;
                long j14 = i5;
                int Q2 = lVar.Q(r.f17346c.O(j14)) + 1 + eVar.f17578b;
                j$.time.g gVar = j$.time.g.f17470d;
                j$.time.temporal.a.YEAR.C(j14);
                Objects.requireNonNull(lVar, "month");
                j$.time.temporal.a.DAY_OF_MONTH.C(Q2);
                Q = j$.time.g.Q(i5, lVar.getValue(), Q2);
                j$.time.d dVar = eVar.f17579c;
                if (dVar != null) {
                    Q = Q.j(new n(dVar.getValue(), i11));
                }
            } else {
                l lVar2 = eVar.f17577a;
                j$.time.g gVar2 = j$.time.g.f17470d;
                j$.time.temporal.a.YEAR.C(i5);
                Objects.requireNonNull(lVar2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.C(b10);
                Q = j$.time.g.Q(i5, lVar2.getValue(), b10);
                j$.time.d dVar2 = eVar.f17579c;
                if (dVar2 != null) {
                    Q = Q.j(new n(dVar2.getValue(), i10));
                }
            }
            if (eVar.f17581e) {
                Q = Q.d0(1L);
            }
            LocalDateTime S2 = LocalDateTime.S(Q, eVar.f17580d);
            d dVar3 = eVar.f17582f;
            ZoneOffset zoneOffset = eVar.f17583g;
            ZoneOffset zoneOffset2 = eVar.f17584h;
            dVar3.getClass();
            int i13 = c.f17575a[dVar3.ordinal()];
            if (i13 == 1) {
                S2 = S2.U(zoneOffset2.f17297b - ZoneOffset.UTC.f17297b);
            } else if (i13 == 2) {
                S2 = S2.U(zoneOffset2.f17297b - zoneOffset.f17297b);
            }
            bVarArr3[i12] = new b(S2, eVar.f17584h, eVar.f17585i);
            i12++;
            i10 = 0;
        }
        if (i5 < 2100) {
            this.f17596h.putIfAbsent(valueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffset;
        TimeZone timeZone = this.f17595g;
        if (timeZone != null) {
            zoneOffset = h(timeZone.getRawOffset());
        } else if (this.f17591c.length == 0) {
            zoneOffset = this.f17590b[0];
        } else {
            int binarySearch = Arrays.binarySearch(this.f17589a, instant.getEpochSecond());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            zoneOffset = this.f17590b[binarySearch + 1];
        }
        return !zoneOffset.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f17595g, fVar.f17595g) && Arrays.equals(this.f17589a, fVar.f17589a) && Arrays.equals(this.f17590b, fVar.f17590b) && Arrays.equals(this.f17591c, fVar.f17591c) && Arrays.equals(this.f17593e, fVar.f17593e) && Arrays.equals(this.f17594f, fVar.f17594f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f17595g) ^ Arrays.hashCode(this.f17589a)) ^ Arrays.hashCode(this.f17590b)) ^ Arrays.hashCode(this.f17591c)) ^ Arrays.hashCode(this.f17593e)) ^ Arrays.hashCode(this.f17594f);
    }

    public final String toString() {
        TimeZone timeZone = this.f17595g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f17590b[r0.length - 1] + "]";
    }
}
