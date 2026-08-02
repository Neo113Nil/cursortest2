package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vo2 extends c7f {
    public static final vo2 c;

    static {
        wo2.a.getClass();
        c = new vo2(sp2.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        no2 no2Var = (no2) obj;
        no2Var.getClass();
        char h = uf3Var.h(this.b, i);
        no2Var.b(no2Var.d() + 1);
        char[] cArr = no2Var.a;
        int i2 = no2Var.b;
        no2Var.b = i2 + 1;
        cArr[i2] = h;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        no2 no2Var = new no2();
        no2Var.a = cArr;
        no2Var.b = cArr.length;
        no2Var.b(10);
        return no2Var;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new char[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        wf3Var.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.A(this.b, i2, cArr[i2]);
        }
    }
}
