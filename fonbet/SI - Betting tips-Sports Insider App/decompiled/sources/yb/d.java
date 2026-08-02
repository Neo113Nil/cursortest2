package yb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f25803b;

    /* renamed from: c, reason: collision with root package name */
    public int f25804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, mf.c cVar) {
        super(cVar);
        this.f25803b = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25802a = obj;
        this.f25804c |= Integer.MIN_VALUE;
        return this.f25803b.g(null, this);
    }
}
