package la;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f19589b;

    /* renamed from: c, reason: collision with root package name */
    public int f19590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, mf.c cVar) {
        super(cVar);
        this.f19589b = wVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19588a = obj;
        this.f19590c |= Integer.MIN_VALUE;
        return this.f19589b.c(this);
    }
}
