package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f25199a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f25201c;

    /* renamed from: d, reason: collision with root package name */
    public int f25202d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, mf.c cVar) {
        super(cVar);
        this.f25201c = w0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25200b = obj;
        this.f25202d |= Integer.MIN_VALUE;
        return this.f25201c.l(null, this);
    }
}
