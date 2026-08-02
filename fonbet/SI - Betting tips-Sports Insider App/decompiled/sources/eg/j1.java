package eg;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j1 extends l {

    /* renamed from: i, reason: collision with root package name */
    public final m1 f9182i;

    public j1(Continuation continuation, m1 m1Var) {
        super(1, continuation);
        this.f9182i = m1Var;
    }

    @Override // eg.l
    public final Throwable q(m1 m1Var) {
        Throwable b10;
        m1 m1Var2 = this.f9182i;
        m1Var2.getClass();
        Object obj = m1.f9202a.get(m1Var2);
        return (!(obj instanceof l1) || (b10 = ((l1) obj).b()) == null) ? obj instanceof t ? ((t) obj).f9223a : m1Var.y() : b10;
    }

    @Override // eg.l
    public final String z() {
        return "AwaitContinuation";
    }
}
