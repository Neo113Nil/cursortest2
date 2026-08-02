package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.a f19944a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f19945b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f19947d;

    /* renamed from: e, reason: collision with root package name */
    public int f19948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(d1 d1Var, mf.c cVar) {
        super(cVar);
        this.f19947d = d1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19946c = obj;
        this.f19948e |= Integer.MIN_VALUE;
        return this.f19947d.v(null, null, this);
    }
}
