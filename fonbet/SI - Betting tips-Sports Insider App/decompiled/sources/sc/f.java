package sc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f23445b;

    /* renamed from: c, reason: collision with root package name */
    public int f23446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, mf.c cVar) {
        super(cVar);
        this.f23445b = hVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23444a = obj;
        this.f23446c |= Integer.MIN_VALUE;
        return this.f23445b.e(this);
    }
}
