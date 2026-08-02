package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.j(31556952, 0)),
    QUARTER_YEARS("QuarterYears", Duration.j(7889238, 0));


    /* renamed from: a, reason: collision with root package name */
    public final String f17517a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f17518b;

    h(String str, Duration duration) {
        this.f17517a = str;
        this.f17518b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f17518b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l i(l lVar, long j) {
        int i5 = b.f17513a[ordinal()];
        if (i5 == 1) {
            return lVar.c(j$.com.android.tools.r8.a.N(lVar.i(r0), j), i.f17521c);
        }
        if (i5 == 2) {
            return lVar.d(j / 4, ChronoUnit.YEARS).d((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17517a;
    }
}
