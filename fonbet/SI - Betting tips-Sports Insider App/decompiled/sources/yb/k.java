package yb;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f25826b;

    /* renamed from: c, reason: collision with root package name */
    public int f25827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, mf.c cVar) {
        super(cVar);
        this.f25826b = mVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25825a = obj;
        this.f25827c |= Integer.MIN_VALUE;
        return this.f25826b.c(null, this);
    }
}
