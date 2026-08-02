package m3;

import java.math.RoundingMode;
import java.util.concurrent.TimeoutException;

/* renamed from: m3.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8056I {

    /* renamed from: a, reason: collision with root package name */
    private long f74284a;

    /* renamed from: b, reason: collision with root package name */
    private long f74285b;

    /* renamed from: c, reason: collision with root package name */
    private long f74286c;

    /* renamed from: d, reason: collision with root package name */
    private final ThreadLocal<Long> f74287d = new ThreadLocal<>();

    public C8056I(long j11) {
        h(j11);
    }

    public final synchronized long a(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j12 = this.f74284a;
                if (j12 == 9223372036854775806L) {
                    Long l11 = this.f74287d.get();
                    l11.getClass();
                    j12 = l11.longValue();
                }
                this.f74285b = j12 - j11;
                notifyAll();
            }
            this.f74286c = j11;
            return j11 + this.f74285b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f74286c;
            if (j12 != -9223372036854775807L) {
                int i11 = N.f74289a;
                long Z11 = N.Z(j12, 90000L, 1000000L, RoundingMode.DOWN);
                long j13 = (4294967296L + Z11) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j11;
                long j15 = (j13 * 8589934592L) + j11;
                j11 = Math.abs(j14 - Z11) < Math.abs(j15 - Z11) ? j14 : j15;
            }
            long j16 = j11;
            int i12 = N.f74289a;
            return a(N.Z(j16, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j12 = this.f74286c;
            if (j12 != -9223372036854775807L) {
                int i11 = N.f74289a;
                long Z11 = N.Z(j12, 90000L, 1000000L, RoundingMode.DOWN);
                long j13 = Z11 / 8589934592L;
                long j14 = (j13 * 8589934592L) + j11;
                j11 = j14 >= Z11 ? j14 : ((j13 + 1) * 8589934592L) + j11;
            }
            long j15 = j11;
            int i12 = N.f74289a;
            return a(N.Z(j15, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long d() {
        long j11;
        j11 = this.f74284a;
        if (j11 == Long.MAX_VALUE || j11 == 9223372036854775806L) {
            j11 = -9223372036854775807L;
        }
        return j11;
    }

    public final synchronized long e() {
        long j11;
        try {
            j11 = this.f74286c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j11 != -9223372036854775807L ? j11 + this.f74285b : d();
    }

    public final synchronized long f() {
        return this.f74285b;
    }

    public final synchronized boolean g() {
        return this.f74285b != -9223372036854775807L;
    }

    public final synchronized void h(long j11) {
        this.f74284a = j11;
        this.f74285b = j11 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f74286c = -9223372036854775807L;
    }

    public final synchronized void i(long j11, boolean z11) throws InterruptedException, TimeoutException {
        try {
            G10.a.h(this.f74284a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z11) {
                this.f74287d.set(Long.valueOf(j11));
            } else {
                while (!g()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
