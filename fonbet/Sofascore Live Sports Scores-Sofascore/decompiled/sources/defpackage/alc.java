package defpackage;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class alc implements r0h {
    public final long[] a;
    public final long[] b;
    public final long c;

    public alc(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == C.TIME_UNSET ? lik.y(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair b(long[] jArr, long[] jArr2, long j) {
        int e = lik.e(jArr, j, true);
        long j2 = jArr[e];
        long j3 = jArr2[e];
        int i = e + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.r0h
    public final long a() {
        return -1L;
    }

    @Override // defpackage.a0h
    public final long getDurationUs() {
        return this.c;
    }

    @Override // defpackage.a0h
    public final yzg getSeekPoints(long j) {
        Pair b = b(this.b, this.a, lik.F(lik.i(j, 0L, this.c)));
        e0h e0hVar = new e0h(lik.y(((Long) b.first).longValue()), ((Long) b.second).longValue());
        return new yzg(e0hVar, e0hVar);
    }

    @Override // defpackage.r0h
    public final long getTimeUs(long j) {
        return lik.y(((Long) b(this.a, this.b, j).second).longValue());
    }

    @Override // defpackage.a0h
    public final boolean isSeekable() {
        return true;
    }
}
