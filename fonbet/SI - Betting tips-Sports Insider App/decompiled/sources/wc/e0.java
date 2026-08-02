package wc;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f25081a;

    /* renamed from: b, reason: collision with root package name */
    public int f25082b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f25084d;

    /* renamed from: e, reason: collision with root package name */
    public int f25085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(j0 j0Var, mf.c cVar) {
        super(cVar);
        this.f25084d = j0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f25083c = obj;
        this.f25085e |= Integer.MIN_VALUE;
        return this.f25084d.o(0, this);
    }
}
