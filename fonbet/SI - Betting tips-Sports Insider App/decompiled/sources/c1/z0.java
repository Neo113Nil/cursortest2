package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ng.c f3513a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3514b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f3516d;

    /* renamed from: e, reason: collision with root package name */
    public int f3517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, mf.c cVar) {
        super(cVar);
        this.f3516d = b1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3515c = obj;
        this.f3517e |= Integer.MIN_VALUE;
        return this.f3516d.c(null, this);
    }
}
