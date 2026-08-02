package com.vk.home;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.network.NetworkPerformanceMeasurer;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.core.tool.view.vkblur.GradientDirection;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.home.HomeFragment2;
import com.vk.log.L;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.superapp.ui.BlendingTabView;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.a0t;
import xsna.aes;
import xsna.anj;
import xsna.arm0;
import xsna.asu0;
import xsna.b1h;
import xsna.b68;
import xsna.bcv;
import xsna.bes;
import xsna.bpn0;
import xsna.bs;
import xsna.bwt0;
import xsna.c5g;
import xsna.ccv;
import xsna.ce60;
import xsna.cn;
import xsna.cn70;
import xsna.cq3;
import xsna.dcn;
import xsna.dhr0;
import xsna.drm0;
import xsna.dx90;
import xsna.e2n;
import xsna.e3m;
import xsna.e43;
import xsna.e9i;
import xsna.ec60;
import xsna.ecv;
import xsna.enj;
import xsna.epx;
import xsna.es;
import xsna.ey50;
import xsna.f4m;
import xsna.f5z;
import xsna.fc;
import xsna.fcv;
import xsna.fhc0;
import xsna.flu;
import xsna.fme;
import xsna.fnj;
import xsna.fo50;
import xsna.fpf0;
import xsna.g620;
import xsna.ges;
import xsna.ggc0;
import xsna.gzs;
import xsna.h3p0;
import xsna.hai0;
import xsna.hbh0;
import xsna.hf8;
import xsna.hl60;
import xsna.hnv;
import xsna.ho1;
import xsna.hv;
import xsna.hx90;
import xsna.iah0;
import xsna.inv;
import xsna.iq;
import xsna.itg0;
import xsna.k7;
import xsna.krh;
import xsna.krv0;
import xsna.ku5;
import xsna.l7v;
import xsna.l8;
import xsna.lbs;
import xsna.ldl;
import xsna.lpj;
import xsna.lw3;
import xsna.m7m;
import xsna.msy;
import xsna.myh;
import xsna.ncg;
import xsna.nx50;
import xsna.o0q0;
import xsna.o0u0;
import xsna.o25;
import xsna.ods;
import xsna.ov2;
import xsna.ow90;
import xsna.oz50;
import xsna.pbv;
import xsna.pds;
import xsna.pla;
import xsna.ply;
import xsna.pr0;
import xsna.q99;
import xsna.q9k;
import xsna.qbv;
import xsna.qhh0;
import xsna.r0u0;
import xsna.r5i;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sgh0;
import xsna.tb4;
import xsna.too0;
import xsna.u3k;
import xsna.u460;
import xsna.ubv;
import xsna.uf1;
import xsna.usn0;
import xsna.v6j;
import xsna.vbv;
import xsna.ve7;
import xsna.vob;
import xsna.w1n;
import xsna.w8q;
import xsna.ww50;
import xsna.wzs;
import xsna.x3i;
import xsna.x4u;
import xsna.xds;
import xsna.xf1;
import xsna.xis;
import xsna.xrj;
import xsna.yds;
import xsna.yfb;
import xsna.ysg0;
import xsna.zb70;
import xsna.zbv;
import xsna.zds;

/* compiled from: HomeFragment2.kt */
/* loaded from: classes.dex */
public final class HomeFragment2 extends FragmentImpl implements yds, TabLayout.d, too0, qhh0, bes, aes, xds, ges, o0q0, hnv {
    public static final /* synthetic */ int x0 = 0;
    public final Object N;
    public boolean O;
    public final io.reactivex.rxjava3.disposables.b P;
    public AppBarLayout Q;
    public AppBarShadowView R;
    public ViewPager S;
    public SkeletonTabLayout T;
    public FrameLayout U;
    public Object V;
    public int W;
    public int X;
    public VkContextMenu Y;
    public final Object Z;
    public ecv a0;
    public final fcv b0;
    public final Handler c0;
    public ubv d0;
    public dcn e0;
    public Hint f0;
    public Integer g0;
    public List<DiscoverCategory> h0;
    public List<Hint> i0;
    public final HomeFragment2$receiver$1 j0;
    public final e k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public ggc0 o0;
    public final Object p0;
    public final bpn0 q0;
    public final Object r0;
    public final Object s0;
    public final bpn0 t0;
    public VkBlurView u0;
    public final c v0;
    public final d w0;

    /* compiled from: HomeFragment2.kt */
    /* loaded from: classes2.dex */
    public static final class BlurBackdropBehavior extends CoordinatorLayout.c<View> {
        public final int b;

