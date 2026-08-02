package com.vk.newsfeed.common.recycler.holders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.PhotoStackView;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.badges.BadgePostItem;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ItemReactions;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.UserSex;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vk.feed.tool.view.newsfeed.FooterButton;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.a2f0;
import xsna.am;
import xsna.an10;
import xsna.b1h;
import xsna.bc;
import xsna.bpn0;
import xsna.btm;
import xsna.bwt0;
import xsna.c1c0;
import xsna.c5g;
import xsna.c6z;
import xsna.cn70;
import xsna.dam;
import xsna.dhr0;
import xsna.di60;
import xsna.dof;
import xsna.drg;
import xsna.drm0;
import xsna.epx;
import xsna.f4m;
import xsna.f9t;
import xsna.fdi;
import xsna.fii0;
import xsna.g4g;
import xsna.g6z;
import xsna.g9p0;
import xsna.ga60;
import xsna.gbj;
import xsna.gko;
import xsna.gmq;
import xsna.grb;
import xsna.h170;
import xsna.h3f0;
import xsna.hd60;
import xsna.hi60;
import xsna.hk;
import xsna.hl60;
import xsna.huu0;
import xsna.i7o;
import xsna.iah0;
import xsna.ij3;
import xsna.ikv0;
import xsna.iut0;
import xsna.j5g;
import xsna.jcg;
import xsna.jjc;
import xsna.jno0;
import xsna.k9q0;
import xsna.msy;
import xsna.mxj;
import xsna.n5i;
import xsna.ncg;
import xsna.o25;
import xsna.o2f0;
import xsna.ocg;
import xsna.omw;
import xsna.p2f0;
import xsna.p4r;
import xsna.p6s;
import xsna.pvo0;
import xsna.q6s;
import xsna.qcy;
import xsna.rp6;
import xsna.rv0;
import xsna.s1c0;
import xsna.s1m;
import xsna.s3q0;
import xsna.s6o;
import xsna.s980;
import xsna.tbh;
import xsna.tni;
import xsna.u1c0;
import xsna.u3k;
import xsna.u5f0;
import xsna.uj;
import xsna.uqm0;
import xsna.v5f0;
import xsna.w11;
import xsna.w8i;
import xsna.w8q;
import xsna.wqf;
import xsna.wsx0;
import xsna.x84;
import xsna.xo9;
import xsna.y2c0;
import xsna.z0h;

/* compiled from: FilledFooterHolder.kt */
/* loaded from: classes4.dex */
public class a extends rp6<q6s, NewsEntry> implements View.OnClickListener, View.OnAttachStateChangeListener, p2f0, i7o, uj, w8i {
    public static final /* synthetic */ int C0 = 0;
    public final Object A0;
    public final bpn0 B0;
    public final h3f0 E;
    public final int F;
    public final h170 G;
    public String H;
    public final Object I;
    public final Object J;
    public final ViewGroup K;
    public final FeedReactionsStack L;
    public final TextView M;
    public final View N;
    public final FooterButton O;
    public final VKImageView P;
    public final FeedAnimatedView Q;
    public final TextView R;
    public final View S;
    public final TextView T;
    public final View U;
    public final ImageView V;
    public final TextView W;
    public final View X;
    public final DonutReactionButtonView Y;
    public final View Z;
    public final TextView a0;
    public final View b0;
    public final TextView c0;
    public final View d0;
    public final LinearLayout e0;
    public final PhotoStackView f0;
    public final TextView g0;
    public final AppCompatTextView h0;
    public final View i0;
    public final ImageView j0;
    public final com.vk.newsfeed.common.helpers.a k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;
    public final Object p0;
    public final y2c0 q0;
    public final huu0 r0;
    public p6s s0;
    public final Object t0;
    public final Object u0;
    public final int v0;
    public final Object w0;
    public final Object x0;
    public final C1371a y0;
    public final b z0;

    /* compiled from: FilledFooterHolder.kt */
    /* renamed from: com.vk.newsfeed.common.recycler.holders.a$a, reason: collision with other inner class name */
    public static final class C1371a extends hk {
        public C1371a() {
        }

