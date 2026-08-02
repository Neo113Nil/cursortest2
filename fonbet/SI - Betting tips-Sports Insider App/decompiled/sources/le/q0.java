package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.a f19911a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f19912b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f19914d;

    /* renamed from: e, reason: collision with root package name */
    public int f19915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(d1 d1Var, mf.c cVar) {
        super(cVar);
        this.f19914d = d1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19913c = obj;
        this.f19915e |= Integer.MIN_VALUE;
        return this.f19914d.t(null, null, this);
    }
}
