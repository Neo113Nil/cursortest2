package com.vk.ecomm.reviews.impl.communities.reviews.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.StickersBridgeComponent;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.TopBarSubscriptionManageType;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.g;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.PaymentResult;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.movika.sdk.base.observable.i;
import com.vk.movika.tools.controls.seekbar.p;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.report.api.di.ReportComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sharing.api.dto.Target;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.asp;
import xsna.azh;
import xsna.b1h;
import xsna.b3;
import xsna.b9;
import xsna.bwt0;
import xsna.bzh;
import xsna.c0i;
import xsna.crx0;
import xsna.dhr0;
import xsna.djg0;
import xsna.dko;
import xsna.dof;
import xsna.dzh;
import xsna.e2g0;
import xsna.eig0;
import xsna.f4z;
import xsna.fh9;
import xsna.fpf0;
import xsna.fto0;
import xsna.fy2;
import xsna.gko;
import xsna.go1;
import xsna.gxh;
import xsna.gzh;
import xsna.h7v;
import xsna.hvt0;
import xsna.ies;
import xsna.ify;
import xsna.iid;
import xsna.j60;
import xsna.j6e;
import xsna.ji0;
import xsna.jjc;
import xsna.jjw0;
import xsna.jm0;
import xsna.kai;
import xsna.km50;
import xsna.l2g0;
import xsna.m7m;
import xsna.mfy;
import xsna.mhy;
import xsna.mk50;
import xsna.mmf;
import xsna.msy;
import xsna.mzp0;
import xsna.n6f;
import xsna.nm0;
import xsna.nt8;
import xsna.nvg;
import xsna.oce;
import xsna.oz50;
import xsna.pj4;
import xsna.ppx0;
import xsna.q3j;
import xsna.q7;
import xsna.qj4;
import xsna.ryc;
import xsna.rzp0;
import xsna.sbg;
import xsna.tbg;
import xsna.tlo0;
import xsna.tzh;
import xsna.uxb;
import xsna.vk50;
import xsna.vua0;
import xsna.vzh;
import xsna.wh50;
import xsna.wje;
import xsna.x19;
import xsna.xcd;
import xsna.xn50;
import xsna.xy80;
import xsna.yw90;
import xsna.z8;
import xsna.zrd0;
import xsna.zrp;

/* compiled from: CommunityReviewsFragment.kt */
/* loaded from: classes.dex */
public final class CommunityReviewsFragment extends MviImplFragment<com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d, g, com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c> implements ies {
    public static final /* synthetic */ int o0 = 0;
    public e2g0 S;
    public final Object U;
    public final Object V;
    public VkContextMenu W;
    public final djg0 X;
    public final Object Y;
    public tzh Z;
    public CommunityReviewsView a0;
    public LinearLayout b0;
    public VkSpinner c0;
    public VkPlaceholder d0;
    public NestedScrollView e0;
    public ComposeView f0;
    public WriteBar g0;
    public ComposeView h0;
    public final mfy i0;
    public final wh50<TopBarSubscriptionManageType> j0;
    public ryc k0;
    public GestureDetector l0;
    public final d m0;
    public xy80 n0;
    public final c0i Q = new c0i();
    public final b9 R = new b9(this, 11);
    public final f T = new f();

    /* compiled from: CommunityReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class a extends oz50 {
        public a(CommunityReviewsArgs communityReviewsArgs) {
            super(CommunityReviewsFragment.class, null, null);
            this.j.putParcelable("COMMUNITY_REVIEWS_ARGUMENTS", communityReviewsArgs);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b EMPTY;
        public static final b ERROR;
        public static final b LOADING;

        static {
            b bVar = new b("LOADING", 0);
            LOADING = bVar;
            b bVar2 = new b("EMPTY", 1);
            EMPTY = bVar2;
            b bVar3 = new b("ERROR", 2);
            ERROR = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: CommunityReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TopBarSubscriptionManageType.values().length];
            try {
                iArr[TopBarSubscriptionManageType.WithTooltip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TopBarSubscriptionManageType.WithoutTooltip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CommunityReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (jjc.b()) {
                return true;
            }
            c.u.f fVar = c.u.f.b;
            CommunityReviewsFragment communityReviewsFragment = CommunityReviewsFragment.this;
            communityReviewsFragment.getClass();
            xn50.a.c(communityReviewsFragment, fVar);
            return true;
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes18.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ Bundle c;

        public e(Bundle bundle) {
            this.c = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CommunityReviewsFragment.this.R.c(new dzh.f(this.c));
        }
    }

    /* compiled from: CommunityReviewsFragment.kt */
    /* loaded from: classes18.dex */
    public static final class f implements dhr0.e {
        public f() {
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            int i = CommunityReviewsFragment.o0;
            CommunityReviewsFragment communityReviewsFragment = CommunityReviewsFragment.this;
            Window window = communityReviewsFragment.kn().getWindow();
            ppx0.a(window, window.getDecorView()).b(!dhr0.M());
            VkPlaceholder vkPlaceholder = communityReviewsFragment.d0;
            if (vkPlaceholder != null) {
                CommunityReviewsFragment.go(vkPlaceholder);
            }
        }
    }

