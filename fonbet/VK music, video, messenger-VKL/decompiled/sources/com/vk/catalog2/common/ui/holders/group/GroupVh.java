package com.vk.catalog2.common.ui.holders.group;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.core.analytics.tracking.GroupAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.group.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStripView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SimpleTimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.TimeUtils;
import xsna.b5a;
import xsna.bhh;
import xsna.bwt0;
import xsna.c5g;
import xsna.c98;
import xsna.cn70;
import xsna.cpu;
import xsna.cq5;
import xsna.cqm0;
import xsna.d9j;
import xsna.dhh;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.f5h0;
import xsna.fha;
import xsna.h1;
import xsna.iah0;
import xsna.izs;
import xsna.krh;
import xsna.krv0;
import xsna.lwh;
import xsna.m3a;
import xsna.nk0;
import xsna.ojt;
import xsna.omw;
import xsna.ozl;
import xsna.pff;
import xsna.pvo0;
import xsna.q3a;
import xsna.qqe;
import xsna.rik0;
import xsna.rkt;
import xsna.t8a;
import xsna.u12;
import xsna.uqm0;
import xsna.wz5;
import xsna.xg5;
import xsna.xuo0;
import xsna.ylw;
import xsna.zgu;

/* compiled from: GroupVh.kt */
@ozl
/* loaded from: classes16.dex */
public class GroupVh extends BaseGroupVh implements View.OnClickListener, a.InterfaceC0484a {
    public ImageView A;
    public TextView B;
    public View C;
    public PhotoStripView D;
    public View E;
    public Group F;
    public ViewPropertyAnimator G;
    public final u12 H;
    public final int h;
    public final m3a i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public com.vk.catalog2.common.ui.holders.group.a q;
    public TextView r;
    public TextView s;
    public TextView t;
    public ImageView u;
    public ImageView v;
    public TextView w;
    public View x;
    public zgu y;
    public VKImageView z;

