package com.vk.newsfeed.impl.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.version_info.VersionConstants;
import xsna.aa;
import xsna.afg;
import xsna.anj;
import xsna.awt0;
import xsna.bv0;
import xsna.bwt0;
import xsna.cbg;
import xsna.ce60;
import xsna.cj4;
import xsna.cuz;
import xsna.dhr0;
import xsna.dl60;
import xsna.e3m;
import xsna.e4;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.eu1;
import xsna.f1o;
import xsna.fae;
import xsna.g3f0;
import xsna.gko;
import xsna.gzs;
import xsna.hd60;
import xsna.hf8;
import xsna.hh1;
import xsna.hl60;
import xsna.iah0;
import xsna.ics0;
import xsna.ire;
import xsna.iz;
import xsna.j4;
import xsna.jcg;
import xsna.jgg;
import xsna.krv0;
import xsna.lcg;
import xsna.ll60;
import xsna.m33;
import xsna.m3a;
import xsna.m3g0;
import xsna.m4;
import xsna.mcg;
import xsna.mdg;
import xsna.msy;
import xsna.ncg;
import xsna.ocg;
import xsna.omw;
import xsna.oq;
import xsna.oq0;
import xsna.oz50;
import xsna.p870;
import xsna.pcg;
import xsna.qcg;
import xsna.rcg;
import xsna.rdg;
import xsna.s3q0;
import xsna.s62;
import xsna.scg;
import xsna.tf4;
import xsna.tlo0;
import xsna.u3g0;
import xsna.udg;
import xsna.vdg;
import xsna.wx20;
import xsna.yif0;
import xsna.yrn;
import xsna.z23;
import xsna.z2f0;
import xsna.zjq;
import xsna.zou;

/* compiled from: CommentThreadFragment.kt */
/* loaded from: classes4.dex */
public class CommentThreadFragment extends BaseCommentsFragment<afg> {
    public static final ArrayList<dl60> y0 = e43.a(ll60.a.invoke());
    public CoordinatorLayout.c<View> m0;
    public VkTopBar n0;
    public View o0;
    public f1o p0;
    public vdg q0;
    public final mdg r0;
    public String s0;
    public boolean t0;
    public boolean u0;
    public final CommentThreadFragment$receiver$1 v0;
    public final Object w0;
    public final Object x0;

