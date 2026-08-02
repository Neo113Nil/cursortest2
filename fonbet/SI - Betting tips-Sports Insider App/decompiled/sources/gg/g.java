package gg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10062b;

    /* renamed from: c, reason: collision with root package name */
    public int f10063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, mf.c cVar) {
        super(cVar);
        this.f10062b = hVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10061a = obj;
        this.f10063c |= Integer.MIN_VALUE;
        Object D = this.f10062b.D(null, 0, 0L, this);
        return D == lf.a.f20034a ? D : new o(D);
    }
}
