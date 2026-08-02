package com.vk.catalog2.common.ui.mvp.holder.header;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.f4m;
import xsna.gzs;
import xsna.iah0;
import xsna.jjc;
import xsna.m33;
import xsna.mk5;
import xsna.rx20;
import xsna.s3q0;
import xsna.w2o0;
import xsna.zmp0;

/* compiled from: VkSlidableSearchQueryVh.kt */
/* loaded from: classes16.dex */
public final class VkSlidableSearchQueryVh implements CatalogSearchQueryViewHolder {
    public final SearchQueryVh b;
    public ImageView c;
    public FrameLayout d;
    public ImageView e;
    public TextView f;
    public View g;
    public final int h = iah0.a(52);
    public final int i = iah0.a(8);

    public VkSlidableSearchQueryVh(SearchQueryVh searchQueryVh) {
        this.b = searchQueryVh;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Fb() {
        this.b.Fb();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void K6(boolean z) {
        this.b.K6(true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Kf(gzs<s3q0> gzsVar) {
        throw null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Km(long j) {
        this.b.Km(0L);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.g = null;
        this.b.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ml(int i, int i2) {
        ImageView imageView = this.e;
        if (imageView != null) {
            w2o0.a.a(i, i2).a(imageView, true);
            bwt0.p0(imageView, true);
        }
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(String.valueOf(0));
            bwt0.p0(textView, false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.b.getClass();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void P1(String str) {
        this.b.P1(str);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void Ta() {
        this.b.Ta();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final Boolean c9() {
        return this.b.c9();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        View view = this.g;
        if (view != null) {
            f4m.j(view);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final String i() {
        return this.b.i();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void k3() {
        this.b.k3();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SearchQueryVh searchQueryVh = this.b;
        gzs<Boolean> gzsVar = searchQueryVh.c;
        searchQueryVh.c = null;
        View inflate = layoutInflater.inflate(R.layout.vk_catalog_search_slidable_query_view, viewGroup, false);
        this.g = inflate;
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.e = (ImageView) viewGroup2.findViewById(R.id.iv_icon_right);
        this.f = (TextView) viewGroup2.findViewById(R.id.tv_icon_right_badge);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.back_btn);
        jjc.g(imageView, new rx20(2, gzsVar));
        Context context = imageView.getContext();
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(m33.a(R.drawable.vk_icon_arrow_left_outline_28, context));
        this.c = imageView;
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.search_container);
        frameLayout.addView(searchQueryVh.k5(layoutInflater, viewGroup2, bundle));
        this.d = frameLayout;
        ModernSearchView modernSearchView = searchQueryVh.k;
        if (modernSearchView != null) {
            modernSearchView.setSearchBoxBackground(null);
            ViewGroup viewGroup3 = modernSearchView.n;
            if (viewGroup3 != null) {
                bwt0.p0(viewGroup3, true);
            }
        }
        ModernSearchView modernSearchView2 = searchQueryVh.k;
        if (modernSearchView2 != null) {
            modernSearchView2.i(iah0.a(16), iah0.a(12));
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void om(boolean z) {
        this.b.om(true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final ModernSearchView pi() {
        return this.b.k;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.b.getClass();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void y8() {
        ImageView imageView = this.c;
        if (imageView != null && bwt0.K(imageView)) {
            mk5 mk5Var = new mk5();
            mk5Var.e(100L);
            zmp0.a((ViewGroup) this.g, mk5Var);
            bwt0.p0(imageView, false);
        }
        FrameLayout frameLayout = this.d;
        if (frameLayout != null) {
            f4m.s(this.i, frameLayout);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        this.b.getClass();
        return false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder
    public final void zf(String str, boolean z) {
        this.b.zf(str, z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
