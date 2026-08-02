package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes10.dex */
public final class UnsupportedDateTimeField extends org.joda.time.b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> f79215a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final org.joda.time.d iDurationField;
    private final DateTimeFieldType iType;

    private UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, org.joda.time.d dVar) {
        if (dateTimeFieldType == null || dVar == null) {
            throw new IllegalArgumentException();
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = dVar;
    }

    public static synchronized UnsupportedDateTimeField P(DateTimeFieldType dateTimeFieldType, org.joda.time.d dVar) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        synchronized (UnsupportedDateTimeField.class) {
            try {
                HashMap<DateTimeFieldType, UnsupportedDateTimeField> hashMap = f79215a;
                unsupportedDateTimeField = null;
                if (hashMap == null) {
                    f79215a = new HashMap<>(7);
                } else {
                    UnsupportedDateTimeField unsupportedDateTimeField2 = hashMap.get(dateTimeFieldType);
                    if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.iDurationField == dVar) {
                        unsupportedDateTimeField = unsupportedDateTimeField2;
                    }
                }
                if (unsupportedDateTimeField == null) {
                    unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, dVar);
                    f79215a.put(dateTimeFieldType, unsupportedDateTimeField);
                }
            } finally {
            }
        }
        return unsupportedDateTimeField;
    }

    private UnsupportedOperationException Q() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    private Object readResolve() {
        return P(this.iType, this.iDurationField);
    }

    @Override // org.joda.time.b
    public final String A() {
        return this.iType.P();
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return null;
    }

    @Override // org.joda.time.b
    public final DateTimeFieldType C() {
        return this.iType;
    }

    @Override // org.joda.time.b
    public final boolean D(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return false;
    }

    @Override // org.joda.time.b
    public final boolean F() {
        return false;
    }

    @Override // org.joda.time.b
    public final long G(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long H(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long J(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long K(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long L(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long M(int i11, long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long N(long j11, String str, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final long a(int i11, long j11) {
        return this.iDurationField.a(i11, j11);
    }

    @Override // org.joda.time.b
    public final long b(long j11, long j12) {
        return this.iDurationField.b(j11, j12);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final String e(int i11, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final String f(long j11, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final String g(org.joda.time.base.e eVar, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final String h(int i11, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final String i(long j11, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final String j(org.joda.time.base.e eVar, Locale locale) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final int l(long j11, long j12) {
        return this.iDurationField.d(j11, j12);
    }

    @Override // org.joda.time.b
    public final long m(long j11, long j12) {
        return this.iDurationField.e(j11, j12);
    }

    @Override // org.joda.time.b
    public final org.joda.time.d n() {
        return this.iDurationField;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d p() {
        return null;
    }

    @Override // org.joda.time.b
    public final int s(Locale locale) {
        throw Q();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // org.joda.time.b
    public final int u() {
        throw Q();
    }

    @Override // org.joda.time.b
    public final int v(long j11) {
        throw Q();
    }

    @Override // org.joda.time.b
    public final int y() {
        throw Q();
    }
}
