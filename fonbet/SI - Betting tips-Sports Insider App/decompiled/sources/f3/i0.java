package f3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f9374b;

    /* renamed from: c, reason: collision with root package name */
    public int f9375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, mf.c cVar) {
        super(cVar);
        this.f9374b = j0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f9373a = obj;
        this.f9375c |= Integer.MIN_VALUE;
        return j0.a(this.f9374b, this);
    }
}
