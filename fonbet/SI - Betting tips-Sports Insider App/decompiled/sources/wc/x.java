package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f25215b;

    /* renamed from: c, reason: collision with root package name */
    public int f25216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f25215b = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25214a = obj;
        this.f25216c |= Integer.MIN_VALUE;
        return this.f25215b.a(this);
    }
}
