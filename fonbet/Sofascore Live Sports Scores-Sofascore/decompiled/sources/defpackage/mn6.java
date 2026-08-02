package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mn6 implements dy2 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public mn6(xei xeiVar, zx2 zx2Var) {
        z1a.r("error must not be OK", !xeiVar.f());
        this.b = xeiVar;
        this.c = zx2Var;
    }

    @Override // defpackage.e8a
    public final f8a b() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((asb) this.c).b();
        }
    }

    @Override // defpackage.dy2
    public final yx2 d(ujg ujgVar, qic qicVar, jh2 jh2Var, cy2[] cy2VarArr) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new ln6((xei) obj2, (zx2) obj, cy2VarArr);
            default:
                jh2 jh2Var2 = jh2.h;
                z1a.y(jh2Var, "callOptions cannot be null");
                cy2 a = ((by2) obj2).a(new pp4(jh2Var, 0, false), qicVar);
                z1a.D("lb tracer already assigned", cy2VarArr[cy2VarArr.length - 1] == n49.o);
                cy2VarArr[cy2VarArr.length - 1] = a;
                return ((asb) obj).d(ujgVar, qicVar, jh2Var, cy2VarArr);
        }
    }

    public mn6(by2 by2Var, asb asbVar) {
        this.b = by2Var;
        this.c = asbVar;
    }
}
