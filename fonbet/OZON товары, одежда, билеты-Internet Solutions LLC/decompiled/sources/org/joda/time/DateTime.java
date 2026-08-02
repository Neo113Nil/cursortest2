package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* loaded from: classes6.dex */
public final class DateTime extends BaseDateTime implements Serializable {
    private static final long serialVersionUID = -5171125899451703815L;

    /* loaded from: classes10.dex */
    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -6983323811635733510L;
        private b iField;
        private DateTime iInstant;

        Property(DateTime dateTime, b bVar) {
            this.iInstant = dateTime;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (DateTime) objectInputStream.readObject();
            this.iField = ((DateTimeFieldType) objectInputStream.readObject()).O(this.iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.iInstant);
            objectOutputStream.writeObject(this.iField.C());
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        protected final a d() {
            return this.iInstant.getChronology();
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        public final b e() {
            return this.iField;
        }

        @Override // org.joda.time.field.AbstractReadableInstantFieldProperty
        protected final long g() {
            return this.iInstant.getMillis();
        }
    }

    public DateTime(long j11) {
        super(j11, ISOChronology.g0());
    }

    @FromString
    public static DateTime i(String str) {
        return org.joda.time.format.i.d().n().d(str);
    }

    @Override // org.joda.time.base.c
    public final DateTime d() {
        return this;
    }

    public final Property h() {
        return new Property(this, getChronology().L());
    }

    public final DateTime j(long j11) {
        return j11 != 0 ? n(getChronology().a(getMillis(), j11)) : this;
    }

    public final DateTime l(int i11) {
        return i11 == 0 ? this : n(getChronology().F().a(i11, getMillis()));
    }

    public final DateTime m(int i11) {
        return i11 == 0 ? this : n(getChronology().P().a(i11, getMillis()));
    }

    public final DateTime n(long j11) {
        return j11 == getMillis() ? this : new DateTime(j11, getChronology());
    }

    public final DateTime p(DateTimeZone dateTimeZone) {
        a X9 = getChronology().X(dateTimeZone);
        int i11 = c.f79052b;
        if (X9 == null) {
            X9 = ISOChronology.g0();
        }
        return X9 == getChronology() ? this : new DateTime(getMillis(), X9);
    }

    public final Property s() {
        return new Property(this, getChronology().Y());
    }

    public DateTime() {
    }
}
