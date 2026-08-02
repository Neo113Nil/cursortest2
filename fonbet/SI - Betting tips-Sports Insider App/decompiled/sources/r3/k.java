package r3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f22244b;

    /* renamed from: c, reason: collision with root package name */
    public int f22245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e0 e0Var, mf.c cVar) {
        super(cVar);
        this.f22244b = e0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22243a = obj;
        this.f22245c |= Integer.MIN_VALUE;
        return this.f22244b.g(null, 0, false, null, 0L, null, null, this);
    }
}
