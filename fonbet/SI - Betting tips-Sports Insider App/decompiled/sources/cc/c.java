package cc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f3730b;

    /* renamed from: c, reason: collision with root package name */
    public int f3731c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, mf.c cVar) {
        super(cVar);
        this.f3730b = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3729a = obj;
        this.f3731c |= Integer.MIN_VALUE;
        return this.f3730b.a(this);
    }
}
