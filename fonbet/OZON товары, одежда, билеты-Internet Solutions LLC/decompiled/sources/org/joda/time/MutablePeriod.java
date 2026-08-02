package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes10.dex */
public class MutablePeriod extends BasePeriod implements e, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod(PeriodType periodType) {
        super(0L, periodType, (ISOChronology) null);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.e
    public final void a(int i11, int i12) {
        super.a(i11, i12);
    }

    @Override // org.joda.time.base.BasePeriod, org.joda.time.e
    public final void b(k kVar) {
        super.b(kVar);
    }

    @Override // org.joda.time.e
    public final void clear() {
        p(new int[size()]);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    @Override // org.joda.time.e
    public final void d(int i11) {
        n(DurationFieldType.f79015i, i11);
    }

    @Override // org.joda.time.e
    public final void e(int i11) {
        n(DurationFieldType.f79016j, i11);
    }

    @Override // org.joda.time.e
    public final void f(int i11) {
        n(DurationFieldType.f79011e, i11);
    }

    @Override // org.joda.time.e
    public final void g(int i11) {
        n(DurationFieldType.f79010d, i11);
    }

    @Override // org.joda.time.e
    public final void h(int i11) {
        n(DurationFieldType.f79018l, i11);
    }

    @Override // org.joda.time.e
    public final void i(int i11) {
        n(DurationFieldType.f79012f, i11);
    }

    @Override // org.joda.time.e
    public final void j(int i11) {
        n(DurationFieldType.f79013g, i11);
    }

    @Override // org.joda.time.e
    public final void l(int i11) {
        n(DurationFieldType.f79017k, i11);
    }

    public MutablePeriod(Duration duration, PeriodType periodType) {
        super(duration, periodType);
    }
}
