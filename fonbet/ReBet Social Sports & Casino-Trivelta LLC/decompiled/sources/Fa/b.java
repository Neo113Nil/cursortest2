package Fa;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f3653a;

    public b(SideSheetBehavior sideSheetBehavior) {
        this.f3653a = sideSheetBehavior;
    }

    @Override // Fa.c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // Fa.c
    public float b(int i10) {
        float e10 = e();
        return (e10 - i10) / (e10 - d());
    }

    @Override // Fa.c
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // Fa.c
    public int d() {
        return Math.max(0, (e() - this.f3653a.d0()) - this.f3653a.k0());
    }

    @Override // Fa.c
    public int e() {
        return this.f3653a.n0();
    }

    @Override // Fa.c
    public int f() {
        return this.f3653a.n0();
    }

    @Override // Fa.c
    public int g() {
        return d();
    }

    @Override // Fa.c
    public int h(View view) {
        return view.getLeft() - this.f3653a.k0();
    }

    @Override // Fa.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // Fa.c
    public int j() {
        return 0;
    }

    @Override // Fa.c
    public boolean k(float f10) {
        return f10 < 0.0f;
    }

    @Override // Fa.c
    public boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // Fa.c
    public boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f3653a.o0());
    }

    @Override // Fa.c
    public boolean n(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f3653a.i0())) > this.f3653a.j0();
    }

    @Override // Fa.c
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // Fa.c
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int n02 = this.f3653a.n0();
        if (i10 <= n02) {
            marginLayoutParams.rightMargin = n02 - i10;
        }
    }
}
