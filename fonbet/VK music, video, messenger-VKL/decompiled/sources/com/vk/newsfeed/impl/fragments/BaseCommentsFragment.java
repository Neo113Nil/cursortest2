package com.vk.newsfeed.impl.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.common.links.AwayLink;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.refresh.BottomSwipePaginatedView;
import com.vk.core.ui.refresh.BottomSwipeRefreshLayout;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.feed.design.view.newsfeed.reply.ReplyBarPlaceholderView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.impl.replybar.ReplyBarGravityBehavior;
import com.vk.newsfeed.impl.views.NoSwipePaginatedView;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.webapp.fragments.ReportFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.awt0;
import xsna.bd70;
import xsna.bfg;
import xsna.bja0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c3g0;
import xsna.cc6;
import xsna.ce60;
import xsna.cy0;
import xsna.dg;
import xsna.f4m;
import xsna.fxc0;
import xsna.g2v;
import xsna.g420;
import xsna.gzs;
import xsna.hd60;
import xsna.hg;
import xsna.hsx0;
import xsna.iag;
import xsna.iah0;
import xsna.ify;
import xsna.ikv0;
import xsna.izs;
import xsna.l7s;
import xsna.lb6;
import xsna.ljf0;
import xsna.m3g0;
import xsna.m84;
import xsna.mdg;
import xsna.mhy;
import xsna.o4l0;
import xsna.p870;
import xsna.pkv0;
import xsna.qaz;
import xsna.qjc;
import xsna.rl3;
import xsna.s3q0;
import xsna.too0;
import xsna.u3g0;
import xsna.xk;
import xsna.y8g0;
import xsna.zal0;
import xsna.zx;

/* compiled from: BaseCommentsFragment.kt */
/* loaded from: classes4.dex */
public abstract class BaseCommentsFragment<P extends cc6> extends BaseFragment implements bfg<P>, too0, hsx0 {
    public static final int l0 = y8g0.a(R.dimen.vk_bottom_navigation_height);
    public mdg S;
    public CoordinatorLayout T;
    public ViewGroup U;
    public AppBarLayout V;
    public RecyclerPaginatedView W;
    public u3g0 X;
    public View Y;
    public g420 Z;
    public ReplyBarPlaceholderView a0;
    public View b0;
    public PopupStickerView c0;
    public View d0;
    public final int[] e0 = {0, 0};
    public final Handler f0 = new Handler(Looper.getMainLooper());
    public boolean g0 = true;
    public final io.reactivex.rxjava3.disposables.b h0 = new io.reactivex.rxjava3.disposables.b();
    public final ljf0 i0;
    public final bpn0 j0;
    public final BaseCommentsFragment<P>.b k0;

