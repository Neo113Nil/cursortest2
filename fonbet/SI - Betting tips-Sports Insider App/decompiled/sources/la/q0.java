package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19576a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f19577b;

    /* renamed from: c, reason: collision with root package name */
    public int f19578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, mf.c cVar) {
        super(cVar);
        this.f19577b = s0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19576a = obj;
        this.f19578c |= Integer.MIN_VALUE;
        return s0.d(this.f19577b, null, this);
    }
}
