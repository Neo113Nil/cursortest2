package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fkh extends wtc implements oma {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        long k1 = k1(tkbVar);
        if (an3.f(k1)) {
            return an3.h(k1);
        }
        if (!this.s) {
            i = cn3.f(i, k1);
        }
        return cn3.g(g1cVar.G(i), k1);
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        long k1 = k1(tkbVar);
        if (an3.e(k1)) {
            return an3.g(k1);
        }
        if (!this.s) {
            i = cn3.g(i, k1);
        }
        return cn3.f(g1cVar.b(i), k1);
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        long k1 = k1(tkbVar);
        if (an3.f(k1)) {
            return an3.h(k1);
        }
        if (!this.s) {
            i = cn3.f(i, k1);
        }
        return cn3.g(g1cVar.B(i), k1);
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        int j2;
        int h;
        int i;
        int g;
        long a;
        long k1 = k1(m1cVar);
        if (this.s) {
            a = cn3.e(j, k1);
        } else {
            if (Float.isNaN(this.o)) {
                j2 = an3.j(j);
                int h2 = an3.h(k1);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = an3.j(k1);
            }
            if (Float.isNaN(this.q)) {
                h = an3.h(j);
                int j3 = an3.j(k1);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = an3.h(k1);
            }
            if (Float.isNaN(this.p)) {
                i = an3.i(j);
                int g2 = an3.g(k1);
                if (i > g2) {
                    i = g2;
                }
            } else {
                i = an3.i(k1);
            }
            if (Float.isNaN(this.r)) {
                g = an3.g(j);
                int i2 = an3.i(k1);
                if (g < i2) {
                    g = i2;
                }
            } else {
                g = an3.g(k1);
            }
            a = cn3.a(j2, h, i, g);
        }
        qhe J = g1cVar.J(a);
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k1(m1c m1cVar) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.q)) {
            i = Integer.MAX_VALUE;
        } else {
            i = m1cVar.e0(this.q);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.r)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = m1cVar.e0(this.r);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.o)) {
            i3 = m1cVar.e0(this.o);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.p)) {
            int e0 = m1cVar.e0(this.p);
            if (e0 < 0) {
                e0 = 0;
            }
            if (e0 > i2) {
                e0 = i2;
            }
            if (e0 != Integer.MAX_VALUE) {
                i4 = e0;
            }
        }
        return cn3.a(i3, i, i4, i2);
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        long k1 = k1(tkbVar);
        if (an3.e(k1)) {
            return an3.g(k1);
        }
        if (!this.s) {
            i = cn3.g(i, k1);
        }
        return cn3.f(g1cVar.s(i), k1);
    }
}
