package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.a f19934a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f19935b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19936c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f19937d;

    /* renamed from: e, reason: collision with root package name */
    public int f19938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(d1 d1Var, mf.c cVar) {
        super(cVar);
        this.f19937d = d1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19936c = obj;
        this.f19938e |= Integer.MIN_VALUE;
        return d1.o(this.f19937d, null, this);
    }
}
