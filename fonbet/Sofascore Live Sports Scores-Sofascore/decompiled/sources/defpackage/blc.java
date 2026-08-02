package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class blc implements s0h {
    public final long[] a;
    public final long[] b;
    public final long c;

    public blc(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == C.TIME_UNSET ? nik.T(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long[] jArr, long[] jArr2, long j) {
        int f = nik.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.s0h
    public final long a() {
        return -1L;
    }

    @Override // defpackage.s0h
    public final int c() {
        return -2147483647;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        Pair d = d(this.b, this.a, nik.h0(nik.k(j, 0L, this.c)));
        f0h f0hVar = new f0h(nik.T(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new zzg(f0hVar, f0hVar);
    }

    @Override // defpackage.s0h
    public final long getTimeUs(long j) {
        return nik.T(((Long) d(this.a, this.b, j).second).longValue());
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
