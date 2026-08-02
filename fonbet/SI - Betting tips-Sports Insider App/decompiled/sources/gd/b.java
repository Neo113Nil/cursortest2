package gd;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9955b;

    /* renamed from: c, reason: collision with root package name */
    public int f9956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, mf.c cVar2) {
        super(cVar2);
        this.f9955b = cVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f9954a = obj;
        this.f9956c |= Integer.MIN_VALUE;
        return c.a(this.f9955b, this);
    }
}
