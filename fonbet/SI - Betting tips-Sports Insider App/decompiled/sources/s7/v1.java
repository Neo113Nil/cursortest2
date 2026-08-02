package s7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f23145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f23146b;

    public v1(e2 e2Var, boolean z5) {
        this.f23145a = z5;
        Objects.requireNonNull(e2Var);
        this.f23146b = e2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r3 != r4) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e2 e2Var = this.f23146b;
        f1 f1Var = (f1) e2Var.f3328a;
        boolean d10 = f1Var.d();
        boolean z5 = false;
        boolean z7 = f1Var.f22762y != null && f1Var.f22762y.booleanValue();
        boolean z10 = this.f23145a;
        f1Var.f22762y = Boolean.valueOf(z10);
        if (z7 == z10) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22910n.b(Boolean.valueOf(z10), "Default data collection state already set to");
        }
        if (f1Var.d() != d10) {
            boolean d11 = f1Var.d();
            if (f1Var.f22762y != null && f1Var.f22762y.booleanValue()) {
                z5 = true;
            }
        }
        n0 n0Var2 = f1Var.f22745f;
        f1.m(n0Var2);
        n0Var2.f22907k.c(Boolean.valueOf(z10), Boolean.valueOf(d10), "Default data collection is different than actual status");
        e2Var.B();
    }
}
