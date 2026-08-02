package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jfh extends c7f {
    public static final jfh c;

    static {
        kfh.a.getClass();
        c = new jfh(lfh.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        ifh ifhVar = (ifh) obj;
        ifhVar.getClass();
        short x = uf3Var.x(this.b, i);
        ifhVar.b(ifhVar.d() + 1);
        short[] sArr = ifhVar.a;
        int i2 = ifhVar.b;
        ifhVar.b = i2 + 1;
        sArr[i2] = x;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ifh ifhVar = new ifh();
        ifhVar.a = sArr;
        ifhVar.b = sArr.length;
        ifhVar.b(10);
        return ifhVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new short[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        wf3Var.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.i(this.b, i2, sArr[i2]);
        }
    }
}
