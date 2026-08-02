package m2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public k2.b0 f20296a;

    /* renamed from: b, reason: collision with root package name */
    public j f20297b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f20299d;

    /* renamed from: e, reason: collision with root package name */
    public int f20300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f20299d = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20298c = obj;
        this.f20300e |= Integer.MIN_VALUE;
        return this.f20299d.e(null, this);
    }
}
