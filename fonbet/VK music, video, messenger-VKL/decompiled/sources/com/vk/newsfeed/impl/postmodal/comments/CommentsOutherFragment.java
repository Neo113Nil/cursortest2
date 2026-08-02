package com.vk.newsfeed.impl.postmodal.comments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.reply.ReplyBarPlaceholderView;
import com.vk.movika.sdk.base.ui.l;
import com.vk.newsfeed.api.stats.NewsEntryEventItem;
import com.vk.newsfeed.impl.feedback.NewsEntryFeedbackCommentsFragment;
import com.vk.newsfeed.impl.replybar.ReplyBarGravityBehavior;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.subjects.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import xsna.afg;
import xsna.asu0;
import xsna.awt0;
import xsna.b0q;
import xsna.bwt0;
import xsna.c5g;
import xsna.c6z;
import xsna.cqf;
import xsna.dhr0;
import xsna.f420;
import xsna.f4m;
import xsna.fkq0;
import xsna.fnj;
import xsna.g420;
import xsna.g88;
import xsna.gko;
import xsna.go9;
import xsna.gzs;
import xsna.iah0;
import xsna.itg0;
import xsna.itj0;
import xsna.j6;
import xsna.jgg;
import xsna.k9q0;
import xsna.kw60;
import xsna.l3f;
import xsna.lfg;
import xsna.mag;
import xsna.mhy;
import xsna.msy;
import xsna.ns1;
import xsna.o4l0;
import xsna.ojf0;
import xsna.onv;
import xsna.oz50;
import xsna.pa60;
import xsna.pj1;
import xsna.pnv;
import xsna.q030;
import xsna.qp4;
import xsna.rdg;
import xsna.sx0;
import xsna.tk5;
import xsna.tlo0;
import xsna.tq;
import xsna.u3g0;
import xsna.ucp;
import xsna.uqm0;
import xsna.w3g0;
import xsna.w9;
import xsna.wa60;
import xsna.x00;
import xsna.xyp0;
import xsna.y00;
import xsna.y0y0;
import xsna.z0y0;
import xsna.z1h0;
import xsna.z3g0;

/* compiled from: CommentsOutherFragment.kt */
/* loaded from: classes4.dex */
public final class CommentsOutherFragment extends BaseFragment implements w3g0, onv, wa60, g88 {
    public static final /* synthetic */ int h0 = 0;
    public final /* synthetic */ z3g0 S;
    public CoordinatorLayout T;
    public ViewGroup U;
    public ViewGroup V;
    public ReplyBarPlaceholderView W;
    public View X;
    public VkUserStack Y;
    public NewsEntryFeedbackCommentsFragment Z;
    public PopupStickerView a0;
    public c b0;
    public final Object c0;
    public boolean d0;
    public final kw60 e0;
    public q030 f0;
    public final xyp0 g0;

    /* compiled from: CommentsOutherFragment.kt */
    public static final class a extends oz50 {
    }

    public CommentsOutherFragment() {
        z3g0 z3g0Var = new z3g0();
        this.S = z3g0Var;
        this.c0 = msy.a(LazyThreadSafetyMode.NONE, new w9(7));
        this.e0 = new kw60();
        this.g0 = new xyp0(this);
        z3g0Var.b = this;
    }

