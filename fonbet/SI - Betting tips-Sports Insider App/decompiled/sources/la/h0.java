package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19477a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19478b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f19480d;

    /* renamed from: e, reason: collision with root package name */
    public int f19481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(m0 m0Var, mf.c cVar) {
        super(cVar);
        this.f19480d = m0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19479c = obj;
        this.f19481e |= Integer.MIN_VALUE;
        return this.f19480d.b(0, this);
    }
}
