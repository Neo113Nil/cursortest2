package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f25143b;

    /* renamed from: c, reason: collision with root package name */
    public int f25144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(w0 w0Var, mf.c cVar) {
        super(cVar);
        this.f25143b = w0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25142a = obj;
        this.f25144c |= Integer.MIN_VALUE;
        return this.f25143b.d(this);
    }
}
