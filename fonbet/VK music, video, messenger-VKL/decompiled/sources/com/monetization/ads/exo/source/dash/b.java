package com.monetization.ads.exo.source.dash;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import yads.c30;
import yads.e6;
import yads.gd2;
import yads.gn1;
import yads.i30;
import yads.mc3;
import yads.mp2;
import yads.ni;
import yads.t73;
import yads.v73;
import yads.w73;
import yads.zb;
import yads.zm1;

/* loaded from: classes14.dex */
public final class b extends w73 {
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final c30 j;
    public final gn1 k;
    public final zm1 l;

    public b(long j, long j2, long j3, int i, long j4, long j5, long j6, c30 c30Var, gn1 gn1Var, zm1 zm1Var) {
        ni.b(c30Var.d == (zm1Var != null));
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = c30Var;
        this.k = gn1Var;
        this.l = zm1Var;
    }

    @Override // yads.w73
    public final t73 a(int i, t73 t73Var, boolean z) {
        ni.a(i, a());
        String str = z ? ((gd2) this.j.m.get(i)).a : null;
        Integer valueOf = z ? Integer.valueOf(this.f + i) : null;
        long a = mc3.a(this.j.b(i));
        long a2 = mc3.a(((gd2) this.j.m.get(i)).b - ((gd2) this.j.m.get(0)).b) - this.g;
        t73Var.getClass();
        return t73Var.a(str, valueOf, 0, a, a2, e6.h, false);
    }

    @Override // yads.w73
    public final int b() {
        return 1;
    }

    @Override // yads.w73
    public final v73 a(int i, v73 v73Var, long j) {
        boolean z;
        long j2;
        long j3;
        i30 d;
        ni.a(i, 1);
        long j4 = this.i;
        c30 c30Var = this.j;
        boolean z2 = c30Var.d;
        long j5 = C.TIME_UNSET;
        if (z2 && c30Var.e != C.TIME_UNSET && c30Var.b == C.TIME_UNSET) {
            if (j > 0) {
                j4 += j;
                if (j4 > this.h) {
                    z = true;
                    j2 = -9223372036854775807L;
                    j3 = -9223372036854775807L;
                    Object obj = v73.s;
                    gn1 gn1Var = this.k;
                    c30 c30Var2 = this.j;
                    return v73Var.a(obj, gn1Var, c30Var2, this.c, this.d, this.e, true, (c30Var2.d || c30Var2.e == j2 || c30Var2.b != j2) ? false : z, this.l, j3, this.h, 0, a() - 1, this.g);
                }
            }
            long j6 = this.g + j4;
            long a = mc3.a(c30Var.b(0));
            int i2 = 0;
            while (i2 < this.j.m.size() - 1 && j6 >= a) {
                j6 -= a;
                i2++;
                a = mc3.a(this.j.b(i2));
            }
            gd2 gd2Var = (gd2) this.j.m.get(i2);
            int size = gd2Var.c.size();
            z = true;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j2 = j5;
                    i3 = -1;
                    break;
                }
                j2 = j5;
                if (((zb) gd2Var.c.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j2;
            }
            if (i3 != -1 && (d = ((mp2) ((zb) gd2Var.c.get(i3)).c.get(0)).d()) != null && d.c(a) != 0) {
                j4 = (d.a(d.a(j6, a)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        j3 = j4;
        Object obj2 = v73.s;
        gn1 gn1Var2 = this.k;
        c30 c30Var22 = this.j;
        return v73Var.a(obj2, gn1Var2, c30Var22, this.c, this.d, this.e, true, (c30Var22.d || c30Var22.e == j2 || c30Var22.b != j2) ? false : z, this.l, j3, this.h, 0, a() - 1, this.g);
    }

    @Override // yads.w73
    public final int a() {
        return this.j.m.size();
    }

    @Override // yads.w73
    public final int a(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f) >= 0 && intValue < a()) {
            return intValue;
        }
        return -1;
    }

    @Override // yads.w73
    public final Object a(int i) {
        ni.a(i, a());
        return Integer.valueOf(this.f + i);
    }
}
