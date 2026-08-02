package androidx.core.view;

import android.view.WindowInsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b2 extends a2 {

    /* renamed from: n, reason: collision with root package name */
    public g0.d f1293n;

    public b2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
        this.f1293n = null;
    }

    @Override // androidx.core.view.h2
    public k2 b() {
        return k2.h(null, this.f1286c.consumeStableInsets());
    }

    @Override // androidx.core.view.h2
    public k2 c() {
        return k2.h(null, this.f1286c.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.h2
    public final g0.d i() {
        if (this.f1293n == null) {
            WindowInsets windowInsets = this.f1286c;
            this.f1293n = g0.d.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1293n;
    }

    @Override // androidx.core.view.h2
    public boolean n() {
        return this.f1286c.isConsumed();
    }

    @Override // androidx.core.view.h2
    public void r(g0.d dVar) {
        this.f1293n = dVar;
    }
}
