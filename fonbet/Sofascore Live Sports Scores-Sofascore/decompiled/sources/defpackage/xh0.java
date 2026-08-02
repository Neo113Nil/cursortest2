package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xh0 extends wtc implements oma {
    public float o;

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : g1cVar.G(i);
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : g1cVar.b(i);
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.o) : g1cVar.B(i);
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long l1 = l1(j, true);
        if (c7a.a(l1, 0L)) {
            l1 = k1(j, true);
            if (c7a.a(l1, 0L)) {
                l1 = n1(j, true);
                if (c7a.a(l1, 0L)) {
                    l1 = m1(j, true);
                    if (c7a.a(l1, 0L)) {
                        l1 = l1(j, false);
                        if (c7a.a(l1, 0L)) {
                            l1 = k1(j, false);
                            if (c7a.a(l1, 0L)) {
                                l1 = n1(j, false);
                                if (c7a.a(l1, 0L)) {
                                    l1 = m1(j, false);
                                    if (c7a.a(l1, 0L)) {
                                        l1 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!c7a.a(l1, 0L)) {
            int i = (int) (l1 >> 32);
            int i2 = (int) (4294967295L & l1);
            if (!((i >= 0) & (i2 >= 0))) {
                t3a.a("width and height must be >= 0");
            }
            j = cn3.h(i, i, i2, i2);
        }
        qhe J = g1cVar.J(j);
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 1));
    }

    public final long k1(long j, boolean z) {
        int round;
        int g = an3.g(j);
        if (g == Integer.MAX_VALUE || (round = Math.round(g * this.o)) <= 0) {
            return 0L;
        }
        if (!z || qx9.C(round, g, j)) {
            return (round << 32) | (g & 4294967295L);
        }
        return 0L;
    }

    public final long l1(long j, boolean z) {
        int round;
        int h = an3.h(j);
        if (h == Integer.MAX_VALUE || (round = Math.round(h / this.o)) <= 0) {
            return 0L;
        }
        if (!z || qx9.C(h, round, j)) {
            return (h << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.o) : g1cVar.s(i);
    }

    public final long m1(long j, boolean z) {
        int i = an3.i(j);
        int round = Math.round(i * this.o);
        if (round <= 0) {
            return 0L;
        }
        if (!z || qx9.C(round, i, j)) {
            return (round << 32) | (i & 4294967295L);
        }
        return 0L;
    }

    public final long n1(long j, boolean z) {
        int j2 = an3.j(j);
        int round = Math.round(j2 / this.o);
        if (round <= 0) {
            return 0L;
        }
        if (!z || qx9.C(j2, round, j)) {
            return (j2 << 32) | (round & 4294967295L);
        }
        return 0L;
    }
}