        public BlurBackdropBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = hbh0.b(52, context) + fnj.a(context);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int bottom = view2.getBottom();
            if (bottom < 0) {
                bottom = 0;
            }
            if (bottom < view2.getHeight()) {
                bwt0.p0(view, true);
            }
            int max = Math.max(this.b, hbh0.b(52, coordinatorLayout.getContext()) + bottom);
            if (view.getHeight() == max) {
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = max;
            view.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* compiled from: HomeFragment2.kt */
    /* loaded from: classes2.dex */
    public static final class a extends oz50 {
        public a() {
            super(HomeFragment2.class, null, null);
        }

        public final void y(String str) {
            this.j.putString("access_key", str);
        }
    }

    /* compiled from: HomeFragment2.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FragmentWithGlobalSearch$TargetAction.values().length];
            try {
                iArr[FragmentWithGlobalSearch$TargetAction.LongTap.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FragmentWithGlobalSearch$TargetAction.HeaderSearchIconClick.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: HomeFragment2.kt */
    /* loaded from: classes2.dex */
    public static final class c implements AppBarLayout.f {
        public int b;
        public int c;

        public c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            boolean z = (this.b == i && appBarLayout.getHeight() == this.c) ? false : true;
            boolean z2 = this.b > i;
            boolean z3 = appBarLayout.getTotalScrollRange() + i == 0;
            this.b = i;
            this.c = appBarLayout.getHeight();
            HomeFragment2 homeFragment2 = HomeFragment2.this;
            if (z2 && z3) {
                SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
                if (skeletonTabLayout != null) {
                    skeletonTabLayout.setBackground(null);
                }
                SkeletonTabLayout skeletonTabLayout2 = homeFragment2.T;
                if (skeletonTabLayout2 != null) {
                    dhr0.m(skeletonTabLayout2, false);
                }
                FrameLayout frameLayout = homeFragment2.U;
                if (frameLayout != null) {
                    frameLayout.setBackground(null);
                }
                FrameLayout frameLayout2 = homeFragment2.U;
                if (frameLayout2 != null) {
                    dhr0.m(frameLayout2, false);
                }
            }
            for (int i2 = 0; i2 < 2; i2++) {
                ecv ecvVar = homeFragment2.a0;
                f k = ecvVar != null ? ecvVar.k(i2) : null;
                ods odsVar = k instanceof ods ? (ods) k : null;
                if (z) {
                    if (odsVar != null) {
                        odsVar.Dm(i, appBarLayout.getTotalScrollRange());
                    }
                } else if (odsVar != null) {
                    odsVar.Kg(i, appBarLayout.getTotalScrollRange());
                }
            }
        }
    }

    /* compiled from: HomeFragment2.kt */
    /* loaded from: classes2.dex */
    public static final class d extends ViewPager.m {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            HomeFragment2 homeFragment2 = HomeFragment2.this;
            ViewPager viewPager = homeFragment2.S;
            if ((viewPager == null || viewPager.getCurrentItem() != 0) && i == 0) {
                homeFragment2.qo(HintId.INFO_DISCOVER_TOPIC_TAB.getId());
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            HomeFragment2 homeFragment2 = HomeFragment2.this;
            if (homeFragment2.X == i || i2 != 0) {
                return;
            }
            homeFragment2.X = i;
            AppBarLayout appBarLayout = homeFragment2.Q;
            if (appBarLayout != null) {
                appBarLayout.setExpanded(true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.m, androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            HomeFragment2 homeFragment2 = HomeFragment2.this;
            ecv ecvVar = homeFragment2.a0;
            FragmentImpl k = ecvVar != null ? ecvVar.k(i) : null;
            zds zdsVar = k instanceof zds ? (zds) k : null;
            if (zdsVar != null) {
                zdsVar.zm(homeFragment2.W);
            }
        }
    }

    /* compiled from: HomeFragment2.kt */
    /* loaded from: classes2.dex */
    public static final class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            HomeFragment2 homeFragment2 = HomeFragment2.this;
            SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
            homeFragment2.getClass();
            if (skeletonTabLayout != null) {
                int tabCount = skeletonTabLayout.getTabCount();
                for (int i = 0; i < tabCount; i++) {
                    homeFragment2.eo(skeletonTabLayout, i);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.vk.home.HomeFragment2$receiver$1] */
    public HomeFragment2() {
        fc fcVar = new fc(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, fcVar);
        this.P = new io.reactivex.rxjava3.disposables.b();
        this.Z = msy.a(lazyThreadSafetyMode, new pr0(17));
        this.b0 = new fcv(go());
        this.c0 = new Handler(Looper.getMainLooper());
        this.j0 = new BroadcastReceiver() { // from class: com.vk.home.HomeFragment2$receiver$1
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xsna.inv] */
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -1414915502) {
                        if (hashCode != 611799995 || !action.equals("com.vkontakte.android.FRIEND_REQUESTS_CHANGED")) {
                            return;
                        }
                    } else if (!action.equals("com.vkontakte.android.COUNTERS_UPDATED")) {
                        return;
                    }
                    if (intent.getBooleanExtra("out", false)) {
                        return;
                    }
                    int i = HomeFragment2.x0;
                    int h = g620.h();
                    HomeFragment2 homeFragment2 = HomeFragment2.this;
                    ?? r0 = homeFragment2.V;
                    if (r0 != 0) {
                        r0.j(h, homeFragment2.ko());
                    }
                    SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
                    if (skeletonTabLayout != null) {
                        homeFragment2.eo(skeletonTabLayout, 1);
                    }
                }
            }
        };
        this.k0 = new e();
        this.l0 = msy.a(lazyThreadSafetyMode, new myh(this, 23));
        this.m0 = msy.a(lazyThreadSafetyMode, new flu(this, 3));
        this.n0 = msy.a(lazyThreadSafetyMode, new krh(this, 23));
        this.p0 = msy.a(lazyThreadSafetyMode, new ldl(this, 19));
        this.q0 = new bpn0(new xrj(this, 12));
        this.r0 = msy.a(lazyThreadSafetyMode, new u3k(this, 22));
        this.s0 = msy.a(lazyThreadSafetyMode, new w8q(this, 10));
        this.t0 = new bpn0(new com.vk.movika.sdk.base.model.props.a(12));
        this.v0 = new c();
        this.w0 = new d();
    }

    @Override // xsna.aes
    public final void A0() {
        View view = getView();
        if (view != null) {
            oo(view);
        }
    }

