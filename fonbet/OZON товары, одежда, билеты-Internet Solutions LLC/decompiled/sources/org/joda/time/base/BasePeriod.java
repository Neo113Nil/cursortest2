package org.joda.time.base;

import Lf.j;
import java.io.Serializable;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.k;

/* loaded from: classes6.dex */
public abstract class BasePeriod extends f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final k f79050a = new a();
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    static class a extends f {
        @Override // org.joda.time.k
        public final PeriodType getPeriodType() {
            return PeriodType.l();
        }

        @Override // org.joda.time.k
        public final int getValue(int i11) {
            return 0;
        }
    }

    protected BasePeriod(long j11, long j12, PeriodType periodType, org.joda.time.a aVar) {
        int i11 = org.joda.time.c.f79052b;
        periodType = periodType == null ? PeriodType.j() : periodType;
        aVar = aVar == null ? ISOChronology.g0() : aVar;
        this.iType = periodType;
        this.iValues = aVar.p(this, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i11, int i12) {
        this.iValues[i11] = i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(k kVar) {
        if (kVar == null) {
            p(new int[size()]);
            return;
        }
        int[] iArr = new int[size()];
        int size = kVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            DurationFieldType fieldType = kVar.getFieldType(i11);
            int value = kVar.getValue(i11);
            int f7 = getPeriodType().f(fieldType);
            if (f7 != -1) {
                iArr[f7] = value;
            } else if (value != 0) {
                throw new IllegalArgumentException("Period does not support field '" + fieldType.f() + "'");
            }
        }
        p(iArr);
    }

    @Override // org.joda.time.k
    public final PeriodType getPeriodType() {
        return this.iType;
    }

    @Override // org.joda.time.k
    public final int getValue(int i11) {
        return this.iValues[i11];
    }

    protected final void n(DurationFieldType durationFieldType, int i11) {
        int[] iArr = this.iValues;
        int f7 = getPeriodType().f(durationFieldType);
        if (f7 != -1) {
            iArr[f7] = i11;
        } else {
            if (i11 == 0) {
                return;
            }
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    protected final void p(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    protected BasePeriod(Instant instant, Instant instant2, PeriodType periodType) {
        int i11 = org.joda.time.c.f79052b;
        long millis = instant.getMillis();
        long millis2 = instant2.getMillis();
        ISOChronology i02 = ISOChronology.i0();
        i02 = i02 == null ? ISOChronology.g0() : i02;
        this.iType = periodType;
        this.iValues = i02.p(this, millis, millis2);
    }

    protected BasePeriod(long j11) {
        this.iType = PeriodType.j();
        int[] n11 = ISOChronology.i0().n(f79050a, j11);
        int[] iArr = new int[8];
        this.iValues = iArr;
        System.arraycopy(n11, 0, iArr, 4, 4);
    }

    protected BasePeriod(long j11, PeriodType periodType, ISOChronology iSOChronology) {
        int i11 = org.joda.time.c.f79052b;
        periodType = periodType == null ? PeriodType.j() : periodType;
        iSOChronology = iSOChronology == null ? ISOChronology.g0() : iSOChronology;
        this.iType = periodType;
        this.iValues = iSOChronology.n(this, j11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected BasePeriod(Duration duration, PeriodType periodType) {
        j c11 = Lf.d.a().c(duration);
        periodType = periodType == null ? c11.B(duration) : periodType;
        int i11 = org.joda.time.c.f79052b;
        periodType = periodType == null ? PeriodType.j() : periodType;
        this.iType = periodType;
        if (this instanceof org.joda.time.e) {
            this.iValues = new int[size()];
            c11.I((org.joda.time.e) this, duration, ISOChronology.g0());
        } else {
            this.iValues = new MutablePeriod(duration, periodType).m();
        }
    }

    protected BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }
}
