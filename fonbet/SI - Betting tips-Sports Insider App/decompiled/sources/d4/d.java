package d4;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ng.e f8116a;

    /* renamed from: b, reason: collision with root package name */
    public int f8117b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f8119d;

    /* renamed from: e, reason: collision with root package name */
    public int f8120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, mf.c cVar) {
        super(cVar);
        this.f8119d = eVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f8118c = obj;
        this.f8120e |= Integer.MIN_VALUE;
        return this.f8119d.a(this);
    }
}
