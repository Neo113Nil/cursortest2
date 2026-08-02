package com.vk.newsfeed.impl.feedback;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.comments.CommentsOrder;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.replybar.ReplyBarGravityBehavior;
import com.vk.newsfeed.impl.views.ModalCommentsPaginatedView;
import com.vk.typography.FontFamily;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b2c0;
import xsna.b3g0;
import xsna.bpn0;
import xsna.c3g0;
import xsna.c6z;
import xsna.c950;
import xsna.c9c0;
import xsna.dl60;
import xsna.e2s;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fae;
import xsna.g3f0;
import xsna.g9c0;
import xsna.gzs;
import xsna.hbt0;
import xsna.iah0;
import xsna.ics0;
import xsna.ies;
import xsna.ify;
import xsna.j9c0;
import xsna.jjc;
import xsna.lfg;
import xsna.ll60;
import xsna.m3g0;
import xsna.mdg;
import xsna.msy;
import xsna.n3g0;
import xsna.nef;
import xsna.o4l0;
import xsna.onv;
import xsna.oz50;
import xsna.pa60;
import xsna.ra60;
import xsna.rdg;
import xsna.rl3;
import xsna.s3q0;
import xsna.sa60;
import xsna.sim;
import xsna.swe0;
import xsna.u3g0;
import xsna.vdg;
import xsna.wa60;
import xsna.xfg;
import xsna.y0y0;
import xsna.y8g0;
import xsna.yfg;
import xsna.z0y0;
import xsna.z1h0;
import xsna.z2f0;

/* compiled from: NewsEntryFeedbackCommentsFragment.kt */
/* loaded from: classes4.dex */
public final class NewsEntryFeedbackCommentsFragment extends PostViewFragment implements sa60, ies {
    public static final int f1 = y8g0.a(R.dimen.vk_bottom_navigation_height);
    public static final ArrayList<dl60> g1 = e43.a(ll60.a.invoke());
    public CoordinatorLayout V0;
    public View Y0;
    public TextView Z0;
    public yfg a1;
    public final ra60 e1;
    public final int[] W0 = {0, 0};
    public final Handler X0 = new Handler(Looper.getMainLooper());
    public final xfg b1 = new xfg();
    public final bpn0 c1 = new bpn0(new c950(this, 4));
    public final b d1 = new b();

    /* compiled from: NewsEntryFeedbackCommentsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: NewsEntryFeedbackCommentsFragment.kt */
    public static final class b implements xfg.a {
        public b() {
        }

        @Override // xsna.xfg.a
        public final void a(CommentsOrder.Item item) {
            String str = item.b;
            NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = NewsEntryFeedbackCommentsFragment.this;
            yfg yfgVar = newsEntryFeedbackCommentsFragment.a1;
            if (yfgVar == null) {
                return;
            }
            if (!epx.f(str, yfgVar.c)) {
                yfgVar.e.invoke(str, yfgVar);
            }
            VkContextMenu vkContextMenu = (VkContextMenu) newsEntryFeedbackCommentsFragment.c1.getValue();
            if (vkContextMenu != null) {
                vkContextMenu.b();
            }
        }
    }

    /* compiled from: NewsEntryFeedbackCommentsFragment.kt */
    public static final class c implements ify.a {
        public final /* synthetic */ g9c0 b;

        public c(g9c0 g9c0Var) {
            this.b = g9c0Var;
        }

        @Override // xsna.ify.a
        public final void Y0() {
            int i = ify.a;
            ify.g(this);
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            int i2 = ify.a;
            ify.g(this);
            this.b.invoke();
        }
    }

