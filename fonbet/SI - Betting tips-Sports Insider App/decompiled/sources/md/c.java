package md;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public String f20531a;

    /* renamed from: b, reason: collision with root package name */
    public int f20532b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f20534d;

    /* renamed from: e, reason: collision with root package name */
    public int f20535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, mf.c cVar) {
        super(cVar);
        this.f20534d = dVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f20533c = obj;
        this.f20535e |= Integer.MIN_VALUE;
        return this.f20534d.b(null, 0, null, this);
    }
}
