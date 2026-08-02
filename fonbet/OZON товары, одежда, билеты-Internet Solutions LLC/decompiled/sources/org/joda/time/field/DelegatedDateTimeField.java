package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* loaded from: classes10.dex */
public class DelegatedDateTimeField extends org.joda.time.b implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final org.joda.time.b iField;
    private final org.joda.time.d iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(org.joda.time.b bVar, org.joda.time.d dVar, DateTimeFieldType dateTimeFieldType) {
        if (bVar == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.iField = bVar;
        this.iRangeDurationField = dVar;
        this.iType = dateTimeFieldType == null ? bVar.C() : dateTimeFieldType;
    }

    @Override // org.joda.time.b
    public final String A() {
        return this.iType.P();
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        org.joda.time.d dVar = this.iRangeDurationField;
        return dVar != null ? dVar : this.iField.B();
    }

    @Override // org.joda.time.b
    public final DateTimeFieldType C() {
        return this.iType;
    }

    @Override // org.joda.time.b
    public final boolean D(long j11) {
        return this.iField.D(j11);
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return this.iField.E();
    }

    @Override // org.joda.time.b
    public final boolean F() {
        return this.iField.F();
    }

    @Override // org.joda.time.b
    public final long G(long j11) {
        return this.iField.G(j11);
    }

    @Override // org.joda.time.b
    public final long H(long j11) {
        return this.iField.H(j11);
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        return this.iField.I(j11);
    }

    @Override // org.joda.time.b
    public final long J(long j11) {
        return this.iField.J(j11);
    }

    @Override // org.joda.time.b
    public final long K(long j11) {
        return this.iField.K(j11);
    }

    @Override // org.joda.time.b
    public final long L(long j11) {
        return this.iField.L(j11);
    }

    @Override // org.joda.time.b
    public long M(int i11, long j11) {
        return this.iField.M(i11, j11);
    }

    @Override // org.joda.time.b
    public final long N(long j11, String str, Locale locale) {
        return this.iField.N(j11, str, locale);
    }

    @Override // org.joda.time.b
    public final long a(int i11, long j11) {
        return this.iField.a(i11, j11);
    }

    @Override // org.joda.time.b
    public final long b(long j11, long j12) {
        return this.iField.b(j11, j12);
    }

    @Override // org.joda.time.b
    public int d(long j11) {
        return this.iField.d(j11);
    }

    @Override // org.joda.time.b
    public final String e(int i11, Locale locale) {
        return this.iField.e(i11, locale);
    }

    @Override // org.joda.time.b
    public final String f(long j11, Locale locale) {
        return this.iField.f(j11, locale);
    }

    @Override // org.joda.time.b
    public final String g(org.joda.time.base.e eVar, Locale locale) {
        return this.iField.g(eVar, locale);
    }

    @Override // org.joda.time.b
    public final String h(int i11, Locale locale) {
        return this.iField.h(i11, locale);
    }

    @Override // org.joda.time.b
    public final String i(long j11, Locale locale) {
        return this.iField.i(j11, locale);
    }

    @Override // org.joda.time.b
    public final String j(org.joda.time.base.e eVar, Locale locale) {
        return this.iField.j(eVar, locale);
    }

    @Override // org.joda.time.b
    public final int l(long j11, long j12) {
        return this.iField.l(j11, j12);
    }

    @Override // org.joda.time.b
    public final long m(long j11, long j12) {
        return this.iField.m(j11, j12);
    }

    @Override // org.joda.time.b
    public final org.joda.time.d n() {
        return this.iField.n();
    }

    @Override // org.joda.time.b
    public final org.joda.time.d p() {
        return this.iField.p();
    }

    @Override // org.joda.time.b
    public final int s(Locale locale) {
        return this.iField.s(locale);
    }

    public final String toString() {
        return "DateTimeField[" + this.iType.P() + ']';
    }

    @Override // org.joda.time.b
    public final int u() {
        return this.iField.u();
    }

    @Override // org.joda.time.b
    public final int v(long j11) {
        return this.iField.v(j11);
    }

    @Override // org.joda.time.b
    public int y() {
        return this.iField.y();
    }
}
