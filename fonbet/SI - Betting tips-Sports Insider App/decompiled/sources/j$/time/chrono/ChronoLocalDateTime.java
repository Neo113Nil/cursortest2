package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;

/* loaded from: classes2.dex */
public interface ChronoLocalDateTime<D extends b> extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDateTime<?>> {
    /* renamed from: H */
    int compareTo(ChronoLocalDateTime chronoLocalDateTime);

    k a();

    j$.time.j b();

    b f();

    long toEpochSecond(ZoneOffset zoneOffset);

    ChronoZonedDateTime y(ZoneId zoneId);
}
