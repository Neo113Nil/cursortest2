package org.joda.time;

import java.io.Serializable;
import java.util.HashSet;
import org.joda.convert.ToString;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
public final class LocalTime extends org.joda.time.base.g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f79035a;
    private static final long serialVersionUID = -12873158713873L;
    private final a iChronology;
    private final long iLocalMillis;

    static {
        new LocalTime(0);
        HashSet hashSet = new HashSet();
        f79035a = hashSet;
        hashSet.add(DurationFieldType.f79018l);
        hashSet.add(DurationFieldType.f79017k);
        hashSet.add(DurationFieldType.f79016j);
        hashSet.add(DurationFieldType.f79015i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalTime() {
        this(System.currentTimeMillis(), ISOChronology.g0());
        int i11 = c.f79052b;
    }

    private Object readResolve() {
        a aVar = this.iChronology;
        if (aVar == null) {
            return new LocalTime(this.iLocalMillis, ISOChronology.i0());
        }
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        DateTimeZone y11 = aVar.y();
        ((UTCDateTimeZone) dateTimeZone).getClass();
        return !(y11 instanceof UTCDateTimeZone) ? new LocalTime(this.iLocalMillis, this.iChronology.W()) : this;
    }

    @Override // org.joda.time.base.e
    /* renamed from: a */
    public final int compareTo(j jVar) {
        if (this == jVar) {
            return 0;
        }
        if (jVar instanceof LocalTime) {
            LocalTime localTime = (LocalTime) jVar;
            if (this.iChronology.equals(localTime.iChronology)) {
                long j11 = this.iLocalMillis;
                long j12 = localTime.iLocalMillis;
                if (j11 < j12) {
                    return -1;
                }
                return j11 == j12 ? 0 : 1;
            }
        }
        return super.compareTo(jVar);
    }

    @Override // org.joda.time.base.e
    protected final b d(int i11, a aVar) {
        if (i11 == 0) {
            return aVar.C();
        }
        if (i11 == 1) {
            return aVar.J();
        }
        if (i11 == 2) {
            return aVar.O();
        }
        if (i11 == 3) {
            return aVar.H();
        }
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.iChronology.equals(localTime.iChronology)) {
                return this.iLocalMillis == localTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public final boolean g(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            return false;
        }
        d e11 = durationFieldType.e(this.iChronology);
        if (f79035a.contains(durationFieldType) || e11.g() < this.iChronology.j().g()) {
            return e11.i();
        }
        return false;
    }

    @Override // org.joda.time.j
    public final a getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.j
    public final int getValue(int i11) {
        if (i11 == 0) {
            return this.iChronology.C().d(this.iLocalMillis);
        }
        if (i11 == 1) {
            return this.iChronology.J().d(this.iLocalMillis);
        }
        if (i11 == 2) {
            return this.iChronology.O().d(this.iLocalMillis);
        }
        if (i11 == 3) {
            return this.iChronology.H().d(this.iLocalMillis);
        }
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final int hashCode() {
        return this.iChronology.hashCode() + this.iChronology.H().C().hashCode() + ((this.iChronology.H().d(this.iLocalMillis) + ((this.iChronology.O().C().hashCode() + ((this.iChronology.O().d(this.iLocalMillis) + ((this.iChronology.J().C().hashCode() + ((this.iChronology.J().d(this.iLocalMillis) + ((this.iChronology.C().C().hashCode() + ((this.iChronology.C().d(this.iLocalMillis) + 3611) * 23)) * 23)) * 23)) * 23)) * 23)) * 23)) * 23);
    }

    @Override // org.joda.time.j
    public final int s0(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (y(dateTimeFieldType)) {
            return dateTimeFieldType.O(this.iChronology).d(this.iLocalMillis);
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    @Override // org.joda.time.j
    public final int size() {
        return 4;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.i.f().h(this);
    }

    @Override // org.joda.time.j
    public final boolean y(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null || !g(dateTimeFieldType.N())) {
            return false;
        }
        DurationFieldType Q11 = dateTimeFieldType.Q();
        return g(Q11) || Q11 == DurationFieldType.f79013g;
    }

    public LocalTime(long j11, a aVar) {
        int i11 = c.f79052b;
        aVar = aVar == null ? ISOChronology.g0() : aVar;
        long i12 = aVar.y().i(j11, DateTimeZone.f78989a);
        a W11 = aVar.W();
        this.iLocalMillis = W11.G().d(i12);
        this.iChronology = W11;
    }

    public LocalTime(int i11) {
        ISOChronology i02 = ISOChronology.i0();
        int i12 = c.f79052b;
        a W11 = (i02 == null ? ISOChronology.g0() : i02).W();
        long v11 = W11.v(0L);
        this.iChronology = W11;
        this.iLocalMillis = v11;
    }
}
