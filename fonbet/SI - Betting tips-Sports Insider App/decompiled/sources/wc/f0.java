package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.h0 f25089a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f25090b;

    /* renamed from: c, reason: collision with root package name */
    public int f25091c;

    /* renamed from: d, reason: collision with root package name */
    public int f25092d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f25094f;

    /* renamed from: g, reason: collision with root package name */
    public int f25095g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, mf.c cVar) {
        super(cVar);
        this.f25094f = j0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25093e = obj;
        this.f25095g |= Integer.MIN_VALUE;
        return this.f25094f.p(null, null, 0, this);
    }
}
