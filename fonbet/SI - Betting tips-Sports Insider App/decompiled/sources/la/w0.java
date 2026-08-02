package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19604a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f19606c;

    /* renamed from: d, reason: collision with root package name */
    public int f19607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(c1 c1Var, mf.c cVar) {
        super(cVar);
        this.f19606c = c1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19605b = obj;
        this.f19607d |= Integer.MIN_VALUE;
        return this.f19606c.c(0, this);
    }
}
