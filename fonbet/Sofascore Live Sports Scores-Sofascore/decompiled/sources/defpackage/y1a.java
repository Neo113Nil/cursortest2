package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y1a {
    public final k95 a;
    public s1a b;
    public v1a c;
    public u1a d;
    public t1a e;
    public w1a f;
    public yia g;
    public long h = 9205357640488583168L;
    public am0 i;
    public final yz1 j;
    public final yz1 k;
    public long l;

    public y1a(k95 k95Var) {
        this.a = k95Var;
        yz1 yz1Var = new yz1(5, false);
        yz1Var.c = new l0d();
        this.j = yz1Var;
        yz1 yz1Var2 = new yz1(9, false);
        yz1Var2.c = new a0d();
        this.k = yz1Var2;
        this.l = 0L;
    }

    public static void c(y1a y1aVar, q1a q1aVar, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        k95 k95Var = y1aVar.a;
        u1a u1aVar = y1aVar.d;
        if (u1aVar == null) {
            u1aVar = new u1a();
            u1aVar.k = null;
            u1aVar.l = Long.MAX_VALUE;
            u1aVar.m = false;
            y1aVar.d = u1aVar;
        }
        u1aVar.k = q1aVar;
        u1aVar.l = j;
        am0 am0Var = y1aVar.i;
        ewd ewdVar = k95Var.q;
        if (am0Var == null) {
            y1aVar.i = new am0(ewdVar);
        } else {
            am0Var.c = ewdVar;
            am0Var.b = j2;
        }
        u1aVar.m = false;
        y1aVar.f = u1aVar;
    }

    public final void a() {
        s1a s1aVar = this.b;
        if (s1aVar == null) {
            r1a r1aVar = r1a.c;
            s1aVar = new s1a();
            s1aVar.k = r1aVar;
            s1aVar.l = false;
            this.b = s1aVar;
        }
        s1aVar.k = r1a.c;
        s1aVar.l = false;
        this.f = s1aVar;
    }

    public final void b(q1a q1aVar, long j, am0 am0Var) {
        t1a t1aVar = this.e;
        if (t1aVar == null) {
            t1aVar = new t1a();
            t1aVar.k = null;
            t1aVar.l = Long.MAX_VALUE;
            this.e = t1aVar;
        }
        t1aVar.k = q1aVar;
        t1aVar.l = j;
        am0Var.b = 0L;
        this.f = t1aVar;
    }

    public final yia d() {
        yia yiaVar = this.g;
        if (yiaVar != null) {
            return yiaVar;
        }
        a70.p("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(q1a q1aVar, p1a p1aVar, long j) {
        k95 k95Var = this.a;
        long I = c6o.b0(k95Var).I(0L);
        if (!dnd.c(this.h, 9205357640488583168L) && !dnd.c(I, this.h)) {
            this.l = dnd.i(this.l, dnd.h(I, this.h));
        }
        this.h = I;
        ewd ewdVar = k95Var.q;
        ewdVar.getClass();
        xf2 xf2Var = w95.a;
        if (Math.abs(Float.intBitsToFloat((int) (ewdVar == ewd.a ? j & 4294967295L : j >> 32))) > 2.0f) {
            z1a.h(d(), q1aVar, k95Var.q, p1aVar, this.j, this.l);
            yz1 yz1Var = this.k;
            a0d a0dVar = (a0d) yz1Var.c;
            int i = a0dVar.b;
            if (i == 3) {
                int i2 = yz1Var.b;
                yz1Var.b = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    zzl.r("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = a0dVar.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j;
                }
            } else {
                a0dVar.a(j);
            }
            if (yz1Var.b == 3) {
                yz1Var.b = 0;
            }
            long[] jArr2 = a0dVar.a;
            int i3 = a0dVar.b;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                f2 += Float.intBitsToFloat((int) (jArr2[i4] >> 32));
            }
            int i5 = a0dVar.b;
            float f3 = f2 / i5;
            long[] jArr3 = a0dVar.a;
            for (int i6 = 0; i6 < i5; i6++) {
                f += Float.intBitsToFloat((int) (jArr3[i6] & 4294967295L));
            }
            k95Var.s1(new q85((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f / a0dVar.b) & 4294967295L), true));
        }
    }

    public final void f(q1a q1aVar, q1a q1aVar2, p1a p1aVar, long j) {
        if (this.g == null) {
            this.g = new yia((byte) 0, 26);
        }
        this.l = 0L;
        yia d = d();
        k95 k95Var = this.a;
        z1a.h(d, q1aVar, k95Var.q, p1aVar, this.j, this.l);
        long h = dnd.h(z1a.T(q1aVar2, k95Var.q, p1aVar), j);
        if (((Boolean) k95Var.r.invoke(new vze(1))).booleanValue()) {
            this.h = c6o.b0(k95Var).I(0L);
            k95Var.s1(new r85(h));
        }
        yz1 yz1Var = this.k;
        yz1Var.b = 0;
        ((a0d) yz1Var.c).b = 0;
    }
}
