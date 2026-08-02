package r3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f22221b;

    /* renamed from: c, reason: collision with root package name */
    public int f22222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, mf.c cVar) {
        super(cVar);
        this.f22221b = e0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22220a = obj;
        this.f22222c |= Integer.MIN_VALUE;
        return this.f22221b.G(null, null, this);
    }
}
