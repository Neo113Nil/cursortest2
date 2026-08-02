package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uh2 {
    public Object a;
    public xh2 b;
    public b1g c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        xh2 xh2Var = this.b;
        if (xh2Var == null || !xh2Var.b.j(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void b() {
        this.d = true;
        xh2 xh2Var = this.b;
        if (xh2Var == null || !xh2Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void c(Throwable th) {
        this.d = true;
        xh2 xh2Var = this.b;
        if (xh2Var == null || !xh2Var.b.k(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        b1g b1gVar;
        xh2 xh2Var = this.b;
        if (xh2Var != null && !xh2Var.b.isDone()) {
            xh2Var.b(new v3("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
        }
        if (this.d || (b1gVar = this.c) == null) {
            return;
        }
        b1gVar.j(null);
    }
}
