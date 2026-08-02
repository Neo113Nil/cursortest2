package com.vk.music.snippet.ui.presentation.base.view;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import xsna.zck0;

/* compiled from: SnippetZoomLayoutManager.kt */
/* loaded from: classes3.dex */
public final class SnippetZoomLayoutManager extends LinearLayoutManager {
    public final boolean r;

    public SnippetZoomLayoutManager() {
        super(0, false);
        this.r = true;
    }

    public final void P() {
        float width = getWidth() / 2.0f;
        float f = width * 0.9f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                return;
            }
            float min = Math.min(f, Math.abs(width - ((getDecoratedRight(childAt) + getDecoratedLeft(childAt)) / 2.0f)));
            float f2 = f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f3 = f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1.0f + (((min - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * (-0.100000024f)) / f2) : 1.0f;
            childAt.setScaleX(f3);
            childAt.setScaleY(f3);
            if (this.r && (childAt instanceof zck0)) {
                ((zck0) childAt).setActionsAlpha(((f3 - 0.9f) / 0.1f) * 1);
            }
            childAt.getParent().requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        if (this.b == 0) {
            P();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.b != 0) {
            return 0;
        }
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, vVar, a0Var);
        P();
        return scrollHorizontallyBy;
    }
}
