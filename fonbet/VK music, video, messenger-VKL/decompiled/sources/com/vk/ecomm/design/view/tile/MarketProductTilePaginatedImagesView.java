package com.vk.ecomm.design.view.tile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g0;
import com.vk.core.tool.view.NestedScrollableRecyclerView;
import com.vk.ecomm.design.view.MarketPaginationDotsView;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bq00;
import xsna.cnh;
import xsna.gph;
import xsna.iah0;
import xsna.iwt0;
import xsna.nnw;
import xsna.t210;
import xsna.t910;
import xsna.tjw;
import xsna.yc10;

/* compiled from: MarketProductTilePaginatedImagesView.kt */
/* loaded from: classes18.dex */
public final class MarketProductTilePaginatedImagesView extends FrameLayout {
    public static final /* synthetic */ int l = 0;
    public final nnw b;
    public final NestedScrollableRecyclerView c;
    public final MarketPaginationDotsView d;
    public int e;
    public List<tjw> f;
    public MarketProductTileConfig.g g;
    public int h;
    public int i;
    public bq00 j;
    public t210 k;

    /* compiled from: MarketProductTilePaginatedImagesView.kt */
    public static final class a extends RecyclerView.t {
        public final /* synthetic */ g0 c;

        public a(g0 g0Var) {
            this.c = g0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            View findSnapView;
            int position;
            int i3;
            int i4;
            int i5 = MarketProductTilePaginatedImagesView.l;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            MarketProductTilePaginatedImagesView marketProductTilePaginatedImagesView = MarketProductTilePaginatedImagesView.this;
            if (marketProductTilePaginatedImagesView.e <= 1 || linearLayoutManager == null || (findSnapView = this.c.findSnapView(linearLayoutManager)) == null || (position = linearLayoutManager.getPosition(findSnapView)) == (i3 = marketProductTilePaginatedImagesView.h) || position < 0) {
                return;
            }
            marketProductTilePaginatedImagesView.h = position;
            int i6 = position % marketProductTilePaginatedImagesView.e;
            marketProductTilePaginatedImagesView.i = i6;
            marketProductTilePaginatedImagesView.d.setCurrentPage(i6);
            bq00 bq00Var = marketProductTilePaginatedImagesView.j;
            if (bq00Var != null) {
                bq00Var.invoke(Integer.valueOf(i6));
            }
            if (marketProductTilePaginatedImagesView.h > i3) {
                i4 = (i6 + 1) % marketProductTilePaginatedImagesView.e;
            } else {
                int i7 = marketProductTilePaginatedImagesView.e;
                i4 = (i6 - 1) % i7;
                if (i4 < 0) {
                    i4 += i7;
                }
            }
            iwt0.a(marketProductTilePaginatedImagesView, new gph(i4, marketProductTilePaginatedImagesView));
        }
    }

    public MarketProductTilePaginatedImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = EmptyList.b;
        LayoutInflater.from(context).inflate(R.layout.market_product_tile_paginated_images, this);
        nnw nnwVar = new nnw(new cnh(this, 19));
        this.b = nnwVar;
        NestedScrollableRecyclerView nestedScrollableRecyclerView = (NestedScrollableRecyclerView) findViewById(R.id.recycler_view_images);
        this.c = nestedScrollableRecyclerView;
        nestedScrollableRecyclerView.setAdapter(nnwVar);
        g0 g0Var = new g0();
        g0Var.attachToRecyclerView(nestedScrollableRecyclerView);
        MarketPaginationDotsView marketPaginationDotsView = (MarketPaginationDotsView) findViewById(R.id.pager_dots);
        this.d = marketPaginationDotsView;
        marketPaginationDotsView.setSize(t910.e);
        nestedScrollableRecyclerView.addOnScrollListener(new a(g0Var));
        float b = iah0.b(10.0f);
        nestedScrollableRecyclerView.setClipToOutline(true);
        nestedScrollableRecyclerView.setOutlineProvider(new yc10(b));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.e <= 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
