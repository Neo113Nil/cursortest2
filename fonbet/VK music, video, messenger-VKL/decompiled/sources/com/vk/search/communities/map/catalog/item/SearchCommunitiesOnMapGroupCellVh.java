package com.vk.search.communities.map.catalog.item;

import android.content.Context;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.group.SearchGroupCellVh;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import xsna.ap0;
import xsna.b5a;
import xsna.epx;
import xsna.fkq0;
import xsna.l3a;
import xsna.m3a;
import xsna.q3a;

/* compiled from: SearchCommunitiesOnMapGroupCellVh.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapGroupCellVh extends SearchGroupCellVh {
    public final m3a s;
    public GroupCatalogItem t;

    /* compiled from: SearchCommunitiesOnMapGroupCellVh.kt */
    public static final class a implements l3a {
        public final Group a;
        public final GroupCatalogItem b;

        public a(Group group, GroupCatalogItem groupCatalogItem) {
            this.a = group;
            this.b = groupCatalogItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            GroupCatalogItem groupCatalogItem = this.b;
            return hashCode + (groupCatalogItem == null ? 0 : Long.hashCode(groupCatalogItem.b));
        }

        public final String toString() {
            return "GroupClickedEvent(group=" + this.a + ", groupItem=" + this.b + ')';
        }
    }

    public SearchCommunitiesOnMapGroupCellVh(m3a m3aVar, b5a b5aVar, q3a q3aVar) {
        super(m3aVar, b5aVar, q3aVar, null, false);
        this.s = m3aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh
    public final void h(Context context, Group group, FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
        if (group == null) {
            return;
        }
        q3a q3aVar = this.c;
        if (q3aVar != null) {
            q3aVar.b(new ap0(fkq0.e(group.c)), false);
        }
        m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Open));
        this.s.j(new a(group, this.t));
    }

    @Override // com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh
    public final void p(Group group, GroupCatalogItem groupCatalogItem) {
        super.p(group, groupCatalogItem);
        this.t = groupCatalogItem;
    }
}
