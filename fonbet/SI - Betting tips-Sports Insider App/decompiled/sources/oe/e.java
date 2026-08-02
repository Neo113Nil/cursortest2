package oe;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f21177b;

    /* renamed from: c, reason: collision with root package name */
    public int f21178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, mf.c cVar) {
        super(cVar);
        this.f21177b = gVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f21176a = obj;
        this.f21178c |= Integer.MIN_VALUE;
        return this.f21177b.g(null, this);
    }
}
