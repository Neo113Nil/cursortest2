package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f25149b;

    /* renamed from: c, reason: collision with root package name */
    public int f25150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(w0 w0Var, mf.c cVar) {
        super(cVar);
        this.f25149b = w0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25148a = obj;
        this.f25150c |= Integer.MIN_VALUE;
        return this.f25149b.e(this);
    }
}
