package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.h0 f25165a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f25166b;

    /* renamed from: c, reason: collision with root package name */
    public int f25167c;

    /* renamed from: d, reason: collision with root package name */
    public int f25168d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f25170f;

    /* renamed from: g, reason: collision with root package name */
    public int f25171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar, mf.c cVar) {
        super(cVar);
        this.f25170f = vVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25169e = obj;
        this.f25171g |= Integer.MIN_VALUE;
        return this.f25170f.p(null, null, 0, this);
    }
}
