package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3451a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3452b;

    /* renamed from: c, reason: collision with root package name */
    public r0 f3453c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f3455e;

    /* renamed from: f, reason: collision with root package name */
    public int f3456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, mf.c cVar) {
        super(cVar);
        this.f3455e = p0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3454d = obj;
        this.f3456f |= Integer.MIN_VALUE;
        return this.f3455e.b(null, this);
    }
}
