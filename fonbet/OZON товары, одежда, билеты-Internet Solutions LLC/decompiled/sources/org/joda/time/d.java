package org.joda.time;

/* loaded from: classes6.dex */
public abstract class d implements Comparable<d> {
    public abstract long a(int i11, long j11);

    public abstract long b(long j11, long j12);

    public abstract int d(long j11, long j12);

    public abstract long e(long j11, long j12);

    public abstract DurationFieldType f();

    public abstract long g();

    public abstract boolean h();

    public abstract boolean i();

    public final long j(int i11, long j11) {
        if (i11 != Integer.MIN_VALUE) {
            return a(-i11, j11);
        }
        long j12 = i11;
        if (j12 != Long.MIN_VALUE) {
            return b(j11, -j12);
        }
        throw new ArithmeticException("Long.MIN_VALUE cannot be negated");
    }
}
