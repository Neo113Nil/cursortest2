package com.vk.catalog2.feature.music.holders.search;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.izs;
import xsna.jai;
import xsna.mba;
import xsna.mut0;
import xsna.pn0;
import xsna.rv7;
import xsna.vq;
import xsna.wh50;
import xsna.zak0;
import xsna.zuh0;

/* compiled from: SearchHistoryItemVh.kt */
/* loaded from: classes16.dex */
public abstract class SearchHistoryItemVh implements ResumableViewHolder {
    public final Context b;
    public final mba c;
    public UIBlockSearchHistory<?> d;
    public final pn0 e = new pn0(4);
    public ComposeView f;

    public SearchHistoryItemVh(Context context, mba mbaVar) {
        this.b = context;
        this.c = mbaVar;
    }

    public abstract void a(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context);

    public abstract void b(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context);

    public abstract void d(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context);

    public final String e(int i, String str) {
        Context context = this.b;
        String string = context.getString(i);
        return (str == null || str.length() == 0) ? string : context.getString(R.string.music_search_history_subtitle_template, string, str);
    }

    public final void g(izs<? super zuh0, zuh0> izsVar) {
        zak0 zak0Var = (zak0) ((wh50) this.e.a);
        zak0Var.setValue(izsVar.invoke(zak0Var.getValue()));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(this.b, null, 6);
        vq.b(-1, -2, composeView);
        composeView.setViewCompositionStrategy(mut0.a.a);
        composeView.setContent(new jai(212344466, new rv7(6, this, composeView), true));
        this.f = composeView;
        return composeView;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public void onPause() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.ResumableViewHolder
    public void onResume() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    public void c(UIBlockSearchHistory<?> uIBlockSearchHistory, Context context) {
    }
}
