package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h6a extends c7f {
    public static final h6a c;

    static {
        i6a.a.getClass();
        c = new h6a(a7a.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        g6a g6aVar = (g6a) obj;
        g6aVar.getClass();
        int l = uf3Var.l(this.b, i);
        g6aVar.b(g6aVar.d() + 1);
        int[] iArr = g6aVar.a;
        int i2 = g6aVar.b;
        g6aVar.b = i2 + 1;
        iArr[i2] = l;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        g6a g6aVar = new g6a();
        g6aVar.a = iArr;
        g6aVar.b = iArr.length;
        g6aVar.b(10);
        return g6aVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new int[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        wf3Var.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.u(i2, iArr[i2], this.b);
        }
    }
}
