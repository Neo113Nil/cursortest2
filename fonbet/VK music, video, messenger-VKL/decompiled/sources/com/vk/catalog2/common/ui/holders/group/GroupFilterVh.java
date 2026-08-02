package com.vk.catalog2.common.ui.holders.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.avatar.GroupAvatarViewContainer;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ah7;
import xsna.ayo;
import xsna.b5a;
import xsna.buz;
import xsna.cer;
import xsna.cfp0;
import xsna.cn70;
import xsna.cws;
import xsna.epx;
import xsna.f4m;
import xsna.m3a;
import xsna.q3a;
import xsna.w69;
import xsna.wz5;
import xsna.zxo;

/* compiled from: GroupFilterVh.kt */
/* loaded from: classes16.dex */
public final class GroupFilterVh extends GroupVh {
    public UIBlockGroupFilter I;
    public final boolean J;

    public GroupFilterVh(int i, m3a m3aVar, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(i, 16288, searchStatInfoProvider, m3aVar, q3aVar, b5aVar, true);
        VideoFeatures videoFeatures = VideoFeatures.LIVE_BADGE_IN_SUBS;
        videoFeatures.getClass();
        this.J = b.A.a(videoFeatures);
    }

    public static boolean t(UIBlockList uIBlockList, UIBlockGroupFilter uIBlockGroupFilter) {
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (UIBlock uIBlock : arrayList) {
            if ((uIBlock instanceof UIBlockList) && epx.f(uIBlockGroupFilter.B, uIBlock.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.GroupVh, com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockGroupFilter)) {
            this.I = null;
            View view = this.E;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            super.N6(uIBlock);
            return;
        }
        UIBlockGroupFilter uIBlockGroupFilter = (UIBlockGroupFilter) uIBlock;
        this.I = uIBlockGroupFilter;
        View view2 = this.E;
        if (view2 != null) {
            view2.setAlpha(uIBlockGroupFilter.C ? 0.15f : 1.0f);
        }
        super.N6(uIBlockGroupFilter.y);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.GroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        f4m.v(cn70.b(4), k5);
        f4m.q(cn70.b(8), k5);
        TextView textView = this.r;
        if (textView != null) {
            textView.setMaxLines(1);
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.GroupVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockGroupFilter uIBlockGroupFilter = this.I;
        if (uIBlockGroupFilter == null) {
            super.onClick(view);
            return;
        }
        b5a b5aVar = this.b;
        if (b5aVar != null) {
            b5aVar.a(new cfp0(uIBlockGroupFilter, null));
        }
        q3a q3aVar = this.c;
        if (q3aVar != null) {
            q3aVar.b(new buz(12, new cws(uIBlockGroupFilter, this), new w69(uIBlockGroupFilter, this)), false);
        }
        if (q3aVar != null) {
            q3aVar.b(new buz(12, new zxo(15, this, uIBlockGroupFilter), new ah7(uIBlockGroupFilter, 4)), false);
        }
        CatalogFilterData catalogFilterData = uIBlockGroupFilter.z;
        if (catalogFilterData.e) {
            catalogFilterData = uIBlockGroupFilter.A;
        }
        if (q3aVar != null) {
            q3aVar.b(new cer(8, catalogFilterData.b, this.J ? "video_subscriptions" : null, new ayo(uIBlockGroupFilter, 8), false), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.GroupVh, com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        View view;
        GroupAvatarViewContainer groupAvatarViewContainer;
        N6(uIBlock);
        if (!this.J || (view = this.E) == null || (groupAvatarViewContainer = (GroupAvatarViewContainer) view.findViewById(R.id.avatar)) == null) {
            return;
        }
        groupAvatarViewContainer.setOnClickListener(new wz5(this, 4));
    }
}
