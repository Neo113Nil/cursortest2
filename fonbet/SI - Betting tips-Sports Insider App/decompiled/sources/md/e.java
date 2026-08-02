package md;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2.d f20539b;

    /* renamed from: c, reason: collision with root package name */
    public int f20540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i2.d dVar, mf.c cVar) {
        super(cVar);
        this.f20539b = dVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20538a = obj;
        this.f20540c |= Integer.MIN_VALUE;
        return this.f20539b.v(null, this);
    }
}
