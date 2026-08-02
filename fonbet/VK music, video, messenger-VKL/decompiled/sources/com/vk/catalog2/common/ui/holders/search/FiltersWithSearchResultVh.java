package com.vk.catalog2.common.ui.holders.search;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchQuickFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchFilter;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionResetSearchFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.dto.search.SearchQuickFilterItem;
import com.vk.dto.search.SearchQuickInnerFilterItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import xsna.amg;
import xsna.epx;
import xsna.f4m;
import xsna.gzs;
import xsna.izs;
import xsna.pgr;
import xsna.qg6;
import xsna.s3q0;
import xsna.sch;
import xsna.udr;

/* compiled from: FiltersWithSearchResultVh.kt */
/* loaded from: classes16.dex */
public final class FiltersWithSearchResultVh implements CatalogVisibleViewHolder {
    public final SearchResultsVh b;
    public final Object c;
    public final gzs<s3q0> d;
    public final izs<Boolean, s3q0> e;
    public final boolean f;
    public ViewGroup g;
    public ViewGroup h;
    public VkSubnavigationBar i;

    /* JADX WARN: Multi-variable type inference failed */
    public FiltersWithSearchResultVh(SearchResultsVh searchResultsVh, Lazy<? extends udr> lazy, gzs<s3q0> gzsVar, izs<? super Boolean, s3q0> izsVar, boolean z) {
        this.b = searchResultsVh;
        this.c = lazy;
        this.d = gzsVar;
        this.e = izsVar;
        this.f = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.i = null;
    }

