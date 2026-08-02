package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3504a;

    /* renamed from: b, reason: collision with root package name */
    public ng.c f3505b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f3507d;

    /* renamed from: e, reason: collision with root package name */
    public int f3508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(b1 b1Var, mf.c cVar) {
        super(cVar);
        this.f3507d = b1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3506c = obj;
        this.f3508e |= Integer.MIN_VALUE;
        return this.f3507d.b(null, this);
    }
}
