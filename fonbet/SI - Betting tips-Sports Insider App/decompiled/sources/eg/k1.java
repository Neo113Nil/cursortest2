package eg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k1 extends i1 {

    /* renamed from: e, reason: collision with root package name */
    public final m1 f9186e;

    /* renamed from: f, reason: collision with root package name */
    public final l1 f9187f;

    /* renamed from: g, reason: collision with root package name */
    public final p f9188g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f9189h;

    public k1(m1 m1Var, l1 l1Var, p pVar, Object obj) {
        this.f9186e = m1Var;
        this.f9187f = l1Var;
        this.f9188g = pVar;
        this.f9189h = obj;
    }

    @Override // eg.i1
    public final boolean k() {
        return false;
    }

    @Override // eg.i1
    public final void l(Throwable th2) {
        p pVar = this.f9188g;
        p V = m1.V(pVar);
        m1 m1Var = this.f9186e;
        l1 l1Var = this.f9187f;
        Object obj = this.f9189h;
        if (V == null || !m1Var.g0(l1Var, V, obj)) {
            l1Var.f9199a.e(new jg.j(2), 2);
            p V2 = m1.V(pVar);
            if (V2 == null || !m1Var.g0(l1Var, V2, obj)) {
                m1Var.j(m1Var.A(l1Var, obj));
            }
        }
    }
}