    public final void a() {
        int size;
        VkSubnavigationBar vkSubnavigationBar = this.i;
        if (vkSubnavigationBar != null) {
            vkSubnavigationBar.fullScroll(17);
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.removeView(this.i);
        }
        VkSubnavigationBar vkSubnavigationBar2 = this.i;
        if (vkSubnavigationBar2 == null || vkSubnavigationBar2.h.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            vkSubnavigationBar2.e(size);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void b(UIBlockList uIBlockList) {
        VkSubnavigationBar vkSubnavigationBar;
        boolean z;
        Object obj;
        List<VkSubnavigationBar.a<?>> buttons;
        if (uIBlockList.y.isEmpty() || !(uIBlockList.y.get(0) instanceof UIBlockList)) {
            return;
        }
        VkSubnavigationBar vkSubnavigationBar2 = this.i;
        boolean z2 = true;
        if (vkSubnavigationBar2 != null && (buttons = vkSubnavigationBar2.getButtons()) != null && (!buttons.isEmpty())) {
            a();
        }
        ArrayList<UIBlock> arrayList = ((UIBlockList) uIBlockList.y.get(0)).y;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            UIBlock uIBlock = (UIBlock) obj2;
            if ((uIBlock instanceof UIBlockSearchQuickFilter) || (uIBlock instanceof UIBlockAction)) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty() || (vkSubnavigationBar = this.i) == null) {
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                f4m.j(viewGroup);
            }
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                UIBlock uIBlock2 = (UIBlock) it.next();
                if (uIBlock2 instanceof UIBlockAction) {
                    UIBlockAction uIBlockAction = (UIBlockAction) uIBlock2;
                    VkSubnavigationButton vkSubnavigationButton = new VkSubnavigationButton(vkSubnavigationBar.getContext(), null, 0, 14, 0);
                    VkSubnavigationBar.a<?> aVar = new VkSubnavigationBar.a<>(vkSubnavigationButton);
                    vkSubnavigationButton.setMode(SubnavigationButton.Mode.Outline);
                    vkSubnavigationButton.setRightIconVisible(z2);
                    if (uIBlockAction instanceof UIBlockActionResetSearchFilter) {
                        vkSubnavigationButton.Q0(Integer.valueOf(R.drawable.vk_icon_cancel_16));
                        aVar.a(z2);
                        vkSubnavigationButton.setClickListener(new amg(2, (UIBlockActionResetSearchFilter) uIBlockAction, this));
                    } else if (uIBlockAction instanceof UIBlockActionOpenSearchFilter) {
                        vkSubnavigationButton.setLeftIconVisible(false);
                        vkSubnavigationButton.setRightIconVisible(z2);
                        vkSubnavigationButton.Q0(Integer.valueOf(R.drawable.vk_icon_sliders_outline_16));
                        vkSubnavigationButton.setContentDescription(vkSubnavigationBar.getContext().getString(R.string.video_catalog_all_filters));
                        if (((UIBlockActionOpenSearchFilter) uIBlockAction).z) {
                            vkSubnavigationButton.setClickListener(new sch(1, (UIBlockActionOpenSearchFilter) uIBlockAction, this));
                        } else {
                            aVar.d = false;
                            vkSubnavigationButton.setEnabled(false);
                        }
                    }
                    vkSubnavigationBar.c(aVar);
                } else if (uIBlock2 instanceof UIBlockSearchQuickFilter) {
                    UIBlockSearchQuickFilter uIBlockSearchQuickFilter = (UIBlockSearchQuickFilter) uIBlock2;
                    VkSubnavigationButton vkSubnavigationButton2 = new VkSubnavigationButton(vkSubnavigationBar.getContext(), null, 0, 14, 0);
                    VkSubnavigationBar.a<?> aVar2 = new VkSubnavigationBar.a<>(vkSubnavigationButton2);
                    vkSubnavigationButton2.setLeftIconVisible(false);
                    vkSubnavigationButton2.setRightIconVisible(z2);
                    SearchQuickFilterItem searchQuickFilterItem = uIBlockSearchQuickFilter.A;
                    String str = searchQuickFilterItem.m;
                    boolean z3 = searchQuickFilterItem.k;
                    List<SearchQuickInnerFilterItem> list = searchQuickFilterItem.n;
                    boolean z4 = searchQuickFilterItem.l;
                    String str2 = searchQuickFilterItem.c;
                    vkSubnavigationButton2.setContentDescription(epx.f(str, "sort") ? vkSubnavigationBar.getContext().getString(R.string.video_catalog_filters_sort) : str2);
                    boolean isEmpty = list.isEmpty();
                    int i = R.drawable.vk_icon_sort_outline_16;
                    if (isEmpty) {
                        z = true;
                        if (z4) {
                            aVar2.b(null);
                            vkSubnavigationButton2.Q0(Integer.valueOf(epx.f(str, "sort") ? R.drawable.vk_icon_sort_outline_16 : R.drawable.vk_icon_dropdown_16));
                        } else {
                            aVar2.b(str2);
                            vkSubnavigationButton2.setRightIconVisible(false);
                        }
                        vkSubnavigationButton2.setMode(SubnavigationButton.Mode.Outline);
                        if (z3) {
                            aVar2.a(searchQuickFilterItem.h);
                            vkSubnavigationButton2.setClickListener(new pgr(0, this, uIBlockSearchQuickFilter));
                        } else {
                            aVar2.d = false;
                            vkSubnavigationButton2.setEnabled(false);
                        }
                    } else {
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((SearchQuickInnerFilterItem) obj).g) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        SearchQuickInnerFilterItem searchQuickInnerFilterItem = (SearchQuickInnerFilterItem) obj;
                        if (!epx.f(str, "sort")) {
                            i = R.drawable.vk_icon_dropdown_16;
                        }
                        Integer valueOf = Integer.valueOf(i);
                        T t = aVar2.a;
                        t.Q0(valueOf);
                        if (z4) {
                            aVar2.b(null);
                        } else {
                            aVar2.b(str2);
                        }
                        t.setMode(SubnavigationButton.Mode.Outline);
                        if (z3) {
                            aVar2.a(searchQuickInnerFilterItem != null ? searchQuickInnerFilterItem.g : false);
                            if (searchQuickInnerFilterItem != null) {
                                z = true;
                                if (searchQuickInnerFilterItem.g && !z4) {
                                    aVar2.b(searchQuickInnerFilterItem.b);
                                }
                            } else {
                                z = true;
                            }
                            t.setClickListener(new qg6(1, this, uIBlockSearchQuickFilter));
                        } else {
                            aVar2.d = false;
                            t.setEnabled(false);
                            z = true;
                        }
                    }
                    vkSubnavigationBar.c(aVar2);
                    z2 = z;
                }
                z = z2;
                z2 = z;
            }
        }
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.i);
        }
        this.b.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_quick_filters_search_view, viewGroup, false);
        this.g = (ViewGroup) inflate.findViewById(R.id.filters_with_search_result_root);
        this.h = (ViewGroup) inflate.findViewById(R.id.filters_group);
        VkSubnavigationBar vkSubnavigationBar = new VkSubnavigationBar(layoutInflater.getContext(), null, 0, 14, 0);
        this.i = vkSubnavigationBar;
        vkSubnavigationBar.setMultiSelect(true);
        VkSubnavigationBar vkSubnavigationBar2 = this.i;
        if (vkSubnavigationBar2 != null) {
            vkSubnavigationBar2.setVerticalPaddingEnabled(this.f);
        }
        View k5 = this.b.k5(layoutInflater, viewGroup, bundle);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.search_result_frame);
        if (viewGroup2 != null) {
            viewGroup2.addView(k5);
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
