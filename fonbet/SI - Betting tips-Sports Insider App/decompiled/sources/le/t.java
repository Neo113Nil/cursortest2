package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public z f19940a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f19942c;

    /* renamed from: d, reason: collision with root package name */
    public int f19943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, mf.c cVar) {
        super(cVar);
        this.f19942c = zVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19941b = obj;
        this.f19943d |= Integer.MIN_VALUE;
        return z.f(this.f19942c, this);
    }
}
