package com.vk.catalog2.common.ui.mvp.holder.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.zxing.pdf417.PDF417Common;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.core.formatters.spans.ThemedForegroundColorSpan;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b3q0;
import xsna.b5a;
import xsna.baf0;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.dhr0;
import xsna.eko;
import xsna.epx;
import xsna.f4m;
import xsna.fkq0;
import xsna.fuc0;
import xsna.g7s0;
import xsna.gnh0;
import xsna.gzs;
import xsna.hnh0;
import xsna.iah0;
import xsna.izs;
import xsna.lo3;
import xsna.mcc0;
import xsna.nda;
import xsna.ndu0;
import xsna.ngv0;
import xsna.o0r0;
import xsna.oap;
import xsna.pgv0;
import xsna.q3a;
import xsna.qgv0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.u11;
import xsna.uqm0;
import xsna.vgv0;
import xsna.ydt0;

/* compiled from: SearchAuthorsListVh.kt */
/* loaded from: classes16.dex */
public final class SearchAuthorsListVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final SearchStatInfoProvider c;
    public final CatalogConfiguration d;
    public final nda e;
    public final boolean f;
    public final NotificationsPermission g;
    public final o0r0 h;
    public final g7s0 i;
    public final boolean j;
    public final boolean k;
    public UIBlockSearchAuthor l;
    public final com.vk.catalog2.common.ui.holders.c m;
    public final b3q0 n;
    public VkRichCell o;

    /* compiled from: SearchAuthorsListVh.kt */
    public final class a implements VkCell.d {
        public final VkAvatar a;

        public a(SearchAuthorsListVh searchAuthorsListVh, Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setId(R.id.cell_avatar);
            vkAvatar.setBorder(null);
            vkAvatar.setFixedSize(VkCell.Left.Main.Size.Small.k(context));
            vkAvatar.setOnClickListener(new lo3(searchAuthorsListVh, 5));
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                c.d dVar = new c.d(cVar.a, null);
                VkAvatar vkAvatar = this.a;
                vkAvatar.setContent(dVar);
                if (!cVar.b) {
                    vkAvatar.S0();
                } else {
                    vkAvatar.W0(new ndu0(), true);
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27));
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public final class b implements VkCell.e {
        public b() {
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(SearchAuthorsListVh.this, context);
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final class c implements VkCell.f {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
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
            StringBuilder sb = new StringBuilder("AvatarViewParams(url=");
            sb.append(this.a);
            sb.append(", isLive=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final class d implements VkCell.d {
        public final Context a;
        public final h b;
        public final VkImageSimple c;
        public final LinearLayout d;

        public d(Context context, h hVar) {
            this.a = context;
            this.b = hVar;
            VkImageSimple vkImageSimple = new VkImageSimple(context, null, 6, 0);
            vkImageSimple.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 17));
            vkImageSimple.setImageDrawable(dhr0.t.b(R.drawable.vk_icon_dropdown_16, R.attr.vk_ui_icon_accent_themed));
            this.c = vkImageSimple;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(7);
            linearLayout.setContentDescription(linearLayout.getContext().getString(R.string.change_video_notification_status_accessibility));
            bwt0.i0(linearLayout, new fuc0(this, 8));
            this.d = linearLayout;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            e eVar = fVar instanceof e ? (e) fVar : null;
            if (eVar != null) {
                LinearLayout linearLayout = this.d;
                linearLayout.removeAllViews();
                VkImageSimple vkImageSimple = new VkImageSimple(this.a, null, 6, 0);
                vkImageSimple.setId(R.id.cell_notification);
                vkImageSimple.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                vkImageSimple.setImageDrawable(eVar.a);
                f4m.w(iah0.a(8), vkImageSimple);
                linearLayout.addView(vkImageSimple);
                linearLayout.addView(this.c);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.d;
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final class e implements VkCell.f {
        public final Drawable a;

        public e(Drawable drawable) {
            this.a = drawable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "IconViewParams(mainIcon=" + this.a + ')';
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final class f implements VkCell.e {
        public final h a;

        public f(h hVar) {
            this.a = hVar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new d(context, this.a);
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UIBlockSearchAuthor.AuthorType.values().length];
            try {
                iArr[UIBlockSearchAuthor.AuthorType.Clips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UIBlockSearchAuthor.AuthorType.Videos.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.gzs
        public final s3q0 invoke() {
            oap<? extends UserProfile, ? extends Group> oapVar;
            SearchAuthorsListVh searchAuthorsListVh = (SearchAuthorsListVh) this.receiver;
            UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorsListVh.l;
            if (uIBlockSearchAuthor != null && (oapVar = uIBlockSearchAuthor.y) != null) {
                if (oapVar instanceof oap.b) {
                    Group group = (Group) ((oap.b) oapVar).a;
                    com.vk.catalog2.common.ui.holders.c cVar = searchAuthorsListVh.m;
                    VkRichCell vkRichCell = searchAuthorsListVh.o;
                    if (vkRichCell == null) {
                        vkRichCell = null;
                    }
                    cVar.b(vkRichCell.getContext(), group, searchAuthorsListVh.g, searchAuthorsListVh.l);
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<SearchAuthorAnalyticsInfo.ClickTarget, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(SearchAuthorAnalyticsInfo.ClickTarget clickTarget) {
            SearchAuthorAnalyticsInfo.ClickTarget clickTarget2 = clickTarget;
            SearchAuthorsListVh searchAuthorsListVh = (SearchAuthorsListVh) this.receiver;
            UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorsListVh.l;
            if (uIBlockSearchAuthor != null) {
                searchAuthorsListVh.b.a(new cfp0(uIBlockSearchAuthor, new SearchAuthorAnalyticsInfo(clickTarget2)));
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchAuthorsListVh.kt */
    public static final /* synthetic */ class j extends FunctionReferenceImpl implements izs<MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType eventType) {
            MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType eventType2 = eventType;
            SearchAuthorsListVh searchAuthorsListVh = (SearchAuthorsListVh) this.receiver;
            UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorsListVh.l;
            if (uIBlockSearchAuthor != null) {
                searchAuthorsListVh.b.a(new cfp0(uIBlockSearchAuthor, eventType2));
            }
            return s3q0.a;
        }
    }

    public SearchAuthorsListVh(b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, mcc0 mcc0Var, CatalogConfiguration catalogConfiguration, nda ndaVar, boolean z, NotificationsPermission notificationsPermission, o0r0 o0r0Var, g7s0 g7s0Var, boolean z2) {
        this.b = b5aVar;
        this.c = searchStatInfoProvider;
        this.d = catalogConfiguration;
        this.e = ndaVar;
        this.f = z;
        this.g = notificationsPermission;
        this.h = o0r0Var;
        this.i = g7s0Var;
        this.j = z2;
        this.k = g7s0Var.J().N1();
        this.m = new com.vk.catalog2.common.ui.holders.c(q3aVar, mcc0Var, new i(1, this, SearchAuthorsListVh.class, "trackSearchClick", "trackSearchClick(Lcom/vk/catalog2/common/ui/core/analytics/tracking/SearchAuthorAnalyticsInfo$ClickTarget;)V", 0));
        this.n = new b3q0(mcc0Var, new j(1, this, SearchAuthorsListVh.class, "trackHideUnhideClick", "trackHideUnhideClick(Lcom/vk/stat/scheme/MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick$EventType;)V", 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(SearchAuthorsListVh searchAuthorsListVh) {
        oap<? extends UserProfile, ? extends Group> oapVar;
        UIBlockSearchAuthor uIBlockSearchAuthor = searchAuthorsListVh.l;
        if (uIBlockSearchAuthor == null || (oapVar = uIBlockSearchAuthor.y) == null) {
            return;
        }
        if (oapVar instanceof oap.b) {
            searchAuthorsListVh.n.a((Group) ((oap.b) oapVar).a, new hnh0(searchAuthorsListVh));
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r2.e() == true) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String str;
        boolean z;
        String str2;
        if (uIBlock instanceof UIBlockSearchAuthor) {
            UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
            this.l = uIBlockSearchAuthor;
            oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
            boolean z2 = oapVar instanceof oap.b;
            boolean z3 = this.j;
            if (!z2) {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserProfile userProfile = (UserProfile) ((oap.a) oapVar).a;
                VkRichCell vkRichCell = this.o;
                if (vkRichCell == null) {
                    vkRichCell = null;
                }
                vkRichCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.a(new c(userProfile.o(iah0.a(40)), false), VkCell.Left.Main.Size.Small), null));
                VkRichCell vkRichCell2 = this.o;
                VkRichCell vkRichCell3 = vkRichCell2 != null ? vkRichCell2 : null;
                tlo0.a aVar = tlo0.Companion;
                if (z3) {
                    SpannableString spannableString = new SpannableString(userProfile.e);
                    spannableString.setSpan(new ThemedForegroundColorSpan(R.attr.vk_ui_text_secondary), 0, userProfile.e.length(), 18);
                    s3q0 s3q0Var = s3q0.a;
                    str = spannableString;
                } else {
                    str = userProfile.e;
                }
                tlo0.h f2 = u11.f(aVar, str);
                ngv0.a c2 = c(userProfile.B);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                vkRichCell3.setMiddle(new pgv0(new vgv0(f2, (ngv0.a) null, c2, 1, 2), null, new qgv0(new tlo0.h(b(userProfile.K, userProfile.W)), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
                return;
            }
            Group group = (Group) ((oap.b) oapVar).a;
            if (this.k && (r2 = group.x0) != null) {
                z = true;
            }
            z = false;
            VkRichCell vkRichCell4 = this.o;
            if (vkRichCell4 == null) {
                vkRichCell4 = null;
            }
            vkRichCell4.setLeft(new VkCell.Left.b(new VkCell.Left.Main.a(new c(group.f, z), VkCell.Left.Main.Size.Small), null));
            VkRichCell vkRichCell5 = this.o;
            if (vkRichCell5 == null) {
                vkRichCell5 = null;
            }
            tlo0.a aVar2 = tlo0.Companion;
            if (z3) {
                SpannableString spannableString2 = new SpannableString(group.d);
                spannableString2.setSpan(new ThemedForegroundColorSpan(R.attr.vk_ui_text_secondary), 0, group.d.length(), 18);
                s3q0 s3q0Var2 = s3q0.a;
                str2 = spannableString2;
            } else {
                str2 = group.d;
            }
            tlo0.h f3 = u11.f(aVar2, str2);
            ngv0.a c3 = c(group.y);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            vkRichCell5.setMiddle(new pgv0(new vgv0(f3, (ngv0.a) null, c3, 1, 2), null, new qgv0(new tlo0.h(b(group.v, group.d0)), (ngv0.a) null, (ngv0.a) null, 0, 30), null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
            if (z3) {
                gnh0 gnh0Var = new gnh0(this);
                b3q0 b3q0Var = this.n;
                b3q0Var.getClass();
                b3q0Var.d = b3q0.b.UNDO_HIDE_ENABLED;
                b3q0Var.b(gnh0Var);
                return;
            }
            this.m.getClass();
            baf0 c4 = com.vk.catalog2.common.ui.holders.c.c(group);
            VkRichCell vkRichCell6 = this.o;
            (vkRichCell6 != null ? vkRichCell6 : null).setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new e(c4), new Size(-1, -2)), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
            s3q0 s3q0Var3 = s3q0.a;
        }
    }

    public final String b(int i2, int i3) {
        String str;
        String string;
        Resources resources;
        UIBlockSearchAuthor uIBlockSearchAuthor = this.l;
        String str2 = "";
        if ((uIBlockSearchAuthor != null ? uIBlockSearchAuthor.z : null) != UIBlockSearchAuthor.AuthorType.Clips) {
            return (uIBlockSearchAuthor == null || (str = uIBlockSearchAuthor.A) == null) ? "" : str;
        }
        StringBuilder sb = new StringBuilder();
        String l = uqm0.l(i2);
        VkRichCell vkRichCell = this.o;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        Context context = vkRichCell.getContext();
        sb.append((context == null || (resources = context.getResources()) == null) ? "" : resources.getQuantityString(R.plurals.followers_count, i2, l));
        VkRichCell vkRichCell2 = this.o;
        Context context2 = (vkRichCell2 != null ? vkRichCell2 : null).getContext();
        if (context2 != null && (string = context2.getString(R.string.subtitle_separator)) != null) {
            str2 = string;
        }
        sb.append(str2);
        sb.append(uqm0.i(i3, R.plurals.clips_count, R.string.clips_count_formatted, true));
        return sb.toString();
    }

    public final ngv0.a c(VerifyInfo verifyInfo) {
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        VkRichCell vkRichCell = this.o;
        if (vkRichCell == null) {
            vkRichCell = null;
        }
        Drawable h2 = VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, vkRichCell.getContext(), VerifyInfoHelper.ColorTheme.normal, 24);
        if (!verifyInfo.Cb() || h2 == null) {
            return null;
        }
        return new ngv0.a(new eko(h2), null, null, null, 14);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRichCell vkRichCell = new VkRichCell(layoutInflater.getContext(), null, 6, 0);
        this.o = vkRichCell;
        vkRichCell.setLeftMainAvatarController(new b());
        vkRichCell.setRightExtraViewController(new f(new h(0, this, SearchAuthorsListVh.class, "notificationButtonClicked", "notificationButtonClicked()V", 0)));
        vkRichCell.setOnClickListener(new c98(this, 1));
        VkRichCell vkRichCell2 = this.o;
        if (vkRichCell2 == null) {
            return null;
        }
        return vkRichCell2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockSearchAuthor uIBlockSearchAuthor;
        UserId userId;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        if (view == null || (uIBlockSearchAuthor = this.l) == null) {
            return;
        }
        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
        if (oapVar instanceof oap.b) {
            userId = fkq0.e(((Group) ((oap.b) oapVar).a).c);
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            userId = ((UserProfile) ((oap.a) oapVar).a).c;
        }
        UserId userId2 = userId;
        if (userId2 == null) {
            return;
        }
        SearchAuthorAnalyticsInfo.ClickTarget clickTarget = SearchAuthorAnalyticsInfo.ClickTarget.Open;
        UIBlockSearchAuthor uIBlockSearchAuthor2 = this.l;
        if (uIBlockSearchAuthor2 != null) {
            this.b.a(new cfp0(uIBlockSearchAuthor2, new SearchAuthorAnalyticsInfo(clickTarget)));
        }
        SearchStatInfoProvider searchStatInfoProvider = this.c;
        if (searchStatInfoProvider != null) {
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.SEARCH_AUTHOR;
            String str = uIBlockSearchAuthor.D;
            if (str == null) {
                str = "";
            }
            searchStatsLoggingInfo = searchStatInfoProvider.b(type, str, false);
        } else {
            searchStatsLoggingInfo = null;
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = searchStatsLoggingInfo;
        int i2 = g.$EnumSwitchMapping$0[uIBlockSearchAuthor.z.ordinal()];
        o0r0 o0r0Var = this.h;
        if (i2 == 1) {
            o0r0Var.m(view.getContext(), userId2, new o0r0.a(false, null, null, null, searchStatsLoggingInfo2, null, null, false, false, true, false, null, null, null, 64495));
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context = view.getContext();
        String string = context.getString(R.string.videos);
        String str2 = uIBlockSearchAuthor.B;
        if (this.f) {
            o0r0Var.m(context, userId2, new o0r0.a(false, uIBlockSearchAuthor.f, uIBlockSearchAuthor.D, null, searchStatsLoggingInfo2, null, null, false, false, false, false, null, null, null, 65513));
        } else if (str2 != null) {
            nda.e(this.e, context, this.d, str2, string, null, searchStatsLoggingInfo2, null, PsExtractor.AUDIO_STREAM);
        } else {
            ydt0.y(this.i.Y(), context, userId2, null, string, uIBlockSearchAuthor.D, searchStatsLoggingInfo2, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i2, UIBlock uIBlock) {
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
