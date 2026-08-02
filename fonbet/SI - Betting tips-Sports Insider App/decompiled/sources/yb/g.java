package yb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f25812b;

    /* renamed from: c, reason: collision with root package name */
    public int f25813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, mf.c cVar) {
        super(cVar);
        this.f25812b = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25811a = obj;
        this.f25813c |= Integer.MIN_VALUE;
        return this.f25812b.j(null, null, this);
    }
}
