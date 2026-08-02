package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f25058a;

    /* renamed from: b, reason: collision with root package name */
    public String f25059b;

    /* renamed from: c, reason: collision with root package name */
    public int f25060c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f25061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f25062e;

    /* renamed from: f, reason: collision with root package name */
    public int f25063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, mf.c cVar2) {
        super(cVar2);
        this.f25062e = cVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25061d = obj;
        this.f25063f |= Integer.MIN_VALUE;
        return this.f25062e.b(null, null, this);
    }
}
