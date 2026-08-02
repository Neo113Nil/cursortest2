package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v38 {
    public final r18 a;
    public final qy4 b;
    public final bcf c;
    public boolean d = false;
    public o3 e;
    public final Executor f;

    /* JADX WARN: Multi-variable type inference failed */
    public v38(tw9 tw9Var, bcf bcfVar, l48 l48Var, r18 r18Var, qy4 qy4Var, Executor executor) {
        ob8 lc8Var;
        ob8 ub8Var;
        this.c = bcfVar;
        int i = 0;
        this.a = r18Var;
        this.b = qy4Var;
        this.f = executor;
        ((k48) l48Var).c().addOnSuccessListener(executor, new hg6(13));
        qsg qsgVar = tw9Var.f;
        cd8 cd8Var = tw9Var.a;
        cd8 cd8Var2 = tw9Var.j.b;
        cd8 cd8Var3 = tw9Var.b;
        int i2 = ob8.a;
        rha.x(cd8Var, "source1 is null");
        rha.x(cd8Var2, "source2 is null");
        rha.x(cd8Var3, "source3 is null");
        int i3 = 1;
        zb8 zb8Var = new zb8(new xgf[]{cd8Var, cd8Var2, cd8Var3}, 1);
        f8h f8hVar = un0.j;
        int i4 = ob8.a;
        rha.E(3, "maxConcurrency");
        rha.E(i4, "bufferSize");
        if (zb8Var instanceof hrg) {
            Object call = ((hrg) zb8Var).call();
            lc8Var = call == null ? gc8.b : new dd8(call, f8hVar);
        } else {
            lc8Var = new lc8(zb8Var, i4, i);
        }
        ub8 ub8Var2 = new ub8(lc8Var, new is8(18), i3);
        gsg gsgVar = qsgVar.a;
        rha.x(gsgVar, "scheduler is null");
        rha.E(i4, "bufferSize");
        wc8 wc8Var = new wc8(ub8Var2, gsgVar, i4);
        pw9 pw9Var = new pw9(tw9Var, 1);
        rha.E(2, "prefetch");
        if (wc8Var instanceof hrg) {
            Object call2 = ((hrg) wc8Var).call();
            ub8Var = call2 == null ? gc8.b : new dd8(call2, pw9Var);
        } else {
            ub8Var = new ub8(wc8Var, pw9Var, i);
        }
        gsg gsgVar2 = qsgVar.b;
        rha.x(gsgVar2, "scheduler is null");
        rha.E(i4, "bufferSize");
        new wc8(ub8Var, gsgVar2, i4).d(new zka(new kt4(this, 20)));
    }

    public final void a() {
        qy4 qy4Var = this.b;
        qy4Var.b.clear();
        qy4Var.e.clear();
        qy4Var.d.clear();
        qy4Var.c.clear();
    }

    public final void b(String str) {
        ((vb8) this.c.a.b).g(str);
    }
}
