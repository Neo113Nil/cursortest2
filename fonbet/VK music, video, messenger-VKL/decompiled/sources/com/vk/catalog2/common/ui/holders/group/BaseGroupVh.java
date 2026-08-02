package com.vk.catalog2.common.ui.holders.group;

import android.content.Context;
import android.graphics.Rect;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a44;
import xsna.ap0;
import xsna.b5a;
import xsna.brj0;
import xsna.buz;
import xsna.cfp0;
import xsna.dw20;
import xsna.ejc;
import xsna.fkq0;
import xsna.msy;
import xsna.n1;
import xsna.o0r0;
import xsna.q3a;
import xsna.ud6;
import xsna.vd6;
import xsna.ve0;
import xsna.xwk;

/* compiled from: BaseGroupVh.kt */
/* loaded from: classes16.dex */
public abstract class BaseGroupVh implements CatalogViewHolder {
    public final b5a b;
    public final q3a c;
    public final SearchStatInfoProvider d;
    public UIBlockGroup e;
    public final Object f;
    public final Object g;

    public BaseGroupVh(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        this.b = b5aVar;
        this.c = q3aVar;
        this.d = searchStatInfoProvider;
        n1 n1Var = new n1(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, n1Var);
        this.g = msy.a(lazyThreadSafetyMode, new a44(2));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockGroup) {
            this.e = (UIBlockGroup) uIBlock;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean g() {
        Group group;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto;
        UIBlockGroup uIBlockGroup = this.e;
        if (uIBlockGroup == null || (group = uIBlockGroup.y) == null || (groupsVideoLivesDataDto = group.x0) == null) {
            return false;
        }
        if (!((Boolean) this.f.getValue()).booleanValue()) {
            groupsVideoLivesDataDto = null;
        }
        return groupsVideoLivesDataDto != null && groupsVideoLivesDataDto.e() && groupsVideoLivesDataDto.d() == GroupsVideoLivesDataDto.BadgeTypeDto.BASE_LIVE;
    }

    public void h(Context context, Group group, FullSourceJoinApi.EntryServiceType entryServiceType, String str, String str2) {
        String str3;
        UIBlockGroup uIBlockGroup = this.e;
        if (uIBlockGroup == null || (str3 = uIBlockGroup.r()) == null) {
            str3 = "";
        }
        String str4 = str3;
        if (group != null) {
            q3a q3aVar = this.c;
            if (q3aVar != null) {
                q3aVar.b(new ap0(fkq0.e(group.c)), false);
            }
            m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Open));
            SearchStatInfoProvider searchStatInfoProvider = this.d;
            xwk.e().m(context, fkq0.e(group.c), new o0r0.a(false, null, str4, null, searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.GROUP, str4, false) : null, null, null, false, false, false, false, entryServiceType, str, str2, 8171));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, xsna.dw20] */
    public final void k(Context context, Group group) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new dw20.b(context, null).P(Collections.singletonList(new brj0(0, 0, null, R.string.community_catalog_confirm_unsibscribe, null, true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126902)), new vd6(this, group, ref$ObjectRef, 0)).I0(null);
    }

    public final boolean l(Group group) {
        if (group != null) {
            boolean z = group.j;
            if (group.C == 4) {
                group.j = false;
                group.C = 0;
                return true;
            }
            if (group.n() || (group.C() && !z)) {
                group.j = false;
                group.C = 4;
                o(group, CatalogProfileLocalState.FollowSource.Internal);
                return false;
            }
            boolean z2 = group.j;
            group.j = !z2;
            o(group, !z2 ? CatalogProfileLocalState.FollowSource.Internal : CatalogProfileLocalState.FollowSource.None);
            boolean z3 = group.j;
            group.C = z3 ? 1 : 0;
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    public final void m(GroupAnalyticsInfo groupAnalyticsInfo) {
        b5a b5aVar;
        UIBlockGroup uIBlockGroup = this.e;
        if (uIBlockGroup == null || (b5aVar = this.b) == null) {
            return;
        }
        b5aVar.a(new cfp0(uIBlockGroup, groupAnalyticsInfo));
    }

    public final void n(CommonVideoStat$CommunityClickInfo.Direction direction) {
        Group group;
        UserId userId;
        boolean g = g();
        UIBlockGroup uIBlockGroup = this.e;
        Long valueOf = (uIBlockGroup == null || (group = uIBlockGroup.y) == null || (userId = group.c) == null) ? null : Long.valueOf(userId.b);
        UIBlockGroup uIBlockGroup2 = this.e;
        String str = uIBlockGroup2 != null ? uIBlockGroup2.b : null;
        UiTracker uiTracker = UiTracker.a;
        new ejc(g, valueOf, str, UiTracker.c(), direction).q();
    }

    public final void o(Group group, CatalogProfileLocalState.FollowSource followSource) {
        buz buzVar = new buz(12, new ve0(3), new ud6(0, group, followSource));
        q3a q3aVar = this.c;
        if (q3aVar != null) {
            q3aVar.b(buzVar, false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    public void j(Group group, boolean z) {
    }
}