    /* compiled from: NewsEntryFeedbackCommentsFragment.kt */
    public static final class d extends RecyclerView.t {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int measuredHeight;
            View view = NewsEntryFeedbackCommentsFragment.this.Y0;
            if (view != null && (measuredHeight = view.getMeasuredHeight()) > 0) {
                view.setTranslationY(swe0.f(view.getTranslationY() - i2, -measuredHeight, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
        }
    }

    public NewsEntryFeedbackCommentsFragment() {
        ra60 ra60Var = new ra60(this, this.J);
        b2c0 b2c0Var = new b2c0(ra60Var.G, this.y0);
        b2c0Var.n = new PostViewFragment.b();
        b2c0Var.m = this.z0;
        this.s0 = b2c0Var;
        nef nefVar = new nef(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, nefVar);
        Lazy a3 = msy.a(lazyThreadSafetyMode, new sim(this, 26));
        pa60 pa60Var = new pa60(new ics0(a3), new fae(a3), a2, this, ra60Var);
        ra60Var.H = pa60Var;
        this.t0 = new vdg(pa60Var, pa60Var.K, new g3f0((z2f0) null, 3), this.A0);
        this.C0 = pa60Var;
        this.S = pa60Var;
        this.e1 = ra60Var;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final hbt0 Ao() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if (((r5 == null || (r5 = r5.getRecyclerView()) == null || (r5 = r5.getAdapter()) == null) ? 0 : r5.getItemCount()) > 0) goto L33;
     */
    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.bfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B2(boolean z) {
        lfg lfgVar = this.C0;
        if (lfgVar == null) {
            lfgVar = null;
        }
        pa60 pa60Var = lfgVar instanceof pa60 ? (pa60) lfgVar : null;
        if (pa60Var == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = pa60Var.a6() == 0;
        boolean z4 = pa60Var.p == 0;
        if (z && z4 && z3) {
            RecyclerPaginatedView recyclerPaginatedView = this.W;
        }
        z2 = false;
        onv Ko = Ko();
        if (Ko != null) {
            Ko.B2(z2);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void B3() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.B2(false);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final u3g0 Bf() {
        onv Ko = Ko();
        if (Ko != null) {
            return Ko.Bf();
        }
        return null;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final boolean Bo() {
        return false;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Cd(UserId userId, String str, LinkButton linkButton) {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.x5(getActivity(), userId, str, linkButton);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.hsx0
    public final Integer Ck() {
        u3g0 Bf = Bf();
        if (Bf == null || !f4m.h(Bf.e)) {
            return null;
        }
        return Integer.valueOf(f1);
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final c9c0 Co() {
        return this.e1;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void D() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.D();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Eo() {
        onv Ko = Ko();
        if (Ko != null) {
            lfg lfgVar = this.C0;
            if (lfgVar == null) {
                lfgVar = null;
            }
            Ko.Ol(lfgVar);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Fo(View view, Bundle bundle) {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.tk(bundle);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void I9() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.b();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Ic(boolean z) {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.Ic(z);
        }
    }

    public final onv Ko() {
        z1h0 parentFragment = getParentFragment();
        if (parentFragment instanceof onv) {
            return (onv) parentFragment;
        }
        return null;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Nh(UserId userId, String str) {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.Nh(userId, str);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void Ql(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var) {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.h5(popupStickerAnimation, o4l0Var);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.j(false);
        }
        u3g0 Bf2 = Bf();
        if (Bf2 != null) {
            Bf2.Ic(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void S2(NewsEntry newsEntry) {
        RecyclerView recyclerView;
        m3g0 m3g0Var;
        VideoAttachment Nb;
        z1h0 parentFragment = getParentFragment();
        wa60 wa60Var = parentFragment instanceof wa60 ? (wa60) parentFragment : null;
        if (wa60Var != null) {
            wa60Var.S2(newsEntry);
        }
        boolean z = (newsEntry instanceof Videos) && (Nb = ((Videos) newsEntry).Nb()) != null && Nb.C2();
        int zb = newsEntry.zb();
        if (zb == 9) {
            zb = 1;
        } else if (z) {
            zb = 6;
        }
        c6z c6zVar = newsEntry instanceof c6z ? (c6z) newsEntry : null;
        if (c6zVar == null || !c6zVar.l0()) {
            String string = zb == 6 ? getString(R.string.comments_disabled_title) : getString(R.string.post_comments_disabled_title);
            RecyclerPaginatedView recyclerPaginatedView = this.W;
            ModalCommentsPaginatedView modalCommentsPaginatedView = recyclerPaginatedView instanceof ModalCommentsPaginatedView ? (ModalCommentsPaginatedView) recyclerPaginatedView : null;
            if (modalCommentsPaginatedView != null) {
                modalCommentsPaginatedView.setDisableCommentsTitle(string);
            }
        } else {
            String string2 = (zb == 2 || zb == 6) ? getString(R.string.comments_empty_title) : getString(R.string.post_comments_empty_title);
            RecyclerPaginatedView recyclerPaginatedView2 = this.W;
            ModalCommentsPaginatedView modalCommentsPaginatedView2 = recyclerPaginatedView2 instanceof ModalCommentsPaginatedView ? (ModalCommentsPaginatedView) recyclerPaginatedView2 : null;
            if (modalCommentsPaginatedView2 != null) {
                modalCommentsPaginatedView2.setEmptyTitle(string2);
            }
        }
        RecyclerPaginatedView recyclerPaginatedView3 = this.W;
        ModalCommentsPaginatedView modalCommentsPaginatedView3 = recyclerPaginatedView3 instanceof ModalCommentsPaginatedView ? (ModalCommentsPaginatedView) recyclerPaginatedView3 : null;
        if (modalCommentsPaginatedView3 != null) {
            int i = ModalCommentsPaginatedView.T;
            TextView textView = modalCommentsPaginatedView3.Q;
            if (textView != null) {
                textView.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
            }
            TextView textView2 = modalCommentsPaginatedView3.Q;
            if (textView2 != null) {
                f4m.u(textView2, i, 0, i, 0);
            }
            TextView textView3 = modalCommentsPaginatedView3.O;
            if (textView3 != null) {
                textView3.setTextAppearance(R.style.VkUiTypography_Headline1Normal);
            }
            TextView textView4 = modalCommentsPaginatedView3.O;
            if (textView4 != null) {
                f4m.u(textView4, i, 0, i, 0);
            }
        }
        u3g0 Bf = Bf();
        if (Bf != null && (m3g0Var = Bf.c) != null) {
            b3g0 b3g0Var = m3g0Var.b;
            n3g0 n3g0Var = m3g0Var.l;
            if (n3g0Var != null) {
                n3g0Var.b(b3g0Var.p());
                n3g0Var.f(b3g0Var.i0());
                n3g0Var.d(b3g0Var.f0());
                n3g0Var.a();
            }
        }
        lfg lfgVar = this.C0;
        if ((lfgVar != null ? lfgVar : null).w) {
            y2();
        } else {
            k0();
        }
        this.K0 = new GestureDetector(getActivity(), this.L0);
        RecyclerPaginatedView recyclerPaginatedView4 = this.W;
        if (recyclerPaginatedView4 == null || (recyclerView = recyclerPaginatedView4.getRecyclerView()) == null) {
            return;
        }
        recyclerView.addOnItemTouchListener(new j9c0(this));
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void V0() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.V0();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final boolean W1() {
        onv Ko = Ko();
        if (Ko != null) {
            return Ko.W1();
        }
        return false;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Ym() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.Ym();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        m3g0 m3g0Var;
        u3g0 Bf = Bf();
        if (Bf != null && Bf.m()) {
            Ic(true);
            return true;
        }
        u3g0 Bf2 = Bf();
        if (!((Bf2 == null || (m3g0Var = Bf2.c) == null) ? false : m3g0Var.e0())) {
            return false;
        }
        u3g0 Bf3 = Bf();
        if (Bf3 != null) {
            Bf3.r();
        }
        return true;
    }

    @Override // xsna.sa60
    public final void c1(List<LikeInfo> list) {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.c1(list);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void ej() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.ej();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.bfg
    public final void in() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.in();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void io(int i) {
        RecyclerView recyclerView;
        View view;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        int a2 = (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) ? iah0.a(72.0f) : view.getHeight();
        int[] iArr = this.W0;
        recyclerView.getLocationOnScreen(iArr);
        int a0 = rl3.a0(iArr);
        View view2 = this.b0;
        int bottom = view2 != null ? view2.getBottom() : iah0.f().heightPixels;
        onv Ko = Ko();
        if (Ko != null) {
            Ko.c5(i, linearLayoutManager, a2, a0, bottom);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final long jo() {
        return 0L;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void k0() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.k0();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void o0() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.o0();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d0();
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        WriteBar writeBar;
        z0y0 z0y0Var;
        super.onPause();
        u3g0 Bf = Bf();
        if (Bf == null || (writeBar = Bf.e) == null) {
            return;
        }
        y0y0 y0y0Var = writeBar.D;
        if (!y0y0Var.c(null) || (z0y0Var = y0y0Var.d) == null) {
            return;
        }
        y0y0Var.c.getInputState();
        z0y0Var.a(false, true);
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.requestLayout();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u3g0 Bf = Bf();
        Bundle o = Bf != null ? Bf.o() : null;
        if (o != null) {
            bundle.putBundle("STATE_REPLY_BAR_VIEW", o);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onViewCreated(view, bundle);
        this.Y0 = view.findViewById(R.id.news_entry_feedback_comments_order_button);
        TextView textView = (TextView) view.findViewById(R.id.news_entry_feedback_comments_order_button_text);
        this.Z0 = textView;
        if (textView != null) {
            jjc.g(textView, new e2s(this, 19));
        }
        TextView textView2 = this.Z0;
        if (textView2 != null) {
            com.vk.typography.b.k(textView2, FontFamily.REGULAR, Float.valueOf(15.0f), 4);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null && (recyclerView2 = recyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView2.setClipToPadding(false);
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 == null || (recyclerView = recyclerPaginatedView2.getRecyclerView()) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new d());
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void oo(View view) {
        onv Ko;
        mdg mdgVar = this.S;
        if (mdgVar == null || (Ko = Ko()) == null) {
            return;
        }
        Ko.b9(mdgVar);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final boolean qo() {
        return true;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_post_comments_view, viewGroup, false);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
        this.V0 = coordinatorLayout;
        ViewGroup.LayoutParams layoutParams = coordinatorLayout.findViewById(R.id.rpb_list).getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar != null) {
            fVar.c(new FeedbackCommentsBehavior(coordinatorLayout.getContext(), null));
        }
        return inflate;
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void so(gzs<s3q0> gzsVar) {
        int i = ify.a;
        if (ify.e(ify.c)) {
            ((g9c0) gzsVar).invoke();
            return;
        }
        final g9c0 g9c0Var = (g9c0) gzsVar;
        final c cVar = new c(g9c0Var);
        ify.a(cVar);
        u3g0 Bf = Bf();
        if (Bf != null) {
            final Handler handler = this.X0;
            c3g0.gg(Bf, new ResultReceiver(handler) { // from class: com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment$onKeyboardOpened$1
                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i2, Bundle bundle) {
                    if (i2 == 1 || i2 == 3) {
                        int i3 = ify.a;
                        ify.g(NewsEntryFeedbackCommentsFragment.c.this);
                        g9c0Var.invoke();
                    }
                }
            }, 2);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void to(int i) {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            f4m.v(i, recyclerPaginatedView);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final boolean wo(int i) {
        ra60 ra60Var = this.e1;
        return i <= (ra60Var != null ? ra60Var.u4() : 0);
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void x(int i) {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.x(i);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment, xsna.bfg
    public final void y2() {
        onv Ko = Ko();
        if (Ko != null) {
            Ko.y2();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.bfg
    public final boolean z(rdg rdgVar) {
        onv Ko = Ko();
        if (Ko != null) {
            return Ko.z(rdgVar);
        }
        return false;
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void V4() {
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void Go(View view) {
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment, xsna.d9c0
    public final void hk(int i) {
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void no(View view) {
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void po(ReplyBarGravityBehavior replyBarGravityBehavior) {
    }

    @Override // com.vk.newsfeed.impl.fragments.BaseCommentsFragment
    public final void vo(u3g0 u3g0Var) {
    }

    @Override // com.vk.newsfeed.impl.fragments.PostViewFragment
    public final void yo(RecyclerView recyclerView) {
    }
}
