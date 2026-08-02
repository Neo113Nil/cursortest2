package com.vk.reactions.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import xsna.cn70;
import xsna.j0f0;
import xsna.swe0;
import xsna.t2f0;

/* compiled from: GridReactionsPaginatedView.kt */
/* loaded from: classes5.dex */
public final class GridReactionsPaginatedView extends RecyclerPaginatedView {
    public static final float Q = cn70.a() * 360.0f;
    public static final float R = cn70.a() * 170.0f;
    public static final float S = cn70.a() * 56.0f;
    public static final float T = cn70.a() * 12.0f;
    public j0f0 N;
    public t2f0 O;
    public boolean P;

    public GridReactionsPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView, xsna.too0
    public final void Ng() {
        super.Ng();
        x();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        RecyclerView recyclerView = this.x;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        int g = swe0.g((int) (View.MeasureSpec.getSize(i) / (this.P ? R : Q)), 1, 4);
        Integer valueOf = gridLayoutManager != null ? Integer.valueOf(gridLayoutManager.s) : null;
        if (valueOf != null && g == valueOf.intValue()) {
            if (this.N == null) {
                x();
                return;
            }
            return;
        }
        t2f0 t2f0Var = this.O;
        if (t2f0Var != null) {
            t2f0Var.e = g;
        }
        setFixedSpanCount(g);
        if (gridLayoutManager != null) {
            gridLayoutManager.requestLayout();
        }
        x();
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroidx/recyclerview/widget/RecyclerView$e0;V:Landroidx/recyclerview/widget/RecyclerView$Adapter<TT;>;:Lxsna/vic;>(TV;)V */
    @Override // com.vk.lists.RecyclerPaginatedView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.O = adapter instanceof t2f0 ? (t2f0) adapter : null;
        super.setAdapter(adapter);
    }

    public final void setCards(boolean z) {
        this.P = z;
        if (this.N != null) {
            x();
        }
    }

    public final void x() {
        RecyclerView recyclerView = this.x;
        if (recyclerView == null) {
            return;
        }
        j0f0 j0f0Var = this.N;
        if (j0f0Var != null) {
            recyclerView.removeItemDecoration(j0f0Var);
        }
        t2f0 t2f0Var = this.O;
        if (t2f0Var == null) {
            return;
        }
        j0f0 j0f0Var2 = new j0f0(getContext(), t2f0Var);
        recyclerView.addItemDecoration(j0f0Var2);
        this.N = j0f0Var2;
    }
}
