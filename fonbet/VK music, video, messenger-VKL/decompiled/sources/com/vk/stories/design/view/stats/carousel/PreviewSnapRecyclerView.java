package com.vk.stories.design.view.stats.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.iut0;
import xsna.r6m;
import xsna.wtu;

/* compiled from: PreviewSnapRecyclerView.kt */
/* loaded from: classes6.dex */
public final class PreviewSnapRecyclerView extends RecyclerView {
    public final AccelerateDecelerateInterpolator b;
    public final w c;
    public final b d;
    public boolean e;
    public boolean f;
    public int g;

    /* compiled from: PreviewSnapRecyclerView.kt */
    public interface a {
        void a(int i);

        void b();

        void c();
    }

    /* compiled from: PreviewSnapRecyclerView.kt */
    public final class b extends RecyclerView.t {
        public int b = -1;
        public a c;

        public b() {
        }

        public final void l(RecyclerView recyclerView) {
            View findSnapView;
            r6m.a.getClass();
            boolean l = r6m.l();
            PreviewSnapRecyclerView previewSnapRecyclerView = PreviewSnapRecyclerView.this;
            if (!l || previewSnapRecyclerView.e) {
                w wVar = previewSnapRecyclerView.c;
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                int position = (layoutManager == null || (findSnapView = wVar.findSnapView(layoutManager)) == null) ? -1 : layoutManager.getPosition(findSnapView);
                int i = this.b;
                if (position != i) {
                    if (previewSnapRecyclerView.f || i == -1) {
                        if (i != -1) {
                            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                            int a = wtu.a(26);
                            if (a != -1) {
                                recyclerView.performHapticFeedback(a, 1);
                            }
                        }
                        this.b = position;
                        a aVar = this.c;
                        if (aVar != null) {
                            aVar.a(position);
                        }
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            a aVar;
            if (i != 0) {
                if (i == 1 && (aVar = this.c) != null) {
                    aVar.c();
                    return;
                }
                return;
            }
            l(recyclerView);
            PreviewSnapRecyclerView.this.e = false;
            a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.b();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 || PreviewSnapRecyclerView.this.e) {
                return;
            }
            l(recyclerView);
        }
    }

    public PreviewSnapRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new AccelerateDecelerateInterpolator();
        w wVar = new w();
        this.c = wVar;
        this.d = new b();
        this.g = -1;
        setHapticFeedbackEnabled(true);
        wVar.attachToRecyclerView(this);
        setHasFixedSize(true);
    }

    public final void a() {
        View findViewByPosition;
        int i;
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager == null || (findViewByPosition = layoutManager.findViewByPosition(this.g)) == null || (i = this.c.calculateDistanceToFinalSnap(layoutManager, findViewByPosition)[0]) == 0) {
            return;
        }
        scrollBy(i, 0);
    }

    public final int getCurrentPosition() {
        View findSnapView;
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager == null || (findSnapView = this.c.findSnapView(layoutManager)) == null) {
            return -1;
        }
        return layoutManager.getPosition(findSnapView);
    }

    public final int getSavedCenterPosition() {
        return this.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addOnScrollListener(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnScrollListener(this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f) {
            return;
        }
        a();
    }

    public final void setFullyCollapsedState(boolean z) {
        w wVar = this.c;
        if (z) {
            r6m.a.getClass();
            if (r6m.l()) {
                wVar.attachToRecyclerView(null);
                this.f = z;
            }
        }
        wVar.attachToRecyclerView(this);
        this.f = z;
    }

    public final void setPreviewScrollListener(a aVar) {
        this.d.c = aVar;
    }

    public final void setSavedCenterPosition(int i) {
        this.g = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, this.b);
    }
}
