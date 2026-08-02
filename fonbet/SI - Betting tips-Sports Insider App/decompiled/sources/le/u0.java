package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public d1 f19957a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f19959c;

    /* renamed from: d, reason: collision with root package name */
    public int f19960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(d1 d1Var, mf.c cVar) {
        super(cVar);
        this.f19959c = d1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19958b = obj;
        this.f19960d |= Integer.MIN_VALUE;
        return d1.p(this.f19959c, this);
    }
}