    @Override // xsna.onv
    public final void B2(boolean z) {
        View view = this.X;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.w3g0
    public final u3g0 Bf() {
        return this.S.d;
    }

    @Override // xsna.onv
    public final void D() {
        MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedOpenReactionsModal.EntryPoint.FROM_COMMENTS_DONUT;
        q030 q030Var = this.f0;
        if (q030Var != null) {
            Long l = q030Var.a;
            Long valueOf = Long.valueOf(q030Var.b);
            String str = q030Var.c;
            this.e0.getClass();
            kw60.a(l, valueOf, str, entryPoint);
        }
        z1h0 parentFragment = getParentFragment();
        pnv pnvVar = parentFragment instanceof pnv ? (pnv) parentFragment : null;
        if (pnvVar != null) {
            pnvVar.D();
        }
    }

    @Override // xsna.w3g0
    public final void Ol(afg afgVar) {
        this.S.Ol(afgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    @Override // xsna.wa60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S2(NewsEntry newsEntry) {
        Long l;
        VideoFile videoFile;
        boolean z;
        boolean z2;
        String str;
        VkUserStack vkUserStack;
        VkUserStack vkUserStack2;
        ViewGroup viewGroup;
        if (newsEntry instanceof Post) {
            l = Long.valueOf(((Post) newsEntry).n);
        } else if (newsEntry instanceof PromoPost) {
            l = Long.valueOf(((PromoPost) newsEntry).n.n);
        } else if (newsEntry instanceof Photos) {
            l = Long.valueOf(((Photos) newsEntry).m);
        } else if (newsEntry instanceof Videos) {
            VideoAttachment Nb = ((Videos) newsEntry).Nb();
            l = Long.valueOf((Nb == null || (videoFile = Nb.k) == null) ? 0L : videoFile.o0());
        } else {
            l = null;
        }
        long j = k9q0.o(newsEntry).b;
        String str2 = newsEntry.Cb().b;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        this.f0 = new q030(str2, l, j);
        boolean z3 = newsEntry instanceof c6z;
        c6z c6zVar = z3 ? (c6z) newsEntry : null;
        int T9 = c6zVar != null ? c6zVar.T9() : 0;
        c6z c6zVar2 = z3 ? (c6z) newsEntry : null;
        int fa = c6zVar2 != null ? c6zVar2.fa() : 0;
        boolean z4 = true;
        if (fa <= 0) {
            Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
            if (post != null) {
                Owner owner = post.o;
                UserId userId = post.m;
                boolean z5 = fkq0.d(userId) && fkq0.d(owner.b) && userId.b != owner.b.b;
                boolean z6 = fkq0.b(userId) && fkq0.d(owner.b);
                if (z5 || z6) {
                    z = false;
                    String quantityString = fa <= 0 ? getResources().getQuantityString(R.plurals.post_comments_modal_views_count, (int) uqm0.b(fa), iah0.f().widthPixels >= 768 ? uqm0.o(fa) : uqm0.f(fa)) : getResources().getString(R.string.post_comments_modal_no_views);
                    z2 = T9 <= 0;
                    if (z2) {
                        str = "";
                        str3 = quantityString;
                    } else {
                        str = getResources().getQuantityString(R.plurals.post_comments_modal_likes_count, T9, iah0.f().widthPixels < 768 ? uqm0.o(T9) : uqm0.f(T9));
                        if (z) {
                            str3 = go9.b("· ", quantityString);
                        }
                    }
                    if (!z && !z2) {
                        z4 = false;
                    }
                    vkUserStack = this.Y;
                    if (vkUserStack != null) {
                        vkUserStack.setVisibility(z4 ? 0 : 8);
                    }
                    vkUserStack2 = this.Y;
                    if (vkUserStack2 != null) {
                        tlo0.Companion.getClass();
                        vkUserStack2.setText(new tlo0.h(str + ' ' + str3));
                    }
                    viewGroup = this.V;
                    if (viewGroup == null) {
                        VkUserStack vkUserStack3 = this.Y;
                        f4m.t(vkUserStack3 != null ? vkUserStack3.getHeight() : 0, viewGroup);
                        return;
                    }
                    return;
                }
            }
        }
        z = true;
        if (fa <= 0) {
        }
        if (T9 <= 0) {
        }
        if (z2) {
        }
        if (!z) {
            z4 = false;
        }
        vkUserStack = this.Y;
        if (vkUserStack != null) {
        }
        vkUserStack2 = this.Y;
        if (vkUserStack2 != null) {
        }
        viewGroup = this.V;
        if (viewGroup == null) {
        }
    }

    @Override // xsna.w3g0
    public final void V0() {
        this.S.V0();
    }

    @Override // xsna.w3g0
    public final boolean W1() {
        return this.S.W1();
    }

    @Override // xsna.onv
    public final void Ym() {
        if (this.d0) {
            final CoordinatorLayout coordinatorLayout = this.T;
            final NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = this.Z;
            if (coordinatorLayout == null || newsEntryFeedbackCommentsFragment == null) {
                return;
            }
            final pj1 pj1Var = new pj1(1, this, CommentsOutherFragment.class, "getAnchorLocationProvider", "getAnchorLocationProvider(Landroid/view/View;)Landroid/graphics/RectF;", 0, 3);
            m mVar = new m(new Callable() { // from class: xsna.oa60
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i = NewsEntryFeedbackCommentsFragment.f1;
                    RecyclerView recyclerView = NewsEntryFeedbackCommentsFragment.this.getRecyclerView();
                    if (recyclerView != null) {
                        hl60 hl60Var = hl60.a;
                        hl60.j(NewsEntryFeedbackCommentsFragment.g1, recyclerView, new bzw(pj1Var, 12), coordinatorLayout, 4);
                    }
                    return s3q0.a;
                }
            });
            asu0.a.getClass();
            newsEntryFeedbackCommentsFragment.eo(itg0.l(mVar.q(asu0.m())));
        }
    }

    @Override // xsna.w3g0
    public final void b9(f420 f420Var) {
        this.S.b9(f420Var);
    }

    @Override // xsna.onv
    public final void c1(List<LikeInfo> list) {
        VkUserStack vkUserStack;
        List<LikeInfo> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String string = ((LikeInfo) it.next()).c.getString("photo");
            if (string == null) {
                string = "";
            }
            itj0.d(string, arrayList);
        }
        if (!arrayList.isEmpty() && (vkUserStack = this.Y) != null) {
            f4m.s(iah0.a(16), vkUserStack);
        }
        VkUserStack vkUserStack2 = this.Y;
        if (vkUserStack2 != null) {
            vkUserStack2.setAvatars(arrayList);
        }
    }

