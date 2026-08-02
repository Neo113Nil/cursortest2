package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f19614a;

    /* renamed from: b, reason: collision with root package name */
    public String f19615b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f19617d;

    /* renamed from: e, reason: collision with root package name */
    public int f19618e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(c1 c1Var, mf.c cVar) {
        super(cVar);
        this.f19617d = c1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19616c = obj;
        this.f19618e |= Integer.MIN_VALUE;
        return this.f19617d.d(this);
    }
}
