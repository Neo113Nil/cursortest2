package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.movika.sdk.base.ui.k;
import com.vk.movika.sdk.base.ui.l;
import com.vkontakte.android.R;
import defpackage.f0;
import defpackage.i0;
import ru.ok.android.webrtc.Privacy;
import xsna.a44;
import xsna.ams;
import xsna.b5a;
import xsna.bpn0;
import xsna.c3q;
import xsna.cfp0;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.ew;
import xsna.gko;
import xsna.go6;
import xsna.gzs;
import xsna.hg1;
import xsna.hkc;
import xsna.izs;
import xsna.js5;
import xsna.k1u0;
import xsna.ko3;
import xsna.m3a;
import xsna.nts;
import xsna.o25;
import xsna.odu0;
import xsna.p41;
import xsna.q3a;
import xsna.qoy;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sps;
import xsna.tlo0;
import xsna.tps;
import xsna.tq;
import xsna.u1u0;
import xsna.up;
import xsna.ups;
import xsna.w00;
import xsna.x7g;
import xsna.yfb;
import xsna.zls;

/* compiled from: FriendsItemSearchListVh.kt */
/* loaded from: classes16.dex */
public final class FriendsItemSearchListVh implements CatalogViewHolder {
    public final m3a b;
    public final b5a c;
    public final q3a d;
    public final SearchStatInfoProvider e;
    public VkRichCell g;
    public UIBlockProfile i;
    public final bpn0 f = new bpn0(new a44(19));
    public final b h = new b();
    public final io.reactivex.rxjava3.disposables.b j = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: FriendsItemSearchListVh.kt */
    public static final class a {
        public final String a;
        public final boolean b;
        public final OnlineInfo c;

        public a(String str, boolean z, OnlineInfo onlineInfo) {
            this.a = str;
            this.b = z;
            this.c = onlineInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "FriendsAvatar(baseUrl=" + this.a + ", hasUnseenStories=" + this.b + ", online=" + this.c + ')';
        }
    }

    /* compiled from: FriendsItemSearchListVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new c(context);
        }
    }

    /* compiled from: FriendsItemSearchListVh.kt */
    public static final class c implements VkCell.d {
        public final VkAvatar a;

