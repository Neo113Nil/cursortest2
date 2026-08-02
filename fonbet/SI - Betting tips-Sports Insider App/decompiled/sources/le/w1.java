package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.a f19985a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f19986b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2 f19988d;

    /* renamed from: e, reason: collision with root package name */
    public int f19989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(f2 f2Var, mf.c cVar) {
        super(cVar);
        this.f19988d = f2Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19987c = obj;
        this.f19989e |= Integer.MIN_VALUE;
        return this.f19988d.v(null, null, this);
    }
}
