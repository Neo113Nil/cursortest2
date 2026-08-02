package le;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x1 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public f2 f19994a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f19996c;

    /* renamed from: d, reason: collision with root package name */
    public int f19997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(f2 f2Var, mf.c cVar) {
        super(cVar);
        this.f19996c = f2Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19995b = obj;
        this.f19997d |= Integer.MIN_VALUE;
        return f2.p(this.f19996c, this);
    }
}