        @Override // xsna.hk
        public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            amVar.a.setLongClickable(true);
            amVar.b(new am.a(32, a.this.v6(R.string.accessibility_reaction_select)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.hk
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            ?? q6;
            c6z Q;
            if (i != 32) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            a aVar = a.this;
            View view2 = aVar.N;
            if (aVar.G.g() || (q6 = aVar.q6()) == 0 || (Q = di60.Q(q6)) == null) {
                return true;
            }
            h3f0 h3f0Var = aVar.E;
            Rect d = w11.d(view2);
            s3q0 s3q0Var = s3q0.a;
            h3f0Var.a(view2, d, aVar, Q, q6, aVar.u);
            return true;
        }

        @Override // xsna.hk
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            View view2 = a.this.N;
            if (accessibilityEvent.getEventType() == 128 && !view2.isSelected()) {
                iut0.t(view2, null);
            }
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* compiled from: FilledFooterHolder.kt */
    public static final class b extends hk {
        public b() {
        }

        @Override // xsna.hk
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            View view2 = a.this.N;
            if (accessibilityEvent.getEventType() == 128 && !view2.isSelected()) {
                iut0.t(view2, null);
            }
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public a(ViewGroup viewGroup, h3f0 h3f0Var, int i, h170 h170Var) {
        super(i, viewGroup);
        this.E = h3f0Var;
        this.F = i;
        this.G = h170Var;
        x84 x84Var = new x84(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I = msy.a(lazyThreadSafetyMode, x84Var);
        Lazy a = msy.a(lazyThreadSafetyMode, new ocg(this, 19));
        this.J = a;
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.footer_view_stub);
        viewStub.setLayoutResource(R.layout.feed_footer);
        this.K = (ViewGroup) viewStub.inflate();
        this.L = (FeedReactionsStack) this.itemView.findViewById(R.id.wall_view_reactions_stack);
        TextView textView = (TextView) this.itemView.findViewById(R.id.empty_reactions_text_view);
        this.M = textView;
        View findViewById = this.itemView.findViewById(R.id.likes);
        this.N = findViewById;
        FooterButton footerButton = (FooterButton) this.itemView.findViewById(R.id.likes_wrapper);
        this.O = footerButton;
        this.P = (VKImageView) this.itemView.findViewById(R.id.iv_likes);
        FeedAnimatedView feedAnimatedView = (FeedAnimatedView) this.itemView.findViewById(R.id.footer_reaction);
        this.Q = feedAnimatedView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.tv_likes);
        this.R = textView2;
        View findViewById2 = this.itemView.findViewById(R.id.comments_wrapper);
        this.S = findViewById2;
        FooterButton footerButton2 = (FooterButton) this.itemView.findViewById(R.id.fb_comments);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_comments);
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.comments);
        this.T = textView3;
        View findViewById3 = this.itemView.findViewById(R.id.shares_wrapper);
        this.U = findViewById3;
        FooterButton footerButton3 = (FooterButton) this.itemView.findViewById(R.id.fb_shares);
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.shares_icon);
        this.V = imageView2;
        TextView textView4 = (TextView) this.itemView.findViewById(R.id.shares);
        this.W = textView4;
        this.X = this.itemView.findViewById(R.id.donut_reaction_wrapper);
        this.Y = (DonutReactionButtonView) this.itemView.findViewById(R.id.donut_reaction);
        View findViewById4 = this.itemView.findViewById(R.id.views_wrapper);
        this.Z = findViewById4;
        this.a0 = (TextView) this.itemView.findViewById(R.id.views);
        ImageView imageView3 = (ImageView) this.itemView.findViewById(R.id.iv_views);
        View findViewById5 = this.itemView.findViewById(R.id.date_wrapper);
        this.b0 = findViewById5;
        this.c0 = (TextView) this.itemView.findViewById(R.id.date);
        View findViewById6 = this.itemView.findViewById(R.id.badges_wrapper);
        this.d0 = findViewById6;
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.badges_counter_wrapper);
        this.e0 = linearLayout;
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.badges_stack);
        this.f0 = photoStackView;
        TextView textView5 = (TextView) this.itemView.findViewById(R.id.badges_counter);
        this.g0 = textView5;
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.badges_send_text_view);
        this.h0 = appCompatTextView;
        View findViewById7 = this.itemView.findViewById(R.id.add_wrapper);
        this.i0 = findViewById7;
        this.j0 = (ImageView) this.itemView.findViewById(R.id.add);
        this.k0 = new com.vk.newsfeed.common.helpers.a(this.itemView.getContext());
        this.l0 = msy.a(lazyThreadSafetyMode, new tbh(this, 17));
        this.m0 = msy.a(lazyThreadSafetyMode, new s1m(this, 11));
        this.n0 = msy.a(lazyThreadSafetyMode, new mxj(this, 15));
        this.o0 = msy.a(lazyThreadSafetyMode, new gbj(this, 11));
        this.p0 = msy.a(lazyThreadSafetyMode, new u3k(this, 9));
        this.q0 = new y2c0(h170Var.b());
        this.r0 = new huu0();
        this.t0 = msy.a(lazyThreadSafetyMode, new w8q(this, 3));
        this.u0 = msy.a(lazyThreadSafetyMode, new n5i(this, 12));
        this.v0 = R.drawable.vk_icon_donut_outline_20;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new jcg(this, 17));
        this.w0 = a2;
        this.x0 = msy.a(lazyThreadSafetyMode, new dof(this, 22));
        this.y0 = new C1371a();
        this.z0 = new b();
        this.A0 = msy.a(lazyThreadSafetyMode, new b1h(this, 13));
        this.B0 = new bpn0(new ncg(this, 20));
        findViewById.setOnTouchListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        findViewById7.setOnClickListener(this);
        this.itemView.addOnAttachStateChangeListener(this);
        linearLayout.setOnClickListener(this);
        linearLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.bcr
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return com.vk.newsfeed.common.recycler.holders.a.this.s7();
            }
        });
        appCompatTextView.setOnClickListener(this);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        findViewById5.setOnClickListener(this);
        N7(cn70.b(4));
        g9p0 k7 = k7();
        if (k7 != null) {
            k7.b.setOnStackClickListener(new bc(k7, 9));
        }
        ViewGroup.LayoutParams layoutParams = feedAnimatedView.getLayoutParams();
        FooterButton.a aVar = layoutParams instanceof FooterButton.a ? (FooterButton.a) layoutParams : null;
        if (aVar != null) {
            aVar.c = true;
            ((ViewGroup.MarginLayoutParams) aVar).height = cn70.b(24);
            ((ViewGroup.MarginLayoutParams) aVar).width = cn70.b(24);
        }
        photoStackView.setDrawBackgrounds(false);
        photoStackView.v(18.0f, 2.0f, 16);
        photoStackView.setCount(3);
        jno0.c(textView5, R.attr.vk_ui_text_secondary);
        int b2 = cn70.b(16);
        if (photoStackView.getHeight() != b2) {
            ViewGroup.LayoutParams layoutParams2 = photoStackView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = b2;
            }
            photoStackView.requestLayout();
        }
        int b3 = cn70.b(6);
        int b4 = cn70.b(4);
        int b5 = cn70.b(0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        findViewById.setPaddingRelative(0, b3, b5, b4);
        findViewById2.setPaddingRelative(cn70.b(0), cn70.b(6), cn70.b(0), cn70.b(4));
        findViewById3.setPaddingRelative(cn70.b(0), cn70.b(6), cn70.b(0), cn70.b(4));
        f4m.B(cn70.b(6), cn70.b(8), findViewById4);
        f4m.B(cn70.b(8), cn70.b(8), findViewById5);
        linearLayout.setPaddingRelative(cn70.b(0), cn70.b(4), cn70.b(0), cn70.b(4));
        f4m.r(cn70.b(8), photoStackView);
        textView5.setIncludeFontPadding(false);
        f4m.m(8388629, findViewById6);
        f4m.v(cn70.b(2), findViewById6);
        f4m.r(((Number) a2.getValue()).intValue(), findViewById6);
        f4m.r(cn70.b(0), appCompatTextView);
        View view = (View) a.getValue();
        if (view != null) {
            bwt0.c0(-2, view);
        }
        P7(cn70.b(8));
        N7(cn70.b(4));
        getContext();
        gko.b bVar = gko.Companion;
        imageView.setImageDrawable(gko.b(R.drawable.vk_icon_comment_outline_24, this.itemView.getContext()));
        imageView2.setImageDrawable(gko.b(R.drawable.vk_icon_share_outline_24, this.itemView.getContext()));
        imageView3.setImageDrawable(gko.b(R.drawable.vk_icon_view_12, this.itemView.getContext()));
        getContext();
        jno0.c(textView2, R.attr.vk_ui_text_primary);
        jno0.c(textView3, R.attr.vk_ui_text_primary);
        jno0.c(textView4, R.attr.vk_ui_text_primary);
        omw.b(imageView2, R.attr.vk_ui_icon_primary);
        omw.b(imageView, R.attr.vk_ui_icon_primary);
        footerButton.setBackground(null);
        footerButton2.setBackground(null);
        footerButton3.setBackground(null);
    }

    public static void K7(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FluidHorizontalLayout.a aVar = layoutParams instanceof FluidHorizontalLayout.a ? (FluidHorizontalLayout.a) layoutParams : null;
        if (aVar == null || aVar.a == z) {
            return;
        }
        aVar.a = z;
        view.requestLayout();
        view.invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C7(q6s q6sVar) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        ReactionMeta reactionMeta;
        h170 h170Var;
        boolean z3;
        boolean z4;
        View view;
        TextView textView;
        String str;
        ReactionMeta reactionMeta2;
        String str2;
        int i3;
        String str3;
        ImageSize Ab;
        boolean z5 = q6sVar.L;
        int i4 = q6sVar.q;
        boolean z6 = q6sVar.R;
        int i5 = q6sVar.U;
        boolean z7 = q6sVar.W;
        boolean z8 = q6sVar.h;
        int i6 = q6sVar.o;
        ReactionMeta reactionMeta3 = q6sVar.k;
        boolean z9 = q6sVar.N;
        h170 h170Var2 = this.G;
        b bVar = this.z0;
        FooterButton footerButton = this.O;
        TextView textView2 = this.M;
        View view2 = this.N;
        if (z5) {
            p6s p6sVar = this.s0;
            view2.setSelected(q6sVar.j);
            boolean z10 = p6sVar != null;
            if (reactionMeta3 == null) {
                h7().c();
                M7();
                footerButton.setBackgroundTintList(null);
            } else if (reactionMeta3.g()) {
                M7();
                h7().h = z10;
                h7().a(q6sVar, reactionMeta3);
            } else {
                h7().h = false;
                h7().a(q6sVar, reactionMeta3);
                String str4 = q6sVar.l;
                VKImageView vKImageView = this.P;
                vKImageView.load(str4);
                int b2 = an10.b(cn70.a() * 1.0f);
                vKImageView.setPadding(b2, b2, b2, b2);
            }
            if (textView2 != null) {
                bwt0.p0(textView2, z9);
            }
            if (i7()) {
                ViewParent parent = this.itemView.getParent();
                RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                g9p0 k7 = k7();
                if (k7 != null) {
                    z2 = z7;
                    FeedReactionsStack feedReactionsStack = k7.b;
                    h170Var = h170Var2;
                    q6s q6sVar2 = k7.f;
                    i = i4;
                    Boolean bool = k7.g;
                    k7.f = q6sVar;
                    int i7 = q6sVar.p;
                    List<ReactionMeta> list = q6sVar.n;
                    List<ReactionMeta> list2 = list;
                    boolean z11 = list2 == null || list2.isEmpty();
                    if (list2 == null || list2.isEmpty()) {
                        z = z6;
                        i2 = i5;
                        reactionMeta = reactionMeta3;
                    } else {
                        List<ReactionMeta> list3 = list;
                        reactionMeta = reactionMeta3;
                        z = z6;
                        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ReactionMeta reactionMeta4 = (ReactionMeta) it.next();
                            Iterator it2 = it;
                            int i8 = g9p0.j;
                            ReactionAsset d = reactionMeta4.d();
                            if (d != null) {
                                Image image = d.c;
                                i3 = i5;
                                if (image != null && (Ab = image.Ab(i8, false)) != null) {
                                    str3 = Ab.d.d;
                                    if (str3 != null) {
                                        str3 = "";
                                    }
                                    arrayList.add(str3);
                                    it = it2;
                                    i5 = i3;
                                }
                            } else {
                                i3 = i5;
                            }
                            str3 = null;
                            if (str3 != null) {
                            }
                            arrayList.add(str3);
                            it = it2;
                            i5 = i3;
                        }
                        i2 = i5;
                        feedReactionsStack.setReactionsUrl(arrayList);
                        if (i7 > 0) {
                            k7.a(i6);
                        } else {
                            feedReactionsStack.setStackContentDescription(null);
                            feedReactionsStack.setText(null);
                        }
                    }
                    if (z11) {
                        feedReactionsStack.setImportantForAccessibility(2);
                        c6z c6zVar = k7.e;
                        Boolean bool2 = k7.g;
                        k7.f = q6sVar;
                        boolean hideAnimatorSetRunning = feedReactionsStack.getHideAnimatorSetRunning();
                        if (k7.d && epx.f(c6zVar, k7.e) && bool2 != null && bool2.booleanValue()) {
                            k7.g = Boolean.FALSE;
                            k7.h = k7.e;
                            k7.i = k7.f;
                            k7.d = false;
                            feedReactionsStack.i(recyclerView);
                        } else if ((!k7.d && epx.f(c6zVar, k7.e) && bool2 != null && bool2.booleanValue()) || !epx.f(k7.h, k7.e) || !hideAnimatorSetRunning || bool2 == null) {
                            k7.b();
                        }
                    } else {
                        boolean showAnimatorSetRunning = feedReactionsStack.getShowAnimatorSetRunning();
                        if (k7.d && epx.f(q6sVar2, q6sVar) && bool != null && !bool.booleanValue()) {
                            k7.h = k7.e;
                            k7.i = k7.f;
                            k7.g = Boolean.TRUE;
                            k7.d = false;
                            feedReactionsStack.j(recyclerView);
                        } else if ((!k7.d && epx.f(q6sVar2, q6sVar) && bool != null && !bool.booleanValue()) || !epx.f(k7.i, q6sVar) || !showAnimatorSetRunning || bool == null) {
                            k7.d();
                        }
                    }
                } else {
                    i = i4;
                    z = z6;
                    i2 = i5;
                    z2 = z7;
                    reactionMeta = reactionMeta3;
                    h170Var = h170Var2;
                }
            } else {
                i = i4;
                z = z6;
                i2 = i5;
                z2 = z7;
                reactionMeta = reactionMeta3;
                h170Var = h170Var2;
                FeedReactionsStack feedReactionsStack2 = this.L;
                if (feedReactionsStack2 != null) {
                    bwt0.p0(feedReactionsStack2, false);
                }
            }
            if (textView2 != null) {
                bwt0.p0(textView2, z9);
            }
            if (h170Var.g()) {
                iut0.q(view2, bVar);
            } else {
                iut0.q(view2, this.y0);
            }
        } else {
            i = i4;
            z = z6;
            i2 = i5;
            z2 = z7;
            reactionMeta = reactionMeta3;
            h170Var = h170Var2;
            view2.setSelected(z8);
            M7();
            footerButton.setBackgroundTintList(null);
            if (textView2 != null) {
                bwt0.p0(textView2, z9);
            }
            p7();
            iut0.q(view2, bVar);
        }
        boolean b3 = h170Var.b();
        LinearLayout linearLayout = this.e0;
        View view3 = this.d0;
        View view4 = this.X;
        if (b3) {
            o7();
            if (q6sVar.X) {
                Integer valueOf = z2 ? Integer.valueOf(i2) : null;
                DonutReactionButtonView donutReactionButtonView = this.Y;
                donutReactionButtonView.setCount(valueOf);
                donutReactionButtonView.setOnClickListener(new g4g(this, 17));
                donutReactionButtonView.setOnLongClickListener(new z0h(this, 12));
                bwt0.p0(view4, true);
            } else {
                bwt0.p0(view4, false);
            }
            z3 = z;
        } else if (j7()) {
            bwt0.p0(view4, false);
            if (z2) {
                s1c0 s1c0Var = this.x;
                this.g0.setText(s6((s1c0Var == null || s1c0Var.k) ? R.plurals.newposter_ndonuts_send : R.plurals.n_donuts_gifted, i2, Integer.valueOf(i2)));
                ?? r2 = this.u0;
                Drawable drawable = (Drawable) r2.getValue();
                PhotoStackView photoStackView = this.f0;
                if (drawable == null || !q6sVar.c0) {
                    List<String> list4 = dhr0.M() ? q6sVar.a0 : q6sVar.b0;
                    PhotoStackView.b bVar2 = PhotoStackView.M;
                    photoStackView.r(-1, list4);
                } else {
                    photoStackView.setCount(1);
                    photoStackView.j((Drawable) r2.getValue(), 0);
                }
            }
            gko.b bVar3 = gko.Companion;
            Drawable b4 = gko.b(this.v0, this.itemView.getContext());
            AppCompatTextView appCompatTextView = this.h0;
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(b4, (Drawable) null, (Drawable) null, (Drawable) null);
            appCompatTextView.setText(this.itemView.getContext().getString(R.string.newsfeed_send_donut));
            bwt0.p0(appCompatTextView, q6sVar.T);
            if (textView2 != null) {
                textView2.setText(!z2 ? R.string.reactions_empty : o25.a().o().d == UserSex.FEMALE ? R.string.reactions_empty_rate_first_w : R.string.reactions_empty_rate_first);
            }
            if (textView2 != null) {
                bwt0.p0(textView2, z9);
            }
            z3 = z;
            bwt0.p0(view3, z3);
            bwt0.p0(linearLayout, q6sVar.S);
        } else {
            z3 = z;
            bwt0.p0(view4, false);
            o7();
        }
        int i9 = q6sVar.r;
        int i10 = q6sVar.s;
        int i11 = q6sVar.t;
        int i12 = q6sVar.u;
        int i13 = q6sVar.d0;
        if (q6sVar.O) {
            String title = reactionMeta != null ? reactionMeta.getTitle() : null;
            getContext();
            int b5 = cn70.b(8);
            int b6 = cn70.b(9);
            boolean i72 = i7();
            z4 = z3;
            ?? r22 = this.t0;
            FooterButton footerButton2 = this.O;
            TextView textView3 = this.R;
            if (i72) {
                view = view3;
                textView = textView2;
                reactionMeta2 = reactionMeta;
                K7(view2, true);
                xo9.z(textView3, reactionMeta2, (ColorStateList) r22.getValue());
                xo9.A(textView3, title);
                bwt0.t0(footerButton2, b5, 0, b5, 0, 10);
            } else {
                K7(view2, false);
                bwt0.p0(textView3, true);
                if (i6 != 0) {
                    view = view3;
                    if (iah0.f().widthPixels < 768) {
                        textView = textView2;
                        str2 = uqm0.o(i6);
                    } else {
                        textView = textView2;
                        str2 = uqm0.f(i6);
                    }
                } else {
                    view = view3;
                    textView = textView2;
                    str2 = null;
                }
                reactionMeta2 = reactionMeta;
                xo9.z(textView3, reactionMeta2, (ColorStateList) r22.getValue());
                xo9.A(textView3, str2);
                bwt0.t0(footerButton2, b5, 0, b6, 0, 10);
            }
            str = null;
            footerButton2.setBackgroundTintList(null);
            view2.setContentDescription(f7(title, reactionMeta2, i));
        } else {
            z4 = z3;
            view = view3;
            textView = textView2;
            int i14 = i;
            str = null;
            if (i14 > 0) {
                c7(i14, z8);
            } else {
                b7();
            }
        }
        CharSequence charSequence = q6sVar.w;
        TextView textView4 = this.T;
        textView4.setText(charSequence);
        CharSequence charSequence2 = q6sVar.x;
        TextView textView5 = this.W;
        textView5.setText(charSequence2);
        this.a0.setText(q6sVar.y);
        this.c0.setText(i13 > 0 ? this.q0.a(i13) : str);
        String s6 = i9 > 0 ? s6(R.plurals.accessibility_comments_count, i9, Integer.valueOf(i9)) : v6(R.string.accessibility_add_comment);
        View view5 = this.S;
        view5.setContentDescription(s6);
        String s62 = i10 > 0 ? s6(R.plurals.accessibility_reposts, i10, Integer.valueOf(i10)) : v6(R.string.accessibility_share);
        View view6 = this.U;
        view6.setContentDescription(s62);
        String s63 = i11 > 0 ? s6(R.plurals.accessibility_views, i11, Integer.valueOf(i11)) : str;
        View view7 = this.Z;
        view7.setContentDescription(s63);
        String i15 = i13 > 0 ? pvo0.i(false, i13, false, false) : str;
        View view8 = this.b0;
        view8.setContentDescription(i15);
        linearLayout.setContentDescription(i12 > 0 ? s6(R.plurals.accessibility_badges, i12, Integer.valueOf(i12)) : str);
        bwt0.p0(textView4, q6sVar.E);
        bwt0.p0(textView5, q6sVar.G);
        if (textView != null) {
            bwt0.p0(textView, z9);
        }
        bwt0.p0(view6, q6sVar.H);
        bwt0.p0(view5, q6sVar.D);
        bwt0.p0(view7, q6sVar.J);
        bwt0.p0(view8, q6sVar.K);
        bwt0.p0(this.i0, false);
        bwt0.p0(view, h170Var.b() ? false : z4);
    }

    @Override // xsna.uj
    public final void E(String str) {
        this.H = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x0797, code lost:
    
        if (r2 == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07ba, code lost:
    
        if (((r3 == null || r3.gc() != r15) ? false : r15) == false) goto L533;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0730 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x074b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181  */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E7(c6z c6zVar) {
        o2f0 o2f0Var;
        boolean b2;
        int i;
        boolean z;
        boolean z2;
        int T9;
        int E1;
        int i7;
        int w0;
        Badgeable badgeable;
        int e7;
        LinearLayout linearLayout;
        View view;
        h170 h170Var;
        boolean z3;
        String str;
        int i2;
        String str2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        ItemReactions K;
        String str3;
        Lazy lazy;
        String str4;
        BadgesSet u0;
        boolean z12;
        s1c0 s1c0Var;
        boolean z13;
        ArrayList<ReactionMeta> O8;
        boolean z14;
        Boolean bool;
        Iterator it;
        String str5;
        ImageSize Ab;
        ItemReactions K2;
        ItemReactions K3;
        boolean z15 = c6zVar instanceof o2f0;
        o2f0 o2f0Var2 = z15 ? (o2f0) c6zVar : null;
        View view2 = this.N;
        h170 h170Var2 = this.G;
        TextView textView = this.M;
        b bVar = this.z0;
        FooterButton footerButton = this.O;
        if (o2f0Var2 != null) {
            if (di60.I(c6zVar instanceof NewsEntry ? (NewsEntry) c6zVar : null)) {
                p6s p6sVar = this.s0;
                view2.setSelected(o2f0Var2.G4());
                boolean z16 = p6sVar != null;
                ReactionMeta p4 = h170Var2.g() ? o2f0Var2.p4() : o2f0Var2.c8();
                if (p4 == null) {
                    h7().c();
                    M7();
                    footerButton.setBackgroundTintList(null);
                } else if (p4.g()) {
                    M7();
                    h7().h = z16;
                    h7().b(o2f0Var2, p4);
                } else {
                    h7().h = false;
                    h7().b(o2f0Var2, p4);
                    String e = p4.e(cn70.b(24));
                    VKImageView vKImageView = this.P;
                    vKImageView.load(e);
                    int b3 = an10.b(cn70.a() * 1.0f);
                    vKImageView.setPadding(b3, b3, b3, b3);
                }
                if (textView != null) {
                    ItemReactions K4 = o2f0Var2.K();
                    bwt0.p0(textView, (K4 != null ? K4.c : 0) == 0 && j7());
                }
                if (i7()) {
                    ViewParent parent = this.itemView.getParent();
                    RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
                    g9p0 k7 = k7();
                    if (k7 != null) {
                        FeedReactionsStack feedReactionsStack = k7.b;
                        c6z c6zVar2 = k7.e;
                        Boolean bool2 = k7.g;
                        k7.e = c6zVar;
                        o2f0 o2f0Var3 = z15 ? (o2f0) c6zVar : null;
                        int i3 = (o2f0Var3 == null || (K3 = o2f0Var3.K()) == null) ? 0 : K3.c;
                        if (k7.c.g()) {
                            if (o2f0Var3 != null) {
                                O8 = o2f0Var3.v8();
                                z14 = O8 != null || O8.isEmpty();
                                if (O8 != null || O8.isEmpty()) {
                                    bool = bool2;
                                    o2f0Var = o2f0Var2;
                                } else {
                                    int i4 = (o2f0Var3 == null || (K2 = o2f0Var3.K()) == null) ? 0 : K2.d;
                                    bool = bool2;
                                    o2f0Var = o2f0Var2;
                                    ArrayList arrayList = new ArrayList(c5g.u(O8, 10));
                                    Iterator it2 = O8.iterator();
                                    while (it2.hasNext()) {
                                        ReactionMeta reactionMeta = (ReactionMeta) it2.next();
                                        int i5 = g9p0.j;
                                        ReactionAsset d = reactionMeta.d();
                                        if (d != null) {
                                            Image image = d.c;
                                            it = it2;
                                            if (image != null && (Ab = image.Ab(i5, false)) != null) {
                                                str5 = Ab.d.d;
                                                if (str5 != null) {
                                                    str5 = "";
                                                }
                                                arrayList.add(str5);
                                                it2 = it;
                                            }
                                        } else {
                                            it = it2;
                                        }
                                        str5 = null;
                                        if (str5 != null) {
                                        }
                                        arrayList.add(str5);
                                        it2 = it;
                                    }
                                    feedReactionsStack.setReactionsUrl(arrayList);
                                    if (i3 > 0) {
                                        k7.a(i4);
                                    } else {
                                        feedReactionsStack.setStackContentDescription(null);
                                        feedReactionsStack.setText(null);
                                    }
                                }
                                if (z14) {
                                    boolean showAnimatorSetRunning = feedReactionsStack.getShowAnimatorSetRunning();
                                    if (k7.d && c6zVar2 == c6zVar && bool != null && !bool.booleanValue()) {
                                        k7.h = k7.e;
                                        k7.i = k7.f;
                                        k7.g = Boolean.TRUE;
                                        k7.d = false;
                                        feedReactionsStack.j(recyclerView);
                                    } else if ((!k7.d && c6zVar2 == c6zVar && bool != null && !bool.booleanValue()) || k7.h != c6zVar || !showAnimatorSetRunning || bool == null) {
                                        k7.d();
                                    }
                                } else {
                                    feedReactionsStack.setImportantForAccessibility(2);
                                    c6z c6zVar3 = k7.e;
                                    Boolean bool3 = k7.g;
                                    k7.e = c6zVar;
                                    boolean hideAnimatorSetRunning = feedReactionsStack.getHideAnimatorSetRunning();
                                    if (k7.d && c6zVar3 == k7.e && bool3 != null && bool3.booleanValue()) {
                                        k7.g = Boolean.FALSE;
                                        k7.h = k7.e;
                                        k7.i = k7.f;
                                        k7.d = false;
                                        feedReactionsStack.i(recyclerView);
                                    } else if ((!k7.d && c6zVar3 == k7.e && bool3 != null && bool3.booleanValue()) || k7.h != k7.e || !hideAnimatorSetRunning || bool3 == null) {
                                        k7.b();
                                    }
                                }
                            }
                            O8 = null;
                            if (O8 != null) {
                            }
                            if (O8 != null) {
                            }
                            bool = bool2;
                            o2f0Var = o2f0Var2;
                            if (z14) {
                            }
                        } else {
                            if (o2f0Var3 != null) {
                                O8 = o2f0Var3.O8(3);
                                if (O8 != null) {
                                }
                                if (O8 != null) {
                                }
                                bool = bool2;
                                o2f0Var = o2f0Var2;
                                if (z14) {
                                }
                            }
                            O8 = null;
                            if (O8 != null) {
                            }
                            if (O8 != null) {
                            }
                            bool = bool2;
                            o2f0Var = o2f0Var2;
                            if (z14) {
                            }
                        }
                        b2 = h170Var2.b();
                        LinearLayout linearLayout2 = this.e0;
                        View view3 = this.d0;
                        View view4 = this.X;
                        if (b2) {
                            i = -1;
                            o7();
                            boolean z17 = c6zVar instanceof Badgeable;
                            Badgeable badgeable2 = z17 ? (Badgeable) c6zVar : null;
                            BadgesSet u02 = badgeable2 != null ? badgeable2.u0() : null;
                            boolean z18 = (u02 == null || u02.e.isEmpty() || u02.f <= 0) ? false : true;
                            Badgeable badgeable3 = z17 ? (Badgeable) c6zVar : null;
                            if (badgeable3 != null) {
                                z = true;
                                if ((badgeable3.u0() == null || badgeable3.ca() == null) ? false : true) {
                                    z2 = true;
                                    NewsEntry newsEntry = !(c6zVar instanceof NewsEntry) ? (NewsEntry) c6zVar : null;
                                    boolean z19 = newsEntry == null && di60.B(newsEntry) == z;
                                    if ((!z18 || z2) && !z19) {
                                        Integer valueOf = !z18 ? Integer.valueOf(u02.f) : null;
                                        DonutReactionButtonView donutReactionButtonView = this.Y;
                                        donutReactionButtonView.setCount(valueOf);
                                        donutReactionButtonView.setOnClickListener(new btm(this, 5));
                                        donutReactionButtonView.setOnLongClickListener(new drg(this, 15));
                                        bwt0.p0(view4, true);
                                    } else {
                                        bwt0.p0(view4, false);
                                    }
                                }
                            } else {
                                z = true;
                            }
                            z2 = false;
                            if (!(c6zVar instanceof NewsEntry)) {
                            }
                            if (newsEntry == null) {
                            }
                            if (z18) {
                            }
                            if (!z18) {
                            }
                            DonutReactionButtonView donutReactionButtonView2 = this.Y;
                            donutReactionButtonView2.setCount(valueOf);
                            donutReactionButtonView2.setOnClickListener(new btm(this, 5));
                            donutReactionButtonView2.setOnLongClickListener(new drg(this, 15));
                            bwt0.p0(view4, true);
                        } else if (j7()) {
                            bwt0.p0(view4, false);
                            boolean z20 = c6zVar instanceof Badgeable;
                            Badgeable badgeable4 = z20 ? (Badgeable) c6zVar : null;
                            BadgesSet u03 = badgeable4 != null ? badgeable4.u0() : null;
                            boolean z21 = (u03 == null || u03.e.isEmpty() || u03.f <= 0) ? false : true;
                            if (z21 && u03 != null) {
                                List<BadgePostItem> list = u03.e;
                                s1c0 s1c0Var2 = this.x;
                                int i6 = (s1c0Var2 == null || s1c0Var2.k) ? R.plurals.newposter_ndonuts_send : R.plurals.n_donuts_gifted;
                                int i8 = u03.f;
                                this.g0.setText(s6(i6, i8, Integer.valueOf(i8)));
                                ?? r12 = this.u0;
                                Drawable drawable = (Drawable) r12.getValue();
                                PhotoStackView photoStackView = this.f0;
                                if (drawable != null && list.size() == 1 && ((BadgePostItem) j5g.Y(list)).b.b == 38) {
                                    photoStackView.setCount(1);
                                    photoStackView.j((Drawable) r12.getValue(), 0);
                                } else {
                                    boolean M = dhr0.M();
                                    int b4 = cn70.b(16);
                                    List H0 = j5g.H0(list, 3);
                                    ArrayList arrayList2 = new ArrayList(c5g.u(H0, 10));
                                    Iterator it3 = H0.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(((BadgePostItem) it3.next()).b.e.a(b4, M));
                                    }
                                    PhotoStackView.b bVar2 = PhotoStackView.M;
                                    i = -1;
                                    photoStackView.r(-1, arrayList2);
                                    gko.b bVar3 = gko.Companion;
                                    Drawable b5 = gko.b(this.v0, this.itemView.getContext());
                                    AppCompatTextView appCompatTextView = this.h0;
                                    appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, (Drawable) null, (Drawable) null, (Drawable) null);
                                    appCompatTextView.setText(this.itemView.getContext().getString(R.string.newsfeed_send_donut));
                                    if (!z21) {
                                        Badgeable badgeable5 = z20 ? (Badgeable) c6zVar : null;
                                        if ((badgeable5 != null ? badgeable5.ca() : null) != null && (s1c0Var = this.x) != null && s1c0Var.k) {
                                            z12 = true;
                                            bwt0.p0(appCompatTextView, z12);
                                            if (textView != null) {
                                                textView.setText(!z21 ? R.string.reactions_empty : o25.a().o().d == UserSex.FEMALE ? R.string.reactions_empty_rate_first_w : R.string.reactions_empty_rate_first);
                                            }
                                            if (textView != null) {
                                                bwt0.p0(textView, c6zVar.T9() == 0);
                                            }
                                            bwt0.p0(view3, (u03 != null ? u03.f : 0) <= 0 || this.F != R.layout.news_item_footer);
                                            bwt0.p0(linearLayout2, z21);
                                        }
                                    }
                                    z12 = false;
                                    bwt0.p0(appCompatTextView, z12);
                                    if (textView != null) {
                                    }
                                    if (textView != null) {
                                    }
                                    bwt0.p0(view3, (u03 != null ? u03.f : 0) <= 0 || this.F != R.layout.news_item_footer);
                                    bwt0.p0(linearLayout2, z21);
                                }
                            }
                            i = -1;
                            gko.b bVar32 = gko.Companion;
                            Drawable b52 = gko.b(this.v0, this.itemView.getContext());
                            AppCompatTextView appCompatTextView2 = this.h0;
                            appCompatTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(b52, (Drawable) null, (Drawable) null, (Drawable) null);
                            appCompatTextView2.setText(this.itemView.getContext().getString(R.string.newsfeed_send_donut));
                            if (!z21) {
                            }
                            z12 = false;
                            bwt0.p0(appCompatTextView2, z12);
                            if (textView != null) {
                            }
                            if (textView != null) {
                            }
                            bwt0.p0(view3, (u03 != null ? u03.f : 0) <= 0 || this.F != R.layout.news_item_footer);
                            bwt0.p0(linearLayout2, z21);
                        } else {
                            i = -1;
                            bwt0.p0(view4, false);
                            o7();
                        }
                        T9 = c6zVar.T9();
                        E1 = c6zVar.E1();
                        i7 = c6zVar.i7();
                        w0 = c6zVar.w0();
                        boolean z22 = c6zVar instanceof Badgeable;
                        badgeable = z22 ? (Badgeable) c6zVar : null;
                        if (badgeable != null && (u0 = badgeable.u0()) != null) {
                            i = u0.f;
                        }
                        boolean z23 = c6zVar instanceof NewsEntry;
                        e7 = e7(z23 ? (NewsEntry) c6zVar : null);
                        if (o2f0Var != null) {
                            if (di60.I(z23 ? (NewsEntry) c6zVar : null)) {
                                ReactionMeta p42 = h170Var2.g() ? o2f0Var.p4() : o2f0Var.c8();
                                ReactionMeta R3 = o2f0Var.R3();
                                String title = p42 != null ? p42.getTitle() : null;
                                String title2 = R3 != null ? R3.getTitle() : null;
                                getContext();
                                int b6 = cn70.b(8);
                                int b7 = cn70.b(9);
                                boolean i72 = i7();
                                ?? r15 = this.t0;
                                h170Var = h170Var2;
                                FooterButton footerButton2 = this.O;
                                TextView textView2 = this.R;
                                if (i72) {
                                    view = view3;
                                    z3 = z22;
                                    linearLayout = linearLayout2;
                                    K7(view2, true);
                                    xo9.z(textView2, p42, (ColorStateList) r15.getValue());
                                    str3 = title;
                                    xo9.A(textView2, str3 == null ? title2 : str3);
                                    bwt0.t0(footerButton2, b6, 0, b6, 0, 10);
                                } else {
                                    z3 = z22;
                                    K7(view2, false);
                                    bwt0.p0(textView2, true);
                                    ItemReactions K5 = o2f0Var.K();
                                    int i9 = K5 != null ? K5.d : 0;
                                    if (i9 != 0) {
                                        lazy = r15;
                                        view = view3;
                                        if (iah0.f().widthPixels < 768) {
                                            linearLayout = linearLayout2;
                                            str4 = uqm0.o(i9);
                                        } else {
                                            linearLayout = linearLayout2;
                                            str4 = uqm0.f(i9);
                                        }
                                    } else {
                                        view = view3;
                                        lazy = r15;
                                        linearLayout = linearLayout2;
                                        str4 = null;
                                    }
                                    xo9.z(textView2, p42, (ColorStateList) lazy.getValue());
                                    xo9.A(textView2, str4);
                                    bwt0.t0(footerButton2, b6, 0, b7, 0, 10);
                                    str3 = title;
                                }
                                str = null;
                                footerButton2.setBackgroundTintList(null);
                                view2.setContentDescription(f7(str3, p42, T9));
                                String o = E1 <= 0 ? iah0.f().widthPixels < 768 ? uqm0.o(E1) : uqm0.f(E1) : str;
                                TextView textView3 = this.T;
                                textView3.setText(o);
                                String o2 = i7 <= 0 ? iah0.f().widthPixels < 768 ? uqm0.o(i7) : uqm0.f(i7) : str;
                                TextView textView4 = this.W;
                                textView4.setText(o2);
                                this.a0.setText(w0 <= 0 ? iah0.f().widthPixels < 768 ? uqm0.o(w0) : uqm0.f(w0) : str);
                                this.c0.setText(e7 <= 0 ? this.q0.a(e7) : str);
                                String s6 = E1 <= 0 ? s6(R.plurals.accessibility_comments_count, E1, Integer.valueOf(E1)) : v6(R.string.accessibility_add_comment);
                                View view5 = this.S;
                                view5.setContentDescription(s6);
                                String s62 = i7 <= 0 ? s6(R.plurals.accessibility_reposts, i7, Integer.valueOf(i7)) : v6(R.string.accessibility_share);
                                View view6 = this.U;
                                view6.setContentDescription(s62);
                                String s63 = w0 <= 0 ? s6(R.plurals.accessibility_views, w0, Integer.valueOf(w0)) : str;
                                View view7 = this.Z;
                                view7.setContentDescription(s63);
                                String i10 = e7 <= 0 ? pvo0.i(false, e7, false, false) : str;
                                View view8 = this.b0;
                                view8.setContentDescription(i10);
                                if (i <= 0) {
                                    i2 = E1;
                                    str2 = s6(R.plurals.accessibility_badges, i, Integer.valueOf(i));
                                } else {
                                    i2 = E1;
                                    str2 = null;
                                }
                                linearLayout.setContentDescription(str2);
                                bwt0.p0(textView3, i2 <= 0);
                                bwt0.p0(textView4, i7 <= 0);
                                if (textView != null) {
                                    if (c6zVar.T9() == 0) {
                                        if (((o2f0Var == null || (K = o2f0Var.K()) == null) ? 0 : K.c) == 0 && j7()) {
                                            z11 = true;
                                            bwt0.p0(textView, z11);
                                        }
                                    }
                                    z11 = false;
                                    bwt0.p0(textView, z11);
                                }
                                if (c6zVar instanceof Photos) {
                                    Photos photos = (Photos) c6zVar;
                                    if (photos.r == 1) {
                                        Attachment R1 = photos.R1();
                                        if ((R1 != null && fdi.t(R1)) || !photos.b9()) {
                                            z4 = true;
                                            z5 = c6zVar instanceof Post;
                                            bwt0.p0(view6, (!z5 && ((Post) c6zVar).qc()) && !z4);
                                            if (z5) {
                                                Post post = (Post) c6zVar;
                                                if (post.dc() || post.F) {
                                                    z6 = true;
                                                    Post post2 = !z5 ? (Post) c6zVar : null;
                                                    boolean z24 = post2 == null && post2.ic();
                                                    if (c6zVar instanceof wsx0) {
                                                        EntryHeader header = ((wsx0) c6zVar).getHeader();
                                                        if ((header != null ? header.h : null) == null) {
                                                            z7 = true;
                                                            bwt0.p0(view5, (c6zVar.qa() && (z6 || z24)) ? false : true);
                                                            bwt0.p0(view7, z7 && !(c6zVar instanceof Videos) && w0 > 0);
                                                            bwt0.p0(view8, !z7 && e7 > 0);
                                                            bwt0.p0(this.i0, false);
                                                            Badgeable badgeable6 = z3 ? (Badgeable) c6zVar : null;
                                                            if (h170Var.b()) {
                                                                bwt0.p0(view, false);
                                                                return;
                                                            }
                                                            View view9 = view;
                                                            if (j7() && badgeable6 != null && badgeable6.u0() != null) {
                                                                BadgesSet u04 = badgeable6.u0();
                                                                if ((u04 != null ? u04.f : 0) <= 0) {
                                                                    s1c0 s1c0Var3 = this.x;
                                                                    if (s1c0Var3 != null) {
                                                                        z9 = true;
                                                                        if (s1c0Var3.k) {
                                                                            z10 = true;
                                                                        }
                                                                    } else {
                                                                        z9 = true;
                                                                    }
                                                                    z10 = false;
                                                                } else {
                                                                    z9 = true;
                                                                }
                                                                s1c0 s1c0Var4 = this.x;
                                                                if (!((s1c0Var4 == null || s1c0Var4.k != z9) ? false : z9)) {
                                                                    Post post3 = z5 ? (Post) c6zVar : null;
                                                                }
                                                                z8 = z9;
                                                                bwt0.p0(view9, z8);
                                                                return;
                                                            }
                                                            z8 = false;
                                                            bwt0.p0(view9, z8);
                                                            return;
                                                        }
                                                    }
                                                    z7 = false;
                                                    bwt0.p0(view5, (c6zVar.qa() && (z6 || z24)) ? false : true);
                                                    bwt0.p0(view7, z7 && !(c6zVar instanceof Videos) && w0 > 0);
                                                    bwt0.p0(view8, !z7 && e7 > 0);
                                                    bwt0.p0(this.i0, false);
                                                    if (z3) {
                                                    }
                                                    if (h170Var.b()) {
                                                    }
                                                }
                                            }
                                            z6 = false;
                                            if (!z5) {
                                            }
                                            if (post2 == null) {
                                            }
                                            if (c6zVar instanceof wsx0) {
                                            }
                                            z7 = false;
                                            bwt0.p0(view5, (c6zVar.qa() && (z6 || z24)) ? false : true);
                                            bwt0.p0(view7, z7 && !(c6zVar instanceof Videos) && w0 > 0);
                                            bwt0.p0(view8, !z7 && e7 > 0);
                                            bwt0.p0(this.i0, false);
                                            if (z3) {
                                            }
                                            if (h170Var.b()) {
                                            }
                                        }
                                    }
                                }
                                z4 = false;
                                z5 = c6zVar instanceof Post;
                                bwt0.p0(view6, (!z5 && ((Post) c6zVar).qc()) && !z4);
                                if (z5) {
                                }
                                z6 = false;
                                if (!z5) {
                                }
                                if (post2 == null) {
                                }
                                if (c6zVar instanceof wsx0) {
                                }
                                z7 = false;
                                bwt0.p0(view5, (c6zVar.qa() && (z6 || z24)) ? false : true);
                                bwt0.p0(view7, z7 && !(c6zVar instanceof Videos) && w0 > 0);
                                bwt0.p0(view8, !z7 && e7 > 0);
                                bwt0.p0(this.i0, false);
                                if (z3) {
                                }
                                if (h170Var.b()) {
                                }
                            }
                        }
                        linearLayout = linearLayout2;
                        view = view3;
                        h170Var = h170Var2;
                        z3 = z22;
                        str = null;
                        if (T9 > 0) {
                            c7(T9, c6zVar.J());
                        } else {
                            b7();
                        }
                        if (E1 <= 0) {
                        }
                        TextView textView32 = this.T;
                        textView32.setText(o);
                        if (i7 <= 0) {
                        }
                        TextView textView42 = this.W;
                        textView42.setText(o2);
                        this.a0.setText(w0 <= 0 ? iah0.f().widthPixels < 768 ? uqm0.o(w0) : uqm0.f(w0) : str);
                        this.c0.setText(e7 <= 0 ? this.q0.a(e7) : str);
                        if (E1 <= 0) {
                        }
                        View view52 = this.S;
                        view52.setContentDescription(s6);
                        if (i7 <= 0) {
                        }
                        View view62 = this.U;
                        view62.setContentDescription(s62);
                        if (w0 <= 0) {
                        }
                        View view72 = this.Z;
                        view72.setContentDescription(s63);
                        if (e7 <= 0) {
                        }
                        View view82 = this.b0;
                        view82.setContentDescription(i10);
                        if (i <= 0) {
                        }
                        linearLayout.setContentDescription(str2);
                        bwt0.p0(textView32, i2 <= 0);
                        bwt0.p0(textView42, i7 <= 0);
                        if (textView != null) {
                        }
                        if (c6zVar instanceof Photos) {
                        }
                        z4 = false;
                        z5 = c6zVar instanceof Post;
                        bwt0.p0(view62, (!z5 && ((Post) c6zVar).qc()) && !z4);
                        if (z5) {
                        }
                        z6 = false;
                        if (!z5) {
                        }
                        if (post2 == null) {
                        }
                        if (c6zVar instanceof wsx0) {
                        }
                        z7 = false;
                        bwt0.p0(view52, (c6zVar.qa() && (z6 || z24)) ? false : true);
                        bwt0.p0(view72, z7 && !(c6zVar instanceof Videos) && w0 > 0);
                        bwt0.p0(view82, !z7 && e7 > 0);
                        bwt0.p0(this.i0, false);
                        if (z3) {
                        }
                        if (h170Var.b()) {
                        }
                    } else {
                        o2f0Var = o2f0Var2;
                    }
                } else {
                    o2f0Var = o2f0Var2;
                    FeedReactionsStack feedReactionsStack2 = this.L;
                    if (feedReactionsStack2 != null) {
                        bwt0.p0(feedReactionsStack2, false);
                    }
                }
                if (textView != null) {
                    if (c6zVar.T9() == 0) {
                        ItemReactions K6 = o2f0Var.K();
                        if ((K6 != null && K6.c == 0) && j7()) {
                            z13 = true;
                            bwt0.p0(textView, z13);
                        }
                    }
                    z13 = false;
                    bwt0.p0(textView, z13);
                }
                if (h170Var2.g()) {
                    iut0.q(view2, bVar);
                } else {
                    iut0.q(view2, this.y0);
                }
                b2 = h170Var2.b();
                LinearLayout linearLayout22 = this.e0;
                View view32 = this.d0;
                View view42 = this.X;
                if (b2) {
                }
                T9 = c6zVar.T9();
                E1 = c6zVar.E1();
                i7 = c6zVar.i7();
                w0 = c6zVar.w0();
                boolean z222 = c6zVar instanceof Badgeable;
                if (z222) {
                }
                if (badgeable != null) {
                    i = u0.f;
                }
                boolean z232 = c6zVar instanceof NewsEntry;
                e7 = e7(z232 ? (NewsEntry) c6zVar : null);
                if (o2f0Var != null) {
                }
                linearLayout = linearLayout22;
                view = view32;
                h170Var = h170Var2;
                z3 = z222;
                str = null;
                if (T9 > 0) {
                }
                if (E1 <= 0) {
                }
                TextView textView322 = this.T;
                textView322.setText(o);
                if (i7 <= 0) {
                }
                TextView textView422 = this.W;
                textView422.setText(o2);
                this.a0.setText(w0 <= 0 ? iah0.f().widthPixels < 768 ? uqm0.o(w0) : uqm0.f(w0) : str);
                this.c0.setText(e7 <= 0 ? this.q0.a(e7) : str);
                if (E1 <= 0) {
                }
                View view522 = this.S;
                view522.setContentDescription(s6);
                if (i7 <= 0) {
                }
                View view622 = this.U;
                view622.setContentDescription(s62);
                if (w0 <= 0) {
                }
                View view722 = this.Z;
                view722.setContentDescription(s63);
                if (e7 <= 0) {
                }
                View view822 = this.b0;
                view822.setContentDescription(i10);
                if (i <= 0) {
                }
                linearLayout.setContentDescription(str2);
                bwt0.p0(textView322, i2 <= 0);
                bwt0.p0(textView422, i7 <= 0);
                if (textView != null) {
                }
                if (c6zVar instanceof Photos) {
                }
                z4 = false;
                z5 = c6zVar instanceof Post;
                bwt0.p0(view622, (!z5 && ((Post) c6zVar).qc()) && !z4);
                if (z5) {
                }
                z6 = false;
                if (!z5) {
                }
                if (post2 == null) {
                }
                if (c6zVar instanceof wsx0) {
                }
                z7 = false;
                bwt0.p0(view522, (c6zVar.qa() && (z6 || z24)) ? false : true);
                bwt0.p0(view722, z7 && !(c6zVar instanceof Videos) && w0 > 0);
                bwt0.p0(view822, !z7 && e7 > 0);
                bwt0.p0(this.i0, false);
                if (z3) {
                }
                if (h170Var.b()) {
                }
            }
        }
        o2f0Var = o2f0Var2;
        view2.setSelected(c6zVar.J());
        M7();
        footerButton.setBackgroundTintList(null);
        if (textView != null) {
            bwt0.p0(textView, c6zVar.T9() == 0 && j7());
        }
        p7();
        iut0.q(view2, bVar);
        b2 = h170Var2.b();
        LinearLayout linearLayout222 = this.e0;
        View view322 = this.d0;
        View view422 = this.X;
        if (b2) {
        }
        T9 = c6zVar.T9();
        E1 = c6zVar.E1();
        i7 = c6zVar.i7();
        w0 = c6zVar.w0();
        boolean z2222 = c6zVar instanceof Badgeable;
        if (z2222) {
        }
        if (badgeable != null) {
        }
        boolean z2322 = c6zVar instanceof NewsEntry;
        e7 = e7(z2322 ? (NewsEntry) c6zVar : null);
        if (o2f0Var != null) {
        }
        linearLayout = linearLayout222;
        view = view322;
        h170Var = h170Var2;
        z3 = z2222;
        str = null;
        if (T9 > 0) {
        }
        if (E1 <= 0) {
        }
        TextView textView3222 = this.T;
        textView3222.setText(o);
        if (i7 <= 0) {
        }
        TextView textView4222 = this.W;
        textView4222.setText(o2);
        this.a0.setText(w0 <= 0 ? iah0.f().widthPixels < 768 ? uqm0.o(w0) : uqm0.f(w0) : str);
        this.c0.setText(e7 <= 0 ? this.q0.a(e7) : str);
        if (E1 <= 0) {
        }
        View view5222 = this.S;
        view5222.setContentDescription(s6);
        if (i7 <= 0) {
        }
        View view6222 = this.U;
        view6222.setContentDescription(s62);
        if (w0 <= 0) {
        }
        View view7222 = this.Z;
        view7222.setContentDescription(s63);
        if (e7 <= 0) {
        }
        View view8222 = this.b0;
        view8222.setContentDescription(i10);
        if (i <= 0) {
        }
        linearLayout.setContentDescription(str2);
        bwt0.p0(textView3222, i2 <= 0);
        bwt0.p0(textView4222, i7 <= 0);
        if (textView != null) {
        }
        if (c6zVar instanceof Photos) {
        }
        z4 = false;
        z5 = c6zVar instanceof Post;
        bwt0.p0(view6222, (!z5 && ((Post) c6zVar).qc()) && !z4);
        if (z5) {
        }
        z6 = false;
        if (!z5) {
        }
        if (post2 == null) {
        }
        if (c6zVar instanceof wsx0) {
        }
        z7 = false;
        bwt0.p0(view5222, (c6zVar.qa() && (z6 || z24)) ? false : true);
        bwt0.p0(view7222, z7 && !(c6zVar instanceof Videos) && w0 > 0);
        bwt0.p0(view8222, !z7 && e7 > 0);
        bwt0.p0(this.i0, false);
        if (z3) {
        }
        if (h170Var.b()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void F7() {
        this.itemView.getContext();
        ?? r1 = this.w0;
        int intValue = ((Number) r1.getValue()).intValue() - cn70.b(8);
        int intValue2 = ((Number) r1.getValue()).intValue() - cn70.b(8);
        View view = null;
        FeedReactionsStack feedReactionsStack = this.L;
        int b2 = bwt0.K(this.d0) ? cn70.b(0) : epx.f(feedReactionsStack != null ? Boolean.valueOf(bwt0.K(feedReactionsStack)) : null, Boolean.TRUE) ? cn70.b(0) : cn70.b(6);
        ViewGroup viewGroup = this.K;
        int childCount = viewGroup.getChildCount();
        View view2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (bwt0.K(childAt)) {
                if (view2 == null) {
                    view2 = childAt;
                }
                bwt0.t0(childAt, 0, 0, 0, 0, 10);
                if (childAt.getId() != R.id.views_wrapper) {
                    bwt0.t0(childAt, 0, b2, 0, 0, 13);
                }
                view = childAt;
            }
        }
        if (view2 != null) {
            bwt0.t0(view2, intValue, 0, 0, 0, 14);
        }
        if (view != null) {
            bwt0.t0(view, 0, 0, intValue2, 0, 11);
        }
    }

    public final void H7(VideoFile videoFile) {
        E7(videoFile.Pa());
        bwt0.p0(this.Z, false);
        this.j0.setSelected(!videoFile.j0());
        String string = this.itemView.getContext().getString(videoFile.j0() ? R.string.video_remove_from_added : R.string.video_add_to_added);
        View view = this.i0;
        view.setContentDescription(string);
        bwt0.p0(view, videoFile.i9());
    }

    public final void J7() {
        wqf wqfVar = new wqf(this, 19);
        int e7 = e7(q6());
        Parcelable q6 = q6();
        c6z c6zVar = q6 instanceof c6z ? (c6z) q6 : null;
        this.r0.a(this.c0, wqfVar, e7, c6zVar != null ? c6zVar.fa() : 0);
    }

    public final void M7() {
        VKImageView vKImageView = this.P;
        vKImageView.setPadding(0, 0, 0, 0);
        vKImageView.setImageDrawable((Drawable) this.B0.getValue());
    }

    public final void N7(int i) {
        int b2 = i - cn70.b(2);
        int b3 = cn70.b(0);
        if (b2 < b3) {
            b2 = b3;
        }
        FeedReactionsStack feedReactionsStack = this.L;
        if (feedReactionsStack != null && feedReactionsStack.getInsetBottom() == b2) {
            feedReactionsStack.setInsetBottom(b2);
            return;
        }
        if (feedReactionsStack != null) {
            feedReactionsStack.setInsetBottom(b2);
        }
        g9p0 k7 = k7();
        if (k7 != null) {
            k7.c();
        }
    }

    public final void P7(int i) {
        int b2 = i - cn70.b(2);
        int b3 = cn70.b(0);
        if (b2 < b3) {
            b2 = b3;
        }
        FeedReactionsStack feedReactionsStack = this.L;
        if (feedReactionsStack != null && feedReactionsStack.getInsetTop() == b2) {
            feedReactionsStack.setInsetTop(b2);
            return;
        }
        if (feedReactionsStack != null) {
            feedReactionsStack.setInsetTop(b2);
        }
        g9p0 k7 = k7();
        if (k7 != null) {
            k7.c();
        }
    }

    @Override // xsna.rp6
    public final void R6(q6s q6sVar) {
        q6s q6sVar2 = q6sVar;
        this.s0 = f9t.M(null);
        w7(q6sVar2);
        P7(q6sVar2.Q);
        FeedReactionsStack feedReactionsStack = this.L;
        if (feedReactionsStack != null) {
            bwt0.p0(feedReactionsStack, q6sVar2.O);
        }
        F7();
    }

    @Override // xsna.p2f0
    public final void S4(boolean z) {
        this.O.setForeground(z ? dhr0.w(R.drawable.hover_radius_32_pressed, this.itemView.getContext()) : dhr0.w(R.drawable.hover_radius_32, this.itemView.getContext()));
    }

    @Override // xsna.p2f0
    public final void T1(u5f0 u5f0Var, ReactionMeta reactionMeta, a2f0 a2f0Var) {
        boolean z = a2f0Var.a;
        NewsEntry q6 = q6();
        if (q6 == null) {
            return;
        }
        if (u5f0Var.a != di60.Q(q6)) {
            return;
        }
        h7().h = true;
        g9p0 k7 = k7();
        if (k7 != null) {
            k7.d = i7();
        }
        d7(q6);
        h7().h = false;
        g9p0 k72 = k7();
        if (k72 != null) {
            k72.d = false;
        }
        View view = this.N;
        if (reactionMeta == null || !reactionMeta.g()) {
            Set<View> set = g6z.a;
            g6z.c(view, this.P, a2f0Var.a, true, 48);
        }
        if (z && reactionMeta != null && reactionMeta.g()) {
            iut0.t(view, null);
            hi60 hi60Var = this.D;
            HintId.FEED_LIKE_REALTIME_NEWS.getClass();
            hi60Var.sa(new NewsfeedExternalAction.c.z(this.O));
            return;
        }
        if (z) {
            iut0.t(view, null);
        } else {
            iut0.t(view, v6(R.string.accessibility_reaction_deleted));
        }
    }

    @Override // xsna.rp6
    public final void T6(q6s q6sVar, Object obj) {
        q6s q6sVar2 = q6sVar;
        this.s0 = f9t.M(obj);
        w7(q6sVar2);
        P7(q6sVar2.Q);
        FeedReactionsStack feedReactionsStack = this.L;
        if (feedReactionsStack != null) {
            bwt0.p0(feedReactionsStack, q6sVar2.O);
        }
        F7();
    }

    @Override // xsna.rp6
    public final void U6(NewsEntry newsEntry) {
        super.U6(newsEntry);
        z7(newsEntry, null);
    }

    @Override // xsna.rp6
    public final void W6(NewsEntry newsEntry, Object obj) {
        super.W6(newsEntry, obj);
        z7(newsEntry, obj);
    }

    public final void b7() {
        TextView textView = this.R;
        bwt0.p0(textView, false);
        textView.setText((CharSequence) null);
        View view = this.N;
        K7(view, false);
        view.setContentDescription(this.itemView.getContext().getString(R.string.accessibility_add_like));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c7(int i, boolean z) {
        ColorStateList colorStateList = (ColorStateList) this.t0.getValue();
        TextView textView = this.R;
        textView.setTextColor(colorStateList);
        xo9.A(textView, iah0.f().widthPixels < 768 ? uqm0.o(i) : uqm0.f(i));
        View view = this.N;
        K7(view, false);
        view.setContentDescription(z ? v6(R.string.accessibility_reaction_delete_like) : s6(R.plurals.accessibility_likes, i, Integer.valueOf(i)));
    }

    public void d7(NewsEntry newsEntry) {
        F6(newsEntry, new p6s());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final int e7(NewsEntry newsEntry) {
        if (newsEntry instanceof Post) {
            if (t6() instanceof PromoPost) {
                return 0;
            }
            return ((Post) newsEntry).r;
        }
        if (newsEntry instanceof Videos) {
            if (di60.q(q6())) {
                return ((Videos) newsEntry).n;
            }
            return 0;
        }
        if ((newsEntry instanceof Photos) && di60.q(q6())) {
            return ((Photos) newsEntry).p;
        }
        return 0;
    }

    public final String f7(String str, ReactionMeta reactionMeta, int i) {
        return (str == null || str.length() == 0) ? reactionMeta != null ? v6(R.string.accessibility_reaction_delete) : i > 0 ? s6(R.plurals.accessibility_likes, i, Integer.valueOf(i)) : v6(R.string.accessibility_add_like) : x6(R.string.accessibility_reaction_delete_definite, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final fii0 h7() {
        return (fii0) this.A0.getValue();
    }

    public final boolean i7() {
        s1c0 s1c0Var = this.x;
        if (s1c0Var != null) {
            return s1c0Var.h;
        }
        return true;
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.j
    public final boolean isEnabled() {
        return false;
    }

    public final boolean j7() {
        s1c0 s1c0Var = this.x;
        if (s1c0Var != null) {
            return s1c0Var.i;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final g9p0 k7() {
        return (g9p0) this.x0.getValue();
    }

    public final void o7() {
        bwt0.p0(this.d0, false);
        bwt0.p0(this.h0, false);
        TextView textView = this.M;
        if (textView != null) {
            bwt0.p0(textView, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        ?? q6 = q6();
        if (q6 != 0) {
            p4r p4rVar = (p4r) this.I.getValue();
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            UserId o = k9q0.o(q6);
            Integer valueOf = Integer.valueOf(di60.n(q6));
            String str = q6.Cb().b;
            MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source source = MobileOfficialAppsFeedStat$TypeFeedOpenItem.Source.NEWS_ITEM_CLICK;
            p4rVar.getClass();
            p4r.g(i, o, valueOf, str, source);
        }
        super.onClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.vk.feed.core.models.news.NewsEntry, java.lang.Object] */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        c6z Q;
        boolean z;
        ?? q6 = q6();
        if (q6 != 0 && (Q = di60.Q(q6)) != null) {
            if (q6 instanceof Post) {
                Post post = (Post) q6;
                if (post.Tb() && post.jc()) {
                    z = true;
                    if (!di60.H(q6) && !z) {
                        Rect d = w11.d(view);
                        s3q0 s3q0Var = s3q0.a;
                        return this.E.b(view, d, this, new ij3(view, 1), motionEvent, Q, q6, this.u, !this.G.g());
                    }
                }
            }
            z = false;
            if (!di60.H(q6)) {
                Rect d2 = w11.d(view);
                s3q0 s3q0Var2 = s3q0.a;
                return this.E.b(view, d2, this, new ij3(view, 1), motionEvent, Q, q6, this.u, !this.G.g());
            }
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        h7().c();
    }

    public final void p7() {
        h7().c();
        FeedReactionsStack feedReactionsStack = this.L;
        if (feedReactionsStack != null) {
            feedReactionsStack.setImportantForAccessibility(2);
        }
        if (feedReactionsStack != null) {
            bwt0.p0(feedReactionsStack, false);
        }
        TextView textView = this.M;
        if (textView != null) {
            bwt0.p0(textView, false);
        }
        bwt0.p0(this.X, false);
        iut0.q(this.N, null);
    }

    @Override // xsna.p2f0
    public final boolean r4(Object obj) {
        return obj == q6();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final void r7() {
        ?? q6 = q6();
        Object Q = q6 != 0 ? di60.Q(q6) : null;
        this.E.d(this.itemView.getContext(), Q instanceof Badgeable ? (Badgeable) Q : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.vk.dto.badges.Badgeable] */
    public final boolean s7() {
        UserId userId;
        int i;
        ?? q6 = q6();
        if (q6 == 0) {
            return false;
        }
        c6z Q = di60.Q(q6);
        Post post = Q instanceof Badgeable ? (Badgeable) Q : null;
        if (post == null) {
            return false;
        }
        Post R = di60.R(q6);
        if (R == null || (userId = R.m) == null) {
            Post post2 = post instanceof Post ? post : null;
            if (post2 == null) {
                return false;
            }
            userId = post2.m;
        }
        if (R != null) {
            i = R.n;
        } else {
            Post post3 = post instanceof Post ? post : null;
            if (post3 == null) {
                return false;
            }
            i = post3.n;
        }
        this.E.c(this.itemView.getContext(), post, userId, i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t7(NewsEntry newsEntry) {
        VideoAttachment videoAttachment;
        boolean z = false;
        S4(false);
        boolean z2 = newsEntry instanceof c6z;
        View view = this.N;
        if (z2) {
            E7((c6z) newsEntry);
        } else if (newsEntry instanceof FaveEntry) {
            Object obj = ((FaveEntry) newsEntry).i.f;
            if (obj instanceof Post) {
                t7((NewsEntry) obj);
            } else if (obj instanceof ArticleAttachment) {
                int i = ((ArticleAttachment) obj).f.m;
                bwt0.p0(this.i0, false);
                bwt0.p0(this.S, false);
                bwt0.p0(view, false);
                bwt0.p0(this.U, true);
                this.a0.setText(iah0.f().widthPixels < 768 ? uqm0.o(i) : uqm0.f(i));
                boolean z3 = i > 0;
                View view2 = this.Z;
                bwt0.p0(view2, z3);
                view2.setContentDescription(i > 0 ? s6(R.plurals.accessibility_views, i, Integer.valueOf(i)) : null);
                bwt0.p0(this.b0, false);
                p7();
                bwt0.p0(this.d0, false);
                bwt0.p0(this.X, false);
            } else if (obj instanceof VideoAttachment) {
                H7(((VideoAttachment) obj).k);
            } else {
                p7();
            }
        } else if (newsEntry instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            if (shitAttachment.Gb() && (videoAttachment = shitAttachment.I) != null) {
                H7(videoAttachment.k);
            }
        } else {
            p7();
        }
        bwt0.p0(view, tni.i(newsEntry));
        if (newsEntry instanceof Post) {
            if (!BuildInfo.s() ? false : !((Post) newsEntry).b9()) {
                z = true;
            }
        }
        int i2 = z ? R.drawable.vk_icon_message_forward_outline_24 : R.drawable.vk_icon_share_outline_24;
        gko.b bVar = gko.Companion;
        this.V.setImageDrawable(gko.b(i2, this.itemView.getContext()));
    }

    public final void w7(q6s q6sVar) {
        VideoAttachment videoAttachment;
        S4(false);
        NewsEntry newsEntry = q6sVar.g0;
        boolean z = newsEntry instanceof c6z;
        View view = this.N;
        if (z) {
            C7(q6sVar);
        } else if (newsEntry instanceof FaveEntry) {
            gmq gmqVar = ((FaveEntry) newsEntry).i.f;
            if (gmqVar instanceof Post) {
                w7(q6sVar);
            } else {
                boolean z2 = gmqVar instanceof ArticleAttachment;
                View view2 = this.Z;
                View view3 = this.i0;
                if (z2) {
                    int i = q6sVar.t;
                    bwt0.p0(view3, false);
                    bwt0.p0(this.S, false);
                    bwt0.p0(view, false);
                    bwt0.p0(this.U, true);
                    this.a0.setText(q6sVar.y);
                    bwt0.p0(view2, i > 0);
                    view2.setContentDescription(i > 0 ? s6(R.plurals.accessibility_views, i, Integer.valueOf(i)) : null);
                    bwt0.p0(this.b0, false);
                    p7();
                    bwt0.p0(this.d0, false);
                    bwt0.p0(this.X, false);
                } else if (gmqVar instanceof VideoAttachment) {
                    C7(q6sVar);
                    bwt0.p0(view2, false);
                    this.j0.setSelected(q6sVar.z);
                    view3.setContentDescription(this.itemView.getContext().getString(q6sVar.B));
                    bwt0.p0(view3, q6sVar.A);
                } else {
                    p7();
                }
            }
        } else if (newsEntry instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) newsEntry;
            if (shitAttachment.Gb() && (videoAttachment = shitAttachment.I) != null) {
                H7(videoAttachment.k);
            }
        } else {
            p7();
        }
        bwt0.p0(view, q6sVar.e0);
        int i2 = q6sVar.I;
        gko.b bVar = gko.Companion;
        this.V.setImageDrawable(gko.b(i2, this.itemView.getContext()));
    }

    public final void z7(NewsEntry newsEntry, Object obj) {
        if (this.C != 0) {
            return;
        }
        this.s0 = f9t.M(obj);
        t7(newsEntry);
        boolean z = false;
        P7(!di60.I(newsEntry) ? 0 : cn70.b(8));
        FeedReactionsStack feedReactionsStack = this.L;
        if (feedReactionsStack != null) {
            if (i7() && di60.I(newsEntry)) {
                z = true;
            }
            bwt0.p0(feedReactionsStack, z);
        }
        F7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0228  */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onClick(View view) {
        ?? q6;
        s980 s980Var;
        PostDonut postDonut;
        PostDonut.Paywall paywall;
        PostDonut.Paywall paywall2;
        PostDonut.Snippet snippet;
        LinkButton linkButton;
        Action action;
        PostDonut.Placeholder placeholder;
        LinkButton linkButton2;
        if (jjc.b() || (q6 = q6()) == 0) {
            return;
        }
        boolean z = q6 instanceof Post;
        r3 = null;
        r3 = null;
        String str = null;
        Post post = z ? (Post) q6 : null;
        boolean Tb = post != null ? post.Tb() : false;
        View view2 = this.b0;
        if (Tb) {
            if (z) {
                Post post2 = (Post) q6;
                if (post2.jc()) {
                    if (epx.f(view, view2)) {
                        J7();
                        return;
                    }
                    ?? q62 = q6();
                    if (q62 != 0) {
                        p4r p4rVar = (p4r) this.I.getValue();
                        String str2 = this.v;
                        UserId o = k9q0.o(q62);
                        Integer valueOf = Integer.valueOf(post2.n);
                        p4rVar.getClass();
                        p4r.a(MobileOfficialAppsFeedStat$TypeFeedPostDonutPaymentClick.Subtype.FOOTER, str2, o, valueOf);
                    }
                    PostDonut postDonut2 = post2.R;
                    if (postDonut2 == null || (placeholder = postDonut2.c) == null || (linkButton2 = placeholder.c) == null || (action = linkButton2.c) == null) {
                        if (postDonut2 == null || (paywall2 = postDonut2.g) == null || (snippet = paywall2.d) == null || (linkButton = snippet.e) == null) {
                            return;
                        } else {
                            action = linkButton.c;
                        }
                    }
                    hd60.a().v(action, this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : this.u, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                    return;
                }
            }
            Context context = this.itemView.getContext();
            Post post3 = z ? (Post) q6 : null;
            if (post3 != null && (postDonut = post3.R) != null && (paywall = postDonut.g) != null) {
                str = paywall.c;
            }
            String str3 = str;
            if (view == null || str3 == null || drm0.N(str3)) {
                return;
            }
            Rect rect = new Rect();
            RectF rectF = new RectF();
            view.getGlobalVisibleRect(rect);
            rectF.set(rect);
            if (rectF.isEmpty()) {
                return;
            }
            hl60.g(hl60.a, context, view, new Hint(HintId.DONUT_PAYWALL.getId(), str3, null, null, 8, null), false, new dam(2), true, new grb(view, rect, rectF), null, null, null, 1920);
            return;
        }
        boolean f = epx.f(view, this.N);
        ?? r4 = this.p0;
        h3f0 h3f0Var = this.E;
        if (f) {
            Post R = di60.R(q6);
            if (R != null && !R.J() && R.ic()) {
                ikv0.a aVar = new ikv0.a(this.itemView.getContext());
                aVar.u = new ikv0.d(this.itemView.getContext().getString(R.string.newsfeed_post_removed), (String) null, (ikv0.d.a) null, 6);
                aVar.n();
                return;
            }
            c6z Q = di60.Q(q6);
            if (Q == null) {
                return;
            }
            NewsEntry t6 = t6();
            if (t6 instanceof PromoPost) {
                hd60.a().m0((PromoPost) t6);
            }
            if (t6 instanceof ShitAttachment) {
                ShitAttachment shitAttachment = (ShitAttachment) t6;
                if (shitAttachment.Gb()) {
                    ((rv0) r4.getValue()).f(shitAttachment);
                }
            }
            h3f0Var.e(new v5f0(this.N, this, Q, t6, this.u, AddLikeAction.TriggerType.BUTTON.h()));
            return;
        }
        if (epx.f(view, this.S)) {
            NewsEntry t62 = t6();
            if (t62 instanceof ShitAttachment) {
                ShitAttachment shitAttachment2 = (ShitAttachment) t62;
                if (shitAttachment2.Gb()) {
                    ((rv0) r4.getValue()).b(shitAttachment2);
                }
            }
            ga60 ga60Var = (ga60) this.l0.getValue();
            ga60Var.b = this.u;
            if (ga60Var.b(q6) || (s980Var = this.y) == 0) {
                return;
            }
            s980Var.r8(q6);
            return;
        }
        if (epx.f(view, this.U)) {
            if (hd60.a().S(this.itemView.getContext())) {
                NewsEntry t63 = t6();
                if (t63 instanceof ShitAttachment) {
                    ShitAttachment shitAttachment3 = (ShitAttachment) t63;
                    if (shitAttachment3.Gb()) {
                        ((rv0) r4.getValue()).g(shitAttachment3);
                        hd60.a().H(t63);
                        String str4 = this.u;
                        com.vk.newsfeed.common.helpers.a aVar2 = this.k0;
                        aVar2.c = str4;
                        aVar2.d = this.H;
                        u1c0 J0 = J0();
                        aVar2.e = J0 != null ? Integer.valueOf(J0.k) : null;
                        NewsEntry newsEntry = q6;
                        if (t63 != null) {
                            newsEntry = t63;
                        }
                        aVar2.e(newsEntry);
                        return;
                    }
                }
                if (t63 instanceof PromoPost) {
                    ((rv0) r4.getValue()).c((PromoPost) t63);
                }
                hd60.a().H(t63);
                String str42 = this.u;
                com.vk.newsfeed.common.helpers.a aVar22 = this.k0;
                aVar22.c = str42;
                aVar22.d = this.H;
                u1c0 J02 = J0();
                aVar22.e = J02 != null ? Integer.valueOf(J02.k) : null;
                NewsEntry newsEntry2 = q6;
                if (t63 != null) {
                }
                aVar22.e(newsEntry2);
                return;
            }
            return;
        }
        if (epx.f(view, this.i0)) {
            this.D.sa(new NewsfeedExternalAction.c.c0(this.u, q6));
            return;
        }
        if (epx.f(view, this.e0)) {
            r7();
            return;
        }
        if (epx.f(view, this.h0)) {
            h3f0Var.d(this.itemView.getContext(), q6 instanceof Badgeable ? (Badgeable) q6 : null);
        } else if (epx.f(view, this.M)) {
            ((c1c0) this.o0.getValue()).z(this.itemView.getContext(), q6, false);
        } else if (epx.f(view, view2)) {
            J7();
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
