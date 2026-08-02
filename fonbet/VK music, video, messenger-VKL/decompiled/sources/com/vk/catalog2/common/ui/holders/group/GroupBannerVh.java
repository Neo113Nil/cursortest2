package com.vk.catalog2.common.ui.holders.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.group.Group;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;
import xsna.dhr0;
import xsna.fkq0;
import xsna.o0r0;
import xsna.xwk;

/* compiled from: GroupBannerVh.kt */
/* loaded from: classes16.dex */
public final class GroupBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public TextView c;
    public VKCircleImageView d;
    public UIBlockGroup e;

    public GroupBannerVh(b5a b5aVar) {
        this.b = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockGroup) {
            UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
            Group group = uIBlockGroup.y;
            this.e = uIBlockGroup;
            TextView textView = this.c;
            if (textView == null) {
                textView = null;
            }
            textView.setText(group.d);
            VKCircleImageView vKCircleImageView = this.d;
            if (vKCircleImageView == null) {
                vKCircleImageView = null;
            }
            vKCircleImageView.o0(group.e, null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_group_banner, viewGroup, false);
        this.c = (TextView) viewGroup2.findViewById(R.id.group_title);
        View findViewById = viewGroup2.findViewById(R.id.group_image);
        ((VKCircleImageView) findViewById).setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        this.d = (VKCircleImageView) findViewById;
        viewGroup2.findViewById(R.id.group_button).setOnClickListener(new c98(this, 1));
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockGroup uIBlockGroup;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.group_button || (uIBlockGroup = this.e) == null) {
            return;
        }
        Group group = uIBlockGroup.y;
        this.b.a(new cfp0(uIBlockGroup, new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.OpenOwner)));
        xwk.e().m(view.getContext(), fkq0.e(group.c), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
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