    /* compiled from: CommentThreadFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, int i, int i2) {
            super(CommentThreadWithBottomMenuBarFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
            this.j.putInt("id", i);
            this.j.putInt("type", i2);
        }
    }

    /* compiled from: CommentThreadFragment.kt */
    public final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CommentThreadFragment.this.z(rdg.c.a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            hl60 hl60Var = hl60.a;
            hl60.c(i2);
        }
    }

    /* compiled from: CommentThreadFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((CommentThreadFragment) this.receiver).finish();
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.newsfeed.impl.fragments.CommentThreadFragment$receiver$1] */
    public CommentThreadFragment() {
        ncg ncgVar = new ncg(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        mdg mdgVar = new mdg(new ics0(msy.a(lazyThreadSafetyMode, ncgVar)), new fae(msy.a(lazyThreadSafetyMode, new hh1(this, 22))), msy.a(lazyThreadSafetyMode, new ocg(this, 0)), this, null);
        this.q0 = new vdg(mdgVar, mdgVar.K, new g3f0((z2f0) null, 3), new m3a(3));
        this.S = mdgVar;
        this.r0 = mdgVar;
        this.v0 = new BroadcastReceiver() { // from class: com.vk.newsfeed.impl.fragments.CommentThreadFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                afg Co = CommentThreadFragment.this.Co();
                if (Co != null) {
                    ((mdg) Co).Z3(intent);
                }
            }
        };
        this.w0 = msy.a(lazyThreadSafetyMode, new bv0(9));
        this.x0 = msy.a(lazyThreadSafetyMode, new cj4(11));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void A7() {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setSwipeRefreshEnabled(true);
        }
        View view = this.o0;
        if (view != null) {
            bwt0.p0(view, false);
        }
    }

    public u3g0 Ao() {
        u3g0 u3g0Var = new u3g0(null);
        afg Co = Co();
        if (Co != null) {
            m3g0 m3g0Var = new m3g0(Co, u3g0Var, this.Z);
            ((mdg) Co).S = m3g0Var;
            u3g0Var.c = m3g0Var;
        }
        u3g0 u3g0Var2 = this.X;
        if (u3g0Var2 != null) {
            u3g0Var2.v();
        }
        ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            u3g0Var.u(viewGroup);
        }
        return u3g0Var;
    }

    @Override // xsna.bfg
    public final void B2(boolean z) {
        afg Co;
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        View view = this.Y;
        if (view != null) {
            boolean z2 = false;
            if (z && (Co = Co()) != null && ((mdg) Co).a6() == 0) {
                RecyclerPaginatedView recyclerPaginatedView = this.W;
                if (((recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) > 0) {
                    z2 = true;
                }
            }
            bwt0.p0(view, z2);
        }
    }

    public int Bo() {
        return R.drawable.vk_comments_thread_divider;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Ch(String str) {
        this.q0.L0(str);
    }

    public afg Co() {
        return this.r0;
    }

    public int Do() {
        return R.string.comment_replies;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Ec(UserId userId, NewsComment newsComment) {
        CommentDonut commentDonut;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null || (commentDonut = newsComment.M) == null) {
            return;
        }
        f1o f1oVar = this.p0;
        ViewParent parent = f1oVar != null ? f1oVar.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.p0);
        }
        this.p0 = null;
        f1o f1oVar2 = new f1o(mo2getContext);
        f1oVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        CommentDonut.Placeholder placeholder = commentDonut.c;
        int i = 1;
        if (placeholder != null) {
            bwt0.p0(f1oVar2.c, false);
            f1oVar2.d.setText(hd60.a().h(placeholder.b));
            LinkButton linkButton = placeholder.c;
            String str = linkButton != null ? linkButton.b : null;
            VkSimpleButton vkSimpleButton = f1oVar2.e;
            vkSimpleButton.setText(str);
            bwt0.i0(vkSimpleButton, new s62(placeholder, userId, f1oVar2, i));
        }
        f1oVar2.setHorizontalPadding(f1oVar2.getResources().getDimensionPixelSize(R.dimen.comment_thread_placeholder_horizontal_padding));
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_donut_outline_56, mo2getContext);
        f1oVar2.f = a2;
        AppCompatImageView appCompatImageView = f1oVar2.b;
        if (a2 == null) {
            appCompatImageView.setImageDrawable(a2);
        } else {
            omw.c(R.attr.vk_ui_icon_secondary, a2, appCompatImageView);
        }
        f1oVar2.setTitleVisibility(false);
        f1oVar2.setSubtitleMarginTop(f1oVar2.getResources().getDimensionPixelSize(R.dimen.comment_thread_placeholder_subtitle_margin_top));
        f1oVar2.setButtonMarginTop(f1oVar2.getResources().getDimensionPixelSize(R.dimen.comment_thread_placeholder_button_margin_top));
        CoordinatorLayout coordinatorLayout = this.T;
        if (coordinatorLayout != null) {
            coordinatorLayout.addView(f1oVar2);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            bwt0.p0(recyclerPaginatedView, false);
        }
        AppBarLayout appBarLayout = this.V;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
        AppBarLayout appBarLayout2 = this.V;
        ViewGroup.LayoutParams layoutParams = appBarLayout2 != null ? appBarLayout2.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar != null) {
            this.m0 = fVar.a;
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            behavior.p = new qcg();
            fVar.c(behavior);
        }
        this.p0 = f1oVar2;
    }

    public void Eo() {
        yo();
    }

    public void Fo(yrn yrnVar) {
        yrnVar.o = iah0.a(16.0f);
    }

    public void Go(RecyclerView recyclerView) {
        recyclerView.setPadding(0, iah0.a(4.0f), 0, 0);
    }

    @Override // xsna.bfg
    public final void Jg(NewsComment newsComment, aa aaVar) {
        afg Co;
        wx20 a2;
        int f;
        int f2;
        Integer ko;
        Integer ko2;
        FragmentActivity activity = getActivity();
        if (activity == null || (Co = Co()) == null || (a2 = Co.Ra(newsComment, new udg(newsComment.t)).a(new oq0(this, newsComment, aaVar, 3))) == null) {
            return;
        }
        if (ko() == null || ((ko2 = ko()) != null && ko2.intValue() == 0)) {
            f = e3m.f(R.attr.vk_ui_action_sheet_text, activity);
        } else {
            dhr0.a.getClass();
            f = e3m.f(R.attr.vk_ui_action_sheet_text, dhr0.s());
        }
        int i = f;
        if (ko() == null || ((ko = ko()) != null && ko.intValue() == 0)) {
            f2 = e3m.f(R.attr.vk_ui_text_primary, activity);
        } else {
            dhr0.a.getClass();
            f2 = e3m.f(R.attr.vk_ui_text_primary, dhr0.s());
        }
        int i2 = f2;
        Integer ko3 = ko();
        a2.b(activity, "comment_thread", i, i2, ko3 != null ? ko3.intValue() : 0);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final boolean L7() {
        VkTopBar vkTopBar = this.n0;
        if (vkTopBar == null) {
            return false;
        }
        Rect n = zjq.n(vkTopBar.getRightMainRect());
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        vkTopBar.getContext();
        e.c cVar = new e.c(null, n, vkTopBar, l, 1);
        VkContextMenu.c.c(cVar, R.string.comment_goto_post, null, false, null, new j4(9, this, vkTopBar), 30);
        cVar.j();
        return true;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void P5() {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setSwipeRefreshEnabled(false);
        }
        View view = this.o0;
        if (view != null) {
            bwt0.p0(view, true);
        }
    }

    @Override // xsna.bfg
    public final void bm(int i) {
        this.q0.i = i;
    }

    @Override // xsna.bfg
    public final void eg(NewsComment newsComment) {
        Iterator it = ((ArrayList) this.q0.y0()).iterator();
        final int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (epx.f(((cbg) it.next()).a, newsComment)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            so(new gzs() { // from class: xsna.kcg
                @Override // xsna.gzs
                public final Object invoke() {
                    ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                    CommentThreadFragment.this.io(i);
                    return s3q0.a;
                }
            });
        }
    }

    @Override // xsna.bfg
    public final void in() {
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.in();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final int mo() {
        return Math.max(0, this.q0.getItemCount() - 1);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Target target;
        afg Co;
        Post post;
        Integer num;
        u3g0 u3g0Var;
        super.onActivityResult(i, i2, intent);
        if (i > 10000 && (u3g0Var = this.X) != null) {
            u3g0Var.n(i, i2, intent);
        }
        if (i == 4329 && i2 == -1) {
            if (intent == null || (post = (Post) intent.getParcelableExtra("comment")) == null || (num = post.u) == null) {
                return;
            }
            int intValue = num.intValue();
            afg Co2 = Co();
            if (Co2 != null) {
                ((mdg) Co2).s8(post.s, post.z, intValue);
            }
        }
        if (i != 4331 || i2 != -1 || intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null || (Co = Co()) == null) {
            return;
        }
        ((mdg) Co).b8(target);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntentFilter a2 = z23.a("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String str = hf8.a;
        CommentThreadFragment$receiver$1 commentThreadFragment$receiver$1 = this.v0;
        anj.d(context, commentThreadFragment$receiver$1, a2, str, 4);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(zou.a);
        Context context2 = e43.a;
        cuz.a(context2 != null ? context2 : null).b(commentThreadFragment$receiver$1, intentFilter);
        ce60.b.getClass();
        p870.f().b(116, Co());
        p870.f().b(VersionConstants.PRODUCT_MAJOR_VERSION, Co());
        p870.f().b(147, Co());
        p870.f().b(9, Co());
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("ref_source");
            this.s0 = arguments.getString("referrer");
            this.t0 = arguments.getBoolean("arg_show_options_menu");
            this.q0.j = this.s0;
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.n0 = (VkTopBar) onCreateView.findViewById(R.id.toolbar);
        this.U = (ViewGroup) onCreateView.findViewById(R.id.bottom_sheet_container);
        View findViewById = onCreateView.findViewById(R.id.empty_view);
        bwt0.i0(findViewById.findViewById(R.id.error_button), new ire(this, 3));
        this.o0 = findViewById;
        this.X = Ao();
        View view = this.Y;
        if (view != null) {
            bwt0.i0(view, new pcg(this, 0));
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            Go(recyclerView);
            recyclerView.setClipToPadding(false);
            Context qn = qn();
            if (qn != null) {
                yrn zo = zo(m33.a(Bo(), qn));
                zo.m = new lcg();
                Fo(zo);
                recyclerView.addItemDecoration(zo);
                yrn yrnVar = new yrn(m33.a(R.drawable.archived_comment_divider, qn), iah0.a(8.0f));
                yrnVar.m = new mcg();
                recyclerView.addItemDecoration(yrnVar);
                recyclerView.setItemAnimator(null);
            }
        }
        if (this.t0) {
            this.u0 = true;
        }
        yo();
        return onCreateView;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        enj.s(context, this.v0);
        ce60.b.getClass();
        p870.f().g(Co());
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.n0 = null;
        this.o0 = null;
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            u3g0Var.onDestroyView();
        }
        super.onDestroyView();
        ((yif0) this.w0.getValue()).c.clear();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        go(new m4(this, 29));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onViewCreated(view, bundle);
        vdg vdgVar = this.q0;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setAdapter(vdgVar);
        }
        afg Co = Co();
        if (Co != null) {
            Co.onCreate(getArguments());
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle("STATE_REPLY_BAR_VIEW") : null;
        u3g0 u3g0Var = this.X;
        if (u3g0Var != null) {
            FragmentActivity activity = getActivity();
            u3g0Var.p(view, bundle2, activity != null ? activity.getWindow() : null);
        }
        Eo();
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView2 = recyclerPaginatedView2.getRecyclerView()) != null) {
            recyclerView2.addOnScrollListener(new b());
        }
        ((yif0) this.w0.getValue()).c.add(new rcg());
        RecyclerPaginatedView recyclerPaginatedView3 = this.W;
        if (recyclerPaginatedView3 == null || (recyclerView = recyclerPaginatedView3.getRecyclerView()) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new scg(this));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_comment_thread, viewGroup, false);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void ub() {
        f1o f1oVar = this.p0;
        ViewParent parent = f1oVar != null ? f1oVar.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.p0);
        }
        this.p0 = null;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            bwt0.p0(recyclerPaginatedView, true);
        }
        CoordinatorLayout.c<View> cVar = this.m0;
        if (cVar == null) {
            return;
        }
        AppBarLayout appBarLayout = this.V;
        ViewGroup.LayoutParams layoutParams = appBarLayout != null ? appBarLayout.getLayoutParams() : null;
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar != null) {
            fVar.c(cVar);
        }
        this.m0 = null;
    }

    public final void yo() {
        VkTopBar vkTopBar = this.n0;
        if (vkTopBar == null) {
            return;
        }
        String string = getString(Do());
        vkTopBar.setContentDescription(string);
        c cVar = new c(0, this, CommentThreadFragment.class, "finish", "finish()V", 0);
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        vkTopBar.setBack(new VkTopBar.b(cVar, null, null, null, com.vk.core.compose.component.semantics.b.a(mode, new iz(this, 28), 2), 14));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(string, new e4(this, 23), (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 12), null, null, null, 14));
        String string2 = getString(R.string.accessibility_actions);
        VkTopBar.a.d dVar = null;
        if (this.u0) {
            dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_24), oq.d(tlo0.Companion, string2), new jcg(this, 0), null, null, com.vk.core.compose.component.semantics.b.a(mode, new tf4(string2, 1), 2), 24), null, 6);
        }
        vkTopBar.setAfter(dVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bfg
    public final boolean z(rdg rdgVar) {
        RecyclerView recyclerView;
        boolean z = rdgVar instanceof rdg.d;
        ?? r1 = this.x0;
        if (z) {
            View findViewById = ((rdg.d) rdgVar).a.itemView.findViewById(R.id.comment_author_liked_photo);
            if (findViewById == null) {
                return false;
            }
            jgg.d((jgg) r1.getValue(), findViewById, HintId.FEED_AUTHOR_LIKE_ONBOARDING.getId());
            return true;
        }
        if (rdgVar instanceof rdg.e) {
            jgg.b((jgg) r1.getValue(), ((rdg.e) rdgVar).a, HintId.FEED_AUTHOR_LIKED.getId());
            return true;
        }
        if (rdgVar instanceof rdg.f) {
            jgg.b((jgg) r1.getValue(), ((rdg.f) rdgVar).a, HintId.FEED_GROUP_LIKED.getId());
            return true;
        }
        if (!(rdgVar instanceof rdg.c)) {
            return false;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            awt0.t(recyclerView, new eu1(recyclerView, 29));
        }
        return true;
    }

    public yrn zo(Drawable drawable) {
        return new yrn(drawable, iah0.a(8.0f));
    }
}
