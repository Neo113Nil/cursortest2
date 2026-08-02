package defpackage;

import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yj9 implements hj9 {
    public final m8k a = new m8k();
    public ij9 b = ij9.b;
    public final t89 c = new t89(8);
    public Object d = dm5.a;
    public smi e = tz9.o();
    public final xh3 f = new xh3();

    @Override // defpackage.hj9
    public final t89 a() {
        return this.c;
    }

    public final void b(h5k h5kVar) {
        xh3 xh3Var = this.f;
        if (h5kVar != null) {
            xh3Var.e(zzf.a, h5kVar);
            return;
        }
        pm0 pm0Var = zzf.a;
        pm0Var.getClass();
        xh3Var.c().remove(pm0Var);
    }

    public final void c(bl9 bl9Var) {
        ((Map) this.f.a(ei9.a, new fc9(10))).put(al9.a, bl9Var);
    }

    public final void d(ij9 ij9Var) {
        ij9Var.getClass();
        this.b = ij9Var;
    }

    public final void e(yj9 yj9Var) {
        yj9Var.getClass();
        this.b = yj9Var.b;
        this.d = yj9Var.d;
        xh3 xh3Var = yj9Var.f;
        b((h5k) xh3Var.d(zzf.a));
        m8k m8kVar = yj9Var.a;
        m8k m8kVar2 = this.a;
        t6a.L(m8kVar2, m8kVar);
        m8kVar2.d(m8kVar2.h);
        sea.j(this.c, yj9Var.c);
        for (pm0 pm0Var : CollectionsKt.S0(xh3Var.c().keySet())) {
            pm0Var.getClass();
            this.f.e(pm0Var, xh3Var.b(pm0Var));
        }
    }
}
