package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.FriendsRequestsCommonVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import xsna.af0;
import xsna.ahn;
import xsna.ams;
import xsna.b5a;
import xsna.ble;
import xsna.bpn0;
import xsna.bus;
import xsna.c4r;
import xsna.c98;
import xsna.cks;
import xsna.cqm0;
import xsna.da;
import xsna.dos;
import xsna.e3m;
import xsna.eko;
import xsna.epx;
import xsna.ew;
import xsna.fy0;
import xsna.hg1;
import xsna.j5g;
import xsna.l63;
import xsna.l90;
import xsna.m3a;
import xsna.ngv0;
import xsna.o0r0;
import xsna.ogv0;
import xsna.oq;
import xsna.pgv0;
import xsna.qgv0;
import xsna.re0;
import xsna.rsg0;
import xsna.svd;
import xsna.tlo0;
import xsna.tm1;
import xsna.u11;
import xsna.ugv0;
import xsna.vgv0;
import xsna.w9;

/* compiled from: FriendsRequestsCommonVh.kt */
/* loaded from: classes16.dex */
public final class FriendsRequestsCommonVh implements CatalogViewHolder {
    public final cks b;
    public final bpn0 c;
    public VkRichCell d;
    public final bpn0 e;

    /* compiled from: FriendsRequestsCommonVh.kt */
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
                vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FriendsRequestsCommonVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: FriendsRequestsCommonVh.kt */
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

    /* compiled from: FriendsRequestsCommonVh.kt */
    public static final class d {
        public final dos a;
        public final cks b;

        public d(SearchStatInfoProvider searchStatInfoProvider, m3a m3aVar, b5a b5aVar, cks cksVar, dos dosVar) {
            this.a = dosVar;
            this.b = cksVar;
        }
    }

    /* compiled from: FriendsRequestsCommonVh.kt */
    public static final class e extends ClickableSpan {
        public final /* synthetic */ Context b;
        public final /* synthetic */ UIBlockProfile c;

        public e(Context context, UIBlockProfile uIBlockProfile) {
            this.b = context;
            this.c = uIBlockProfile;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            ams.a().j(this.b, this.c.A.c, "friends");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(e3m.f(R.attr.vk_ui_text_link_themed, this.b));
        }
    }

    /* compiled from: FriendsRequestsCommonVh.kt */
    public static final class f extends ClickableSpan {
        public final /* synthetic */ Context c;
        public final /* synthetic */ UIBlockProfile d;

