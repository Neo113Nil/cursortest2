package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19619a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19620b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f19621c;

    /* renamed from: d, reason: collision with root package name */
    public int f19622d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, mf.c cVar) {
        super(cVar);
        this.f19621c = c0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19620b = obj;
        this.f19622d |= Integer.MIN_VALUE;
        return this.f19621c.M0(false, this);
    }
}
