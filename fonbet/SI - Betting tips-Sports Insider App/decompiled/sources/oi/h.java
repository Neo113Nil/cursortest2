package oi;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21263a;

    /* renamed from: b, reason: collision with root package name */
    public final j f21264b;

    public /* synthetic */ h(j jVar, int i5) {
        this.f21263a = i5;
        this.f21264b = jVar;
    }

    @Override // oi.g
    public final void b(d dVar, Throwable th2) {
        switch (this.f21263a) {
            case 0:
                this.f21264b.completeExceptionally(th2);
                break;
            default:
                this.f21264b.completeExceptionally(th2);
                break;
        }
    }

    @Override // oi.g
    public final void d(d dVar, s0 s0Var) {
        switch (this.f21263a) {
            case 0:
                boolean z5 = s0Var.f21334a.f10287p;
                j jVar = this.f21264b;
                if (!z5) {
                    jVar.completeExceptionally(new q(s0Var));
                    break;
                } else {
                    jVar.complete(s0Var.f21335b);
                    break;
                }
            default:
                this.f21264b.complete(s0Var);
                break;
        }
    }
}
