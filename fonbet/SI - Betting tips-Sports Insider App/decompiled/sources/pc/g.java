package pc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f21633b;

    /* renamed from: c, reason: collision with root package name */
    public int f21634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u uVar, mf.c cVar) {
        super(cVar);
        this.f21633b = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21632a = obj;
        this.f21634c |= Integer.MIN_VALUE;
        return this.f21633b.p(null, this);
    }
}
