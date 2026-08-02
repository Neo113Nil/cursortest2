package com.vk.catalog2.common.ui.mvp.holder.group;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsVideoLivesDataDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.BaseGroupVh;
import com.vk.catalog2.common.ui.holders.group.GroupSubscriptionState;
import com.vk.catalog2.common.ui.holders.group.avatar.GroupAvatarViewContainer;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.profile.Donut;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.b5a;
import xsna.bwt0;
import xsna.cju;
import xsna.cn70;
import xsna.cq5;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e4h;
import xsna.epx;
import xsna.erm0;
import xsna.fkq0;
import xsna.hmb;
import xsna.i5g;
import xsna.k22;
import xsna.lf1;
import xsna.ng3;
import xsna.o0r0;
import xsna.pp3;
import xsna.q3a;
import xsna.rik0;
import xsna.rli0;
import xsna.s0w0;
import xsna.thu;
import xsna.x68;
import xsna.xpm0;
import xsna.xwk;
import xsna.ziu;

/* compiled from: GroupCardItemVh.kt */
/* loaded from: classes16.dex */
public final class GroupCardItemVh extends BaseGroupVh {
    public final boolean h;
    public VKImageView i;
    public GroupAvatarViewContainer j;
    public ImageView k;
    public SquareExcerptTextView l;
    public ImageButton m;
    public ViewGroup n;
    public TextView o;
    public TextView p;
    public PhotoStackView q;
    public View r;
    public UserId s;
    public GroupSubscriptionState t;
    public c u;

    /* compiled from: GroupCardItemVh.kt */
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