    @Override // xsna.w3g0
    public final void c5(int i, LinearLayoutManager linearLayoutManager, int i2, int i3, int i4) {
        this.S.c5(i, linearLayoutManager, i2, i3, i4);
    }

    @Override // xsna.onv
    public final void ej() {
        ViewGroup viewGroup;
        PopupStickerView popupStickerView = this.a0;
        if (popupStickerView != null) {
            if ((popupStickerView != null ? popupStickerView.getParent() : null) == null || (viewGroup = this.V) == null) {
                return;
            }
            viewGroup.removeView(this.a0);
        }
    }

    @Override // xsna.onv
    public final void h5(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var) {
        PopupStickerView popupStickerView;
        ej();
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            popupStickerView = new PopupStickerView(mo2getContext, null, 0, 14, 0);
        } else {
            popupStickerView = null;
        }
        this.a0 = popupStickerView;
        if (popupStickerView == null) {
            return;
        }
        popupStickerView.setLoadingCallback(o4l0Var);
        PopupStickerView popupStickerView2 = this.a0;
        if (popupStickerView2 != null) {
            PopupStickerView.d(popupStickerView2, popupStickerAnimation, false, null, 12);
        }
        ViewGroup viewGroup = this.V;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.V;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.a0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final RectF io(View view) {
        View view2 = getView();
        int i = view2 != null ? f4m.b(view2).top : 0;
        Rect b = f4m.b(view);
        b.offset(0, -i);
        RectF rectF = new RectF();
        rectF.set(b);
        return rectF;
    }

    @Override // xsna.g88
    public final void jf(int i) {
        CoordinatorLayout coordinatorLayout = this.T;
        if (coordinatorLayout != null) {
            bwt0.c0(i, coordinatorLayout);
        }
    }

