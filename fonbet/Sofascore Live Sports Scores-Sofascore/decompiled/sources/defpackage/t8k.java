package defpackage;

import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class t8k extends c7f {
    public static final t8k c;

    static {
        q8k.b.getClass();
        c = new t8k(u8k.a);
    }

    @Override // defpackage.w2
    public final int d(Object obj) {
        return ((r8k) obj).a.length;
    }

    @Override // defpackage.h13, defpackage.w2
    public final void f(uf3 uf3Var, int i, Object obj) {
        s8k s8kVar = (s8k) obj;
        s8kVar.getClass();
        short q = uf3Var.e(this.b, i).q();
        p8k p8kVar = q8k.b;
        s8kVar.b(s8kVar.d() + 1);
        short[] sArr = s8kVar.a;
        int i2 = s8kVar.b;
        s8kVar.b = i2 + 1;
        sArr[i2] = q;
    }

    @Override // defpackage.w2
    public final Object g(Object obj) {
        short[] sArr = ((r8k) obj).a;
        s8k s8kVar = new s8k();
        s8kVar.a = sArr;
        s8kVar.b = sArr.length;
        s8kVar.b(10);
        return s8kVar;
    }

    @Override // defpackage.c7f
    public final Object j() {
        return new r8k(new short[0]);
    }

    @Override // defpackage.c7f
    public final void k(wf3 wf3Var, Object obj, int i) {
        short[] sArr = ((r8k) obj).a;
        wf3Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Encoder n = wf3Var.n(this.b, i2);
            short s = sArr[i2];
            p8k p8kVar = q8k.b;
            n.r(s);
        }
    }
}
