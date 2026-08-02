package io.sentry.vendor;

/* loaded from: classes3.dex */
public abstract class c {
    public static long a(long j10, long j11) {
        int i10;
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (i10 = ((int) ((j10 ^ j11) >> 63)) | 1) < 0) ? j12 + i10 : j12;
    }

    public static long b(long j10, long j11) {
        return j10 - (a(j10, j11) * j11);
    }
}
