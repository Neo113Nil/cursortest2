package ya;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f25778a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f25779b;

    /* renamed from: c, reason: collision with root package name */
    public e f25780c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f25782e;

    /* renamed from: f, reason: collision with root package name */
    public int f25783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, mf.c cVar) {
        super(cVar);
        this.f25782e = eVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25781d = obj;
        this.f25783f |= Integer.MIN_VALUE;
        return this.f25782e.s0(null, null, null, null, this);
    }
}
