package com.vk.catalog2.common.ui.holders.author;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import xsna.ap0;
import xsna.b5a;
import xsna.fdc;
import xsna.fkq0;
import xsna.jai;
import xsna.o0r0;
import xsna.q3a;
import xsna.wh50;
import xsna.xwk;
import xsna.zak0;

/* compiled from: CircularAuthorViewHolder.kt */
/* loaded from: classes16.dex */
public final class CircularAuthorViewHolder extends BaseGroupVh {
    public final wh50 h;

    public CircularAuthorViewHolder(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = k.b(null);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            ((zak0) this.h).setValue(((UIBlockGroup) uIBlock).y);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh
    public final void h(Context context, Group group, FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
        UIBlockGroup uIBlockGroup = this.e;
        if (uIBlockGroup == null || group == null) {
            return;
        }
        String r = uIBlockGroup.r();
        if (r == null) {
            r = uIBlockGroup.b;
        }
        String str3 = r;
        q3a q3aVar = this.c;
        if (q3aVar != null) {
            q3aVar.b(new ap0(fkq0.e(group.c)), false);
        }
        m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Open));
        SearchStatInfoProvider searchStatInfoProvider = this.d;
        xwk.e().m(context, fkq0.e(group.c), new o0r0.a(false, null, str3, null, searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.GROUP, str3, false) : null, null, null, false, false, false, false, null, null, null, 65515));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        composeView.setContent(new jai(-899959003, new fdc(0, this, composeView), true));
        return composeView;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