    /* compiled from: GroupVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupSubscriptionState.values().length];
            try {
                iArr[GroupSubscriptionState.Subscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupSubscriptionState.NotSubscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupSubscriptionState.RecentlySubscribed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GroupVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Group, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(Group group) {
            return Boolean.valueOf(((GroupVh) this.receiver).l(group));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupVh(int i, int i2, SearchStatInfoProvider searchStatInfoProvider, m3a m3aVar, q3a q3aVar, b5a b5aVar, boolean z) {
        super(searchStatInfoProvider, q3aVar, b5aVar);
        boolean z2 = (i2 & 32) == 0;
        searchStatInfoProvider = (i2 & 64) != 0 ? null : searchStatInfoProvider;
        boolean z3 = (i2 & 4096) != 0;
        boolean z4 = (i2 & 8192) == 0;
        this.h = i;
        this.i = m3aVar;
        this.j = z;
        this.k = z2;
        this.l = true;
        this.m = true;
        this.n = Integer.MAX_VALUE;
        this.o = z3;
        this.p = z4;
        this.H = new u12(this, 8);
        VideoFeatures.LIVE_BADGE_IN_SUBS.h();
    }

    public static String p(Group group) {
        String str = group.x;
        if (str != null && !drm0.N(str)) {
            return group.x;
        }
        String format = NumberFormat.getInstance().format(Integer.valueOf(group.v));
        int i = group.p == 2 ? R.plurals.group_subscribers_search : R.plurals.group_members_search;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getResources().getQuantityString(i, group.v, format);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ImageView imageView = this.A;
        if (imageView != null && this.l) {
            imageView.removeCallbacks(this.H);
        }
        com.vk.catalog2.common.ui.holders.group.a aVar = this.q;
        if (aVar != null) {
            aVar.c.e();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a0  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.CharSequence] */
    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N6(UIBlock uIBlock) {
        Object obj;
        TextView textView;
        TextView textView2;
        ImageView imageView;
        View view;
        boolean g;
        VKImageView vKImageView;
        zgu zguVar;
        Group group;
        cq5 cq5Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ?? text;
        CharSequence charSequence3;
        String str;
        String i;
        boolean z = this.k;
        super.N6(uIBlock);
        if (!(uIBlock instanceof UIBlockGroup)) {
            return;
        }
        UIBlockGroup uIBlockGroup = (UIBlockGroup) uIBlock;
        Group group2 = uIBlockGroup.y;
        GroupCatalogItem groupCatalogItem = uIBlockGroup.z;
        VerifyInfo verifyInfo = group2.y;
        ViewPropertyAnimator viewPropertyAnimator = this.G;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.F = group2;
        com.vk.catalog2.common.ui.holders.group.a aVar = this.q;
        if (aVar != null) {
            aVar.a(this.e, group2);
        }
        TextView textView3 = this.r;
        if (textView3 != null) {
            textView3.setText(group2.d);
        }
        GroupLikes groupLikes = group2.T;
        if (groupLikes == null) {
            groupLikes = groupCatalogItem != null ? groupCatalogItem.f : null;
        }
        if (group2.p != 1 && groupLikes != null) {
            ArrayList<UserProfile> arrayList = groupLikes.e;
            if (arrayList.size() > 0) {
                if (groupLikes.d != 2 || arrayList.size() < 2) {
                    i = (groupLikes.d != 1 || arrayList.size() < 1) ? uqm0.i(groupLikes.d, R.plurals.community_referrers_recommend_short, R.string.community_referrers_recommend_formatted_short, true) : arrayList.get(0).d;
                } else {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    i = context.getString(R.string.community_liked_two_short, arrayList.get(0).d, arrayList.get(1).d);
                }
                TextView textView4 = this.w;
                if (textView4 != null) {
                    textView4.setSingleLine();
                }
                String p = p(group2);
                TextView textView5 = this.w;
                if (textView5 != null) {
                    if (p != null && !drm0.N(p)) {
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        i = context2.getString(R.string.group_friends_with_members_count, i, p);
                    }
                    textView5.setText(i);
                }
                PhotoStripView photoStripView = this.D;
                if (photoStripView != null) {
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((UserProfile) it.next()).h);
                    }
                    photoStripView.l(2, arrayList2);
                }
                PhotoStripView photoStripView2 = this.D;
                if (photoStripView2 != null) {
                    photoStripView2.setVisibility(0);
                }
                textView = this.s;
                if (textView != null) {
                    cpu.b bVar = new cpu.b(group2.W, group2.V);
                    cpu a2 = xg5.a();
                    int i2 = cpu.a;
                    textView.setText(a2.u(bVar));
                    CharSequence text2 = textView.getText();
                    bwt0.p0(textView, !(text2 == null || text2.length() == 0));
                }
                textView2 = this.t;
                String str2 = "";
                if (textView2 != null) {
                    if (groupCatalogItem != null && (str = groupCatalogItem.g) != null) {
                        if (drm0.N(str)) {
                            str = null;
                        }
                        if (str != null) {
                            Context context3 = e43.a;
                            if (context3 == null) {
                                context3 = null;
                            }
                            ylw ylwVar = new ylw(R.drawable.vk_icon_place_12);
                            ylwVar.h = R.attr.vk_ui_icon_tertiary;
                            ylwVar.f = iah0.a(1);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ylwVar.b(context3));
                            spannableStringBuilder.append((CharSequence) rik0.b(iah0.b(1.5f)));
                            spannableStringBuilder.append((CharSequence) str);
                            charSequence3 = spannableStringBuilder;
                            textView2.setText(charSequence3);
                            CharSequence text3 = textView2.getText();
                            bwt0.p0(textView2, !(text3 != null || text3.length() == 0));
                        }
                    }
                    charSequence3 = "";
                    textView2.setText(charSequence3);
                    CharSequence text32 = textView2.getText();
                    bwt0.p0(textView2, !(text32 != null || text32.length() == 0));
                }
                imageView = this.v;
                if (imageView != null) {
                    bwt0.p0(imageView, group2.G);
                }
                view = this.E;
                if (view != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(group2.d);
                    sb.append(" ");
                    VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                    Context context4 = e43.a;
                    if (context4 == null) {
                        context4 = null;
                    }
                    sb.append(VerifyInfoHelper.c(context4, verifyInfo));
                    sb.append(" ");
                    TextView textView6 = this.t;
                    if (textView6 == null || (charSequence = textView6.getText()) == null) {
                        charSequence = "";
                    }
                    sb.append(charSequence);
                    sb.append(" ");
                    TextView textView7 = this.s;
                    if (textView7 == null || (charSequence2 = textView7.getText()) == null) {
                        charSequence2 = "";
                    }
                    sb.append(charSequence2);
                    sb.append(" ");
                    TextView textView8 = this.w;
                    if (textView8 != null && (text = textView8.getText()) != 0) {
                        str2 = text;
                    }
                    sb.append((CharSequence) str2);
                    view.setContentDescription(sb.toString());
                }
                g = g();
                vKImageView = this.z;
                if (vKImageView != null) {
                    vKImageView.load(group2.e);
                }
                zguVar = this.y;
                if (zguVar != null) {
                    String str3 = group2.e;
                    boolean z2 = group2.n0;
                    if (g()) {
                        cq5Var = cq5.g.a;
                    } else {
                        boolean z3 = group2.U;
                        cq5Var = (z3 && z3 && z) ? cq5.h.a : cq5.b.a;
                    }
                    zguVar.B(str3, z2, g, cq5Var);
                }
                if (g) {
                    VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                    VerifyInfoHelper.k(this.u, this.j, verifyInfo, false, this.p, 24);
                } else {
                    ImageView imageView2 = this.u;
                    if (imageView2 != null) {
                        f4m.j(imageView2);
                    }
                }
                if (groupCatalogItem == null) {
                    int i3 = groupCatalogItem.d;
                    if (i3 > 20) {
                        View view2 = this.C;
                        if (view2 != null) {
                            view2.setVisibility(0);
                        }
                        TextView textView9 = this.B;
                        if (textView9 != null) {
                            f4m.j(textView9);
                        }
                    } else if (1 > i3 || i3 >= 21) {
                        View view3 = this.C;
                        if (view3 != null) {
                            f4m.j(view3);
                        }
                        TextView textView10 = this.B;
                        if (textView10 != null) {
                            f4m.j(textView10);
                        }
                    } else {
                        View view4 = this.C;
                        if (view4 != null) {
                            f4m.j(view4);
                        }
                        TextView textView11 = this.B;
                        if (textView11 != null) {
                            textView11.setVisibility(0);
                        }
                        TextView textView12 = this.B;
                        if (textView12 != null) {
                            textView12.setText(String.valueOf(i3));
                        }
                    }
                } else {
                    View view5 = this.C;
                    if (view5 != null) {
                        f4m.j(view5);
                    }
                    TextView textView13 = this.B;
                    if (textView13 != null) {
                        f4m.j(textView13);
                    }
                }
                group = this.F;
                if (group != null) {
                    r();
                    return;
                }
                if (g()) {
                    VKImageView vKImageView2 = this.z;
                    if (vKImageView2 != null) {
                        int b2 = cn70.b(0);
                        vKImageView2.setPadding(b2, b2, b2, b2);
                    }
                    VKImageView vKImageView3 = this.z;
                    if (vKImageView3 != null) {
                        Context context5 = e43.a;
                        vKImageView3.setContentDescription((context5 != null ? context5 : null).getString(R.string.accessibility_open_profile));
                    }
                    VKImageView vKImageView4 = this.z;
                    if (vKImageView4 != null) {
                        bwt0.j0(vKImageView4, new bhh(this, 23), 700L);
                    }
                    View view6 = this.x;
                    if (view6 != null) {
                        view6.setContentDescription(view6.getContext().getString(R.string.accessibility_open_profile));
                        bwt0.j0(view6, new qqe(this, 24), 700L);
                        return;
                    }
                    return;
                }
                if (!group.U || !z) {
                    r();
                    return;
                }
                VKImageView vKImageView5 = this.z;
                if (vKImageView5 != null) {
                    int b3 = cn70.b(4);
                    vKImageView5.setPadding(b3, b3, b3, b3);
                }
                VKImageView vKImageView6 = this.z;
                if (vKImageView6 != null) {
                    Context context6 = e43.a;
                    vKImageView6.setContentDescription((context6 != null ? context6 : null).getString(R.string.accessibility_catalog_story_at_avatar));
                }
                VKImageView vKImageView7 = this.z;
                if (vKImageView7 != null) {
                    bwt0.j0(vKImageView7, new h1(17, this, group), 700L);
                }
                View view7 = this.x;
                if (view7 != null) {
                    view7.setContentDescription(view7.getContext().getString(R.string.accessibility_catalog_story_at_avatar));
                    bwt0.j0(view7, new nk0(16, this, group), 700L);
                    return;
                }
                return;
            }
        }
        String str4 = groupCatalogItem != null ? groupCatalogItem.c : null;
        if (str4 != null && !drm0.N(str4)) {
            obj = groupCatalogItem != null ? groupCatalogItem.c : null;
        } else if (group2.p == 1) {
            Context context7 = e43.a;
            if (context7 == null) {
                context7 = null;
            }
            int i4 = group2.q;
            if (i4 == 0) {
                obj = group2.z;
            } else {
                long j = i4 * 1000;
                long j2 = j - (j % TimeUtils.MILLISECONDS_PER_DAY);
                SimpleTimeZone simpleTimeZone = pvo0.a;
                xuo0.a.getClass();
                long a3 = xuo0.a();
                long j3 = a3 - (a3 % TimeUtils.MILLISECONDS_PER_DAY);
                int i5 = group2.r;
                obj = (i5 <= 0 || a3 <= j || a3 >= ((long) i5) * 1000) ? j < j3 ? context7.getString(R.string.event_past, pvo0.i(false, group2.q, false, false)) : j3 == j2 ? rik0.a(R.attr.vk_ui_text_accent, pvo0.i(false, group2.q, false, false)) : j3 + TimeUtils.MILLISECONDS_PER_DAY == j2 ? rik0.a(R.attr.vk_ui_text_accent, cqm0.b(pvo0.i(false, group2.q, false, false))) : j3 + 604800000 > j2 ? context7.getString(R.string.event_on_this_week, pvo0.e(group2.q), pvo0.i(false, group2.q, false, false)) : pvo0.i(false, group2.q, false, false) : rik0.a(R.attr.vk_ui_text_accent, context7.getString(R.string.event_time_now));
            }
        } else {
            TextView textView14 = this.w;
            if (textView14 != null) {
                textView14.setSingleLine();
            }
            String p2 = p(group2);
            if (p2 == null || drm0.N(p2)) {
                obj = group2.z;
            } else {
                Context context8 = e43.a;
                if (context8 == null) {
                    context8 = null;
                }
                obj = context8.getString(R.string.group_description_with_members_count, drm0.p0(group2.z).toString(), p2);
            }
        }
        String valueOf = String.valueOf(obj);
        TextView textView15 = this.w;
        if (textView15 != null) {
            textView15.setText(valueOf);
        }
        PhotoStripView photoStripView3 = this.D;
        if (photoStripView3 != null) {
            f4m.j(photoStripView3);
        }
        textView = this.s;
        if (textView != null) {
        }
        textView2 = this.t;
        String str22 = "";
        if (textView2 != null) {
        }
        imageView = this.v;
        if (imageView != null) {
        }
        view = this.E;
        if (view != null) {
        }
        g = g();
        vKImageView = this.z;
        if (vKImageView != null) {
        }
        zguVar = this.y;
        if (zguVar != null) {
        }
        if (g) {
        }
        if (groupCatalogItem == null) {
        }
        group = this.F;
        if (group != null) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void a(GroupSubscriptionState groupSubscriptionState, Group group) {
        View view;
        Context context;
        ImageView imageView;
        int i;
        if (!epx.f(this.F, group) || (view = this.E) == null || (context = view.getContext()) == null || (imageView = this.A) == null || (i = a.$EnumSwitchMapping$0[groupSubscriptionState.ordinal()]) == 1) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Leave));
            com.vk.catalog2.common.ui.holders.group.a aVar = this.q;
            if (aVar != null) {
                aVar.e(context);
                return;
            }
            return;
        }
        if (group.p != 1) {
            m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.Join));
            s(true);
            return;
        }
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        imageView.getContext();
        e.b bVar = new e.b(imageView, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new rkt(this, 2), 30);
        VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new pff(this, 29), 30);
        bVar.a().j(false);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void b(GroupSubscriptionState groupSubscriptionState, Group group) {
        ImageView imageView;
        String str;
        ImageView imageView2 = this.A;
        if (imageView2 == null) {
            return;
        }
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[groupSubscriptionState.ordinal()];
        u12 u12Var = this.H;
        boolean z = this.l;
        if (i == 1) {
            if (z) {
                imageView2.removeCallbacks(u12Var);
            }
            f4m.j(imageView2);
        } else if (i == 2) {
            if (z) {
                imageView2.removeCallbacks(u12Var);
            }
            imageView2.setImageResource(R.drawable.vk_icon_add_square_outline_28);
            omw.b(imageView2, R.attr.vk_ui_icon_accent);
            imageView2.setVisibility(0);
            imageView2.setAlpha(1.0f);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            imageView2.setImageResource(R.drawable.vk_icon_done_outline_28);
            omw.b(imageView2, R.attr.vk_ui_icon_secondary);
            imageView2.setVisibility(0);
            imageView2.setAlpha(1.0f);
        }
        Group group2 = this.F;
        if (group2 == null || (imageView = this.A) == null) {
            return;
        }
        int i2 = iArr[groupSubscriptionState.ordinal()];
        if (i2 == 1) {
            str = "";
        } else if (i2 == 2) {
            str = imageView.getContext().getString(R.string.community_join);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = group2.j ? imageView.getContext().getString(R.string.leave_group) : imageView.getContext().getString(R.string.profile_friend_cancel);
        }
        imageView.setContentDescription(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void e(Throwable th) {
        super.e(th);
        ImageView imageView = this.A;
        if (imageView == null || !this.l) {
            return;
        }
        imageView.removeCallbacks(this.H);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GroupVh groupVh;
        View inflate = layoutInflater.inflate(this.h, viewGroup, false);
        this.E = inflate;
        int i = this.n;
        if (i != Integer.MAX_VALUE) {
            bwt0.r0(i, inflate);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        textView.setMaxLines(2);
        this.r = textView;
        this.s = (TextView) inflate.findViewById(R.id.subtitle_government);
        this.t = (TextView) inflate.findViewById(R.id.subtitle_city);
        this.u = (ImageView) inflate.findViewById(R.id.icon_meta);
        this.v = (ImageView) inflate.findViewById(R.id.vk_pay_icon);
        this.w = (TextView) inflate.findViewById(R.id.subtitle);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.icon);
        com.vk.catalog2.common.ui.holders.group.a aVar = null;
        if (vKImageView != null) {
            RoundingParams a2 = RoundingParams.a();
            ojt ojtVar = new ojt(vKImageView.getResources());
            ojtVar.q = a2;
            ojtVar.l = f5h0.f.a;
            vKImageView.setHierarchy(ojtVar.a());
            vKImageView.y0(cn70.a() * 0.5f, e3m.f(R.attr.vk_ui_image_border_alpha, vKImageView.getContext()));
        } else {
            vKImageView = null;
        }
        this.z = vKImageView;
        View findViewById = inflate.findViewById(R.id.avatar);
        this.x = findViewById;
        this.y = findViewById instanceof zgu ? (zgu) findViewById : null;
        VKImageView vKImageView2 = this.z;
        if (vKImageView2 != null) {
            vKImageView2.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        }
        zgu zguVar = this.y;
        if (zguVar != null) {
            zguVar.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.counter);
        if (!this.m) {
            Drawable background = textView2.getBackground();
            if (background != null) {
                background.setTint(dhr0.Y(R.attr.vk_ui_icon_tertiary, textView2.getContext()));
            }
            textView2.setTextColor(dhr0.Y(R.attr.vk_ui_text_contrast_themed, textView2.getContext()));
        }
        this.B = textView2;
        this.C = inflate.findViewById(R.id.dot);
        PhotoStripView photoStripView = (PhotoStripView) inflate.findViewById(R.id.photo_strip);
        this.D = photoStripView;
        if (photoStripView != null) {
            photoStripView.setOverlapOffset(0.8f);
        }
        PhotoStripView photoStripView2 = this.D;
        if (photoStripView2 != null) {
            photoStripView2.setBorderPadding(cn70.b(2));
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.subscribe_action);
        this.A = imageView;
        if (imageView != null) {
            if (this.o) {
                groupVh = this;
                aVar = new com.vk.catalog2.common.ui.holders.group.a(new b(1, groupVh, GroupVh.class, "switchGroupSubscriptionLocal", "switchGroupSubscriptionLocal(Lcom/vk/dto/group/Group;)Z", 0), this);
            } else {
                groupVh = this;
            }
            groupVh.q = aVar;
            imageView.setOnClickListener(new c98(new wz5(this, 5), 1));
        }
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public void onClick(View view) {
        UserId userId;
        m3a m3aVar;
        if (!((Boolean) this.g.getValue()).booleanValue() || ((!epx.f(view, this.z) && !epx.f(view, this.x)) || !g())) {
            n(CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR);
            h(view.getContext(), this.F, null, null, null);
            return;
        }
        Group group = this.F;
        if (group == null || (userId = group.c) == null || (m3aVar = this.i) == null) {
            return;
        }
        Context context = view.getContext();
        UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
        m3aVar.j(new t8a.a(context, userId, uiTrackingScreen != null ? uiTrackingScreen.a : null, new lwh(this, 17)));
    }

    public final void q(View view, Group group) {
        m(new GroupAnalyticsInfo(GroupAnalyticsInfo.ClickTarget.ShowStory));
        m3a m3aVar = this.i;
        if (m3aVar != null) {
            m3aVar.j(new fha.a(view, new StoryOwner.Community(group, null, 2, null), MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR, MobileOfficialAppsCoreNavStat$EventScreen.GROUPS_LIST, new krh(this, 22)));
        }
    }

    public final void r() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String string = context.getString(R.string.accessibility_open_profile);
        VKImageView vKImageView = this.z;
        if (vKImageView != null) {
            int b2 = cn70.b(0);
            vKImageView.setPadding(b2, b2, b2, b2);
        }
        VKImageView vKImageView2 = this.z;
        if (vKImageView2 != null) {
            vKImageView2.setContentDescription(string);
        }
        VKImageView vKImageView3 = this.z;
        if (vKImageView3 != null) {
            bwt0.j0(vKImageView3, new dhh(this, 23), 700L);
        }
        View view = this.x;
        if (view != null) {
            view.setContentDescription(string);
        }
        View view2 = this.x;
        if (view2 != null) {
            bwt0.j0(view2, new d9j(this, 15), 700L);
        }
    }

    public final void s(boolean z) {
        ImageView imageView;
        if (this.l && (imageView = this.A) != null) {
            imageView.postDelayed(this.H, 5000L);
        }
        com.vk.catalog2.common.ui.holders.group.a aVar = this.q;
        if (aVar != null) {
            com.vk.catalog2.common.ui.holders.group.a.d(aVar, z, null, null, 6);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void c() {
    }

    @Override // com.vk.catalog2.common.ui.holders.group.a.InterfaceC0484a
    public final void d() {
    }
}
