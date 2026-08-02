package pc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f21613a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21615c;

    /* renamed from: d, reason: collision with root package name */
    public int f21616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, mf.c cVar) {
        super(cVar);
        this.f21615c = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21614b = obj;
        this.f21616d |= Integer.MIN_VALUE;
        return this.f21615c.j(this);
    }
}
