package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f25157a;

    /* renamed from: b, reason: collision with root package name */
    public int f25158b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25159c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f25160d;

    /* renamed from: e, reason: collision with root package name */
    public int f25161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, mf.c cVar) {
        super(cVar);
        this.f25160d = vVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25159c = obj;
        this.f25161e |= Integer.MIN_VALUE;
        return this.f25160d.o(0, this);
    }
}
