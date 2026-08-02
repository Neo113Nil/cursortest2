package sc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public long f23437a;

    /* renamed from: b, reason: collision with root package name */
    public long f23438b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23439c;

    /* renamed from: d, reason: collision with root package name */
    public ha.a f23440d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f23442f;

    /* renamed from: g, reason: collision with root package name */
    public int f23443g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, mf.c cVar) {
        super(cVar);
        this.f23442f = hVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23441e = obj;
        this.f23443g |= Integer.MIN_VALUE;
        return this.f23442f.d(this);
    }
}