        public c(Context context) {
            this.a = new VkAvatar(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            d dVar = fVar instanceof d ? (d) fVar : null;
            if (dVar == null) {
                return;
            }
            a aVar = dVar.a;
            String a = js5.a(200, aVar.a);
            if (a == null) {
                a = "";
            }
            VkAvatar vkAvatar = this.a;
            vkAvatar.s0(a);
            izs<View, s3q0> izsVar = dVar.b;
            if (izsVar != null) {
                vkAvatar.setOnClickListener(new hkc(1, izsVar, this));
            }
            boolean z = aVar.b;
            OnlineInfo onlineInfo = aVar.c;
            vkAvatar.S0();
            if (onlineInfo.Bb()) {
                VisibleStatus zb = onlineInfo.zb();
                if ((zb != null ? zb.e : null) == Platform.WEB) {
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
                } else {
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.c(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight));
                }
            }
            String string = vkAvatar.getContext().getString(R.string.accessibility_catalog_story_at_avatar);
            if (!z) {
                string = null;
            }
            vkAvatar.setContentDescription(string != null ? string : "");
            if (z) {
                vkAvatar.W0(new odu0(), false);
            } else {
                vkAvatar.W0(null, false);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FriendsItemSearchListVh.kt */
    public static final class d implements VkCell.f {
        public final a a;
        public final izs<View, s3q0> b;

        public d(a aVar, com.vk.catalog2.common.ui.holders.friend.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            izs<View, s3q0> izsVar = this.b;
            return hashCode + (izsVar == null ? 0 : izsVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsAvatarViewParams(avatar=");
            sb.append(this.a);
            sb.append(", onClick=");
            return up.c(sb, this.b, ')');
        }
    }

    /* compiled from: FriendsItemSearchListVh.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialButtonType.values().length];
            try {
                iArr[SocialButtonType.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FriendsItemSearchListVh(m3a m3aVar, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = m3aVar;
        this.c = b5aVar;
        this.d = q3aVar;
        this.e = searchStatInfoProvider;
    }

    public static boolean a(UIBlockProfile uIBlockProfile) {
        return (uIBlockProfile.A.M() || o25.a().a(uIBlockProfile.A.c)) ? false : true;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.j.e();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(com.vk.catalog2.common.dto.api.ui.UIBlock r33) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh.N6(com.vk.catalog2.common.dto.api.ui.UIBlock):void");
    }

    public final void b(UIBlockProfile uIBlockProfile) {
        UserProfile userProfile = uIBlockProfile.A;
        CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
        boolean a2 = a(uIBlockProfile);
        io.reactivex.rxjava3.disposables.b bVar = this.j;
        if (a2) {
            SocialButtonType socialButtonType = userProfile.e0;
            g(uIBlockProfile, new FriendsAnalyticsInfo((socialButtonType != null ? e.$EnumSwitchMapping$0[socialButtonType.ordinal()] : -1) == 1 ? FriendsAnalyticsInfo.ClickTarget.Follow : FriendsAnalyticsInfo.ClickTarget.AddToFriends));
            VkRichCell vkRichCell = this.g;
            if (vkRichCell == null) {
                vkRichCell = null;
            }
            Context context = vkRichCell.getContext();
            c3q a3 = c3q.a.a(userProfile.c, null, true);
            a3.F0(Privacy.FRIENDS);
            a3.H0(catalogUserMeta.d);
            bVar.b(hg1.m(rsg0.y0(a3, null, null, 3), context, 0L, false, 62).subscribe(new i0(new sps(userProfile, uIBlockProfile, this, context, 0), 23), new p41(tps.b, 25)));
            return;
        }
        if (uIBlockProfile.z.b != CatalogProfileLocalState.FollowSource.Internal) {
            g(uIBlockProfile, new FriendsAnalyticsInfo(FriendsAnalyticsInfo.ClickTarget.SendMessage));
            zls a4 = ams.a();
            VkRichCell vkRichCell2 = this.g;
            a4.j((vkRichCell2 != null ? vkRichCell2 : null).getContext(), userProfile.c, "friends");
            return;
        }
        SocialButtonType socialButtonType2 = userProfile.e0;
        g(uIBlockProfile, new FriendsAnalyticsInfo((socialButtonType2 != null ? e.$EnumSwitchMapping$0[socialButtonType2.ordinal()] : -1) == 1 ? FriendsAnalyticsInfo.ClickTarget.Unfollow : FriendsAnalyticsInfo.ClickTarget.RemoveFromFriends));
        VkRichCell vkRichCell3 = this.g;
        if (vkRichCell3 == null) {
            vkRichCell3 = null;
        }
        bVar.b(hg1.m(rsg0.y0(yfb.x(nts.g((nts) this.f.getValue(), userProfile.c, null, catalogUserMeta.d, Privacy.FRIENDS, null, 18)), null, null, 3), vkRichCell3.getContext(), 0L, false, 62).subscribe(new w00(new go6(userProfile, this, uIBlockProfile, 1), 20), new ew(ups.b, 21)));
    }

    public final void c(UIBlockProfile uIBlockProfile) {
        VkRichCell vkRichCell = this.g;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_square_outline_28), (k1u0) null, (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.friends_catalog_accessibility_follow), false, (gzs) new k(11, this, uIBlockProfile), 22), null, null, 29));
    }

    public final void d(UIBlockProfile uIBlockProfile) {
        VkRichCell vkRichCell = this.g;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_user_add_outline_28), (k1u0) null, (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.friends_catalog_accessibility_add_friend), false, (gzs) new f0(13, this, uIBlockProfile), 22), null, null, 29));
    }

    public final void e(UIBlockProfile uIBlockProfile) {
        UserProfile userProfile;
        VkRichCell vkRichCell = this.g;
        SocialButtonType socialButtonType = null;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        VkCell.Right.c cVar = VkCell.Right.Companion;
        gko gkoVar = new gko(R.drawable.vk_icon_done_outline_28);
        k1u0.a aVar = new k1u0.a(new x7g(R.attr.vk_ui_vkontakte_color_icon_outline_secondary));
        tlo0.a aVar2 = tlo0.Companion;
        UIBlockProfile uIBlockProfile2 = this.i;
        if (uIBlockProfile2 != null && (userProfile = uIBlockProfile2.A) != null) {
            socialButtonType = userProfile.e0;
        }
        vkRichCell.setRight(VkCell.Right.c.a(cVar, null, new VkCell.Right.e.b((dko) gkoVar, (k1u0) aVar, (Size) null, (tlo0) tq.h(aVar2, (socialButtonType == null ? -1 : e.$EnumSwitchMapping$0[socialButtonType.ordinal()]) == 1 ? R.string.friends_catalog_accessibility_unfollow : R.string.friends_catalog_accessibility_cancel_add_friend), false, (gzs) new l(11, this, uIBlockProfile), 20), null, null, 29));
    }

    public final void g(UIBlock uIBlock, FriendsAnalyticsInfo friendsAnalyticsInfo) {
        if (uIBlock != null) {
            this.c.a(new cfp0(uIBlock, friendsAnalyticsInfo));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRichCell vkRichCell = new VkRichCell(layoutInflater.getContext(), null, 6, 0);
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.g = vkRichCell;
        vkRichCell.setOnClickListener(new ko3(this, 6));
        vkRichCell.setLeftMainAvatarController(this.h);
        vkRichCell.setBackground(e3m.e(R.attr.selectableItemBackground, vkRichCell.getContext()));
        u1u0.g(vkRichCell);
        return vkRichCell;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
