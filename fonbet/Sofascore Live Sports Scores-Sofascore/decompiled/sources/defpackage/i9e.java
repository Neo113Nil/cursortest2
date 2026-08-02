package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i9e extends wtc implements oma {
    public float o;
    public cdi p;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    @Override // defpackage.oma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        int i;
        cdi cdiVar = this.p;
        if (cdiVar != null) {
            znh znhVar = (znh) cdiVar;
            if (((Number) znhVar.getValue()).intValue() != Integer.MAX_VALUE) {
                i = Math.round(((Number) znhVar.getValue()).floatValue() * this.o);
                int j2 = i == Integer.MAX_VALUE ? i : an3.j(j);
                int i2 = an3.i(j);
                if (i == Integer.MAX_VALUE) {
                    i = an3.h(j);
                }
                qhe J = g1cVar.J(cn3.a(j2, i, i2, an3.g(j)));
                return m1c.G0(m1cVar, J.a, J.b, new b3(J, 13));
            }
        }
        i = Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
        }
        int i22 = an3.i(j);
        if (i == Integer.MAX_VALUE) {
        }
        qhe J2 = g1cVar.J(cn3.a(j2, i, i22, an3.g(j)));
        return m1c.G0(m1cVar, J2.a, J2.b, new b3(J2, 13));
    }
}
