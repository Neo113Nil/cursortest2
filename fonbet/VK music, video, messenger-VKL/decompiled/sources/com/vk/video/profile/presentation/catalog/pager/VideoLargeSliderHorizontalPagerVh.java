package com.vk.video.profile.presentation.catalog.pager;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration$Companion$ContainerType;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh;
import com.vk.core.view.components.pagination.VkPaginationDots;
import com.vk.core.view.components.pagination.a;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vkontakte.android.R;
import xsna.ddh0;
import xsna.gh1;
import xsna.hbt0;
import xsna.hod;
import xsna.iah0;
import xsna.ic3;
import xsna.kfv;
import xsna.ku5;
import xsna.m67;
import xsna.nq4;
import xsna.swe0;
import xsna.tev;
import xsna.u4a;
import xsna.wd2;
import xsna.y1a;
import xsna.y6t0;

/* compiled from: VideoLargeSliderHorizontalPagerVh.kt */
/* loaded from: classes6.dex */
public final class VideoLargeSliderHorizontalPagerVh extends HorizontalListVh {
    public hbt0 A;
    public final g0 w;
    public FrameLayout x;
    public VkPaginationDots y;
    public a z;

    /* compiled from: VideoLargeSliderHorizontalPagerVh.kt */
    public static final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                VideoLargeSliderHorizontalPagerVh videoLargeSliderHorizontalPagerVh = VideoLargeSliderHorizontalPagerVh.this;
                videoLargeSliderHorizontalPagerVh.w();
                hbt0 hbt0Var = videoLargeSliderHorizontalPagerVh.A;
                if (hbt0Var != null) {
                    hbt0Var.n();
                }
            }
        }
    }

    public VideoLargeSliderHorizontalPagerVh(y6t0 y6t0Var, c.h hVar, y1a y1aVar, u4a u4aVar) {
        super(y6t0Var, hVar, y1aVar, u4aVar, null, y6t0Var.A(CatalogConfiguration$Companion$ContainerType.HORIZONTAL, u4aVar));
        this.w = new g0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        RecyclerPaginatedView l = l();
        RecyclerView recyclerView = l != null ? l.getRecyclerView() : null;
        a aVar = this.z;
        if (aVar != null && recyclerView != null) {
            recyclerView.removeOnScrollListener(aVar);
        }
        this.z = null;
        hbt0 hbt0Var = this.A;
        if (hbt0Var != null) {
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(hbt0Var);
            }
            hbt0Var.u();
        }
        this.A = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogPaginatedViewHolder
    public final void N5(UIBlock uIBlock) {
        RecyclerView recyclerView;
        VkPaginationDots vkPaginationDots;
        super.N5(uIBlock);
        int size = ((UIBlockList) uIBlock).y.size();
        FrameLayout frameLayout = this.x;
        if (frameLayout != null && (vkPaginationDots = this.y) != null) {
            if (size > 1) {
                frameLayout.setVisibility(0);
                vkPaginationDots.setDotsCount(size);
            } else {
                frameLayout.setVisibility(8);
            }
            vkPaginationDots.setCurrentDotIndex(0);
        }
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new hod(this, 20));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        RecyclerView recyclerView;
        VkPaginationDots vkPaginationDots;
        super.N6(uIBlock);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return;
        }
        int size = uIBlockList.y.size();
        FrameLayout frameLayout = this.x;
        if (frameLayout != null && (vkPaginationDots = this.y) != null) {
            if (size > 1) {
                frameLayout.setVisibility(0);
                vkPaginationDots.setDotsCount(size);
            } else {
                frameLayout.setVisibility(8);
            }
            vkPaginationDots.setCurrentDotIndex(0);
        }
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new ic3(this, 11));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        kfv kfvVar = (kfv) super.k5(layoutInflater, viewGroup, bundle);
        RecyclerView recyclerView = kfvVar.getRecyclerView();
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setPadding(0, 0, 0, 0);
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.removeItemDecorationAt(0);
        }
        if (recyclerView.getOnFlingListener() == null) {
            this.w.attachToRecyclerView(recyclerView);
        }
        hbt0 hbt0Var = this.A;
        if (hbt0Var != null) {
            recyclerView.removeOnScrollListener(hbt0Var);
            hbt0Var.u();
        }
        m m = m();
        tev tevVar = tev.a;
        hbt0 hbt0Var2 = new hbt0(context, this.i, m, new ddh0(3), null, 131056);
        recyclerView.addOnScrollListener(hbt0Var2);
        this.A = hbt0Var2;
        a aVar = this.z;
        if (aVar != null) {
            recyclerView.removeOnScrollListener(aVar);
        }
        a aVar2 = new a();
        this.z = aVar2;
        recyclerView.addOnScrollListener(aVar2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(kfvVar, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        frameLayout.setPadding(0, iah0.a(12), 0, 0);
        frameLayout.setVisibility(8);
        VkPaginationDots vkPaginationDots = new VkPaginationDots(context, null, 6);
        vkPaginationDots.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        vkPaginationDots.setMode(a.C0850a.a);
        vkPaginationDots.setDotsColor(R.attr.vk_ui_icon_secondary);
        vkPaginationDots.setMaxVisibleDots(7);
        frameLayout.addView(vkPaginationDots);
        linearLayout.addView(frameLayout);
        this.x = frameLayout;
        this.y = vkPaginationDots;
        recyclerView.post(new m67(this, 13));
        return linearLayout;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        RecyclerView recyclerView;
        super.onConfigurationChanged(configuration);
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new gh1(this, 10));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.container.HorizontalListVh, com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public final void onResume() {
        RecyclerView recyclerView;
        super.onResume();
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new wd2(this, 11));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh, xsna.rda
    public final void s() {
        RecyclerView recyclerView;
        super.s();
        RecyclerPaginatedView l = l();
        if (l == null || (recyclerView = l.getRecyclerView()) == null) {
            return;
        }
        recyclerView.post(new nq4(this, 11));
    }

    public final void w() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerPaginatedView l = l();
        g0 g0Var = this.w;
        if (l != null && (recyclerView2 = l.getRecyclerView()) != null) {
            RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            VkPaginationDots vkPaginationDots = this.y;
            RecyclerView.Adapter adapter = recyclerView2.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (linearLayoutManager != null && vkPaginationDots != null && itemCount > 0) {
                View findSnapView = g0Var.findSnapView(linearLayoutManager);
                if (findSnapView == null) {
                    findSnapView = linearLayoutManager.findViewByPosition(linearLayoutManager.v());
                }
                Integer valueOf = findSnapView != null ? Integer.valueOf(recyclerView2.getChildAdapterPosition(findSnapView)) : null;
                if (valueOf != null && valueOf.intValue() != -1) {
                    vkPaginationDots.setCurrentDotIndex(swe0.g(valueOf.intValue(), 0, itemCount - 1));
                }
            }
        }
        RecyclerPaginatedView l2 = l();
        if (l2 == null || (recyclerView = l2.getRecyclerView()) == null) {
            return;
        }
        RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
        if (linearLayoutManager2 == null) {
            return;
        }
        View findSnapView2 = g0Var.findSnapView(linearLayoutManager2);
        if (findSnapView2 == null && (findSnapView2 = linearLayoutManager2.findViewByPosition(linearLayoutManager2.v())) == null) {
            return;
        }
        findSnapView2.post(new ku5(4, recyclerView, findSnapView2));
    }
}
