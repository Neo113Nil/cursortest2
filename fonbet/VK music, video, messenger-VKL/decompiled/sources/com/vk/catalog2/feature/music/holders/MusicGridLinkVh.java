package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.LinkVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ag20;
import xsna.b5a;
import xsna.k7a;
import xsna.msy;
import xsna.nm40;

/* compiled from: MusicGridLinkVh.kt */
/* loaded from: classes16.dex */
public final class MusicGridLinkVh implements CatalogViewHolder {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final CatalogViewType d;
    public final k7a e;
    public final LinkVh.a f;
    public RecyclerView g;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new ag20(this, 5));

    /* compiled from: MusicGridLinkVh.kt */
    public static final class a extends GridLayoutManager.c {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            RecyclerView recyclerView = MusicGridLinkVh.this.g;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                if (itemCount % 2 != 0 && i == itemCount - 1) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public MusicGridLinkVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, CatalogViewType catalogViewType, k7a k7aVar, LinkVh.a aVar) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = catalogViewType;
        this.e = k7aVar;
        this.f = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            ((nm40) this.h.getValue()).setItems(((UIBlockList) uIBlock).y);
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
        recyclerView.setAdapter((nm40) this.h.getValue());
        recyclerView.setPadding(0, 0, 0, 0);
        recyclerView.setHasFixedSize(true);
        this.g = recyclerView;
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
