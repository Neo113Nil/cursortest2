package com.vk.superapp.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.interop.model.ContentScale;
import com.vk.lists.ListDataSet;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.queuesync.di.SuperAppQueueComponent;
import com.vk.superapp.animation.SuperAppAnimation;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.superapp.di.SuperAppServicesComponent;
import com.vk.superapp.dto.ListData;
import com.vk.superapp.dto.WidgetSettingsModalOpenSource;
import com.vk.superapp.miniapps.api.di.SuperAppMiniAppsComponent;
import com.vk.superapp.ui.SuperAppItemDecoration;
import com.vk.superapp.ui.views.SuperAppRecyclerView;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vkhealth.permissions.api.type.MobileServicesType;
import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import com.vk.superapp.widget_settings.p004new.a;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aes;
import xsna.av70;
import xsna.awt0;
import xsna.ayu0;
import xsna.b0u0;
import xsna.b990;
import xsna.bpc0;
import xsna.bpn0;
import xsna.bv3;
import xsna.bwt0;
import xsna.c7n0;
import xsna.c9m0;
import xsna.cck0;
import xsna.cn70;
import xsna.d7l0;
import xsna.dhr0;
import xsna.e3m;
import xsna.e4;
import xsna.ece0;
import xsna.epj0;
import xsna.exi0;
import xsna.f4m;
import xsna.f540;
import xsna.fan0;
import xsna.fdv;
import xsna.fnj;
import xsna.fpf0;
import xsna.g7n0;
import xsna.g8n0;
import xsna.gjf0;
import xsna.gko;
import xsna.hk70;
import xsna.hvt0;
import xsna.i0b0;
import xsna.i8n0;
import xsna.iah0;
import xsna.ikv0;
import xsna.in60;
import xsna.ipi;
import xsna.iut0;
import xsna.j8n0;
import xsna.l8n0;
import xsna.lbs;
import xsna.lpj;
import xsna.m7m;
import xsna.mlf0;
import xsna.mqe0;
import xsna.msy;
import xsna.mz80;
import xsna.mzp0;
import xsna.o25;
import xsna.ow90;
import xsna.pcn0;
import xsna.pvh0;
import xsna.qhh0;
import xsna.rru;
import xsna.rzp0;
import xsna.s530;
import xsna.snx;
import xsna.sts;
import xsna.t810;
import xsna.tho0;
import xsna.tlo0;
import xsna.u110;
import xsna.v6j;
import xsna.v7n0;
import xsna.v9n0;
import xsna.vlw;
import xsna.vpj0;
import xsna.x1q0;
import xsna.x8h0;
import xsna.x9n0;
import xsna.xds;
import xsna.xvj0;
import xsna.y1z;
import xsna.yw90;
import xsna.zhf0;
import xsna.zif0;
import xsna.zjq;
import xsna.zrd0;

/* compiled from: SuperAppFragment.kt */
/* loaded from: classes11.dex */
public final class SuperAppFragment extends BaseMvpFragment<v7n0> implements qhh0, aes, dhr0.e, xds {
    public static final /* synthetic */ int o0 = 0;
    public final b T;
    public AppBarLayout U;
    public View V;
    public VkTopBar W;
    public RecyclerView X;
    public SuperAppRecyclerView Y;
    public fdv Z;
    public AppBarLayout a0;
    public c7n0 b0;
    public ikv0 c0;
    public final g7n0 d0;
    public ArrayList e0;
    public SuperAppAnimation f0;
    public int g0;
    public boolean h0;
    public SuperAppAnimation.b i0;
    public final Object j0;
    public final bpn0 k0;
    public final bpn0 l0;
    public final Object m0;
    public final bpn0 n0;

