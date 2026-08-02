package androidx.recyclerview.widget.pagergrid;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.container.PagerGridListVh;
import com.vk.superapp.ui.PagerIndicatorView;
import xsna.bb90;
import xsna.f4m;

/* compiled from: PagerGridLayoutManager.kt */
/* loaded from: classes12.dex */
public final class PagerGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public final int b;
    public final int c;
    public int d;
    public int e;
    public final int f;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public RecyclerView o;
    public PagerGridListVh s;
    public final SparseArray<Rect> g = new SparseArray<>();
    public final boolean n = true;
    public final boolean p = true;
    public int q = -1;
    public int r = -1;

    public PagerGridLayoutManager(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.f = i * i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollExtent(RecyclerView.a0 a0Var) {
        return u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollOffset(RecyclerView.a0 a0Var) {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeHorizontalScrollRange(RecyclerView.a0 a0Var) {
        return u() + this.l;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF computeScrollVectorForPosition(int i) {
        PointF pointF = new PointF();
        int[] r = r(i);
        pointF.x = r[0];
        pointF.y = r[1];
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollExtent(RecyclerView.a0 a0Var) {
        return t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollOffset(RecyclerView.a0 a0Var) {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int computeVerticalScrollRange(RecyclerView.a0 a0Var) {
        return t() + this.m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    public final void o(RecyclerView.v vVar, Rect rect, int i) {
        View f = vVar.f(i);
        Rect p = p(i);
        if (!Rect.intersects(rect, p)) {
            removeAndRecycleView(f, vVar);
            return;
        }
        addView(f);
        measureChildWithMargins(f, this.j, this.k);
        RecyclerView.p pVar = (RecyclerView.p) f.getLayoutParams();
        layoutDecorated(f, getPaddingLeft() + (p.left - this.d) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, getPaddingTop() + (p.top - this.e) + ((ViewGroup.MarginLayoutParams) pVar).topMargin, getPaddingLeft() + ((p.right - this.d) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin), getPaddingTop() + ((p.bottom - this.e) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.o = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.g) {
            return;
        }
        if (getItemCount() == 0) {
            removeAndRecycleAllViews(vVar);
            x(0);
            y(0, false);
            return;
        }
        x(s());
        y(q(), false);
        int itemCount = getItemCount();
        int i = this.f;
        int i2 = itemCount / i;
        if (getItemCount() % i != 0) {
            i2++;
        }
        int u = u() * (i2 - 1);
        this.l = u;
        this.m = 0;
        if (this.d > u) {
            this.d = u;
        }
        if (this.h <= 0) {
            this.h = u() / this.c;
        }
        if (this.i <= 0) {
            this.i = t() / this.b;
        }
        this.j = u() - this.h;
        this.k = t() - this.i;
        int i3 = i * 2;
        for (int i4 = 0; i4 < i3; i4++) {
            p(i4);
        }
        v(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        if (a0Var.g) {
            return;
        }
        x(s());
        y(q(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onMeasure(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        super.onMeasure(vVar, a0Var, i, i2);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && size > 0) {
            mode = 1073741824;
        }
        if (mode2 != 1073741824 && size2 > 0) {
            mode2 = 1073741824;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 0) {
            y(q(), false);
        }
    }

    public final Rect p(int i) {
        SparseArray<Rect> sparseArray = this.g;
        Rect rect = sparseArray.get(i);
        if (rect != null) {
            return rect;
        }
        Rect rect2 = new Rect();
        int i2 = this.f;
        int u = u() * (i / i2);
        int i3 = i % i2;
        int i4 = this.c;
        int i5 = i3 / i4;
        int i6 = i3 - (i4 * i5);
        int i7 = this.h;
        int i8 = (i6 * i7) + u;
        int i9 = this.i;
        int i10 = i5 * i9;
        rect2.left = i8;
        rect2.top = i10;
        rect2.right = i8 + i7;
        rect2.bottom = i10 + i9;
        sparseArray.put(i, rect2);
        return rect2;
    }

    public final int q() {
        int u = u();
        int i = this.d;
        if (i <= 0 || u <= 0) {
            return 0;
        }
        int i2 = i / u;
        return i % u > u / 2 ? i2 + 1 : i2;
    }

    public final int[] r(int i) {
        return new int[]{(u() * (i / this.f)) - this.d, 0 - this.e};
    }

    public final int s() {
        if (getItemCount() <= 0) {
            return 0;
        }
        int itemCount = getItemCount();
        int i = this.f;
        int i2 = itemCount / i;
        return getItemCount() % i != 0 ? i2 + 1 : i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2 = this.d;
        int i3 = i2 + i;
        int i4 = this.l;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.d = i2 + i;
        y(q(), true);
        offsetChildrenHorizontal(-i);
        if (i > 0) {
            v(vVar, a0Var, true);
            return i;
        }
        v(vVar, a0Var, false);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        w(i / this.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i2 = this.e;
        int i3 = i2 + i;
        int i4 = this.m;
        if (i3 > i4) {
            i = i4 - i2;
        } else if (i3 < 0) {
            i = 0 - i2;
        }
        this.e = i2 + i;
        y(q(), true);
        offsetChildrenVertical(-i);
        if (i > 0) {
            v(vVar, a0Var, true);
            return i;
        }
        v(vVar, a0Var, false);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        int i2 = this.f;
        int i3 = i / i2;
        if (i3 < 0 || i3 >= this.q || this.o == null) {
            return;
        }
        int q = q();
        if (Math.abs(i3 - q) > 3) {
            if (i3 > q) {
                w(i3 - 3);
            } else if (i3 < q) {
                w(i3 + 3);
            }
        }
        bb90 bb90Var = new bb90(this.o);
        bb90Var.setTargetPosition(i3 * i2);
        startSmoothScroll(bb90Var);
    }

    public final int t() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final int u() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    @SuppressLint({"CheckResult"})
    public final void v(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        if (a0Var.g) {
            return;
        }
        Rect rect = new Rect(this.d - this.h, this.e - this.i, u() + this.d + this.h, t() + this.e + this.i);
        rect.intersect(0, 0, u() + this.l, t() + this.m);
        int q = q();
        int i = this.f;
        int i2 = (q * i) - (i * 2);
        int i3 = i2 >= 0 ? i2 : 0;
        int i4 = (i * 4) + i3;
        if (i4 > getItemCount()) {
            i4 = getItemCount();
        }
        detachAndScrapAttachedViews(vVar);
        if (z) {
            while (i3 < i4) {
                o(vVar, rect, i3);
                i3++;
            }
        } else {
            int i5 = i4 - 1;
            if (i3 > i5) {
                return;
            }
            while (true) {
                o(vVar, rect, i5);
                if (i5 == i3) {
                    return;
                } else {
                    i5--;
                }
            }
        }
    }

    public final void w(int i) {
        if (i < 0 || i >= this.q || this.o == null) {
            return;
        }
        int u = (u() * i) - this.d;
        RecyclerView recyclerView = this.o;
        if (recyclerView != null) {
            recyclerView.scrollBy(u, 0);
        }
        y(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public final void x(int i) {
        if (i >= 0) {
            PagerGridListVh pagerGridListVh = this.s;
            if (pagerGridListVh != null && i != this.q) {
                if (i > 1) {
                    View view = pagerGridListVh.n;
                    if (view == null) {
                        view = null;
                    }
                    view.setVisibility(0);
                    PagerIndicatorView pagerIndicatorView = pagerGridListVh.o;
                    (pagerIndicatorView != null ? pagerIndicatorView : null).setDotCount(i);
                } else {
                    ?? r0 = pagerGridListVh.n;
                    f4m.j(r0 != 0 ? r0 : null);
                }
            }
            this.q = i;
        }
    }

    public final void y(int i, boolean z) {
        PagerGridListVh pagerGridListVh;
        if (i == this.r) {
            return;
        }
        if (this.n) {
            this.r = i;
        } else if (!z) {
            this.r = i;
        }
        if ((!z || this.p) && i >= 0 && (pagerGridListVh = this.s) != null) {
            PagerIndicatorView pagerIndicatorView = pagerGridListVh.o;
            if (pagerIndicatorView == null) {
                pagerIndicatorView = null;
            }
            pagerIndicatorView.setSelectedDotPosition(i);
        }
    }
}
