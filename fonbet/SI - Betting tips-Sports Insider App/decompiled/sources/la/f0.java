package la;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends mf.c {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f19466a;

    /* renamed from: b, reason: collision with root package name */
    public int f19467b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f19469d;

    /* renamed from: e, reason: collision with root package name */
    public int f19470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, mf.c cVar) {
        super(cVar);
        this.f19469d = g0Var;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        this.f19468c = obj;
        this.f19470e |= Integer.MIN_VALUE;
        return g0.a(this.f19469d, null, this);
    }
}