    public final void jo() {
        NewsEntryFeedbackCommentsFragment newsEntryFeedbackCommentsFragment = this.Z;
        if (newsEntryFeedbackCommentsFragment != null) {
            lfg lfgVar = newsEntryFeedbackCommentsFragment.C0;
            if (lfgVar == null) {
                lfgVar = null;
            }
            pa60 pa60Var = lfgVar instanceof pa60 ? (pa60) lfgVar : null;
            if (pa60Var == null) {
                return;
            }
            g<Boolean> gVar = pa60Var.p0;
            if (pa60Var.o0) {
                return;
            }
            pa60Var.o0 = true;
            gVar.onNext(Boolean.TRUE);
            gVar.onComplete();
        }
    }

    @Override // xsna.w3g0
    public final void k0() {
        this.S.k0();
    }

    @Override // xsna.w3g0
    public final void o0() {
        this.S.o0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        u3g0 u3g0Var = this.S.d;
        if (u3g0Var != null) {
            u3g0Var.n(i, i2, intent);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        WriteBar writeBar;
        WriteBar writeBar2;
        super.onConfigurationChanged(configuration);
        z3g0 z3g0Var = this.S;
        u3g0 u3g0Var = z3g0Var.d;
        if (u3g0Var != null) {
            mhy.d(u3g0Var.e);
        }
        u3g0 u3g0Var2 = z3g0Var.d;
        if (u3g0Var2 != null) {
            u3g0Var2.clearFocus();
        }
        int width = new Size(iah0.r(requireContext()) ? iah0.a(360) : -1, -1).getWidth();
        u3g0 u3g0Var3 = z3g0Var.d;
        if (u3g0Var3 != null && (writeBar2 = u3g0Var3.e) != null) {
            bwt0.r0(width, writeBar2);
        }
        u3g0 u3g0Var4 = z3g0Var.d;
        if (u3g0Var4 == null || (writeBar = u3g0Var4.e) == null) {
            return;
        }
        f4m.m(81, writeBar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_comments_outher, viewGroup, false);
        this.T = (CoordinatorLayout) inflate.findViewById(R.id.comments_outher_content_holder);
        this.U = (ViewGroup) inflate.findViewById(R.id.comments_outher_fragment_outher_container);
        View findViewById = inflate.findViewById(R.id.comments_outher_bottom_sheet_container);
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) findViewById).getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        int i = 1;
        if (fVar != null) {
            ReplyBarGravityBehavior replyBarGravityBehavior = new ReplyBarGravityBehavior(inflate.getContext(), null);
            replyBarGravityBehavior.d = true;
            fVar.c(replyBarGravityBehavior);
        }
        this.V = (ViewGroup) findViewById;
        this.W = (ReplyBarPlaceholderView) inflate.findViewById(R.id.comments_outher_replybar_placeholder);
        this.Y = (VkUserStack) inflate.findViewById(R.id.likes_photo_stack);
        View findViewById2 = inflate.findViewById(R.id.comments_outher_jump_to_end);
        this.X = findViewById2;
        if (findViewById2 != null) {
            bwt0.i0(findViewById2, new cqf(this, 4));
        }
        VkUserStack vkUserStack = this.Y;
        if (vkUserStack != null) {
            bwt0.i0(vkUserStack, new ns1(this, 24));
        }
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.comments_regular_top_bar);
        vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_24), tq.h(tlo0.Companion, R.string.close), new sx0(this, 20), null, null, 56));
        tlo0.f fVar2 = new tlo0.f(R.string.post_comments_modal_title);
        Object[] objArr = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(fVar2, null, null, null, null, 30), null, 0 == true ? 1 : 0, objArr, 14));
        FragmentActivity kn = kn();
        HashSet hashSet = iah0.a;
        if (fnj.d(kn)) {
            awt0.t(inflate, new mag(inflate, i));
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            FragmentImpl f = new NewsEntryFeedbackCommentsFragment.a(NewsEntryFeedbackCommentsFragment.class, null, new Bundle(arguments)).f();
            this.Z = (NewsEntryFeedbackCommentsFragment) f;
            FragmentManager childFragmentManager = getChildFragmentManager();
            androidx.fragment.app.a b = tk5.b(childFragmentManager, childFragmentManager);
            b.r = true;
            b.g(R.id.comments_outher_fragment_container, f, "inner_fragment_comments");
            b.k(true);
        }
        c cVar = this.b0;
        if (cVar != null) {
            cVar.dispose();
        }
        ucp ucpVar = ucp.a;
        this.b0 = ucp.a().subscribe(new y00(new x00(inflate), 13));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        z3g0 z3g0Var = this.S;
        u3g0 u3g0Var = z3g0Var.d;
        if (u3g0Var != null) {
            u3g0Var.onDestroyView();
        }
        z3g0Var.d = null;
        g420 g420Var = z3g0Var.f;
        if (g420Var != null) {
            g420Var.onDestroyView();
        }
        c cVar = this.b0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b0 = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        WriteBar writeBar;
        z0y0 z0y0Var;
        super.onPause();
        u3g0 u3g0Var = this.S.d;
        if (u3g0Var == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        y0y0 y0y0Var = writeBar.D;
        if (!y0y0Var.c(null) || (z0y0Var = y0y0Var.d) == null) {
            return;
        }
        y0y0Var.c.getInputState();
        z0y0Var.a(false, true);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        Rect C8;
        super.onResume();
        z1h0 parentFragment = getParentFragment();
        pnv pnvVar = parentFragment instanceof pnv ? (pnv) parentFragment : null;
        if (pnvVar != null && (C8 = pnvVar.C8()) != null) {
            jf(C8.height());
        }
        this.g0.d();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ReplyBarGravityBehavior replyBarGravityBehavior = (ReplyBarGravityBehavior) ((CoordinatorLayout.f) view.findViewById(R.id.comments_outher_replybar_shadow).getLayoutParams()).a;
        replyBarGravityBehavior.d = true;
        replyBarGravityBehavior.b = new l3f(1, this, CommentsOutherFragment.class, "onReplyBarHeightChanged", "onReplyBarHeightChanged(I)V", 0, 1);
    }

    @Override // xsna.onv
    public final void tk(Bundle bundle) {
        CoordinatorLayout coordinatorLayout;
        ViewGroup viewGroup;
        int width = new Size(iah0.r(requireContext()) ? iah0.a(360) : -1, -1).getWidth();
        z3g0 z3g0Var = this.S;
        CommentsOutherFragment commentsOutherFragment = z3g0Var.b;
        if (commentsOutherFragment == null || (coordinatorLayout = commentsOutherFragment.T) == null) {
            return;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle("STATE_REPLY_BAR_VIEW") : null;
        u3g0 u3g0Var = z3g0Var.d;
        if (u3g0Var != null) {
            gzs<? extends Dialog> gzsVar = z3g0Var.c;
            Dialog invoke = gzsVar != null ? gzsVar.invoke() : null;
            u3g0Var.p(coordinatorLayout, bundle2, invoke != null ? invoke.getWindow() : null);
            u3g0Var.v();
            u3g0Var.E(new qp4(u3g0Var, 9));
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                writeBar.setDisallowParentInterceptTouchEvent(true);
            }
            WriteBar writeBar2 = u3g0Var.e;
            if (writeBar2 != null) {
                writeBar2.setUseLongtapStickerScreenSize(true);
            }
            WriteBar writeBar3 = u3g0Var.e;
            if (writeBar3 != null) {
                writeBar3.setLongtapStickerPopupGravity(85);
            }
            WriteBar writeBar4 = u3g0Var.e;
            if (writeBar4 != null) {
                bwt0.r0(width, writeBar4);
            }
            WriteBar writeBar5 = u3g0Var.e;
            if (writeBar5 != null) {
                f4m.m(81, writeBar5);
            }
            CommentsOutherFragment commentsOutherFragment2 = z3g0Var.b;
            if (commentsOutherFragment2 == null || (viewGroup = commentsOutherFragment2.V) == null) {
                return;
            }
            ojf0 ojf0Var = new ojf0(0, dhr0.M(), 102);
            WriteBar writeBar6 = u3g0Var.e;
            if (writeBar6 != null) {
                writeBar6.setBottomSheetParams(ojf0Var);
            }
            WriteBar writeBar7 = u3g0Var.e;
            if (writeBar7 != null) {
                writeBar7.setUpdateBottomSheet(true);
            }
            u3g0Var.u(viewGroup);
        }
    }

    @Override // xsna.w3g0
    public final void x5(Context context, UserId userId, CharSequence charSequence, LinkButton linkButton) {
        this.S.x5(context, userId, charSequence, linkButton);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        SchemeStat$EventItem schemeStat$EventItem = null;
        NewsEntryEventItem newsEntryEventItem = arguments != null ? (NewsEntryEventItem) arguments.getParcelable("news_entry_event_item") : null;
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.FEED_COMMENTS_MODAL;
        if (newsEntryEventItem != null) {
            int i = b0q.$EnumSwitchMapping$0[newsEntryEventItem.b.ordinal()];
            SchemeStat$EventItem.Type type = i != 1 ? i != 2 ? i != 3 ? SchemeStat$EventItem.Type.POST : SchemeStat$EventItem.Type.VIDEO : SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.PHOTO;
            Long l = newsEntryEventItem.c;
            UserId userId = newsEntryEventItem.d;
            schemeStat$EventItem = new SchemeStat$EventItem(type, l, userId != null ? Long.valueOf(userId.b) : null, null, newsEntryEventItem.e, null, 40, null);
        }
        uiTrackingScreen.f = schemeStat$EventItem;
    }

    @Override // xsna.w3g0
    public final void y2() {
        this.S.y2();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.onv
    public final boolean z(rdg rdgVar) {
        boolean z = rdgVar instanceof rdg.d;
        ?? r1 = this.c0;
        if (z) {
            View findViewById = ((rdg.d) rdgVar).a.itemView.findViewById(R.id.comment_author_liked_photo);
            if (findViewById == null) {
                return false;
            }
            jgg jggVar = (jgg) r1.getValue();
            String id = HintId.FEED_AUTHOR_LIKE_ONBOARDING.getId();
            l lVar = new l(5, this, findViewById);
            CoordinatorLayout coordinatorLayout = this.T;
            jggVar.getClass();
            jgg.c(findViewById, id, lVar, coordinatorLayout);
            return true;
        }
        if (rdgVar instanceof rdg.e) {
            jgg jggVar2 = (jgg) r1.getValue();
            View view = ((rdg.e) rdgVar).a;
            String id2 = HintId.FEED_AUTHOR_LIKED.getId();
            com.vk.movika.sdk.base.ui.m mVar = new com.vk.movika.sdk.base.ui.m(4, this, rdgVar);
            CoordinatorLayout coordinatorLayout2 = this.T;
            jggVar2.getClass();
            jgg.a(view, id2, mVar, coordinatorLayout2);
            return true;
        }
        if (!(rdgVar instanceof rdg.f)) {
            if (!(rdgVar instanceof rdg.c)) {
                return false;
            }
            Ym();
            return true;
        }
        jgg jggVar3 = (jgg) r1.getValue();
        View view2 = ((rdg.f) rdgVar).a;
        String id3 = HintId.FEED_GROUP_LIKED.getId();
        j6 j6Var = new j6(3, this, rdgVar);
        CoordinatorLayout coordinatorLayout3 = this.T;
        jggVar3.getClass();
        jgg.a(view2, id3, j6Var, coordinatorLayout3);
        return true;
    }
}
