package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3509a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f3511c;

    /* renamed from: d, reason: collision with root package name */
    public int f3512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i0 i0Var, mf.c cVar) {
        super(cVar);
        this.f3511c = i0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3510b = obj;
        this.f3512d |= Integer.MIN_VALUE;
        return i0.d(this.f3511c, this);
    }
}
