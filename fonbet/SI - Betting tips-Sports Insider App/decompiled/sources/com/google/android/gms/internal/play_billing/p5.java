package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p5 extends d3 {
    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean B(r5 r5Var, q5 q5Var, q5 q5Var2) {
        synchronized (r5Var) {
            try {
                if (r5Var.f5565c != q5Var) {
                    return false;
                }
                r5Var.f5565c = q5Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void j(q5 q5Var, q5 q5Var2) {
        q5Var.f5556b = q5Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void s(q5 q5Var, Thread thread) {
        q5Var.f5555a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean u(r5 r5Var, f4 f4Var, f4 f4Var2) {
        synchronized (r5Var) {
            try {
                if (r5Var.f5564b != f4Var) {
                    return false;
                }
                r5Var.f5564b = f4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean w(r5 r5Var, Object obj, Object obj2) {
        synchronized (r5Var) {
            try {
                if (r5Var.f5563a != obj) {
                    return false;
                }
                r5Var.f5563a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
