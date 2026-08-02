package m2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20180a;

    /* renamed from: b, reason: collision with root package name */
    public j f20181b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f20183d;

    /* renamed from: e, reason: collision with root package name */
    public int f20184e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f20183d = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20182c = obj;
        this.f20184e |= Integer.MIN_VALUE;
        return this.f20183d.f(false, this);
    }
}
