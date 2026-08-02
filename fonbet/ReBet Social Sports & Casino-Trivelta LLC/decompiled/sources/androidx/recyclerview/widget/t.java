package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class t extends x {

    /* renamed from: d, reason: collision with root package name */
    public s f23216d;

    /* renamed from: e, reason: collision with root package name */
    public s f23217e;

    public class a extends o {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.A
        public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
            t tVar = t.this;
            int[] c10 = tVar.c(tVar.f23224a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f23202j);
            }
        }

        @Override // androidx.recyclerview.widget.o
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.o
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    @Override // androidx.recyclerview.widget.x
    public int[] c(RecyclerView.q qVar, View view) {
        int[] iArr = new int[2];
        if (qVar.A()) {
            iArr[0] = k(view, m(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.B()) {
            iArr[1] = k(view, o(qVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.x
    public RecyclerView.A d(RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.A.b) {
            return new a(this.f23224a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    public View f(RecyclerView.q qVar) {
        if (qVar.B()) {
            return l(qVar, o(qVar));
        }
        if (qVar.A()) {
            return l(qVar, m(qVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    public int g(RecyclerView.q qVar, int i10, int i11) {
        s n10;
        int j10 = qVar.j();
        if (j10 == 0 || (n10 = n(qVar)) == null) {
            return -1;
        }
        int Z10 = qVar.Z();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < Z10; i14++) {
            View Y10 = qVar.Y(i14);
            if (Y10 != null) {
                int k10 = k(Y10, n10);
                if (k10 <= 0 && k10 > i13) {
                    view2 = Y10;
                    i13 = k10;
                }
                if (k10 >= 0 && k10 < i12) {
                    view = Y10;
                    i12 = k10;
                }
            }
        }
        boolean p10 = p(qVar, i10, i11);
        if (p10 && view != null) {
            return qVar.s0(view);
        }
        if (!p10 && view2 != null) {
            return qVar.s0(view2);
        }
        if (p10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int s02 = qVar.s0(view) + (q(qVar) == p10 ? -1 : 1);
        if (s02 < 0 || s02 >= j10) {
            return -1;
        }
        return s02;
    }

    public final int k(View view, s sVar) {
        return (sVar.g(view) + (sVar.e(view) / 2)) - (sVar.m() + (sVar.n() / 2));
    }

    public final View l(RecyclerView.q qVar, s sVar) {
        int Z10 = qVar.Z();
        View view = null;
        if (Z10 == 0) {
            return null;
        }
        int m10 = sVar.m() + (sVar.n() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < Z10; i11++) {
            View Y10 = qVar.Y(i11);
            int abs = Math.abs((sVar.g(Y10) + (sVar.e(Y10) / 2)) - m10);
            if (abs < i10) {
                view = Y10;
                i10 = abs;
            }
        }
        return view;
    }

    public final s m(RecyclerView.q qVar) {
        s sVar = this.f23217e;
        if (sVar == null || sVar.f23213a != qVar) {
            this.f23217e = s.a(qVar);
        }
        return this.f23217e;
    }

    public final s n(RecyclerView.q qVar) {
        if (qVar.B()) {
            return o(qVar);
        }
        if (qVar.A()) {
            return m(qVar);
        }
        return null;
    }

    public final s o(RecyclerView.q qVar) {
        s sVar = this.f23216d;
        if (sVar == null || sVar.f23213a != qVar) {
            this.f23216d = s.c(qVar);
        }
        return this.f23216d;
    }

    public final boolean p(RecyclerView.q qVar, int i10, int i11) {
        return qVar.A() ? i10 > 0 : i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(RecyclerView.q qVar) {
        PointF c10;
        int j10 = qVar.j();
        if (!(qVar instanceof RecyclerView.A.b) || (c10 = ((RecyclerView.A.b) qVar).c(j10 - 1)) == null) {
            return false;
        }
        return c10.x < 0.0f || c10.y < 0.0f;
    }
}
