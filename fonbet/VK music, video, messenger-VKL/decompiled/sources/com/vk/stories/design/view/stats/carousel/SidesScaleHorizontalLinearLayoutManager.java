package com.vk.stories.design.view.stats.carousel;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import xsna.qlj0;

/* compiled from: SidesScaleHorizontalLinearLayoutManager.kt */
/* loaded from: classes6.dex */
public final class SidesScaleHorizontalLinearLayoutManager extends LinearLayoutManager {
    public final void P() {
        float width = getWidth() / 2.0f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                return;
            }
            float decoratedLeft = getDecoratedLeft(childAt);
            float decoratedRight = getDecoratedRight(childAt);
            float f = (decoratedLeft + decoratedRight) / 2.0f;
            float f2 = decoratedRight - decoratedLeft;
            float abs = Math.abs(width - f);
            if (abs > f2) {
                abs = f2;
            }
            float f3 = 1.0f;
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f3 = 1.0f - ((abs / f2) * 0.19999999f);
            }
            childAt.setScaleX(f3);
            childAt.setScaleY(f3);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        P();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, vVar, a0Var);
        P();
        return scrollHorizontallyBy;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        qlj0 qlj0Var = new qlj0(recyclerView.getContext());
        qlj0Var.setTargetPosition(i);
        startSmoothScroll(qlj0Var);
    }
}
