package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.a f19973a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f19974b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f19976d;

    /* renamed from: e, reason: collision with root package name */
    public int f19977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(f2 f2Var, mf.c cVar) {
        super(cVar);
        this.f19976d = f2Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19975c = obj;
        this.f19977e |= Integer.MIN_VALUE;
        return f2.o(this.f19976d, null, this);
    }
}
