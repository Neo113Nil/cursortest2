package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class u65 extends c7f {
    public static final u65 c;

    static {
        a75.a.getClass();
        c = new u65(h75.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        t65 t65Var = (t65) obj;
        t65Var.getClass();
        double D = uf3Var.D(this.b, i);
        t65Var.b(t65Var.d() + 1);
        double[] dArr = t65Var.a;
        int i2 = t65Var.b;
        t65Var.b = i2 + 1;
        dArr[i2] = D;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        t65 t65Var = new t65();
        t65Var.a = dArr;
        t65Var.b = dArr.length;
        t65Var.b(10);
        return t65Var;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new double[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        wf3Var.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.D(this.b, i2, dArr[i2]);
        }
    }
}
