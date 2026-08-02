package ya;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f25774a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f25776c;

    /* renamed from: d, reason: collision with root package name */
    public int f25777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, mf.c cVar) {
        super(cVar);
        this.f25776c = eVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25775b = obj;
        this.f25777d |= Integer.MIN_VALUE;
        return this.f25776c.r0(null, null, null, this);
    }
}
