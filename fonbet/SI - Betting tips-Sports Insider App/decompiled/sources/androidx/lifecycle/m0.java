package androidx.lifecycle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f2203a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2204b;

    /* renamed from: c, reason: collision with root package name */
    public int f2205c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f2206d;

    public m0(n0 n0Var, q0 q0Var) {
        this.f2206d = n0Var;
        this.f2203a = q0Var;
    }

    public final void a(boolean z5) {
        if (z5 == this.f2204b) {
            return;
        }
        this.f2204b = z5;
        int i5 = z5 ? 1 : -1;
        n0 n0Var = this.f2206d;
        int i10 = n0Var.f2212c;
        n0Var.f2212c = i5 + i10;
        if (!n0Var.f2213d) {
            n0Var.f2213d = true;
            while (true) {
                try {
                    int i11 = n0Var.f2212c;
                    if (i10 == i11) {
                        break;
                    }
                    boolean z7 = i10 == 0 && i11 > 0;
                    boolean z10 = i10 > 0 && i11 == 0;
                    if (z7) {
                        n0Var.f();
                    } else if (z10) {
                        n0Var.g();
                    }
                    i10 = i11;
                } catch (Throwable th2) {
                    n0Var.f2213d = false;
                    throw th2;
                }
            }
            n0Var.f2213d = false;
        }
        if (this.f2204b) {
            n0Var.c(this);
        }
    }

    public boolean d(e0 e0Var) {
        return false;
    }

    public abstract boolean e();

    public void b() {
    }
}