    public CommunityReviewsFragment() {
        b3 b3Var = new b3(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, b3Var);
        int i = 7;
        this.V = msy.a(lazyThreadSafetyMode, new sbg(this, i));
        this.X = new djg0(new eig0() { // from class: xsna.zyh
            @Override // xsna.eig0
            public final void a(Object obj) {
                bhg0 bhg0Var = (bhg0) obj;
                if (!(bhg0Var instanceof dhg0)) {
                    int i2 = CommunityReviewsFragment.o0;
                    return;
                }
                CommunityReviewsFragment communityReviewsFragment = CommunityReviewsFragment.this;
                communityReviewsFragment.R.c(new dzh.m(((dhg0) bhg0Var).a));
                VkContextMenu vkContextMenu = communityReviewsFragment.W;
                if (vkContextMenu != null) {
                    vkContextMenu.b();
                }
            }
        });
        this.Y = msy.a(lazyThreadSafetyMode, new tbg(this, i));
        this.i0 = new mfy();
        this.j0 = k.b(TopBarSubscriptionManageType.None);
        this.k0 = new ryc(this, 2);
        this.m0 = new d();
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.COMMUNITY_REVIEWS, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.COMMUNITY_REVIEWS).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    public static void go(VkPlaceholder vkPlaceholder) {
        int i;
        if (dhr0.M()) {
            i = R.drawable.vk_icon_illustration_antenna_dark_56;
            dko.a.a(R.drawable.vk_icon_illustration_antenna_dark_56);
        } else {
            i = R.drawable.vk_icon_illustration_antenna_light_56;
            dko.a.a(R.drawable.vk_icon_illustration_antenna_light_56);
        }
        vkPlaceholder.setTop(new VkPlaceholder.c.b(gko.c(i), null, null, 30));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.community_reviews_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        g gVar = (g) ao50Var;
        dhr0.f(this.T);
        this.i0.a(kn());
        ComposeView composeView = (ComposeView) view.findViewById(R.id.topbar);
        if (composeView != null) {
            composeView.setContent(kai.b(-1992223188, new p(this, 2)));
        }
        ComposeView composeView2 = (ComposeView) hvt0.c(R.id.screen_spinner, requireView());
        composeView2.setContent(fto0.g);
        this.h0 = composeView2;
        bwt0.i0((VkButton) view.findViewById(R.id.add_review_button), new mmf(this, 11));
        WriteBar writeBar = (WriteBar) view.findViewById(R.id.comment_bar);
        this.g0 = writeBar;
        if (writeBar != null) {
            writeBar.setResultFragment(this);
        }
        WriteBar writeBar2 = this.g0;
        VkPlaceholder vkPlaceholder = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        e2g0 e2g0Var = writeBar2 != null ? new e2g0(writeBar2, requireContext(), ((StickersBridgeComponent) m7m.d(this).a(fpf0.a(StickersBridgeComponent.class))).R().a(), 2) : null;
        this.S = e2g0Var;
        if (e2g0Var != null) {
            e2g0Var.c((ViewGroup) view.findViewById(R.id.root_view), (ViewGroup) view.findViewById(R.id.bottom_sheet_container), (UserId) this.U.getValue(), new go1(this, 28));
        }
        e2g0 e2g0Var2 = this.S;
        if (e2g0Var2 != null) {
            e2g0Var2.m(new dof(this, 8));
        }
        e2g0 e2g0Var3 = this.S;
        if (e2g0Var3 != null) {
            e2g0Var3.k(new b1h(this, 4));
        }
        e2g0 e2g0Var4 = this.S;
        if (e2g0Var4 != null) {
            e2g0Var4.l(new jjw0(this, 1));
        }
        e2g0 e2g0Var5 = this.S;
        if (e2g0Var5 != null) {
            e2g0Var5.r(new bzh(this));
        }
        this.b0 = (LinearLayout) view.findViewById(R.id.add_review_ll);
        CommunityReviewsView communityReviewsView = (CommunityReviewsView) view.findViewById(R.id.reviews_container);
        this.a0 = communityReviewsView;
        if (communityReviewsView != null) {
            communityReviewsView.setEnableWrapToDisableable(true);
        }
        CommunityReviewsView communityReviewsView2 = this.a0;
        if (communityReviewsView2 != null) {
            xy80 xy80Var = this.n0;
            if (xy80Var == null) {
                xy80Var = null;
            }
            communityReviewsView2.setOrientationListener(xy80Var);
        }
        this.l0 = new GestureDetector(getActivity(), this.m0);
        CommunityReviewsView communityReviewsView3 = this.a0;
        if (communityReviewsView3 != null) {
            communityReviewsView3.a(new azh(this));
        }
        CommunityReviewsView communityReviewsView4 = this.a0;
        if (communityReviewsView4 != null) {
            communityReviewsView4.setCommunityReviewsViewSupplierEvents(new q7(this, 14));
        }
        CommunityReviewsView communityReviewsView5 = this.a0;
        if (communityReviewsView5 != null) {
            communityReviewsView5.setStickerAttachmentClickListener(new l2g0(new j6e(this, 9), new uxb(this, 2)));
        }
        this.c0 = (VkSpinner) hvt0.c(R.id.spinner, view);
        VkPlaceholder vkPlaceholder2 = (VkPlaceholder) hvt0.c(R.id.error_placeholder, view);
        if (vkPlaceholder2 != null) {
            go(vkPlaceholder2);
            tlo0.Companion.getClass();
            vkPlaceholder2.setMiddle(new VkPlaceholder.b((tlo0) (objArr2 == true ? 1 : 0), (tlo0) tlo0.a.b(R.string.community_reviews_error_title), com.vk.core.compose.component.semantics.b.a(null, new i(20), 3), 3));
            vkPlaceholder2.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(tlo0.a.b(R.string.community_reviews_error_retry_btn), new ji0(this, 29), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, com.vk.core.compose.component.semantics.b.a(null, new j60(16), 3), 636), (VkPlaceholder.a.C0854a) (objArr == true ? 1 : 0), 6));
            vkPlaceholder = vkPlaceholder2;
        }
        this.d0 = vkPlaceholder;
        this.e0 = (NestedScrollView) hvt0.c(R.id.dummy_sv, view);
        this.f0 = (ComposeView) hvt0.c(R.id.empty_screen_view, view);
        xn50.a.b(this, gVar.a(), new oce(this, 8));
        xn50.a.b(this, gVar.b(), new com.vk.movika.sdk.base.observable.g(this, 26));
        xn50.a.b(this, gVar.d(), new xcd(this, 9));
        xn50.a.b(this, gVar.c(), new wje(this, 7));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) vk50Var;
        ((f4z) dVar.V()).a(new nvg(this, 6), this);
        ((f4z) dVar.U()).a(new jm0(this, 17), this);
        ((f4z) dVar.W()).a(new n6f(this, 5), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        e2g0 e2g0Var = this.S;
        if (e2g0Var != null && e2g0Var.b()) {
            return true;
        }
        int i = ify.a;
        if (ify.e(ify.c)) {
            mhy.b(requireContext());
            return true;
        }
        finish();
        return true;
    }

    public final CommunityReviewsArgs fo() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("COMMUNITY_REVIEWS_ARGUMENTS", CommunityReviewsArgs.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("COMMUNITY_REVIEWS_ARGUMENTS");
                if (!(parcelable3 instanceof CommunityReviewsArgs)) {
                    parcelable3 = null;
                }
                parcelable = (CommunityReviewsArgs) parcelable3;
            }
            CommunityReviewsArgs communityReviewsArgs = (CommunityReviewsArgs) parcelable;
            if (communityReviewsArgs != null) {
                return communityReviewsArgs;
            }
        }
        return new CommunityReviewsArgs(null, null, null, 7, null);
    }

    public final void ho(b bVar) {
        EditText input;
        CommunityReviewsView communityReviewsView = this.a0;
        if (communityReviewsView != null) {
            communityReviewsView.b();
        }
        CommunityReviewsView communityReviewsView2 = this.a0;
        if (communityReviewsView2 != null) {
            bwt0.p0(communityReviewsView2, false);
        }
        WriteBar writeBar = this.g0;
        if (writeBar != null) {
            bwt0.p0(writeBar, false);
        }
        WriteBar writeBar2 = this.g0;
        if (writeBar2 != null && (input = writeBar2.getInput()) != null) {
            crx0.E(input, false);
        }
        NestedScrollView nestedScrollView = this.e0;
        if (nestedScrollView != null) {
            bwt0.p0(nestedScrollView, bVar == b.ERROR || bVar == b.EMPTY);
        }
        VkPlaceholder vkPlaceholder = this.d0;
        if (vkPlaceholder != null) {
            bwt0.p0(vkPlaceholder, bVar == b.ERROR);
        }
        ComposeView composeView = this.f0;
        if (composeView != null) {
            bwt0.p0(composeView, bVar == b.EMPTY);
        }
        VkSpinner vkSpinner = this.c0;
        if (vkSpinner != null) {
            bwt0.p0(vkSpinner, bVar == b.LOADING);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        WriteBar writeBar;
        PaymentResult paymentResult;
        String stringExtra;
        Bundle bundleExtra;
        Target target;
        super.onActivityResult(i, i2, intent);
        if (i == 4332 && i2 == -1) {
            if (intent == null || (target = (Target) intent.getParcelableExtra("result_target")) == null) {
                return;
            }
            xn50.a.c(this, new c.u.C1016c(target.c));
            return;
        }
        if (i2 == -1 && i == 33) {
            if (intent == null || (bundleExtra = intent.getBundleExtra("COMMUNITY_REVIEWS_EXTRA")) == null || !bundleExtra.getBoolean("reply_list_was_changed")) {
                return;
            }
            xn50.a.c(this, c.s.b);
            return;
        }
        if (i != 1998) {
            if (i <= 10000 || (writeBar = this.g0) == null) {
                return;
            }
            writeBar.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            xn50.a.c(this, new c.r.g(PaymentResult.CANCEL));
            return;
        }
        if (intent == null || (stringExtra = intent.getStringExtra("PAYMENT_RESULT_KEY")) == null || (paymentResult = PaymentResult.valueOf(stringExtra)) == null) {
            paymentResult = PaymentResult.CANCEL;
        }
        xn50.a.c(this, new c.r.g(paymentResult));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = kn().getWindow();
        ppx0.a(window, window.getDecorView()).b(!dhr0.M());
        getChildFragmentManager().l0("create_community_review_result", this, new pj4(this, 15));
        getChildFragmentManager().l0("pin_review_details_screen_result_key", this, new z8(this, 9));
        getChildFragmentManager().l0("connect_yclients_reviews", this, new qj4(this, 7));
        this.n0 = new xy80(kn());
        this.Z = new tzh(this, ((ReportComponent) m7m.d(this).mo408a(fpf0.a(ReportComponent.class))).d4(), ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).Md(), ((SharingComponent) m7m.d(this).a(fpf0.a(SharingComponent.class))).P8(), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).F(), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).p().e());
        this.R.c(new dzh.e(getArguments()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ComposeView composeView;
        dhr0.a.getClass();
        dhr0.X(this.T);
        e2g0 e2g0Var = this.S;
        if (e2g0Var != null) {
            e2g0Var.f();
        }
        FragmentActivity kn = kn();
        this.i0.getClass();
        mfy.b(kn);
        ryc rycVar = this.k0;
        if (rycVar != null && (composeView = this.h0) != null) {
            composeView.removeCallbacks(rycVar);
        }
        this.k0 = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        e2g0 e2g0Var = this.S;
        if (e2g0Var != null) {
            e2g0Var.g();
        }
        xy80 xy80Var = this.n0;
        if (xy80Var == null) {
            xy80Var = null;
        }
        xy80Var.disable();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xy80 xy80Var = this.n0;
        if (xy80Var == null) {
            xy80Var = null;
        }
        xy80Var.enable();
        e2g0 e2g0Var = this.S;
        if (e2g0Var != null) {
            e2g0Var.h();
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        UserId d2 = fo().d();
        if (d2 == null) {
            d2 = UserId.d;
        }
        com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f fVar = new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.f(new vzh(d2, fo().f(), fo().e()), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).p().a());
        UserId d3 = fo().d();
        if (d3 == null) {
            d3 = UserId.d;
        }
        q3j q3jVar = new q3j(d3);
        gxh D = ((DataRepositoryComponent) m7m.d(this).a(fpf0.a(DataRepositoryComponent.class))).D();
        return new com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d(fVar, ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).qb(), new gzh(((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).v3(), ((ReviewsComponent) m7m.d(this).a(fpf0.a(ReviewsComponent.class))).k1(), new fh9(vua0.b(), x19.t()), new fy2(D), new nt8(new iid(((AttachmentMappersComponent) m7m.d(this).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3())), (UserId) this.U.getValue()), this.J, q3jVar, ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s(), (h7v) this.V.getValue(), new nm0(8));
    }
}