    @Override // xsna.hnv
    public final void F2(String str) {
        ecv ecvVar;
        FragmentEntry fragmentEntry;
        String string;
        String string2;
        DiscoverId discoverId;
        if (str == null || str.length() == 0 || (ecvVar = this.a0) == null) {
            return;
        }
        int count = ecvVar.getCount();
        int i = 0;
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            FragmentImpl k = ecvVar.k(i);
            if (k != null) {
                Bundle arguments = k.getArguments();
                String e2 = (arguments == null || (discoverId = (DiscoverId) arguments.getParcelable("discover_id")) == null) ? null : discoverId.e();
                if (e2 != null && e2.equals(str)) {
                    break;
                }
            }
            i++;
        }
        if (i >= 0) {
            ViewPager viewPager = this.S;
            if (viewPager != null) {
                viewPager.setCurrentItem(i, true);
                return;
            }
            return;
        }
        Context mo2getContext = mo2getContext();
        ComponentCallbacks2 h = mo2getContext != null ? e3m.h(mo2getContext) : null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        nx50 nx50Var = Y instanceof nx50 ? (nx50) Y : null;
        if (!b68.h() || nx50Var == null || nx50Var.y() != 0) {
            ExploreFragment.a aVar = new ExploreFragment.a();
            aVar.y(str);
            aVar.k(mo2getContext());
            return;
        }
        Bundle a2 = q9k.a("tab", str);
        FragmentImpl i2 = nx50Var.y0().i(ExploreFragment.class);
        ExploreFragment exploreFragment = i2 instanceof ExploreFragment ? (ExploreFragment) i2 : null;
        if (exploreFragment != null && exploreFragment.equals(nx50Var.y0().m())) {
            if (!a2.containsKey("tab") || (string2 = a2.getString("tab")) == null) {
                return;
            }
            exploreFragment.F2(string2);
            return;
        }
        if (exploreFragment == null || (fragmentEntry = exploreFragment.Kn()) == null) {
            fragmentEntry = new FragmentEntry(ExploreFragment.class, null, 2, null);
        }
        fragmentEntry.c.putAll(a2);
        nx50Var.s0(fragmentEntry, true);
        if (exploreFragment == null || !a2.containsKey("tab") || (string = a2.getString("tab")) == null) {
            return;
        }
        exploreFragment.F2(string);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        VkBlurView vkBlurView;
        SkeletonTabLayout skeletonTabLayout = this.T;
        if (skeletonTabLayout != null) {
            eo(skeletonTabLayout, 0);
        }
        if (jo() && (vkBlurView = this.u0) != null) {
            bwt0.S(vkBlurView, new cq3(13, vkBlurView, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xsna.inv] */
    @Override // xsna.ges
    public final void Rc() {
        ViewPager viewPager;
        ecv ecvVar = this.a0;
        if (ecvVar != null) {
            int count = ecvVar.getCount();
            boolean io2 = io();
            boolean z = count > 1;
            boolean z2 = count == 1;
            if ((io2 && z) || (!io2 && z2)) {
                ecv ecvVar2 = this.a0;
                Integer valueOf = ecvVar2 != null ? Integer.valueOf(ecvVar2.getCount()) : null;
                if (valueOf != null && valueOf.intValue() > 0 && (viewPager = this.S) != null) {
                    viewPager.setCurrentItem(0);
                }
                fcv fcvVar = this.b0;
                if (io2) {
                    SkeletonTabLayout skeletonTabLayout = this.T;
                    if (skeletonTabLayout != null) {
                        bwt0.p0(skeletonTabLayout, false);
                    }
                    fcvVar.b(new ArrayList());
                    ecv ecvVar3 = this.a0;
                    if (ecvVar3 != null) {
                        ecvVar3.l();
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    SkeletonTabLayout skeletonTabLayout2 = this.T;
                    if (skeletonTabLayout2 != null) {
                        bwt0.p0(skeletonTabLayout2, true);
                    }
                    w1n.b.getClass();
                    List<DiscoverCategory> E = w1n.E();
                    ArrayList arrayList2 = new ArrayList(E.size());
                    for (DiscoverCategory discoverCategory : E) {
                        FragmentImpl a2 = new e2n(discoverCategory, arrayList2.size()).a();
                        if (a2 != null) {
                            arrayList2.add(discoverCategory);
                            arrayList.add(a2);
                        }
                    }
                    fcvVar.b(arrayList2);
                    ecv ecvVar4 = this.a0;
                    if (ecvVar4 != null) {
                        ecvVar4.g(arrayList);
                    }
                    SkeletonTabLayout skeletonTabLayout3 = this.T;
                    if (skeletonTabLayout3 != null) {
                        skeletonTabLayout3.setTabMode(4);
                    }
                }
            }
            no();
            ?? r0 = this.V;
            if (r0 != 0) {
                r0.f(!lbs.o(this));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        ecv ecvVar = this.a0;
        if (ecvVar == null) {
            return;
        }
        FragmentImpl c2 = ecvVar.c(gVar.f());
        if (c2 instanceof hai0) {
            ((hai0) c2).q1();
        }
        int f = gVar.f();
        Integer num = this.g0;
        if (num != null && f == num.intValue()) {
            Hint hint = this.f0;
            if (hint != null) {
                pla.e().b().s(hint);
            }
            this.f0 = null;
            this.g0 = null;
            so(-1);
        }
        Hn();
        View view = c2.getView();
        if (view == null) {
            return;
        }
        try {
            AppBarShadowView appBarShadowView = this.R;
            if (appBarShadowView != null) {
                appBarShadowView.V(view);
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        View findViewById;
        if (!jo()) {
            return true;
        }
        AppBarLayout appBarLayout = this.Q;
        if (appBarLayout != null && (findViewById = appBarLayout.findViewById(R.id.feed_home_top_bar)) != null) {
            f4m.y(rect2.top, findViewById);
        }
        rect2.top = 0;
        rect2.bottom = 0;
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        FragmentImpl fo = fo();
        if (fo != null && fo.a0()) {
            return true;
        }
        ViewPager viewPager = this.S;
        if (viewPager != null && viewPager.getCurrentItem() == 0) {
            return false;
        }
        ViewPager viewPager2 = this.S;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0, true);
        }
        return true;
    }

    public final s3q0 eo(TabLayout tabLayout, int i) {
        ecv ecvVar;
        TabLayout.g b2 = tabLayout.b(i);
        if (b2 == null || (ecvVar = this.a0) == null) {
            return null;
        }
        ecvVar.h(b2, i);
        return s3q0.a;
    }

    public final FragmentImpl fo() {
        ecv ecvVar;
        ViewPager viewPager = this.S;
        if (viewPager == null || (ecvVar = this.a0) == null) {
            return null;
        }
        return ecvVar.k(viewPager.getCurrentItem());
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        return fo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ec60 go() {
        return (ec60) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.inv] */
    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        ?? r0 = this.V;
        if (r0 != 0) {
            r0.e(mo2getContext(), v6jVar);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        ViewPager viewPager;
        f fo = fo();
        int i = sgh0.c.a;
        boolean T5 = fo instanceof o0u0 ? ((o0u0) fo).T5() : fo instanceof qhh0 ? ((qhh0) fo).s() : false;
        AppBarLayout appBarLayout = this.Q;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
        if (T5 || (viewPager = this.S) == null || viewPager.getCurrentItem() != 0) {
            return;
        }
        ro(gVar != null ? gVar.h : null);
    }

    public final void ho() {
        AppBarLayout appBarLayout;
        dcn dcnVar = this.e0;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        this.e0 = null;
        hl60 hl60Var = hl60.a;
        hl60.b();
        this.c0.removeCallbacksAndMessages(null);
        ubv ubvVar = this.d0;
        if (ubvVar != null && (appBarLayout = this.Q) != null) {
            appBarLayout.removeCallbacks(ubvVar);
        }
        this.d0 = null;
    }

    public final boolean io() {
        Context mo2getContext = mo2getContext();
        ComponentCallbacks2 h = mo2getContext != null ? e3m.h(mo2getContext) : null;
        ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
        Object Y = ey50Var != null ? ey50Var.Y() : null;
        return (Y instanceof nx50 ? (nx50) Y : null) != null && b68.h();
    }

    public final boolean jo() {
        return ((Boolean) this.t0.getValue()).booleanValue();
    }

    public final boolean ko() {
        return (isHidden() || Mn()) ? false : true;
    }

    @Override // xsna.xoo0
    public final int l2() {
        return jo() ? dhr0.t.c(R.attr.vk_ui_transparent) : dhr0.t.c(R.attr.vk_ui_header_background);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xsna.inv] */
    public final void lo() {
        ?? r0;
        Integer d2;
        if (jo()) {
            int intValue = (!jo() || (r0 = this.V) == 0 || (d2 = r0.d()) == null) ? 0 : d2.intValue();
            this.W = intValue;
            ecv ecvVar = this.a0;
            if (ecvVar != null) {
                int count = ecvVar.getCount();
                for (int i = 0; i < count; i++) {
                    ecv ecvVar2 = this.a0;
                    FragmentImpl k = ecvVar2 != null ? ecvVar2.k(i) : null;
                    zds zdsVar = k instanceof zds ? (zds) k : null;
                    if (zdsVar != null) {
                        zdsVar.zm(intValue);
                    }
                }
            }
        }
    }

    public final void mo() {
        int P;
        NewsfeedFragment.a aVar = new NewsfeedFragment.a();
        FeedFeatures feedFeatures = FeedFeatures.FEED_OPEN_POST_LINK;
        feedFeatures.getClass();
        if (com.vk.toggle.b.A.a(feedFeatures)) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("access_key") : null;
            if (string != null && (P = drm0.P(string, '_', 0, 6)) > 0) {
                Long n = arm0.n(string.substring(0, P));
                Integer m = arm0.m(10, string.substring(P + 1));
                if (n != null && m != null) {
                    aVar.y(m.intValue(), n.longValue());
                }
            }
        }
        ArrayList a2 = e43.a(aVar.f());
        boolean io2 = io();
        fcv fcvVar = this.b0;
        if (io2) {
            SkeletonTabLayout skeletonTabLayout = this.T;
            if (skeletonTabLayout != null) {
                bwt0.p0(skeletonTabLayout, false);
            }
            fcvVar.b(new ArrayList());
            ecv ecvVar = this.a0;
            if (ecvVar != null) {
                ecvVar.m(a2);
            }
            SkeletonTabLayout skeletonTabLayout2 = this.T;
            if (skeletonTabLayout2 != null) {
                skeletonTabLayout2.setTabMode(4);
                return;
            }
            return;
        }
        SkeletonTabLayout skeletonTabLayout3 = this.T;
        if (skeletonTabLayout3 != null) {
            bwt0.p0(skeletonTabLayout3, true);
        }
        w1n.b.getClass();
        List<DiscoverCategory> E = w1n.E();
        ArrayList arrayList = new ArrayList(E.size());
        for (DiscoverCategory discoverCategory : E) {
            FragmentImpl a3 = new e2n(discoverCategory, arrayList.size()).a();
            if (a3 != null) {
                arrayList.add(discoverCategory);
                a2.add(a3);
            }
        }
        fcvVar.b(arrayList);
        ecv ecvVar2 = this.a0;
        if (ecvVar2 != null) {
            ecvVar2.m(a2);
        }
        SkeletonTabLayout skeletonTabLayout4 = this.T;
        if (skeletonTabLayout4 != null) {
            skeletonTabLayout4.setTabMode(4);
        }
        w1n.b.getClass();
        this.P.b(rsg0.y0(yfb.x(bs.c(new es(), Collections.singletonList("discover_categories"), 6)), null, null, 3).U(new k7(new tb4(20), 15)).subscribe(new ho1(new uf1(21, this, E), 27), new hv(new lw3(L.a, 5), 26)));
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("tab") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            arguments3.remove("tab");
        }
        if (string2 != null) {
            F2(string2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.inv] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xsna.inv] */
    public final void no() {
        String string;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        if (!io()) {
            ?? r1 = this.V;
            if (r1 != 0) {
                r1.h(mo2getContext.getString(R.string.newsfeed_header_title), false, null);
                return;
            }
            return;
        }
        NewsfeedList K0 = go().K0();
        if (K0 == null || (string = K0.getTitle()) == null) {
            string = mo2getContext.getString(R.string.newsfeed_header_title);
        }
        ?? r0 = this.V;
        if (r0 != 0) {
            r0.h(string, true, new xis(this, 7));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewPager viewPager = this.S;
        if (viewPager == null) {
            return;
        }
        viewPager.postDelayed(new ku5(2, this, viewPager), 200L);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean a2;
        LayoutInflater from;
        if (bundle != null) {
            a2 = bundle.getBoolean("saved_state_compose_top_bar", this.O);
        } else {
            FeedFeatures feedFeatures = FeedFeatures.MAIN_FEED_COMPOSE_TOP_BAR;
            feedFeatures.getClass();
            a2 = com.vk.toggle.b.A.a(feedFeatures);
        }
        this.O = a2;
        int i = jo() ? R.layout.fragment_home_united_topbar_lego : this.O ? R.layout.fragment_home_united_compose_topbar : R.layout.fragment_home_united;
        if (jo()) {
            lpj lpjVar = new lpj(getActivity(), dhr0.C().c);
            dhr0.a.g(lpjVar);
            from = LayoutInflater.from(getActivity()).cloneInContext(lpjVar);
        } else {
            from = LayoutInflater.from(getActivity());
        }
        int i2 = 0;
        View inflate = from.inflate(i, viewGroup, false);
        this.V = jo() ? new bcv(inflate) : this.O ? new zbv(inflate) : new ccv(inflate, (zb70) this.n0.getValue());
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        this.Q = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.a(this.v0);
        }
        AppBarShadowView appBarShadowView = (AppBarShadowView) inflate.findViewById(R.id.shadow_view);
        this.R = appBarShadowView;
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(false);
        }
        AppBarShadowView appBarShadowView2 = this.R;
        if (appBarShadowView2 != null) {
            appBarShadowView2.setOnModeChangedListener(new l8(this, 26));
        }
        View findViewById = inflate.findViewById(R.id.header_container);
        int i3 = 4;
        if (findViewById != null) {
            findViewById.setOnClickListener(new e9i(this, i3));
        }
        oo(inflate);
        no();
        if (this.O) {
            f5z viewLifecycleOwner = getViewLifecycleOwner();
            this.o0 = new ggc0(viewLifecycleOwner, getActivity(), new com.vk.movika.sdk.base.data.converter.c(viewLifecycleOwner), (fhc0) this.q0.getValue(), o25.a(), ((NewsFeedComponent) m7m.d(this).a(fpf0.a(NewsFeedComponent.class))).N0());
        }
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(1);
        ecv ecvVar = new ecv(In(), this.b0);
        ecvVar.registerDataSetObserver(this.k0);
        viewPager.setAdapter(ecvVar);
        this.a0 = ecvVar;
        viewPager.addOnPageChangeListener(this.w0);
        this.S = viewPager;
        SkeletonTabLayout skeletonTabLayout = (SkeletonTabLayout) from.inflate(R.layout.feed_tabs_v2, (ViewGroup) this.Q, false);
        skeletonTabLayout.setShimmerAvailable(false);
        skeletonTabLayout.setSkeletonMarginBottom(0);
        skeletonTabLayout.setSkeletonInnerHorizontalPadding(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        skeletonTabLayout.setSkeletonOuterHorizontalPadding(cn70.a() * 16.0f);
        skeletonTabLayout.setTabPaddingStart(cn70.b(4));
        skeletonTabLayout.setTabPaddingEnd(cn70.b(4));
        skeletonTabLayout.setTabPaddingTabletHorizontal(cn70.b(16));
        if (skeletonTabLayout.B0) {
            skeletonTabLayout.B0 = false;
            skeletonTabLayout.invalidate();
        }
        skeletonTabLayout.setBottomLineVisible(true);
        skeletonTabLayout.setBottomLineColor(R.attr.vk_ui_separator_primary_alpha);
        skeletonTabLayout.setBottomLineHeight(e3m.a(R.dimen.vk_toolbar_separator_height, skeletonTabLayout.getContext()));
        this.T = skeletonTabLayout;
        skeletonTabLayout.setCustomTabView(R.layout.newsfeed_united_simple_header_tab_view);
        skeletonTabLayout.setupWithViewPager(this.S);
        skeletonTabLayout.f(this);
        usn0.a(skeletonTabLayout);
        ve7 ve7Var = new ve7(skeletonTabLayout);
        ViewPager viewPager2 = this.S;
        if (viewPager2 != null) {
            viewPager2.addOnPageChangeListener(ve7Var);
        }
        skeletonTabLayout.setShimmerVisible(false);
        Context context = skeletonTabLayout.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            FrameLayout frameLayout = new FrameLayout(skeletonTabLayout.getContext());
            frameLayout.addView(skeletonTabLayout);
            AppBarLayout appBarLayout2 = this.Q;
            if (appBarLayout2 != null) {
                appBarLayout2.addView(frameLayout);
            }
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams instanceof AppBarLayout.d) {
                ((AppBarLayout.d) layoutParams).a = 21;
            }
            this.U = frameLayout;
        } else {
            AppBarLayout appBarLayout3 = this.Q;
            if (appBarLayout3 != null) {
                appBarLayout3.addView(skeletonTabLayout);
            }
        }
        bwt0.p0(skeletonTabLayout, !io());
        go().O0(new vob(this));
        go().N0(new vbv(this));
        go().L0(bundle != null ? ce60.b.i() : 0, new ArrayList(io() ? fo50.y() : fo50.B()));
        SkeletonTabLayout skeletonTabLayout2 = this.T;
        if (skeletonTabLayout2 != null) {
            eo(skeletonTabLayout2, 0);
        }
        bwt0.R(inflate, new fme(this, 2));
        if (jo()) {
            inflate.setFitsSystemWindows(true);
            AppBarShadowView appBarShadowView3 = this.R;
            if (appBarShadowView3 != null) {
                appBarShadowView3.setVisibility(4);
            }
            if (jo()) {
                VkBlurContentView vkBlurContentView = (VkBlurContentView) inflate.findViewById(R.id.blur_content_view);
                final VkBlurView vkBlurView = (VkBlurView) inflate.findViewById(R.id.blur_view);
                if (vkBlurView != null) {
                    vkBlurView.setupWithContent(vkBlurContentView);
                    vkBlurView.setGradientDirection(GradientDirection.BottomTop);
                    r0u0.a(inflate.findViewById(R.id.feed_home_top_bar), new a0t() { // from class: xsna.obv
                        @Override // xsna.a0t
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            ((Integer) obj2).intValue();
                            int intValue = ((Integer) obj3).intValue();
                            ((Integer) obj4).intValue();
                            ((Integer) obj5).intValue();
                            int i4 = HomeFragment2.x0;
                            VkBlurView vkBlurView2 = VkBlurView.this;
                            ViewGroup.LayoutParams layoutParams2 = vkBlurView2.getLayoutParams();
                            if (layoutParams2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            int a3 = fnj.a(vkBlurView2.getContext()) + intValue;
                            HomeFragment2 homeFragment2 = this;
                            layoutParams2.height = hbh0.b(52, homeFragment2.requireContext()) + a3;
                            vkBlurView2.setLayoutParams(layoutParams2);
                            homeFragment2.lo();
                            return s3q0.a;
                        }
                    });
                    r0u0.a(vkBlurView, new pbv(this, i2));
                } else {
                    vkBlurView = null;
                }
                this.u0 = vkBlurView;
            }
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.P.dispose();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, xsna.inv] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View findViewById;
        AppBarLayout appBarLayout = this.Q;
        if (appBarLayout != null) {
            appBarLayout.f(this.v0);
        }
        AppBarShadowView appBarShadowView = this.R;
        if (appBarShadowView != null) {
            appBarShadowView.setOnModeChangedListener(null);
        }
        View view = getView();
        if (view != null && (findViewById = view.findViewById(R.id.header_container)) != null) {
            findViewById.setOnClickListener(null);
        }
        ViewPager viewPager = this.S;
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        ViewPager viewPager2 = this.S;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(this.w0);
        }
        ecv ecvVar = this.a0;
        if (ecvVar != null) {
            ecvVar.j(this.S);
        }
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        ?? r0 = this.V;
        if (r0 != 0) {
            r0.b();
        }
        this.V = null;
        this.Y = null;
        ecv ecvVar2 = this.a0;
        if (ecvVar2 != null) {
            ecvVar2.unregisterDataSetObserver(this.k0);
        }
        this.a0 = null;
        ho();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            enj.s(activity, this.j0);
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        f fo = fo();
        if (fo instanceof pds) {
            ((pds) fo).J0();
        }
        ho();
        NetworkPerformanceMeasurer.a.getClass();
        NetworkPerformanceMeasurer.c = false;
        io.reactivex.rxjava3.disposables.c cVar = NetworkPerformanceMeasurer.i;
        if (cVar != null) {
            cVar.dispose();
        }
        L.e("NetworkPerformanceMeasurer", X3.i.h0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, xsna.inv] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        NetworkPerformanceMeasurer.NetworkClass networkClass;
        NetworkPerformanceMeasurer.NetworkClass networkClass2;
        AppBarLayout appBarLayout;
        super.onResume();
        if (((Boolean) this.N.getValue()).booleanValue() && (appBarLayout = this.Q) != null) {
            appBarLayout.g(true, false, true);
        }
        f fo = fo();
        if (fo instanceof pds) {
            ((pds) fo).o1();
        }
        int h = g620.h();
        ?? r3 = this.V;
        if (r3 != 0) {
            r3.j(h, ko());
        }
        SkeletonTabLayout skeletonTabLayout = this.T;
        if (skeletonTabLayout != null) {
            eo(skeletonTabLayout, 1);
        }
        m mVar = new m(new qbv(this, 0));
        asu0.a.getClass();
        this.P.b(itg0.l(mVar.q(asu0.m())));
        NetworkPerformanceMeasurer.a.getClass();
        NetworkPerformanceMeasurer.c = true;
        if (NetworkPerformanceMeasurer.d) {
            NetworkPerformanceMeasurer.d = false;
            if (NetworkPerformanceMeasurer.e) {
                Collection<Integer> a2 = hx90.a();
                if (a2.size() >= 3) {
                    Collection<Integer> collection = a2;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator<T> it = collection.iterator();
                        while (it.hasNext()) {
                            if (((Number) it.next()).intValue() != -1) {
                                ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
                                Iterator<T> it2 = collection.iterator();
                                while (it2.hasNext()) {
                                    int intValue = ((Number) it2.next()).intValue();
                                    NetworkPerformanceMeasurer.a.getClass();
                                    arrayList.add(NetworkPerformanceMeasurer.d(intValue));
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        NetworkPerformanceMeasurer.NetworkClass networkClass3 = (NetworkPerformanceMeasurer.NetworkClass) it3.next();
                                        networkClass2 = NetworkPerformanceMeasurer.NetworkClass.GOOD_NETWORK_CLASS;
                                        if (networkClass3 == networkClass2) {
                                            break;
                                        }
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        NetworkPerformanceMeasurer.NetworkClass networkClass4 = (NetworkPerformanceMeasurer.NetworkClass) it4.next();
                                        networkClass2 = NetworkPerformanceMeasurer.NetworkClass.SO_SO_NETWORK_CLASS;
                                        if (networkClass4 == networkClass2) {
                                            break;
                                        }
                                    }
                                }
                                networkClass2 = NetworkPerformanceMeasurer.NetworkClass.BAD_NETWORK_CLASS;
                                NetworkPerformanceMeasurer.m = networkClass2;
                                networkClass = NetworkPerformanceMeasurer.m;
                                if (networkClass == null) {
                                    networkClass = null;
                                }
                                NetworkPerformanceMeasurer.b(networkClass, true);
                            }
                        }
                    }
                }
                NetworkPerformanceMeasurer.m = NetworkPerformanceMeasurer.NetworkClass.GOOD_NETWORK_CLASS;
                networkClass = NetworkPerformanceMeasurer.m;
                if (networkClass == null) {
                }
                NetworkPerformanceMeasurer.b(networkClass, true);
            }
        }
        NetworkPerformanceMeasurer.i = asu0.a.c().e(new u460(0), 5L, 5L, TimeUnit.SECONDS);
        L.e("NetworkPerformanceMeasurer", X3.i.d0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("current_tab_position", this.X);
        bundle.putString("lang", ply.a());
        if (this.O) {
            bundle.putBoolean("saved_state_compose_top_bar", true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            mo();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.COUNTERS_UPDATED");
        intentFilter.addAction("com.vkontakte.android.FRIEND_REQUESTS_CHANGED");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            anj.d(activity, this.j0, intentFilter, hf8.a, 4);
        }
        dx90 dx90Var = ow90.e;
        dx90Var.getClass();
        dx90Var.h = System.currentTimeMillis();
        dx90Var.r();
        if (bundle == null) {
            io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
            iq iqVar = new iq(13);
            fVar.getClass();
            this.P.b(new i0(fVar, iqVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ov2(this, 24), new xf1(new q99(com.vk.metrics.eventtracking.b.a, 4), 27)));
        }
        lo();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.X = bundle != null ? bundle.getInt("current_tab_position", this.X) : this.X;
        if (bundle == null || epx.f(bundle.getString("lang"), ply.a())) {
            return;
        }
        ViewPager viewPager = this.S;
        if (viewPager != null) {
            viewPager.setCurrentItem(0);
        }
        mo();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, xsna.inv] */
    public final void oo(View view) {
        x4u x4uVar = new x4u(this, 2);
        b1h b1hVar = new b1h(this, 20);
        ncg ncgVar = new ncg(this, 25);
        cn o = o25.a().o();
        ?? r13 = this.V;
        if (r13 != 0) {
            FragmentActivity kn = kn();
            f5z viewLifecycleOwner = getViewLifecycleOwner();
            boolean a2 = h3p0.a(this);
            boolean q = lbs.q(this);
            String str = o.c;
            if (str == null) {
                str = "";
            }
            r13.a(kn, viewLifecycleOwner, new inv.a(a2, q, str, x4uVar, b1hVar, new r5i(ncgVar, 20), !lbs.o(this), new com.vk.movika.sdk.android.defaultplayer.container.e(12, this, view), (gzs) this.r0.getValue(), (wzs) this.s0.getValue(), new x3i(this, 15)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.inv] */
    @Override // xsna.aes
    public final RectF p1() {
        ?? r0 = this.V;
        if (r0 != 0) {
            return r0.c();
        }
        return null;
    }

    public final void po(List<DiscoverCategory> list, List<Hint> list2) {
        int size = list2.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Hint hint = list2.get(i);
            int size2 = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                if (epx.f("discover_categories_shine:" + list.get(i2).getId(), hint.getId())) {
                    int i3 = i2 + 1;
                    so(i3);
                    this.f0 = hint;
                    this.g0 = Integer.valueOf(i3);
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            Hint hint2 = this.f0;
            if (hint2 != null) {
                pla.e().b().s(hint2);
            }
            this.f0 = null;
            this.g0 = null;
            so(-1);
        }
        if (!ko()) {
            this.h0 = list;
            this.i0 = list2;
            return;
        }
        this.h0 = null;
        this.i0 = null;
        if (list2.isEmpty()) {
            return;
        }
        int size3 = list2.size();
        boolean z2 = false;
        for (int i4 = 0; i4 < size3; i4++) {
            final Hint hint3 = list2.get(i4);
            int size4 = list.size();
            final int i5 = 0;
            while (true) {
                if (i5 >= size4) {
                    break;
                }
                if (epx.f("discover_categories:" + list.get(i5).getId(), hint3.getId())) {
                    this.c0.postDelayed(new Runnable() { // from class: xsna.rbv
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Runnable, xsna.ubv] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppBarLayout appBarLayout;
                            int i6 = HomeFragment2.x0;
                            final int i7 = i5 + 1;
                            final HomeFragment2 homeFragment2 = HomeFragment2.this;
                            final FragmentActivity activity = homeFragment2.getActivity();
                            if (activity == null || pla.e().b().n()) {
                                return;
                            }
                            SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
                            if (skeletonTabLayout != null) {
                                skeletonTabLayout.v(i7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, true);
                            }
                            AppBarLayout appBarLayout2 = homeFragment2.Q;
                            if (appBarLayout2 != null) {
                                appBarLayout2.g(true, false, true);
                            }
                            ubv ubvVar = homeFragment2.d0;
                            if (ubvVar != null && (appBarLayout = homeFragment2.Q) != null) {
                                appBarLayout.removeCallbacks(ubvVar);
                            }
                            final Hint hint4 = hint3;
                            ?? r1 = new Runnable() { // from class: xsna.ubv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    HomeFragment2 homeFragment22 = HomeFragment2.this;
                                    View b2 = usn0.b(homeFragment22.T, i7);
                                    if (b2 == null) {
                                        return;
                                    }
                                    Rect d2 = w11.d(b2);
                                    d2.inset(0, -cn70.b(2));
                                    RectF rectF = new RectF();
                                    if (d2.isEmpty() || d2.height() < b2.getHeight()) {
                                        return;
                                    }
                                    dcn dcnVar = homeFragment22.e0;
                                    if (dcnVar != null) {
                                        dcnVar.dismiss();
                                    }
                                    homeFragment22.e0 = null;
                                    if (pla.e().b().n() || f4m.g(b2)) {
                                        return;
                                    }
                                    hl60 hl60Var = hl60.a;
                                    FragmentActivity fragmentActivity = activity;
                                    hl60.g(hl60Var, fragmentActivity, b2, hint4, true, new u4e(fragmentActivity, 29), false, new s2b(b2, d2, rectF, 5), null, null, null, 1920);
                                }
                            };
                            homeFragment2.d0 = r1;
                            AppBarLayout appBarLayout3 = homeFragment2.Q;
                            if (appBarLayout3 != 0) {
                                appBarLayout3.post(r1);
                            }
                        }
                    }, 250L);
                    z2 = true;
                    break;
                }
                i5++;
            }
            if (z2) {
                return;
            }
        }
    }

    public final void qo(String str) {
        if (epx.f(str, HintId.INFO_DISCOVER_TOPIC_TAB.getId())) {
            to(1, str);
        } else if (epx.f(str, HintId.INFO_BUBBLE_DISABLE_TOP_NEWS.getId())) {
            to(0, str);
        }
    }

    public final void ro(View view) {
        e.b a2;
        VkContextMenu l;
        VkContextMenu vkContextMenu = this.Y;
        if (vkContextMenu != null) {
            vkContextMenu.j(false);
            return;
        }
        if (view == null) {
            return;
        }
        a2 = VkContextMenu.e.a(krv0.l(R.attr.vk_ui_icon_accent), view);
        a2.f(requireContext());
        a2.e(go());
        l = a2.l(false);
        this.Y = l;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        sgh0.a aVar = sgh0.a.a;
        f fo = fo();
        boolean T5 = fo instanceof o0u0 ? ((o0u0) fo).T5() : fo instanceof qhh0 ? ((qhh0) fo).s() : false;
        ViewPager viewPager = this.S;
        boolean z = viewPager != null && viewPager.getCurrentItem() == 0;
        AppBarLayout appBarLayout = this.Q;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
        if (T5 || z) {
            return T5;
        }
        ViewPager viewPager2 = this.S;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0, true);
        }
        return true;
    }

