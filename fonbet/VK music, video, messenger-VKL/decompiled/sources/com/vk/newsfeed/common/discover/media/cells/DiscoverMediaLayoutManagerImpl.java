package com.vk.newsfeed.common.discover.media.cells;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.cvx;
import xsna.hr80;
import xsna.jq;
import xsna.rqi;
import xsna.t3n;

/* compiled from: DiscoverMediaLayoutManagerImpl.kt */
/* loaded from: classes4.dex */
public final class DiscoverMediaLayoutManagerImpl extends RecyclerView.o implements t3n {
    public int b = 3;
    public int c = 3;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public final Rect h;
    public cvx i;

    /* compiled from: DiscoverMediaLayoutManagerImpl.kt */
    public static final class a extends RecyclerView.p {
        public final Rect f;

        public a() {
            super(-1, -2);
            this.f = new Rect();
        }
    }

    public DiscoverMediaLayoutManagerImpl() {
        int i = 3 * 3;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        this.d = iArr;
        this.h = new Rect();
        this.i = new hr80();
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
        return new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a();
    }

    public final void o(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        r12 = r12 + 1;
        r8 = -1;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int a2;
        int i2;
        int[] iArr = this.d;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= length) {
                break;
            }
            iArr[i3] = -1;
            i3++;
        }
        detachAndScrapAttachedViews(vVar);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        int b = a0Var.b();
        int i4 = 0;
        while (i4 < b) {
            View f = vVar.f(i4);
            int d = vVar.d(i4);
            if (d == i) {
                d = i4;
            }
            int i5 = this.i.i(d);
            int c = this.i.c(d);
            int i6 = ref$IntRef2.element;
            int i7 = ref$IntRef.element;
            for (int i8 = 0; i8 < c; i8++) {
                for (int i9 = 0; i9 < i5; i9++) {
                    this.d[((i6 + i8) * this.c) + i7 + i9] = d;
                }
            }
            int i10 = ref$IntRef2.element;
            int i11 = ref$IntRef.element;
            int paddingLeft = getPaddingLeft() + (this.e * i11) + (this.f * i11);
            if (i11 == this.c - 1) {
                a2 = this.g;
            } else {
                int i12 = this.f;
                int i13 = this.e;
                int i14 = i12 * i5;
                int i15 = i5 - 1;
                if (i15 < 0) {
                    i15 = 0;
                }
                a2 = rqi.a(i15, i13, i14, paddingLeft);
            }
            int paddingTop = getPaddingTop() + (i10 * this.e) + (this.f * i10);
            int i16 = this.f;
            int i17 = this.e;
            int i18 = i16 * c;
            int i19 = c - 1;
            if (i19 < 0) {
                i19 = 0;
            }
            int a3 = rqi.a(i19, i17, i18, paddingTop);
            Rect rect = this.h;
            calculateItemDecorationsForChild(f, rect);
            int i20 = ((a2 - paddingLeft) - rect.left) - rect.right;
            int i21 = ((a3 - paddingTop) - rect.top) - rect.bottom;
            ViewGroup.LayoutParams layoutParams = f.getLayoutParams();
            layoutParams.width = i20;
            layoutParams.height = i21;
            if (layoutParams instanceof a) {
                ((a) layoutParams).f.set(paddingLeft, paddingTop, a2, a3);
            }
            measureChildWithMargins(f, i20, i21);
            ViewGroup.LayoutParams layoutParams2 = f.getLayoutParams();
            if (layoutParams2 instanceof a) {
                Rect rect2 = ((a) layoutParams2).f;
                layoutDecorated(f, rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
            addView(f);
            do {
                int i22 = ref$IntRef2.element;
                int i23 = this.c;
                for (int i24 = ref$IntRef.element; i24 < i23; i24++) {
                    ref$IntRef.element = i24;
                    if (this.d[(this.c * i22) + i24] < 0) {
                        break;
                    }
                }
                ref$IntRef.element = 0;
                i2 = ref$IntRef2.element + 1;
                ref$IntRef2.element = i2;
            } while (i2 < this.b);
            return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onMeasure(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int chooseSize = RecyclerView.o.chooseSize(i, paddingRight, 0);
        this.g = chooseSize;
        int i3 = this.c;
        int i4 = this.e;
        int a2 = jq.a(i3 - 1, i4, chooseSize - paddingRight, i3);
        this.f = a2;
        int i5 = this.b;
        int i6 = a2 * i5;
        int i7 = i5 - 1;
        setMeasuredDimension(chooseSize, getPaddingBottom() + getPaddingTop() + ((i7 >= 0 ? i7 : 0) * i4) + i6);
    }

    public final void p(int i) {
        boolean z = (this.b == i && this.c == 3) ? false : true;
        this.b = i;
        this.c = 3;
        int i2 = i * 3;
        if (this.d.length < i2) {
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = -1;
            }
            this.d = iArr;
        }
        if (z) {
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
    }
}
