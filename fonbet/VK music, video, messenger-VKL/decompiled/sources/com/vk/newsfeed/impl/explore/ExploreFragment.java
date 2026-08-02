package com.vk.newsfeed.impl.explore;

import android.content.Context;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.vkblur.GradientDirection;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.imageloader.view.VKImageView;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.navigation.marked.FragmentWithGlobalSearch$TargetAction;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aaq;
import xsna.aes;
import xsna.baq;
import xsna.bwt0;
import xsna.caq;
import xsna.cn;
import xsna.cn70;
import xsna.daq;
import xsna.dhr0;
import xsna.dko;
import xsna.dnh;
import xsna.dw60;
import xsna.e2n;
import xsna.e3m;
import xsna.eph;
import xsna.epx;
import xsna.f4m;
import xsna.fbh;
import xsna.fc;
import xsna.fnj;
import xsna.gko;
import xsna.gzs;
import xsna.h3p0;
import xsna.hai0;
import xsna.hd60;
import xsna.hlu0;
import xsna.hnv;
import xsna.i13;
import xsna.iah0;
import xsna.jlu0;
import xsna.kiv0;
import xsna.kyq;
import xsna.lbs;
import xsna.lpj;
import xsna.mln0;
import xsna.msy;
import xsna.ndq;
import xsna.np2;
import xsna.nwk;
import xsna.o0q0;
import xsna.o0r0;
import xsna.o25;
import xsna.o93;
import xsna.oz50;
import xsna.p01;
import xsna.p3h;
import xsna.pd0;
import xsna.pds;
import xsna.ply;
import xsna.qhh0;
import xsna.rlh;
import xsna.s3q0;
import xsna.sa6;
import xsna.snx;
import xsna.sx6;
import xsna.t01;
import xsna.tlo0;
import xsna.usn0;
import xsna.v6j;
import xsna.ve7;
import xsna.vlw;
import xsna.w1n;
import xsna.w8i;
import xsna.wcg;
import xsna.wz5;
import xsna.xds;
import xsna.xwk;
import xsna.zds;
import xsna.zxo;

