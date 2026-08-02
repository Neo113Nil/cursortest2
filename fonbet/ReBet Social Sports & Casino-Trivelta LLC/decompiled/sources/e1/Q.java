package e1;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public long f45497a;

    /* renamed from: b, reason: collision with root package name */
    public long f45498b;

    /* renamed from: c, reason: collision with root package name */
    public long f45499c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f45500d = new ThreadLocal();

    public Q(long j10) {
        i(j10);
    }

    public static long h(long j10) {
        return Z.p1(j10, 1000000L, 90000L);
    }

    public static long k(long j10) {
        return Z.p1(j10, 90000L, 1000000L);
    }

    public static long l(long j10) {
        return k(j10) % 8589934592L;
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!g()) {
                long j11 = this.f45497a;
                if (j11 == 9223372036854775806L) {
                    j11 = ((Long) AbstractC4134a.e((Long) this.f45500d.get())).longValue();
                }
                this.f45498b = j11 - j10;
                notifyAll();
            }
            this.f45499c = j10;
            return j10 + this.f45498b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f45499c;
            if (j11 != -9223372036854775807L) {
                long k10 = k(j11);
                long j12 = (4294967296L + k10) / 8589934592L;
                long j13 = ((j12 - 1) * 8589934592L) + j10;
                j10 += j12 * 8589934592L;
                if (Math.abs(j13 - k10) < Math.abs(j10 - k10)) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long c(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f45499c;
            if (j11 != -9223372036854775807L) {
                long k10 = k(j11);
                long j12 = k10 / 8589934592L;
                long j13 = (j12 * 8589934592L) + j10;
                j10 += (j12 + 1) * 8589934592L;
                if (j13 >= k10) {
                    j10 = j13;
                }
            }
            return a(h(j10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        long j10;
        j10 = this.f45497a;
        if (j10 == LongCompanionObject.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    public synchronized long e() {
        long j10;
        try {
            j10 = this.f45499c;
        } catch (Throwable th2) {
            throw th2;
        }
        return j10 != -9223372036854775807L ? j10 + this.f45498b : d();
    }

    public synchronized long f() {
        return this.f45498b;
    }

    public synchronized boolean g() {
        return this.f45498b != -9223372036854775807L;
    }

    public synchronized void i(long j10) {
        this.f45497a = j10;
        this.f45498b = j10 == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f45499c = -9223372036854775807L;
    }

    public synchronized void j(boolean z10, long j10, long j11) {
        try {
            AbstractC4134a.g(this.f45497a == 9223372036854775806L);
            if (g()) {
                return;
            }
            if (z10) {
                this.f45500d.set(Long.valueOf(j10));
            } else {
                long j12 = 0;
                long j13 = j11;
                while (!g()) {
                    if (j11 == 0) {
                        wait();
                    } else {
                        AbstractC4134a.g(j13 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j13);
                        j12 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j12 >= j11 && !g()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j11 + " milliseconds");
                        }
                        j13 = j11 - j12;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
