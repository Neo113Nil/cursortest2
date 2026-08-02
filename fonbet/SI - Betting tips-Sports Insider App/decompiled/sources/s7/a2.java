package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f22639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22640c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2 f22642e;

    public /* synthetic */ a2(e2 e2Var, q1 q1Var, long j, boolean z5, int i5) {
        this.f22638a = i5;
        this.f22639b = q1Var;
        this.f22640c = j;
        this.f22641d = z5;
        this.f22642e = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22638a) {
            case 0:
                e2 e2Var = this.f22642e;
                q1 q1Var = this.f22639b;
                e2Var.n(q1Var);
                e2Var.z(q1Var, this.f22640c, this.f22641d);
                break;
            default:
                e2 e2Var2 = this.f22642e;
                q1 q1Var2 = this.f22639b;
                e2Var2.n(q1Var2);
                e2Var2.z(q1Var2, this.f22640c, this.f22641d);
                break;
        }
    }
}
