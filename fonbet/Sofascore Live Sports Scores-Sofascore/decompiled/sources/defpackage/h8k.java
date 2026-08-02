package defpackage;

import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class h8k extends c7f {
    public static final h8k c;

    static {
        e8k.b.getClass();
        c = new h8k(i8k.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        return ((f8k) obj).a.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        g8k g8kVar = (g8k) obj;
        g8kVar.getClass();
        long m = uf3Var.e(this.b, i).m();
        d8k d8kVar = e8k.b;
        g8kVar.b(g8kVar.d() + 1);
        long[] jArr = g8kVar.a;
        int i2 = g8kVar.b;
        g8kVar.b = i2 + 1;
        jArr[i2] = m;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        long[] jArr = ((f8k) obj).a;
        g8k g8kVar = new g8k();
        g8kVar.a = jArr;
        g8kVar.b = jArr.length;
        g8kVar.b(10);
        return g8kVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new f8k(new long[0]);
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        long[] jArr = ((f8k) obj).a;
        wf3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder n = wf3Var.n(this.b, i2);
            long j = jArr[i2];
            d8k d8kVar = e8k.b;
            n.m(j);
        }
    }
}
