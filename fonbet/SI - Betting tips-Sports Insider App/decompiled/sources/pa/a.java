package pa;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f21565a;

    /* renamed from: b, reason: collision with root package name */
    public String f21566b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na.b f21568d;

    /* renamed from: e, reason: collision with root package name */
    public int f21569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(na.b bVar, mf.c cVar) {
        super(cVar);
        this.f21568d = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21567c = obj;
        this.f21569e |= Integer.MIN_VALUE;
        return this.f21568d.q0(null, null, null, null, this);
    }
}
