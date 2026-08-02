package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.infiniteviewpager.ViewPagerInfinite;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.iah0;
import xsna.rle;
import xsna.sba;
import xsna.sle;
import xsna.u4a;
import xsna.xuw;
import xsna.z2;

/* compiled from: ClipsMusicSelectorCatalogPromoBannerContainerVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicSelectorCatalogPromoBannerContainerVh implements CatalogViewHolder {
    public final u4a b;
    public ViewPagerInfinite c;
    public sba d;
    public final sle e = new sle();
    public final rle f = new rle(this);

    /* compiled from: ClipsMusicSelectorCatalogPromoBannerContainerVh.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            ClipsMusicSelectorCatalogPromoBannerContainerVh clipsMusicSelectorCatalogPromoBannerContainerVh = ClipsMusicSelectorCatalogPromoBannerContainerVh.this;
            clipsMusicSelectorCatalogPromoBannerContainerVh.b.b.i.P0(clipsMusicSelectorCatalogPromoBannerContainerVh.f, true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ClipsMusicSelectorCatalogPromoBannerContainerVh clipsMusicSelectorCatalogPromoBannerContainerVh = ClipsMusicSelectorCatalogPromoBannerContainerVh.this;
            clipsMusicSelectorCatalogPromoBannerContainerVh.b.b.i.n0(clipsMusicSelectorCatalogPromoBannerContainerVh.f);
        }
    }

    public ClipsMusicSelectorCatalogPromoBannerContainerVh(u4a u4aVar) {
        this.b = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        sba sbaVar = this.d;
        if (sbaVar != null) {
            sbaVar.c();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return;
        }
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        sba sbaVar = new sba(this.b, arrayList, null, false, false, this.e, null, null, new z2(1), null, null, null);
        this.d = sbaVar;
        ViewPagerInfinite viewPagerInfinite = this.c;
        if (viewPagerInfinite == null) {
            viewPagerInfinite = null;
        }
        xuw xuwVar = new xuw(sbaVar);
        xuwVar.c = Boolean.TRUE;
        viewPagerInfinite.setAdapter(xuwVar);
        ViewPagerInfinite viewPagerInfinite2 = this.c;
        if (viewPagerInfinite2 == null) {
            viewPagerInfinite2 = null;
        }
        int currentItem = viewPagerInfinite2.getCurrentItem() % arrayList.size();
        ViewPagerInfinite viewPagerInfinite3 = this.c;
        (viewPagerInfinite3 != null ? viewPagerInfinite3 : null).setCurrentItem((arrayList.size() * 5) + currentItem, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_promo_banners_view_pager, viewGroup, false);
        ViewPagerInfinite viewPagerInfinite = (ViewPagerInfinite) inflate.findViewById(R.id.view_pager_infinite);
        viewPagerInfinite.setOffscreenPageLimit(1);
        viewPagerInfinite.setPageMargin(iah0.a(10));
        viewPagerInfinite.getRootView().addOnAttachStateChangeListener(new a());
        this.c = viewPagerInfinite;
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
