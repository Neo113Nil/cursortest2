package jd;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public long f18444a;

    /* renamed from: b, reason: collision with root package name */
    public String f18445b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y8.d f18447d;

    /* renamed from: e, reason: collision with root package name */
    public int f18448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y8.d dVar, mf.c cVar) {
        super(cVar);
        this.f18447d = dVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f18446c = obj;
        this.f18448e |= Integer.MIN_VALUE;
        return this.f18447d.j(0L, this);
    }
}
