package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.CatalogUserMeta;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionIconButton;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.FriendsAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.avatar.badge.e;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.Platform;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import defpackage.c0;
import defpackage.n;
import defpackage.p;
import defpackage.q0;
import defpackage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.Privacy;
import xsna.ag9;
import xsna.ams;
import xsna.asu0;
import xsna.b5a;
import xsna.baf0;
import xsna.bf2;
import xsna.bwt0;
import xsna.c3q;
import xsna.c98;
import xsna.cfp0;
import xsna.cg9;
import xsna.cks;
import xsna.cn70;
import xsna.cqm0;
import xsna.dhh;
import xsna.dhr0;
import xsna.dko;
import xsna.e3m;
import xsna.e40;
import xsna.eko;
import xsna.epx;
import xsna.f40;
import xsna.gko;
import xsna.gwg;
import xsna.gzs;
import xsna.hbh0;
import xsna.hg1;
import xsna.ig1;
import xsna.j5g;
import xsna.jzi0;
import xsna.k1u0;
import xsna.krv0;
import xsna.lrk;
import xsna.m3a;
import xsna.mcr0;
import xsna.nps;
import xsna.o0r0;
import xsna.o25;
import xsna.odu0;
import xsna.ops;
import xsna.oq;
import xsna.oz;
import xsna.pps;
import xsna.q3a;
import xsna.qps;
import xsna.rps;
import xsna.rsg0;
import xsna.tc;
import xsna.tlo0;
import xsna.u1u0;
import xsna.xwk;
import xsna.zo8;

/* compiled from: FriendsItemListVh.kt */
/* loaded from: classes16.dex */
public final class FriendsItemListVh implements CatalogViewHolder {
    public final m3a b;
    public final q3a c;
    public final b5a d;
    public final SearchStatInfoProvider e;
    public final cks f;
    public final jzi0 g;
    public UIBlockProfile h;
    public final io.reactivex.rxjava3.disposables.b i = new io.reactivex.rxjava3.disposables.b();
    public VkCell j;

    /* compiled from: FriendsItemListVh.kt */
    public static final class a implements VkCell.d {
        public final c0 a;
        public final zo8 b;
        public final VkAvatar c;

