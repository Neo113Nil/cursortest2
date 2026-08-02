package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f25209b;

    /* renamed from: c, reason: collision with root package name */
    public int f25210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(w0 w0Var, mf.c cVar) {
        super(cVar);
        this.f25209b = w0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25208a = obj;
        this.f25210c |= Integer.MIN_VALUE;
        return this.f25209b.m(this);
    }
}
