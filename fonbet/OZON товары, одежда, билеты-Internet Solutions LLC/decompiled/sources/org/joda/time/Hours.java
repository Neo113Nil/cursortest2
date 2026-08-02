package org.joda.time;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.format.m;

/* loaded from: classes10.dex */
public final class Hours extends BaseSingleFieldPeriod {

    /* renamed from: a, reason: collision with root package name */
    public static final Hours f79019a = new Hours(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Hours f79020b = new Hours(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Hours f79021c = new Hours(2);

    /* renamed from: d, reason: collision with root package name */
    public static final Hours f79022d = new Hours(3);

    /* renamed from: e, reason: collision with root package name */
    public static final Hours f79023e = new Hours(4);

    /* renamed from: f, reason: collision with root package name */
    public static final Hours f79024f = new Hours(5);

    /* renamed from: g, reason: collision with root package name */
    public static final Hours f79025g = new Hours(6);

    /* renamed from: h, reason: collision with root package name */
    public static final Hours f79026h = new Hours(7);

    /* renamed from: i, reason: collision with root package name */
    public static final Hours f79027i = new Hours(8);

    /* renamed from: j, reason: collision with root package name */
    public static final Hours f79028j = new Hours(Integer.MAX_VALUE);

    /* renamed from: k, reason: collision with root package name */
    public static final Hours f79029k = new Hours(LinearLayoutManager.INVALID_OFFSET);
    private static final long serialVersionUID = 87525275727380864L;

    static {
        m e11 = b7.d.e();
        PeriodType.e();
        e11.getClass();
    }

    public static Hours A(Interval interval) {
        return interval == null ? f79019a : v(BaseSingleFieldPeriod.m(interval.e(), interval.d(), DurationFieldType.f79015i));
    }

    private Object readResolve() {
        return v(u());
    }

    public static Hours v(int i11) {
        if (i11 == Integer.MIN_VALUE) {
            return f79029k;
        }
        if (i11 == Integer.MAX_VALUE) {
            return f79028j;
        }
        switch (i11) {
            case 0:
                return f79019a;
            case 1:
                return f79020b;
            case 2:
                return f79021c;
            case 3:
                return f79022d;
            case 4:
                return f79023e;
            case 5:
                return f79024f;
            case 6:
                return f79025g;
            case 7:
                return f79026h;
            case 8:
                return f79027i;
            default:
                return new Hours(i11);
        }
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, org.joda.time.k
    public final PeriodType getPeriodType() {
        return PeriodType.e();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public final DurationFieldType p() {
        return DurationFieldType.f79015i;
    }

    @ToString
    public final String toString() {
        return "PT" + String.valueOf(u()) + "H";
    }
}
