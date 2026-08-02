package i4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public j f10987a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f10989c;

    /* renamed from: d, reason: collision with root package name */
    public int f10990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, mf.c cVar) {
        super(cVar);
        this.f10989c = lVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10988b = obj;
        this.f10990d |= Integer.MIN_VALUE;
        return this.f10989c.a(this);
    }
}
