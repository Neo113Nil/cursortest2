package k2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18724a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1.j0 f18725b;

    /* renamed from: c, reason: collision with root package name */
    public int f18726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c1.j0 j0Var, mf.c cVar) {
        super(cVar);
        this.f18725b = j0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f18724a = obj;
        this.f18726c |= Integer.MIN_VALUE;
        this.f18725b.a(null, this);
        return lf.a.f20034a;
    }
}
