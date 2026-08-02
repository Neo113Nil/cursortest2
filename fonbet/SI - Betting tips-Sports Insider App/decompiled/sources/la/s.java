package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f19586b;

    /* renamed from: c, reason: collision with root package name */
    public int f19587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, mf.c cVar) {
        super(cVar);
        this.f19586b = wVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19585a = obj;
        this.f19587c |= Integer.MIN_VALUE;
        return this.f19586b.b(this);
    }
}
