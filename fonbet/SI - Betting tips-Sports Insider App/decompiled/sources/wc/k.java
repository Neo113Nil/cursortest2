package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.x f25128b;

    /* renamed from: c, reason: collision with root package name */
    public int f25129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.google.firebase.messaging.x xVar, mf.c cVar) {
        super(cVar);
        this.f25128b = xVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25127a = obj;
        this.f25129c |= Integer.MIN_VALUE;
        return this.f25128b.n(this);
    }
}