/* compiled from: ExploreFragment.kt */
/* loaded from: classes.dex */
public final class ExploreFragment extends FragmentImpl implements TabLayout.d, qhh0, mln0, aes, xds, o0q0, hnv, w8i {
    public static final /* synthetic */ int h0 = 0;
    public AppBarLayout O;
    public View P;
    public AppBarShadowView Q;
    public ViewPager R;
    public VkTabLayout S;
    public VkTabs T;
    public FrameLayout U;
    public VKImageView V;
    public int W;
    public int X;
    public com.vk.newsfeed.impl.explore.a Y;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final e f0;
    public boolean g0;
    public final io.reactivex.rxjava3.disposables.b N = new io.reactivex.rxjava3.disposables.b();
    public final com.vk.newsfeed.impl.explore.b Z = new com.vk.newsfeed.impl.explore.b();
    public final f a0 = new f();

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
    public static final class BlurBackdropBehavior extends CoordinatorLayout.c<View> {
        public BlurBackdropBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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
            if (view.getHeight() == bottom) {
                return false;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = bottom;
            view.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends oz50 {
        public a() {
            super(ExploreFragment.class, null, null);
        }

        public final void y(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            this.j.putString("tab", str);
        }
    }

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
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
            try {
                iArr[FragmentWithGlobalSearch$TargetAction.HeaderSearchQueryViewClick.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        public c(ExploreFragment exploreFragment) {
            super(0, exploreFragment, ExploreFragment.class, "onUserAvatarClick", "onUserAvatarClick()V", 0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ExploreFragment exploreFragment = (ExploreFragment) this.receiver;
            int i = ExploreFragment.h0;
            exploreFragment.io();
            return s3q0.a;
        }
    }

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        public d(ExploreFragment exploreFragment) {
            super(0, exploreFragment, ExploreFragment.class, "onUserAvatarLongClick", "onUserAvatarLongClick()V", 0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ExploreFragment exploreFragment = (ExploreFragment) this.receiver;
            int i = ExploreFragment.h0;
            exploreFragment.jo();
            return s3q0.a;
        }
    }

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
    public static final class e extends FragmentImpl.b {
        public e() {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            int i = ExploreFragment.h0;
            if (ExploreFragment.this.go()) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: ExploreFragment.kt */
    /* loaded from: classes4.dex */
    public static final class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            VkTabs.c selectedTab;
            final com.vk.newsfeed.impl.explore.a aVar;
            ExploreFragment exploreFragment = ExploreFragment.this;
            VkTabLayout vkTabLayout = exploreFragment.S;
            if (vkTabLayout != null) {
                int tabCount = vkTabLayout.getTabCount();
                for (final int i = 0; i < tabCount; i++) {
                    TabLayout.g b = vkTabLayout.b(i);
                    if (b != null && (aVar = exploreFragment.Y) != null) {
                        String a = aVar.k.a(i);
                        if (!epx.f(b.c, a)) {
                            b.q(a);
                        }
                        final TabLayout tabLayout = b.g;
                        View b2 = usn0.b(tabLayout, i);
                        if (b2 != null) {
                            b2.setOnClickListener(new View.OnClickListener() { // from class: xsna.faq
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    TabLayout tabLayout2 = TabLayout.this;
                                    if (tabLayout2 != null) {
                                        aVar.j(i, tabLayout2.getSelectedTabPosition(), "tap");
                                    }
                                }
                            });
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                s3q0 s3q0Var2 = s3q0.a;
            }
            VkTabs vkTabs = exploreFragment.T;
            if (vkTabs != null) {
                int tabsCount = vkTabs.getTabsCount();
                for (final int i2 = 0; i2 < tabsCount; i2++) {
                    VkTabs.c f = vkTabs.f(i2);
                    final com.vk.newsfeed.impl.explore.a aVar2 = exploreFragment.Y;
                    if (aVar2 != null) {
                        VkTabs.c.a(f, aVar2.k.a(i2));
                        com.vk.core.view.components.tabs.d dVar = f.a;
                        ViewParent parent = dVar.getParent();
                        final Integer num = null;
                        VkTabs vkTabs2 = parent instanceof VkTabs ? (VkTabs) parent : null;
                        if (vkTabs2 != null && (selectedTab = vkTabs2.getSelectedTab()) != null) {
                            num = Integer.valueOf(selectedTab.b);
                        }
                        dVar.setOnClickListener(new View.OnClickListener() { // from class: xsna.eaq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Integer num2 = num;
                                if (num2 != null) {
                                    aVar2.j(i2, num2.intValue(), "tap");
                                }
                            }
                        });
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                }
                s3q0 s3q0Var4 = s3q0.a;
            }
        }
    }

    public ExploreFragment() {
        RoundingParams.a();
        p3h p3hVar = new p3h(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b0 = msy.a(lazyThreadSafetyMode, p3hVar);
        this.c0 = msy.a(lazyThreadSafetyMode, new nwk(this, 6));
        this.d0 = msy.a(lazyThreadSafetyMode, new i13(10));
        this.e0 = msy.a(lazyThreadSafetyMode, new fc(12));
        this.f0 = new e();
    }

    @Override // xsna.aes
    public final void A0() {
        View view = getView();
        if (view != null) {
            mo(view);
        }
    }

    @Override // xsna.hnv
    public final void F2(String str) {
        com.vk.newsfeed.impl.explore.a aVar;
        ViewPager viewPager;
        DiscoverId discoverId;
        if (str == null || str.length() == 0 || (aVar = this.Y) == null) {
            return;
        }
        int count = aVar.getCount();
        int i = 0;
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            FragmentImpl g = aVar.g(i);
            if (g != null) {
                Bundle arguments = g.getArguments();
                String e2 = (arguments == null || (discoverId = (DiscoverId) arguments.getParcelable("discover_id")) == null) ? null : discoverId.e();
                if (e2 != null && e2.equals(str)) {
                    break;
                }
            }
            i++;
        }
        if (i < 0 || (viewPager = this.R) == null) {
            return;
        }
        viewPager.setCurrentItem(i, true);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.f0;
    }

    @Override // xsna.mln0
    public final void N4() {
        com.vk.newsfeed.impl.explore.a aVar = this.Y;
        if (aVar != null) {
            aVar.d = false;
        }
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i = 0; i < count; i++) {
                com.vk.newsfeed.impl.explore.a aVar2 = this.Y;
                androidx.lifecycle.f g = aVar2 != null ? aVar2.g(i) : null;
                dw60 dw60Var = g instanceof dw60 ? (dw60) g : null;
                if (dw60Var != null) {
                    dw60Var.nd(true);
                }
            }
        }
        com.vk.newsfeed.impl.explore.a aVar3 = this.Y;
        if (aVar3 != null) {
            int count2 = aVar3.getCount();
            for (int i2 = 0; i2 < count2; i2++) {
                com.vk.newsfeed.impl.explore.a aVar4 = this.Y;
                androidx.lifecycle.f g2 = aVar4 != null ? aVar4.g(i2) : null;
                zds zdsVar = g2 instanceof zds ? (zds) g2 : null;
                if (zdsVar != null) {
                    zdsVar.zm(this.X);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        com.vk.newsfeed.impl.explore.a aVar = this.Y;
        if (aVar == null) {
            return;
        }
        FragmentImpl c2 = aVar.c(gVar.f());
        if (c2 instanceof hai0) {
            ((hai0) c2).q1();
        }
        Hn();
        View view = c2.getView();
        if (view == null) {
            return;
        }
        try {
            AppBarShadowView appBarShadowView = this.Q;
            if (appBarShadowView != null) {
                appBarShadowView.V(view);
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        if (!go()) {
            return true;
        }
        AppBarLayout appBarLayout = this.O;
        if (appBarLayout != null) {
            f4m.y(rect2.top, appBarLayout);
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
        ViewPager viewPager = this.R;
        if (viewPager != null && viewPager.getCurrentItem() == 0) {
            return false;
        }
        ViewPager viewPager2 = this.R;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0, true);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void eo(kyq kyqVar) {
        kyq.a aVar;
        if (h3p0.a(this)) {
            aVar = new kyq.a.b(getString(R.string.back));
        } else if (lbs.q(this)) {
            String str = o25.a().o().c;
            if (str == null) {
                str = "";
            }
            aVar = new kyq.a.C3218a(str, getString(R.string.accessibility_navigation_drawer));
        } else {
            aVar = null;
        }
        kyqVar.setLeft(aVar);
        kyqVar.setMiddle(new kyq.b.a(getString(R.string.newsfeed_toolbar_search), getString(R.string.accessibility_explore_search)));
        kyqVar.setOnBackClickListener(new fbh(this, 11));
        kyqVar.setOnAvatarClickListener(new c(this));
        kyqVar.setOnAvatarLongClickListener(((hlu0) this.b0.getValue()).a() ? new d(this) : null);
        kyqVar.setOnSearchClickListener(new dnh(this, 16));
    }

    public final FragmentImpl fo() {
        com.vk.newsfeed.impl.explore.a aVar;
        ViewPager viewPager = this.R;
        if (viewPager == null || (aVar = this.Y) == null) {
            return null;
        }
        return aVar.g(viewPager.getCurrentItem());
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        return fo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean go() {
        return ((Boolean) this.e0.getValue()).booleanValue();
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        View view = this.P;
        kyq kyqVar = view instanceof kyq ? (kyq) view : null;
        if (kyqVar != null) {
            String f2 = v6jVar.f();
            kyqVar.setLeft(new kyq.a.C3218a(f2 != null ? f2 : ""));
            return;
        }
        VKImageView vKImageView = this.V;
        if (vKImageView != null) {
            String f3 = v6jVar.f();
            ndq.a(vKImageView, f3 != null ? f3 : "");
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        AppBarLayout appBarLayout = this.O;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
    }

    public final void ho(int i) {
        if (go()) {
            this.X = i;
            com.vk.newsfeed.impl.explore.a aVar = this.Y;
            if (aVar != null) {
                int count = aVar.getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    com.vk.newsfeed.impl.explore.a aVar2 = this.Y;
                    FragmentImpl g = aVar2 != null ? aVar2.g(i2) : null;
                    zds zdsVar = g instanceof zds ? (zds) g : null;
                    if (zdsVar != null) {
                        zdsVar.zm(i);
                    }
                }
            }
        }
    }

    public final void io() {
        cn o = o25.a().o();
        xwk.e().m(requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo() {
        ((jlu0) this.c0.getValue()).e(this, MultiAccountEntryPoint.LongTap.d);
    }

    @Override // xsna.mln0
    public final void k1() {
        com.vk.newsfeed.impl.explore.a aVar = this.Y;
        if (aVar != null) {
            aVar.d = true;
        }
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i = 0; i < count; i++) {
                com.vk.newsfeed.impl.explore.a aVar2 = this.Y;
                FragmentImpl g = aVar2 != null ? aVar2.g(i) : null;
                dw60 dw60Var = g instanceof dw60 ? (dw60) g : null;
                if (dw60Var != null) {
                    dw60Var.nd(false);
                }
            }
        }
    }

    public final void ko() {
        com.vk.newsfeed.impl.explore.a aVar;
        VkTabs vkTabs = this.T;
        if (vkTabs == null || (aVar = this.Y) == null) {
            return;
        }
        vkTabs.h(false);
        int count = aVar.getCount();
        for (int i = 0; i < count; i++) {
            VkTabs.c g = vkTabs.g();
            VkTabs.c.a(g, aVar.getPageTitle(i));
            vkTabs.b(g, false);
        }
        if (aVar.getCount() > 0) {
            ViewPager viewPager = this.R;
            vkTabs.l(Math.min(viewPager != null ? viewPager.getCurrentItem() : 0, vkTabs.getTabsCount() - 1), true);
        }
    }

    @Override // xsna.xoo0
    public final int l2() {
        return go() ? dhr0.t.c(R.attr.vk_ui_transparent) : dhr0.t.c(R.attr.vk_ui_header_background);
    }

    public final void lo() {
        ArrayList arrayList = new ArrayList();
        w1n.b.getClass();
        List<DiscoverCategory> E = w1n.E();
        ArrayList arrayList2 = new ArrayList(E.size());
        for (DiscoverCategory discoverCategory : E) {
            FragmentImpl a2 = new e2n(discoverCategory, arrayList2.size(), go()).a();
            if (a2 != null) {
                arrayList2.add(discoverCategory);
                arrayList.add(a2);
            }
        }
        this.Z.b(arrayList2);
        com.vk.newsfeed.impl.explore.a aVar = this.Y;
        if (aVar != null) {
            aVar.h(arrayList);
        }
        VkTabLayout vkTabLayout = this.S;
        if (vkTabLayout != null) {
            vkTabLayout.setTabMode(4);
        }
        VkTabs vkTabs = this.T;
        if (vkTabs != null) {
            vkTabs.setTabLayoutMode(VkTabs.TabLayoutMode.FIXED);
        }
        VkTabLayout vkTabLayout2 = this.S;
        if (vkTabLayout2 != null) {
            vkTabLayout2.w(this.R, false, false);
        }
        ko();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("tab") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("tab");
        }
        if (string != null) {
            F2(string);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void mo(View view) {
        VKImageView vKImageView;
        View view2 = this.P;
        kyq kyqVar = view2 instanceof kyq ? (kyq) view2 : null;
        if (kyqVar != null) {
            eo(kyqVar);
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.navigation_icon);
        if (imageView != null) {
            bwt0.p0(imageView, h3p0.a(this));
        }
        VKImageView vKImageView2 = (VKImageView) view.findViewById(R.id.user_photo);
        this.V = vKImageView2;
        if (vKImageView2 != null) {
            bwt0.p0(vKImageView2, lbs.q(this));
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(lbs.o(this) ? getString(R.string.newsfeed_toolbar_search) : getString(R.string.explore_title));
            f4m.s(iah0.a(11), textView);
            textView.setTextAppearance(textView.getContext(), R.style.VkUiTypography_DisplayTitle2);
            textView.setTextColor(dhr0.Y(R.attr.vk_ui_text_primary, textView.getContext()));
        }
        if (h3p0.a(this)) {
            if (imageView != null) {
                imageView.setImageResource(R.drawable.vk_icon_arrow_left_outline_28);
            }
            if (imageView != null) {
                imageView.setContentDescription(getResources().getString(R.string.back));
            }
            if (imageView != null) {
                bwt0.i0(imageView, new eph(this, 15));
                return;
            }
            return;
        }
        if (!lbs.q(this) || (vKImageView = this.V) == null) {
            return;
        }
        bwt0.i0(vKImageView, new wcg(this, 13));
        if (((hlu0) this.b0.getValue()).a()) {
            bwt0.k0(vKImageView, new zxo(this, 3));
        }
        vKImageView.setPaintFilterBitmap(true);
        vKImageView.getHierarchy().getClass();
        cn o = o25.a().o();
        VKImageView vKImageView3 = this.V;
        if (vKImageView3 != null) {
            String str = o.c;
            if (str == null) {
                str = "";
            }
            ndq.a(vKImageView3, str);
        }
    }

    public final boolean no(FragmentWithGlobalSearch$TargetAction fragmentWithGlobalSearch$TargetAction) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return false;
        }
        int i = b.$EnumSwitchMapping$0[fragmentWithGlobalSearch$TargetAction.ordinal()];
        hd60.a().j0(activity, i != 1 ? (i == 2 || i == 3) ? FragmentWithGlobalSearch$EntryMethod.OverviewScreenSearchIcon : FragmentWithGlobalSearch$EntryMethod.Unknown : FragmentWithGlobalSearch$EntryMethod.OverviewBottomIconLongTap);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewPager viewPager = this.R;
        if (viewPager == null) {
            return;
        }
        viewPager.postDelayed(new aaq(0, this, viewPager), 200L);
    }

    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean a2;
        FrameLayout frameLayout;
        VkTopBar.c.a aVar;
        VkTopBar.a.d dVar;
        View view;
        View inflate = go() ? LayoutInflater.from(mo2getContext()).inflate(R.layout.fragment_explore_lego, viewGroup, false) : LayoutInflater.from(mo2getContext()).inflate(R.layout.fragment_explore, viewGroup, false);
        if (bundle != null) {
            a2 = bundle.getBoolean("is_ds_top_bar", this.g0);
        } else {
            FeedFeatures feedFeatures = FeedFeatures.MAIN_FEED_COMPOSE_TOP_BAR;
            feedFeatures.getClass();
            a2 = com.vk.toggle.b.A.a(feedFeatures);
        }
        this.g0 = a2;
        int i = 6;
        if (inflate != null && (frameLayout = (FrameLayout) inflate.findViewById(R.id.app_bar_container)) != null) {
            if (go()) {
                kyq kyqVar = new kyq(layoutInflater.getContext());
                eo(kyqVar);
                view = kyqVar;
            } else if (this.g0) {
                VkTopBar vkTopBar = new VkTopBar(layoutInflater.getContext(), null, 6, 0);
                if (lbs.q(this)) {
                    String str = o25.a().o().c;
                    if (str == null) {
                        str = "";
                    }
                    aVar = new VkTopBar.c.a(new snx(new snx.b.c(new vlw(str), null, null, 14)), new np2(this), null, ((hlu0) this.b0.getValue()).a() ? new baq(this) : null, null, 20);
                } else {
                    aVar = null;
                }
                vkTopBar.setBefore(aVar);
                tlo0.a aVar2 = tlo0.Companion;
                String string = lbs.o(this) ? getString(R.string.newsfeed_toolbar_search) : getString(R.string.explore_title);
                aVar2.getClass();
                vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tlo0.a.d(string), null, null, null, null, 30), null, null, null, 14));
                if (lbs.o(this)) {
                    dVar = null;
                } else {
                    dko.a.a(R.drawable.vk_icon_search_outline_28);
                    dVar = VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(gko.c(R.drawable.vk_icon_search_outline_28), tlo0.a.b(R.string.accessibility_explore_search), new sx6(this), null, null, null, 56), null, 6);
                }
                vkTopBar.setAfter(dVar);
                vkTopBar.setTransparentBackground(go());
                vkTopBar.setOnClickListener(new wz5(this, 3));
                view = vkTopBar;
            } else {
                view = layoutInflater.inflate(R.layout.feed_discover_top_bar, (ViewGroup) frameLayout, false);
            }
            this.P = view;
            frameLayout.addView(this.P, (this.g0 || go()) ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(-1, cn70.b(56)));
            if (go()) {
                View view2 = this.P;
                if (view2 != null) {
                    f4m.t(cn70.b(4), view2);
                }
                f4m.q(cn70.b(2), frameLayout);
            }
        }
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        this.O = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.a(new caq(this));
        }
        AppBarLayout appBarLayout2 = this.O;
        int i2 = 1;
        if (appBarLayout2 != null) {
            bwt0.R(appBarLayout2, new pd0(this, i2));
        }
        AppBarShadowView appBarShadowView = (AppBarShadowView) inflate.findViewById(R.id.shadow_view);
        this.Q = appBarShadowView;
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(false);
        }
        View findViewById = inflate.findViewById(R.id.header_container);
        if (findViewById != null) {
            findViewById.setOnClickListener(new p01(this, i));
        }
        View findViewById2 = inflate.findViewById(R.id.search_button);
        if (findViewById2 != null) {
            bwt0.p0(findViewById2, !lbs.o(this));
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new t01(this, 4));
        }
        mo(inflate);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(1);
        com.vk.newsfeed.impl.explore.a aVar3 = new com.vk.newsfeed.impl.explore.a(In(), this.Z);
        aVar3.registerDataSetObserver(this.a0);
        viewPager.setAdapter(aVar3);
        this.Y = aVar3;
        viewPager.addOnPageChangeListener(new daq(this));
        this.R = viewPager;
        if (lbs.o(this) && !go()) {
            VkSearchView a3 = kiv0.a(requireContext());
            AppBarLayout appBarLayout3 = this.O;
            if (appBarLayout3 != null) {
                appBarLayout3.addView(a3);
            }
            a3.setVisibility(0);
            a3.c5(0, cn70.b(4), cn70.b(12), cn70.b(8));
            a3.X4(false);
            a3.setInputFocusable(false);
            a3.setHint(R.string.explore_search_hint);
            a3.V4();
            a3.setOnActionSearchQueryClick(new sa6(this, 4));
        }
        layoutInflater.getContext();
        View inflate2 = layoutInflater.inflate(R.layout.feed_tabs_v3, (ViewGroup) this.O, false);
        VkTabLayout vkTabLayout = inflate2 instanceof VkTabLayout ? (VkTabLayout) inflate2 : null;
        if (vkTabLayout != null) {
            vkTabLayout.setTabPaddingTabletHorizontal(cn70.b(16));
            this.S = vkTabLayout;
            vkTabLayout.setCustomTabContent(new rlh(this, 9));
            vkTabLayout.f(this);
            usn0.a(vkTabLayout);
            ve7 ve7Var = new ve7(vkTabLayout);
            ViewPager viewPager2 = this.R;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(ve7Var);
            }
            Context context = vkTabLayout.getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                FrameLayout frameLayout2 = new FrameLayout(vkTabLayout.getContext());
                frameLayout2.addView(vkTabLayout);
                AppBarLayout appBarLayout4 = this.O;
                if (appBarLayout4 != null) {
                    appBarLayout4.addView(frameLayout2);
                }
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                if (layoutParams instanceof AppBarLayout.d) {
                    ((AppBarLayout.d) layoutParams).a = 21;
                }
                this.U = frameLayout2;
            } else {
                AppBarLayout appBarLayout5 = this.O;
                if (appBarLayout5 != null) {
                    appBarLayout5.addView(vkTabLayout);
                }
            }
        }
        if (go()) {
            AppBarShadowView appBarShadowView2 = this.Q;
            if (appBarShadowView2 != null) {
                bwt0.p0(appBarShadowView2, false);
            }
            VkBlurContentView vkBlurContentView = (VkBlurContentView) inflate.findViewById(R.id.explore_blur_content_view);
            VkBlurView vkBlurView = (VkBlurView) inflate.findViewById(R.id.explore_top_bar_blur);
            bwt0.p0(vkBlurView, true);
            vkBlurView.setupWithContent(vkBlurContentView);
            vkBlurView.setGradientDirection(GradientDirection.BottomTop);
            AppBarLayout appBarLayout6 = this.O;
            if (appBarLayout6 != null) {
                appBarLayout6.setBackgroundColor(e3m.f(R.attr.vk_ui_header_background, requireContext()));
                Drawable background = appBarLayout6.getBackground();
                if (background != null) {
                    background.setAlpha(255);
                }
                appBarLayout6.a(new AppBarLayout.f() { // from class: xsna.z9q
                    @Override // com.google.android.material.appbar.AppBarLayout.a
                    public final void a(AppBarLayout appBarLayout7, int i3) {
                        int i4 = ExploreFragment.h0;
                        int totalScrollRange = appBarLayout7.getTotalScrollRange();
                        float f2 = totalScrollRange != 0 ? swe0.f((i3 / totalScrollRange) + 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) : 1.0f;
                        appBarLayout7.getBackground().setAlpha(an10.b(255.0f * f2));
                        View view3 = ExploreFragment.this.P;
                        if (view3 != null) {
                            view3.setAlpha(f2);
                        }
                    }
                });
            }
            View view3 = this.S;
            if (view3 == null) {
                view3 = this.T;
            }
            Object layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            AppBarLayout.d dVar2 = layoutParams2 instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams2 : null;
            if (dVar2 != null) {
                dVar2.a = 0;
            }
        }
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.N.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.O = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.V = null;
        com.vk.newsfeed.impl.explore.a aVar = this.Y;
        if (aVar != null) {
            aVar.unregisterDataSetObserver(this.a0);
        }
        this.Y = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        androidx.lifecycle.f fo = fo();
        if (fo instanceof pds) {
            ((pds) fo).J0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        AppBarLayout appBarLayout;
        super.onResume();
        if (((Boolean) this.d0.getValue()).booleanValue() && (appBarLayout = this.O) != null) {
            appBarLayout.g(true, false, true);
        }
        androidx.lifecycle.f fo = fo();
        if (fo instanceof pds) {
            ((pds) fo).o1();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("current_tab_position", this.W);
        bundle.putString("lang", ply.a());
        bundle.putBoolean("is_ds_top_bar", this.g0);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            lo();
        }
        view.post(new o93(this, 14));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        this.W = bundle != null ? bundle.getInt("current_tab_position", this.W) : this.W;
        if (bundle != null) {
            if (!epx.f(bundle.getString("lang"), ply.a())) {
                ViewPager viewPager = this.R;
                if (viewPager != null) {
                    viewPager.setCurrentItem(0);
                }
                lo();
            }
            VkTabLayout vkTabLayout = this.S;
            if (vkTabLayout != null) {
                vkTabLayout.w(this.R, false, false);
            }
            ko();
        }
    }

    @Override // xsna.aes
    public final RectF p1() {
        RectF avatarRect;
        View view = this.P;
        kyq kyqVar = view instanceof kyq ? (kyq) view : null;
        if (kyqVar != null && (avatarRect = kyqVar.getAvatarRect()) != null) {
            return avatarRect;
        }
        VKImageView vKImageView = this.V;
        if (vKImageView != null) {
            return bwt0.G(vKImageView);
        }
        return null;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        androidx.lifecycle.f fo = fo();
        qhh0 qhh0Var = fo instanceof qhh0 ? (qhh0) fo : null;
        boolean z = qhh0Var != null && qhh0Var.s();
        ViewPager viewPager = this.R;
        boolean z2 = viewPager != null && viewPager.getCurrentItem() == 0;
        AppBarLayout appBarLayout = this.O;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
        if (z || z2) {
            return z;
        }
        ViewPager viewPager2 = this.R;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0, true);
        }
        return true;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        com.vk.newsfeed.impl.explore.a aVar = this.Y;
        if (aVar == null || gVar == null) {
            return;
        }
        androidx.lifecycle.f c2 = aVar.c(gVar.f());
        if (c2 instanceof hai0) {
            ((hai0) c2).c3();
        }
    }
}
