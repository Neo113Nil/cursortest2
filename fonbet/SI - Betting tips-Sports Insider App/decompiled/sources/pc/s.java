package pc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f21695b;

    /* renamed from: c, reason: collision with root package name */
    public int f21696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, mf.c cVar) {
        super(cVar);
        this.f21695b = uVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21694a = obj;
        this.f21696c |= Integer.MIN_VALUE;
        return u.i(this.f21695b, null, false, this);
    }
}
