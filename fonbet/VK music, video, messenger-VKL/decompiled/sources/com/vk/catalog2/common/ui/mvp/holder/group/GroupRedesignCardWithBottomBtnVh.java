package com.vk.catalog2.common.ui.mvp.holder.group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.a;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.core.view.components.spinner.c;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.bwt0;
import xsna.by5;
import xsna.cmu;
import xsna.cn70;
import xsna.cqm0;
import xsna.dha;
import xsna.eko;
import xsna.epx;
import xsna.f870;
import xsna.ikv0;
import xsna.izs;
import xsna.jjc;
import xsna.krv0;
import xsna.mxj;
import xsna.nzq0;
import xsna.oq;
import xsna.q3a;
import xsna.qv20;
import xsna.s1m;
import xsna.tlo0;
import xsna.uf1;

/* compiled from: GroupRedesignCardWithBottomBtnVh.kt */
/* loaded from: classes16.dex */
public final class GroupRedesignCardWithBottomBtnVh extends BaseGroupVh implements a.InterfaceC0484a {
    public final dha h;
    public CommunityCardView i;
    public UserId j;
    public Group k;
    public final com.vk.catalog2.common.ui.holders.group.a l;
    public c m;

    /* compiled from: GroupRedesignCardWithBottomBtnVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupSubscriptionState.values().length];
            try {
                iArr[GroupSubscriptionState.RecentlySubscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupSubscriptionState.NotSubscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupSubscriptionState.Subscribed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GroupRedesignCardWithBottomBtnVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Group, Boolean> {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            if (r1 != false) goto L8;
         */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Group group) {
            Group group2 = group;
            ((GroupRedesignCardWithBottomBtnVh) this.receiver).getClass();
            boolean z = false;
            if (group2 != null) {
                boolean z2 = group2.j;
                if (group2.C == 4) {
                    group2.j = false;
                    group2.C = 0;
                } else if (group2.n() || (group2.C() && !z2)) {
                    group2.j = false;
                    group2.C = 4;
                } else {
                    boolean z3 = group2.j;
                    boolean z4 = !z3;
                    group2.j = z4;
                    group2.C = z4 ? 1 : 0;
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public GroupRedesignCardWithBottomBtnVh(dha dhaVar, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = dhaVar;
        this.l = new com.vk.catalog2.common.ui.holders.group.a(new b(1, this, GroupRedesignCardWithBottomBtnVh.class, "localSwitchGroupSubscription", "localSwitchGroupSubscription(Lcom/vk/dto/group/Group;)Z", 0), this);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.l.c.e();
        this.m = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
            Group group = uIBlockGroup.y;
            this.k = group;
            boolean f = epx.f(this.j, group.c);
            this.j = group.c;
            this.l.a(uIBlockGroup, group);
            if (f) {
                return;
            }
            CommunityCardView communityCardView = this.i;
            if (communityCardView == null) {
                communityCardView = null;
            }
            Context context = communityCardView.getContext();
            nzq0 y = f870.y(group, context, cn70.b(16));
            List<String> list = y.a;
            String str = y.b;
            CommunityCardView communityCardView2 = this.i;
            if (communityCardView2 == null) {
                communityCardView2 = null;
            }
            tlo0.h d = oq.d(tlo0.Companion, group.d);
            Drawable z = f870.z(context, group);
            if (z == null) {
                z = null;
            }
            communityCardView2.setTitle(new CommunityCardView.d(d, z != null ? new eko(z) : null));
            CommunityCardView communityCardView3 = this.i;
            if (communityCardView3 == null) {
                communityCardView3 = null;
            }
            communityCardView3.setSubtitle(new CommunityCardView.c(new tlo0.h(group.z)));
            CommunityCardView communityCardView4 = this.i;
            if (communityCardView4 == null) {
                communityCardView4 = null;
            }
            communityCardView4.setUserStackBadge(new CommunityCardView.e(list, new tlo0.h(str)));
            CommunityCardView communityCardView5 = this.i;
            if (communityCardView5 == null) {
                communityCardView5 = null;
            }
            bwt0.S(communityCardView5, new by5(16, group, this));
            CommunityCardView communityCardView6 = this.i;
            if (communityCardView6 == null) {
                communityCardView6 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(group.d);
            sb.append('\n');
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfo verifyInfo = group.y;
            CommunityCardView communityCardView7 = this.i;
            sb.append(VerifyInfoHelper.c((communityCardView7 != null ? communityCardView7 : null).getContext(), verifyInfo));
            sb.append('\n');
            sb.append(group.z);
            sb.append('\n');
            sb.append(str);
            sb.append('\n');
            communityCardView6.setContentDescription(sb.toString());
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void a(GroupSubscriptionState groupSubscriptionState, Group group) {
        CatalogProfileLocalState catalogProfileLocalState;
        if (epx.f(this.k, group)) {
            GroupSubscriptionState groupSubscriptionState2 = GroupSubscriptionState.NotSubscribed;
            com.vk.catalog2.common.ui.holders.group.a aVar = this.l;
            if (groupSubscriptionState != groupSubscriptionState2) {
                UIBlockGroup uIBlockGroup = this.e;
                if (((uIBlockGroup == null || (catalogProfileLocalState = uIBlockGroup.A) == null) ? null : catalogProfileLocalState.b) == CatalogProfileLocalState.FollowSource.None) {
                    CommunityCardView communityCardView = this.i;
                    k((communityCardView != null ? communityCardView : null).getContext(), group);
                    return;
                }
                CommunityCardView communityCardView2 = this.i;
                if (communityCardView2 == null) {
                    communityCardView2 = null;
                }
                communityCardView2.P4(17);
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
                CommunityCardView communityCardView3 = this.i;
                aVar.e((communityCardView3 != null ? communityCardView3 : null).getContext());
                q();
                return;
            }
            CommunityCardView communityCardView4 = this.i;
            if (communityCardView4 == null) {
                communityCardView4 = null;
            }
            communityCardView4.P4(16);
            if (group.p != 1) {
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Join));
                FullSourceJoinApi p = p();
                aVar.getClass();
                com.vk.catalog2.common.ui.holders.group.a.d(aVar, true, null, p, 6);
                q();
                return;
            }
            CommunityCardView communityCardView5 = this.i;
            View anchorView = (communityCardView5 != null ? communityCardView5 : null).getAnchorView();
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            anchorView.getContext();
            e.b bVar = new e.b(anchorView, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new s1m(this, 14), 30);
            VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new mxj(this, 21), 30);
            bVar.a().j(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void b(GroupSubscriptionState groupSubscriptionState, Group group) {
        Pair pair;
        String string;
        if (epx.f(this.k, group)) {
            if (groupSubscriptionState == GroupSubscriptionState.NotSubscribed) {
                CommunityCardView communityCardView = this.i;
                if (communityCardView == null) {
                    communityCardView = null;
                }
                pair = new Pair(communityCardView.getContext().getString(R.string.join_page), null);
            } else {
                CommunityCardView communityCardView2 = this.i;
                if (communityCardView2 == null) {
                    communityCardView2 = null;
                }
                pair = new Pair(communityCardView2.getContext().getString(R.string.community_status_button_public_subscribed), Integer.valueOf(R.attr.vk_ui_text_secondary));
            }
            String str = (String) pair.d();
            Integer num = (Integer) pair.g();
            int i = a.$EnumSwitchMapping$0[groupSubscriptionState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    CommunityCardView communityCardView3 = this.i;
                    if (communityCardView3 == null) {
                        communityCardView3 = null;
                    }
                    string = communityCardView3.getContext().getString(R.string.join_page);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CommunityCardView communityCardView4 = this.i;
                    if (communityCardView4 == null) {
                        communityCardView4 = null;
                    }
                    string = communityCardView4.getContext().getString(R.string.leave_group);
                }
            } else if (group.j) {
                CommunityCardView communityCardView5 = this.i;
                if (communityCardView5 == null) {
                    communityCardView5 = null;
                }
                string = communityCardView5.getContext().getString(R.string.leave_group);
            } else {
                CommunityCardView communityCardView6 = this.i;
                if (communityCardView6 == null) {
                    communityCardView6 = null;
                }
                string = communityCardView6.getContext().getString(R.string.profile_friend_cancel);
            }
            CommunityCardView communityCardView7 = this.i;
            (communityCardView7 != null ? communityCardView7 : null).setActionButton(new CommunityCardView.a(oq.d(tlo0.Companion, str), new cmu(0, this.l, com.vk.catalog2.common.ui.holders.group.a.class, "onSubscribeBtnClick", "onSubscribeBtnClick(Landroid/view/View;)V", 0), new tlo0.h(string), num, 56));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void c() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.cancel();
        }
        this.m = null;
        CommunityCardView communityCardView = this.i;
        if (communityCardView == null) {
            communityCardView = null;
        }
        ikv0.a aVar = new ikv0.a(communityCardView.getContext());
        CommunityCardView communityCardView2 = this.i;
        if (communityCardView2 == null) {
            communityCardView2 = null;
        }
        aVar.u = new ikv0.d(new ikv0.d.c(communityCardView2.getContext().getString(R.string.community_catalog_subscribed)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_fill_28, (Integer) null, (Size) null, 14);
        aVar.n();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void d() {
        c cVar = this.m;
        if (cVar != null) {
            cVar.cancel();
        }
        this.m = null;
        CommunityCardView communityCardView = this.i;
        if (communityCardView == null) {
            communityCardView = null;
        }
        ikv0.a aVar = new ikv0.a(communityCardView.getContext());
        CommunityCardView communityCardView2 = this.i;
        if (communityCardView2 == null) {
            communityCardView2 = null;
        }
        aVar.u = new ikv0.d(new ikv0.d.c(communityCardView2.getContext().getString(R.string.community_catalog_unsubscribed)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_28, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
        aVar.n();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void e(Throwable th) {
        c cVar = this.m;
        if (cVar != null) {
            cVar.cancel();
        }
        this.m = null;
        CommunityCardView communityCardView = this.i;
        if (communityCardView == null) {
            communityCardView = null;
        }
        ikv0.a aVar = new ikv0.a(communityCardView.getContext());
        CommunityCardView communityCardView2 = this.i;
        if (communityCardView2 == null) {
            communityCardView2 = null;
        }
        aVar.u = new ikv0.d(new ikv0.d.c(communityCardView2.getContext().getString(R.string.community_catalog_error)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_fill_red_24, (Integer) null, (Size) null, 14);
        aVar.n();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh
    public final void j(Group group, boolean z) {
        m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
        CommunityCardView communityCardView = this.i;
        if (communityCardView == null) {
            communityCardView = null;
        }
        this.l.e(communityCardView.getContext());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CommunityCardView communityCardView = new CommunityCardView(layoutInflater.getContext());
        jjc.g(communityCardView, new uf1(19, this, communityCardView));
        this.i = communityCardView;
        return communityCardView;
    }

    public final FullSourceJoinApi p() {
        String a2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MobileOfficialAppsCoreNavStat$EventScreen a3;
        String i = FullSourceJoinApi.EntryServiceType.COMMUNITY.i();
        FullSourceJoinApi.SourceType sourceType = FullSourceJoinApi.SourceType.COMPILATION_CAROUSEL_FOR_U;
        String h = sourceType.h();
        String h2 = sourceType.h();
        dha dhaVar = this.h;
        if (dhaVar == null || (a3 = dhaVar.a()) == null || (a2 = a3.name()) == null) {
            a2 = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST);
        }
        UiTrackingScreen b2 = UiTracker.j.b();
        String name = (b2 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b2.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
        return new FullSourceJoinApi(cqm0.m(a2), name != null ? cqm0.m(name) : null, h2 != null ? cqm0.m(h2) : null, h != null ? cqm0.m(h) : null, i != null ? cqm0.m(i) : null, null);
    }

    public final void q() {
        CommunityCardView communityCardView = this.i;
        if (communityCardView == null) {
            communityCardView = null;
        }
        c e = qv20.e(communityCardView.getContext(), null);
        VkScreenSpinner vkScreenSpinner = e.h;
        vkScreenSpinner.setSpinnerState(VkSpinnerContent.SpinnerState.Loading);
        vkScreenSpinner.setSpinnerMode(VkScreenSpinner.SpinnerMode.Overlay);
        e.show();
        this.m = e;
    }
}
