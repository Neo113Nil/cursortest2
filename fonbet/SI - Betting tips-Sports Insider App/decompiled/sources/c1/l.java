package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.x f3418b;

    /* renamed from: c, reason: collision with root package name */
    public int f3419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.google.firebase.messaging.x xVar, mf.c cVar) {
        super(cVar);
        this.f3418b = xVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3417a = obj;
        this.f3419c |= Integer.MIN_VALUE;
        return this.f3418b.p(this);
    }
}
