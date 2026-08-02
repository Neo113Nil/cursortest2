package com.vk.catalog2.feature.music.holders;

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
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.a040;
import xsna.e1a;
import xsna.msy;
import xsna.p6y;
import xsna.sl40;
import xsna.w8i;

/* compiled from: MusicKidsCatalogVh.kt */
/* loaded from: classes16.dex */
public final class MusicKidsCatalogVh implements CatalogViewHolder, w8i {
    public final e1a b;
    public RecyclerView c;
    public final Object d;
    public final Object e;

    /* compiled from: MusicKidsCatalogVh.kt */
    public static final class a extends GridLayoutManager.c {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            RecyclerView recyclerView = MusicKidsCatalogVh.this.c;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                if (itemCount % 2 != 0 && itemCount - 1 == i) {
                    return 2;
                }
            }
            return 1;
        }
    }

    public MusicKidsCatalogVh(e1a e1aVar) {
        this.b = e1aVar;
        a040 a040Var = new a040(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, a040Var);
        this.e = msy.a(lazyThreadSafetyMode, new p6y(this, 10));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            ((sl40) this.e.getValue()).setItems(((UIBlockList) uIBlock).y);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_kids_catalog, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.music_kids_catalog_recycler);
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.x = new a();
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((sl40) this.e.getValue());
        recyclerView.setHasFixedSize(true);
        this.c = recyclerView;
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
