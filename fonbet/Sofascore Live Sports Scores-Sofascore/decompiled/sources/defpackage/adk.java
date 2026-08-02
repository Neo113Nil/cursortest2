package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class adk extends wtc implements oma {
    public float o;
    public float p;

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        int G = g1cVar.G(i);
        int e0 = !Float.isNaN(this.o) ? tkbVar.e0(this.o) : 0;
        return G < e0 ? e0 : G;
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        int b = g1cVar.b(i);
        int e0 = !Float.isNaN(this.p) ? tkbVar.e0(this.p) : 0;
        return b < e0 ? e0 : b;
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        int B = g1cVar.B(i);
        int e0 = !Float.isNaN(this.o) ? tkbVar.e0(this.o) : 0;
        return B < e0 ? e0 : B;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        int j2;
        int i;
        if (Float.isNaN(this.o) || an3.j(j) != 0) {
            j2 = an3.j(j);
        } else {
            int e0 = m1cVar.e0(this.o);
            j2 = an3.h(j);
            if (e0 < 0) {
                e0 = 0;
            }
            if (e0 <= j2) {
                j2 = e0;
            }
        }
        int h = an3.h(j);
        if (Float.isNaN(this.p) || an3.i(j) != 0) {
            i = an3.i(j);
        } else {
            int e02 = m1cVar.e0(this.p);
            i = an3.g(j);
            int i2 = e02 >= 0 ? e02 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        qhe J = g1cVar.J(cn3.a(j2, h, i, an3.g(j)));
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 23));
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        int s = g1cVar.s(i);
        int e0 = !Float.isNaN(this.p) ? tkbVar.e0(this.p) : 0;
        return s < e0 ? e0 : s;
    }
}
