package com.vk.catalog2.common.ui.mvp.holder.video.seasons;

import android.R;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.lists.c;
import xsna.e3m;
import xsna.eha;
import xsna.iah0;
import xsna.kfv;
import xsna.n4t0;
import xsna.u4a;
import xsna.xet0;
import xsna.y1a;

/* compiled from: VideoSeasonsHorizontalVh.kt */
/* loaded from: classes16.dex */
public final class VideoSeasonsHorizontalVh extends HorizontalListVh implements eha {
    public RecyclerView w;
    public int x;
    public final xet0 y;

    public VideoSeasonsHorizontalVh(n4t0 n4t0Var, c.h hVar, y1a y1aVar, u4a u4aVar) {
        super(n4t0Var, hVar, y1aVar, u4aVar, null, n4t0Var.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar));
        this.y = new xet0(this);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.w = null;
    }

    @Override // xsna.eha
    public final void b(View view) {
        RecyclerView.o layoutManager;
        RecyclerView recyclerView = this.w;
        if (recyclerView != null) {
            recyclerView.stopScroll();
        }
        Parcelable parcelable = null;
        kfv kfvVar = view instanceof kfv ? (kfv) view : null;
        RecyclerView recyclerView2 = kfvVar != null ? kfvVar.getRecyclerView() : null;
        if (recyclerView2 == null) {
            return;
        }
        RecyclerView recyclerView3 = this.w;
        if (recyclerView3 != null && (layoutManager = recyclerView3.getLayoutManager()) != null) {
            parcelable = layoutManager.onSaveInstanceState();
        }
        RecyclerView.o layoutManager2 = recyclerView2.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(parcelable);
        }
        recyclerView2.addOnScrollListener(this.y);
    }

    @Override // xsna.eha
    public final void e(View view) {
        kfv kfvVar = view instanceof kfv ? (kfv) view : null;
        RecyclerView recyclerView = kfvVar != null ? kfvVar.getRecyclerView() : null;
        if (recyclerView == null) {
            return;
        }
        recyclerView.stopScroll();
        recyclerView.removeOnScrollListener(this.y);
        RecyclerView recyclerView2 = this.w;
        if (recyclerView2 != null) {
            recyclerView2.scrollBy(this.x, 0);
        }
        this.x = 0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        k5.setBackground(e3m.e(R.attr.windowBackground, k5.getContext()));
        float f = 8;
        k5.setPadding(0, iah0.a(f), 0, iah0.a(f));
        this.w = ((kfv) k5).getRecyclerView();
        return k5;
    }
}
