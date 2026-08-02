package com.vk.catalog2.common.ui.mvp.holder.community;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.c;
import com.vk.core.view.components.tabs.d;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.arm0;
import xsna.e43;
import xsna.eda;
import xsna.jjc;
import xsna.nxv0;
import xsna.vh9;

/* compiled from: CommunityVkTabVh.kt */
/* loaded from: classes16.dex */
public final class CommunityVkTabVh implements CatalogViewHolder {
    public final eda b;
    public VkTabs c;
    public UIBlockButtons d;

    public CommunityVkTabVh(eda edaVar) {
        this.b = edaVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        Integer m;
        if (!(uIBlock instanceof UIBlockButtons) || uIBlock.equals(this.d)) {
            return;
        }
        UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
        this.d = uIBlockButtons;
        VkTabs vkTabs = this.c;
        if (vkTabs == null) {
            vkTabs = null;
        }
        int i = VkTabs.t;
        vkTabs.h(true);
        ArrayList<UIBlock> arrayList = uIBlockButtons.y;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof UIBlockActionFilter) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) next;
            CatalogFilterData catalogFilterData = uIBlockActionFilter.z;
            VkTabs vkTabs2 = this.c;
            VkTabs vkTabs3 = vkTabs2 == null ? null : vkTabs2;
            int i4 = d.G;
            if (vkTabs2 == null) {
                vkTabs2 = null;
            }
            nxv0 a = d.a.a(vkTabs2.getContext());
            a.setText(catalogFilterData.c);
            CatalogBadge catalogBadge = catalogFilterData.g;
            if (catalogBadge != null && (str = catalogBadge.b) != null && (m = arm0.m(10, str)) != null) {
                a.setIndicator(new c.b(m.intValue()));
                a.setCounterAppearance(VkCounter.CounterAppearance.Appearance.Neutral);
                a.setCounterMode(VkCounter.Mode.Tertiary);
            }
            jjc.g(a, new vh9(catalogFilterData, this, a, 6));
            vkTabs3.b(new VkTabs.c(a), true);
            if (uIBlockActionFilter.z.e) {
                VkTabs vkTabs4 = this.c;
                VkTabs vkTabs5 = vkTabs4 == null ? null : vkTabs4;
                if (vkTabs4 == null) {
                    vkTabs4 = null;
                }
                VkTabs.k(vkTabs5, vkTabs4.f(i2));
            }
            i2 = i3;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTabs vkTabs = new VkTabs(layoutInflater.getContext(), null, 0, 14, 0);
        vkTabs.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.c = vkTabs;
        vkTabs.setMode(Tab$Mode.Secondary);
        VkTabs vkTabs2 = this.c;
        if (vkTabs2 == null) {
            return null;
        }
        return vkTabs2;
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
