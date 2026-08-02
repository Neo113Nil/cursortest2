package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.b;

/* loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends b> extends j$.time.temporal.l, Comparable<ChronoZonedDateTime<?>> {
    ZoneId B();

    k a();

    j$.time.j b();

    b f();

    ZoneOffset g();

    ChronoLocalDateTime o();

    long toEpochSecond();

    ChronoZonedDateTime v(ZoneId zoneId);
}
