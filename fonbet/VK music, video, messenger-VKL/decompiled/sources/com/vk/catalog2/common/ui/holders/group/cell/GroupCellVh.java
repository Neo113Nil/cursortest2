package com.vk.catalog2.common.ui.holders.group.cell;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.a;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.left.VkCellLeft;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ams;
import xsna.b5a;
import xsna.c98;
import xsna.cn70;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fkq0;
import xsna.fsg;
import xsna.fy0;
import xsna.gbj;
import xsna.gko;
import xsna.gzs;
import xsna.hc1;
import xsna.izs;
import xsna.k1u0;
import xsna.krv0;
import xsna.m3a;
import xsna.ngv0;
import xsna.q3a;
import xsna.tlo0;
import xsna.tq;
import xsna.u1u0;
import xsna.u3k;
import xsna.vf1;
import xsna.x7g;

/* compiled from: GroupCellVh.kt */
/* loaded from: classes16.dex */
public class GroupCellVh extends BaseGroupVh implements View.OnClickListener, a.InterfaceC0484a {
    public final m3a h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public VkRichCell n;
    public com.vk.catalog2.common.ui.holders.group.a o;
    public Group p;
    public GroupCatalogItem q;
    public final fsg r;

    /* compiled from: GroupCellVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GroupCellViewState$VerifyType.values().length];
            try {
                iArr[GroupCellViewState$VerifyType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupCellViewState$VerifyType.Verified.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupCellViewState$VerifyType.ConfirmedBusiness.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupCellViewState$VerifyType.PremiumBusiness.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupCellViewState$VerifyType.NonProfitOrganization.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GroupSubscriptionState.values().length];
            try {
                iArr2[GroupSubscriptionState.RecentlySubscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GroupSubscriptionState.Subscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GroupSubscriptionState.NotSubscribed.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: GroupCellVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Group, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(Group group) {
            return Boolean.valueOf(((GroupCellVh) this.receiver).l(group));
        }
    }

    public GroupCellVh() {
        this(0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null, null, null, null, false);
    }

    public static VkCell.Right.a q(GroupCatalogItem groupCatalogItem) {
        if (groupCatalogItem == null) {
            return null;
        }
        int i = groupCatalogItem.d;
        if (i > 20) {
            return new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent);
        }
        if (1 > i || i >= 21) {
            return null;
        }
        return new VkCell.Right.a.d(i, VkCounter.CounterAppearance.Appearance.Accent, VkCounter.Mode.Primary);
    }

    public static ngv0.a r() {
        return new ngv0.a(new gko(R.drawable.vk_icon_badge_vk_pay_14), new x7g(R.attr.vk_ui_icon_secondary), null, new Size(cn70.b(34), cn70.b(12)), 4);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        com.vk.catalog2.common.ui.holders.group.a aVar = this.o;
        if (aVar != null) {
            aVar.c.e();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
            p(uIBlockGroup.y, uIBlockGroup.z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void a(GroupSubscriptionState groupSubscriptionState, Group group) {
        if (epx.f(this.p, group)) {
            VkRichCell vkRichCell = this.n;
            if (vkRichCell == null) {
                vkRichCell = null;
            }
            Context context = vkRichCell.getContext();
            if (context == null) {
                return;
            }
            int i = a.$EnumSwitchMapping$1[groupSubscriptionState.ordinal()];
            if (i == 1) {
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
                com.vk.catalog2.common.ui.holders.group.a aVar = this.o;
                if (aVar != null) {
                    aVar.e(context);
                    return;
                }
                return;
            }
            if (i == 2) {
                if (this.j) {
                    m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.SendMessage));
                    ams.a().j(context, fkq0.e(group.c), "groups");
                    return;
                }
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (group.p != 1) {
                m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Join));
                com.vk.catalog2.common.ui.holders.group.a aVar2 = this.o;
                if (aVar2 != null) {
                    com.vk.catalog2.common.ui.holders.group.a.d(aVar2, true, null, null, 6);
                    return;
                }
                return;
            }
            VkRichCell vkRichCell2 = this.n;
            VkRichCell vkRichCell3 = vkRichCell2 == null ? null : vkRichCell2;
            VkRichCell vkRichCell4 = vkRichCell2 != null ? vkRichCell2 : null;
            VkRichCell.Region region = VkRichCell.Region.RightExtra;
            VkCellLeft vkCellLeft = vkRichCell4.f;
            VkCellRight vkCellRight = vkRichCell4.g;
            Rect rect = new Rect();
            switch (VkRichCell.a.$EnumSwitchMapping$0[region.ordinal()]) {
                case 1:
                    FrameLayout frameLayout = vkCellLeft.h;
                    if (frameLayout != null) {
                        frameLayout.getGlobalVisibleRect(rect);
                        break;
                    }
                    break;
                case 2:
                    vkCellLeft.b().getGlobalVisibleRect(rect);
                    break;
                case 3:
                    vkRichCell4.h.f.getTextView().getGlobalVisibleRect(rect);
                    break;
                case 4:
                    vkCellRight.c().getGlobalVisibleRect(rect);
                    break;
                case 5:
                    vkCellRight.h().getGlobalVisibleRect(rect);
                    break;
                case 6:
                    vkCellRight.f().getGlobalVisibleRect(rect);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            vkRichCell3.getContext();
            e.c cVar = new e.c(null, rect, vkRichCell3, l, 1);
            VkContextMenu.c.c(cVar, R.string.group_event_join, null, false, null, new gbj(this, 18), 30);
            VkContextMenu.c.c(cVar, R.string.group_event_join_unsure, null, false, null, new u3k(this, 17), 30);
            cVar.a().j(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void b(GroupSubscriptionState groupSubscriptionState, Group group) {
        VkCell.Right.e.b bVar;
        Group group2;
        VkCell.Right.e.b bVar2;
        VkRichCell vkRichCell = this.n;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        int i = a.$EnumSwitchMapping$1[groupSubscriptionState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_square_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (Size) null, (tlo0) s(groupSubscriptionState), false, (gzs) new fy0(10, this, groupSubscriptionState), 20);
            } else if (this.j && (group2 = this.p) != null && group2.t) {
                bVar2 = new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_message_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (Size) null, (tlo0) s(groupSubscriptionState), false, (gzs) new hc1(13, this, groupSubscriptionState), 20);
            } else {
                bVar = null;
            }
            bVar = bVar2;
        } else {
            bVar = new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_done_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) s(groupSubscriptionState), false, (gzs) new vf1(8, this, groupSubscriptionState), 20);
        }
        vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, q(this.q), bVar, null, null, 28));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup != null && (viewGroup.getPaddingStart() != 0 || viewGroup.getPaddingEnd() != 0)) {
            f4m.l(0, 0, viewGroup);
        }
        VkRichCell vkRichCell = new VkRichCell(layoutInflater.getContext(), null, 6, 0);
        int i = this.i;
        if (i == Integer.MAX_VALUE) {
            i = -1;
        }
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(i, -2));
        this.n = vkRichCell;
        vkRichCell.setOnClickListener(new c98(this, 1));
        vkRichCell.setLeftMainAvatarController(this.r);
        vkRichCell.setBackground(e3m.e(R.attr.selectableItemBackground, vkRichCell.getContext()));
        u1u0.g(vkRichCell);
        return vkRichCell;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h(view.getContext(), this.p, null, null, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public void p(com.vk.dto.group.Group r29, com.vk.dto.group.GroupCatalogItem r30) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.catalog2.common.ui.holders.group.cell.GroupCellVh.p(com.vk.dto.group.Group, com.vk.dto.group.GroupCatalogItem):void");
    }

    public final tlo0.f s(GroupSubscriptionState groupSubscriptionState) {
        Integer valueOf;
        Group group = this.p;
        if (group != null) {
            int i = a.$EnumSwitchMapping$1[groupSubscriptionState.ordinal()];
            if (i == 1) {
                valueOf = Integer.valueOf(group.j ? R.string.leave_group : R.string.profile_friend_cancel);
            } else if (i == 2) {
                valueOf = (this.j && group.t) ? Integer.valueOf(R.string.search_all_catalog_accessibility_send_message_group) : null;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                valueOf = Integer.valueOf(R.string.community_join);
            }
            if (valueOf != null) {
                return tq.h(tlo0.Companion, valueOf.intValue());
            }
        }
        return null;
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCellVh(int i, int i2, SearchStatInfoProvider searchStatInfoProvider, m3a m3aVar, q3a q3aVar, b5a b5aVar, boolean z) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        m3aVar = (i2 & 1) != 0 ? null : m3aVar;
        b5aVar = (i2 & 2) != 0 ? null : b5aVar;
        q3aVar = (i2 & 4) != 0 ? null : q3aVar;
        i = (i2 & 8) != 0 ? Integer.MAX_VALUE : i;
        searchStatInfoProvider = (i2 & 32) != 0 ? null : searchStatInfoProvider;
        boolean z2 = (i2 & 64) == 0;
        boolean z3 = (i2 & 128) == 0;
        z = (i2 & 512) != 0 ? false : z;
        this.h = m3aVar;
        this.i = i;
        this.j = z2;
        this.k = z3;
        this.l = true;
        this.m = z;
        this.r = new fsg();
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void c() {
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void d() {
    }
}
