package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f25183b;

    /* renamed from: c, reason: collision with root package name */
    public int f25184c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, mf.c cVar) {
        super(cVar);
        this.f25183b = vVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25182a = obj;
        this.f25184c |= Integer.MIN_VALUE;
        return this.f25183b.r(this);
    }
}
