package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Integer f19556a;

    /* renamed from: b, reason: collision with root package name */
    public String f19557b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f19559d;

    /* renamed from: e, reason: collision with root package name */
    public int f19560e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s0 s0Var, mf.c cVar) {
        super(cVar);
        this.f19559d = s0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19558c = obj;
        this.f19560e |= Integer.MIN_VALUE;
        return this.f19559d.g(null, null, this);
    }
}
