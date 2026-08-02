package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w78 extends c7f {
    public static final w78 c;

    static {
        x78.a.getClass();
        c = new w78(c88.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        v78 v78Var = (v78) obj;
        v78Var.getClass();
        float s = uf3Var.s(this.b, i);
        v78Var.b(v78Var.d() + 1);
        float[] fArr = v78Var.a;
        int i2 = v78Var.b;
        v78Var.b = i2 + 1;
        fArr[i2] = s;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        v78 v78Var = new v78();
        v78Var.a = fArr;
        v78Var.b = fArr.length;
        v78Var.b(10);
        return v78Var;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new float[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        wf3Var.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.t(this.b, i2, fArr[i2]);
        }
    }
}
