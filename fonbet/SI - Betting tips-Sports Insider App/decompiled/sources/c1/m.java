package c1;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f3422a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3423b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3424c;

    /* renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f3425d;

    /* renamed from: e, reason: collision with root package name */
    public i0 f3426e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f3428g;

    /* renamed from: h, reason: collision with root package name */
    public int f3429h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, mf.c cVar) {
        super(cVar);
        this.f3428g = nVar;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f3427f = obj;
        this.f3429h |= Integer.MIN_VALUE;
        return this.f3428g.a(null, this);
    }
}
