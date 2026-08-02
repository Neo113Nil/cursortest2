package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fd4 extends mij {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long g;
    public final long h;
    public final zc4 i;
    public final h6c j;
    public final u5c k;

    public fd4(long j, long j2, long j3, int i, long j4, long j5, long j6, zc4 zc4Var, h6c h6cVar, u5c u5cVar) {
        z1a.E(zc4Var.d == (u5cVar != null));
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = j4;
        this.g = j5;
        this.h = j6;
        this.i = zc4Var;
        this.j = h6cVar;
        this.k = u5cVar;
    }

    @Override // defpackage.mij
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        z1a.v(i, h());
        zc4 zc4Var = this.i;
        String str = z ? zc4Var.a(i).a : null;
        Integer valueOf = z ? Integer.valueOf(this.e + i) : null;
        long c = zc4Var.c(i);
        long T = nik.T(zc4Var.a(i).b - zc4Var.a(0).b) - this.f;
        iijVar.getClass();
        iijVar.f(str, valueOf, 0, c, T, kg.g, false);
        return iijVar;
    }

    @Override // defpackage.mij
    public final int h() {
        return this.i.m.size();
    }

    @Override // defpackage.mij
    public final Object l(int i) {
        z1a.v(i, h());
        return Integer.valueOf(this.e + i);
    }

    @Override // defpackage.mij
    public final kij m(int i, kij kijVar, long j) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        jd4 b;
        z1a.v(i, 1);
        zc4 zc4Var = this.i;
        boolean z3 = zc4Var.d;
        long j4 = this.h;
        if (z3 && zc4Var.e != C.TIME_UNSET && zc4Var.b == C.TIME_UNSET) {
            long j5 = 0;
            if (j > 0) {
                j4 += j;
                if (j4 > this.g) {
                    z = true;
                    z2 = false;
                    j4 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    kijVar.b(kij.p, this.j, zc4Var, this.b, this.c, this.d, true, (zc4Var.d || zc4Var.e == j2 || zc4Var.b != j2) ? z2 : z, this.k, j4, this.g, 0, h() - 1, this.f);
                    return kijVar;
                }
            }
            long j6 = this.f + j4;
            long c = zc4Var.c(0);
            int i2 = 0;
            while (i2 < zc4Var.m.size() - 1 && j6 >= c) {
                j6 -= c;
                i2++;
                c = zc4Var.c(i2);
            }
            ude a = zc4Var.a(i2);
            List list = a.c;
            z = true;
            int size = list.size();
            j2 = -9223372036854775807L;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j3 = j5;
                    i3 = -1;
                    break;
                }
                j3 = j5;
                if (((ch) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j3;
            }
            if (i3 != -1 && (b = ((ozf) ((ch) a.c.get(i3)).c.get(0)).b()) != null && b.l(c) != j3) {
                j4 = (b.getTimeUs(b.j(j6, c)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        z2 = false;
        kijVar.b(kij.p, this.j, zc4Var, this.b, this.c, this.d, true, (zc4Var.d || zc4Var.e == j2 || zc4Var.b != j2) ? z2 : z, this.k, j4, this.g, 0, h() - 1, this.f);
        return kijVar;
    }

    @Override // defpackage.mij
    public final int o() {
        return 1;
    }
}
