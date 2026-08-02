package k2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public x5.h f18720a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f18722c;

    /* renamed from: d, reason: collision with root package name */
    public int f18723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, mf.c cVar) {
        super(cVar);
        this.f18722c = o0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f18721b = obj;
        this.f18723d |= Integer.MIN_VALUE;
        return this.f18722c.f(this);
    }
}
