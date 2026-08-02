package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.Size;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.friend.BaseFriendsProfileVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.user.SocialButtonType;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ax5;
import xsna.b1d;
import xsna.b5a;
import xsna.bpn0;
import xsna.bus;
import xsna.cis;
import xsna.cks;
import xsna.dko;
import xsna.dos;
import xsna.gko;
import xsna.gzs;
import xsna.hg1;
import xsna.i21;
import xsna.ikv0;
import xsna.izs;
import xsna.k1u0;
import xsna.kd6;
import xsna.lz2;
import xsna.m3a;
import xsna.nfj;
import xsna.ngv0;
import xsna.oa;
import xsna.ogv0;
import xsna.pgv0;
import xsna.qgv0;
import xsna.rsg0;
import xsna.sf;
import xsna.sts;
import xsna.tf;
import xsna.tgv0;
import xsna.tlo0;
import xsna.tq;
import xsna.wh9;
import xsna.x7g;
import xsna.xy2;
import xsna.yb3;
import xsna.yfb;
import xsna.zrp;

/* compiled from: FriendsSuggestsVh.kt */
/* loaded from: classes16.dex */
public final class FriendsSuggestsVh extends BaseFriendsProfileVh {
    public final boolean j;
    public final boolean k;
    public final bpn0 l;
    public final bpn0 m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsSuggestsVh.kt */
    public static final class ScreenType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;
        public static final ScreenType ANY;
        public static final ScreenType SEARCH_SCREEN;

        static {
            ScreenType screenType = new ScreenType("ANY", 0);
            ANY = screenType;
            ScreenType screenType2 = new ScreenType("SEARCH_SCREEN", 1);
            SEARCH_SCREEN = screenType2;
            ScreenType[] screenTypeArr = {screenType, screenType2};
            $VALUES = screenTypeArr;
            $ENTRIES = new asp(screenTypeArr);
        }

        public ScreenType() {
            throw null;
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsSuggestsVh.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b REQUEST_ACCEPTED;
        public static final b REQUEST_SENT;
        public static final b STARTED_FOLLOWING;
        public static final b SUGGEST_HIDDEN;

        static {
            b bVar = new b("SUGGEST_HIDDEN", 0);
            SUGGEST_HIDDEN = bVar;
            b bVar2 = new b("REQUEST_SENT", 1);
            REQUEST_SENT = bVar2;
            b bVar3 = new b("REQUEST_ACCEPTED", 2);
            REQUEST_ACCEPTED = bVar3;
            b bVar4 = new b("STARTED_FOLLOWING", 3);
            STARTED_FOLLOWING = bVar4;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: FriendsSuggestsVh.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.SUGGEST_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.REQUEST_SENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.REQUEST_ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.STARTED_FOLLOWING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FriendsSuggestsVh(a aVar) {
        super(aVar);
        dos dosVar = aVar.e;
        this.j = aVar.f;
        this.k = aVar.g == ScreenType.SEARCH_SCREEN;
        this.l = new bpn0(new i21(9));
        this.m = new bpn0(new lz2(12));
    }

    @Override // com.vk.catalog2.common.ui.holders.friend.BaseFriendsProfileVh
    public final pgv0 a(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile, int i) {
        if (i == 1) {
            return e(pgv0Var, context, uIBlockProfile);
        }
        if (i == 2) {
            return pgv0.a(pgv0Var, null, new qgv0(tq.h(tlo0.Companion, R.string.friends_catalog_recommendation_declined), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);
        }
        tgv0.a a2 = bus.a(uIBlockProfile);
        tlo0.f h = tq.h(tlo0.Companion, (uIBlockProfile.d == CatalogViewType.LIST_FRIENDS_SUGGEST && uIBlockProfile.A.e0 == SocialButtonType.FOLLOW) ? R.string.friends_catalog_follow : R.string.friends_catalog_add);
        VkButton.Size size = VkButton.Size.Small;
        return pgv0.a(pgv0Var, null, null, a2, new ogv0(h, new b1d(this, context, uIBlockProfile, 1), null, size, VkButton.Mode.Primary, null, false, false, 924), new ogv0(new tlo0.f(R.string.friends_catalog_hide), new yb3(this, context, uIBlockProfile, 3), null, size, VkButton.Mode.Secondary, null, false, false, 924), 299);
    }

    @Override // com.vk.catalog2.common.ui.holders.friend.BaseFriendsProfileVh
    public final VkCell.Right.d b() {
        if (!d()) {
            return null;
        }
        gko.b bVar = gko.Companion;
        return new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_user_added_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.friends_catalog_request_sent), false, (gzs) null, 52), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29);
    }

