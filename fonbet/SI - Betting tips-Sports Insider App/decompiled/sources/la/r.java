package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f19580b;

    /* renamed from: c, reason: collision with root package name */
    public int f19581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, mf.c cVar) {
        super(cVar);
        this.f19580b = wVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19579a = obj;
        this.f19581c |= Integer.MIN_VALUE;
        return w.a(this.f19580b, this);
    }
}
