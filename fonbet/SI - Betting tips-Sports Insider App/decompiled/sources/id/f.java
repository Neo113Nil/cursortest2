package id;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11151a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.a f11152b;

    /* renamed from: c, reason: collision with root package name */
    public int f11153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l1.a aVar, mf.c cVar) {
        super(cVar);
        this.f11152b = aVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11151a = obj;
        this.f11153c |= Integer.MIN_VALUE;
        return this.f11152b.s(null, this);
    }
}