    /* compiled from: SuperAppFragment.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MobileServicesType.values().length];
            try {
                iArr[MobileServicesType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileServicesType.HUAWEI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileServicesType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FragmentWithGlobalSearch$TargetAction.values().length];
            try {
                iArr2[FragmentWithGlobalSearch$TargetAction.LongTap.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FragmentWithGlobalSearch$TargetAction.HeaderSearchIconClick.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FragmentWithGlobalSearch$TargetAction.HeaderSearchQueryViewClick.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProfileNavigationInfo.SecurityRecommendationIndicator.values().length];
            try {
                iArr3[ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING_WELL_PROTECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProfileNavigationInfo.SecurityRecommendationIndicator.CRITICAL_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProfileNavigationInfo.SecurityRecommendationIndicator.NORMAL_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: SuperAppFragment.kt */
    /* loaded from: classes6.dex */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: View.kt */
    /* loaded from: classes6.dex */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            SuperAppFragment superAppFragment = SuperAppFragment.this;
            AppBarLayout appBarLayout = superAppFragment.U;
            ViewGroup.LayoutParams layoutParams = appBarLayout != null ? appBarLayout.getLayoutParams() : null;
            CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
            Object obj = fVar != null ? fVar.a : null;
            AppBarLayout.Behavior behavior = obj instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) obj : null;
            d dVar = superAppFragment.new d();
            if (behavior != null) {
                behavior.p = dVar;
            }
        }
    }

    /* compiled from: SuperAppFragment.kt */
    /* loaded from: classes6.dex */
    public static final class d extends AppBarLayout.Behavior.a {
        public d() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
        public final boolean a() {
            return SuperAppFragment.this.h0;
        }
    }

    public SuperAppFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        int i = 0;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.SUPERAPP, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.SUPERAPP).j();
        On().init();
        this.T = new b();
        this.d0 = new g7n0();
        this.g0 = 3;
        this.h0 = true;
        in60 in60Var = new in60(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, in60Var);
        this.k0 = new bpn0(new j8n0(this, i));
        this.l0 = new bpn0(new hk70(this, 27));
        this.m0 = msy.a(lazyThreadSafetyMode, new cck0(this, 6));
        this.n0 = new bpn0(new bpc0(6));
    }

    public static VkTopBar.a.b.C0877b mo(SuperAppFragment superAppFragment) {
        VkTopBar.l lVar = null;
        if (!SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET.h()) {
            return null;
        }
        gko.b bVar = gko.Companion;
        tlo0.Companion.getClass();
        return new VkTopBar.a.b.C0877b(gko.c(R.drawable.vk_icon_info_circle_outline_28), tlo0.a.b(R.string.content_info_bottom_sheet_title), new i8n0(superAppFragment, 0), lVar, null, com.vk.core.compose.component.semantics.b.a(null, new d7l0(6), 3), 16);
    }

    @Override // xsna.aes
    public final void A0() {
        VkTopBar vkTopBar = this.W;
        if (vkTopBar != null) {
            vkTopBar.setBefore(lo(o25.a().o().c));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.T;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        ikv0 ikv0Var = this.c0;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.c0 = null;
        ko();
        jo();
        SuperAppAnimation superAppAnimation = this.f0;
        if (superAppAnimation != null) {
            superAppAnimation.b();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        if (!((Boolean) this.n0.getValue()).booleanValue()) {
            return true;
        }
        int i = rect2.top;
        VkTopBar vkTopBar = this.W;
        if (vkTopBar != null) {
            f4m.y(i, vkTopBar);
        }
        rect2.top = 0;
        rect2.bottom = 0;
        return true;
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        VkTopBar vkTopBar = this.W;
        if (vkTopBar != null) {
            vkTopBar.setBefore(lo(v6jVar.f()));
        }
    }

    public final void jo() {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        Fragment H = supportFragmentManager.H("super_app:menu_v3");
        x9n0 x9n0Var = H instanceof x9n0 ? (x9n0) H : null;
        if (x9n0Var == null || x9n0Var.Zn()) {
            return;
        }
        x9n0Var.dismiss();
    }

    public final void ko() {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        Fragment H = supportFragmentManager.H("_WidgetSettingsFragment");
        com.vk.superapp.widget_settings.p004new.a aVar = H instanceof com.vk.superapp.widget_settings.p004new.a ? (com.vk.superapp.widget_settings.p004new.a) H : null;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // xsna.xoo0
    public final int l2() {
        return ((Boolean) this.n0.getValue()).booleanValue() ? dhr0.t.c(R.attr.vk_ui_transparent) : dhr0.t.c(R.attr.vk_ui_background_content);
    }

    public final VkTopBar.c.a lo(String str) {
        if (!lbs.q(this)) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        return new VkTopBar.c.a(new snx(new snx.b.c(new vlw(str), ContentScale.Inside, ipi.a.a(e3m.f(R.attr.vk_ui_image_placeholder, vo())), 2)), new c9m0(this, 2), null, new u110(this, 21), com.vk.core.compose.component.semantics.b.a(null, new ece0(this, 11), 3), 4);
    }

    public final VkTopBar.a.c.f no(boolean z) {
        gko.b bVar = gko.Companion;
        tlo0.Companion.getClass();
        return new VkTopBar.a.c.f(gko.c(R.drawable.vk_icon_more_vertical_28), tlo0.a.b(R.string.accessibility_super_app_menu), new b990(this, 17), z ? new VkTopBar.l.a(VkBadge.Appearance.Design.AccentRed) : null, null, com.vk.core.compose.component.semantics.b.a(null, new epj0(6), 3), 16);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            oo().o(activity, i, intent, i2);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.S = new com.vk.superapp.ui.a(this, ((SuperAppServicesComponent) m7m.d(this).mo408a(fpf0.a(SuperAppServicesComponent.class))).Tb(), this.J, ((SuperAppServicesComponent) m7m.d(this).mo408a(fpf0.a(SuperAppServicesComponent.class))).e9(), ((SuperAppQueueComponent) m7m.d(this).a(fpf0.a(SuperAppQueueComponent.class))).X4(), ((VkHealthPermissionsComponent) m7m.d(this).a(fpf0.a(VkHealthPermissionsComponent.class))).Wb(), ((VkWorkoutComponent) m7m.d(this).a(fpf0.a(VkWorkoutComponent.class))).Te(), ((VkStepsComponent) m7m.d(this).a(fpf0.a(VkStepsComponent.class))).l3(), ((SuperAppMiniAppsComponent) m7m.d(this).mo408a(fpf0.a(SuperAppMiniAppsComponent.class))).a());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v7n0 v7n0Var = (v7n0) this.S;
        if (v7n0Var != null) {
            v7n0Var.j();
        }
        wo();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("blogger_id") : null;
        this.d0.getClass();
        g7n0.h(string);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_super_app_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dhr0.a.getClass();
        dhr0.X(this);
        this.U = null;
        this.W = null;
        ikv0 ikv0Var = this.c0;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.c0 = null;
        ko();
        jo();
        this.f0 = null;
        this.d0.b();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        this.d0.c();
        super.onPause();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v7n0 v7n0Var = (v7n0) this.S;
        if (v7n0Var != null) {
            v7n0Var.O1();
        }
        this.d0.a();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        v7n0 v7n0Var;
        view.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, view.getContext()));
        AppBarShadowView appBarShadowView = (AppBarShadowView) view.findViewById(R.id.shadow);
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(false);
        } else {
            appBarShadowView = null;
        }
        if (appBarShadowView != null) {
            bwt0.p0(appBarShadowView, false);
        }
        this.V = view.findViewById(R.id.gradient);
        P p = this.S;
        if (p == 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        v7n0 v7n0Var2 = (v7n0) p;
        this.b0 = new c7n0(oo(), v7n0Var2, new pcn0(), (s530) this.m0.getValue());
        SuperAppLayoutManager superAppLayoutManager = new SuperAppLayoutManager(view.getContext(), new f540(this, 29), new g8n0(this, r1));
        SuperAppRecyclerView superAppRecyclerView = (SuperAppRecyclerView) hvt0.c(R.id.sa_recycler, view);
        superAppRecyclerView.setUiErrorMapper(new t810(19));
        c7n0 c7n0Var = this.b0;
        if (c7n0Var == null) {
            c7n0Var = null;
        }
        superAppRecyclerView.setAdapter(c7n0Var);
        superAppRecyclerView.setSwipeRefreshEnabled(true);
        this.Y = superAppRecyclerView;
        RecyclerView recyclerView = superAppRecyclerView.getRecyclerView();
        recyclerView.getPaddingBottom();
        recyclerView.setLayoutManager(superAppLayoutManager);
        recyclerView.setItemAnimator(new l8n0());
        recyclerView.setRecycledViewPool(new rru(10));
        recyclerView.addItemDecoration(new SuperAppItemDecoration(vo(), SuperAppItemDecoration.MenuBackgroundType.NONE, new mlf0(this, 7), new pvh0(this, 6)));
        awt0.g(recyclerView);
        xvj0.a.a(recyclerView);
        this.d0.e(recyclerView, recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height));
        this.X = recyclerView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.error_container);
        if (viewGroup != null) {
            bwt0.M(viewGroup);
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view.findViewById(R.id.super_app_page);
        if (coordinatorLayout != null) {
            getLayoutInflater().inflate(R.layout.vk_superapp_appbarlayout_v6, (ViewGroup) coordinatorLayout, true);
            RecyclerView recyclerView2 = this.X;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            RecyclerView.o layoutManager = recyclerView2.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                fdv fdvVar = new fdv(coordinatorLayout.getContext(), 0);
                fdvVar.setId(R.id.horizontal_expandable_menu_view);
                fdvVar.c(v7n0Var2, linearLayoutManager, ((Boolean) this.n0.getValue()).booleanValue());
                coordinatorLayout.addView(fdvVar);
                this.Z = fdvVar;
            }
        }
        this.a0 = (AppBarLayout) view.findViewById(R.id.collapsing_appbar_v6);
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar_layout);
        if (appBarLayout != null) {
            po(appBarLayout);
        } else {
            appBarLayout = null;
        }
        this.U = appBarLayout;
        if (appBarLayout != null) {
            if (!appBarLayout.isLaidOut() || appBarLayout.isLayoutRequested()) {
                appBarLayout.addOnLayoutChangeListener(new c());
            } else {
                AppBarLayout appBarLayout2 = this.U;
                ViewGroup.LayoutParams layoutParams = appBarLayout2 != null ? appBarLayout2.getLayoutParams() : null;
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                CoordinatorLayout.c cVar = fVar != null ? fVar.a : null;
                AppBarLayout.Behavior behavior = cVar instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) cVar : null;
                d dVar = new d();
                if (behavior != null) {
                    behavior.Y(dVar);
                }
            }
        }
        super.onViewCreated(view, bundle);
        ow90 ow90Var = ow90.a;
        ScrollScreenType scrollScreenType = ScrollScreenType.SUPERAPP_FEED;
        RecyclerView recyclerView3 = this.X;
        ow90.c(scrollScreenType, recyclerView3 != null ? recyclerView3 : null);
        dhr0.f(this);
        if (getActivity() != null) {
            boolean z = v9n0.a;
            FragmentActivity activity = getActivity();
            if (!v9n0.c(activity != null ? activity.hashCode() : 0) && (v7n0Var = (v7n0) this.S) != null) {
                v7n0Var.E3();
            }
        }
        wo();
    }

    public final ayu0 oo() {
        return (ayu0) this.l0.getValue();
    }

    @Override // xsna.aes
    public final RectF p1() {
        zhf0 leftAvatarRect;
        VkTopBar vkTopBar = this.W;
        if (vkTopBar == null || (leftAvatarRect = vkTopBar.getLeftAvatarRect()) == null) {
            return null;
        }
        return zjq.o(leftAvatarRect);
    }

    public final void po(AppBarLayout appBarLayout) {
        VkTopBar vkTopBar = (VkTopBar) LayoutInflater.from(vo()).inflate(R.layout.vk_superapp_header_v4, (ViewGroup) appBarLayout, false);
        FragmentActivity activity = getActivity();
        HashSet hashSet = iah0.a;
        if (fnj.b(activity)) {
            mqe0 mqe0Var = new mqe0(this, 17);
            vkTopBar.setMiddle(new VkTopBar.Middle.d(requireContext().getString(R.string.vk_search_hint), new tho0((String) null, 0L, 7), false, null, null, null, mqe0Var, null, null, com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new mz80(15, this, mqe0Var), 2), 1980));
            gko c2 = gko.c(R.drawable.vk_icon_scan_viewfinder_outline_28);
            tlo0.Companion.getClass();
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(c2, tlo0.a.b(R.string.accessibility_super_app_qr_icon), new vpj0(this, 6), null, null, null, 56), mo(this), 4));
        } else {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(getString(R.string.vk_expandable_menu_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(null, new av70(19), 3), 6));
            vkTopBar.setBefore(lo(o25.a().o().c));
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(no(false), mo(this), 4));
        }
        this.W = vkTopBar;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        vkTopBar.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AppBarLayout.d dVar = new AppBarLayout.d(-2);
        dVar.a = 0;
        appBarLayout.addView(vkTopBar, dVar);
    }

    public final void qo(SuperAppAnimation.a aVar) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        SuperAppAnimation superAppAnimation = this.f0;
        if (superAppAnimation != null) {
            superAppAnimation.b();
        }
        this.f0 = null;
        if (aVar.a() != 0) {
            SuperAppAnimation superAppAnimation2 = new SuperAppAnimation(activity, this.D, aVar);
            this.f0 = superAppAnimation2;
            superAppAnimation2.c();
        }
    }

    public final void ro() {
        View view;
        ViewGroup viewGroup;
        ikv0 ikv0Var = this.c0;
        if ((ikv0Var != null && ikv0Var.b()) || (view = getView()) == null || (viewGroup = (ViewGroup) view.findViewById(R.id.error_container)) == null) {
            return;
        }
        ikv0 ikv0Var2 = this.c0;
        if (ikv0Var2 != null) {
            ikv0Var2.a();
        }
        ikv0.a aVar = new ikv0.a(viewGroup.getContext());
        aVar.i(new ikv0.d(viewGroup.getContext().getString(R.string.super_app_loading_error_message), (String) null, new ikv0.d.a(viewGroup.getContext().getString(R.string.super_app_retry_loading), null, new i0b0(this, 18), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2));
        aVar.e(iah0.a(8.0f));
        aVar.a(this);
        aVar.m(FloatingViewGesturesHelper.SwipeDirection.Horizontal);
        aVar.l();
        aVar.c();
        this.c0 = aVar.o(viewGroup);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView = this.X;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && linearLayoutManager.s() == 0) {
            return false;
        }
        RecyclerView recyclerView2 = this.X;
        (recyclerView2 != null ? recyclerView2 : null).scrollToPosition(0);
        AppBarLayout appBarLayout = this.a0;
        if (appBarLayout != null) {
            appBarLayout.g(true, true, true);
        }
        fdv fdvVar = this.Z;
        if (fdvVar != null) {
            fdvVar.a();
        }
        return true;
    }

    @Override // androidx.fragment.app.d, xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        View view = getView();
        if (view == null) {
            return;
        }
        lpj lpjVar = new lpj(view.getContext(), vKTheme.c);
        view.setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, view.getContext()));
        RecyclerView recyclerView = this.X;
        if (recyclerView == null) {
            recyclerView = null;
        }
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        int i = 0;
        while (true) {
            if (i >= itemDecorationCount) {
                break;
            }
            RecyclerView recyclerView2 = this.X;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            if (recyclerView2.getItemDecorationAt(i) instanceof SuperAppItemDecoration) {
                RecyclerView recyclerView3 = this.X;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                recyclerView3.removeItemDecorationAt(i);
            } else {
                i++;
            }
        }
        RecyclerView recyclerView4 = this.X;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.addItemDecoration(new SuperAppItemDecoration(lpjVar, SuperAppItemDecoration.MenuBackgroundType.NONE, new mlf0(this, 7), new pvh0(this, 6)), 0);
        AppBarLayout appBarLayout = this.U;
        if (appBarLayout != null) {
            appBarLayout.removeAllViews();
            po(appBarLayout);
        }
        ikv0 ikv0Var = this.c0;
        if (ikv0Var == null || !ikv0Var.b()) {
            return;
        }
        ikv0 ikv0Var2 = this.c0;
        if (ikv0Var2 != null) {
            ikv0Var2.a();
        }
        this.c0 = null;
        ro();
    }

    public final void so(ListData listData) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        bpn0 bpn0Var = SuperAppItemDecoration.n;
        c7n0 c7n0Var = this.b0;
        if (c7n0Var == null) {
            c7n0Var = null;
        }
        boolean c2 = SuperAppItemDecoration.b.c((ListDataSet.ArrayListImpl) c7n0Var.y0(), listData.b());
        if (listData.a() == ListData.Cause.NETWORK_UPDATE && getActivity() != null && v9n0.b()) {
            v9n0.d();
        }
        SuperAppRecyclerView superAppRecyclerView = this.Y;
        if (superAppRecyclerView == null) {
            superAppRecyclerView = null;
        }
        superAppRecyclerView.f0();
        c7n0 c7n0Var2 = this.b0;
        (c7n0Var2 == null ? null : c7n0Var2).O0(listData.b(), new bv3(this, listData, ref$ObjectRef, 5), new sts(1, this, ref$ObjectRef, listData, c2));
    }

    public final void to(String str, boolean z) {
        ViewGroup viewGroup;
        View view = getView();
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.error_container)) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(viewGroup.getContext());
        aVar.h(new ikv0.c.C3058c(z ? R.drawable.vk_icon_check_circle_on_24 : R.drawable.vk_icon_dismiss_substract_24, Integer.valueOf(z ? R.attr.vk_ui_icon_positive : R.attr.vk_ui_icon_negative), (Size) null, 12));
        aVar.i(new ikv0.d(str, (String) null, (ikv0.d.a) null, 6));
        aVar.e(iah0.a(8.0f));
        aVar.k(3000L);
        aVar.c();
        aVar.o(viewGroup);
    }

    public final void uo(WidgetSettingsModalOpenSource widgetSettingsModalOpenSource) {
        float f;
        View view;
        Context vo = vo();
        float height = getView() != null ? r2.getHeight() : 0.0f;
        if (getResources().getConfiguration().orientation != 1 || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.8f;
        } else {
            float f2 = 1;
            c7n0 c7n0Var = this.b0;
            Integer num = null;
            if (c7n0Var == null) {
                c7n0Var = null;
            }
            Iterator it = ((ArrayList) c7n0Var.y0()).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((zif0) it.next()) instanceof fan0) {
                    break;
                } else {
                    i++;
                }
            }
            RecyclerView recyclerView = this.X;
            if (recyclerView == null) {
                recyclerView = null;
            }
            RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
                num = Integer.valueOf(view.getHeight());
            }
            int intValue = num != null ? num.intValue() : iah0.a(78);
            f = f2 - ((cn70.b(16) + (intValue + (this.U != null ? r5.getHeight() : 0))) / height);
        }
        new a.C1923a(vo, f, widgetSettingsModalOpenSource).S0();
    }

    public final Context vo() {
        lpj c2 = this.T.c();
        return c2 != null ? c2 : requireContext();
    }

    public final void wo() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(activity)) {
            int a2 = gjf0.a(activity, true);
            SuperAppRecyclerView superAppRecyclerView = this.Y;
            if (superAppRecyclerView == null) {
                superAppRecyclerView = null;
            }
            bwt0.f0(superAppRecyclerView, a2, 0, a2, 0, 10);
        }
    }

    public final void xo(ProfileNavigationInfo.SecurityRecommendationIndicator securityRecommendationIndicator) {
        FragmentActivity activity = getActivity();
        HashSet hashSet = iah0.a;
        if (fnj.b(activity)) {
            return;
        }
        int i = a.$EnumSwitchMapping$2[securityRecommendationIndicator.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2) {
            z = false;
        } else if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        VkTopBar vkTopBar = this.W;
        if (vkTopBar != null) {
            vkTopBar.setAfter(VkTopBar.a.C0875a.a(no(z), mo(this), 4));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        v7n0 v7n0Var = (v7n0) this.S;
        if (v7n0Var != null) {
            v7n0Var.J1();
        }
        ArrayList arrayList = this.e0;
        g7n0 g7n0Var = this.d0;
        g7n0.b d2 = g7n0Var.d();
        if (d2 != null) {
            ArrayList d3 = d2.d();
            this.e0 = d3;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    uiTrackingScreen.e.removeIf(new x1q0(new exi0(((x8h0) it.next()).getClass(), 13)));
                }
            }
            Iterator it2 = d3.iterator();
            while (it2.hasNext()) {
                uiTrackingScreen.a((x8h0) it2.next());
            }
        }
        g7n0.b d4 = g7n0Var.d();
        uiTrackingScreen.f = d4 != null ? d4.c() : null;
    }
}
