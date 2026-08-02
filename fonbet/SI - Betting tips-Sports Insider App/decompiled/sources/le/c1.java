package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f19719b;

    /* renamed from: c, reason: collision with root package name */
    public int f19720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, mf.c cVar) {
        super(cVar);
        this.f19719b = d1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19718a = obj;
        this.f19720c |= Integer.MIN_VALUE;
        return this.f19719b.y(this);
    }
}
