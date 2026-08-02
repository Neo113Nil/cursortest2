package androidx.lifecycle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2181b;

    /* renamed from: c, reason: collision with root package name */
    public int f2182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, mf.c cVar) {
        super(cVar);
        this.f2181b = iVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f2180a = obj;
        this.f2182c |= Integer.MIN_VALUE;
        return this.f2181b.k(this);
    }
}
