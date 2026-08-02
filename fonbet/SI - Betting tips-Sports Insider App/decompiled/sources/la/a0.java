package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f19411b;

    /* renamed from: c, reason: collision with root package name */
    public int f19412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, mf.c cVar) {
        super(cVar);
        this.f19411b = c0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19410a = obj;
        this.f19412c |= Integer.MIN_VALUE;
        return this.f19411b.Q0(null, 0, null, null, this);
    }
}
