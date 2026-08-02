package com.vk.catalog2.common.ui.mvp.holder.group;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.a;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.profile.community.core.ui.groupcard.GroupCardWithBottomBtnView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.btm;
import xsna.bwt0;
import xsna.c98;
import xsna.cn70;
import xsna.dju;
import xsna.eju;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.i5g;
import xsna.iah0;
import xsna.ikv0;
import xsna.izs;
import xsna.krv0;
import xsna.m1o;
import xsna.oyt;
import xsna.q3a;
import xsna.qm0;
import xsna.rli0;
import xsna.uqm0;

/* compiled from: GroupCardWithBottomBtnVh.kt */
/* loaded from: classes16.dex */
public final class GroupCardWithBottomBtnVh extends BaseGroupVh implements a.InterfaceC0484a {
    public final CatalogViewType h;
    public GroupCardWithBottomBtnView i;
    public UserId j;
    public Group k;
    public final com.vk.catalog2.common.ui.holders.group.a l;

    /* compiled from: GroupCardWithBottomBtnVh.kt */
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

    /* compiled from: GroupCardWithBottomBtnVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Group, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(Group group) {
            return Boolean.valueOf(((GroupCardWithBottomBtnVh) this.receiver).l(group));
        }
    }

    public GroupCardWithBottomBtnVh(b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, CatalogViewType catalogViewType) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = catalogViewType;
        this.l = new com.vk.catalog2.common.ui.holders.group.a(new b(1, this, GroupCardWithBottomBtnVh.class, "switchGroupSubscriptionLocal", "switchGroupSubscriptionLocal(Lcom/vk/dto/group/Group;)Z", 0), this);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.l.c.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList<UserProfile> arrayList;
        List A;
        ImageSize Cb;
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
            Group group = uIBlockGroup.y;
            this.k = group;
            boolean f = epx.f(this.j, group.c);
            this.j = group.c;
            com.vk.catalog2.common.ui.holders.group.a aVar = this.l;
            aVar.a(uIBlockGroup, group);
            if (f) {
                return;
            }
            GroupCardWithBottomBtnView groupCardWithBottomBtnView = this.i;
            if (groupCardWithBottomBtnView == null) {
                groupCardWithBottomBtnView = null;
            }
            groupCardWithBottomBtnView.setButtonOnClickListener(new c98(new oyt(aVar, 1), 1));
            GroupCardWithBottomBtnView groupCardWithBottomBtnView2 = this.i;
            if (groupCardWithBottomBtnView2 == null) {
                groupCardWithBottomBtnView2 = null;
            }
            dju djuVar = groupCardWithBottomBtnView2.t;
            TextView textView = djuVar.e;
            TextView textView2 = djuVar.d;
            VerifyInfo verifyInfo = group.y;
            VKImageView vKImageView = djuVar.b;
            Image image = group.g;
            vKImageView.load((image == null || (Cb = image.Cb(dju.i, true, true)) == null) ? null : Cb.d.d);
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfoHelper.k(djuVar.h, false, verifyInfo, false, false, 56);
            djuVar.c.setText(group.d);
            String str = group.z;
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
            PhotoStackView photoStackView = djuVar.g;
            GroupLikes groupLikes = group.T;
            int i = groupLikes != null ? groupLikes.d : 0;
            boolean z = i > 0;
            bwt0.p0(photoStackView, z);
            if (z) {
                GroupLikes groupLikes2 = group.T;
                if (groupLikes2 != null && (arrayList = groupLikes2.e) != null && (A = rli0.A(rli0.y(rli0.t(new i5g(arrayList), new qm0(24)), 2))) != null) {
                    PhotoStackView.b bVar = PhotoStackView.M;
                    photoStackView.r(-1, A);
                }
                textView.setText(enj.f(R.plurals.group_friends_members_count, i, textView.getContext()));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                f4m.x(cn70.b(4), textView);
            } else {
                textView.setText(uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true));
                f4m.x(cn70.b(8), textView);
            }
            View view = djuVar.a;
            view.setContentDescription(group.d + " " + VerifyInfoHelper.c(view.getContext(), verifyInfo) + " " + textView2.getText() + " " + textView.getText() + " ");
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
                    GroupCardWithBottomBtnView groupCardWithBottomBtnView = this.i;
                    k((groupCardWithBottomBtnView != null ? groupCardWithBottomBtnView : null).getContext(), group);
                    return;
                }
                GroupCardWithBottomBtnView groupCardWithBottomBtnView2 = this.i;
                if (groupCardWithBottomBtnView2 == null) {
                    groupCardWithBottomBtnView2 = null;
                }
                groupCardWithBottomBtnView2.t.f.performHapticFeedback(17);
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
                GroupCardWithBottomBtnView groupCardWithBottomBtnView3 = this.i;
                aVar.e((groupCardWithBottomBtnView3 != null ? groupCardWithBottomBtnView3 : null).getContext());
                return;
            }
            GroupCardWithBottomBtnView groupCardWithBottomBtnView4 = this.i;
            if (groupCardWithBottomBtnView4 == null) {
                groupCardWithBottomBtnView4 = null;
            }
            groupCardWithBottomBtnView4.t.f.performHapticFeedback(16);
            if (group.p != 1) {
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Join));
                com.vk.catalog2.common.ui.holders.group.a.c(aVar, true);
                return;
            }
            GroupCardWithBottomBtnView groupCardWithBottomBtnView5 = this.i;
            View decisionAnchorView = (groupCardWithBottomBtnView5 != null ? groupCardWithBottomBtnView5 : null).getDecisionAnchorView();
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            decisionAnchorView.getContext();
            e.b bVar = new e.b(decisionAnchorView, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new m1o(this, 10), 30);
            VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new btm(this, 11), 30);
            bVar.a().j(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void b(GroupSubscriptionState groupSubscriptionState, Group group) {
        String string;
        String string2;
        if (epx.f(this.k, group)) {
            if (groupSubscriptionState == GroupSubscriptionState.NotSubscribed) {
                GroupCardWithBottomBtnView groupCardWithBottomBtnView = this.i;
                if (groupCardWithBottomBtnView == null) {
                    groupCardWithBottomBtnView = null;
                }
                string = groupCardWithBottomBtnView.getContext().getString(R.string.join_page);
            } else {
                GroupCardWithBottomBtnView groupCardWithBottomBtnView2 = this.i;
                if (groupCardWithBottomBtnView2 == null) {
                    groupCardWithBottomBtnView2 = null;
                }
                string = groupCardWithBottomBtnView2.getContext().getString(R.string.community_status_button_public_subscribed);
            }
            int i = a.$EnumSwitchMapping$0[groupSubscriptionState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    GroupCardWithBottomBtnView groupCardWithBottomBtnView3 = this.i;
                    if (groupCardWithBottomBtnView3 == null) {
                        groupCardWithBottomBtnView3 = null;
                    }
                    string2 = groupCardWithBottomBtnView3.getContext().getString(R.string.join_page);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GroupCardWithBottomBtnView groupCardWithBottomBtnView4 = this.i;
                    if (groupCardWithBottomBtnView4 == null) {
                        groupCardWithBottomBtnView4 = null;
                    }
                    string2 = groupCardWithBottomBtnView4.getContext().getString(R.string.leave_group);
                }
            } else if (group.j) {
                GroupCardWithBottomBtnView groupCardWithBottomBtnView5 = this.i;
                if (groupCardWithBottomBtnView5 == null) {
                    groupCardWithBottomBtnView5 = null;
                }
                string2 = groupCardWithBottomBtnView5.getContext().getString(R.string.leave_group);
            } else {
                GroupCardWithBottomBtnView groupCardWithBottomBtnView6 = this.i;
                if (groupCardWithBottomBtnView6 == null) {
                    groupCardWithBottomBtnView6 = null;
                }
                string2 = groupCardWithBottomBtnView6.getContext().getString(R.string.profile_friend_cancel);
            }
            GroupCardWithBottomBtnView groupCardWithBottomBtnView7 = this.i;
            VkSimpleButton vkSimpleButton = (groupCardWithBottomBtnView7 != null ? groupCardWithBottomBtnView7 : null).t.f;
            vkSimpleButton.setText(string);
            vkSimpleButton.setContentDescription(string2);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void d() {
        GroupCardWithBottomBtnView groupCardWithBottomBtnView = this.i;
        if (groupCardWithBottomBtnView == null) {
            groupCardWithBottomBtnView = null;
        }
        ikv0.a aVar = new ikv0.a(groupCardWithBottomBtnView.getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_28, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) null, 12);
        GroupCardWithBottomBtnView groupCardWithBottomBtnView2 = this.i;
        if (groupCardWithBottomBtnView2 == null) {
            groupCardWithBottomBtnView2 = null;
        }
        aVar.u = new ikv0.d(groupCardWithBottomBtnView2.getContext().getString(R.string.community_catalog_unsubscribed), (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh
    public final void j(Group group, boolean z) {
        m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
        GroupCardWithBottomBtnView groupCardWithBottomBtnView = this.i;
        if (groupCardWithBottomBtnView == null) {
            groupCardWithBottomBtnView = null;
        }
        this.l.e(groupCardWithBottomBtnView.getContext());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GroupCardWithBottomBtnView groupCardWithBottomBtnView = new GroupCardWithBottomBtnView(layoutInflater.getContext(), null, 0, 14, 0);
        if (this.h == CatalogViewType.SLIDER_MINIMALISTIC_CARD) {
            int a2 = iah0.a(160);
            VKImageView vKImageView = (VKImageView) groupCardWithBottomBtnView.findViewById(R.id.photo);
            if (vKImageView != null) {
                bwt0.m0(a2, a2, vKImageView);
            }
            bwt0.m0(a2, iah0.a(263), groupCardWithBottomBtnView);
        }
        groupCardWithBottomBtnView.setOnClickListener(new c98(new eju(0, this, groupCardWithBottomBtnView), 1));
        this.i = groupCardWithBottomBtnView;
        return groupCardWithBottomBtnView;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void c() {
    }
}
