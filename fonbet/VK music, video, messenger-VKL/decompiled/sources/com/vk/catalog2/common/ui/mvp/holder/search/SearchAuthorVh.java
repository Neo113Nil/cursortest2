package com.vk.catalog2.common.ui.mvp.holder.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.zxing.pdf417.PDF417Common;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.avatar.api.VKAvatarView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchAuthor;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchAuthorAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchAuthorVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.b25;
import xsna.b3q0;
import xsna.b5a;
import xsna.baf0;
import xsna.c98;
import xsna.cfp0;
import xsna.cn70;
import xsna.cq5;
import xsna.drm0;
import xsna.ejc;
import xsna.enh0;
import xsna.f4m;
import xsna.far0;
import xsna.fkq0;
import xsna.fnj;
import xsna.foh;
import xsna.iah0;
import xsna.j8;
import xsna.kr5;
import xsna.lpg0;
import xsna.mcc0;
import xsna.nda;
import xsna.o0r0;
import xsna.o25;
import xsna.oap;
import xsna.omw;
import xsna.os9;
import xsna.q3a;
import xsna.qp5;
import xsna.qxh0;
import xsna.s3q0;
import xsna.u2l;
import xsna.uqm0;
import xsna.xwk;
import xsna.ydt0;

/* compiled from: SearchAuthorVh.kt */
/* loaded from: classes16.dex */
public final class SearchAuthorVh implements CatalogViewHolder, View.OnClickListener {
    public final enh0 A;
    public final com.vk.catalog2.common.ui.holders.c B;
    public final b3q0 C;
    public final boolean D;
    public final int b;
    public final b5a c;
    public final SearchStatInfoProvider d;
    public final CatalogConfiguration e;
    public final b f;
    public final NotificationsPermission g;
    public final c h;
    public final a i;
    public final lpg0 j;
    public UIBlockSearchAuthor k;
    public ViewGroup l;
    public VKAvatarView m;
    public TextView n;
    public VKImageView o;
    public ImageView p;
    public TextView q;
    public ImageView r;
    public VkButton s;
    public ProgressBar t;
    public ViewGroup u;
    public View v;
    public ImageView w;
    public TextView x;
    public Boolean y;
    public final qxh0 z;

    /* compiled from: SearchAuthorVh.kt */
    public static final class a {
        public final b25 a;
        public final o0r0 b;

        public a() {
            b25 a = o25.a();
            o0r0 e = xwk.e();
            this.a = a;
            this.b = e;
        }
    }

    /* compiled from: SearchAuthorVh.kt */
    public static final class b {
        public final nda a;
        public final ydt0 b;

        public b(nda ndaVar, ydt0 ydt0Var) {
            this.a = ndaVar;
            this.b = ydt0Var;
        }
    }

