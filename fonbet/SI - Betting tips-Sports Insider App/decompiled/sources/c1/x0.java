package c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public ng.a f3498a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.x f3500c;

    /* renamed from: d, reason: collision with root package name */
    public int f3501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.google.firebase.messaging.x xVar, mf.c cVar) {
        super(cVar);
        this.f3500c = xVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3499b = obj;
        this.f3501d |= Integer.MIN_VALUE;
        return this.f3500c.M(this);
    }
}
