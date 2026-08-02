package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class x extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f23224a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f23225b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.v f23226c = new a();

    public class a extends RecyclerView.v {

        /* renamed from: a, reason: collision with root package name */
        public boolean f23227a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f23227a) {
                this.f23227a = false;
                x.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f23227a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(int i10, int i11) {
        RecyclerView.q layoutManager = this.f23224a.getLayoutManager();
        if (layoutManager == null || this.f23224a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f23224a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f23224a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f23224a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f23225b = new Scroller(this.f23224a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.q qVar, View view);

    public abstract RecyclerView.A d(RecyclerView.q qVar);

    public final void e() {
        this.f23224a.o1(this.f23226c);
        this.f23224a.setOnFlingListener(null);
    }

    public abstract View f(RecyclerView.q qVar);

    public abstract int g(RecyclerView.q qVar, int i10, int i11);

    public final void h() {
        if (this.f23224a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f23224a.n(this.f23226c);
        this.f23224a.setOnFlingListener(this);
    }

    public final boolean i(RecyclerView.q qVar, int i10, int i11) {
        RecyclerView.A d10;
        int g10;
        if (!(qVar instanceof RecyclerView.A.b) || (d10 = d(qVar)) == null || (g10 = g(qVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        qVar.X1(d10);
        return true;
    }

    public void j() {
        RecyclerView.q layoutManager;
        View f10;
        RecyclerView recyclerView = this.f23224a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f10 = f(layoutManager)) == null) {
            return;
        }
        int[] c10 = c(layoutManager, f10);
        int i10 = c10[0];
        if (i10 == 0 && c10[1] == 0) {
            return;
        }
        this.f23224a.C1(i10, c10[1]);
    }
}
