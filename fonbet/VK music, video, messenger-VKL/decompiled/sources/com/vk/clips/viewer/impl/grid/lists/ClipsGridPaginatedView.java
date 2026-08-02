package com.vk.clips.viewer.impl.grid.lists;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vungle.ads.internal.protos.Sdk;
import xsna.iah0;
import xsna.kde;
import xsna.mmv;

/* compiled from: ClipsGridPaginatedView.kt */
/* loaded from: classes17.dex */
public final class ClipsGridPaginatedView extends RecyclerPaginatedView {
    public kde N;
    public mmv O;

    public ClipsGridPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RecyclerView recyclerView;
        super.onMeasure(i, i2);
        mmv mmvVar = this.O;
        if (mmvVar != null) {
            RecyclerView recyclerView2 = this.x;
            RecyclerView.o layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int max = Math.max(3, getMeasuredWidth() / iah0.a(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
            Integer valueOf = gridLayoutManager != null ? Integer.valueOf(gridLayoutManager.s) : null;
            if (valueOf != null && max == valueOf.intValue()) {
                kde kdeVar = this.N;
                if (kdeVar != null || (recyclerView = this.x) == null) {
                    return;
                }
                if (kdeVar != null) {
                    recyclerView.removeItemDecoration(kdeVar);
                }
                mmv mmvVar2 = this.O;
                if (mmvVar2 == null) {
                    return;
                }
                kde kdeVar2 = new kde(mmvVar2);
                recyclerView.addItemDecoration(kdeVar2);
                this.N = kdeVar2;
                return;
            }
            if (gridLayoutManager != null) {
                gridLayoutManager.setSpanCount(max);
            }
            mmvVar.i0(max);
            setFixedSpanCount(max);
            RecyclerView recyclerView3 = this.x;
            if (recyclerView3 == null) {
                return;
            }
            kde kdeVar3 = this.N;
            if (kdeVar3 != null) {
                recyclerView3.removeItemDecoration(kdeVar3);
            }
            mmv mmvVar3 = this.O;
            if (mmvVar3 == null) {
                return;
            }
            kde kdeVar4 = new kde(mmvVar3);
            recyclerView3.addItemDecoration(kdeVar4);
            this.N = kdeVar4;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroidx/recyclerview/widget/RecyclerView$e0;V:Landroidx/recyclerview/widget/RecyclerView$Adapter<TT;>;:Lxsna/vic;>(TV;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.lists.RecyclerPaginatedView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.O = adapter instanceof mmv ? (mmv) adapter : null;
        super.setAdapter(adapter);
    }
}