    /* compiled from: SearchAuthorVh.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: SearchAuthorVh.kt */
    public static final /* synthetic */ class d {
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

    /* compiled from: SearchAuthorVh.kt */
    public static final class e implements b3q0.a {
        public final /* synthetic */ TextView a;

        public e(TextView textView) {
            this.a = textView;
        }

        @Override // xsna.b3q0.a
        public final void a(int i, int i2, boolean z) {
            TextView textView = this.a;
            textView.setText(textView.getContext().getString(i));
            Context context = textView.getContext();
            textView.setContentDescription(context != null ? context.getString(i2) : null);
            textView.setEnabled(z);
        }
    }

    public SearchAuthorVh(int i, b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, mcc0 mcc0Var, CatalogConfiguration catalogConfiguration, b bVar, NotificationsPermission notificationsPermission, c cVar, lpg0 lpg0Var, int i2) {
        a aVar = new a();
        lpg0 lpg0Var2 = (i2 & 1024) != 0 ? null : lpg0Var;
        this.b = i;
        this.c = b5aVar;
        this.d = searchStatInfoProvider;
        this.e = catalogConfiguration;
        this.f = bVar;
        this.g = notificationsPermission;
        this.h = cVar;
        this.i = aVar;
        this.j = lpg0Var2;
        this.z = new qxh0(q3aVar, mcc0Var, new com.vk.catalog2.common.ui.mvp.holder.search.b(1, this, SearchAuthorVh.class, "trackSearchClick", "trackSearchClick(Lcom/vk/catalog2/common/ui/core/analytics/tracking/SearchAuthorAnalyticsInfo$ClickTarget;)V", 0), aVar.a);
        this.A = new enh0(q3aVar, mcc0Var, new com.vk.catalog2.common.ui.mvp.holder.search.d(1, this, SearchAuthorVh.class, "trackSearchClick", "trackSearchClick(Lcom/vk/catalog2/common/ui/core/analytics/tracking/SearchAuthorAnalyticsInfo$ClickTarget;)V", 0), notificationsPermission, aVar.a);
        this.B = new com.vk.catalog2.common.ui.holders.c(q3aVar, mcc0Var, new com.vk.catalog2.common.ui.mvp.holder.search.a(1, this, SearchAuthorVh.class, "trackSearchClick", "trackSearchClick(Lcom/vk/catalog2/common/ui/core/analytics/tracking/SearchAuthorAnalyticsInfo$ClickTarget;)V", 0));
        this.C = new b3q0(mcc0Var, new com.vk.catalog2.common.ui.mvp.holder.search.c(1, this, SearchAuthorVh.class, "trackHideUnhideClick", "trackHideUnhideClick(Lcom/vk/stat/scheme/MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick$EventType;)V", 0));
        this.D = BuildInfo.q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        boolean z;
        boolean z2;
        VKImageView vKImageView;
        List<String> list;
        ImageView imageView;
        ProgressBar progressBar;
        qxh0.a aVar;
        boolean z3;
        int i;
        ViewGroup viewGroup;
        boolean d2;
        View view;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto;
        if (!(uIBlock instanceof UIBlockSearchAuthor)) {
            return;
        }
        UIBlockSearchAuthor uIBlockSearchAuthor = (UIBlockSearchAuthor) uIBlock;
        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
        this.k = uIBlockSearchAuthor;
        boolean z4 = uIBlockSearchAuthor.z == UIBlockSearchAuthor.AuthorType.Videos;
        if (z4) {
            Boolean bool = this.y;
            if (bool != null ? bool.booleanValue() : false) {
                z = true;
                z2 = oapVar instanceof oap.b;
                if (!z2) {
                    Group group = (Group) ((oap.b) oapVar).a;
                    boolean z5 = this.h.a && (groupsVideoLivesDataDto = group.x0) != null && groupsVideoLivesDataDto.e();
                    VKAvatarView vKAvatarView = this.m;
                    if (vKAvatarView != null) {
                        kr5.a aVar2 = new kr5.a(new os9(group, 1));
                        aVar2.c = z5 ? cq5.g.a : cq5.b.a;
                        s3q0 s3q0Var = s3q0.a;
                        vKAvatarView.Y0(aVar2.a());
                    }
                    if (z5) {
                        VKAvatarView vKAvatarView2 = this.m;
                        if (vKAvatarView2 != null) {
                            com.vk.core.view.components.avatar.badge.b bVar = new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27);
                            far0 far0Var = vKAvatarView2.m;
                            far0Var.h.add(bVar);
                            far0Var.a.invalidate();
                        }
                    } else {
                        VKAvatarView vKAvatarView3 = this.m;
                        if (vKAvatarView3 != null) {
                            far0 far0Var2 = vKAvatarView3.m;
                            far0Var2.h.clear();
                            far0Var2.a.invalidate();
                        }
                    }
                    TextView textView = this.n;
                    if (textView != null) {
                        textView.setText(group.d);
                    }
                    VKImageView vKImageView2 = this.o;
                    if (vKImageView2 != null) {
                        vKImageView2.setVisibility(8);
                    }
                    b(group.y);
                    a(group.v, group.d0);
                    ImageView imageView2 = this.w;
                    if (imageView2 != null) {
                        foh fohVar = new foh(imageView2, 6);
                        this.B.getClass();
                        fohVar.invoke(com.vk.catalog2.common.ui.holders.c.c(group));
                    }
                    TextView textView2 = this.x;
                    if (textView2 != null) {
                        b3q0 b3q0Var = this.C;
                        b3q0Var.getClass();
                        b3q0Var.d = b3q0.b.UNDO_HIDE_ENABLED;
                        int i2 = b3q0Var.d.i();
                        int h = b3q0Var.d.h();
                        boolean j = b3q0Var.d.j();
                        textView2.setText(textView2.getContext().getString(i2));
                        Context context = textView2.getContext();
                        textView2.setContentDescription(context != null ? context.getString(h) : null);
                        textView2.setEnabled(j);
                    }
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UserProfile userProfile = (UserProfile) ((oap.a) oapVar).a;
                    UIBlockSearchAuthor uIBlockSearchAuthor2 = this.k;
                    if (uIBlockSearchAuthor2 != null) {
                        VKAvatarView vKAvatarView4 = this.m;
                        if (vKAvatarView4 != null) {
                            vKAvatarView4.Y0(qp5.b(userProfile));
                        }
                        TextView textView3 = this.n;
                        if (textView3 != null) {
                            textView3.setText(userProfile.e);
                        }
                        if (uIBlockSearchAuthor2.z == UIBlockSearchAuthor.AuthorType.Clips && (vKImageView = this.o) != null) {
                            ImageStatus imageStatus = userProfile.R;
                            if (imageStatus == null || (list = imageStatus.e) == null || !list.contains("clips")) {
                                imageStatus = null;
                            }
                            if (imageStatus != null) {
                                ImageSize Ab = imageStatus.d.Ab(cn70.b(18), false);
                                vKImageView.load(Ab != null ? Ab.d.d : null);
                            }
                            vKImageView.setVisibility(imageStatus != null ? 0 : 8);
                        }
                        b(userProfile.B);
                        a(userProfile.K, userProfile.W);
                    }
                }
                if (z || !this.D) {
                    CatalogProfileLocalState catalogProfileLocalState = uIBlockSearchAuthor.C;
                    imageView = this.r;
                    progressBar = this.t;
                    ViewGroup viewGroup2 = this.u;
                    qxh0 qxh0Var = this.z;
                    qxh0Var.getClass();
                    aVar = catalogProfileLocalState.b != CatalogProfileLocalState.FollowSource.InternalPending ? qxh0.a.Loading : (qxh0.b(oapVar) && catalogProfileLocalState.b == CatalogProfileLocalState.FollowSource.Internal) ? qxh0.a.RecentlySubscribed : qxh0.b(oapVar) ? qxh0.a.Subscribed : qxh0.a.NotSubscribed;
                    qxh0Var.e = aVar;
                    if (!z4) {
                        if (z2) {
                            d2 = ((Group) ((oap.b) oapVar).a).t;
                        } else {
                            if (!(oapVar instanceof oap.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            d2 = ((UserProfile) ((oap.a) oapVar).a).d();
                        }
                        if (d2) {
                            z3 = true;
                            int i3 = oapVar.a() == null ? R.drawable.vk_icon_add_square_outline_28 : R.drawable.vk_icon_user_add_outline_28;
                            i = qxh0.b.$EnumSwitchMapping$0[aVar.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else if (z3) {
                                        i3 = R.drawable.vk_icon_message_outline_28;
                                    }
                                    i3 = 0;
                                } else {
                                    i3 = R.drawable.vk_icon_done_outline_28;
                                }
                            }
                            int i4 = aVar == qxh0.a.RecentlySubscribed ? R.attr.vk_legacy_icon_outline_secondary : R.attr.vk_legacy_accent;
                            if (imageView != null) {
                                omw.b(imageView, i4);
                            }
                            if (imageView != null) {
                                imageView.setImageResource(i3);
                            }
                            if (imageView != null) {
                                if (i3 == 0) {
                                    imageView.setBackground(null);
                                } else {
                                    imageView.setBackgroundResource(R.drawable.highlight_unbounded);
                                }
                            }
                            if (imageView != null) {
                                imageView.setVisibility(i3 != 0 && qxh0Var.d.b() ? 0 : 8);
                            }
                            ViewParent parent = progressBar != null ? progressBar.getParent() : null;
                            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(progressBar);
                            }
                            if (aVar == qxh0.a.Loading && viewGroup2 != null) {
                                viewGroup2.addView(progressBar);
                            }
                        }
                    }
                    z3 = false;
                    if (oapVar.a() == null) {
                    }
                    i = qxh0.b.$EnumSwitchMapping$0[aVar.ordinal()];
                    if (i != 1) {
                    }
                    if (aVar == qxh0.a.RecentlySubscribed) {
                    }
                    if (imageView != null) {
                    }
                    if (imageView != null) {
                    }
                    if (imageView != null) {
                    }
                    if (imageView != null) {
                    }
                    if (progressBar != null) {
                    }
                    if (parent instanceof ViewGroup) {
                    }
                    if (viewGroup != null) {
                    }
                    if (aVar == qxh0.a.Loading) {
                        viewGroup2.addView(progressBar);
                    }
                } else {
                    VkButton vkButton = this.s;
                    enh0 enh0Var = this.A;
                    enh0Var.getClass();
                    enh0.a aVar3 = enh0.b(oapVar) ? enh0.a.Subscribed : enh0.a.NotSubscribed;
                    enh0Var.g = aVar3;
                    if (vkButton != null) {
                        vkButton.setVisibility((!enh0Var.e.b() || oapVar.b() == null) ? 8 : 0);
                    }
                    Group b2 = oapVar.b();
                    if (b2 != null && vkButton != null) {
                        int[] iArr = enh0.c.$EnumSwitchMapping$0;
                        int i5 = iArr[aVar3.ordinal()];
                        if (i5 == 1) {
                            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_dropdown_12);
                            int[] iArr2 = VkButton.W;
                            vkButton.d5(valueOf);
                            vkButton.setText(R.string.video_catalog_subscribed);
                            vkButton.setMode(VkButton.Mode.Secondary);
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int[] iArr3 = VkButton.W;
                            vkButton.d5(0);
                            vkButton.setText(R.string.video_catalog_subscribe);
                            vkButton.setMode(VkButton.Mode.Primary);
                        }
                        enh0Var.f.getClass();
                        baf0 c2 = com.vk.catalog2.common.ui.holders.c.c(b2);
                        int i6 = iArr[aVar3.ordinal()];
                        if (i6 == 1) {
                            vkButton.Z4(c2, true);
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            vkButton.a5(true, 0);
                        }
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                }
                view = this.v;
                if (view == null) {
                    Context context2 = view.getContext();
                    view.setContentDescription(context2 != null ? context2.getString(R.string.change_video_notification_status_accessibility) : null);
                    return;
                }
                return;
            }
        }
        z = false;
        z2 = oapVar instanceof oap.b;
        if (!z2) {
        }
        if (z) {
        }
        CatalogProfileLocalState catalogProfileLocalState2 = uIBlockSearchAuthor.C;
        imageView = this.r;
        progressBar = this.t;
        ViewGroup viewGroup22 = this.u;
        qxh0 qxh0Var2 = this.z;
        qxh0Var2.getClass();
        if (catalogProfileLocalState2.b != CatalogProfileLocalState.FollowSource.InternalPending) {
        }
        qxh0Var2.e = aVar;
        if (!z4) {
        }
        z3 = false;
        if (oapVar.a() == null) {
        }
        i = qxh0.b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i != 1) {
        }
        if (aVar == qxh0.a.RecentlySubscribed) {
        }
        if (imageView != null) {
        }
        if (imageView != null) {
        }
        if (imageView != null) {
        }
        if (imageView != null) {
        }
        if (progressBar != null) {
        }
        if (parent instanceof ViewGroup) {
        }
        if (viewGroup != null) {
        }
        if (aVar == qxh0.a.Loading) {
        }
        view = this.v;
        if (view == null) {
        }
    }

    public final void a(int i, int i2) {
        String str;
        Context context;
        String string;
        Context context2;
        Resources resources;
        UIBlockSearchAuthor uIBlockSearchAuthor = this.k;
        String str2 = "";
        if ((uIBlockSearchAuthor != null ? uIBlockSearchAuthor.z : null) == UIBlockSearchAuthor.AuthorType.Clips) {
            StringBuilder sb = new StringBuilder();
            String l = uqm0.l(i);
            ViewGroup viewGroup = this.l;
            sb.append((viewGroup == null || (context2 = viewGroup.getContext()) == null || (resources = context2.getResources()) == null) ? "" : resources.getQuantityString(R.plurals.followers_count, i, l));
            TextView textView = this.q;
            if (textView != null && (context = textView.getContext()) != null && (string = context.getString(R.string.subtitle_separator)) != null) {
                str2 = string;
            }
            sb.append(str2);
            sb.append(uqm0.i(i2, R.plurals.clips_count, R.string.clips_count_formatted, true));
            str2 = sb.toString();
        } else if (uIBlockSearchAuthor != null && (str = uIBlockSearchAuthor.A) != null) {
            str2 = str;
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.q;
        if (textView3 != null) {
            textView3.setVisibility(!drm0.N(str2) ? 0 : 8);
        }
    }

    public final void b(VerifyInfo verifyInfo) {
        ImageView imageView = this.p;
        if (imageView == null) {
            return;
        }
        boolean Cb = verifyInfo.Cb();
        if (Cb) {
            imageView.setImageDrawable(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, imageView.getContext(), VerifyInfoHelper.ColorTheme.normal, 24));
        }
        imageView.setVisibility(Cb ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        oap<? extends UserProfile, ? extends Group> oapVar;
        Group group;
        GroupsVideoLivesDataDto groupsVideoLivesDataDto;
        UIBlockSearchAuthor uIBlockSearchAuthor = this.k;
        if (uIBlockSearchAuthor != null && (oapVar = uIBlockSearchAuthor.y) != null) {
            if (oapVar instanceof oap.b) {
                group = (Group) ((oap.b) oapVar).a;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                group = null;
            }
            return group != null && this.h.a && (groupsVideoLivesDataDto = group.x0) != null && groupsVideoLivesDataDto.e();
        }
        return false;
    }

    public final void d(Context context, UserId userId, SearchStatsLoggingInfo searchStatsLoggingInfo, UIBlockSearchAuthor uIBlockSearchAuthor) {
        String string = context.getString(R.string.videos);
        String str = uIBlockSearchAuthor.B;
        if (BuildInfo.q()) {
            this.i.b.m(context, userId, new o0r0.a(false, uIBlockSearchAuthor.f, uIBlockSearchAuthor.D, null, searchStatsLoggingInfo, null, null, false, false, false, false, null, null, null, 65513));
            return;
        }
        b bVar = this.f;
        if (str == null) {
            ydt0.y(bVar.b, context, userId, null, string, uIBlockSearchAuthor.D, searchStatsLoggingInfo, null, null, null, PDF417Common.MAX_CODEWORDS_IN_BARCODE);
            return;
        }
        nda.e(bVar.a, context, this.e, str, string, null, searchStatsLoggingInfo, this.j, 64);
    }

    public final void e(CommonVideoStat$CommunityClickInfo.Direction direction) {
        UserId userId;
        boolean c2 = c();
        UIBlockSearchAuthor uIBlockSearchAuthor = this.k;
        Long valueOf = (uIBlockSearchAuthor == null || (userId = uIBlockSearchAuthor.g) == null) ? null : Long.valueOf(userId.b);
        UIBlockSearchAuthor uIBlockSearchAuthor2 = this.k;
        String str = uIBlockSearchAuthor2 != null ? uIBlockSearchAuthor2.b : null;
        UiTracker uiTracker = UiTracker.a;
        new ejc(c2, valueOf, str, UiTracker.c(), direction).q();
    }

    public final void g(SearchAuthorAnalyticsInfo.ClickTarget clickTarget) {
        UIBlockSearchAuthor uIBlockSearchAuthor = this.k;
        if (uIBlockSearchAuthor != null) {
            this.c.a(new cfp0(uIBlockSearchAuthor, new SearchAuthorAnalyticsInfo(clickTarget)));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.l = viewGroup2;
        VKAvatarView vKAvatarView = (VKAvatarView) viewGroup2.findViewById(R.id.owner_image);
        this.m = vKAvatarView;
        if (this.h.a && vKAvatarView != null) {
            int b2 = cn70.b(2);
            ViewGroup.LayoutParams layoutParams = vKAvatarView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height += b2;
            vKAvatarView.setLayoutParams(layoutParams);
            f4m.v(vKAvatarView.getPaddingBottom() + b2, vKAvatarView);
        }
        VKAvatarView vKAvatarView2 = this.m;
        if (vKAvatarView2 != null) {
            vKAvatarView2.setOnClickListener(this);
        }
        this.n = (TextView) viewGroup2.findViewById(R.id.owner_name);
        this.o = (VKImageView) viewGroup2.findViewById(R.id.owner_status);
        this.p = (ImageView) viewGroup2.findViewById(R.id.owner_verified);
        this.r = (ImageView) viewGroup2.findViewById(R.id.owner_subscribe_btn);
        this.s = (VkButton) viewGroup2.findViewById(R.id.owner_subscribe_with_notification_btn);
        this.q = (TextView) viewGroup2.findViewById(R.id.owner_description);
        this.t = (ProgressBar) viewGroup2.findViewById(R.id.subscribe_progress_bar);
        this.u = viewGroup2;
        this.v = viewGroup2.findViewById(R.id.actions_container_area);
        this.w = (ImageView) viewGroup2.findViewById(R.id.notification_icon);
        this.x = (TextView) viewGroup2.findViewById(R.id.hide_unhide_btn);
        int i = 1;
        viewGroup2.setOnClickListener(new c98(this, i));
        VkButton vkButton = this.s;
        if (vkButton != null) {
            vkButton.setOnClickListener(new c98(this, i));
        }
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setOnClickListener(new c98(this, i));
        }
        View view = this.v;
        if (view != null) {
            view.setOnClickListener(new c98(this, i));
        }
        TextView textView = this.x;
        if (textView != null) {
            textView.setOnClickListener(new c98(this, i));
        }
        if (this.y == null) {
            Context context = viewGroup2.getContext();
            HashSet hashSet = iah0.a;
            this.y = Boolean.valueOf(fnj.d(context));
        }
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockSearchAuthor uIBlockSearchAuthor;
        UserId userId;
        VkButton vkButton;
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        final Context context;
        final UIBlockSearchAuthor uIBlockSearchAuthor2;
        if (view == null || (uIBlockSearchAuthor = this.k) == null) {
            return;
        }
        oap<? extends UserProfile, ? extends Group> oapVar = uIBlockSearchAuthor.y;
        boolean z = oapVar instanceof oap.b;
        if (z) {
            userId = fkq0.e(((Group) ((oap.b) oapVar).a).c);
        } else {
            if (!(oapVar instanceof oap.a)) {
                throw new NoWhenBranchMatchedException();
            }
            userId = ((UserProfile) ((oap.a) oapVar).a).c;
        }
        if (userId == null) {
            return;
        }
        int id = view.getId();
        ImageView imageView = this.r;
        if ((imageView != null && id == imageView.getId()) || ((vkButton = this.s) != null && id == vkButton.getId())) {
            final View view2 = this.r;
            if (view2 == null) {
                view2 = this.s;
            }
            if (view2 == null || (context = view2.getContext()) == null || j8.d(context) || (uIBlockSearchAuthor2 = this.k) == null) {
                return;
            }
            view2.postDelayed(new Runnable() { // from class: xsna.fnh0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0043  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    boolean z2;
                    int i;
                    MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source source;
                    boolean d2;
                    Group b2;
                    View view3 = view2;
                    if (!view3.isAttachedToWindow()) {
                        return;
                    }
                    UIBlockSearchAuthor uIBlockSearchAuthor3 = uIBlockSearchAuthor2;
                    UIBlockSearchAuthor.AuthorType authorType = uIBlockSearchAuthor3.z;
                    CatalogProfileLocalState catalogProfileLocalState = uIBlockSearchAuthor3.C;
                    oap<? extends UserProfile, ? extends Group> oapVar2 = uIBlockSearchAuthor3.y;
                    UIBlockSearchAuthor.AuthorType authorType2 = UIBlockSearchAuthor.AuthorType.Videos;
                    SearchAuthorVh searchAuthorVh = this;
                    if (authorType == authorType2) {
                        Boolean bool = searchAuthorVh.y;
                        if (bool != null ? bool.booleanValue() : false) {
                            z2 = true;
                            i = SearchAuthorVh.d.$EnumSwitchMapping$0[uIBlockSearchAuthor3.z.ordinal()];
                            if (i != 1) {
                                source = MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source.CLIPS;
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                source = MobileOfficialAppsVideoStat$TypeVideoSubscribtionButtonClick.Source.VIDEO_SEARCH_AUTHOR;
                            }
                            String lowerCase = source.name().toLowerCase(Locale.ROOT);
                            if (!z2 && searchAuthorVh.D) {
                                enh0 enh0Var = searchAuthorVh.A;
                                CatalogProfileLocalState.FollowSource followSource = catalogProfileLocalState.b;
                                enh0.a aVar = enh0Var.g;
                                if (aVar == null || (b2 = oapVar2.b()) == null) {
                                    return;
                                }
                                int i2 = enh0.c.$EnumSwitchMapping$0[aVar.ordinal()];
                                if (i2 == 1) {
                                    enh0Var.f.b(context, b2, enh0Var.d, null);
                                    return;
                                }
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                enh0Var.c.invoke(SearchAuthorAnalyticsInfo.ClickTarget.Subscribe);
                                boolean b3 = enh0.b(oapVar2);
                                UserId a2 = enh0.a(oapVar2, false);
                                enh0Var.c(a2, CatalogProfileLocalState.FollowSource.InternalPending);
                                io.reactivex.rxjava3.disposables.c cVar = enh0Var.h;
                                if (cVar != null) {
                                    cVar.dispose();
                                }
                                io.reactivex.rxjava3.disposables.c subscribe = o0r0.i(xwk.e(), enh0.a(oapVar2, true), b3, null, false, lowerCase, 100).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new kcu(new e420(20), 1), new sl30(new fd5(enh0Var, a2, followSource, 7), 22));
                                enh0Var.b.a(subscribe);
                                enh0Var.h = subscribe;
                                return;
                            }
                            if (view3 instanceof ImageView) {
                                return;
                            }
                            qxh0 qxh0Var = searchAuthorVh.z;
                            ImageView imageView2 = (ImageView) view3;
                            CatalogProfileLocalState.FollowSource followSource2 = catalogProfileLocalState.b;
                            com.vk.catalog2.common.ui.mvp.holder.search.b bVar = qxh0Var.c;
                            qxh0.a aVar2 = qxh0Var.e;
                            if (aVar2 == null) {
                                return;
                            }
                            Context context2 = imageView2.getContext();
                            int i3 = qxh0.b.$EnumSwitchMapping$0[aVar2.ordinal()];
                            if (i3 == 1) {
                                bVar.invoke(SearchAuthorAnalyticsInfo.ClickTarget.Subscribe);
                                qxh0Var.c(oapVar2, followSource2, lowerCase);
                                return;
                            }
                            if (i3 == 2) {
                                bVar.invoke(SearchAuthorAnalyticsInfo.ClickTarget.Unsubscribe);
                                qxh0Var.c(oapVar2, followSource2, lowerCase);
                                return;
                            }
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return;
                            }
                            if (oapVar2 instanceof oap.b) {
                                d2 = ((Group) ((oap.b) oapVar2).a).t;
                            } else {
                                if (!(oapVar2 instanceof oap.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                d2 = ((UserProfile) ((oap.a) oapVar2).a).d();
                            }
                            if (d2) {
                                bVar.invoke(SearchAuthorAnalyticsInfo.ClickTarget.SendMessage);
                                ams.a().j(context2, qxh0.a(oapVar2, true), "");
                                return;
                            }
                            return;
                        }
                    }
                    z2 = false;
                    i = SearchAuthorVh.d.$EnumSwitchMapping$0[uIBlockSearchAuthor3.z.ordinal()];
                    if (i != 1) {
                    }
                    String lowerCase2 = source.name().toLowerCase(Locale.ROOT);
                    if (!z2) {
                    }
                    if (view3 instanceof ImageView) {
                    }
                }
            }, 200L);
            return;
        }
        if (id == R.id.actions_container_area) {
            if (z) {
                this.B.b(view.getContext(), (Group) ((oap.b) oapVar).a, this.g, uIBlockSearchAuthor);
                return;
            } else {
                if (!(oapVar instanceof oap.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        if (id == R.id.hide_unhide_btn) {
            TextView textView = this.x;
            if (textView != null) {
                if (z) {
                    this.C.a((Group) ((oap.b) oapVar).a, new e(textView));
                    return;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            return;
        }
        g(SearchAuthorAnalyticsInfo.ClickTarget.Open);
        SearchStatInfoProvider searchStatInfoProvider = this.d;
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
        boolean z2 = view.getId() == R.id.owner_image;
        int i = d.$EnumSwitchMapping$0[uIBlockSearchAuthor.z.ordinal()];
        if (i == 1) {
            this.i.b.m(view.getContext(), userId, new o0r0.a(false, null, null, null, searchStatsLoggingInfo2, null, null, false, false, true, false, null, null, null, 64495));
            if (z2) {
                e(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
                return;
            }
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Context context2 = view.getContext();
        if (z2 && this.h.b && c()) {
            this.f.b.q(context2, userId, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH, new u2l(this, context2, userId, searchStatsLoggingInfo2, uIBlockSearchAuthor, 1));
            return;
        }
        if (z2) {
            e(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
        }
        d(context2, userId, searchStatsLoggingInfo2, uIBlockSearchAuthor);
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