    public final boolean d() {
        CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
        catalogFeatures.getClass();
        return com.vk.toggle.b.A.a(catalogFeatures) && this.k;
    }

    public final pgv0 e(pgv0 pgv0Var, Context context, UIBlockProfile uIBlockProfile) {
        qgv0 qgv0Var;
        int i = (uIBlockProfile.d == CatalogViewType.LIST_FRIENDS_SUGGEST && uIBlockProfile.A.e0 == SocialButtonType.FOLLOW) ? R.string.friends_catalog_started_following : R.string.friends_catalog_request_sent;
        tgv0.a a2 = d() ? bus.a(uIBlockProfile) : null;
        if (d()) {
            qgv0Var = null;
        } else {
            String string = context.getString(i);
            ax5 ax5Var = new ax5(this, context, uIBlockProfile, 4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append(context.getString(R.string.friends_catalog_request_cancel), new kd6(ax5Var, context), 33);
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            tlo0.Companion.getClass();
            qgv0Var = new qgv0(new tlo0.h(spannedString), (ngv0.a) null, (ngv0.a) null, 0, 30);
        }
        return pgv0.a(pgv0Var, null, qgv0Var, a2, null, null, 299);
    }

    public final void g(Context context, UIBlockProfile uIBlockProfile, xy2 xy2Var, izs izsVar) {
        ((io.reactivex.rxjava3.disposables.b) this.i.getValue()).b(hg1.m(rsg0.y0(yfb.x(xy2Var), null, null, 3), context, 0L, false, 62).subscribe(new sf(new wh9(izsVar, uIBlockProfile, this, 2), 26), new tf(new oa(26), 25)));
    }

    public final void h(b bVar, boolean z) {
        int i;
        if (this.j && !cis.k.e) {
            VkRichCell vkRichCell = this.g;
            Integer num = null;
            if (vkRichCell == null) {
                vkRichCell = null;
            }
            Context context = vkRichCell.getContext();
            int i2 = c.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i2 == 1) {
                i = R.string.friends_catalog_recommendation_declined;
            } else if (i2 == 2) {
                i = R.string.friends_catalog_request_sent;
            } else if (i2 == 3) {
                i = R.string.friends_catalog_snackbar_accepted;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.string.friends_catalog_started_following_message;
            }
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
            aVar.u = new ikv0.d(context.getString(i), (String) null, (ikv0.d.a) null, 6);
            if (bVar == b.SUGGEST_HIDDEN) {
                num = Integer.valueOf(R.string.report_content);
            } else if (z) {
                num = Integer.valueOf(R.string.friends_catalog_snackbar_send_message);
            }
            if (num != null) {
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(num.intValue()), new nfj(new sts(0, bVar, this, context, z), 20));
            }
            aVar.n();
        }
    }

    /* compiled from: FriendsSuggestsVh.kt */
    public static final class a extends BaseFriendsProfileVh.d {
        public final dos e;
        public final boolean f;
        public final ScreenType g;

        public /* synthetic */ a(SearchStatInfoProvider searchStatInfoProvider, m3a m3aVar, b5a b5aVar, cks cksVar, dos dosVar) {
            this(dosVar, cksVar, m3aVar, b5aVar, searchStatInfoProvider, false, true, ScreenType.ANY);
        }

        public a(dos dosVar, cks cksVar, m3a m3aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, boolean z2, ScreenType screenType) {
            super(m3aVar, b5aVar, cksVar, searchStatInfoProvider);
            this.e = dosVar;
            this.f = z2;
            this.g = screenType;
        }
    }
}
