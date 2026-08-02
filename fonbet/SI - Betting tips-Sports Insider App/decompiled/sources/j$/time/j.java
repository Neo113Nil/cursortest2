package j$.time;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class j implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f17478e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f17479f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f17480g;

    /* renamed from: h, reason: collision with root package name */
    public static final j[] f17481h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* renamed from: a, reason: collision with root package name */
    public final byte f17482a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f17483b;

    /* renamed from: c, reason: collision with root package name */
    public final byte f17484c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17485d;

    static {
        int i5 = 0;
        while (true) {
            j[] jVarArr = f17481h;
            if (i5 < jVarArr.length) {
                jVarArr[i5] = new j(i5, 0, 0, 0);
                i5++;
            } else {
                j jVar = jVarArr[0];
                f17480g = jVar;
                j jVar2 = jVarArr[12];
                f17478e = jVar;
                f17479f = new j(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static j T(int i5, int i10, int i11, int i12) {
        j$.time.temporal.a.HOUR_OF_DAY.C(i5);
        j$.time.temporal.a.MINUTE_OF_HOUR.C(i10);
        j$.time.temporal.a.SECOND_OF_MINUTE.C(i11);
        j$.time.temporal.a.NANO_OF_SECOND.C(i12);
        return Q(i5, i10, i11, i12);
    }

    public static j U(long j) {
        j$.time.temporal.a.NANO_OF_DAY.C(j);
        int i5 = (int) (j / 3600000000000L);
        long j6 = j - (i5 * 3600000000000L);
        int i10 = (int) (j6 / 60000000000L);
        long j10 = j6 - (i10 * 60000000000L);
        int i11 = (int) (j10 / 1000000000);
        return Q(i5, i10, i11, (int) (j10 - (i11 * 1000000000)));
    }

    public static j R(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        j jVar = (j) temporalAccessor.z(j$.time.temporal.q.f17536g);
        if (jVar != null) {
            return jVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static j Q(int i5, int i10, int i11, int i12) {
        if ((i10 | i11 | i12) == 0) {
            return f17481h[i5];
        }
        return new j(i5, i10, i11, i12);
    }

    public j(int i5, int i10, int i11, int i12) {
        this.f17482a = (byte) i5;
        this.f17483b = (byte) i10;
        this.f17484c = (byte) i11;
        this.f17485d = i12;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).P();
        }
        return pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return S(pVar);
        }
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.NANO_OF_DAY) {
                return b0();
            }
            if (pVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return b0() / 1000;
            }
            return S(pVar);
        }
        return pVar.x(this);
    }

    public final int S(j$.time.temporal.p pVar) {
        switch (i.f17476a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f17485d;
            case 2:
                throw new j$.time.temporal.r("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.f17485d / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
            case 4:
                throw new j$.time.temporal.r("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.f17485d / 1000000;
            case 6:
                return (int) (b0() / 1000000);
            case 7:
                return this.f17484c;
            case 8:
                return c0();
            case 9:
                return this.f17483b;
            case 10:
                return (this.f17482a * 60) + this.f17483b;
            case 11:
                return this.f17482a % 12;
            case 12:
                int i5 = this.f17482a % 12;
                if (i5 % 12 == 0) {
                    return 12;
                }
                return i5;
            case 13:
                return this.f17482a;
            case 14:
                byte b10 = this.f17482a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f17482a / 12;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final j c(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (j) pVar.z(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.C(j);
        switch (i.f17476a[aVar.ordinal()]) {
            case 1:
                return e0((int) j);
            case 2:
                return U(j);
            case 3:
                return e0(((int) j) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
            case 4:
                return U(j * 1000);
            case 5:
                return e0(((int) j) * 1000000);
            case 6:
                return U(j * 1000000);
            case 7:
                int i5 = (int) j;
                if (this.f17484c != i5) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.C(i5);
                    return Q(this.f17482a, this.f17483b, i5, this.f17485d);
                }
                return this;
            case 8:
                return Z(j - c0());
            case 9:
                int i10 = (int) j;
                if (this.f17483b != i10) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.C(i10);
                    return Q(this.f17482a, i10, this.f17484c, this.f17485d);
                }
                return this;
            case 10:
                return X(j - ((this.f17482a * 60) + this.f17483b));
            case 11:
                return W(j - (this.f17482a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return W(j - (this.f17482a % 12));
            case 13:
                int i11 = (int) j;
                if (this.f17482a != i11) {
                    j$.time.temporal.a.HOUR_OF_DAY.C(i11);
                    return Q(i11, this.f17483b, this.f17484c, this.f17485d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i12 = (int) j;
                if (this.f17482a != i12) {
                    j$.time.temporal.a.HOUR_OF_DAY.C(i12);
                    return Q(i12, this.f17483b, this.f17484c, this.f17485d);
                }
                return this;
            case 15:
                return W((j - (this.f17482a / 12)) * 12);
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
    }

    public final j e0(int i5) {
        if (this.f17485d == i5) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.C(i5);
        return Q(this.f17482a, this.f17483b, this.f17484c, i5);
    }

    @Override // j$.time.temporal.l
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final j d(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (i.f17477b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return Y(j);
                case 2:
                    return Y((j % 86400000000L) * 1000);
                case 3:
                    return Y((j % 86400000) * 1000000);
                case 4:
                    return Z(j);
                case 5:
                    return X(j);
                case 6:
                    return W(j);
                case 7:
                    return W((j % 2) * 12);
                default:
                    throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
            }
        }
        return (j) temporalUnit.i(this, j);
    }

    public final j W(long j) {
        return j == 0 ? this : Q(((((int) (j % 24)) + this.f17482a) + 24) % 24, this.f17483b, this.f17484c, this.f17485d);
    }

    public final j X(long j) {
        if (j != 0) {
            int i5 = (this.f17482a * 60) + this.f17483b;
            int i10 = ((((int) (j % 1440)) + i5) + 1440) % 1440;
            if (i5 != i10) {
                return Q(i10 / 60, i10 % 60, this.f17484c, this.f17485d);
            }
        }
        return this;
    }

    public final j Z(long j) {
        if (j != 0) {
            int i5 = (this.f17483b * 60) + (this.f17482a * 3600) + this.f17484c;
            int i10 = ((((int) (j % 86400)) + i5) + 86400) % 86400;
            if (i5 != i10) {
                return Q(i10 / 3600, (i10 / 60) % 60, i10 % 60, this.f17485d);
            }
        }
        return this;
    }

    public final j Y(long j) {
        if (j != 0) {
            long b02 = b0();
            long j6 = (((j % 86400000000000L) + b02) + 86400000000000L) % 86400000000000L;
            if (b02 != j6) {
                return Q((int) (j6 / 3600000000000L), (int) ((j6 / 60000000000L) % 60), (int) ((j6 / 1000000000) % 60), (int) (j6 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? d(LongCompanionObject.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j, chronoUnit);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17531b || xVar == j$.time.temporal.q.f17530a || xVar == j$.time.temporal.q.f17534e || xVar == j$.time.temporal.q.f17533d) {
            return null;
        }
        if (xVar == j$.time.temporal.q.f17536g) {
            return this;
        }
        if (xVar == j$.time.temporal.q.f17535f) {
            return null;
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return ChronoUnit.NANOS;
        }
        return xVar.g(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(b0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int c0() {
        return (this.f17483b * 60) + (this.f17482a * 3600) + this.f17484c;
    }

    public final long b0() {
        return (this.f17484c * 1000000000) + (this.f17483b * 60000000000L) + (this.f17482a * 3600000000000L) + this.f17485d;
    }

    @Override // java.lang.Comparable
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int compare = Integer.compare(this.f17482a, jVar.f17482a);
        return (compare == 0 && (compare = Integer.compare(this.f17483b, jVar.f17483b)) == 0 && (compare = Integer.compare(this.f17484c, jVar.f17484c)) == 0) ? Integer.compare(this.f17485d, jVar.f17485d) : compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f17482a == jVar.f17482a && this.f17483b == jVar.f17483b && this.f17484c == jVar.f17484c && this.f17485d == jVar.f17485d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(g gVar) {
        return (j) j$.com.android.tools.r8.a.a(gVar, this);
    }

    public final int hashCode() {
        long b02 = b0();
        return (int) (b02 ^ (b02 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f17482a;
        byte b11 = this.f17483b;
        byte b12 = this.f17484c;
        int i5 = this.f17485d;
        sb2.append(b10 < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb2.append((int) b10);
        String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
        sb2.append(b11 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append((int) b11);
        if (b12 > 0 || i5 > 0) {
            if (b12 < 10) {
                str = ":0";
            }
            sb2.append(str);
            sb2.append((int) b12);
            if (i5 > 0) {
                sb2.append('.');
                if (i5 % 1000000 == 0) {
                    sb2.append(Integer.toString((i5 / 1000000) + AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT).substring(1));
                } else if (i5 % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT == 0) {
                    sb2.append(Integer.toString((i5 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i5 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void f0(DataOutput dataOutput) {
        if (this.f17485d == 0) {
            if (this.f17484c == 0) {
                if (this.f17483b == 0) {
                    dataOutput.writeByte(~this.f17482a);
                    return;
                } else {
                    dataOutput.writeByte(this.f17482a);
                    dataOutput.writeByte(~this.f17483b);
                    return;
                }
            }
            dataOutput.writeByte(this.f17482a);
            dataOutput.writeByte(this.f17483b);
            dataOutput.writeByte(~this.f17484c);
            return;
        }
        dataOutput.writeByte(this.f17482a);
        dataOutput.writeByte(this.f17483b);
        dataOutput.writeByte(this.f17484c);
        dataOutput.writeInt(this.f17485d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static j a0(DataInput dataInput) {
        int readInt;
        int i5;
        int readByte = dataInput.readByte();
        byte b10 = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i5 = 0;
            readInt = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                readInt = 0;
                b10 = r5;
                i5 = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i5 = ~readByte3;
                    readInt = 0;
                    b10 = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b10 = readByte2;
                    i5 = readByte3;
                }
            }
        }
        return T(readByte, b10, i5, readInt);
    }
}
