package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.avatar.badge.e;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.ahn;
import xsna.b5a;
import xsna.bpn0;
import xsna.c98;
import xsna.cfp0;
import xsna.cks;
import xsna.cqm0;
import xsna.e3m;
import xsna.eko;
import xsna.epx;
import xsna.fy0;
import xsna.j5g;
import xsna.l9;
import xsna.m3a;
import xsna.ngv0;
import xsna.o0r0;
import xsna.oq;
import xsna.pgv0;
import xsna.tlo0;
import xsna.ugv0;
import xsna.uw3;
import xsna.vgv0;
import xsna.xwk;

/* compiled from: BaseFriendsProfileVh.kt */
/* loaded from: classes16.dex */
public abstract class BaseFriendsProfileVh implements CatalogViewHolder, View.OnClickListener {
    public final m3a b;
    public final b5a c;
    public final cks d;
    public final SearchStatInfoProvider e;
    public VkRichCell g;
    public UIBlockProfile h;
    public final bpn0 f = new bpn0(new uw3(3));
    public final bpn0 i = new bpn0(new l9(2));

    /* compiled from: BaseFriendsProfileVh.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            int k = VkCell.Left.Main.Size.Large.k(context);
            vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(k, k));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vkAvatar.S0();
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            UserProfile userProfile;
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null || (userProfile = cVar.a) == null) {
                return;
            }
            String o = userProfile.o(72);
            VkAvatar vkAvatar = this.a;
            vkAvatar.o0(o, null);
            if (userProfile.n.Bb()) {
                vkAvatar.Q0(new e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: BaseFriendsProfileVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: BaseFriendsProfileVh.kt */
    public static final class c implements VkCell.f {
        public final UserProfile a;

        public c(UserProfile userProfile) {
            this.a = userProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewParams(profile=" + this.a + ')';
        }
    }

    /* compiled from: BaseFriendsProfileVh.kt */
    public static class d {
        public final m3a a;
        public final b5a b;
        public final cks c;
        public final SearchStatInfoProvider d;

        public d(m3a m3aVar, b5a b5aVar, cks cksVar, SearchStatInfoProvider searchStatInfoProvider) {
            this.a = m3aVar;
            this.b = b5aVar;
            this.c = cksVar;
            this.d = searchStatInfoProvider;
        }
    }

    public BaseFriendsProfileVh(d dVar) {
        this.b = dVar.a;
        this.c = dVar.b;
        this.d = dVar.c;
        this.e = dVar.d;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        Drawable drawable;
        CharSequence charSequence;
        UIBlockProfile uIBlockProfile = uIBlock instanceof UIBlockProfile ? (UIBlockProfile) uIBlock : null;
        if (uIBlockProfile == null) {
            return;
        }
        this.h = uIBlockProfile;
        UserProfile userProfile = uIBlockProfile.A;
        VkRichCell vkRichCell = this.g;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell.setLeftMainAvatarController(new b());
        VkRichCell vkRichCell2 = this.g;
        if (vkRichCell2 == null) {
            vkRichCell2 = null;
        }
        VkCell.Left.a aVar = VkCell.Left.Companion;
        c cVar = new c(userProfile);
        VerifyInfo verifyInfo = userProfile.B;
        vkRichCell2.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(cVar, VkCell.Left.Main.Size.Large)));
        if (verifyInfo.Cb()) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VkRichCell vkRichCell3 = this.g;
            if (vkRichCell3 == null) {
                vkRichCell3 = null;
            }
            drawable = VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, vkRichCell3.getContext(), null, 28);
        } else {
            drawable = null;
        }
        tlo0.h d2 = oq.d(tlo0.Companion, userProfile.e);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d2, (ngv0.a) null, drawable != null ? new ngv0.a(new eko(drawable), null, null, null, 12) : null, 1, 2);
        CatalogUserMeta.Description description = (CatalogUserMeta.Description) j5g.a0(uIBlockProfile.y.m);
        if (description != null) {
            String str = description.b;
            VkRichCell vkRichCell4 = this.g;
            if (vkRichCell4 == null) {
                vkRichCell4 = null;
            }
            charSequence = cqm0.c(e3m.f(R.attr.vk_ui_text_secondary, vkRichCell4.getContext()), str);
        } else {
            charSequence = "";
        }
        pgv0 v = ahn.v(vgv0Var, new ugv0(new tlo0.h(charSequence), (ngv0.a) null, (ngv0.a) null, 1, (fy0) null, 38), null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        VkRichCell vkRichCell5 = this.g;
        VkRichCell vkRichCell6 = vkRichCell5 != null ? vkRichCell5 : null;
        if (vkRichCell5 == null) {
            vkRichCell5 = null;
        }
        vkRichCell6.setMiddle(a(v, vkRichCell5.getContext(), uIBlockProfile, uIBlockProfile.E));
        VkRichCell vkRichCell7 = this.g;
        VkRichCell vkRichCell8 = vkRichCell7 != null ? vkRichCell7 : null;
        (vkRichCell7 != null ? vkRichCell7 : null).getContext();
        vkRichCell8.setRight(b());
    }

    public abstract pgv0 a(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile, int i);

    public VkCell.Right.d b() {
        return null;
    }

    public final void c(FriendsAnalyticsInfo.ClickTarget clickTarget) {
        UIBlockProfile uIBlockProfile = this.h;
        if (uIBlockProfile == null) {
            return;
        }
        this.c.a(new cfp0(uIBlockProfile, new FriendsAnalyticsInfo(clickTarget)));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRichCell vkRichCell = (VkRichCell) layoutInflater.inflate(R.layout.catalog_friends_suggest_item, viewGroup, false);
        this.g = vkRichCell;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell.setOnClickListener(new c98(this, 1));
        VkRichCell vkRichCell2 = this.g;
        VkRichCell vkRichCell3 = vkRichCell2 != null ? vkRichCell2 : null;
        if (vkRichCell2 == null) {
            vkRichCell2 = null;
        }
        vkRichCell3.setBackground(e3m.e(R.attr.selectableItemBackground, vkRichCell2.getContext()));
        VkRichCell vkRichCell4 = this.g;
        if (vkRichCell4 != null) {
            return vkRichCell4;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockProfile uIBlockProfile = this.h;
        if (uIBlockProfile != null) {
            VkRichCell vkRichCell = this.g;
            if (vkRichCell == null) {
                vkRichCell = null;
            }
            Context context = vkRichCell.getContext();
            UserProfile userProfile = uIBlockProfile.A;
            CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
            cks cksVar = this.d;
            if (cksVar != null) {
                cksVar.b(catalogUserMeta, null);
            }
            o0r0 e = xwk.e();
            UserId userId = userProfile.c;
            String str = catalogUserMeta.d;
            e.m(context, userId, new o0r0.a(false, "friends", str, null, this.e.b(SchemeStat$EventItem.Type.USER, str, false), userProfile.e, userProfile.h, userProfile.Y, userProfile.T, false, false, null, null, null, 65032));
        }
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
