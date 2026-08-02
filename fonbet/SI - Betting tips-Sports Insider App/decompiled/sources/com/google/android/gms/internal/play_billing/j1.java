package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 extends d3 {
    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean A(o1 o1Var, g1 g1Var, g1 g1Var2) {
        synchronized (o1Var) {
            try {
                if (o1Var.f5533b != g1Var) {
                    return false;
                }
                o1Var.f5533b = g1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean E(o1 o1Var, Object obj, Object obj2) {
        synchronized (o1Var) {
            try {
                if (o1Var.f5532a != obj) {
                    return false;
                }
                o1Var.f5532a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean G(o1 o1Var, n1 n1Var, n1 n1Var2) {
        synchronized (o1Var) {
            try {
                if (o1Var.f5534c != n1Var) {
                    return false;
                }
                o1Var.f5534c = n1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final g1 e(o1 o1Var) {
        g1 g1Var;
        g1 g1Var2 = g1.f5456d;
        synchronized (o1Var) {
            try {
                g1Var = o1Var.f5533b;
                if (g1Var != g1Var2) {
                    o1Var.f5533b = g1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final n1 p(o1 o1Var) {
        n1 n1Var;
        n1 n1Var2 = n1.f5521c;
        synchronized (o1Var) {
            try {
                n1Var = o1Var.f5534c;
                if (n1Var != n1Var2) {
                    o1Var.f5534c = n1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void t(n1 n1Var, n1 n1Var2) {
        n1Var.f5523b = n1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void v(n1 n1Var, Thread thread) {
        n1Var.f5522a = thread;
    }
}
