package androidx.appcompat.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q0 extends j2 {
    public final /* synthetic */ x0 j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z0 f889k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(z0 z0Var, z0 z0Var2, x0 x0Var) {
        super(z0Var2);
        this.f889k = z0Var;
        this.j = x0Var;
    }

    @Override // androidx.appcompat.widget.j2
    public final androidx.appcompat.view.menu.d0 b() {
        return this.j;
    }

    @Override // androidx.appcompat.widget.j2
    public final boolean c() {
        z0 z0Var = this.f889k;
        if (z0Var.getInternalPopup().a()) {
            return true;
        }
        z0Var.f1030f.k(z0Var.getTextDirection(), z0Var.getTextAlignment());
        return true;
    }
}
