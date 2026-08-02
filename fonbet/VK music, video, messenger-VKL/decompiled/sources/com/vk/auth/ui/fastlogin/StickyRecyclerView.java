package com.vk.auth.ui.fastlogin;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;

/* compiled from: StickyRecyclerView.kt */
/* loaded from: classes15.dex */
public final class StickyRecyclerView extends RecyclerView {
    public static final int f = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 12);
    public final d b;
    public final w c;
    public final c d;
    public final boolean e;

    /* compiled from: StickyRecyclerView.kt */
    public final class a extends LinearLayoutManager {

        /* compiled from: StickyRecyclerView.kt */
        /* renamed from: com.vk.auth.ui.fastlogin.StickyRecyclerView$a$a, reason: collision with other inner class name */
        public static final class C0416a extends v {
            @Override // androidx.recyclerview.widget.v
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return super.calculateSpeedPerPixel(displayMetrics) * 4.0f;
            }
        }

        public a(Context context) {
            super(0, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final int getPaddingLeft() {
            View childAt = getChildAt(0);
            if (childAt == null) {
                return 0;
            }
            Object parent = childAt.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                return 0;
            }
            return (view.getMeasuredWidth() - childAt.getMeasuredWidth()) / 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final int getPaddingRight() {
            return getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
            super.onLayoutCompleted(a0Var);
            StickyRecyclerView.a(StickyRecyclerView.this);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
            C0416a c0416a = new C0416a(recyclerView != null ? recyclerView.getContext() : null);
            c0416a.setTargetPosition(i);
            startSmoothScroll(c0416a);
        }
    }

    /* compiled from: StickyRecyclerView.kt */
    public interface b {
        void a();
    }

    /* compiled from: StickyRecyclerView.kt */
    public static final class c extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i = StickyRecyclerView.f;
            rect.left = i;
            rect.right = i;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left += i;
            }
            if (childAdapterPosition == (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
                rect.right += i;
            }
        }
    }

    /* compiled from: StickyRecyclerView.kt */
    public final class d extends RecyclerView.t {
        public final w b;
        public b c;
        public int d = -1;
        public boolean e = true;

        public d(w wVar) {
            this.b = wVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            View findSnapView;
            if (this.e && i == 0) {
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                int i2 = -1;
                if (layoutManager != null && (findSnapView = this.b.findSnapView(layoutManager)) != null) {
                    i2 = layoutManager.getPosition(findSnapView);
                }
                if (i2 != this.d) {
                    this.d = i2;
                    b bVar = this.c;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a();
                    throw null;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (this.e) {
                StickyRecyclerView.a(StickyRecyclerView.this);
            }
        }
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = true;
        w wVar = new w();
        this.c = wVar;
        this.b = new d(wVar);
        this.d = new c();
        setSticky(true);
        super.scrollToPosition(0);
    }

    public static final void a(StickyRecyclerView stickyRecyclerView) {
        RecyclerView.o layoutManager = stickyRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        float measuredWidth = stickyRecyclerView.getMeasuredWidth() / 2.0f;
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                float max = Math.max(0.6f, 1.0f - ((Math.abs(((childAt.getMeasuredWidth() / 2.0f) + childAt.getLeft()) - measuredWidth) / measuredWidth) * 1.9f));
                childAt.setScaleX(max);
                childAt.setScaleY(max);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnScrollListener(this.b);
        if (this.e) {
            return;
        }
        addItemDecoration(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnScrollListener(this.b);
        removeItemDecoration(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void scrollToPosition(int i) {
        if (!this.e) {
            super.scrollToPosition(i);
            return;
        }
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(this, null, i);
        }
    }

    public final void setOnSnapPositionChangeListener(b bVar) {
        this.b.c = bVar;
    }

    public final void setSticky(boolean z) {
        this.b.e = z;
        w wVar = this.c;
        if (z) {
            wVar.attachToRecyclerView(this);
            setLayoutManager(new a(getContext()));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            setHasFixedSize(true);
        } else {
            wVar.attachToRecyclerView(null);
            getContext();
            setLayoutManager(new LinearLayoutManager(0, false));
            c cVar = this.d;
            removeItemDecoration(cVar);
            addItemDecoration(cVar);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = -2;
            }
            setHasFixedSize(false);
        }
        requestLayout();
    }
}
