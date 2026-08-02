package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jlb extends wtc implements oma {
    public int o;
    public int p;

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        long a;
        g1cVar.getClass();
        long d = cn3.d(j, d7a.f(this.o, this.p));
        if (an3.g(j) == Integer.MAX_VALUE && an3.h(j) != Integer.MAX_VALUE) {
            int i = (int) (d >> 32);
            int i2 = (this.p * i) / this.o;
            a = cn3.a(i, i, i2, i2);
        } else if (an3.h(j) != Integer.MAX_VALUE || an3.g(j) == Integer.MAX_VALUE) {
            int i3 = (int) (d >> 32);
            int i4 = (int) (d & 4294967295L);
            a = cn3.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (d & 4294967295L);
            int i6 = (this.o * i5) / this.p;
            a = cn3.a(i6, i6, i5, i5);
        }
        qhe J = g1cVar.J(a);
        return m1c.G0(m1cVar, J.a, J.b, new jy(J, 7));
    }
}
