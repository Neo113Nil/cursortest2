package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* loaded from: classes10.dex */
public final class LocalDate extends org.joda.time.base.g implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f79030b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f79031c = 0;
    private static final long serialVersionUID = -8775358157899L;

    /* renamed from: a, reason: collision with root package name */
    private transient int f79032a;
    private final a iChronology;
    private final long iLocalMillis;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -3193829732634L;

        /* renamed from: a, reason: collision with root package name */
        private transient LocalDate f79033a;

        /* renamed from: b, reason: collision with root package name */
        private transient b f79034b;

        Property(LocalDate localDate, b bVar) {
            this.f79033a = localDate;
            this.f79034b = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f79033a = (LocalDate) objectInputStream.readObject();
            this.f79034b = ((DateTimeFieldType) objectInputStream.readObject()).O(this.f79033a.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f79033a);
            objectOutputStream.writeObject(this.f79034b.C());
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        protected final a d() {
            return this.f79033a.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public final b e() {
            return this.f79034b;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        protected final long g() {
            return this.f79033a.m();
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f79030b = hashSet;
        hashSet.add(DurationFieldType.f79013g);
        hashSet.add(DurationFieldType.f79012f);
        hashSet.add(DurationFieldType.f79011e);
        hashSet.add(DurationFieldType.f79009c);
        hashSet.add(DurationFieldType.f79010d);
        hashSet.add(DurationFieldType.f79008b);
        hashSet.add(DurationFieldType.f79007a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDate() {
        this(System.currentTimeMillis(), ISOChronology.g0());
        int i11 = c.f79052b;
    }

    public static LocalDate A() {
        return new LocalDate();
    }

    @FromString
    public static LocalDate B(String str) {
        return org.joda.time.format.i.e().e(str);
    }

    public static LocalDate h(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (date.getTime() >= 0) {
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        int i11 = gregorianCalendar.get(0);
        int i12 = gregorianCalendar.get(1);
        if (i11 != 1) {
            i12 = 1 - i12;
        }
        return new LocalDate(i12, gregorianCalendar.get(2) + 1, gregorianCalendar.get(5));
    }

    private Object readResolve() {
        a aVar = this.iChronology;
        if (aVar == null) {
            return new LocalDate(this.iLocalMillis, ISOChronology.i0());
        }
        DateTimeZone dateTimeZone = DateTimeZone.f78989a;
        DateTimeZone y11 = aVar.y();
        ((UTCDateTimeZone) dateTimeZone).getClass();
        return !(y11 instanceof UTCDateTimeZone) ? new LocalDate(this.iLocalMillis, this.iChronology.W()) : this;
    }

    public final LocalDate C(int i11) {
        return i11 == 0 ? this : F(this.iChronology.j().a(i11, this.iLocalMillis));
    }

    public final Date D() {
        int i11 = i();
        Date date = new Date(s() - 1900, n() - 1, i11);
        LocalDate h11 = h(date);
        if (h11.compareTo(this) >= 0) {
            if (h11.equals(this)) {
                Date date2 = new Date(date.getTime() - TimeZone.getDefault().getDSTSavings());
                if (date2.getDate() == i11) {
                    return date2;
                }
            }
            return date;
        }
        while (!h11.equals(this)) {
            date.setTime(date.getTime() + 3600000);
            h11 = h(date);
        }
        while (date.getDate() == i11) {
            date.setTime(date.getTime() - 1000);
        }
        date.setTime(date.getTime() + 1000);
        return date;
    }

    public final String E(String str) {
        return org.joda.time.format.a.b(str).h(this);
    }

    final LocalDate F(long j11) {
        long I11 = this.iChronology.g().I(j11);
        return I11 == this.iLocalMillis ? this : new LocalDate(I11, this.iChronology);
    }

    @Override // org.joda.time.base.e
    /* renamed from: a */
    public final int compareTo(j jVar) {
        if (this == jVar) {
            return 0;
        }
        if (jVar instanceof LocalDate) {
            LocalDate localDate = (LocalDate) jVar;
            if (this.iChronology.equals(localDate.iChronology)) {
                long j11 = this.iLocalMillis;
                long j12 = localDate.iLocalMillis;
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
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            if (this.iChronology.equals(localDate.iChronology)) {
                return this.iLocalMillis == localDate.iLocalMillis;
            }
        }
        return super.equals(obj);
    }

    public final Property g() {
        return new Property(this, this.iChronology.g());
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
        throw new IndexOutOfBoundsException(Ej.b.a(i11, "Invalid index: "));
    }

    @Override // org.joda.time.base.e
    public final int hashCode() {
        int i11 = this.f79032a;
        if (i11 != 0) {
            return i11;
        }
        int hashCode = super.hashCode();
        this.f79032a = hashCode;
        return hashCode;
    }

    public final int i() {
        return this.iChronology.g().d(this.iLocalMillis);
    }

    public final int j() {
        return this.iChronology.h().d(this.iLocalMillis);
    }

    public final int l() {
        return this.iChronology.i().d(this.iLocalMillis);
    }

    protected final long m() {
        return this.iLocalMillis;
    }

    public final int n() {
        return this.iChronology.L().d(this.iLocalMillis);
    }

    public final int p() {
        return this.iChronology.R().d(this.iLocalMillis);
    }

    public final int s() {
        return this.iChronology.Y().d(this.iLocalMillis);
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
        return 3;
    }

    @ToString
    public final String toString() {
        return org.joda.time.format.i.a().h(this);
    }

    public final LocalDate u(int i11) {
        return i11 == 0 ? this : F(this.iChronology.j().j(i11, this.iLocalMillis));
    }

    public final LocalDate v() {
        return F(this.iChronology.b0().j(18, this.iLocalMillis));
    }

    @Override // org.joda.time.j
    public final boolean y(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            return false;
        }
        DurationFieldType N11 = dateTimeFieldType.N();
        if (f79030b.contains(N11) || N11.e(this.iChronology).g() >= this.iChronology.j().g()) {
            return dateTimeFieldType.O(this.iChronology).F();
        }
        return false;
    }

    public LocalDate(long j11) {
        this(j11, ISOChronology.g0());
    }

    public LocalDate(long j11, a aVar) {
        int i11 = c.f79052b;
        aVar = aVar == null ? ISOChronology.g0() : aVar;
        long i12 = aVar.y().i(j11, DateTimeZone.f78989a);
        a W11 = aVar.W();
        this.iLocalMillis = W11.g().I(i12);
        this.iChronology = W11;
    }

    public LocalDate(int i11, int i12, int i13) {
        ISOChronology i02 = ISOChronology.i0();
        int i14 = c.f79052b;
        a W11 = (i02 == null ? ISOChronology.g0() : i02).W();
        long u11 = W11.u(i11, i12, i13, 0);
        this.iChronology = W11;
        this.iLocalMillis = u11;
    }
}
