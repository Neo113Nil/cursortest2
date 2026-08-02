package cc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3749b;

    /* renamed from: c, reason: collision with root package name */
    public int f3750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, mf.c cVar) {
        super(cVar);
        this.f3749b = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3748a = obj;
        this.f3750c |= Integer.MIN_VALUE;
        return this.f3749b.g(this);
    }
}
