package com.vk.ecomm.reviews.impl.communities.replies;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.StickersBridgeComponent;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.api.model.CommunityRepliesArgs;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.arf;
import xsna.b25;
import xsna.bhh;
import xsna.bt3;
import xsna.dhh;
import xsna.dhr0;
import xsna.dko;
import xsna.dnh;
import xsna.e2g0;
import xsna.eig0;
import xsna.enh;
import xsna.epx;
import xsna.f4z;
import xsna.fbh;
import xsna.fnj;
import xsna.fpf0;
import xsna.fy2;
import xsna.g0t;
import xsna.gko;
import xsna.gxh;
import xsna.hoh;
import xsna.hvt0;
import xsna.iah0;
import xsna.ies;
import xsna.ify;
import xsna.iid;
import xsna.jcr;
import xsna.jjc;
import xsna.jpf;
import xsna.jwh;
import xsna.k2g0;
import xsna.k7m;
import xsna.km50;
import xsna.kwh;
import xsna.l2g0;
import xsna.lwh;
import xsna.m7m;
import xsna.mfy;
import xsna.mhy;
import xsna.mk50;
import xsna.msy;
import xsna.mwh;
import xsna.mzp0;
import xsna.n40;
import xsna.nt8;
import xsna.nwh;
import xsna.o9;
import xsna.oz50;
import xsna.p5h;
import xsna.pff;
import xsna.pzh;
import xsna.qob;
import xsna.rzp0;
import xsna.tlo0;
import xsna.tv9;
import xsna.uwh;
import xsna.vk50;
import xsna.w1g0;
import xsna.w8i;
import xsna.wwh;
import xsna.xhg0;
import xsna.xn50;
import xsna.xzs;
import xsna.yw90;
import xsna.znk0;
import xsna.zrd0;
import xsna.zxh;

/* compiled from: CommunityRepliesFragment.kt */
/* loaded from: classes.dex */
public final class CommunityRepliesFragment extends MviImplFragment<jwh, wwh, w1g0> implements w8i, ies {
    public static final /* synthetic */ int d0 = 0;
    public final Object Q;
    public NestedScrollView R;
    public RepliesView S;
    public VkSpinner T;
    public WriteBar U;
    public ComposeView V;
    public tv9 W;
    public final jcr X;
    public final mfy Y;
    public e2g0 Z;
    public final k2g0 a0;
    public GestureDetector b0;
    public final b c0;

