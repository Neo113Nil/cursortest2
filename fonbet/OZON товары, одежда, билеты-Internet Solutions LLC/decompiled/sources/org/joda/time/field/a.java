package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes6.dex */
public abstract class a extends org.joda.time.b {

    /* renamed from: a, reason: collision with root package name */
    private final DateTimeFieldType f79217a;

    protected a(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f79217a = dateTimeFieldType;
    }

    @Override // org.joda.time.b
    public final String A() {
        return this.f79217a.P();
    }

    @Override // org.joda.time.b
    public final DateTimeFieldType C() {
        return this.f79217a;
    }

    @Override // org.joda.time.b
    public boolean D(long j11) {
        return false;
    }

    @Override // org.joda.time.b
    public final boolean F() {
        return true;
    }

    @Override // org.joda.time.b
    public long G(long j11) {
        return j11 - I(j11);
    }

    @Override // org.joda.time.b
    public long H(long j11) {
        long I11 = I(j11);
        return I11 != j11 ? a(1, I11) : j11;
    }

    @Override // org.joda.time.b
    public long J(long j11) {
        long I11 = I(j11);
        long H11 = H(j11);
        return H11 - j11 <= j11 - I11 ? H11 : I11;
    }

    @Override // org.joda.time.b
    public long K(long j11) {
        long I11 = I(j11);
        long H11 = H(j11);
        long j12 = j11 - I11;
        long j13 = H11 - j11;
        return (j12 >= j13 && (j13 < j12 || (d(H11) & 1) == 0)) ? H11 : I11;
    }

    @Override // org.joda.time.b
    public long L(long j11) {
        long I11 = I(j11);
        long H11 = H(j11);
        return j11 - I11 <= H11 - j11 ? I11 : H11;
    }

    @Override // org.joda.time.b
    public long N(long j11, String str, Locale locale) {
        return M(P(str, locale), j11);
    }

    protected int P(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(this.f79217a, str);
        }
    }

    protected int Q(int i11, long j11) {
        return v(j11);
    }

    @Override // org.joda.time.b
    public long a(int i11, long j11) {
        return n().a(i11, j11);
    }

    @Override // org.joda.time.b
    public long b(long j11, long j12) {
        return n().b(j11, j12);
    }

    @Override // org.joda.time.b
    public String e(int i11, Locale locale) {
        return h(i11, locale);
    }

    @Override // org.joda.time.b
    public String f(long j11, Locale locale) {
        return e(d(j11), locale);
    }

    @Override // org.joda.time.b
    public final String g(org.joda.time.base.e eVar, Locale locale) {
        return e(eVar.s0(this.f79217a), locale);
    }

    @Override // org.joda.time.b
    public String h(int i11, Locale locale) {
        return Integer.toString(i11);
    }

    @Override // org.joda.time.b
    public String i(long j11, Locale locale) {
        return h(d(j11), locale);
    }

    @Override // org.joda.time.b
    public final String j(org.joda.time.base.e eVar, Locale locale) {
        return h(eVar.s0(this.f79217a), locale);
    }

    @Override // org.joda.time.b
    public int l(long j11, long j12) {
        return n().d(j11, j12);
    }

    @Override // org.joda.time.b
    public long m(long j11, long j12) {
        return n().e(j11, j12);
    }

    @Override // org.joda.time.b
    public org.joda.time.d p() {
        return null;
    }

    @Override // org.joda.time.b
    public int s(Locale locale) {
        int u11 = u();
        if (u11 >= 0) {
            if (u11 < 10) {
                return 1;
            }
            if (u11 < 100) {
                return 2;
            }
            if (u11 < 1000) {
                return 3;
            }
        }
        return Integer.toString(u11).length();
    }

    public final String toString() {
        return "DateTimeField[" + this.f79217a.P() + ']';
    }

    @Override // org.joda.time.b
    public int v(long j11) {
        return u();
    }
}
