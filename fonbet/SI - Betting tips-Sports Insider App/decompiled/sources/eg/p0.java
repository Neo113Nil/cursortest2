package eg;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p0 extends i1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9209e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f9210f;

    public /* synthetic */ p0(int i5, Object obj) {
        this.f9209e = i5;
        this.f9210f = obj;
    }

    @Override // eg.i1
    public final boolean k() {
        switch (this.f9209e) {
        }
        return false;
    }

    @Override // eg.i1
    public final void l(Throwable th2) {
        int i5 = this.f9209e;
        Object obj = this.f9210f;
        switch (i5) {
            case 0:
                ((o0) obj).b();
                break;
            case 1:
                ((Function1) obj).invoke(th2);
                break;
            default:
                j1 j1Var = (j1) obj;
                m1 j = j();
                j.getClass();
                Object obj2 = m1.f9202a.get(j);
                if (!(obj2 instanceof t)) {
                    gf.o oVar = gf.q.f10031a;
                    j1Var.resumeWith(c0.z(obj2));
                    break;
                } else {
                    gf.o oVar2 = gf.q.f10031a;
                    j1Var.resumeWith(h8.b.h(((t) obj2).f9223a));
                    break;
                }
        }
    }
}
