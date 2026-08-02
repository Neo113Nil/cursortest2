package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f19966a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f19968c;

    /* renamed from: d, reason: collision with root package name */
    public int f19969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, mf.c cVar) {
        super(cVar);
        this.f19968c = zVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19967b = obj;
        this.f19969d |= Integer.MIN_VALUE;
        return z.g(this.f19968c, this);
    }
}