    public final void so(int i) {
        SkeletonTabLayout skeletonTabLayout = this.T;
        if (skeletonTabLayout == null) {
            return;
        }
        int tabCount = skeletonTabLayout.getTabCount();
        int i2 = 0;
        while (i2 < tabCount) {
            TabLayout.g b2 = skeletonTabLayout.b(i2);
            View d2 = b2 != null ? b2.d() : null;
            BlendingTabView blendingTabView = d2 instanceof BlendingTabView ? (BlendingTabView) d2 : null;
            if (blendingTabView != null) {
                blendingTabView.setShineVisible(i2 == i);
            }
            i2++;
        }
    }

    public final void to(int i, final String str) {
        final int i2;
        final FragmentActivity activity = getActivity();
        if (activity != null && pla.e().b().a(str)) {
            SkeletonTabLayout skeletonTabLayout = this.T;
            if (skeletonTabLayout != null) {
                i2 = i;
                skeletonTabLayout.v(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, true);
            } else {
                i2 = i;
            }
            AppBarLayout appBarLayout = this.Q;
            if (appBarLayout != null) {
                appBarLayout.g(true, false, true);
            }
            AppBarLayout appBarLayout2 = this.Q;
            if (appBarLayout2 != null) {
                appBarLayout2.post(new Runnable() { // from class: xsna.sbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        HomeFragment2 homeFragment2 = HomeFragment2.this;
                        View b2 = usn0.b(homeFragment2.T, i2);
                        if (b2 == null) {
                            return;
                        }
                        Rect d2 = w11.d(b2);
                        d2.inset(-cn70.b(2), -cn70.b(2));
                        if (d2.isEmpty() || d2.height() < b2.getHeight()) {
                            return;
                        }
                        dcn dcnVar = homeFragment2.e0;
                        if (dcnVar != null) {
                            dcnVar.dismiss();
                        }
                        l7v b3 = pla.e().b();
                        b3.getClass();
                        l7v.b bVar = new l7v.b(str, b3, d2);
                        bVar.i = true;
                        homeFragment2.e0 = bVar.j(activity);
                    }
                });
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        ecv ecvVar = this.a0;
        if (ecvVar == null || gVar == null) {
            return;
        }
        f c2 = ecvVar.c(gVar.f());
        if (c2 instanceof hai0) {
            ((hai0) c2).c3();
        }
    }
}
