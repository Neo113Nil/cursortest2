package m2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20272b;

    /* renamed from: c, reason: collision with root package name */
    public int f20273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, mf.c cVar) {
        super(cVar);
        this.f20272b = wVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20271a = obj;
        this.f20273c |= Integer.MIN_VALUE;
        return this.f20272b.a(this);
    }
}
