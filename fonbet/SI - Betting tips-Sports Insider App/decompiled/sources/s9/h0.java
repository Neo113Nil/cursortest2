package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f23325a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f23326b;

    /* renamed from: c, reason: collision with root package name */
    public final n f23327c;

    public h0(r0 r0Var, n nVar, a aVar) {
        this.f23326b = r0Var;
        nVar.getClass();
        this.f23327c = nVar;
        this.f23325a = aVar;
    }

    @Override // s9.n0
    public final void a(Object obj, Object obj2) {
        o0.b(this.f23326b, obj, obj2);
    }

    @Override // s9.n0
    public final void b(Object obj) {
        this.f23326b.getClass();
        q0 q0Var = ((r) obj).f23374c;
        if (q0Var.f23371d) {
            q0Var.f23371d = false;
        }
        this.f23327c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // s9.n0
    public final boolean c(Object obj) {
        this.f23327c.getClass();
        androidx.appcompat.widget.c1.t(obj);
        throw null;
    }

    @Override // s9.n0
    public final r d() {
        a aVar = this.f23325a;
        return aVar instanceof r ? ((r) aVar).e() : ((io.sentry.android.core.internal.tombstone.j) ((r) aVar).a(5)).a();
    }

    @Override // s9.n0
    public final boolean e(r rVar, r rVar2) {
        this.f23326b.getClass();
        return rVar.f23374c.equals(rVar2.f23374c);
    }

    @Override // s9.n0
    public final void f(Object obj, androidx.datastore.preferences.protobuf.m mVar, m mVar2) {
        this.f23326b.getClass();
        r0.a(obj);
        this.f23327c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // s9.n0
    public final int g(r rVar) {
        this.f23326b.getClass();
        return rVar.f23374c.hashCode();
    }
}
