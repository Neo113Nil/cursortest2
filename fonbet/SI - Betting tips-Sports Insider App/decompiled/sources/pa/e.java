package pa;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f21581a;

    /* renamed from: b, reason: collision with root package name */
    public String f21582b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f21583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na.b f21584d;

    /* renamed from: e, reason: collision with root package name */
    public int f21585e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(na.b bVar, mf.c cVar) {
        super(cVar);
        this.f21584d = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21583c = obj;
        this.f21585e |= Integer.MIN_VALUE;
        return this.f21584d.C0(null, null, null, null, this);
    }
}
