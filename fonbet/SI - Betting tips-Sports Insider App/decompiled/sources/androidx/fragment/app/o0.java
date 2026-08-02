package androidx.fragment.app;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 extends t0 implements d0.e, d0.f, c0.i0, c0.j0, androidx.lifecycle.p1, e.e0, g.h, q2.f, n1, androidx.core.view.n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f2018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var) {
        super(p0Var);
        this.f2018e = p0Var;
    }

    @Override // androidx.fragment.app.n1
    public final void a(j1 j1Var, Fragment fragment) {
        this.f2018e.getClass();
    }

    @Override // androidx.core.view.n
    public final void addMenuProvider(androidx.core.view.r rVar) {
        this.f2018e.addMenuProvider(rVar);
    }

    @Override // d0.f
    public final void b(p0.a aVar) {
        this.f2018e.b(aVar);
    }

    @Override // d0.e
    public final void c(p0.a aVar) {
        this.f2018e.c(aVar);
    }

    @Override // g.h
    public final g.g d() {
        return this.f2018e.f8424i;
    }

    @Override // androidx.fragment.app.s0
    public final View e(int i5) {
        return this.f2018e.findViewById(i5);
    }

    @Override // c0.i0
    public final void f(p0.a aVar) {
        this.f2018e.f(aVar);
    }

    @Override // d0.f
    public final void g(p0.a aVar) {
        this.f2018e.g(aVar);
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.y getLifecycle() {
        return this.f2018e.f2035v;
    }

    @Override // e.e0
    public final e.d0 getOnBackPressedDispatcher() {
        return this.f2018e.getOnBackPressedDispatcher();
    }

    @Override // q2.f
    public final q2.d getSavedStateRegistry() {
        return this.f2018e.f8419d.f21928b;
    }

    @Override // androidx.lifecycle.p1
    public final androidx.lifecycle.o1 getViewModelStore() {
        return this.f2018e.getViewModelStore();
    }

    @Override // c0.j0
    public final void h(p0.a aVar) {
        this.f2018e.h(aVar);
    }

    @Override // c0.i0
    public final void i(p0.a aVar) {
        this.f2018e.i(aVar);
    }

    @Override // d0.e
    public final void j(p0.a aVar) {
        this.f2018e.j(aVar);
    }

    @Override // androidx.fragment.app.s0
    public final boolean k() {
        Window window = this.f2018e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // c0.j0
    public final void l(p0.a aVar) {
        this.f2018e.l(aVar);
    }

    @Override // androidx.core.view.n
    public final void removeMenuProvider(androidx.core.view.r rVar) {
        this.f2018e.removeMenuProvider(rVar);
    }
}
