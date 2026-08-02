package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bvk implements f0g {
    public final bpf a;
    public final ot9 b;
    public final ku9 c;
    public final g6b d;
    public final yda e;

    public bvk(bpf bpfVar, ot9 ot9Var, ku9 ku9Var, g6b g6bVar, yda ydaVar) {
        this.a = bpfVar;
        this.b = ot9Var;
        this.c = ku9Var;
        this.d = g6bVar;
        this.e = ydaVar;
    }

    @Override // defpackage.f0g
    public final void h() {
        ku9 ku9Var = this.c;
        if (ku9Var.b.isAttachedToWindow()) {
            return;
        }
        dvk c = l.c(ku9Var.b);
        bvk bvkVar = c.d;
        if (bvkVar != null) {
            g6b g6bVar = bvkVar.d;
            bvkVar.e.e(null);
            ku9 ku9Var2 = bvkVar.c;
            if (ku9Var2 != null) {
                g6bVar.d(ku9Var2);
            }
            g6bVar.d(bvkVar);
        }
        c.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.f0g
    public final void m() {
        g6b g6bVar = this.d;
        g6bVar.a(this);
        ku9 ku9Var = this.c;
        if (ku9Var != null) {
            g6bVar.d(ku9Var);
            g6bVar.a(ku9Var);
        }
        dvk c = l.c(ku9Var.b);
        bvk bvkVar = c.d;
        if (bvkVar != null) {
            g6b g6bVar2 = bvkVar.d;
            bvkVar.e.e(null);
            ku9 ku9Var2 = bvkVar.c;
            if (ku9Var2 != null) {
                g6bVar2.d(ku9Var2);
            }
            g6bVar2.d(bvkVar);
        }
        c.d = this;
    }

    @Override // defpackage.rq4
    public final void onDestroy(u6b u6bVar) {
        l.c(this.c.b).a();
    }
}