    public /* synthetic */ GroupCardItemVh(SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, b5a b5aVar) {
        this(b5aVar, q3aVar, searchStatInfoProvider, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        c cVar = this.u;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        GroupSubscriptionState groupSubscriptionState;
        boolean z;
        Image image;
        String str;
        String quantityString;
        TextView textView;
        ArrayList<UserProfile> arrayList;
        List A;
        View view;
        View view2;
        View view3;
        TextView textView2;
        Integer num;
        String str2;
        Object obj;
        ImageSize Cb;
        String str3;
        GroupAvatarViewContainer groupAvatarViewContainer;
        CatalogProfileLocalState catalogProfileLocalState;
        super.N6(uIBlock);
        if (!(uIBlock instanceof UIBlockGroup)) {
            return;
        }
        UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
        Group group = uIBlockGroup.y;
        UserId userId = this.s;
        UserId userId2 = group.c;
        VerifyInfo verifyInfo = group.y;
        boolean f = epx.f(userId, userId2);
        this.s = group.c;
        GroupSubscriptionState groupSubscriptionState2 = this.t;
        int i = 0;
        boolean z2 = group.j || group.C == 4;
        if (z2) {
            UIBlockGroup uIBlockGroup2 = this.e;
            if (((uIBlockGroup2 == null || (catalogProfileLocalState = uIBlockGroup2.A) == null) ? null : catalogProfileLocalState.b) == CatalogProfileLocalState.FollowSource.Internal) {
                groupSubscriptionState = GroupSubscriptionState.RecentlySubscribed;
                this.t = groupSubscriptionState;
                if (!f) {
                    if (groupSubscriptionState != groupSubscriptionState2) {
                        p(uIBlockGroup, group);
                        return;
                    }
                    return;
                }
                boolean f2 = epx.f(uIBlockGroup.D, "donut");
                SquareExcerptTextView squareExcerptTextView = this.l;
                if (squareExcerptTextView == null) {
                    squareExcerptTextView = null;
                }
                squareExcerptTextView.setText(group.d);
                SquareExcerptTextView squareExcerptTextView2 = this.l;
                if (squareExcerptTextView2 == null) {
                    squareExcerptTextView2 = null;
                }
                squareExcerptTextView2.requestLayout();
                String str4 = group.g0;
                VKImageView vKImageView = this.i;
                if (vKImageView == null) {
                    vKImageView = null;
                }
                vKImageView.clear();
                VKImageView vKImageView2 = this.i;
                if (vKImageView2 == null) {
                    vKImageView2 = null;
                }
                if (str4 == null) {
                    str4 = "#CFD9E9";
                }
                try {
                    if (str4.length() > 6) {
                        str4 = erm0.E0(6, str4);
                    }
                    vKImageView2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{Color.parseColor("#FF".concat(drm0.U(str4, "#"))), Color.parseColor("#00".concat(drm0.U(str4, "#")))}));
                } catch (Throwable unused) {
                    vKImageView2.setBackgroundColor(Color.parseColor("#CFD9E9"));
                }
                Image image2 = group.i0;
                if (group.h0 && image2 != null) {
                    View view4 = this.r;
                    if (view4 == null) {
                        view4 = null;
                    }
                    bwt0.S(view4, new k22(7, image2, this));
                }
                GroupsVideoLivesDataDto groupsVideoLivesDataDto = group.x0;
                if (groupsVideoLivesDataDto != null && groupsVideoLivesDataDto.e()) {
                    GroupsVideoLivesDataDto groupsVideoLivesDataDto2 = group.x0;
                    if ((groupsVideoLivesDataDto2 != null ? groupsVideoLivesDataDto2.d() : null) == GroupsVideoLivesDataDto.BadgeTypeDto.BASE_LIVE) {
                        z = true;
                        image = group.g;
                        if (image != null && (Cb = image.Cb(400, true, false)) != null && (str3 = Cb.d.d) != null) {
                            groupAvatarViewContainer = this.j;
                            if (groupAvatarViewContainer == null) {
                                groupAvatarViewContainer = null;
                            }
                            groupAvatarViewContainer.B(str3, group.n0, z, cq5.b.a);
                        }
                        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                        ImageView imageView = this.k;
                        VerifyInfoHelper.k(imageView != null ? null : imageView, true, verifyInfo, false, false, 56);
                        str = group.z;
                        if (str != null) {
                            TextView textView3 = this.o;
                            if (textView3 == null) {
                                textView3 = null;
                            }
                            textView3.setText(str);
                        }
                        Donut donut = group.Q;
                        Donut.Description description = donut == null ? donut.e : null;
                        int i2 = 2;
                        if (!f2 && description != null) {
                            List<UserProfile> list = description.h;
                            int size = list != null ? list.size() : 0;
                            StringBuilder sb = new StringBuilder();
                            List<Donut.StatsItem> list2 = description.i;
                            if (list2 != null) {
                                Iterator<T> it = list2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    } else {
                                        obj = it.next();
                                        if (((Donut.StatsItem) obj).b.equals("subscribers")) {
                                            break;
                                        }
                                    }
                                }
                                Donut.StatsItem statsItem = (Donut.StatsItem) obj;
                                if (statsItem != null) {
                                    num = Integer.valueOf(statsItem.g);
                                    if (num == null) {
                                        TextView textView4 = this.p;
                                        if (textView4 == null) {
                                            textView4 = null;
                                        }
                                        str2 = textView4.getContext().getResources().getQuantityString(R.plurals.group_friends_donors_count, num.intValue() < 1000 ? num.intValue() : 1000, xpm0.a(num.intValue()));
                                    } else {
                                        str2 = "";
                                    }
                                    if (!drm0.N(str2)) {
                                        sb.append(str2);
                                    }
                                    if (!drm0.N(str2) && size > 0) {
                                        sb.append((CharSequence) rik0.a);
                                    }
                                    if (size > 0) {
                                        TextView textView5 = this.p;
                                        if (textView5 == null) {
                                            textView5 = null;
                                        }
                                        sb.append(textView5.getContext().getResources().getQuantityString(R.plurals.group_friends_members_count, size, Integer.valueOf(size)));
                                    }
                                    quantityString = sb.toString();
                                }
                            }
                            num = null;
                            if (num == null) {
                            }
                            if (!drm0.N(str2)) {
                            }
                            if (!drm0.N(str2)) {
                                sb.append((CharSequence) rik0.a);
                            }
                            if (size > 0) {
                            }
                            quantityString = sb.toString();
                        } else if (group.w <= 0) {
                            TextView textView6 = this.p;
                            if (textView6 == null) {
                                textView6 = null;
                            }
                            Resources resources = textView6.getContext().getResources();
                            int i3 = group.w;
                            quantityString = resources.getQuantityString(R.plurals.group_friends_members_count, i3, Integer.valueOf(i3));
                        } else {
                            String a2 = xpm0.a(group.v);
                            int i4 = group.p == 2 ? R.plurals.group_subscribers_search : R.plurals.group_members_search;
                            TextView textView7 = this.p;
                            if (textView7 == null) {
                                textView7 = null;
                            }
                            Resources resources2 = textView7.getContext().getResources();
                            int i5 = group.v;
                            quantityString = resources2.getQuantityString(i4, i5 < 1000 ? i5 : 1000, a2);
                        }
                        textView = this.p;
                        if (textView == null) {
                            textView = null;
                        }
                        textView.setText(quantityString);
                        if (f2) {
                            int b = cn70.b(16);
                            boolean z3 = group.w > 0;
                            PhotoStackView photoStackView = this.q;
                            if (photoStackView == null) {
                                photoStackView = null;
                            }
                            bwt0.p0(photoStackView, z3);
                            if (z3 && (arrayList = group.K) != null && (A = rli0.A(rli0.y(rli0.t(new i5g(arrayList), new cju(b, i)), 2))) != null) {
                                PhotoStackView photoStackView2 = this.q;
                                if (photoStackView2 == null) {
                                    photoStackView2 = null;
                                }
                                PhotoStackView.b bVar = PhotoStackView.M;
                                photoStackView2.r(-1, A);
                            }
                        } else {
                            PhotoStackView photoStackView3 = this.q;
                            if (photoStackView3 == null) {
                                photoStackView3 = null;
                            }
                            bwt0.p0(photoStackView3, false);
                        }
                        p(uIBlockGroup, group);
                        view = this.r;
                        if (view == null) {
                            view = null;
                        }
                        view.setOnClickListener(new hmb(i2, this, group));
                        view2 = this.r;
                        if (view2 == null) {
                            view2 = null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(group.d);
                        sb2.append(" ");
                        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                        view3 = this.r;
                        if (view3 == null) {
                            view3 = null;
                        }
                        sb2.append(VerifyInfoHelper.c(view3.getContext(), verifyInfo));
                        sb2.append(" ");
                        textView2 = this.o;
                        if (textView2 == null) {
                            textView2 = null;
                        }
                        sb2.append(textView2.getText());
                        sb2.append(" ");
                        TextView textView8 = this.p;
                        sb2.append((textView8 != null ? textView8 : null).getText());
                        sb2.append(" ");
                        view2.setContentDescription(sb2.toString());
                        return;
                    }
                }
                z = false;
                image = group.g;
                if (image != null) {
                    groupAvatarViewContainer = this.j;
                    if (groupAvatarViewContainer == null) {
                    }
                    groupAvatarViewContainer.B(str3, group.n0, z, cq5.b.a);
                }
                VerifyInfoHelper verifyInfoHelper3 = VerifyInfoHelper.a;
                ImageView imageView2 = this.k;
                VerifyInfoHelper.k(imageView2 != null ? null : imageView2, true, verifyInfo, false, false, 56);
                str = group.z;
                if (str != null) {
                }
                Donut donut2 = group.Q;
                if (donut2 == null) {
                }
                int i22 = 2;
                if (!f2) {
                }
                if (group.w <= 0) {
                }
                textView = this.p;
                if (textView == null) {
                }
                textView.setText(quantityString);
                if (f2) {
                }
                p(uIBlockGroup, group);
                view = this.r;
                if (view == null) {
                }
                view.setOnClickListener(new hmb(i22, this, group));
                view2 = this.r;
                if (view2 == null) {
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append(group.d);
                sb22.append(" ");
                VerifyInfoHelper verifyInfoHelper22 = VerifyInfoHelper.a;
                view3 = this.r;
                if (view3 == null) {
                }
                sb22.append(VerifyInfoHelper.c(view3.getContext(), verifyInfo));
                sb22.append(" ");
                textView2 = this.o;
                if (textView2 == null) {
                }
                sb22.append(textView2.getText());
                sb22.append(" ");
                TextView textView82 = this.p;
                sb22.append((textView82 != null ? textView82 : null).getText());
                sb22.append(" ");
                view2.setContentDescription(sb22.toString());
                return;
            }
        }
        groupSubscriptionState = z2 ? GroupSubscriptionState.Subscribed : GroupSubscriptionState.NotSubscribed;
        this.t = groupSubscriptionState;
        if (!f) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh
    public final void j(Group group, boolean z) {
        ImageButton imageButton = this.m;
        if (imageButton == null) {
            imageButton = null;
        }
        imageButton.setImageResource(R.drawable.vk_icon_add_alt_20);
        m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
        e4h h0 = xwk.e().h0();
        ImageButton imageButton2 = this.m;
        e4h.l(h0, (imageButton2 != null ? imageButton2 : null).getContext(), fkq0.e(group.c), new thu(this, group, z, 1), group, 16);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_group_card_item, viewGroup, false);
        this.r = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.cover_image);
        vKImageView.setClipToOutline(true);
        vKImageView.setOutlineProvider(new s0w0(cn70.a() * 16.0f, false, true));
        this.i = vKImageView;
        GroupAvatarViewContainer groupAvatarViewContainer = (GroupAvatarViewContainer) inflate.findViewById(R.id.avatar_image);
        groupAvatarViewContainer.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        this.j = groupAvatarViewContainer;
        this.k = (ImageView) inflate.findViewById(R.id.icon_meta);
        SquareExcerptTextView squareExcerptTextView = (SquareExcerptTextView) inflate.findViewById(R.id.title);
        squareExcerptTextView.setShowMoreText("");
        squareExcerptTextView.setMaxExcerptLines(squareExcerptTextView.getMaxLines());
        squareExcerptTextView.setShouldTruncate(true);
        squareExcerptTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.l = squareExcerptTextView;
        this.m = (ImageButton) inflate.findViewById(R.id.subscribe_button);
        this.n = (ViewGroup) inflate.findViewById(R.id.subscribe_button_layout);
        PhotoStackView photoStackView = (PhotoStackView) inflate.findViewById(R.id.friends_photos);
        photoStackView.v(14.0f, 1.5f, 16.0f);
        this.q = photoStackView;
        this.o = (TextView) inflate.findViewById(R.id.group_category);
        this.p = (TextView) inflate.findViewById(R.id.subscribers_count);
        if (this.h) {
            int b = cn70.b(8);
            View view = this.r;
            if (view == null) {
                view = null;
            }
            view.getLayoutParams().width = -1;
            VKImageView vKImageView2 = this.i;
            if (vKImageView2 == null) {
                vKImageView2 = null;
            }
            vKImageView2.getLayoutParams().height = 0;
            VKImageView vKImageView3 = this.i;
            if (vKImageView3 == null) {
                vKImageView3 = null;
            }
            ViewGroup.LayoutParams layoutParams = vKImageView3.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                bVar.G = "5:2";
            }
            GroupAvatarViewContainer groupAvatarViewContainer2 = this.j;
            if (groupAvatarViewContainer2 == null) {
                groupAvatarViewContainer2 = null;
            }
            int b2 = cn70.b(52);
            int b3 = cn70.b(-26);
            int b4 = cn70.b(6);
            ViewGroup.LayoutParams layoutParams2 = groupAvatarViewContainer2.getLayoutParams();
            layoutParams2.width = b2;
            layoutParams2.height = b2;
            groupAvatarViewContainer2.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = groupAvatarViewContainer2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = b3;
                marginLayoutParams.leftMargin = b4;
            }
            groupAvatarViewContainer2.L(b2);
            float b5 = cn70.b(6);
            ImageView imageView = this.k;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setTranslationX(b5);
            ImageView imageView2 = this.k;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setTranslationY(b5);
            SquareExcerptTextView squareExcerptTextView2 = this.l;
            if (squareExcerptTextView2 == null) {
                squareExcerptTextView2 = null;
            }
            ViewGroup.LayoutParams layoutParams4 = squareExcerptTextView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = cn70.b(28);
                marginLayoutParams2.leftMargin = b;
                marginLayoutParams2.rightMargin = cn70.b(4);
            }
            TextView textView = this.o;
            if (textView == null) {
                textView = null;
            }
            ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.leftMargin = b;
                marginLayoutParams3.rightMargin = b;
            }
            PhotoStackView photoStackView2 = this.q;
            if (photoStackView2 == null) {
                photoStackView2 = null;
            }
            ViewGroup.LayoutParams layoutParams6 = photoStackView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.leftMargin = b;
            }
            TextView textView2 = this.p;
            if (textView2 == null) {
                textView2 = null;
            }
            ViewGroup.LayoutParams layoutParams7 = textView2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
            if (marginLayoutParams5 != null) {
                marginLayoutParams5.rightMargin = b;
            }
            TextView textView3 = this.p;
            if (textView3 == null) {
                textView3 = null;
            }
            ViewGroup.LayoutParams layoutParams8 = textView3.getLayoutParams();
            ConstraintLayout.b bVar2 = layoutParams8 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams8 : null;
            if (bVar2 != null) {
                bVar2.A = b;
            }
        }
        View view2 = this.r;
        if (view2 == null) {
            return null;
        }
        return view2;
    }

    public final void p(UIBlockGroup uIBlockGroup, Group group) {
        ImageButton imageButton = this.m;
        if (imageButton == null) {
            imageButton = null;
        }
        if (epx.f(uIBlockGroup.C, "blue")) {
            imageButton.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_text_accent)));
            imageButton.setImageTintList(ColorStateList.valueOf(imageButton.getContext().getColor(R.color.vk_white)));
            ViewGroup viewGroup = this.n;
            if (viewGroup == null) {
                viewGroup = null;
            }
            viewGroup.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ViewGroup viewGroup2 = this.n;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            int b = cn70.b(2);
            viewGroup2.setPadding(b, b, b, b);
            ViewGroup viewGroup3 = this.n;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            viewGroup3.setBackgroundTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_tertiary, imageButton.getContext())));
        } else {
            imageButton.setBackgroundTintList(ColorStateList.valueOf(0));
            imageButton.setImageTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_primary_invariably)));
            ViewGroup viewGroup4 = this.n;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            viewGroup4.setElevation(cn70.a() * 4.0f);
            ViewGroup viewGroup5 = this.n;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            viewGroup5.setPadding(0, 0, 0, 0);
            ViewGroup viewGroup6 = this.n;
            if (viewGroup6 == null) {
                viewGroup6 = null;
            }
            viewGroup6.setBackgroundTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background_contrast, imageButton.getContext())));
        }
        q();
        ImageButton imageButton2 = this.m;
        bwt0.i0(imageButton2 != null ? imageButton2 : null, new ng3(22, this, group));
        s(group);
    }

    public final void q() {
        ImageButton imageButton = this.m;
        if (imageButton == null) {
            imageButton = null;
        }
        imageButton.setImageResource(this.t != GroupSubscriptionState.NotSubscribed ? R.drawable.vk_icon_check_alt_20 : R.drawable.vk_icon_add_alt_20);
    }

    public final void r(Group group, boolean z) {
        int i = group.C;
        boolean z2 = group.j;
        boolean l = l(group);
        t(group);
        o0r0 e = xwk.e();
        UserId e2 = fkq0.e(group.c);
        UIBlockGroup uIBlockGroup = this.e;
        this.u = o0r0.g(e, e2, l, uIBlockGroup != null ? uIBlockGroup.r() : null, z, null, 48).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pp3(new x68(l, group, 1), 22), new lf1(new ziu(group, i, z2, this), 26));
    }

    public final void s(Group group) {
        String string;
        ImageButton imageButton = this.m;
        if (imageButton == null) {
            imageButton = null;
        }
        GroupSubscriptionState groupSubscriptionState = this.t;
        int i = groupSubscriptionState == null ? -1 : a.$EnumSwitchMapping$0[groupSubscriptionState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ImageButton imageButton2 = this.m;
                string = (imageButton2 != null ? imageButton2 : null).getContext().getString(R.string.community_join);
            } else if (i != 3) {
                string = "";
            } else {
                ImageButton imageButton3 = this.m;
                string = (imageButton3 != null ? imageButton3 : null).getContext().getString(R.string.leave_group);
            }
        } else if (group.j) {
            ImageButton imageButton4 = this.m;
            string = (imageButton4 != null ? imageButton4 : null).getContext().getString(R.string.leave_group);
        } else {
            ImageButton imageButton5 = this.m;
            string = (imageButton5 != null ? imageButton5 : null).getContext().getString(R.string.profile_friend_cancel);
        }
        imageButton.setContentDescription(string);
    }

    public final void t(Group group) {
        this.t = (group.j || group.C == 4) ? GroupSubscriptionState.RecentlySubscribed : GroupSubscriptionState.NotSubscribed;
        s(group);
    }

    public GroupCardItemVh(b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        this.h = z;
    }
}
