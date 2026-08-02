package tc;

import s7.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f23838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f23839b;

    /* renamed from: c, reason: collision with root package name */
    public int f23840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t tVar, mf.c cVar) {
        super(cVar);
        this.f23839b = tVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f23838a = obj;
        this.f23840c |= Integer.MIN_VALUE;
        return this.f23839b.e(this);
    }
}
