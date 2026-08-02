package tc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id.c f23852b;

    /* renamed from: c, reason: collision with root package name */
    public int f23853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(id.c cVar, mf.c cVar2) {
        super(cVar2);
        this.f23852b = cVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23851a = obj;
        this.f23853c |= Integer.MIN_VALUE;
        return this.f23852b.e(this);
    }
}
