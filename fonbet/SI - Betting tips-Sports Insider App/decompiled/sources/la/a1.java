package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19413a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f19415c;

    /* renamed from: d, reason: collision with root package name */
    public int f19416d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var, mf.c cVar) {
        super(cVar);
        this.f19415c = c1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19414b = obj;
        this.f19416d |= Integer.MIN_VALUE;
        return this.f19415c.g(0, this);
    }
}
