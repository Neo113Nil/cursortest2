package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19494a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f19496c;

    /* renamed from: d, reason: collision with root package name */
    public int f19497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, mf.c cVar) {
        super(cVar);
        this.f19496c = m0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19495b = obj;
        this.f19497d |= Integer.MIN_VALUE;
        return this.f19496c.e(0, this);
    }
}
