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
import xsna.fr20;
import xsna.msy;
import xsna.pl40;
import xsna.v100;
import xsna.w8i;

/* compiled from: MusicKidsAgeCategoryVh.kt */
/* loaded from: classes16.dex */
public final class MusicKidsAgeCategoryVh implements CatalogViewHolder, w8i {
    public final Object b;
    public final Object c;

    public MusicKidsAgeCategoryVh() {
        v100 v100Var = new v100(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, v100Var);
        this.c = msy.a(lazyThreadSafetyMode, new fr20(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            ((pl40) this.c.getValue()).setItems(((UIBlockList) uIBlock).y);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_kids_age_category, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.music_kids_age_category_recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((pl40) this.c.getValue());
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
