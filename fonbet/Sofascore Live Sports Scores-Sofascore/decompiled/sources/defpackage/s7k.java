package defpackage;

import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class s7k extends c7f {
    public static final s7k c;

    static {
        p7k.b.getClass();
        c = new s7k(t7k.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        return ((q7k) obj).a.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        r7k r7kVar = (r7k) obj;
        r7kVar.getClass();
        byte E = uf3Var.e(this.b, i).E();
        o7k o7kVar = p7k.b;
        r7kVar.b(r7kVar.d() + 1);
        byte[] bArr = r7kVar.a;
        int i2 = r7kVar.b;
        r7kVar.b = i2 + 1;
        bArr[i2] = E;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        byte[] bArr = ((q7k) obj).a;
        r7k r7kVar = new r7k();
        r7kVar.a = bArr;
        r7kVar.b = bArr.length;
        r7kVar.b(10);
        return r7kVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new q7k(new byte[0]);
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        byte[] bArr = ((q7k) obj).a;
        wf3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder n = wf3Var.n(this.b, i2);
            byte b = bArr[i2];
            o7k o7kVar = p7k.b;
            n.g(b);
        }
    }
}