        public f(Context context, UIBlockProfile uIBlockProfile) {
            this.c = context;
            this.d = uIBlockProfile;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            UIBlockProfile uIBlockProfile = this.d;
            UserProfile userProfile = uIBlockProfile.A;
            FriendsRequestsCommonVh friendsRequestsCommonVh = FriendsRequestsCommonVh.this;
            io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) friendsRequestsCommonVh.e.getValue();
            UserId userId = userProfile.c;
            m1 y0 = rsg0.y0(new ble(userId, userId.b, 0), null, null, 3);
            Context context = this.c;
            bVar.b(hg1.m(y0, context, 0L, false, 62).subscribe(new da(new l90(1, userProfile, friendsRequestsCommonVh, context, uIBlockProfile), 29), new ew(new c4r(2), 22)));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(e3m.f(R.attr.vk_ui_text_link_themed, this.c));
        }
    }

    public FriendsRequestsCommonVh(d dVar) {
        dos dosVar = dVar.a;
        this.b = dVar.b;
        new bpn0(new re0(14));
        this.c = new bpn0(new l63(15));
        new bpn0(new af0(15));
        this.e = new bpn0(new w9(15));
    }

    public static pgv0 a(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(R.string.friends_catalog_friend_added));
        spannableStringBuilder.append((CharSequence) " · ");
        spannableStringBuilder.append(context.getString(R.string.friends_catalog_message), new e(context, uIBlockProfile), 33);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        tlo0.Companion.getClass();
        return pgv0.a(pgv0Var, null, new qgv0(new tlo0.h(spannedString), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, 299);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ((io.reactivex.rxjava3.disposables.b) this.e.getValue()).dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Drawable drawable;
        CharSequence charSequence;
        final UIBlockProfile uIBlockProfile = uIBlock instanceof UIBlockProfile ? (UIBlockProfile) uIBlock : null;
        if (uIBlockProfile == null) {
            return;
        }
        final UserProfile userProfile = uIBlockProfile.A;
        VkRichCell vkRichCell = this.d;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell.setOnClickListener(new c98(new View.OnClickListener() { // from class: xsna.iss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsRequestsCommonVh friendsRequestsCommonVh = FriendsRequestsCommonVh.this;
                VkRichCell vkRichCell2 = friendsRequestsCommonVh.d;
                if (vkRichCell2 == null) {
                    vkRichCell2 = null;
                }
                Context context = vkRichCell2.getContext();
                CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
                cks cksVar = friendsRequestsCommonVh.b;
                if (cksVar != null) {
                    cksVar.b(catalogUserMeta, null);
                }
                xwk.e().m(context, userProfile.c, new o0r0.a(false, "friends", catalogUserMeta.d, null, null, null, null, false, false, false, false, null, null, null, 65528));
            }
        }, 1));
        VkRichCell vkRichCell2 = this.d;
        if (vkRichCell2 == null) {
            vkRichCell2 = null;
        }
        vkRichCell2.setLeftMainAvatarController(new b());
        VkRichCell vkRichCell3 = this.d;
        if (vkRichCell3 == null) {
            vkRichCell3 = null;
        }
        vkRichCell3.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(((UIBlockProfile) uIBlock).A), VkCell.Left.Main.Size.Large)));
        if (userProfile.B.Cb()) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfo verifyInfo = userProfile.B;
            VkRichCell vkRichCell4 = this.d;
            if (vkRichCell4 == null) {
                vkRichCell4 = null;
            }
            drawable = VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, vkRichCell4.getContext(), null, 28);
        } else {
            drawable = null;
        }
        tlo0.h d2 = oq.d(tlo0.Companion, userProfile.e);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d2, (ngv0.a) null, drawable != null ? new ngv0.a(new eko(drawable), null, null, null, 14) : null, 1, 2);
        CatalogUserMeta.Description description = (CatalogUserMeta.Description) j5g.a0(uIBlockProfile.y.m);
        if (description != null) {
            String str = description.b;
            VkRichCell vkRichCell5 = this.d;
            if (vkRichCell5 == null) {
                vkRichCell5 = null;
            }
            charSequence = cqm0.c(e3m.f(R.attr.vk_ui_text_secondary, vkRichCell5.getContext()), str);
        } else {
            charSequence = " ";
        }
        ugv0 ugv0Var = new ugv0(new tlo0.h(charSequence), (ngv0.a) null, (ngv0.a) null, 1, (fy0) null, 38);
        VkRichCell vkRichCell6 = this.d;
        if (vkRichCell6 == null) {
            vkRichCell6 = null;
        }
        pgv0 v = ahn.v(vgv0Var, ugv0Var, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
        VkRichCell vkRichCell7 = this.d;
        if (vkRichCell7 == null) {
            vkRichCell7 = null;
        }
        Context context = vkRichCell7.getContext();
        int i = uIBlockProfile.E;
        if (i == 1) {
            v = a(v, context, uIBlockProfile);
        } else if (i == 2) {
            v = b(v, context, uIBlockProfile);
        } else if (i != 3 && i != 4 && i != 5) {
            CatalogViewType catalogViewType = uIBlockProfile.d;
            CatalogViewType catalogViewType2 = CatalogViewType.LIST_FRIENDS_REQUESTS;
            Integer valueOf = catalogViewType == catalogViewType2 ? Integer.valueOf(R.string.friends_catalog_add_to_friends_short) : catalogViewType == CatalogViewType.LIST_FRIENDS_REQUESTS_OUT ? null : Integer.valueOf(R.string.friends_catalog_add);
            v = pgv0.a(v, null, null, bus.a(uIBlockProfile), valueOf == null ? null : new ogv0(new tlo0.f(valueOf.intValue()), new svd(this, context, uIBlockProfile, 4), null, VkButton.Size.Small, VkButton.Mode.Primary, null, false, false, 924), new ogv0(new tlo0.f(catalogViewType == catalogViewType2 ? R.string.friends_catalog_delete_from_subscribers_short : catalogViewType == CatalogViewType.LIST_FRIENDS_REQUESTS_OUT ? R.string.friends_catalog_unsubscribe : R.string.friends_catalog_decline), new tm1(this, context, uIBlockProfile, 2), null, VkButton.Size.Small, VkButton.Mode.Secondary, null, false, false, 924), 299);
        }
        vkRichCell6.setMiddle(v);
    }

    public final pgv0 b(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile) {
        CharSequence spannedString;
        CatalogViewType catalogViewType = uIBlockProfile.d;
        if (catalogViewType == CatalogViewType.LIST_FRIENDS_REQUESTS_OUT) {
            spannedString = context.getString(R.string.friends_catalog_request_canceled);
        } else if (catalogViewType == CatalogViewType.LIST_FRIENDS_REQUESTS) {
            spannedString = context.getString(R.string.friends_catalog_subscription_deleted);
        } else if (uIBlockProfile.A.m) {
            spannedString = context.getString(R.string.friends_catalog_report_sent);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) context.getString(R.string.friends_catalog_declined));
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append(context.getString(R.string.report_content), new f(context, uIBlockProfile), 33);
            spannedString = new SpannedString(spannableStringBuilder);
        }
        return pgv0.a(pgv0Var, null, new qgv0(u11.f(tlo0.Companion, spannedString), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, 299);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRichCell vkRichCell = (VkRichCell) layoutInflater.inflate(R.layout.catalog_friends_suggest_item, viewGroup, false);
        this.d = vkRichCell;
        VkRichCell vkRichCell2 = vkRichCell == null ? null : vkRichCell;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        vkRichCell2.setBackground(e3m.e(R.attr.selectableItemBackground, vkRichCell.getContext()));
        VkRichCell vkRichCell3 = this.d;
        if (vkRichCell3 == null) {
            return null;
        }
        return vkRichCell3;
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
