package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class py2 extends mn8 {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public py2(lij lijVar, long j, long j2) {
        super(lijVar);
        boolean z = false;
        if (lijVar.h() != 1) {
            throw new ry2(0);
        }
        jij m = lijVar.m(0, new jij(), 0L);
        long max = Math.max(0L, j);
        if (!m.j && max != 0 && !m.f) {
            throw new ry2(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? m.l : Math.max(0L, j2);
        long j3 = m.l;
        if (j3 != C.TIME_UNSET) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                throw new ry2(2);
            }
        }
        this.c = max;
        this.d = max2;
        this.e = max2 == C.TIME_UNSET ? -9223372036854775807L : max2 - max;
        if (m.g && (max2 == C.TIME_UNSET || (j3 != C.TIME_UNSET && max2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.mn8, defpackage.lij
    public final hij f(int i, hij hijVar, boolean z) {
        this.b.f(0, hijVar, z);
        long j = hijVar.e - this.c;
        long j2 = this.e;
        long j3 = C.TIME_UNSET;
        if (j2 != C.TIME_UNSET) {
            j3 = j2 - j;
        }
        hijVar.h(hijVar.a, hijVar.b, 0, j3, j, jg.f, false);
        return hijVar;
    }

    @Override // defpackage.mn8, defpackage.lij
    public final jij m(int i, jij jijVar, long j) {
        this.b.m(0, jijVar, 0L);
        long j2 = jijVar.o;
        long j3 = this.c;
        jijVar.o = j2 + j3;
        jijVar.l = this.e;
        jijVar.g = this.f;
        long j4 = jijVar.k;
        if (j4 != C.TIME_UNSET) {
            long max = Math.max(j4, j3);
            jijVar.k = max;
            long j5 = this.d;
            if (j5 != C.TIME_UNSET) {
                max = Math.min(max, j5);
            }
            jijVar.k = max - j3;
        }
        long F = lik.F(j3);
        long j6 = jijVar.c;
        if (j6 != C.TIME_UNSET) {
            jijVar.c = j6 + F;
        }
        long j7 = jijVar.d;
        if (j7 != C.TIME_UNSET) {
            jijVar.d = j7 + F;
        }
        return jijVar;
    }
}
