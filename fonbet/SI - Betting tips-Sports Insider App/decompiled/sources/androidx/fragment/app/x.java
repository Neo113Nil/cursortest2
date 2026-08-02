package androidx.fragment.app;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f2108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2109b;

    public x(y yVar, s0 s0Var) {
        this.f2109b = yVar;
        this.f2108a = s0Var;
    }

    @Override // androidx.fragment.app.s0
    public final View e(int i5) {
        s0 s0Var = this.f2108a;
        return s0Var.k() ? s0Var.e(i5) : this.f2109b.onFindViewById(i5);
    }

    @Override // androidx.fragment.app.s0
    public final boolean k() {
        return this.f2108a.k() || this.f2109b.onHasView();
    }
}
