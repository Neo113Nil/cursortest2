package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ic.a f19917a;

    /* renamed from: b, reason: collision with root package name */
    public ic.a f19918b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f19920d;

    /* renamed from: e, reason: collision with root package name */
    public int f19921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z zVar, mf.c cVar) {
        super(cVar);
        this.f19920d = zVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19919c = obj;
        this.f19921e |= Integer.MIN_VALUE;
        return z.e(this.f19920d, null, this);
    }
}
