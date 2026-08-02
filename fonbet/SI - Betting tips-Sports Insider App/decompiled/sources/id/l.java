package id;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y8.d f11180b;

    /* renamed from: c, reason: collision with root package name */
    public int f11181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y8.d dVar, mf.c cVar) {
        super(cVar);
        this.f11180b = dVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11179a = obj;
        this.f11181c |= Integer.MIN_VALUE;
        return this.f11180b.f(0, this);
    }
}
