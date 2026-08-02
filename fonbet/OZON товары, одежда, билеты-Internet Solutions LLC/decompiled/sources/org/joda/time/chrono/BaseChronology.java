package org.joda.time.chrono;

import Bl0.k0;
import java.io.Serializable;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes6.dex */
public abstract class BaseChronology extends org.joda.time.a implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    protected BaseChronology() {
    }

    @Override // org.joda.time.a
    public org.joda.time.b A() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.R(), B());
    }

    @Override // org.joda.time.a
    public org.joda.time.d B() {
        return UnsupportedDurationField.l(DurationFieldType.g());
    }

    @Override // org.joda.time.a
    public org.joda.time.b C() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.S(), E());
    }

    @Override // org.joda.time.a
    public org.joda.time.b D() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.T(), E());
    }

    @Override // org.joda.time.a
    public org.joda.time.d E() {
        return UnsupportedDurationField.l(DurationFieldType.h());
    }

    @Override // org.joda.time.a
    public org.joda.time.d F() {
        return UnsupportedDurationField.l(DurationFieldType.i());
    }

    @Override // org.joda.time.a
    public org.joda.time.b G() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.U(), F());
    }

    @Override // org.joda.time.a
    public org.joda.time.b H() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.V(), F());
    }

    @Override // org.joda.time.a
    public org.joda.time.b I() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.W(), K());
    }

    @Override // org.joda.time.a
    public org.joda.time.b J() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.X(), K());
    }

    @Override // org.joda.time.a
    public org.joda.time.d K() {
        return UnsupportedDurationField.l(DurationFieldType.j());
    }

    @Override // org.joda.time.a
    public org.joda.time.b L() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.Y(), M());
    }

    @Override // org.joda.time.a
    public org.joda.time.d M() {
        return UnsupportedDurationField.l(DurationFieldType.l());
    }

    @Override // org.joda.time.a
    public org.joda.time.b N() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.Z(), P());
    }

    @Override // org.joda.time.a
    public org.joda.time.b O() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.a0(), P());
    }

    @Override // org.joda.time.a
    public org.joda.time.d P() {
        return UnsupportedDurationField.l(DurationFieldType.m());
    }

    @Override // org.joda.time.a
    public final long Q(org.joda.time.base.e eVar, long j11) {
        int size = eVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            j11 = eVar.getFieldType(i11).O(this).M(eVar.getValue(i11), j11);
        }
        return j11;
    }

    @Override // org.joda.time.a
    public org.joda.time.b R() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.b0(), S());
    }

    @Override // org.joda.time.a
    public org.joda.time.d S() {
        return UnsupportedDurationField.l(DurationFieldType.n());
    }

    @Override // org.joda.time.a
    public org.joda.time.b T() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.c0(), V());
    }

    @Override // org.joda.time.a
    public org.joda.time.b U() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.d0(), V());
    }

    @Override // org.joda.time.a
    public org.joda.time.d V() {
        return UnsupportedDurationField.l(DurationFieldType.p());
    }

    @Override // org.joda.time.a
    public org.joda.time.b Y() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.e0(), b0());
    }

    @Override // org.joda.time.a
    public org.joda.time.b Z() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.f0(), b0());
    }

    @Override // org.joda.time.a
    public final long a(long j11, long j12) {
        return j12 != 0 ? k0.s(j11, k0.t(1, j12)) : j11;
    }

    @Override // org.joda.time.a
    public org.joda.time.b a0() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.g0(), b0());
    }

    @Override // org.joda.time.a
    public org.joda.time.d b() {
        return UnsupportedDurationField.l(DurationFieldType.a());
    }

    @Override // org.joda.time.a
    public org.joda.time.d b0() {
        return UnsupportedDurationField.l(DurationFieldType.s());
    }

    @Override // org.joda.time.a
    public org.joda.time.b d() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.G(), b());
    }

    @Override // org.joda.time.a
    public org.joda.time.b e() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.H(), E());
    }

    @Override // org.joda.time.a
    public org.joda.time.b f() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.I(), E());
    }

    @Override // org.joda.time.a
    public org.joda.time.b g() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.J(), j());
    }

    @Override // org.joda.time.a
    public org.joda.time.b h() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.K(), j());
    }

    @Override // org.joda.time.a
    public org.joda.time.b i() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.L(), j());
    }

    @Override // org.joda.time.a
    public org.joda.time.d j() {
        return UnsupportedDurationField.l(DurationFieldType.b());
    }

    @Override // org.joda.time.a
    public org.joda.time.b l() {
        return UnsupportedDateTimeField.P(DateTimeFieldType.M(), m());
    }

    @Override // org.joda.time.a
    public org.joda.time.d m() {
        return UnsupportedDurationField.l(DurationFieldType.d());
    }

    @Override // org.joda.time.a
    public final int[] n(org.joda.time.k kVar, long j11) {
        int size = kVar.size();
        int[] iArr = new int[size];
        long j12 = 0;
        if (j11 != 0) {
            for (int i11 = 0; i11 < size; i11++) {
                org.joda.time.d e11 = kVar.getFieldType(i11).e(this);
                if (e11.h()) {
                    int d11 = e11.d(j11, j12);
                    j12 = e11.a(d11, j12);
                    iArr[i11] = d11;
                }
            }
        }
        return iArr;
    }

    @Override // org.joda.time.a
    public final int[] p(org.joda.time.k kVar, long j11, long j12) {
        int size = kVar.size();
        int[] iArr = new int[size];
        if (j11 != j12) {
            for (int i11 = 0; i11 < size; i11++) {
                org.joda.time.d e11 = kVar.getFieldType(i11).e(this);
                int d11 = e11.d(j12, j11);
                if (d11 != 0) {
                    j11 = e11.a(d11, j11);
                }
                iArr[i11] = d11;
            }
        }
        return iArr;
    }

    @Override // org.joda.time.a
    public long s(int i11) throws IllegalArgumentException {
        return H().M(0, O().M(0, J().M(0, C().M(0, g().M(i11, L().M(1, Y().M(1, 0L)))))));
    }

    @Override // org.joda.time.a
    public long u(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        return G().M(i14, g().M(i13, L().M(i12, Y().M(i11, 0L))));
    }

    @Override // org.joda.time.a
    public long v(long j11) throws IllegalArgumentException {
        return H().M(0, O().M(0, J().M(0, C().M(0, j11))));
    }
}
