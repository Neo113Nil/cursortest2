package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h28 extends wtc implements oma {
    public l35 o;
    public float p;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        int j2;
        int h;
        int i;
        int i2;
        if (!an3.d(j) || this.o == l35.a) {
            j2 = an3.j(j);
            h = an3.h(j);
        } else {
            int round = Math.round(an3.h(j) * this.p);
            int j3 = an3.j(j);
            j2 = an3.h(j);
            if (round < j3) {
                round = j3;
            }
            if (round <= j2) {
                j2 = round;
            }
            h = j2;
        }
        if (!an3.c(j) || this.o == l35.b) {
            int i3 = an3.i(j);
            int g = an3.g(j);
            i = i3;
            i2 = g;
        } else {
            int round2 = Math.round(an3.g(j) * this.p);
            int i4 = an3.i(j);
            i = an3.g(j);
            if (round2 < i4) {
                round2 = i4;
            }
            if (round2 <= i) {
                i = round2;
            }
            i2 = i;
        }
        qhe J = g1cVar.J(cn3.a(j2, h, i, i2));
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 7));
    }
}
