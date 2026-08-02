package org.joda.time;

import java.io.Serializable;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public abstract class DurationFieldType implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final DurationFieldType f79007a = new StandardDurationFieldType("eras", (byte) 1);

    /* renamed from: b, reason: collision with root package name */
    static final DurationFieldType f79008b = new StandardDurationFieldType("centuries", (byte) 2);

    /* renamed from: c, reason: collision with root package name */
    static final DurationFieldType f79009c = new StandardDurationFieldType("weekyears", (byte) 3);

    /* renamed from: d, reason: collision with root package name */
    static final DurationFieldType f79010d = new StandardDurationFieldType("years", (byte) 4);

    /* renamed from: e, reason: collision with root package name */
    static final DurationFieldType f79011e = new StandardDurationFieldType("months", (byte) 5);

    /* renamed from: f, reason: collision with root package name */
    static final DurationFieldType f79012f = new StandardDurationFieldType("weeks", (byte) 6);

    /* renamed from: g, reason: collision with root package name */
    static final DurationFieldType f79013g = new StandardDurationFieldType("days", (byte) 7);

    /* renamed from: h, reason: collision with root package name */
    static final DurationFieldType f79014h = new StandardDurationFieldType("halfdays", (byte) 8);

    /* renamed from: i, reason: collision with root package name */
    static final DurationFieldType f79015i = new StandardDurationFieldType("hours", (byte) 9);

    /* renamed from: j, reason: collision with root package name */
    static final DurationFieldType f79016j = new StandardDurationFieldType("minutes", (byte) 10);

    /* renamed from: k, reason: collision with root package name */
    static final DurationFieldType f79017k = new StandardDurationFieldType("seconds", (byte) 11);

    /* renamed from: l, reason: collision with root package name */
    static final DurationFieldType f79018l = new StandardDurationFieldType("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;
    private final String iName;

    private static class StandardDurationFieldType extends DurationFieldType {
        private static final long serialVersionUID = 31156755687123L;
        private final byte iOrdinal;

        StandardDurationFieldType(String str, byte b11) {
            super(str);
            this.iOrdinal = b11;
        }

        private Object readResolve() {
            switch (this.iOrdinal) {
                case 1:
                    return DurationFieldType.f79007a;
                case 2:
                    return DurationFieldType.f79008b;
                case 3:
                    return DurationFieldType.f79009c;
                case 4:
                    return DurationFieldType.f79010d;
                case 5:
                    return DurationFieldType.f79011e;
                case 6:
                    return DurationFieldType.f79012f;
                case 7:
                    return DurationFieldType.f79013g;
                case 8:
                    return DurationFieldType.f79014h;
                case 9:
                    return DurationFieldType.f79015i;
                case 10:
                    return DurationFieldType.f79016j;
                case 11:
                    return DurationFieldType.f79017k;
                case 12:
                    return DurationFieldType.f79018l;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.DurationFieldType
        public final d e(a aVar) {
            int i11 = c.f79052b;
            if (aVar == null) {
                aVar = ISOChronology.g0();
            }
            switch (this.iOrdinal) {
                case 1:
                    return aVar.m();
                case 2:
                    return aVar.b();
                case 3:
                    return aVar.V();
                case 4:
                    return aVar.b0();
                case 5:
                    return aVar.M();
                case 6:
                    return aVar.S();
                case 7:
                    return aVar.j();
                case 8:
                    return aVar.B();
                case 9:
                    return aVar.E();
                case 10:
                    return aVar.K();
                case 11:
                    return aVar.P();
                case 12:
                    return aVar.F();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StandardDurationFieldType) && this.iOrdinal == ((StandardDurationFieldType) obj).iOrdinal;
        }

        public final int hashCode() {
            return 1 << this.iOrdinal;
        }
    }

    protected DurationFieldType(String str) {
        this.iName = str;
    }

    public static DurationFieldType a() {
        return f79008b;
    }

    public static DurationFieldType b() {
        return f79013g;
    }

    public static DurationFieldType d() {
        return f79007a;
    }

    public static DurationFieldType g() {
        return f79014h;
    }

    public static DurationFieldType h() {
        return f79015i;
    }

    public static DurationFieldType i() {
        return f79018l;
    }

    public static DurationFieldType j() {
        return f79016j;
    }

    public static DurationFieldType l() {
        return f79011e;
    }

    public static DurationFieldType m() {
        return f79017k;
    }

    public static DurationFieldType n() {
        return f79012f;
    }

    public static DurationFieldType p() {
        return f79009c;
    }

    public static DurationFieldType s() {
        return f79010d;
    }

    public abstract d e(a aVar);

    public final String f() {
        return this.iName;
    }

    public final String toString() {
        return this.iName;
    }
}
