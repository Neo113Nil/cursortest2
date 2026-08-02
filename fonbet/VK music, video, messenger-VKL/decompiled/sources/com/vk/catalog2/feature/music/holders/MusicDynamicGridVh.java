package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.content.res.Configuration;
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
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.cr20;
import xsna.fnj;
import xsna.g380;
import xsna.iah0;
import xsna.l500;
import xsna.mj40;
import xsna.msy;
import xsna.w8i;

/* compiled from: MusicDynamicGridVh.kt */
/* loaded from: classes16.dex */
public final class MusicDynamicGridVh implements CatalogViewHolder, g380, w8i {
    public final Object b;
    public RecyclerView c;
    public final Object d;

    public MusicDynamicGridVh() {
        cr20 cr20Var = new cr20(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, cr20Var);
        this.d = msy.a(lazyThreadSafetyMode, new l500(this, 12));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockList) {
            ((mj40) this.d.getValue()).setItems(((UIBlockList) uIBlock).y);
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_dynamic_grid, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.music_dynamic_grid_recycler);
        Context context = recyclerView.getContext();
        HashSet hashSet = iah0.a;
        recyclerView.setLayoutManager(new GridLayoutManager(!iah0.s(context) ? 4 : fnj.d(context) ? 3 : 2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((mj40) this.d.getValue());
        recyclerView.setHasFixedSize(true);
        this.c = recyclerView;
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        Context context;
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.c;
        if (recyclerView2 == null || (context = recyclerView2.getContext()) == null || (recyclerView = this.c) == null) {
            return;
        }
        HashSet hashSet = iah0.a;
        recyclerView.setLayoutManager(new GridLayoutManager(!iah0.s(context) ? 4 : fnj.d(context) ? 3 : 2));
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
