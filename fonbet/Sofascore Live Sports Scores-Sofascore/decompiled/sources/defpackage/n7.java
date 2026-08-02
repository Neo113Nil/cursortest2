package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n7 extends rd0 {
    @Override // defpackage.rd0
    public final void P(o7 o7Var, o7 o7Var2) {
        o7Var.b = o7Var2;
    }

    @Override // defpackage.rd0
    public final void Q(o7 o7Var, Thread thread) {
        o7Var.a = thread;
    }

    @Override // defpackage.rd0
    public final boolean v(p7 p7Var, l7 l7Var, l7 l7Var2) {
        synchronized (p7Var) {
            try {
                if (p7Var.b != l7Var) {
                    return false;
                }
                p7Var.b = l7Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rd0
    public final boolean w(p7 p7Var, Object obj, Object obj2) {
        synchronized (p7Var) {
            try {
                if (p7Var.a != obj) {
                    return false;
                }
                p7Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rd0
    public final boolean x(p7 p7Var, o7 o7Var, o7 o7Var2) {
        synchronized (p7Var) {
            try {
                if (p7Var.c != o7Var) {
                    return false;
                }
                p7Var.c = o7Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