        public a(Context context, c0 c0Var, zo8 zo8Var) {
            this.a = c0Var;
            this.b = zo8Var;
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            int b = hbh0.b(56, context);
            vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(b, b));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vkAvatar.S0();
            this.c = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            UserProfile userProfile;
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null || (userProfile = cVar.a) == null) {
                return;
            }
            String o = userProfile.o(72);
            VkAvatar vkAvatar = this.c;
            vkAvatar.o0(o, null);
            vkAvatar.S0();
            if (userProfile.n.Bb()) {
                VisibleStatus zb = userProfile.n.zb();
                if ((zb != null ? zb.e : null) == Platform.WEB) {
                    vkAvatar.Q0(new e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
                } else {
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.c(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight));
                }
            }
            if (((c) fVar).b) {
                gko.b bVar = gko.Companion;
                vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.a(gko.b(R.drawable.vk_icon_cake_circle_fill_purple_20, vkAvatar.getContext()), true, VkAvatarBadge.Alignment.BottomRight, new SizeF(cn70.c(16), cn70.c(16)), "birthday"));
            }
            if (userProfile.T) {
                vkAvatar.setBorder(new odu0());
                vkAvatar.setContentDescription(vkAvatar.getContext().getString(R.string.accessibility_catalog_story_at_avatar));
                bwt0.i0(vkAvatar, new lrk(this, 14));
            } else {
                vkAvatar.setBorder(null);
                vkAvatar.setContentDescription(userProfile.e);
                bwt0.i0(vkAvatar, new dhh(this, 15));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.c;
        }
    }

    /* compiled from: FriendsItemListVh.kt */
    public static final class b implements VkCell.e {
        public final c0 a;
        public final zo8 b;

        public b(c0 c0Var, zo8 zo8Var) {
            this.a = c0Var;
            this.b = zo8Var;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context, this.a, this.b);
        }
    }

    /* compiled from: FriendsItemListVh.kt */
    public static final class c implements VkCell.f {
        public final UserProfile a;
        public final boolean b;

        public c(UserProfile userProfile, boolean z) {
            this.a = userProfile;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarViewParams(profile=");
            sb.append(this.a);
            sb.append(", hasBirthday=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: FriendsItemListVh.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[SocialButtonType.values().length];
            try {
                iArr[SocialButtonType.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_MAKE_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_REMOVE_FRIEND.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_GIFTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_SHOW_OPTIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UserSex.values().length];
            try {
                iArr3[UserSex.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public FriendsItemListVh(m3a m3aVar, q3a q3aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, cks cksVar, jzi0 jzi0Var) {
        this.b = m3aVar;
        this.c = q3aVar;
        this.d = b5aVar;
        this.e = searchStatInfoProvider;
        this.f = cksVar;
        this.g = jzi0Var;
    }

    public static Size g(Context context) {
        return new Size(hbh0.b(20, context), hbh0.b(20, context));
    }

    public static gko h(CatalogViewType catalogViewType) {
        int i;
        switch (catalogViewType == null ? -1 : d.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
            case 1:
                i = R.drawable.vk_icon_message_outline_28;
                break;
            case 2:
                i = R.drawable.vk_icon_phone_outline_28;
                break;
            case 3:
                i = R.drawable.vk_icon_user_add_outline_28;
                break;
            case 4:
                i = R.drawable.vk_icon_user_minus_outline_28;
                break;
            case 5:
                i = R.drawable.vk_icon_gift_outline_28;
                break;
            case 6:
                i = R.drawable.vk_icon_more_vertical_24;
                break;
            default:
                return null;
        }
        return new gko(i);
    }

    public static String j(CatalogViewType catalogViewType, Context context) {
        int i;
        switch (catalogViewType == null ? -1 : d.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
            case 1:
                i = R.string.friends_catalog_accessibility_send_message;
                break;
            case 2:
                i = R.string.friends_catalog_accessibility_make_call;
                break;
            case 3:
                i = R.string.friends_catalog_accessibility_add_friend;
                break;
            case 4:
                i = R.string.friends_catalog_accessibility_unfriend;
                break;
            case 5:
                i = R.string.friends_catalog_accessibility_send_gift;
                break;
            case 6:
                i = R.string.accessibility_actions;
                break;
            default:
                return null;
        }
        return context.getString(i);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        cks cksVar;
        String str;
        UIBlockProfile uIBlockProfile = this.h;
        if (uIBlockProfile != null && (cksVar = this.f) != null && (str = uIBlockProfile.B) != null) {
            cksVar.a(str, uIBlockProfile.b);
        }
        this.i.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x029b, code lost:
    
        if (((java.util.HashSet) r9.b).contains(r2.c) != false) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.vk.core.view.components.cell.VkCell$Right$e$c] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        Drawable drawable;
        VkCell.Middle.e.b c0817b;
        CharSequence charSequence;
        Object obj;
        VkCell.Right.e.b bVar;
        String str;
        Image image;
        ImageSize Ab;
        final UIBlockProfile uIBlockProfile = uIBlock instanceof UIBlockProfile ? (UIBlockProfile) uIBlock : null;
        if (uIBlockProfile == null) {
            return;
        }
        final UserProfile userProfile = uIBlockProfile.A;
        CatalogUserMeta catalogUserMeta = uIBlockProfile.y;
        this.h = uIBlockProfile;
        VkCell vkCell = this.j;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.setOnClickListener(new c98(new View.OnClickListener() { // from class: xsna.mps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendsItemListVh friendsItemListVh = FriendsItemListVh.this;
                VkCell vkCell2 = friendsItemListVh.j;
                if (vkCell2 == null) {
                    vkCell2 = null;
                }
                friendsItemListVh.c(vkCell2.getContext(), uIBlockProfile.y, userProfile);
            }
        }, 1));
        VkCell vkCell2 = this.j;
        if (vkCell2 == null) {
            vkCell2 = null;
        }
        vkCell2.setLeftMainAvatarController(new b(new c0(this, uIBlockProfile, userProfile, 3), new zo8(this, userProfile, uIBlockProfile, 3)));
        VkCell vkCell3 = this.j;
        if (vkCell3 == null) {
            vkCell3 = null;
        }
        VkCell.Left.a aVar = VkCell.Left.Companion;
        boolean zb = catalogUserMeta.zb();
        List<CatalogUserMeta.Description> list = catalogUserMeta.m;
        c cVar = new c(userProfile, zb);
        VerifyInfo verifyInfo = userProfile.B;
        vkCell3.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(cVar, 56)));
        if (verifyInfo.Cb()) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VkCell vkCell4 = this.j;
            if (vkCell4 == null) {
                vkCell4 = null;
            }
            drawable = VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, vkCell4.getContext(), null, 28);
        } else {
            drawable = null;
        }
        ImageStatus imageStatus = userProfile.R;
        String str2 = (imageStatus == null || (image = imageStatus.d) == null || (Ab = image.Ab(cn70.b(20), false)) == null) ? null : Ab.d.d;
        if (drawable != null && str2 != null) {
            gko gkoVar = new gko(R.drawable.user_placeholder);
            k1u0.c cVar2 = k1u0.c.a;
            VkCell vkCell5 = this.j;
            if (vkCell5 == null) {
                vkCell5 = null;
            }
            VkCell.Middle.e.b.C0817b c0817b2 = new VkCell.Middle.e.b.C0817b(gkoVar, cVar2, (tlo0.f) null, g(vkCell5.getContext()), 4);
            eko ekoVar = new eko(drawable);
            VkCell vkCell6 = this.j;
            if (vkCell6 == null) {
                vkCell6 = null;
            }
            c0817b = new VkCell.Middle.e.b.c(c0817b2, new VkCell.Middle.e.b.C0817b(ekoVar, cVar2, (tlo0.f) null, g(vkCell6.getContext()), 4));
        } else if (drawable != null) {
            eko ekoVar2 = new eko(drawable);
            k1u0.c cVar3 = k1u0.c.a;
            VkCell vkCell7 = this.j;
            if (vkCell7 == null) {
                vkCell7 = null;
            }
            c0817b = new VkCell.Middle.e.b.C0817b(ekoVar2, cVar3, (tlo0.f) null, g(vkCell7.getContext()), 4);
        } else {
            c0817b = str2 != null ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.user_placeholder), k1u0.c.a, (tlo0.f) null, (Size) null, 12) : null;
        }
        tlo0.h d2 = oq.d(tlo0.Companion, userProfile.e);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        VkCell.Middle.e eVar = new VkCell.Middle.e(d2, 1, truncateAt, (VkCell.Middle.e.b) null, c0817b, 18);
        VkCell.Middle.e.b bVar2 = c0817b;
        boolean z = true;
        if (!catalogUserMeta.zb()) {
            CatalogUserMeta.Description description = (CatalogUserMeta.Description) j5g.a0(list);
            if (description != null) {
                String str3 = description.b;
                VkCell vkCell8 = this.j;
                if (vkCell8 == null) {
                    vkCell8 = null;
                }
                Context context = vkCell8.getContext();
                CatalogUserMeta.Description description2 = (CatalogUserMeta.Description) j5g.a0(list);
                charSequence = cqm0.c(e3m.f((description2 == null || !description2.d) ? R.attr.vk_ui_text_secondary : R.attr.vk_ui_text_accent, context), str3);
            } else {
                charSequence = " ";
            }
        } else if (catalogUserMeta.Ab()) {
            VkCell vkCell9 = this.j;
            if (vkCell9 == null) {
                vkCell9 = null;
            }
            charSequence = vkCell9.getContext().getString(R.string.friends_catalog_today);
        } else {
            VkCell vkCell10 = this.j;
            if (vkCell10 == null) {
                vkCell10 = null;
            }
            charSequence = vkCell10.getContext().getString(R.string.friends_catalog_tomorrow);
        }
        VkCell.Middle.d dVar = new VkCell.Middle.d(new tlo0.h(charSequence), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50);
        VkCell vkCell11 = this.j;
        if (vkCell11 == null) {
            vkCell11 = null;
        }
        vkCell11.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, eVar, dVar, null, 12));
        if (str2 != null) {
            VkCell vkCell12 = this.j;
            if (vkCell12 == null) {
                vkCell12 = null;
            }
            Context context2 = vkCell12.getContext();
            io.reactivex.rxjava3.disposables.c subscribe = mcr0.h(Uri.parse(str2)).r0(asu0.a.c()).U(new e40(new ops(context2, 0), 13)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new z(new pps(this, bVar2, context2, 0), 24), new f40(new tc(24), 21));
            VkCell vkCell13 = this.j;
            if (vkCell13 == null) {
                vkCell13 = null;
            }
            hg1.b(vkCell13, subscribe);
        }
        boolean a2 = o25.a().a(userProfile.c);
        cks cksVar = this.f;
        if (a2) {
            VkCell vkCell14 = this.j;
            d((vkCell14 != null ? vkCell14 : null).getContext(), uIBlockProfile);
        } else {
            CatalogViewType catalogViewType = uIBlockProfile.d;
            CatalogViewType catalogViewType2 = CatalogViewType.LIST_FRIENDS_SUGGEST;
            jzi0 jzi0Var = this.g;
            if (catalogViewType == catalogViewType2) {
                if (!((HashSet) jzi0Var.a).contains(userProfile.c)) {
                    VkCell vkCell15 = this.j;
                    if (vkCell15 == null) {
                        vkCell15 = null;
                    }
                    VkCell.Right.e.b a3 = a(vkCell15.getContext(), uIBlockProfile, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND, true);
                    VkCell vkCell16 = this.j;
                    VkCell vkCell17 = vkCell16 == null ? null : vkCell16;
                    if (vkCell16 == null) {
                        vkCell16 = null;
                    }
                    VkCell.Right.d right = vkCell16.getRight();
                    vkCell17.setRight(right != null ? VkCell.Right.d.a(right, null, a3, null, null, null, 28) : VkCell.Right.c.a(VkCell.Right.Companion, null, a3, null, null, 29));
                    if (cksVar != null) {
                        cksVar.c(catalogUserMeta, null);
                    }
                }
            }
            if (catalogUserMeta.l) {
            }
            if (userProfile.v != 1) {
                e(uIBlockProfile);
            }
            if (catalogUserMeta.Ab()) {
                VkCell vkCell18 = this.j;
                if (vkCell18 == null) {
                    vkCell18 = null;
                }
                Context context3 = vkCell18.getContext();
                VkCell.Right.e.b a4 = a(context3, uIBlockProfile, CatalogViewType.SYNTHETIC_ACTION_OPEN_GIFTS, true);
                CatalogViewType catalogViewType3 = CatalogViewType.SYNTHETIC_ACTION_OPEN_DIALOG;
                Iterator it = uIBlockProfile.F.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((UIBlockAction) obj).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_DIALOG) {
                            break;
                        }
                    }
                }
                UIBlockAction uIBlockAction = (UIBlockAction) obj;
                if (uIBlockAction != null && (uIBlockAction instanceof UIBlockActionIconButton)) {
                    z = ((UIBlockActionIconButton) uIBlockAction).z;
                }
                VkCell.Right.e.b a5 = a(context3, uIBlockProfile, catalogViewType3, z);
                if (a4 != null) {
                    if (a5 != null) {
                        a4 = new VkCell.Right.e.c(a4, a5);
                    }
                    bVar = a4;
                } else {
                    bVar = a5;
                }
                VkCell vkCell19 = this.j;
                VkCell vkCell20 = vkCell19 == null ? null : vkCell19;
                VkCell.Right.d right2 = (vkCell19 != null ? vkCell19 : null).getRight();
                vkCell20.setRight(right2 != null ? VkCell.Right.d.a(right2, null, bVar, null, null, null, 28) : VkCell.Right.c.a(VkCell.Right.Companion, null, bVar, null, null, 29));
            } else if (epx.f(catalogUserMeta.i, "tomorrow")) {
                VkCell vkCell21 = this.j;
                if (vkCell21 == null) {
                    vkCell21 = null;
                }
                VkCell.Right.e.b a6 = a(vkCell21.getContext(), uIBlockProfile, CatalogViewType.SYNTHETIC_ACTION_OPEN_DIALOG, true);
                VkCell vkCell22 = this.j;
                VkCell vkCell23 = vkCell22 == null ? null : vkCell22;
                VkCell.Right.d right3 = (vkCell22 != null ? vkCell22 : null).getRight();
                vkCell23.setRight(right3 != null ? VkCell.Right.d.a(right3, null, a6, null, null, null, 28) : VkCell.Right.c.a(VkCell.Right.Companion, null, a6, null, null, 29));
            } else {
                VkCell vkCell24 = this.j;
                d((vkCell24 != null ? vkCell24 : null).getContext(), uIBlockProfile);
            }
        }
        if (cksVar == null || (str = uIBlockProfile.B) == null) {
            return;
        }
        cksVar.d(str, uIBlockProfile.b);
    }

    public final VkCell.Right.e.b a(Context context, UIBlockProfile uIBlockProfile, CatalogViewType catalogViewType, boolean z) {
        gko h = h(catalogViewType);
        if (h == null) {
            return null;
        }
        Size size = new Size(hbh0.b(56, context), hbh0.b(56, context));
        String j = j(catalogViewType, context);
        return new VkCell.Right.e.b(h, (k1u0) null, size, j != null ? oq.d(tlo0.Companion, j) : null, z, new nps(this, context, uIBlockProfile, catalogViewType, 0), 2);
    }

    public final void b(Context context, UIBlockProfile uIBlockProfile, CatalogViewType catalogViewType) {
        CatalogViewType catalogViewType2;
        String j;
        Drawable b2;
        FriendsItemListVh friendsItemListVh = this;
        Context context2 = context;
        UIBlockProfile uIBlockProfile2 = uIBlockProfile;
        CatalogUserMeta catalogUserMeta = uIBlockProfile2.y;
        UserProfile userProfile = uIBlockProfile2.A;
        int i = d.$EnumSwitchMapping$1[catalogViewType.ordinal()];
        io.reactivex.rxjava3.disposables.b bVar = friendsItemListVh.i;
        switch (i) {
            case 1:
                friendsItemListVh.k(FriendsAnalyticsInfo.ClickTarget.SendMessage);
                ams.a().j(context2, userProfile.c, "friends");
                break;
            case 2:
                friendsItemListVh.k(FriendsAnalyticsInfo.ClickTarget.Call);
                ams.a().i(context2, userProfile, new VoipCallSource(friendsItemListVh.e.a() ? MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST_SEARCH : MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.FRIENDS_LIST, MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS));
                break;
            case 3:
                SocialButtonType socialButtonType = userProfile.e0;
                friendsItemListVh.k((socialButtonType != null ? d.$EnumSwitchMapping$0[socialButtonType.ordinal()] : -1) == 1 ? FriendsAnalyticsInfo.ClickTarget.Follow : FriendsAnalyticsInfo.ClickTarget.AddToFriends);
                c3q a2 = c3q.a.a(userProfile.c, null, true);
                a2.F0(Privacy.FRIENDS);
                a2.H0(catalogUserMeta.d);
                bVar.b(hg1.m(rsg0.y0(a2, null, null, 3), context, 0L, false, 62).subscribe(new p(new ag9(userProfile, friendsItemListVh, context, uIBlockProfile, 1), 27), new bf2(qps.b, 16)));
                break;
            case 4:
                SocialButtonType socialButtonType2 = userProfile.e0;
                friendsItemListVh.k((socialButtonType2 != null ? d.$EnumSwitchMapping$0[socialButtonType2.ordinal()] : -1) == 1 ? FriendsAnalyticsInfo.ClickTarget.Unfollow : FriendsAnalyticsInfo.ClickTarget.RemoveFromFriends);
                c3q a3 = c3q.a.a(userProfile.c, null, false);
                a3.F0(Privacy.FRIENDS);
                a3.H0(catalogUserMeta.d);
                bVar.b(hg1.m(rsg0.y0(a3, null, null, 3), context2, 0L, false, 62).subscribe(new oz(new gwg(userProfile, friendsItemListVh, uIBlockProfile, context, 2), 17), new n(rps.b, 27)));
                break;
            case 5:
                ams.a().n(context2, userProfile);
                break;
            case 6:
                VkCell vkCell = friendsItemListVh.j;
                VkCell vkCell2 = vkCell == null ? null : vkCell;
                if (vkCell == null) {
                    vkCell = null;
                }
                Rect b3 = vkCell.b(VkCell.Region.RightExtra);
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                vkCell2.getContext();
                e.c cVar = new e.c(null, b3, vkCell2, l, 1);
                List<UIBlockAction> list = uIBlockProfile2.F;
                for (UIBlockAction uIBlockAction : list.subList(1, list.size())) {
                    if ((uIBlockAction instanceof UIBlockActionIconButton ? ((UIBlockActionIconButton) uIBlockAction).z : true) && (j = j((catalogViewType2 = uIBlockAction.d), context2)) != null) {
                        if ((catalogViewType2 == null ? -1 : d.$EnumSwitchMapping$1[catalogViewType2.ordinal()]) == 4) {
                            b2 = gko.b(R.drawable.vk_icon_cancel_outline_28, context2);
                        } else {
                            gko h = h(catalogViewType2);
                            b2 = h != null ? gko.b(h.a, context2) : null;
                        }
                        baf0 baf0Var = b2 != null ? new baf0(b2, dhr0.t.c((catalogViewType2 == null ? -1 : d.$EnumSwitchMapping$1[catalogViewType2.ordinal()]) == 4 ? R.attr.vk_ui_icon_negative : R.attr.vk_ui_icon_accent)) : null;
                        FriendsItemListVh friendsItemListVh2 = friendsItemListVh;
                        e.c cVar2 = cVar;
                        VkContextMenu.c.d(cVar2, j, baf0Var, false, new cg9(friendsItemListVh2, context2, uIBlockProfile2, catalogViewType2, 1), 28);
                        uIBlockProfile2 = uIBlockProfile;
                        context2 = context;
                        friendsItemListVh = friendsItemListVh2;
                        cVar = cVar2;
                    }
                }
                cVar.l(false);
                break;
        }
    }

    public final void c(Context context, CatalogUserMeta catalogUserMeta, UserProfile userProfile) {
        k(FriendsAnalyticsInfo.ClickTarget.Open);
        xwk.e().m(context, userProfile.c, new o0r0.a(false, "friends", catalogUserMeta.d, null, this.e.b(SchemeStat$EventItem.Type.USER, catalogUserMeta.d, false), userProfile.e, userProfile.h, userProfile.Y, userProfile.T, false, false, null, null, null, 65024));
    }

    public final void d(Context context, UIBlockProfile uIBlockProfile) {
        VkCell.Right.e.b bVar;
        VkCell.Right.e.b a2;
        List<UIBlockAction> list = uIBlockProfile.F;
        int size = list.size();
        if (size > 0) {
            CatalogViewType catalogViewType = list.get(0).d;
            UIBlockAction uIBlockAction = list.get(0);
            bVar = a(context, uIBlockProfile, catalogViewType, uIBlockAction instanceof UIBlockActionIconButton ? ((UIBlockActionIconButton) uIBlockAction).z : true);
        } else {
            bVar = null;
        }
        if (size == 2) {
            CatalogViewType catalogViewType2 = list.get(1).d;
            UIBlockAction uIBlockAction2 = list.get(1);
            a2 = a(context, uIBlockProfile, catalogViewType2, uIBlockAction2 instanceof UIBlockActionIconButton ? ((UIBlockActionIconButton) uIBlockAction2).z : true);
        } else {
            a2 = size > 2 ? a(context, uIBlockProfile, CatalogViewType.SYNTHETIC_ACTION_SHOW_OPTIONS, true) : null;
        }
        VkCell.Right.e cVar = bVar == null ? null : a2 == null ? bVar : new VkCell.Right.e.c(bVar, a2);
        VkCell vkCell = this.j;
        VkCell vkCell2 = vkCell == null ? null : vkCell;
        VkCell.Right.d right = (vkCell != null ? vkCell : null).getRight();
        vkCell2.setRight(right != null ? VkCell.Right.d.a(right, null, cVar, null, null, null, 28) : VkCell.Right.c.a(VkCell.Right.Companion, null, cVar, null, null, 29));
    }

    public final void e(UIBlockProfile uIBlockProfile) {
        VkCell vkCell = this.j;
        if (vkCell == null) {
            vkCell = null;
        }
        Context context = vkCell.getContext();
        VkCell.Right.e.b a2 = a(context, uIBlockProfile, CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND, true);
        VkCell.Right.e.b bVar = new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_cancel_circle_outline_24), (k1u0) null, new Size(hbh0.b(56, context), hbh0.b(56, context)), (tlo0) null, false, (gzs) new ig1(13, this, uIBlockProfile), 26);
        VkCell.Right.e cVar = a2 != null ? new VkCell.Right.e.c(a2, bVar) : bVar;
        VkCell vkCell2 = this.j;
        VkCell vkCell3 = vkCell2 == null ? null : vkCell2;
        VkCell.Right.d right = (vkCell2 != null ? vkCell2 : null).getRight();
        vkCell3.setRight(right != null ? VkCell.Right.d.a(right, null, cVar, null, null, null, 28) : VkCell.Right.c.a(VkCell.Right.Companion, null, cVar, null, null, 29));
    }

    public final void k(FriendsAnalyticsInfo.ClickTarget clickTarget) {
        UIBlockProfile uIBlockProfile = this.h;
        if (uIBlockProfile == null) {
            return;
        }
        this.d.a(new cfp0(uIBlockProfile, new FriendsAnalyticsInfo(clickTarget)));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkCell vkCell = (VkCell) layoutInflater.inflate(R.layout.catalog_friends_user_item, viewGroup, false);
        this.j = vkCell;
        if (vkCell == null) {
            vkCell = null;
        }
        u1u0.g(vkCell);
        VkCell vkCell2 = this.j;
        VkCell vkCell3 = vkCell2 == null ? null : vkCell2;
        if (vkCell2 == null) {
            vkCell2 = null;
        }
        vkCell3.setBackground(e3m.e(R.attr.selectableItemBackground, vkCell2.getContext()));
        VkCell vkCell4 = this.j;
        if (vkCell4 == null) {
            return null;
        }
        return vkCell4;
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
