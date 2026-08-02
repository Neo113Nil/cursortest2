package mg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public e f20719a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f20721c;

    /* renamed from: d, reason: collision with root package name */
    public int f20722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, mf.c cVar) {
        super(cVar);
        this.f20721c = eVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20720b = obj;
        this.f20722d |= Integer.MIN_VALUE;
        return this.f20721c.d(this);
    }
}
