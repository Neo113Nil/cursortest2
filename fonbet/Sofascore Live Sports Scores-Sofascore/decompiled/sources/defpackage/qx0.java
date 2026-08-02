package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qx0 {
    public final f8d a;
    public final upd b;

    /* JADX WARN: Multi-variable type inference failed */
    public qx0(f8d f8dVar, upd updVar) {
        this.a = f8dVar;
        this.b = updVar;
        if ((f8dVar == null ? updVar : f8dVar) != null) {
            return;
        }
        a70.p("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(r9 r9Var) {
        f8d f8dVar = this.a;
        if (f8dVar != null) {
            f8d.a(f8dVar, (ox0) r9Var.b);
            return;
        }
        upd updVar = this.b;
        if (updVar == null) {
            a70.r("Unreachable");
            return;
        }
        px0 px0Var = (px0) r9Var.a;
        px0Var.getClass();
        opd opdVar = new opd(px0Var, new qpd(null, px0Var));
        px0Var.a.add(opdVar);
        f8d.a(updVar.b().c, opdVar);
    }

    public final void b(r9 r9Var) {
        if (this.a != null) {
            ((ox0) r9Var.b).f();
        } else if (this.b != null) {
            ((px0) r9Var.a).e();
        } else {
            a70.r("Unreachable");
        }
    }
}
