package md;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f20576b;

    /* renamed from: c, reason: collision with root package name */
    public int f20577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, mf.c cVar) {
        super(cVar);
        this.f20576b = oVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20575a = obj;
        this.f20577c |= Integer.MIN_VALUE;
        return this.f20576b.e(0, this);
    }
}
