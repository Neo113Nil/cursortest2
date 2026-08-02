package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.b5a;
import xsna.de40;
import xsna.epx;
import xsna.j5g;
import xsna.lga;
import xsna.msy;
import xsna.r010;

/* compiled from: MusicCategoryVh.kt */
/* loaded from: classes16.dex */
public final class MusicCategoryVh implements CatalogViewHolder {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final lga d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new r010(this, 9));

    /* compiled from: MusicCategoryVh.kt */
    public static final class a extends GridLayoutManager.c {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            CatalogLink catalogLink;
            Object b0 = j5g.b0(i, ((de40) MusicCategoryVh.this.e.getValue()).y0());
            String str = null;
            UIBlockLink uIBlockLink = b0 instanceof UIBlockLink ? (UIBlockLink) b0 : null;
            if (uIBlockLink != null && (catalogLink = uIBlockLink.y) != null) {
                str = catalogLink.b;
            }
            return epx.f(str, "synthetic_offline_music_autodownload_all") ? 2 : 1;
        }
    }

    public MusicCategoryVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, lga lgaVar) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = lgaVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            ((de40) this.e.getValue()).setItems(((UIBlockList) uIBlock).y);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_podcast_category, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.podcast_category_recycler);
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.x = new a();
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((de40) this.e.getValue());
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
