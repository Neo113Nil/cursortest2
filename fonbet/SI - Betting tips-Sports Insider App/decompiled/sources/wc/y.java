package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f25224b;

    /* renamed from: c, reason: collision with root package name */
    public int f25225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f25224b = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25223a = obj;
        this.f25225c |= Integer.MIN_VALUE;
        return this.f25224b.c(this);
    }
}
