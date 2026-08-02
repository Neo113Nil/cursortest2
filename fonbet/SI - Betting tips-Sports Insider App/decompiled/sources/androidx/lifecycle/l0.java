package androidx.lifecycle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends m0 implements c0 {

    /* renamed from: e, reason: collision with root package name */
    public final e0 f2198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f2199f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, e0 e0Var, q0 q0Var) {
        super(n0Var, q0Var);
        this.f2199f = n0Var;
        this.f2198e = e0Var;
    }

    @Override // androidx.lifecycle.m0
    public final void b() {
        this.f2198e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 e0Var, w wVar) {
        e0 e0Var2 = this.f2198e;
        x xVar = ((g0) e0Var2.getLifecycle()).f2169d;
        if (xVar == x.f2253a) {
            this.f2199f.i(this.f2203a);
            return;
        }
        x xVar2 = null;
        while (xVar2 != xVar) {
            a(e());
            xVar2 = xVar;
            xVar = ((g0) e0Var2.getLifecycle()).f2169d;
        }
    }

    @Override // androidx.lifecycle.m0
    public final boolean d(e0 e0Var) {
        return this.f2198e == e0Var;
    }

    @Override // androidx.lifecycle.m0
    public final boolean e() {
        return ((g0) this.f2198e.getLifecycle()).f2169d.a(x.f2256d);
    }
}
