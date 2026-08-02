package pc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f21692b;

    /* renamed from: c, reason: collision with root package name */
    public int f21693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, mf.c cVar) {
        super(cVar);
        this.f21692b = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21691a = obj;
        this.f21693c |= Integer.MIN_VALUE;
        return u.h(this.f21692b, null, this);
    }
}
