package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a4 extends hkg {
    @Override // defpackage.hkg
    public final x3 M(g4 g4Var) {
        x3 x3Var;
        x3 x3Var2 = x3.d;
        synchronized (g4Var) {
            try {
                x3Var = g4Var.b;
                if (x3Var != x3Var2) {
                    g4Var.b = x3Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x3Var;
    }

    @Override // defpackage.hkg
    public final f4 N(g4 g4Var) {
        f4 f4Var;
        f4 f4Var2 = f4.c;
        synchronized (g4Var) {
            try {
                f4Var = g4Var.c;
                if (f4Var != f4Var2) {
                    g4Var.c = f4Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4Var;
    }

    @Override // defpackage.hkg
    public final void m0(f4 f4Var, f4 f4Var2) {
        f4Var.b = f4Var2;
    }

    @Override // defpackage.hkg
    public final void n0(f4 f4Var, Thread thread) {
        f4Var.a = thread;
    }

    @Override // defpackage.hkg
    public final boolean w(g4 g4Var, x3 x3Var, x3 x3Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.b != x3Var) {
                    return false;
                }
                g4Var.b = x3Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hkg
    public final boolean x(g4 g4Var, Object obj, Object obj2) {
        synchronized (g4Var) {
            try {
                if (g4Var.a != obj) {
                    return false;
                }
                g4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hkg
    public final boolean y(g4 g4Var, f4 f4Var, f4 f4Var2) {
        synchronized (g4Var) {
            try {
                if (g4Var.c != f4Var) {
                    return false;
                }
                g4Var.c = f4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
