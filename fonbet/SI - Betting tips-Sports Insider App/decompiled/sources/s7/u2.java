package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u2 extends k {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y2 f23122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(y2 y2Var, f1 f1Var, int i5) {
        super(f1Var);
        this.f23121e = i5;
        this.f23122f = y2Var;
    }

    @Override // s7.k
    public final void a() {
        switch (this.f23121e) {
            case 0:
                y2 y2Var = this.f23122f;
                y2Var.j();
                if (y2Var.A()) {
                    n0 n0Var = ((f1) y2Var.f3328a).f22745f;
                    f1.m(n0Var);
                    n0Var.f22910n.a("Inactivity, disconnecting from the service");
                    y2Var.r();
                    break;
                }
                break;
            default:
                n0 n0Var2 = ((f1) this.f23122f.f3328a).f22745f;
                f1.m(n0Var2);
                n0Var2.f22906i.a("Tasks have been queued for a long time");
                break;
        }
    }
}
