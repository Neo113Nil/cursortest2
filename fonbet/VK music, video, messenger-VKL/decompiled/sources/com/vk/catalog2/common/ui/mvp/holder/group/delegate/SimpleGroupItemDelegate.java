package com.vk.catalog2.common.ui.mvp.holder.group.delegate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.a;
import com.vk.catalog2.common.ui.holders.group.avatar.GroupAvatarViewContainer;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bbb0;
import xsna.c98;
import xsna.cn70;
import xsna.cq5;
import xsna.d3j0;
import xsna.dhr0;
import xsna.epx;
import xsna.f4m;
import xsna.krv0;
import xsna.omw;
import xsna.oyt;
import xsna.q3a;
import xsna.s01;
import xsna.s55;
import xsna.uqm0;

/* compiled from: SimpleGroupItemDelegate.kt */
/* loaded from: classes16.dex */
public final class SimpleGroupItemDelegate extends BaseGroupVh implements a.InterfaceC0484a {
    public final View h;
    public final boolean i;
    public final GroupAvatarViewContainer j;
    public final TextView k;
    public final TextView l;
    public final ImageView m;
    public final ImageView n;
    public final a o;
    public Group p;

    public SimpleGroupItemDelegate(View view, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = view;
        this.i = true;
        GroupAvatarViewContainer groupAvatarViewContainer = (GroupAvatarViewContainer) view.findViewById(R.id.avatar);
        this.j = groupAvatarViewContainer;
        this.k = (TextView) view.findViewById(R.id.title);
        TextView textView = (TextView) view.findViewById(R.id.subtitle);
        this.l = textView;
        this.m = (ImageView) view.findViewById(R.id.icon_meta);
        ImageView imageView = (ImageView) view.findViewById(R.id.subscribe_action);
        this.n = imageView;
        a aVar = new a(new s55(1, this, SimpleGroupItemDelegate.class, "switchGroupSubscriptionLocal", "switchGroupSubscriptionLocal(Lcom/vk/dto/group/Group;)Z", 0, 15), this);
        this.o = aVar;
        f4m.B(cn70.b(2), cn70.b(2), view);
        textView.setTextSize(13.0f);
        imageView.setOnClickListener(new c98(new oyt(aVar, 1), 1));
        f4m.s(cn70.b(8), groupAvatarViewContainer);
        groupAvatarViewContainer.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        view.setOnClickListener(new c98(new s01(this, 11), 1));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.o.c.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        boolean z;
        CharSequence text;
        super.N6(uIBlock);
        UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
        Group group = uIBlockGroup.y;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto = group.x0;
        VerifyInfo verifyInfo = group.y;
        if (groupsVideoLivesDataDto != null && groupsVideoLivesDataDto.e()) {
            GroupsVideoLivesDataDto groupsVideoLivesDataDto2 = group.x0;
            if ((groupsVideoLivesDataDto2 != null ? groupsVideoLivesDataDto2.d() : null) == GroupsVideoLivesDataDto.BadgeTypeDto.BASE_LIVE) {
                z = true;
                this.j.B(group.e, group.n0, z, cq5.b.a);
                this.k.setText(group.d);
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfoHelper.k(this.m, false, verifyInfo, false, false, 56);
                String i = uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                TextView textView = this.l;
                textView.setText(i);
                StringBuilder sb = new StringBuilder();
                sb.append(group.d);
                sb.append(" ");
                View view = this.h;
                sb.append(VerifyInfoHelper.c(view.getContext(), verifyInfo));
                sb.append(" ");
                text = textView.getText();
                if (text == null) {
                    text = "";
                }
                sb.append(text);
                view.setContentDescription(sb.toString());
                this.p = group;
                if (this.i) {
                    f4m.j(this.n);
                    return;
                } else {
                    this.o.a(uIBlockGroup, group);
                    return;
                }
            }
        }
        z = false;
        this.j.B(group.e, group.n0, z, cq5.b.a);
        this.k.setText(group.d);
        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
        VerifyInfoHelper.k(this.m, false, verifyInfo, false, false, 56);
        String i2 = uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
        TextView textView2 = this.l;
        textView2.setText(i2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(group.d);
        sb2.append(" ");
        View view2 = this.h;
        sb2.append(VerifyInfoHelper.c(view2.getContext(), verifyInfo));
        sb2.append(" ");
        text = textView2.getText();
        if (text == null) {
        }
        sb2.append(text);
        view2.setContentDescription(sb2.toString());
        this.p = group;
        if (this.i) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void a(GroupSubscriptionState groupSubscriptionState, Group group) {
        if (epx.f(this.p, group)) {
            GroupSubscriptionState groupSubscriptionState2 = GroupSubscriptionState.NotSubscribed;
            a aVar = this.o;
            View view = this.h;
            if (groupSubscriptionState != groupSubscriptionState2) {
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
                aVar.e(view.getContext());
                return;
            }
            if (group.p != 1) {
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Join));
                a.c(aVar, true);
                return;
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            view.getContext();
            e.b bVar = new e.b(view, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new d3j0(this, 2), 30);
            VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new bbb0(this, 18), 30);
            bVar.a().j(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void b(GroupSubscriptionState groupSubscriptionState, Group group) {
        if (epx.f(this.p, group)) {
            GroupSubscriptionState groupSubscriptionState2 = GroupSubscriptionState.NotSubscribed;
            ImageView imageView = this.n;
            if (groupSubscriptionState == groupSubscriptionState2) {
                imageView.setImageResource(R.drawable.vk_icon_add_square_outline_28);
                omw.b(imageView, R.attr.vk_ui_icon_accent);
                imageView.setVisibility(0);
                imageView.setAlpha(1.0f);
                imageView.setContentDescription(imageView.getContext().getString(R.string.join_page));
                return;
            }
            imageView.setImageResource(R.drawable.vk_icon_check_square_outline_28);
            omw.b(imageView, R.attr.vk_ui_icon_secondary);
            imageView.setVisibility(0);
            imageView.setAlpha(1.0f);
            imageView.setContentDescription(group.j ? imageView.getContext().getString(R.string.leave_group) : imageView.getContext().getString(R.string.profile_friend_cancel));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.h;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void c() {
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void d() {
    }
}
