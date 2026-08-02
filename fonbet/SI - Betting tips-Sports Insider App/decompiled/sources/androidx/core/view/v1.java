package androidx.core.view;

import android.view.WindowInsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class v1 extends z1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f1403c;

    public v1() {
        this.f1403c = u1.a();
    }

    @Override // androidx.core.view.z1
    public k2 b() {
        a();
        k2 h10 = k2.h(null, this.f1403c.build());
        h10.f1349a.p(this.f1420b);
        return h10;
    }

    @Override // androidx.core.view.z1
    public void d(g0.d dVar) {
        this.f1403c.setMandatorySystemGestureInsets(dVar.e());
    }

    @Override // androidx.core.view.z1
    public void e(g0.d dVar) {
        this.f1403c.setStableInsets(dVar.e());
    }

    @Override // androidx.core.view.z1
    public void f(g0.d dVar) {
        this.f1403c.setSystemGestureInsets(dVar.e());
    }

    @Override // androidx.core.view.z1
    public void g(g0.d dVar) {
        this.f1403c.setSystemWindowInsets(dVar.e());
    }

    @Override // androidx.core.view.z1
    public void h(g0.d dVar) {
        this.f1403c.setTappableElementInsets(dVar.e());
    }

    public v1(k2 k2Var) {
        super(k2Var);
        WindowInsets.Builder a7;
        WindowInsets g10 = k2Var.g();
        if (g10 != null) {
            a7 = u1.b(g10);
        } else {
            a7 = u1.a();
        }
        this.f1403c = a7;
    }
}
