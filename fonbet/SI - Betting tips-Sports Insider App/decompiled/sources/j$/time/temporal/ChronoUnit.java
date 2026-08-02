package j$.time.temporal;

import j$.time.Duration;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.k(1)),
    MICROS("Micros", Duration.k(1000)),
    MILLIS("Millis", Duration.k(1000000)),
    SECONDS("Seconds", Duration.j(1, 0)),
    MINUTES("Minutes", Duration.j(60, 0)),
    HOURS("Hours", Duration.j(3600, 0)),
    HALF_DAYS("HalfDays", Duration.j(43200, 0)),
    DAYS("Days", Duration.j(86400, 0)),
    WEEKS("Weeks", Duration.j(604800, 0)),
    MONTHS("Months", Duration.j(2629746, 0)),
    YEARS("Years", Duration.j(31556952, 0)),
    DECADES("Decades", Duration.j(315569520, 0)),
    CENTURIES("Centuries", Duration.j(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.j(31556952000L, 0)),
    ERAS("Eras", Duration.j(31556952000000000L, 0)),
    FOREVER("Forever", Duration.j(j$.com.android.tools.r8.a.N(LongCompanionObject.MAX_VALUE, j$.com.android.tools.r8.a.S(999999999, 1000000000)), (int) j$.com.android.tools.r8.a.R(999999999, 1000000000)));


    /* renamed from: a, reason: collision with root package name */
    public final String f17508a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f17509b;

    ChronoUnit(String str, Duration duration) {
        this.f17508a = str;
        this.f17509b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration getDuration() {
        return this.f17509b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final l i(l lVar, long j) {
        return lVar.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17508a;
    }
}
