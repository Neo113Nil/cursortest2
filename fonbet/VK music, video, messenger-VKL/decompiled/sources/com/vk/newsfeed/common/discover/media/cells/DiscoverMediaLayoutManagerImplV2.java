package com.vk.newsfeed.common.discover.media.cells;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import xsna.cvx;
import xsna.hr80;
import xsna.jq;
import xsna.rqi;
import xsna.t3n;

/* compiled from: DiscoverMediaLayoutManagerImplV2.kt */
/* loaded from: classes4.dex */
public final class DiscoverMediaLayoutManagerImplV2 extends RecyclerView.o implements t3n {
    public int d;
    public int e;
    public int f;
    public int b = 3;
    public int c = 3;
    public final Rect g = new Rect();
    public cvx h = new hr80();
    public final Rect i = new Rect();

    /* compiled from: DiscoverMediaLayoutManagerImplV2.kt */
    public static final class a extends RecyclerView.p {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean checkLayoutParams(RecyclerView.p pVar) {
        return pVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int a2;
        detachAndScrapAttachedViews(vVar);
        int b = a0Var.b();
        for (int i = 0; i < b; i++) {
            View f = vVar.f(i);
            int d = vVar.d(i);
            if (d == -1) {
                d = i;
            }
            int f2 = this.h.f(d);
            int e = this.h.e(d);
            int i2 = this.h.i(d);
            int c = this.h.c(d);
            int paddingLeft = getPaddingLeft() + (this.d * f2) + (this.e * f2);
            if ((f2 + i2) - 1 == this.c - 1) {
                a2 = this.f;
            } else {
                int i3 = this.e;
                int i4 = this.d;
                int i5 = i3 * i2;
                int i6 = i2 - 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                a2 = rqi.a(i6, i4, i5, paddingLeft);
            }
            int paddingTop = getPaddingTop() + (e * this.d) + (this.e * e);
            int i7 = this.e;
            int i8 = this.d;
            int i9 = i7 * c;
            int i10 = c - 1;
            if (i10 < 0) {
                i10 = 0;
            }
            int a3 = rqi.a(i10, i8, i9, paddingTop);
            Rect rect = this.g;
            calculateItemDecorationsForChild(f, rect);
            int i11 = ((a2 - paddingLeft) - rect.left) - rect.right;
            int i12 = ((a3 - paddingTop) - rect.top) - rect.bottom;
            ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i12;
            Rect rect2 = this.i;
            rect2.set(paddingLeft, paddingTop, a2, a3);
            measureChildWithMargins(f, i11, i12);
            addView(f);
            if (f.getLayoutParams() instanceof a) {
                layoutDecorated(f, rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onMeasure(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int chooseSize = RecyclerView.o.chooseSize(i, paddingRight, 0);
        this.f = chooseSize;
        int i3 = this.c;
        int i4 = this.d;
        int a2 = jq.a(i3 - 1, i4, chooseSize - paddingRight, i3);
        this.e = a2;
        int i5 = this.b;
        int i6 = a2 * i5;
        int i7 = i5 - 1;
        setMeasuredDimension(chooseSize, getPaddingBottom() + getPaddingTop() + ((i7 >= 0 ? i7 : 0) * i4) + i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
    }
}
