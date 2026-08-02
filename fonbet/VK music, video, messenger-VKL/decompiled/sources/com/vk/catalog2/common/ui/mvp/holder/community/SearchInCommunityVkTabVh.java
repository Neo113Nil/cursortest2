package com.vk.catalog2.common.ui.mvp.holder.community;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.d;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c5g;
import xsna.e43;
import xsna.f4m;
import xsna.nxv0;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: SearchInCommunityVkTabVh.kt */
/* loaded from: classes16.dex */
public final class SearchInCommunityVkTabVh implements TabLayoutViewHolder, CatalogViewHolder {
    public final ViewPagerVh b;
    public VkTabs c;
    public UIBlockCatalog d;
    public ArrayList<UIBlock> e;
    public ArrayList<CatalogDataType> f;

    public SearchInCommunityVkTabVh(ViewPagerVh viewPagerVh) {
        this.b = viewPagerVh;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockCatalog) || uIBlock.equals(this.d)) {
            return;
        }
        UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        this.d = uIBlockCatalog;
        this.e = arrayList;
        VkTabs vkTabs = this.c;
        if (vkTabs == null) {
            vkTabs = null;
        }
        int i = VkTabs.t;
        vkTabs.h(true);
        ArrayList<CatalogDataType> arrayList2 = new ArrayList<>(c5g.u(arrayList, 10));
        for (UIBlock uIBlock2 : arrayList) {
            CatalogDataType catalogDataType = uIBlock2.o;
            if (catalogDataType == null) {
                catalogDataType = uIBlock2.e;
            }
            arrayList2.add(catalogDataType);
        }
        this.f = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UIBlockList) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            UIBlockList uIBlockList = (UIBlockList) next;
            VkTabs vkTabs2 = this.c;
            if (vkTabs2 == null) {
                vkTabs2 = null;
            }
            vkTabs2.a(new a());
            VkTabs vkTabs3 = this.c;
            VkTabs vkTabs4 = vkTabs3 == null ? null : vkTabs3;
            int i4 = d.G;
            if (vkTabs3 == null) {
                vkTabs3 = null;
            }
            nxv0 a2 = d.a.a(vkTabs3.getContext());
            a2.setText(uIBlockList.z);
            vkTabs4.b(new VkTabs.c(a2), true);
            i2 = i3;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void cc(ViewPager.j jVar) {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.addOnPageChangeListener(jVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        VkTabs vkTabs = this.c;
        if (vkTabs == null) {
            vkTabs = null;
        }
        f4m.j(vkTabs);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_search_in_community_tabs, viewGroup, false);
        this.c = (VkTabs) inflate.findViewById(R.id.search_in_community_tabs);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final int rc() {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        return disableableViewPager.getCurrentItem();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void s8(ViewPager.j jVar) {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnPageChangeListener(jVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        VkTabs vkTabs = this.c;
        if (vkTabs == null) {
            vkTabs = null;
        }
        vkTabs.setVisibility(0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    /* compiled from: SearchInCommunityVkTabVh.kt */
    public static final class a implements VkTabs.b {
        public a() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void c(VkTabs.c cVar) {
            UIBlock uIBlock;
            String str;
            SearchInCommunityVkTabVh searchInCommunityVkTabVh = SearchInCommunityVkTabVh.this;
            ArrayList<UIBlock> arrayList = searchInCommunityVkTabVh.e;
            if (arrayList == null || (uIBlock = arrayList.get(cVar.b)) == null || (str = uIBlock.c) == null) {
                return;
            }
            searchInCommunityVkTabVh.b.A(str);
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void b() {
        }

        @Override // com.vk.core.view.components.tabs.VkTabs.b
        public final void a(VkTabs.c cVar) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void K5(wzs<? super Integer, ? super TabView, s3q0> wzsVar) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
