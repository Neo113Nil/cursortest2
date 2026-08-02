package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class djj {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public djj(long j) {
        f(j);
    }

    public final synchronized long a(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!e()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    Long l = (Long) this.d.get();
                    l.getClass();
                    j2 = l.longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                String str = nik.a;
                long b0 = nik.b0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + b0) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - b0) < Math.abs(j5 - b0) ? j4 : j5;
            }
            long j6 = j;
            String str2 = nik.a;
            return a(nik.b0(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                String str = nik.a;
                long b0 = nik.b0(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = b0 / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= b0 ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = nik.a;
            return a(nik.b0(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = C.TIME_UNSET;
        }
        return j;
    }

    public final synchronized boolean e() {
        return this.b != C.TIME_UNSET;
    }

    public final synchronized void f(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = C.TIME_UNSET;
    }

    public final synchronized void g(long j, boolean z) {
        try {
            z1a.E(this.a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
