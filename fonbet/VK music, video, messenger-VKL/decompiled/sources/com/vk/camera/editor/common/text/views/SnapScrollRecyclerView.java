package com.vk.camera.editor.common.text.views;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.w;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.text.views.SnapScrollRecyclerView;
import com.vkontakte.android.R;
import xsna.z9k0;

/* compiled from: SnapScrollRecyclerView.kt */
/* loaded from: classes16.dex */
public final class SnapScrollRecyclerView extends RecyclerView {
    public static final /* synthetic */ int g = 0;
    public final int b;
    public final w c;
    public final b d;
    public boolean e;
    public final z9k0 f;

    /* compiled from: SnapScrollRecyclerView.kt */
    public interface a {
        void a(int i);
    }

    /* compiled from: SnapScrollRecyclerView.kt */
    public final class b extends RecyclerView.t {
        public int b = -1;
        public a c;

        public b() {
        }

        public final void l(RecyclerView recyclerView) {
            View findSnapView;
            w wVar = SnapScrollRecyclerView.this.c;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            int i = -1;
            if (layoutManager != null && (findSnapView = wVar.findSnapView(layoutManager)) != null) {
                i = layoutManager.getPosition(findSnapView);
            }
            if (i != this.b) {
                this.b = i;
                a aVar = this.c;
                if (aVar != null) {
                    aVar.a(i);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                SnapScrollRecyclerView.this.e = false;
                l(recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            SnapScrollRecyclerView snapScrollRecyclerView = SnapScrollRecyclerView.this;
            if (!snapScrollRecyclerView.e) {
                l(recyclerView);
            }
            SnapScrollRecyclerView.a(snapScrollRecyclerView);
        }
    }

    /* compiled from: SnapScrollRecyclerView.kt */
    public final class c extends LinearLayoutManager {

        /* compiled from: SnapScrollRecyclerView.kt */
        public final class a extends v {
            public final PointF a;

            public a(Context context, PointF pointF) {
                super(context);
                this.a = pointF;
            }

            @Override // androidx.recyclerview.widget.v
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return super.calculateSpeedPerPixel(displayMetrics) * 4.0f;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.z
            public final PointF computeScrollVectorForPosition(int i) {
                return this.a;
            }

            @Override // androidx.recyclerview.widget.v
            public final int getHorizontalSnapPreference() {
                return -1;
            }
        }

        public c(Context context) {
            super(0, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
            super.onLayoutCompleted(a0Var);
            SnapScrollRecyclerView.a(SnapScrollRecyclerView.this);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
            a aVar = new a(recyclerView != null ? recyclerView.getContext() : null, computeScrollVectorForPosition(i));
            aVar.setTargetPosition(i);
            startSmoothScroll(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [xsna.z9k0] */
    public SnapScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 2;
        w wVar = new w();
        this.c = wVar;
        this.d = new b();
        this.f = new Interpolator() { // from class: xsna.z9k0
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                int i = SnapScrollRecyclerView.g;
                return (float) (1.0f - Math.pow(Math.abs(f - 1.0f), SnapScrollRecyclerView.this.b));
            }
        };
        setLayoutManager(new c(context));
        wVar.attachToRecyclerView(this);
        setHasFixedSize(true);
    }

    public static final void a(SnapScrollRecyclerView snapScrollRecyclerView) {
        RecyclerView.o layoutManager = snapScrollRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        float measuredWidth = snapScrollRecyclerView.getMeasuredWidth() / 2.0f;
        int childCount = layoutManager.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                float abs = Math.abs(measuredWidth - ((childAt.getMeasuredWidth() / 2.0f) + childAt.getLeft()));
                View findViewById = childAt.findViewById(R.id.background);
                if (abs > childAt.getMeasuredWidth()) {
                    findViewById.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    findViewById.setAlpha(1.0f - (abs / childAt.getMeasuredWidth()));
                }
            }
        }
    }

    public final Interpolator getInterpolator() {
        return this.f;
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

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void scrollToPosition(int i) {
        RecyclerView.o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            layoutManager.smoothScrollToPosition(this, null, i);
        }
    }

    public final void setOnSnapPositionChangeListener(a aVar) {
        this.d.c = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, this.f);
    }
}
