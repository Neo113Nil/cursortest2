package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;

/* loaded from: classes10.dex */
public class MutableDateTime extends BaseDateTime implements Cloneable, Serializable {
    private static final long serialVersionUID = 2852608688135209575L;
    private b iRoundingField;
    private int iRoundingMode;

    public static final class Property extends AbstractReadableInstantFieldProperty {
        private static final long serialVersionUID = -4481126543819298617L;
        private b iField;
        private MutableDateTime iInstant;

        Property(MutableDateTime mutableDateTime, b bVar) {
            this.iInstant = mutableDateTime;
            this.iField = bVar;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.iInstant = (MutableDateTime) objectInputStream.readObject();
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

        public final void h() {
            MutableDateTime mutableDateTime = this.iInstant;
            mutableDateTime.g(this.iField.a(-1, mutableDateTime.getMillis()));
        }

        public final void i(int i11) {
            MutableDateTime mutableDateTime = this.iInstant;
            mutableDateTime.g(this.iField.M(i11, mutableDateTime.getMillis()));
        }
    }

    public MutableDateTime() {
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    @Override // org.joda.time.base.BaseDateTime
    public final void g(long j11) {
        int i11 = this.iRoundingMode;
        if (i11 == 1) {
            j11 = this.iRoundingField.I(j11);
        } else if (i11 == 2) {
            j11 = this.iRoundingField.H(j11);
        } else if (i11 == 3) {
            j11 = this.iRoundingField.L(j11);
        } else if (i11 == 4) {
            j11 = this.iRoundingField.J(j11);
        } else if (i11 == 5) {
            j11 = this.iRoundingField.K(j11);
        }
        super.g(j11);
    }

    public final Property h(DateTimeFieldType dateTimeFieldType) {
        b O11 = dateTimeFieldType.O(getChronology());
        if (O11.F()) {
            return new Property(this, O11);
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public final Property i() {
        return new Property(this, getChronology().N());
    }

    public final void j(DateTimeZone dateTimeZone) {
        int i11 = c.f79052b;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        DateTimeZone y11 = getChronology().y();
        if (y11 == null) {
            y11 = DateTimeZone.g();
        }
        if (dateTimeZone == y11) {
            return;
        }
        long i12 = y11.i(getMillis(), dateTimeZone);
        super.f(getChronology().X(dateTimeZone));
        g(i12);
    }

    public MutableDateTime(long j11, DateTimeZone dateTimeZone) {
        super(j11, dateTimeZone);
    }
}
