package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f25043a;

    /* renamed from: b, reason: collision with root package name */
    public String f25044b;

    /* renamed from: c, reason: collision with root package name */
    public String f25045c;

    /* renamed from: d, reason: collision with root package name */
    public int f25046d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f25048f;

    /* renamed from: g, reason: collision with root package name */
    public int f25049g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, mf.c cVar2) {
        super(cVar2);
        this.f25048f = cVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25047e = obj;
        this.f25049g |= Integer.MIN_VALUE;
        return this.f25048f.a(null, null, null, this);
    }
}
