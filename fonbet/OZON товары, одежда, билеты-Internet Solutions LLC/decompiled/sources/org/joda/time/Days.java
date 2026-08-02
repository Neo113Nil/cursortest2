package org.joda.time;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.m;

/* loaded from: classes10.dex */
public final class Days extends BaseSingleFieldPeriod {

    /* renamed from: a, reason: collision with root package name */
    public static final Days f78996a = new Days(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Days f78997b = new Days(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Days f78998c = new Days(2);

    /* renamed from: d, reason: collision with root package name */
    public static final Days f78999d = new Days(3);

    /* renamed from: e, reason: collision with root package name */
    public static final Days f79000e = new Days(4);

    /* renamed from: f, reason: collision with root package name */
    public static final Days f79001f = new Days(5);

    /* renamed from: g, reason: collision with root package name */
    public static final Days f79002g = new Days(6);

    /* renamed from: h, reason: collision with root package name */
    public static final Days f79003h = new Days(7);

    /* renamed from: i, reason: collision with root package name */
    public static final Days f79004i = new Days(Integer.MAX_VALUE);

    /* renamed from: j, reason: collision with root package name */
    public static final Days f79005j = new Days(LinearLayoutManager.INVALID_OFFSET);
    private static final long serialVersionUID = 87525275727380865L;

    static {
        m e11 = b7.d.e();
        PeriodType.a();
        e11.getClass();
    }

    public static Days A(DateTime dateTime, DateTime dateTime2) {
        return v(BaseSingleFieldPeriod.m(dateTime, dateTime2, DurationFieldType.f79013g));
    }

    public static Days B(LocalDate localDate, LocalDate localDate2) {
        if (localDate != null) {
            a chronology = localDate.getChronology();
            int i11 = c.f79052b;
            if (chronology == null) {
                chronology = ISOChronology.g0();
            }
            return v(chronology.j().d(localDate2.m(), localDate.m()));
        }
        Days days = f78996a;
        if (localDate == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        for (int i12 = 0; i12 < 3; i12++) {
            if (localDate.getFieldType(i12) != localDate2.getFieldType(i12)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        int i13 = c.f79052b;
        DurationFieldType durationFieldType = null;
        for (int i14 = 0; i14 < 3; i14++) {
            b b11 = localDate.b(i14);
            if (i14 > 0 && (b11.B() == null || b11.B().f() != durationFieldType)) {
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
            durationFieldType = b11.n().f();
        }
        a chronology2 = localDate.getChronology();
        if (chronology2 == null) {
            chronology2 = ISOChronology.g0();
        }
        a W11 = chronology2.W();
        return v(W11.p(days, W11.Q(localDate, 63072000000L), W11.Q(localDate2, 63072000000L))[0]);
    }

    public static Days C(Interval interval) {
        return interval == null ? f78996a : v(BaseSingleFieldPeriod.m(interval.e(), interval.d(), DurationFieldType.f79013g));
    }

    private Object readResolve() {
        return v(u());
    }

    public static Days v(int i11) {
        if (i11 == Integer.MIN_VALUE) {
            return f79005j;
        }
        if (i11 == Integer.MAX_VALUE) {
            return f79004i;
        }
        switch (i11) {
            case 0:
                return f78996a;
            case 1:
                return f78997b;
            case 2:
                return f78998c;
            case 3:
                return f78999d;
            case 4:
                return f79000e;
            case 5:
                return f79001f;
            case 6:
                return f79002g;
            case 7:
                return f79003h;
            default:
                return new Days(i11);
        }
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.k
    public final PeriodType getPeriodType() {
        return PeriodType.a();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType p() {
        return DurationFieldType.f79013g;
    }

    @ToString
    public final String toString() {
        return "P" + String.valueOf(u()) + "D";
    }
}
