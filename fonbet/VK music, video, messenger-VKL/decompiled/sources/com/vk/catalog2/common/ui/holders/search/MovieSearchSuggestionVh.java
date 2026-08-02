package com.vk.catalog2.common.ui.holders.search;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.SearchSuggestion;
import xsna.jai;
import xsna.jf30;
import xsna.ke4;
import xsna.mno0;
import xsna.wh50;
import xsna.ydt0;
import xsna.zak0;

/* compiled from: MovieSearchSuggestionVh.kt */
/* loaded from: classes16.dex */
public final class MovieSearchSuggestionVh implements CatalogViewHolder {
    public final ydt0 b;
    public final wh50 c = k.b(null);

    public MovieSearchSuggestionVh(ydt0 ydt0Var) {
        this.b = ydt0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        SearchSuggestion searchSuggestion;
        SearchSuggestion.MovieDto movieDto;
        if ((uIBlock instanceof UIBlockSearchSuggestion) && (movieDto = (searchSuggestion = ((UIBlockSearchSuggestion) uIBlock).y).j) != null) {
            ((zak0) this.c).setValue(new jf30(movieDto.b, new mno0.i(searchSuggestion.c), movieDto.c, movieDto.d, movieDto.e, movieDto.f, movieDto.g, movieDto.h, movieDto.i));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setContent(new jai(-1214695602, new ke4(4, this, layoutInflater), true));
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
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
