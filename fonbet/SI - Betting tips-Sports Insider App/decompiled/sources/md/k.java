package md;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f20560b;

    /* renamed from: c, reason: collision with root package name */
    public int f20561c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, mf.c cVar) {
        super(cVar);
        this.f20560b = mVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20559a = obj;
        this.f20561c |= Integer.MIN_VALUE;
        return this.f20560b.j(0, this);
    }
}
