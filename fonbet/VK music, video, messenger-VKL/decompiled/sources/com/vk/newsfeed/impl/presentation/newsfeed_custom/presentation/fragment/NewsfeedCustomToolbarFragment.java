package com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.domain.model.NewsfeedCustomFeedType;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.dhr0;
import xsna.e43;
import xsna.h3p0;
import xsna.hai0;
import xsna.hes;
import xsna.hy2;
import xsna.j5g;
import xsna.jsk;
import xsna.lpj;
import xsna.msy;
import xsna.o0q0;
import xsna.o0u0;
import xsna.ods;
import xsna.oq;
import xsna.oz50;
import xsna.pds;
import xsna.qhh0;
import xsna.sgh0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.uq50;
import xsna.xds;
import xsna.yfb;

/* compiled from: NewsfeedCustomToolbarFragment.kt */
/* loaded from: classes4.dex */
public final class NewsfeedCustomToolbarFragment extends FragmentImpl implements TabLayout.d, too0, qhh0, xds, o0q0, hes {
    public static final /* synthetic */ int W = 0;
    public AppBarLayout P;
    public AppBarShadowView Q;
    public ViewPager R;
    public com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a S;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new hy2(21));
    public final io.reactivex.rxjava3.disposables.b O = new io.reactivex.rxjava3.disposables.b();
    public final com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.b T = new com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.b();
    public final b U = new b();
    public final c V = new c();

    /* compiled from: NewsfeedCustomToolbarFragment.kt */
    public static final class a extends oz50 {
        public a(String str) {
            super(NewsfeedCustomToolbarFragment.class, null, null);
            this.j.putString("feed_id", str);
        }

        public final void y(String str) {
            this.j.putParcelable("discover_id", new DiscoverId(str, Integer.MAX_VALUE, DiscoverCategoryType.DISCOVER_FULL, null, true, 0L, 0L, 96, null));
        }
    }

    /* compiled from: NewsfeedCustomToolbarFragment.kt */
    public static final class b extends FragmentImpl.b {
        public b() {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            lpj lpjVar2 = lpjVar;
            int i = NewsfeedCustomToolbarFragment.W;
            Bundle arguments = NewsfeedCustomToolbarFragment.this.getArguments();
            if (arguments != null ? arguments.getBoolean("show_in_lego_theme", false) : false) {
                dhr0.a.g(lpjVar2);
            } else {
                dhr0.a.getClass();
                dhr0.l(lpjVar2);
            }
        }
    }

    /* compiled from: NewsfeedCustomToolbarFragment.kt */
    public static final class c implements AppBarLayout.f {
        public int b;
        public int c;

        public c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            boolean z = (this.b == i && appBarLayout.getHeight() == this.c) ? false : true;
            this.b = i;
            this.c = appBarLayout.getHeight();
            for (int i2 = 0; i2 < 2; i2++) {
                com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar = NewsfeedCustomToolbarFragment.this.S;
                Object obj = aVar != null ? (FragmentImpl) j5g.b0(i2, aVar.o) : null;
                ods odsVar = obj instanceof ods ? (ods) obj : null;
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

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.U;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar = this.S;
        if (aVar == null) {
            return;
        }
        FragmentImpl c2 = aVar.c(gVar.e);
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
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
        }
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

    public final void eo(View view) {
        VkTopBar.Middle middle;
        Bundle arguments = getArguments();
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.newsfeed_container_top_bar);
        if (vkTopBar != null) {
            vkTopBar.setBack((!h3p0.a(this) || h3p0.g(this, vkTopBar)) ? null : new VkTopBar.b(new uq50(this, 2), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
        }
        if (vkTopBar != null) {
            if (arguments == null || !arguments.containsKey("title")) {
                middle = VkTopBar.Middle.c.a;
            } else {
                String string = arguments.getString("title");
                middle = (string == null || string.length() == 0) ? VkTopBar.Middle.c.a : new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, string), null, null, null, null, 24), null, null, null, 14);
            }
            vkTopBar.setMiddle(middle);
        }
        if (vkTopBar != null) {
            vkTopBar.setOnClickListener(new jsk(this, 6));
        }
    }

    public final FragmentImpl fo() {
        com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar;
        ViewPager viewPager = this.R;
        if (viewPager == null || (aVar = this.S) == null) {
            return null;
        }
        return (FragmentImpl) j5g.b0(viewPager.getCurrentItem(), aVar.o);
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        return fo();
    }

    public final boolean go(sgh0 sgh0Var) {
        f fo = fo();
        boolean T5 = fo instanceof o0u0 ? ((o0u0) fo).T5() : fo instanceof qhh0 ? ((qhh0) fo).s() : false;
        ViewPager viewPager = this.R;
        boolean z = viewPager != null && viewPager.getCurrentItem() == 0;
        AppBarLayout appBarLayout = this.P;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
        if (T5 || z) {
            return T5;
        }
        ViewPager viewPager2 = this.R;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0, true);
        }
        return true;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        f fo = fo();
        int i = sgh0.c.a;
        if (fo instanceof o0u0) {
            ((o0u0) fo).T5();
        } else if (fo instanceof qhh0) {
            ((qhh0) fo).s();
        }
        AppBarLayout appBarLayout = this.P;
        if (appBarLayout != null) {
            appBarLayout.setExpanded(true);
        }
    }

    @Override // xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_header_background);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        View view = getView();
        if (view != null) {
            eo(view);
        }
    }

    @Override // xsna.hes
    public final void m(String str) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putString("title", str);
        }
        View view = getView();
        VkTopBar vkTopBar = view != null ? (VkTopBar) view.findViewById(R.id.newsfeed_container_top_bar) : null;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str), null, null, null, null, 24), null, null, null, 14));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed_container, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.newsfeed_container_app_bar_layout);
        this.P = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.a(this.V);
        }
        this.Q = (AppBarShadowView) inflate.findViewById(R.id.shadow_view);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(1);
        com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar = new com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a(In(), this.T);
        viewPager.setAdapter(aVar);
        this.S = aVar;
        this.R = viewPager;
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.O.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View findViewById;
        AppBarLayout appBarLayout = this.P;
        if (appBarLayout != null) {
            appBarLayout.f(this.V);
        }
        AppBarShadowView appBarShadowView = this.Q;
        if (appBarShadowView != null) {
            appBarShadowView.setOnModeChangedListener(null);
        }
        View view = getView();
        if (view != null && (findViewById = view.findViewById(R.id.header_container)) != null) {
            findViewById.setOnClickListener(null);
        }
        ViewPager viewPager = this.R;
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar = this.S;
        if (aVar != null) {
            aVar.g(this.R);
        }
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        f fo = fo();
        if (fo instanceof pds) {
            ((pds) fo).J0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        AppBarLayout appBarLayout;
        super.onResume();
        if (((Boolean) this.N.getValue()).booleanValue() && (appBarLayout = this.P) != null) {
            appBarLayout.g(true, false, true);
        }
        f fo = fo();
        if (fo instanceof pds) {
            ((pds) fo).o1();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        Parcelable parcelable;
        Object parcelable2;
        String string;
        super.onViewCreated(view, bundle);
        eo(view);
        if (bundle == null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = yfb.a();
            }
            String string2 = arguments.getString("feed_id");
            if (string2 == null) {
                string2 = "";
            }
            NewsfeedCustomFragment2.a aVar = new NewsfeedCustomFragment2.a(string2);
            boolean containsKey = arguments.containsKey("ref");
            Bundle bundle2 = aVar.j;
            if (containsKey) {
                String string3 = arguments.getString("ref");
                bundle2.putString("ref", string3 != null ? string3 : "");
            }
            if (arguments.containsKey("track_code")) {
                bundle2.putString("track_code", arguments.getString("track_code"));
            }
            if (arguments.containsKey("title") && (string = arguments.getString("title")) != null) {
                bundle2.putString("title", string);
            }
            if (arguments.containsKey("discover_id")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("discover_id", DiscoverId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = arguments.getParcelable("discover_id");
                    if (!(parcelable3 instanceof DiscoverId)) {
                        parcelable3 = null;
                    }
                    parcelable = (DiscoverId) parcelable3;
                }
                DiscoverId discoverId = (DiscoverId) parcelable;
                if (discoverId != null) {
                    bundle2.putParcelable("discover_id", discoverId);
                }
            }
            if (arguments.containsKey("NewsfeedCustomFragmentShops")) {
                bundle2.putBoolean("NewsfeedCustomFragmentShops", arguments.getBoolean("NewsfeedCustomFragmentShops", true));
            }
            if (arguments.containsKey("show_in_lego_theme")) {
                bundle2.putBoolean("show_in_lego_theme", arguments.getBoolean("show_in_lego_theme", false));
            }
            if (arguments.containsKey("feed_type")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = arguments.getSerializable("feed_type", NewsfeedCustomFeedType.class);
                } else {
                    Serializable serializable2 = arguments.getSerializable("feed_type");
                    serializable = (NewsfeedCustomFeedType) (serializable2 instanceof NewsfeedCustomFeedType ? serializable2 : null);
                }
                NewsfeedCustomFeedType newsfeedCustomFeedType = (NewsfeedCustomFeedType) serializable;
                if (newsfeedCustomFeedType == null) {
                    newsfeedCustomFeedType = NewsfeedCustomFeedType.NONE;
                }
                bundle2.putSerializable("feed_type", newsfeedCustomFeedType);
            }
            ArrayList a2 = e43.a(aVar.f());
            ArrayList arrayList = new ArrayList();
            ArrayList<DiscoverCategory> arrayList2 = this.T.a;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar2 = this.S;
            if (aVar2 != null) {
                ArrayList<FragmentImpl> arrayList3 = aVar2.o;
                arrayList3.clear();
                arrayList3.addAll(a2);
                aVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return go(sgh0.a.a);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.a aVar = this.S;
        if (aVar == null || gVar == null) {
            return;
        }
        f c2 = aVar.c(gVar.e);
        if (c2 instanceof hai0) {
            ((hai0) c2).c3();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
    }
}
