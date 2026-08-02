package org.joda.time;

import Bl0.k0;
import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes6.dex */
public final class Period extends BasePeriod implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Period f79036b = new Period();
    private static final long serialVersionUID = 741052353876488155L;

    public Period() {
        super(0L, (PeriodType) null, (ISOChronology) null);
    }

    public static Period F(int i11) {
        return new Period(new int[]{0, 0, 0, 0, 0, 0, i11, 0}, PeriodType.j());
    }

    public final int A() {
        return getPeriodType().d(this, PeriodType.f79037a);
    }

    public final int B() {
        return getPeriodType().d(this, PeriodType.f79042f);
    }

    public final int C() {
        return getPeriodType().d(this, PeriodType.f79038b);
    }

    public final int D() {
        PeriodType periodType = getPeriodType();
        int i11 = PeriodType.f79037a;
        return periodType.d(this, 0);
    }

    public final Period E(PeriodType periodType) {
        int i11 = c.f79052b;
        Period period = new Period((C() * 604800000) + (s() * 86400000) + (u() * 3600000) + (y() * 60000) + (B() * 1000) + v(), periodType, ISOChronology.i0());
        int D11 = D();
        int A11 = A();
        if (D11 == 0 && A11 == 0) {
            return period;
        }
        long j11 = (D11 * 12) + A11;
        if (periodType.g(DurationFieldType.f79010d)) {
            int v11 = k0.v(j11 / 12);
            period = period.H(v11);
            j11 -= v11 * 12;
        }
        if (periodType.g(DurationFieldType.f79011e)) {
            int v12 = k0.v(j11);
            period = period.G(v12);
            j11 -= v12;
        }
        if (j11 == 0) {
            return period;
        }
        throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString());
    }

    public final Period G(int i11) {
        int[] m11 = m();
        getPeriodType().h(PeriodType.f79037a, i11, m11);
        return new Period(m11, getPeriodType());
    }

    public final Period H(int i11) {
        int[] m11 = m();
        PeriodType periodType = getPeriodType();
        int i12 = PeriodType.f79037a;
        periodType.h(0, i11, m11);
        return new Period(m11, getPeriodType());
    }

    public final int s() {
        return getPeriodType().d(this, PeriodType.f79039c);
    }

    public final int u() {
        return getPeriodType().d(this, PeriodType.f79040d);
    }

    public final int v() {
        return getPeriodType().d(this, PeriodType.f79043g);
    }

    public final int y() {
        return getPeriodType().d(this, PeriodType.f79041e);
    }

    public Period(long j11) {
        super(j11);
    }

    public Period(long j11, long j12, PeriodType periodType) {
        super(j11, j12, periodType, null);
    }

    public Period(long j11, long j12, a aVar) {
        super(j11, j12, null, aVar);
    }

    public Period(Instant instant, Instant instant2, PeriodType periodType) {
        super(instant, instant2, periodType);
    }

    public Period(Duration duration) {
        super(duration, (PeriodType) null);
    }
}
