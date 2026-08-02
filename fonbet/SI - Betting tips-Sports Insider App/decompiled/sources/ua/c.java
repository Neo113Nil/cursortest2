package ua;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f24135a;

    /* renamed from: b, reason: collision with root package name */
    public String f24136b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f24138d;

    /* renamed from: e, reason: collision with root package name */
    public int f24139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, mf.c cVar) {
        super(cVar);
        this.f24138d = fVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f24137c = obj;
        this.f24139e |= Integer.MIN_VALUE;
        return this.f24138d.s0(null, null, null, null, this);
    }
}
