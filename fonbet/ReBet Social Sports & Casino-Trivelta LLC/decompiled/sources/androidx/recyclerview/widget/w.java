package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class w extends RecyclerView.n {

    /* renamed from: g, reason: collision with root package name */
    public boolean f23223g = true;

    public abstract boolean A(RecyclerView.F f10);

    public final void B(RecyclerView.F f10) {
        J(f10);
        h(f10);
    }

    public final void C(RecyclerView.F f10) {
        K(f10);
    }

    public final void D(RecyclerView.F f10, boolean z10) {
        L(f10, z10);
        h(f10);
    }

    public final void E(RecyclerView.F f10, boolean z10) {
        M(f10, z10);
    }

    public final void F(RecyclerView.F f10) {
        N(f10);
        h(f10);
    }

    public final void G(RecyclerView.F f10) {
        O(f10);
    }

    public final void H(RecyclerView.F f10) {
        P(f10);
        h(f10);
    }

    public final void I(RecyclerView.F f10) {
        Q(f10);
    }

    public void J(RecyclerView.F f10) {
    }

    public void K(RecyclerView.F f10) {
    }

    public void L(RecyclerView.F f10, boolean z10) {
    }

    public void M(RecyclerView.F f10, boolean z10) {
    }

    public void N(RecyclerView.F f10) {
    }

    public void O(RecyclerView.F f10) {
    }

    public void P(RecyclerView.F f10) {
    }

    public void Q(RecyclerView.F f10) {
    }

    public void R(boolean z10) {
        this.f23223g = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean a(RecyclerView.F f10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        return (cVar == null || ((i10 = cVar.f22870a) == (i11 = cVar2.f22870a) && cVar.f22871b == cVar2.f22871b)) ? x(f10) : z(f10, i10, cVar.f22871b, i11, cVar2.f22871b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b(RecyclerView.F f10, RecyclerView.F f11, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f22870a;
        int i13 = cVar.f22871b;
        if (f11.shouldIgnore()) {
            int i14 = cVar.f22870a;
            i11 = cVar.f22871b;
            i10 = i14;
        } else {
            i10 = cVar2.f22870a;
            i11 = cVar2.f22871b;
        }
        return y(f10, f11, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c(RecyclerView.F f10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f22870a;
        int i11 = cVar.f22871b;
        View view = f10.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f22870a;
        int top = cVar2 == null ? view.getTop() : cVar2.f22871b;
        if (f10.isRemoved() || (i10 == left && i11 == top)) {
            return A(f10);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return z(f10, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.F f10, RecyclerView.n.c cVar, RecyclerView.n.c cVar2) {
        int i10 = cVar.f22870a;
        int i11 = cVar2.f22870a;
        if (i10 != i11 || cVar.f22871b != cVar2.f22871b) {
            return z(f10, i10, cVar.f22871b, i11, cVar2.f22871b);
        }
        F(f10);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean f(RecyclerView.F f10) {
        return !this.f23223g || f10.isInvalid();
    }

    public abstract boolean x(RecyclerView.F f10);

    public abstract boolean y(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.F f10, int i10, int i11, int i12, int i13);
}
