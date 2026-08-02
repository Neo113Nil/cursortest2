package org.joda.time;

import java.io.Serializable;
import org.joda.convert.ToString;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
public final class LocalDateTime extends org.joda.time.base.g implements Serializable {
    private static final long serialVersionUID = -268716875315837168L;
    private final a iChronology;
    private final long iLocalMillis;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDateTime() {
        this(System.currentTimeMillis(), ISOChronology.g0());
        int i11 = c.f79052b;
    }

    private Object readResolve() {
        a aVar = this.iChronology;
        if (aVar == null) {
            return new LocalDateTime(this.iLocalMillis, ISOChronology.i0());
        }
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        DateTimeZone y11 = aVar.y();
        ((UTCDateTimeZone) dateTimeZone).getClass();
        return !(y11 instanceof UTCDateTimeZone) ? new LocalDateTime(this.iLocalMillis, this.iChronology.W()) : this;
    }

    @Override // org.joda.time.base.e
    /* renamed from: a */
    public final int compareTo(j jVar) {
        if (this == jVar) {
            return 0;
        }
        if (jVar instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) jVar;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                long j11 = this.iLocalMillis;
                long j12 = localDateTime.iLocalMillis;
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
            return aVar.Y();
        }
        if (i11 == 1) {
            return aVar.L();
        }
        if (i11 == 2) {
            return aVar.g();
        }
        if (i11 == 3) {
            return aVar.G();
        }
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.iChronology.equals(localDateTime.iChronology)) {
                return this.iLocalMillis == localDateTime.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public final LocalDate g() {
        return new LocalDate(this.iLocalMillis, this.iChronology);
    }

    @Override // org.joda.time.j
    public final a getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.j
    public final int getValue(int i11) {
        if (i11 == 0) {
            return this.iChronology.Y().d(this.iLocalMillis);
        }
        if (i11 == 1) {
            return this.iChronology.L().d(this.iLocalMillis);
        }
        if (i11 == 2) {
            return this.iChronology.g().d(this.iLocalMillis);
        }
        if (i11 == 3) {
            return this.iChronology.G().d(this.iLocalMillis);
        }
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final int hashCode() {
        return this.iChronology.hashCode() + this.iChronology.G().C().hashCode() + ((this.iChronology.G().d(this.iLocalMillis) + ((this.iChronology.g().C().hashCode() + ((this.iChronology.g().d(this.iLocalMillis) + ((this.iChronology.L().C().hashCode() + ((this.iChronology.L().d(this.iLocalMillis) + ((this.iChronology.Y().C().hashCode() + ((this.iChronology.Y().d(this.iLocalMillis) + 3611) * 23)) * 23)) * 23)) * 23)) * 23)) * 23)) * 23);
    }

    @Override // org.joda.time.j
    public final int s0(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return dateTimeFieldType.O(this.iChronology).d(this.iLocalMillis);
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    @Override // org.joda.time.j
    public final int size() {
        return 4;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.i.b().h(this);
    }

    @Override // org.joda.time.j
    public final boolean y(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        return dateTimeFieldType.O(this.iChronology).F();
    }

    public LocalDateTime(long j11, a aVar) {
        int i11 = c.f79052b;
        aVar = aVar == null ? ISOChronology.g0() : aVar;
        this.iLocalMillis = aVar.y().i(j11, DateTimeZone.f78989a);
        this.iChronology = aVar.W();
    }
}
