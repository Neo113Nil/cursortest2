package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ng.c f3485a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f3487c;

    /* renamed from: d, reason: collision with root package name */
    public int f3488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i0 i0Var, mf.c cVar) {
        super(cVar);
        this.f3487c = i0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3486b = obj;
        this.f3488d |= Integer.MIN_VALUE;
        return i0.a(this.f3487c, this);
    }
}
