package com.vk.catalog2.common.ui.holders.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.ui.SearchParametersBottomView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.awt0;
import xsna.dw20;
import xsna.gzs;
import xsna.izs;
import xsna.p01;
import xsna.q01;
import xsna.q090;
import xsna.rjd;
import xsna.wet0;

/* compiled from: VideoSearchParamsVh.kt */
/* loaded from: classes16.dex */
public final class VideoSearchParamsVh implements CatalogViewHolder {
    public final VideoHidingToolbarVh b;
    public final gzs<View> c;
    public final FunctionReferenceImpl d;
    public final boolean e;
    public final wet0 f;
    public SearchParametersBottomView g;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSearchParamsVh(VideoHidingToolbarVh videoHidingToolbarVh, gzs gzsVar, izs izsVar, boolean z, izs izsVar2, izs izsVar3, VideoSearchFiltersImpl videoSearchFiltersImpl) {
        this.b = videoHidingToolbarVh;
        this.c = gzsVar;
        this.d = (FunctionReferenceImpl) izsVar;
        this.e = z;
        this.f = new wet0(izsVar2, new rjd(0, this, VideoSearchParamsVh.class, "showFilterParams", "showFilterParams()V", 0, 7), new q090(0, this, VideoSearchParamsVh.class, "hideFilterParams", "hideFilterParams()V", 0, 3), false, izsVar, izsVar3, videoSearchFiltersImpl, z);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        wet0 wet0Var = this.f;
        dw20 dw20Var = wet0Var.j;
        if (dw20Var != null) {
            dw20Var.tn();
        }
        wet0Var.j = null;
    }

    public final void a(boolean z) {
        this.f.c(z);
    }

    public final void b() {
        if (this.e) {
            SearchParametersBottomView searchParametersBottomView = this.g;
            if (searchParametersBottomView == null) {
                searchParametersBottomView = null;
            }
            String f = this.f.f(searchParametersBottomView.getContext());
            SearchParametersBottomView searchParametersBottomView2 = this.g;
            if (searchParametersBottomView2 == null) {
                searchParametersBottomView2 = null;
            }
            searchParametersBottomView2.setParameters(f);
            SearchParametersBottomView searchParametersBottomView3 = this.g;
            if (searchParametersBottomView3 == null) {
                searchParametersBottomView3 = null;
            }
            searchParametersBottomView3.setVisibility(0);
            View invoke = this.c.invoke();
            if (invoke != null) {
                SearchParametersBottomView searchParametersBottomView4 = this.g;
                awt0.x(invoke, 0, 0, 0, (searchParametersBottomView4 != null ? searchParametersBottomView4 : null).getPanelHeight(), 7);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_root_vh_layout_no_behaviour, viewGroup, false);
        viewGroup2.addView(this.b.k5(layoutInflater, viewGroup2, bundle));
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater.inflate(R.layout.catalog2_video_search_filter, viewGroup, false);
        SearchParametersBottomView searchParametersBottomView = (SearchParametersBottomView) viewGroup3.findViewById(R.id.search_parameters_view);
        this.g = searchParametersBottomView;
        if (searchParametersBottomView == null) {
            searchParametersBottomView = null;
        }
        searchParametersBottomView.setOnCloseClickListener(new p01(this, 14));
        SearchParametersBottomView searchParametersBottomView2 = this.g;
        (searchParametersBottomView2 != null ? searchParametersBottomView2 : null).setOnClickListener(new q01(this, 14));
        boolean I = this.f.g.I();
        if (!I) {
            b();
            this.d.invoke(Boolean.valueOf(I));
        }
        viewGroup2.addView(viewGroup3);
        return viewGroup2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
