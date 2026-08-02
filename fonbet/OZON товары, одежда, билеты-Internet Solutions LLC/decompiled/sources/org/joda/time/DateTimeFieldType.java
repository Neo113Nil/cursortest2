package org.joda.time;

import java.io.Serializable;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public abstract class DateTimeFieldType implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final DateTimeFieldType f78964a;

    /* renamed from: b, reason: collision with root package name */
    private static final DateTimeFieldType f78965b;

    /* renamed from: c, reason: collision with root package name */
    private static final DateTimeFieldType f78966c;

    /* renamed from: d, reason: collision with root package name */
    private static final DateTimeFieldType f78967d;

    /* renamed from: e, reason: collision with root package name */
    private static final DateTimeFieldType f78968e;

    /* renamed from: f, reason: collision with root package name */
    private static final DateTimeFieldType f78969f;

    /* renamed from: g, reason: collision with root package name */
    private static final DateTimeFieldType f78970g;

    /* renamed from: h, reason: collision with root package name */
    private static final DateTimeFieldType f78971h;

    /* renamed from: i, reason: collision with root package name */
    private static final DateTimeFieldType f78972i;

    /* renamed from: j, reason: collision with root package name */
    private static final DateTimeFieldType f78973j;

    /* renamed from: k, reason: collision with root package name */
    private static final DateTimeFieldType f78974k;

    /* renamed from: l, reason: collision with root package name */
    private static final DateTimeFieldType f78975l;

    /* renamed from: m, reason: collision with root package name */
    private static final DateTimeFieldType f78976m;

    /* renamed from: n, reason: collision with root package name */
    private static final DateTimeFieldType f78977n;

    /* renamed from: o, reason: collision with root package name */
    private static final DateTimeFieldType f78978o;

    /* renamed from: p, reason: collision with root package name */
    private static final DateTimeFieldType f78979p;

    /* renamed from: q, reason: collision with root package name */
    private static final DateTimeFieldType f78980q;

    /* renamed from: r, reason: collision with root package name */
    private static final DateTimeFieldType f78981r;

    /* renamed from: s, reason: collision with root package name */
    private static final DateTimeFieldType f78982s;
    private static final long serialVersionUID = -42615285973990L;

    /* renamed from: t, reason: collision with root package name */
    private static final DateTimeFieldType f78983t;

    /* renamed from: u, reason: collision with root package name */
    private static final DateTimeFieldType f78984u;

    /* renamed from: v, reason: collision with root package name */
    private static final DateTimeFieldType f78985v;

    /* renamed from: w, reason: collision with root package name */
    private static final DateTimeFieldType f78986w;
    private final String iName;

    private static class StandardDateTimeFieldType extends DateTimeFieldType {
        private static final long serialVersionUID = -9937958251642L;
        private final byte iOrdinal;

        /* renamed from: x, reason: collision with root package name */
        private final transient DurationFieldType f78987x;

        /* renamed from: y, reason: collision with root package name */
        private final transient DurationFieldType f78988y;

        StandardDateTimeFieldType(String str, byte b11, DurationFieldType durationFieldType, DurationFieldType durationFieldType2) {
            super(str);
            this.iOrdinal = b11;
            this.f78987x = durationFieldType;
            this.f78988y = durationFieldType2;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DateTimeFieldType.f78964a;
                case 2:
                    return DateTimeFieldType.f78965b;
                case 3:
                    return DateTimeFieldType.f78966c;
                case 4:
                    return DateTimeFieldType.f78967d;
                case 5:
                    return DateTimeFieldType.f78968e;
                case 6:
                    return DateTimeFieldType.f78969f;
                case 7:
                    return DateTimeFieldType.f78970g;
                case 8:
                    return DateTimeFieldType.f78971h;
                case 9:
                    return DateTimeFieldType.f78972i;
                case 10:
                    return DateTimeFieldType.f78973j;
                case 11:
                    return DateTimeFieldType.f78974k;
                case 12:
                    return DateTimeFieldType.f78975l;
                case 13:
                    return DateTimeFieldType.f78976m;
                case 14:
                    return DateTimeFieldType.f78977n;
                case 15:
                    return DateTimeFieldType.f78978o;
                case 16:
                    return DateTimeFieldType.f78979p;
                case 17:
                    return DateTimeFieldType.f78980q;
                case 18:
                    return DateTimeFieldType.f78981r;
                case 19:
                    return DateTimeFieldType.f78982s;
                case 20:
                    return DateTimeFieldType.f78983t;
                case 21:
                    return DateTimeFieldType.f78984u;
                case 22:
                    return DateTimeFieldType.f78985v;
                case 23:
                    return DateTimeFieldType.f78986w;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.DateTimeFieldType
        public final DurationFieldType N() {
            return this.f78987x;
        }

        @Override // org.joda.time.DateTimeFieldType
        public final b O(a aVar) {
            int i11 = c.f79052b;
            if (aVar == null) {
                aVar = ISOChronology.g0();
            }
            switch (this.iOrdinal) {
                case 1:
                    return aVar.l();
                case 2:
                    return aVar.a0();
                case 3:
                    return aVar.d();
                case 4:
                    return aVar.Z();
                case 5:
                    return aVar.Y();
                case 6:
                    return aVar.i();
                case 7:
                    return aVar.L();
                case 8:
                    return aVar.g();
                case 9:
                    return aVar.U();
                case 10:
                    return aVar.T();
                case 11:
                    return aVar.R();
                case 12:
                    return aVar.h();
                case 13:
                    return aVar.A();
                case 14:
                    return aVar.D();
                case 15:
                    return aVar.f();
                case 16:
                    return aVar.e();
                case 17:
                    return aVar.C();
                case 18:
                    return aVar.I();
                case 19:
                    return aVar.J();
                case 20:
                    return aVar.N();
                case 21:
                    return aVar.O();
                case 22:
                    return aVar.G();
                case 23:
                    return aVar.H();
                default:
                    throw new InternalError();
            }
        }

        @Override // org.joda.time.DateTimeFieldType
        public final DurationFieldType Q() {
            return this.f78988y;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandardDateTimeFieldType) && this.iOrdinal == ((StandardDateTimeFieldType) obj).iOrdinal;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    static {
        DurationFieldType durationFieldType = DurationFieldType.f79007a;
        f78964a = new StandardDateTimeFieldType("era", (byte) 1, durationFieldType, null);
        DurationFieldType durationFieldType2 = DurationFieldType.f79010d;
        f78965b = new StandardDateTimeFieldType("yearOfEra", (byte) 2, durationFieldType2, durationFieldType);
        DurationFieldType durationFieldType3 = DurationFieldType.f79008b;
        f78966c = new StandardDateTimeFieldType("centuryOfEra", (byte) 3, durationFieldType3, durationFieldType);
        f78967d = new StandardDateTimeFieldType("yearOfCentury", (byte) 4, durationFieldType2, durationFieldType3);
        f78968e = new StandardDateTimeFieldType("year", (byte) 5, durationFieldType2, null);
        DurationFieldType durationFieldType4 = DurationFieldType.f79013g;
        f78969f = new StandardDateTimeFieldType("dayOfYear", (byte) 6, durationFieldType4, durationFieldType2);
        DurationFieldType durationFieldType5 = DurationFieldType.f79011e;
        f78970g = new StandardDateTimeFieldType("monthOfYear", (byte) 7, durationFieldType5, durationFieldType2);
        f78971h = new StandardDateTimeFieldType("dayOfMonth", (byte) 8, durationFieldType4, durationFieldType5);
        DurationFieldType durationFieldType6 = DurationFieldType.f79009c;
        f78972i = new StandardDateTimeFieldType("weekyearOfCentury", (byte) 9, durationFieldType6, durationFieldType3);
        f78973j = new StandardDateTimeFieldType("weekyear", (byte) 10, durationFieldType6, null);
        DurationFieldType durationFieldType7 = DurationFieldType.f79012f;
        f78974k = new StandardDateTimeFieldType("weekOfWeekyear", (byte) 11, durationFieldType7, durationFieldType6);
        f78975l = new StandardDateTimeFieldType("dayOfWeek", (byte) 12, durationFieldType4, durationFieldType7);
        DurationFieldType durationFieldType8 = DurationFieldType.f79014h;
        f78976m = new StandardDateTimeFieldType("halfdayOfDay", (byte) 13, durationFieldType8, durationFieldType4);
        DurationFieldType durationFieldType9 = DurationFieldType.f79015i;
        f78977n = new StandardDateTimeFieldType("hourOfHalfday", (byte) 14, durationFieldType9, durationFieldType8);
        f78978o = new StandardDateTimeFieldType("clockhourOfHalfday", (byte) 15, durationFieldType9, durationFieldType8);
        f78979p = new StandardDateTimeFieldType("clockhourOfDay", (byte) 16, durationFieldType9, durationFieldType4);
        f78980q = new StandardDateTimeFieldType("hourOfDay", (byte) 17, durationFieldType9, durationFieldType4);
        DurationFieldType durationFieldType10 = DurationFieldType.f79016j;
        f78981r = new StandardDateTimeFieldType("minuteOfDay", (byte) 18, durationFieldType10, durationFieldType4);
        f78982s = new StandardDateTimeFieldType("minuteOfHour", (byte) 19, durationFieldType10, durationFieldType9);
        DurationFieldType durationFieldType11 = DurationFieldType.f79017k;
        f78983t = new StandardDateTimeFieldType("secondOfDay", (byte) 20, durationFieldType11, durationFieldType4);
        f78984u = new StandardDateTimeFieldType("secondOfMinute", (byte) 21, durationFieldType11, durationFieldType10);
        DurationFieldType durationFieldType12 = DurationFieldType.f79018l;
        f78985v = new StandardDateTimeFieldType("millisOfDay", (byte) 22, durationFieldType12, durationFieldType4);
        f78986w = new StandardDateTimeFieldType("millisOfSecond", (byte) 23, durationFieldType12, durationFieldType11);
    }

    protected DateTimeFieldType(String str) {
        this.iName = str;
    }

    public static DateTimeFieldType G() {
        return f78966c;
    }

    public static DateTimeFieldType H() {
        return f78979p;
    }

    public static DateTimeFieldType I() {
        return f78978o;
    }

    public static DateTimeFieldType J() {
        return f78971h;
    }

    public static DateTimeFieldType K() {
        return f78975l;
    }

    public static DateTimeFieldType L() {
        return f78969f;
    }

    public static DateTimeFieldType M() {
        return f78964a;
    }

    public static DateTimeFieldType R() {
        return f78976m;
    }

    public static DateTimeFieldType S() {
        return f78980q;
    }

    public static DateTimeFieldType T() {
        return f78977n;
    }

    public static DateTimeFieldType U() {
        return f78985v;
    }

    public static DateTimeFieldType V() {
        return f78986w;
    }

    public static DateTimeFieldType W() {
        return f78981r;
    }

    public static DateTimeFieldType X() {
        return f78982s;
    }

    public static DateTimeFieldType Y() {
        return f78970g;
    }

    public static DateTimeFieldType Z() {
        return f78983t;
    }

    public static DateTimeFieldType a0() {
        return f78984u;
    }

    public static DateTimeFieldType b0() {
        return f78974k;
    }

    public static DateTimeFieldType c0() {
        return f78973j;
    }

    public static DateTimeFieldType d0() {
        return f78972i;
    }

    public static DateTimeFieldType e0() {
        return f78968e;
    }

    public static DateTimeFieldType f0() {
        return f78967d;
    }

    public static DateTimeFieldType g0() {
        return f78965b;
    }

    public abstract DurationFieldType N();

    public abstract b O(a aVar);

    public final String P() {
        return this.iName;
    }

    public abstract DurationFieldType Q();

    public final String toString() {
        return this.iName;
    }
}
