package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f25185a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f25187c;

    /* renamed from: d, reason: collision with root package name */
    public int f25188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(w0 w0Var, mf.c cVar) {
        super(cVar);
        this.f25187c = w0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25186b = obj;
        this.f25188d |= Integer.MIN_VALUE;
        return this.f25187c.j(null, this);
    }
}
