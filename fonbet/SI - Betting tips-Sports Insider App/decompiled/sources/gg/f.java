package gg;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f10058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10059b;

    /* renamed from: c, reason: collision with root package name */
    public int f10060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, mf.c cVar) {
        super(cVar);
        this.f10059b = hVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f10058a = obj;
        this.f10060c |= Integer.MIN_VALUE;
        Object C = h.C(this.f10059b, this);
        return C == lf.a.f20034a ? C : new o(C);
    }
}
