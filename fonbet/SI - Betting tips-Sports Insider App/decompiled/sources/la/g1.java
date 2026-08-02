package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f19475b;

    /* renamed from: c, reason: collision with root package name */
    public int f19476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j1 j1Var, mf.c cVar) {
        super(cVar);
        this.f19475b = j1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19474a = obj;
        this.f19476c |= Integer.MIN_VALUE;
        return this.f19475b.c(this);
    }
}
