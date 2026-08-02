package com.vk.catalog2.common.ui.holders.search;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.f4m;
import xsna.g2u0;
import xsna.h470;
import xsna.iah0;
import xsna.pmk0;
import xsna.qmk0;

/* compiled from: SportsMatchesCurrentVh.kt */
/* loaded from: classes16.dex */
public final class SportsMatchesCurrentVh extends ViewPager2.g implements CatalogViewHolder {
    public static final int h = iah0.a(20);
    public final b5a d;
    public pmk0 e;
    public ViewPager2 f;
    public TabLayout g;

    public SportsMatchesCurrentVh(b5a b5aVar) {
        this.d = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        TabLayout tabLayout;
        if (uIBlock instanceof UIBlockList) {
            pmk0 pmk0Var = this.e;
            if (pmk0Var != null) {
                pmk0Var.m = (UIBlockList) uIBlock;
                pmk0Var.notifyDataSetChanged();
            }
            if (((UIBlockList) uIBlock).y.size() >= 2 || (tabLayout = this.g) == null) {
                return;
            }
            f4m.j(tabLayout);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        h470 h470Var = new h470(context);
        h470Var.setId(R.id.catalog_sport_matches_current_vh);
        h470Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        h470Var.setOrientation(1);
        h470Var.setGravity(17);
        FragmentActivity fragmentActivity = (FragmentActivity) (viewGroup != null ? g2u0.c(viewGroup) : null);
        pmk0 pmk0Var = new pmk0(fragmentActivity);
        pmk0Var.l = this.d;
        this.e = pmk0Var;
        ViewPager2 viewPager2 = new ViewPager2(fragmentActivity);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setOrientation(0);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.setAdapter(this.e);
        this.f = viewPager2;
        TabLayout tabLayout = new TabLayout(context, null);
        tabLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, h));
        tabLayout.setTabGravity(1);
        tabLayout.setTabMode(1);
        tabLayout.setSelectedTabIndicatorHeight(0);
        this.g = tabLayout;
        h470Var.addView(this.f);
        h470Var.addView(this.g);
        TabLayout tabLayout2 = this.g;
        ViewPager2 viewPager22 = this.f;
        if (tabLayout2 != null && viewPager22 != null) {
            new com.google.android.material.tabs.c(tabLayout2, viewPager22, new qmk0(0)).a();
        }
        return h470Var;
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
