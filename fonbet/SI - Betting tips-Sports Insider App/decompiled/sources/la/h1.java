package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ka.b f19482a;

    /* renamed from: b, reason: collision with root package name */
    public int f19483b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f19485d;

    /* renamed from: e, reason: collision with root package name */
    public int f19486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, mf.c cVar) {
        super(cVar);
        this.f19485d = j1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19484c = obj;
        this.f19486e |= Integer.MIN_VALUE;
        return this.f19485d.d(this);
    }
}
