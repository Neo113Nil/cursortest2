package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w92 extends c7f {
    public static final w92 c;

    static {
        ab2.a.getClass();
        c = new w92(qb2.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        n92 n92Var = (n92) obj;
        n92Var.getClass();
        byte A = uf3Var.A(this.b, i);
        n92Var.b(n92Var.d() + 1);
        byte[] bArr = n92Var.a;
        int i2 = n92Var.b;
        n92Var.b = i2 + 1;
        bArr[i2] = A;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        n92 n92Var = new n92();
        n92Var.a = bArr;
        n92Var.b = bArr.length;
        n92Var.b(10);
        return n92Var;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new byte[0];
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        wf3Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            wf3Var.q(this.b, i2, bArr[i2]);
        }
    }
}
