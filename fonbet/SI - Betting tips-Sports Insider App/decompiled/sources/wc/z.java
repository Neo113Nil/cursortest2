package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f25232b;

    /* renamed from: c, reason: collision with root package name */
    public int f25233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d0 d0Var, mf.c cVar) {
        super(cVar);
        this.f25232b = d0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25231a = obj;
        this.f25233c |= Integer.MIN_VALUE;
        return this.f25232b.d(this);
    }
}
