package id;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f11182a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11183b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11184c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f11185d;

    /* renamed from: e, reason: collision with root package name */
    public int f11186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x xVar, mf.c cVar) {
        super(cVar);
        this.f11185d = xVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f11184c = obj;
        this.f11186e |= Integer.MIN_VALUE;
        return this.f11185d.b(0, this);
    }
}
