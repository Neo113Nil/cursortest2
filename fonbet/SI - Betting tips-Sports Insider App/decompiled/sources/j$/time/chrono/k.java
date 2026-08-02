package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface k extends Comparable {
    b A(TemporalAccessor temporalAccessor);

    ChronoLocalDateTime F(TemporalAccessor temporalAccessor);

    b I(int i5, int i10, int i11);

    b K(Map map, j$.time.format.e0 e0Var);

    ChronoZonedDateTime L(Instant instant, ZoneId zoneId);

    boolean O(long j);

    boolean equals(Object obj);

    String getId();

    b h(long j);

    int hashCode();

    String l();

    b m(int i5, int i10);

    j$.time.temporal.s q(j$.time.temporal.a aVar);

    List s();

    l t(int i5);

    String toString();

    int u(l lVar, int i5);
}