    /* compiled from: BaseCommentsFragment.kt */
    public final class b implements bd70<Photo> {
        public b() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, Photo photo) {
            mdg mdgVar;
            Photo photo2 = photo;
            BaseCommentsFragment<P> baseCommentsFragment = BaseCommentsFragment.this;
            if (i != 130) {
                if (i == 131 && (mdgVar = baseCommentsFragment.S) != null) {
                    mdgVar.a8(photo2);
                    return;
                }
                return;
            }
            mdg mdgVar2 = baseCommentsFragment.S;
            if (mdgVar2 != null) {
                mdgVar2.Y7(photo2);
            }
        }
    }

    /* compiled from: BaseCommentsFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ((BaseCommentsFragment) this.receiver).to(num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: BaseCommentsFragment.kt */
    public static final class e implements ify.a {
        public final /* synthetic */ gzs<s3q0> b;

        public e(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
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

    public BaseCommentsFragment() {
        ljf0 ljf0Var = new ljf0(new a());
        ljf0Var.b.add(new c());
        this.i0 = ljf0Var;
        this.j0 = new bpn0(new hg(this, 6));
        this.k0 = new b();
    }

    @Override // xsna.bfg
    public final void Ah() {
        uo(mo(), 0);
    }

    public void B3() {
        View view = this.Y;
        if (view != null) {
            bwt0.p0(view, false);
        }
    }

    public u3g0 Bf() {
        return this.X;
    }

    public void Cd(final UserId userId, String str, final LinkButton linkButton) {
        ReplyBarPlaceholderView replyBarPlaceholderView = this.a0;
        if (replyBarPlaceholderView != null) {
            replyBarPlaceholderView.setImage(R.drawable.vk_icon_illustration_donut_coin_banner_48h);
        }
        if (str == null || linkButton == null) {
            ReplyBarPlaceholderView replyBarPlaceholderView2 = this.a0;
            if (replyBarPlaceholderView2 != null) {
                replyBarPlaceholderView2.setText(str);
                return;
            }
            return;
        }
        String str2 = linkButton.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        int length2 = str2.length() + length;
        spannableStringBuilder.append((CharSequence) str2);
        qaz qazVar = new qaz(new qjc.a() { // from class: xsna.kb6
            @Override // xsna.qjc.a
            public final void I(AwayLink awayLink) {
                int i = BaseCommentsFragment.l0;
                FragmentActivity activity = BaseCommentsFragment.this.getActivity();
                if (activity != null) {
                    di60.w(linkButton.c, activity, null, null, null, null, 62);
                }
                b.d dVar = new b.d("donut_click_pay");
                dVar.b("replies_placeholder", "source");
                dVar.b(userId, "owner_id");
                dVar.e();
            }
        });
        qazVar.b = true;
        spannableStringBuilder.setSpan(qazVar, length, length2, 33);
        ReplyBarPlaceholderView replyBarPlaceholderView3 = this.a0;
        if (replyBarPlaceholderView3 != null) {
            replyBarPlaceholderView3.setText(spannableStringBuilder);
        }
    }

    public Integer Ck() {
        u3g0 Bf = Bf();
        if (Bf == null || !f4m.h(Bf.e)) {
            return null;
        }
        return Integer.valueOf(l0);
    }

    public void I9() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.b();
        }
    }

    public void Ic(boolean z) {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.Ic(z);
        }
    }

    @Override // xsna.bfg
    public boolean L7() {
        return false;
    }

    @Override // xsna.bfg
    public final void Lm(iag iagVar) {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        mdg mdgVar = this.S;
        xo(mo2getContext, mo2getContext.getString(iagVar.z3() ? R.string.comment_thread_deleted : R.string.comment_thread_restored), (mdgVar == null || !iagVar.z3()) ? null : new lb6(0, mdgVar, iagVar));
    }

    public void Nh(UserId userId, String str) {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.Nh(userId, str);
        }
    }

    @Override // xsna.bfg
    public final boolean Pj() {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        BottomSwipePaginatedView bottomSwipePaginatedView = recyclerPaginatedView instanceof BottomSwipePaginatedView ? (BottomSwipePaginatedView) recyclerPaginatedView : null;
        if (bottomSwipePaginatedView == null) {
            return false;
        }
        BottomSwipeRefreshLayout bottomSwipeRefreshLayout = bottomSwipePaginatedView.N;
        return (bottomSwipeRefreshLayout != null ? bottomSwipeRefreshLayout : null).K;
    }

    public void Ql(PopupStickerAnimation popupStickerAnimation, o4l0 o4l0Var) {
        PopupStickerView popupStickerView;
        ej();
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            popupStickerView = new PopupStickerView(mo2getContext, null, 0, 14, 0);
        } else {
            popupStickerView = null;
        }
        this.c0 = popupStickerView;
        if (popupStickerView == null) {
            return;
        }
        popupStickerView.setLoadingCallback(o4l0Var);
        PopupStickerView popupStickerView2 = this.c0;
        if (popupStickerView2 != null) {
            PopupStickerView.d(popupStickerView2, popupStickerAnimation, false, null, 12);
        }
        ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.U;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.c0, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // xsna.bfg
    public void Rb(int i) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        uo(i, i < ((recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) + (-1) ? iah0.a(48.0f) : 0);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public void Rn() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.j(false);
        }
        u3g0 Bf2 = Bf();
        if (Bf2 != null) {
            Bf2.Ic(false);
        }
    }

    public void V0() {
        ReplyBarPlaceholderView replyBarPlaceholderView = this.a0;
        if (replyBarPlaceholderView != null) {
            bwt0.p0(replyBarPlaceholderView, true);
        }
    }

    public boolean W1() {
        u3g0 Bf = Bf();
        if (Bf != null) {
            return f4m.h(Bf.e);
        }
        return false;
    }

    @Override // xsna.bfg
    public final void Xh(String str, ArrayList arrayList) {
        WriteBar writeBar;
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.b();
            WriteBar writeBar2 = Bf.e;
            if (writeBar2 != null) {
                writeBar2.setStickersSuggestEnabled(false);
            }
            WriteBar writeBar3 = Bf.e;
            if (writeBar3 != null) {
                writeBar3.setEmojiAllowed(false);
            }
            View view = Bf.i;
            if (view != null) {
                u3g0.B(view, false);
            }
            if (fxc0.B().J().h0() && (writeBar = Bf.e) != null) {
                writeBar.Q();
            }
            Bf.d(str, arrayList);
            c3g0.gg(Bf, null, 1);
        }
    }

    @Override // xsna.bfg
    public final void Za(iag iagVar) {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        mdg mdgVar = this.S;
        xo(mo2getContext, mo2getContext.getString(iagVar.d5() ? R.string.comment_action_sb_added_to_blacklist : iagVar.wa() ? R.string.comment_action_sb_removed_from_blacklist_f : R.string.comment_action_sb_removed_from_blacklist_m, iagVar.y1()), (mdgVar == null || !iagVar.d5()) ? null : new xk(3, mdgVar, iagVar));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public boolean a0() {
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

    @Override // xsna.bfg
    public void d0() {
        mhy.b(super.mo2getContext());
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.clearFocus();
        }
    }

    @Override // xsna.bfg
    public final void d6(int i) {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            zal0.H(g2v.d().a(), mo2getContext, i, GiftData.d, null, "comment", null, 96);
        }
    }

    public void ej() {
        ViewGroup viewGroup;
        PopupStickerView popupStickerView = this.c0;
        if (popupStickerView != null) {
            if ((popupStickerView != null ? popupStickerView.getParent() : null) == null || (viewGroup = this.U) == null) {
                return;
            }
            viewGroup.removeView(this.c0);
        }
    }

    @Override // xsna.bfg
    public final void f6(boolean z) {
        this.g0 = z;
    }

    @Override // xsna.bfg
    public final com.vk.lists.c gj(c.h hVar) {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (hVar.f == null) {
            hVar.f = recyclerPaginatedView.getDataInfoProvider();
        }
        return hVar.a();
    }

    public void io(final int i) {
        RecyclerView recyclerView;
        View view;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
        final int a2 = (findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null) ? iah0.a(72.0f) : view.getHeight();
        int[] iArr = this.e0;
        recyclerView.getLocationOnScreen(iArr);
        final int a0 = rl3.a0(iArr);
        View view2 = this.b0;
        final int bottom = view2 != null ? view2.getBottom() : iah0.f().heightPixels;
        u3g0 Bf = Bf();
        if (Bf != null) {
            gzs gzsVar = new gzs() { // from class: xsna.jb6
                @Override // xsna.gzs
                public final Object invoke() {
                    int i2 = BaseCommentsFragment.l0;
                    BaseCommentsFragment baseCommentsFragment = BaseCommentsFragment.this;
                    u3g0 Bf2 = baseCommentsFragment.Bf();
                    int h = Bf2 != null ? Bf2.h() : 0;
                    int i3 = ify.a;
                    linearLayoutManager.K(i, (((bottom - (ify.e(ify.c) ? baseCommentsFragment.lo() : 0)) - a2) - h) - a0);
                    return s3q0.a;
                }
            };
            WriteBar writeBar = Bf.e;
            if (writeBar != null) {
                awt0.t(writeBar, gzsVar);
            }
        }
    }

    @Override // xsna.bfg
    public final void jl() {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        xo(mo2getContext, mo2getContext.getString(R.string.comment_action_sb_report_sent), null);
    }

    public long jo() {
        return 0L;
    }

    public void k0() {
        WriteBar writeBar;
        u3g0 Bf = Bf();
        if (Bf == null) {
            return;
        }
        WriteBar writeBar2 = Bf.e;
        if (writeBar2 != null) {
            writeBar2.setVisibility(Bf.o);
        }
        CoordinatorLayout coordinatorLayout = this.T;
        if (coordinatorLayout == null || (writeBar = Bf.e) == null) {
            return;
        }
        coordinatorLayout.B(writeBar);
    }

    @Override // xsna.bfg
    public final void k6(boolean z) {
        WriteBar writeBar;
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.b();
            if (fxc0.B().J().h0() && (writeBar = Bf.e) != null) {
                writeBar.c0();
            }
            WriteBar writeBar2 = Bf.e;
            if (writeBar2 != null) {
                writeBar2.setStickersSuggestEnabled(true);
            }
            WriteBar writeBar3 = Bf.e;
            if (writeBar3 != null) {
                writeBar3.setEmojiAllowed(true);
            }
            View view = Bf.i;
            if (view != null) {
                u3g0.B(view, true);
            }
            if (z) {
                mhy.d(Bf.e);
                Bf.clearFocus();
            }
        }
    }

    public final Integer ko() {
        return (Integer) this.j0.getValue();
    }

    public int lo() {
        return ify.d(3, null);
    }

    public abstract int mo();

    public void no(View view) {
        View findViewById = view.findViewById(R.id.bottom_navigation_shadow);
        po((ReplyBarGravityBehavior) ((CoordinatorLayout.f) findViewById.getLayoutParams()).a);
        this.d0 = findViewById;
    }

    public void o0() {
        ReplyBarPlaceholderView replyBarPlaceholderView = this.a0;
        if (replyBarPlaceholderView != null) {
            bwt0.p0(replyBarPlaceholderView, false);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ce60 ce60Var = ce60.b;
        ce60Var.getClass();
        p870 f = p870.f();
        BaseCommentsFragment<P>.b bVar = this.k0;
        f.b(130, bVar);
        ce60Var.getClass();
        p870.f().b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        CharSequence charSequence;
        Integer ko = ko();
        if (ko != null) {
            LayoutInflater cloneInContext = layoutInflater.cloneInContext(new l7s(requireContext(), ko.intValue()));
            if (cloneInContext != null) {
                layoutInflater = cloneInContext;
            }
        }
        View ro = ro(layoutInflater, viewGroup);
        this.T = (CoordinatorLayout) ro.findViewById(R.id.container);
        this.U = (ViewGroup) ro.findViewById(R.id.bottom_sheet_container);
        FragmentActivity activity = getActivity();
        this.b0 = activity != null ? activity.findViewById(R.id.bottom_nav_content) : null;
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) ro.findViewById(R.id.rpb_list);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        Bundle arguments = getArguments();
        if (arguments != null && (charSequence = arguments.getCharSequence("custom_title")) != null) {
            NoSwipePaginatedView noSwipePaginatedView = recyclerPaginatedView instanceof NoSwipePaginatedView ? (NoSwipePaginatedView) recyclerPaginatedView : null;
            if (noSwipePaginatedView != null) {
                noSwipePaginatedView.setTitle(charSequence);
            }
        }
        this.W = recyclerPaginatedView;
        this.V = (AppBarLayout) ro.findViewById(R.id.attach_appbar_layout);
        no(ro);
        this.Y = ro.findViewById(R.id.jump_to_end);
        oo(ro);
        View findViewById = ro.findViewById(R.id.toolbar);
        if (findViewById != null) {
            bwt0.i0(findViewById, new dg(this, 9));
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.W;
        if (recyclerPaginatedView2 != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null) {
            recyclerView.addOnScrollListener(this.i0);
        }
        this.a0 = (ReplyBarPlaceholderView) ro.findViewById(R.id.replybar_placeholder);
        return ro;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onDestroy() {
        ce60.b.getClass();
        p870.f().g(this.k0);
        this.h0.dispose();
        ej();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            recyclerView.removeOnScrollListener(this.i0);
        }
        this.W = null;
        vo(null);
        this.Y = null;
        g420 g420Var = this.Z;
        if (g420Var != null) {
            g420Var.onDestroyView();
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.h0.dispose();
        ej();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        u3g0 Bf = Bf();
        Bundle o = Bf != null ? Bf.o() : null;
        if (o != null) {
            bundle.putBundle("STATE_REPLY_BAR_VIEW", o);
        }
    }

    public void oo(View view) {
        mdg mdgVar = this.S;
        if (mdgVar != null) {
            g420 D0 = hd60.a().D0(mdgVar);
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
            D0.f();
            coordinatorLayout.addView(D0.d(coordinatorLayout, null));
            this.Z = D0;
        }
    }

    public void po(ReplyBarGravityBehavior replyBarGravityBehavior) {
        replyBarGravityBehavior.b = new d(1, this, BaseCommentsFragment.class, "onReplyBarHeightChanged", "onReplyBarHeightChanged(I)V", 0);
    }

    public boolean qo() {
        return false;
    }

    @Override // xsna.bfg
    public final void r1(bja0.a aVar) {
        cy0 cy0Var = new cy0(2, aVar, this);
        int i = ify.a;
        if (!ify.e(ify.c)) {
            cy0Var.invoke();
        } else {
            mhy.b(getActivity());
            ho(300L, cy0Var);
        }
    }

    public abstract View ro(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // xsna.bfg
    public final void s() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public void so(final gzs<s3q0> gzsVar) {
        int i = ify.a;
        if (ify.e(ify.c)) {
            gzsVar.invoke();
            return;
        }
        final e eVar = new e(gzsVar);
        ify.a(eVar);
        u3g0 Bf = Bf();
        if (Bf != null) {
            final Handler handler = this.f0;
            c3g0.gg(Bf, new ResultReceiver(handler) { // from class: com.vk.newsfeed.impl.fragments.BaseCommentsFragment$onKeyboardOpened$1
                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i2, Bundle bundle) {
                    if (i2 == 1 || i2 == 3) {
                        int i3 = ify.a;
                        ify.g(BaseCommentsFragment.e.this);
                        gzsVar.invoke();
                    }
                }
            }, 2);
        }
    }

    @Override // xsna.bfg
    public boolean t2() {
        return true;
    }

    public void to(int i) {
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setPadding(0, 0, 0, i);
        }
    }

    @Override // xsna.bfg
    public final void u1(com.vk.lists.c cVar) {
        cVar.b(this.W, true, true, jo(), null);
    }

    public final void uo(int i, int i2) {
        AppBarLayout appBarLayout;
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.W;
        RecyclerView.o layoutManager = (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        if (mo() == i && (appBarLayout = this.V) != null) {
            appBarLayout.g(false, false, true);
        }
        linearLayoutManager.K(i, i2);
    }

    public void vo(u3g0 u3g0Var) {
        this.X = u3g0Var;
    }

    @Override // xsna.bfg
    public void wf(int i) {
        uo(i, 0);
    }

    public boolean wo(int i) {
        return i == 0;
    }

    public void x(int i) {
        u3g0 Bf = Bf();
        if (Bf != null) {
            Bf.x(i);
        }
    }

    public final void xo(Context context, String str, gzs<s3q0> gzsVar) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.e = 4000L;
        if (gzsVar != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.comment_action_sb_cancel), new zx(gzsVar, 7));
            aVar.e = 10000L;
        }
        ikv0 f = pkv0.f(aVar);
        if (f != null) {
            pkv0.b(f, this);
        }
    }

    public void y2() {
        WriteBar writeBar;
        u3g0 Bf = Bf();
        if (Bf == null) {
            return;
        }
        ViewGroup viewGroup = this.U;
        if (viewGroup != null) {
            Bf.u(viewGroup);
        }
        WriteBar writeBar2 = Bf.e;
        if (writeBar2 != null) {
            bwt0.p0(writeBar2, true);
        }
        CoordinatorLayout coordinatorLayout = this.T;
        if (coordinatorLayout == null || (writeBar = Bf.e) == null) {
            return;
        }
        coordinatorLayout.B(writeBar);
    }

    @Override // xsna.bfg
    public final void y5(iag iagVar) {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        mdg mdgVar = this.S;
        xo(mo2getContext, mo2getContext.getString(iagVar.i3() ? R.string.comment_action_sb_deleted_all_for_week : R.string.comment_action_sb_restored_all_for_week), (mdgVar == null || !iagVar.i3()) ? null : new m84(1, mdgVar, iagVar));
    }

    @Override // xsna.bfg
    public final void y7(ReportFragment.a aVar) {
        aVar.g(4330, this);
    }

    @Override // xsna.bfg
    public void A7() {
    }

    public void D() {
    }

    @Override // xsna.bfg
    public void Df() {
    }

    @Override // xsna.bfg
    public void P5() {
    }

    @Override // xsna.bfg
    public final FragmentImpl g() {
        return this;
    }

    @Override // xsna.bfg
    public void nf() {
    }

    @Override // xsna.bfg
    public void s2() {
    }

    @Override // xsna.bfg
    public void ub() {
    }

    @Override // xsna.bfg
    public void Ch(String str) {
    }

    @Override // xsna.bfg
    public void ua(boolean z) {
    }

    /* compiled from: BaseCommentsFragment.kt */
    public final class a implements AbsListView.OnScrollListener {
        public boolean b;

        public a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            boolean z = this.b;
            BaseCommentsFragment<P> baseCommentsFragment = BaseCommentsFragment.this;
            boolean z2 = baseCommentsFragment.wo(i) || i + i2 >= i3 - 1;
            this.b = z2;
            if (z != z2) {
                baseCommentsFragment.B2(!z2);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* compiled from: BaseCommentsFragment.kt */
    public final class c implements AbsListView.OnScrollListener {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            BaseCommentsFragment<P> baseCommentsFragment = BaseCommentsFragment.this;
            if (!baseCommentsFragment.g0) {
                RecyclerPaginatedView recyclerPaginatedView = baseCommentsFragment.W;
                BottomSwipePaginatedView bottomSwipePaginatedView = recyclerPaginatedView instanceof BottomSwipePaginatedView ? (BottomSwipePaginatedView) recyclerPaginatedView : null;
                if (bottomSwipePaginatedView != null) {
                    bottomSwipePaginatedView.setReversed(false);
                    return;
                }
                return;
            }
            Object[] objArr = i < i3 - (i2 + i);
            RecyclerPaginatedView recyclerPaginatedView2 = baseCommentsFragment.W;
            BottomSwipePaginatedView bottomSwipePaginatedView2 = recyclerPaginatedView2 instanceof BottomSwipePaginatedView ? (BottomSwipePaginatedView) recyclerPaginatedView2 : null;
            if (bottomSwipePaginatedView2 != null) {
                BottomSwipeRefreshLayout bottomSwipeRefreshLayout = bottomSwipePaginatedView2.N;
                if ((bottomSwipeRefreshLayout == null ? null : bottomSwipeRefreshLayout).K && objArr == true) {
                    bottomSwipePaginatedView2.setReversed(false);
                    return;
                }
                if ((bottomSwipeRefreshLayout != null ? bottomSwipeRefreshLayout : null).K || objArr == true) {
                    return;
                }
                bottomSwipePaginatedView2.setReversed(true);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    @Override // xsna.bfg
    public void Ec(UserId userId, NewsComment newsComment) {
    }
}
