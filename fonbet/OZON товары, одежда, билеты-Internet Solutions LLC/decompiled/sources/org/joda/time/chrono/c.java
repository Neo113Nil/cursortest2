package org.joda.time.chrono;

import Bl0.k0;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes10.dex */
final class c extends org.joda.time.field.a {

    /* renamed from: b, reason: collision with root package name */
    private final String f79182b;

    c() {
        super(DateTimeFieldType.M());
        this.f79182b = "BE";
    }

    @Override // org.joda.time.b
    public final org.joda.time.d B() {
        return null;
    }

    @Override // org.joda.time.b
    public final boolean E() {
        return false;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long H(long j11) {
        return Long.MAX_VALUE;
    }

    @Override // org.joda.time.b
    public final long I(long j11) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long J(long j11) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long K(long j11) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long L(long j11) {
        return Long.MIN_VALUE;
    }

    @Override // org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, 1, 1);
        return j11;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final long N(long j11, String str, Locale locale) {
        if (this.f79182b.equals(str) || "1".equals(str)) {
            return j11;
        }
        throw new IllegalFieldValueException(DateTimeFieldType.M(), str);
    }

    @Override // org.joda.time.b
    public final int d(long j11) {
        return 1;
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final String h(int i11, Locale locale) {
        return this.f79182b;
    }

    @Override // org.joda.time.b
    public final org.joda.time.d n() {
        return UnsupportedDurationField.l(DurationFieldType.d());
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int s(Locale locale) {
        return this.f79182b.length();
    }

    @Override // org.joda.time.b
    public final int u() {
        return 1;
    }

    @Override // org.joda.time.b
    public final int y() {
        return 1;
    }
}
