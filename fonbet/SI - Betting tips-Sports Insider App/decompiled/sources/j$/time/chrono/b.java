package j$.time.chrono;

import j$.time.temporal.TemporalUnit;

/* loaded from: classes2.dex */
public interface b extends j$.time.temporal.l, j$.time.temporal.m, Comparable {
    long D();

    ChronoLocalDateTime E(j$.time.j jVar);

    l G();

    b J(j$.time.temporal.o oVar);

    int M();

    /* renamed from: N */
    int compareTo(b bVar);

    k a();

    @Override // j$.time.temporal.l
    b c(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.l
    b d(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean e(j$.time.temporal.p pVar);

    boolean equals(Object obj);

    int hashCode();

    boolean p();

    /* renamed from: r */
    b x(long j, TemporalUnit temporalUnit);

    String toString();

    b w(j$.time.temporal.m mVar);
}