    /* compiled from: CommunityRepliesFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public a(CommunityRepliesArgs communityRepliesArgs) {
            super(CommunityRepliesFragment.class, null, null);
            this.j.putParcelable(fpf0.a(CommunityRepliesArgs.class).l(), communityRepliesArgs);
        }
    }

    /* compiled from: CommunityRepliesFragment.kt */
    /* loaded from: classes18.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            w1g0.i iVar = w1g0.i.b;
            CommunityRepliesFragment communityRepliesFragment = CommunityRepliesFragment.this;
            communityRepliesFragment.getClass();
            xn50.a.c(communityRepliesFragment, iVar);
            return true;
        }
    }

    /* compiled from: CommunityRepliesFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class c implements eig0, g0t {
        public c() {
        }

        @Override // xsna.eig0
        public final void a(Object obj) {
            CommunityRepliesFragment communityRepliesFragment = CommunityRepliesFragment.this;
            communityRepliesFragment.getClass();
            xn50.a.c(communityRepliesFragment, (w1g0) obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof eig0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, CommunityRepliesFragment.this, CommunityRepliesFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public CommunityRepliesFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.COMMUNITY_REVIEW_DETAIL, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.COMMUNITY_REVIEW_DETAIL).j();
        yw90Var.init();
        this.L = yw90Var;
        this.Q = msy.a(LazyThreadSafetyMode.NONE, new jpf(this, 6));
        this.W = new tv9(this, 2);
        this.X = new jcr();
        this.Y = new mfy();
        this.a0 = new k2g0(this, ((SharingComponent) ((k7m) m7m.f(this)).a(fpf0.a(SharingComponent.class))).P8(), ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).F(), new c(), ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).ob());
        this.c0 = new b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.community_review_replies_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        VkTopBar.c.f fVar;
        e2g0 e2g0Var;
        int i;
        wwh wwhVar = (wwh) ao50Var;
        this.Y.a(kn());
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.topbar);
        int i2 = 1;
        vkTopBar.setShowBottomDivider(true);
        tlo0.Companion.getClass();
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0.a.b(R.string.reviews_replies_toolbar_title), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        com.vk.core.compose.component.semantics.a aVar = null;
        Object[] objArr = 0;
        if (fnj.c(requireContext)) {
            dko.a.a(R.drawable.vk_icon_arrow_left_outline_28);
            fVar = new VkTopBar.c.f(gko.c(R.drawable.vk_icon_arrow_left_outline_28), tlo0.a.b(R.string.vk_back), new pff(this, 11), null, null, 56);
        } else {
            fVar = null;
        }
        vkTopBar.setBefore(fVar);
        WriteBar writeBar = (WriteBar) view.findViewById(R.id.comment_bar);
        this.U = writeBar;
        if (writeBar != null) {
            writeBar.setResultFragment(this);
        }
        WriteBar writeBar2 = this.U;
        if (writeBar2 != null) {
            e2g0Var = new e2g0(writeBar2, requireContext(), ((StickersBridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(StickersBridgeComponent.class))).R().a(), 2);
        } else {
            e2g0Var = null;
        }
        this.Z = e2g0Var;
        int i3 = 3;
        if (e2g0Var != null) {
            e2g0Var.c((ViewGroup) view.findViewById(R.id.root_view), (ViewGroup) view.findViewById(R.id.bottom_sheet_container), (UserId) this.Q.getValue(), new bhh(this, i3));
        }
        e2g0 e2g0Var2 = this.Z;
        if (e2g0Var2 != null) {
            e2g0Var2.m(new fbh(this, i3));
        }
        e2g0 e2g0Var3 = this.Z;
        if (e2g0Var3 != null) {
            e2g0Var3.k(new dnh(this, i3));
        }
        e2g0 e2g0Var4 = this.Z;
        if (e2g0Var4 != null) {
            e2g0Var4.l(new p5h(this, i3));
        }
        e2g0 e2g0Var5 = this.Z;
        if (e2g0Var5 != null) {
            e2g0Var5.r(new nwh(this));
        }
        VkPlaceholder vkPlaceholder = (VkPlaceholder) hvt0.c(R.id.error_placeholder, view);
        int i4 = 6;
        if (vkPlaceholder != null) {
            if (dhr0.M()) {
                i = R.drawable.vk_icon_illustration_antenna_dark_56;
                dko.a.a(R.drawable.vk_icon_illustration_antenna_dark_56);
            } else {
                i = R.drawable.vk_icon_illustration_antenna_light_56;
                dko.a.a(R.drawable.vk_icon_illustration_antenna_light_56);
            }
            vkPlaceholder.setTop(new VkPlaceholder.c.b(gko.c(i), null, null, 30));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(tlo0.a.b(R.string.reviews_replies_error_title), tlo0.a.b(R.string.reviews_error_description), aVar, 10));
            vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(tlo0.a.b(R.string.community_reviews_error_retry_btn), new enh(this, i2), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, null, 1660), (VkPlaceholder.a.C0854a) (objArr == true ? 1 : 0), i4));
        }
        RepliesView repliesView = (RepliesView) view.findViewById(R.id.reviews_container);
        this.S = repliesView;
        int i5 = 0;
        if (repliesView != null) {
            repliesView.setEventSupplier(new kwh(i5, this));
        }
        RepliesView repliesView2 = this.S;
        if (repliesView2 != null) {
            repliesView2.setStickerAttachmentClickListener(new l2g0(new lwh(this, i5), new bt3(this, 4)));
        }
        this.b0 = new GestureDetector(getActivity(), this.c0);
        RepliesView repliesView3 = this.S;
        if (repliesView3 != null) {
            repliesView3.a(new mwh(this));
        }
        this.R = (NestedScrollView) hvt0.c(R.id.dummy_sv, view);
        this.T = (VkSpinner) hvt0.c(R.id.spinner, view);
        ComposeView composeView = (ComposeView) hvt0.c(R.id.screen_spinner, view);
        composeView.setContent(znk0.e);
        this.V = composeView;
        xn50.a.b(this, wwhVar.a(), new o9(15, this, view));
        xn50.a.b(this, wwhVar.c(), new n40(this, 29));
        xn50.a.b(this, wwhVar.b(), new arf(this, i4));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        jwh jwhVar = (jwh) vk50Var;
        ((f4z) jwhVar.U()).a(new hoh(this.a0, 2), this);
        ((f4z) jwhVar.V()).a(new dhh(this, 2), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        e2g0 e2g0Var = this.Z;
        if (e2g0Var != null && e2g0Var.b()) {
            return true;
        }
        int i = ify.a;
        if (ify.e(ify.c)) {
            mhy.b(requireContext());
            return true;
        }
        xn50.a.c(this, w1g0.b.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        WriteBar writeBar;
        Target target;
        super.onActivityResult(i, i2, intent);
        if (i == 4332 && i2 == -1) {
            if (intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null) {
                return;
            }
            xn50.a.c(this, new w1g0.g(target.c));
            return;
        }
        if (i <= 10000 || (writeBar = this.U) == null) {
            return;
        }
        writeBar.onActivityResult(i, i2, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ComposeView composeView;
        FragmentActivity kn = kn();
        this.Y.getClass();
        mfy.b(kn);
        e2g0 e2g0Var = this.Z;
        if (e2g0Var != null) {
            e2g0Var.f();
        }
        tv9 tv9Var = this.W;
        if (tv9Var != null && (composeView = this.V) != null) {
            composeView.removeCallbacks(tv9Var);
        }
        this.W = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        e2g0 e2g0Var = this.Z;
        if (e2g0Var != null) {
            e2g0Var.g();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        e2g0 e2g0Var = this.Z;
        if (e2g0Var != null) {
            e2g0Var.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v11, types: [android.os.Parcelable] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        ReviewsComponent reviewsComponent = (ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class));
        pzh v3 = reviewsComponent.v3();
        xhg0 k1 = reviewsComponent.k1();
        gxh D = ((DataRepositoryComponent) ((k7m) m7m.f(this)).a(fpf0.a(DataRepositoryComponent.class))).D();
        b25 s = ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s();
        iid iidVar = new iid(((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3());
        qob qobVar = new qob(iidVar);
        nt8 nt8Var = new nt8(iidVar);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String l = fpf0.a(CommunityRepliesArgs.class).l();
            if (l == null) {
                l = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable(l, CommunityRepliesArgs.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = arguments.getParcelable(l);
                parcelable = parcelable3 instanceof CommunityRepliesArgs ? parcelable3 : null;
            }
            r3 = (CommunityRepliesArgs) parcelable;
        }
        return new jwh(r3, new uwh(((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).p().a()), new zxh(v3, k1, new fy2(D), qobVar, nt8Var, (UserId) this.Q.getValue()), this.J, s);
    }
}
