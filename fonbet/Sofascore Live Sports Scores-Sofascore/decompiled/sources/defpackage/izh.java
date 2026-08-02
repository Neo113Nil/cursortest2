package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class izh implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdi b;

    public /* synthetic */ izh(cdi cdiVar, int i) {
        this.a = i;
        this.b = cdiVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        cdi cdiVar = this.b;
        m1c m1cVar = (m1c) obj;
        g1c g1cVar = (g1c) obj2;
        an3 an3Var = (an3) obj3;
        switch (i) {
            case 0:
                m1cVar.getClass();
                g1cVar.getClass();
                qhe J = g1cVar.J(an3Var.a);
                return m1c.G0(m1cVar, J.a, wzb.b(((Number) cdiVar.getValue()).floatValue() * J.b), new b3(J, 15));
            default:
                m1cVar.getClass();
                g1cVar.getClass();
                qhe J2 = g1cVar.J(an3.a(an3Var.a, 0, 0, 0, Integer.MAX_VALUE, 7));
                return m1c.G0(m1cVar, J2.a, wzb.b(((Number) cdiVar.getValue()).floatValue() * J2.b), new b3(J2, 24));
        }
    }
}
