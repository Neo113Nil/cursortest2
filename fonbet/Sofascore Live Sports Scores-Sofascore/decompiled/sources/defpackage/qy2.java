package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qy2 extends nn8 {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public qy2(mij mijVar, long j, long j2) {
        super(mijVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new sy2(2, j, j2);
        }
        boolean z = false;
        if (mijVar.h() != 1) {
            throw new sy2(0);
        }
        kij m = mijVar.m(0, new kij(), 0L);
        long max = Math.max(0L, j);
        if (!m.j && max != 0 && !m.g) {
            throw new sy2(1);
        }
        long max2 = j2 == Long.MIN_VALUE ? m.l : Math.max(0L, j2);
        long j3 = m.l;
        long j4 = C.TIME_UNSET;
        if (j3 != C.TIME_UNSET) {
            max2 = max2 > j3 ? j3 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.c = max;
        this.d = max2;
        this.e = max2 != C.TIME_UNSET ? max2 - max : j4;
        if (m.h && (max2 == C.TIME_UNSET || (j3 != C.TIME_UNSET && max2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.nn8, defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        this.b.f(0, iijVar, z);
        long j = iijVar.e - this.c;
        long j2 = this.e;
        long j3 = C.TIME_UNSET;
        if (j2 != C.TIME_UNSET) {
            j3 = j2 - j;
        }
        iijVar.f(iijVar.a, iijVar.b, 0, j3, j, kg.g, false);
        return iijVar;
    }

    @Override // defpackage.nn8, defpackage.mij
    public final kij m(int i, kij kijVar, long j) {
        this.b.m(0, kijVar, 0L);
        long j2 = kijVar.o;
        long j3 = this.c;
        kijVar.o = j2 + j3;
        kijVar.l = this.e;
        kijVar.h = this.f;
        long j4 = kijVar.k;
        if (j4 != C.TIME_UNSET) {
            long max = Math.max(j4, j3);
            kijVar.k = max;
            long j5 = this.d;
            if (j5 != C.TIME_UNSET) {
                max = Math.min(max, j5);
            }
            kijVar.k = max - j3;
        }
        long h0 = nik.h0(j3);
        long j6 = kijVar.d;
        if (j6 != C.TIME_UNSET) {
            kijVar.d = j6 + h0;
        }
        long j7 = kijVar.e;
        if (j7 != C.TIME_UNSET) {
            kijVar.e = j7 + h0;
        }
        return kijVar;
    }
}
