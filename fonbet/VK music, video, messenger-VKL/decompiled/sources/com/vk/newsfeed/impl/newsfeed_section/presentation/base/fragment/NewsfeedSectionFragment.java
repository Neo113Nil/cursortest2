package com.vk.newsfeed.impl.newsfeed_section.presentation.base.fragment;

import android.os.Bundle;
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
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.bj6;
import xsna.dhr0;
import xsna.e43;
import xsna.h3p0;
import xsna.hai0;
import xsna.i13;
import xsna.j5g;
import xsna.msy;
import xsna.o0q0;
import xsna.o0u0;
import xsna.ods;
import xsna.oq;
import xsna.oz50;
import xsna.pds;
import xsna.q010;
import xsna.qhh0;
import xsna.sgh0;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.xds;
import xsna.xy60;
import xsna.yy60;

/* compiled from: NewsfeedSectionFragment.kt */
/* loaded from: classes4.dex */
public final class NewsfeedSectionFragment extends FragmentImpl implements TabLayout.d, too0, qhh0, xds, o0q0 {
    public static final /* synthetic */ int V = 0;
    public AppBarLayout P;
    public AppBarShadowView Q;
    public ViewPager R;
    public xy60 S;
    public final Object N = msy.a(LazyThreadSafetyMode.NONE, new i13(21));
    public final io.reactivex.rxjava3.disposables.b O = new io.reactivex.rxjava3.disposables.b();
    public final yy60 T = new yy60();
    public final b U = new b();

    /* compiled from: NewsfeedSectionFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(NewsfeedSectionFragment.class, null, null);
        }
    }

    /* compiled from: NewsfeedSectionFragment.kt */
    public static final class b implements AppBarLayout.f {
        public int b;
        public int c;

        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i) {
            boolean z = (this.b == i && appBarLayout.getHeight() == this.c) ? false : true;
            this.b = i;
            this.c = appBarLayout.getHeight();
            for (int i2 = 0; i2 < 2; i2++) {
                xy60 xy60Var = NewsfeedSectionFragment.this.S;
                Object obj = xy60Var != null ? (FragmentImpl) j5g.b0(i2, xy60Var.o) : null;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        xy60 xy60Var = this.S;
        if (xy60Var == null) {
            return;
        }
        FragmentImpl c = xy60Var.c(gVar.e);
        if (c instanceof hai0) {
            ((hai0) c).q1();
        }
        Hn();
        View view = c.getView();
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
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.newsfeed_section_top_bar);
        if (vkTopBar != null) {
            vkTopBar.setBack((!h3p0.a(this) || h3p0.g(this, vkTopBar)) ? null : new VkTopBar.b(new q010(this, 11), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
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
            vkTopBar.setOnClickListener(new bj6(this, 5));
        }
    }

    public final FragmentImpl fo() {
        xy60 xy60Var;
        ViewPager viewPager = this.R;
        if (viewPager == null || (xy60Var = this.S) == null) {
            return null;
        }
        return (FragmentImpl) j5g.b0(viewPager.getCurrentItem(), xy60Var.o);
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_newsfeed_section, viewGroup, false);
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.newsfeed_section_app_bar_layout);
        this.P = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.a(this.U);
        }
        this.Q = (AppBarShadowView) inflate.findViewById(R.id.shadow_view);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(1);
        xy60 xy60Var = new xy60(In(), this.T);
        viewPager.setAdapter(xy60Var);
        this.S = xy60Var;
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
            appBarLayout.f(this.U);
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
        xy60 xy60Var = this.S;
        if (xy60Var != null) {
            xy60Var.g(this.R);
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
        super.onViewCreated(view, bundle);
        eo(view);
        if (bundle == null) {
            NewsfeedFragment.a aVar = new NewsfeedFragment.a();
            Bundle arguments = getArguments();
            if (arguments != null && arguments.containsKey("list_id")) {
                aVar.j.putInt("list_id", arguments.getInt("list_id"));
            }
            ArrayList a2 = e43.a(aVar.f());
            ArrayList arrayList = new ArrayList();
            ArrayList<DiscoverCategory> arrayList2 = this.T.a;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            xy60 xy60Var = this.S;
            if (xy60Var != null) {
                ArrayList<FragmentImpl> arrayList3 = xy60Var.o;
                arrayList3.clear();
                arrayList3.addAll(a2);
                xy60Var.notifyDataSetChanged();
            }
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        return go(sgh0.a.a);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
        xy60 xy60Var = this.S;
        if (xy60Var == null || gVar == null) {
            return;
        }
        f c = xy60Var.c(gVar.e);
        if (c instanceof hai0) {
            ((hai0) c).c3();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
    }
}
