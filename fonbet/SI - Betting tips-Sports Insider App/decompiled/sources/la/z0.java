package la;

import kotlin.Pair;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public int f19635a;

    /* renamed from: b, reason: collision with root package name */
    public Pair f19636b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f19638d;

    /* renamed from: e, reason: collision with root package name */
    public int f19639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c1 c1Var, mf.c cVar) {
        super(cVar);
        this.f19638d = c1Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19637c = obj;
        this.f19639e |= Integer.MIN_VALUE;
        return this.f19638d.f(0, null, null, null, null, this);
    }
}
