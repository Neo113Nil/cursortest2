package com.vk.catalog2.feature.music.holders.podcast;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.mgb0;
import xsna.msy;
import xsna.wp40;

/* compiled from: PodcastCategoryVh.kt */
/* loaded from: classes16.dex */
public final class PodcastCategoryVh implements CatalogViewHolder {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new wp40(this, 14));

    public PodcastCategoryVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            ((mgb0) this.d.getValue()).setItems(((UIBlockList) uIBlock).y);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_podcast_category, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.podcast_category_recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((mgb0) this.d.getValue());
        recyclerView.setHasFixedSize(true);
        return inflate;
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
