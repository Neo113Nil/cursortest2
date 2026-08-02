package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ez1 extends c7f {
    public static final ez1 c;

    static {
        fz1.a.getClass();
        c = new ez1(gz1.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        dz1 dz1Var = (dz1) obj;
        dz1Var.getClass();
        boolean B = uf3Var.B(this.b, i);
        dz1Var.b(dz1Var.d() + 1);
        boolean[] zArr = dz1Var.a;
        int i2 = dz1Var.b;
        dz1Var.b = i2 + 1;
        zArr[i2] = B;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        dz1 dz1Var = new dz1();
        dz1Var.a = zArr;
        dz1Var.b = zArr.length;
        dz1Var.b(10);
        return dz1Var;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new boolean[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        wf3Var.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.x(this.b, i2, zArr[i2]);
        }
    }
}
