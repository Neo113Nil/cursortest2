package m4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public e4.g f20400a;

    /* renamed from: b, reason: collision with root package name */
    public r f20401b;

    /* renamed from: c, reason: collision with root package name */
    public r f20402c;

    /* renamed from: d, reason: collision with root package name */
    public h9.c f20403d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f20404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f20405f;

    /* renamed from: g, reason: collision with root package name */
    public int f20406g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, mf.c cVar) {
        super(cVar);
        this.f20405f = oVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20404e = obj;
        this.f20406g |= Integer.MIN_VALUE;
        return o.c(this.f20405f, null, null, null, this);
    }
}
