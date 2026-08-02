package s7;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22954a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f22956c;

    public q(r rVar, long j) {
        this.f22955b = j;
        Objects.requireNonNull(rVar);
        this.f22956c = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22954a) {
            case 0:
                ((r) this.f22956c).p(this.f22955b);
                break;
            default:
                o2 o2Var = (o2) this.f22956c;
                r rVar = ((f1) o2Var.f3328a).f22752n;
                f1.j(rVar);
                rVar.m(this.f22955b);
                o2Var.f22931e = null;
                break;
        }
    }

    public q(o2 o2Var, long j) {
        this.f22955b = j;
        Objects.requireNonNull(o2Var);
        this.f22956c = o2Var;
    }
}
