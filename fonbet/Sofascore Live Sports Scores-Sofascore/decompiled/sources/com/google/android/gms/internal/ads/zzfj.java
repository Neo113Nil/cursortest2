package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfj {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public zzfj() {
        b(0L);
    }

    public final synchronized long a() {
        long j = this.a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? C.TIME_UNSET : j;
    }

    public final synchronized void b(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = C.TIME_UNSET;
    }

    public final synchronized long c(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                long w = zzfm.w(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + w) / 8589934592L;
                long j4 = (((-1) + j3) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - w) < Math.abs(j5 - w) ? j4 : j5;
            }
            return e(zzfm.w(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j2 = this.c;
            if (j2 != C.TIME_UNSET) {
                long w = zzfm.w(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = w / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= w ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            return e(zzfm.w(j, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long e(long j) {
        long j2;
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            synchronized (this) {
                if (!(this.b != C.TIME_UNSET)) {
                    long j3 = this.a;
                    if (j3 == 9223372036854775806L) {
                        Long l = (Long) this.d.get();
                        if (l == null) {
                            throw null;
                        }
                        j3 = l.longValue();
                    }
                    this.b = j3 - j;
                    notifyAll();
                }
                this.c = j;
                j2 = j + this.b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }
}
