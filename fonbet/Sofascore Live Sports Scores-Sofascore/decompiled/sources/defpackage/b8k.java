package defpackage;

import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b8k extends c7f {
    public static final b8k c;

    static {
        y7k.b.getClass();
        c = new b8k(c8k.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        return ((z7k) obj).a.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        a8k a8kVar = (a8k) obj;
        a8kVar.getClass();
        int k = uf3Var.e(this.b, i).k();
        x7k x7kVar = y7k.b;
        a8kVar.b(a8kVar.d() + 1);
        int[] iArr = a8kVar.a;
        int i2 = a8kVar.b;
        a8kVar.b = i2 + 1;
        iArr[i2] = k;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        int[] iArr = ((z7k) obj).a;
        a8k a8kVar = new a8k();
        a8kVar.a = iArr;
        a8kVar.b = iArr.length;
        a8kVar.b(10);
        return a8kVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new z7k(new int[0]);
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        int[] iArr = ((z7k) obj).a;
        wf3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder n = wf3Var.n(this.b, i2);
            int i3 = iArr[i2];
            x7k x7kVar = y7k.b;
            n.B(i3);
        }
    }
}
