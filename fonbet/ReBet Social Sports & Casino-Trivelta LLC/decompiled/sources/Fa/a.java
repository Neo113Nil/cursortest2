package Fa;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f3652a;

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f3652a = sideSheetBehavior;
    }

    @Override // Fa.c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // Fa.c
    public float b(int i10) {
        float e10 = e();
        return (i10 - e10) / (d() - e10);
    }

    @Override // Fa.c
    public int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // Fa.c
    public int d() {
        return Math.max(0, this.f3652a.m0() + this.f3652a.k0());
    }

    @Override // Fa.c
    public int e() {
        return (-this.f3652a.d0()) - this.f3652a.k0();
    }

    @Override // Fa.c
    public int f() {
        return this.f3652a.k0();
    }

    @Override // Fa.c
    public int g() {
        return -this.f3652a.d0();
    }

    @Override // Fa.c
    public int h(View view) {
        return view.getRight() + this.f3652a.k0();
    }

    @Override // Fa.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // Fa.c
    public int j() {
        return 1;
    }

    @Override // Fa.c
    public boolean k(float f10) {
        return f10 > 0.0f;
    }

    @Override // Fa.c
    public boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // Fa.c
    public boolean m(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f3652a.o0());
    }

    @Override // Fa.c
    public boolean n(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f3652a.i0())) > this.f3652a.j0();
    }

    @Override // Fa.c
    public void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // Fa.c
    public void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f3652a.n0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
