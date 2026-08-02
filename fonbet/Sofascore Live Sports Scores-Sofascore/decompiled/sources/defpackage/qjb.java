package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qjb extends c7f {
    public static final qjb c;

    static {
        rjb.a.getClass();
        c = new qjb(lkb.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        pjb pjbVar = (pjb) obj;
        pjbVar.getClass();
        long g = uf3Var.g(this.b, i);
        pjbVar.b(pjbVar.d() + 1);
        long[] jArr = pjbVar.a;
        int i2 = pjbVar.b;
        pjbVar.b = i2 + 1;
        jArr[i2] = g;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        pjb pjbVar = new pjb();
        pjbVar.a = jArr;
        pjbVar.b = jArr.length;
        pjbVar.b(10);
        return pjbVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new long[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        wf3Var.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.E(this.b, i2, jArr[i2]);
        }
    }
}
