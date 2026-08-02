package rc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m7.b f22447b;

    /* renamed from: c, reason: collision with root package name */
    public int f22448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(m7.b bVar, mf.c cVar) {
        super(cVar);
        this.f22447b = bVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f22446a = obj;
        this.f22448c |= Integer.MIN_VALUE;
        return this.f22447b.e(this);
    }
}
