package androidx.core.view;

import android.view.WindowInsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d2 extends c2 {

    /* renamed from: o, reason: collision with root package name */
    public g0.d f1302o;

    /* renamed from: p, reason: collision with root package name */
    public g0.d f1303p;
    public g0.d q;

    public d2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
        this.f1302o = null;
        this.f1303p = null;
        this.q = null;
    }

    @Override // androidx.core.view.h2
    public g0.d h() {
        if (this.f1303p == null) {
            this.f1303p = g0.d.d(this.f1286c.getMandatorySystemGestureInsets());
        }
        return this.f1303p;
    }

    @Override // androidx.core.view.h2
    public g0.d j() {
        if (this.f1302o == null) {
            this.f1302o = g0.d.d(this.f1286c.getSystemGestureInsets());
        }
        return this.f1302o;
    }

    @Override // androidx.core.view.h2
    public g0.d l() {
        if (this.q == null) {
            this.q = g0.d.d(this.f1286c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // androidx.core.view.a2, androidx.core.view.h2
    public k2 m(int i5, int i10, int i11, int i12) {
        return k2.h(null, this.f1286c.inset(i5, i10, i11, i12));
    }

    @Override // androidx.core.view.b2, androidx.core.view.h2
    public void r(g0.d dVar) {
    }
}
