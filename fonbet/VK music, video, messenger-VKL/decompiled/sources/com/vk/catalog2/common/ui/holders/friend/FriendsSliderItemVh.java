package com.vk.catalog2.common.ui.holders.friend;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.cfp0;
import xsna.cqf;
import xsna.d05;
import xsna.ny3;
import xsna.o0r0;
import xsna.xwk;

/* compiled from: FriendsSliderItemVh.kt */
/* loaded from: classes16.dex */
public final class FriendsSliderItemVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final int d;
    public VkText e;
    public VkAvatar f;
    public ny3 g;
    public UIBlockProfile h;

    public /* synthetic */ FriendsSliderItemVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this(b5aVar, searchStatInfoProvider, R.layout.catalog_link_slider_item);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ny3 ny3Var = this.g;
        if (ny3Var == null) {
            ny3Var = null;
        }
        d05 d05Var = new d05(20, uIBlock, this);
        if (ny3Var.c) {
            d05Var.invoke(ny3Var);
        } else {
            ny3Var.e = d05Var;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ny3 ny3Var = new ny3(viewGroup.getContext(), -2, -2, this.d);
        ny3Var.a(new cqf(this, 22));
        this.g = ny3Var;
        return ny3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockProfile uIBlockProfile;
        if (view == null || (uIBlockProfile = this.h) == null) {
            return;
        }
        CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
        this.b.a(new cfp0(uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.Open)));
        SearchStatInfoProvider searchStatInfoProvider = this.c;
        xwk.e().m(view.getContext(), uIBlockProfile.A.c, new o0r0.a(false, "friends", catalogUserMeta.d, null, searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.USER, catalogUserMeta.d, false) : null, null, null, false, false, false, false, null, null, null, 65512));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public FriendsSliderItemVh(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, int i) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
