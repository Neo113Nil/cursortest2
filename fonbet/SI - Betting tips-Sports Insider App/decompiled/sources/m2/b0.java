package m2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f20185a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f20186b;

    /* renamed from: c, reason: collision with root package name */
    public int f20187c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f20188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f20189e;

    /* renamed from: f, reason: collision with root package name */
    public int f20190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f20189e = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20188d = obj;
        this.f20190f |= Integer.MIN_VALUE;
        return this.f20189e.g(null, null, this);
    }
}
