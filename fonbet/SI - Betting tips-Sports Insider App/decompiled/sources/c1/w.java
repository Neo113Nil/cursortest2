package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public eg.r f3489a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f3491c;

    /* renamed from: d, reason: collision with root package name */
    public int f3492d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i0 i0Var, mf.c cVar) {
        super(cVar);
        this.f3491c = i0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3490b = obj;
        this.f3492d |= Integer.MIN_VALUE;
        return i0.b(this.f3491c, null, this);
    }
}
