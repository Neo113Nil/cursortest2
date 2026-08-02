package e1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f8458b;

    /* renamed from: c, reason: collision with root package name */
    public int f8459c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, mf.c cVar) {
        super(cVar);
        this.f8458b = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8457a = obj;
        this.f8459c |= Integer.MIN_VALUE;
        return this.f8458b.a(null, this);
    }
}
