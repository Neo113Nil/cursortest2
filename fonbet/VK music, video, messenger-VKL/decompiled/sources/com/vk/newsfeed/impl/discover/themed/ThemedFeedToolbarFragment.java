package com.vk.newsfeed.impl.discover.themed;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.google.android.material.appbar.NonBouncedAppBarShadowView;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.h;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.newsfeed.common.util.k;
import com.vk.newsfeed.impl.discover.themed.ThemedFeedToolbarFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.g;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.bwt0;
import xsna.dcn;
import xsna.f3p0;
import xsna.fa00;
import xsna.gzs;
import xsna.hai0;
import xsna.hij0;
import xsna.iia0;
import xsna.iml0;
import xsna.k7l0;
import xsna.m3y;
import xsna.n240;
import xsna.o0q0;
import xsna.o83;
import xsna.ods;
import xsna.oz50;
import xsna.pds;
import xsna.qhh0;
import xsna.s3q0;
import xsna.too0;
import xsna.u11;
import xsna.upo0;
import xsna.vbs;
import xsna.xa80;
import xsna.y4;

/* compiled from: ThemedFeedToolbarFragment.kt */
/* loaded from: classes4.dex */
public class ThemedFeedToolbarFragment extends FragmentImpl implements TabLayout.d, qhh0, pds, hai0, ods, too0, o0q0 {
    public static final /* synthetic */ int a0 = 0;
    public dcn O;
    public NonBouncedAppBarLayout Q;
    public DefaultErrorView R;
    public View S;
    public DefaultEmptyView T;
    public b U;
    public ViewPager V;
    public TabLayout W;
    public View X;
    public NonBouncedAppBarShadowView Y;
    public y4 Z;
    public final io.reactivex.rxjava3.disposables.b N = new io.reactivex.rxjava3.disposables.b();
    public final g P = new g();

    /* compiled from: ThemedFeedToolbarFragment.kt */
    public static class a extends oz50 {
    }

    @Override // xsna.ods
    public final void Dm(int i, int i2) {
        if (i != 0) {
            Hn();
        }
    }

    @Override // xsna.pds
    public final void J0() {
        f eo = eo();
        if (eo instanceof pds) {
            ((pds) eo).J0();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        ArrayList<Pair<DiscoverCategory, FragmentImpl>> arrayList;
        TabLayout tabLayout = this.W;
        if (tabLayout != null) {
            go(tabLayout);
        }
        b bVar = this.U;
        if (bVar == null || (arrayList = bVar.m) == null) {
            return;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (FragmentImpl) ((Pair) it.next()).g();
            if (fVar instanceof too0) {
                ((too0) fVar).Ng();
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        dcn dcnVar = this.O;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        this.O = null;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void Wd(TabLayout.g gVar) {
        NonBouncedAppBarShadowView.a aVar;
        CoordinatorLayout coordinatorLayout;
        Hn();
        if (gVar != null) {
            b bVar = this.U;
            FragmentImpl c = bVar != null ? bVar.c(gVar.e) : null;
            if (c == null) {
                return;
            }
            if (c instanceof hai0) {
                ((hai0) c).q1();
            }
            View view = c.getView();
            if (view == null) {
                return;
            }
            try {
                NonBouncedAppBarShadowView nonBouncedAppBarShadowView = this.Y;
                if (nonBouncedAppBarShadowView != null && (aVar = nonBouncedAppBarShadowView.g) != null && (coordinatorLayout = aVar.l) != null) {
                    aVar.L();
                    NonBouncedAppBarShadowView.a.M(aVar, coordinatorLayout, view);
                }
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
    }

    public final FragmentImpl eo() {
        b bVar = this.U;
        if (bVar == null) {
            return null;
        }
        ViewPager viewPager = this.V;
        int currentItem = viewPager != null ? viewPager.getCurrentItem() : 0;
        FragmentImpl c = (currentItem < 0 || currentItem >= bVar.m.size()) ? null : bVar.c(currentItem);
        if (c == null || !c.isAdded()) {
            return null;
        }
        return c;
    }

    public final void fo() {
        TabLayout tabLayout;
        ViewPager viewPager = this.V;
        if (viewPager == null || (tabLayout = this.W) == null) {
            return;
        }
        DefaultErrorView defaultErrorView = this.R;
        if (defaultErrorView != null) {
            defaultErrorView.setVisibility(8);
        }
        View view = this.S;
        if (view != null) {
            view.setVisibility(0);
        }
        DefaultEmptyView defaultEmptyView = this.T;
        if (defaultEmptyView != null) {
            defaultEmptyView.setVisibility(8);
        }
        ViewPager viewPager2 = this.V;
        if (viewPager2 != null) {
            viewPager2.setVisibility(8);
        }
        TabLayout tabLayout2 = this.W;
        if (tabLayout2 != null) {
            tabLayout2.setVisibility(8);
        }
        c subscribe = new s0(new upo0()).subscribe(new n240(new o83(this, viewPager, tabLayout, 9), 24), new m3y(new hij0(this, 8), 25));
        this.P.b(subscribe);
        this.N.b(subscribe);
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        return eo();
    }

    public final void go(TabLayout tabLayout) {
        int tabCount = tabLayout.getTabCount();
        for (final int i = 0; i < tabCount; i++) {
            final TabLayout.g b2 = tabLayout.b(i);
            if (b2 != null) {
                b bVar = this.U;
                View view = null;
                if (bVar != null) {
                    Context context = tabLayout.getContext();
                    View view2 = b2.f;
                    if (view2 == null) {
                        view = LayoutInflater.from(context).inflate(R.layout.themed_feed_tab_2, (ViewGroup) null);
                        u11.h(-2, -1, view);
                    } else {
                        view = view2;
                    }
                    ((TextView) view.findViewById(R.id.text)).setText(bVar.getPageTitle(i));
                    view.setOnClickListener(new View.OnClickListener() { // from class: xsna.vpo0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ArrayList<Pair<DiscoverCategory, FragmentImpl>> arrayList;
                            ThemedFeedToolbarFragment themedFeedToolbarFragment = ThemedFeedToolbarFragment.this;
                            TabLayout tabLayout2 = themedFeedToolbarFragment.W;
                            int selectedTabPosition = tabLayout2 != null ? tabLayout2.getSelectedTabPosition() : 0;
                            ThemedFeedToolbarFragment.b bVar2 = themedFeedToolbarFragment.U;
                            if (bVar2 != null && (arrayList = bVar2.m) != null) {
                                int size = arrayList.size();
                                int i2 = i;
                                if (selectedTabPosition != i2 && selectedTabPosition >= 0 && selectedTabPosition < size && i2 >= 0 && i2 < size) {
                                    String str = com.vk.newsfeed.common.util.k.a;
                                    com.vk.newsfeed.common.util.k.d(selectedTabPosition, i2, "tap", arrayList.get(selectedTabPosition).i().b, arrayList.get(i2).i().b);
                                }
                            }
                            b2.j();
                        }
                    });
                }
                b2.l(view);
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        s();
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        y4 y4Var;
        if (this.Z != null) {
            L.l("You're trying to overwrite the callback before it was invoked! Fix it or switch to a collection");
            return;
        }
        this.Z = new y4(25, gzsVar, this);
        if (!isResumed() || (y4Var = this.Z) == null) {
            return;
        }
        y4Var.invoke();
    }

    @Override // xsna.pds
    public final void o1() {
        fo();
        if (isHidden() || Mn()) {
            return;
        }
        f eo = eo();
        if (eo instanceof pds) {
            ((pds) eo).o1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_themed_feed_toolbar, viewGroup, false);
        this.Q = (NonBouncedAppBarLayout) inflate.findViewById(R.id.appbar);
        this.X = inflate.findViewById(R.id.toolbar_container);
        this.Y = (NonBouncedAppBarShadowView) inflate.findViewById(R.id.appbar_shadow);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle(R.string.recommendations);
            f3p0.a(toolbar, this, new k7l0(this, 9));
            bwt0.i0(toolbar, new fa00(this, 29));
        }
        this.U = new b(In());
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.viewpager);
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(1);
        } else {
            viewPager = null;
        }
        this.V = viewPager;
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tabs);
        this.W = tabLayout;
        tabLayout.setupWithViewPager(this.V);
        tabLayout.g(this);
        DefaultErrorView defaultErrorView = new DefaultErrorView(mo2getContext());
        defaultErrorView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.R = defaultErrorView;
        View inflate2 = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_view_default_loading, (ViewGroup) null);
        inflate2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.S = inflate2;
        DefaultEmptyView defaultEmptyView = new DefaultEmptyView(mo2getContext(), null);
        defaultEmptyView.setText(R.string.liblists_empty_list);
        defaultEmptyView.setImage(0);
        defaultEmptyView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.T = defaultEmptyView;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.container);
        frameLayout.addView(this.R);
        frameLayout.addView(this.S);
        frameLayout.addView(this.T);
        DefaultErrorView defaultErrorView2 = this.R;
        if (defaultErrorView2 != null) {
            defaultErrorView2.setRetryClickListener(new xa80() { // from class: xsna.tpo0
                @Override // xsna.xa80
                public final void b() {
                    int i = ThemedFeedToolbarFragment.a0;
                    ThemedFeedToolbarFragment.this.fo();
                }
            });
        }
        fo();
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.N.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        this.W = null;
        this.Y = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.Q = null;
        dcn dcnVar = this.O;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        this.O = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        J0();
        eo();
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o1();
        TabLayout tabLayout = this.W;
        if (tabLayout != null) {
            bwt0.V(tabLayout, new iia0(this, 27));
        }
        y4 y4Var = this.Z;
        if (y4Var != null) {
            y4Var.invoke();
        }
    }

    @Override // xsna.hai0
    public final void q1() {
        f eo = eo();
        if (eo instanceof hai0) {
            ((hai0) eo).q1();
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        NonBouncedAppBarLayout nonBouncedAppBarLayout;
        f eo = eo();
        boolean z = (eo instanceof qhh0) && ((qhh0) eo).s();
        if (z && (nonBouncedAppBarLayout = this.Q) != null) {
            nonBouncedAppBarLayout.h(true, true, true);
        }
        return z;
    }

    @Override // xsna.hai0
    public final void c3() {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void za(TabLayout.g gVar) {
    }

    /* compiled from: ThemedFeedToolbarFragment.kt */
    public static final class b extends h {
        public FragmentImpl k;
        public int l;
        public final ArrayList<Pair<DiscoverCategory, FragmentImpl>> m;

        public b(vbs vbsVar) {
            super(vbsVar, true);
            this.l = -1;
            this.m = new ArrayList<>();
        }

        @Override // com.vk.core.fragments.h
        public final FragmentImpl c(int i) {
            return this.m.get(i).j();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.m.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i) {
            return this.m.get(i).i().c;
        }

        @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
        public final Parcelable saveState() {
            return null;
        }

        @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            int i2 = this.l;
            f fVar = this.k;
            FragmentImpl fragmentImpl = obj instanceof FragmentImpl ? (FragmentImpl) obj : null;
            this.k = fragmentImpl;
            this.l = i;
            if (i2 != i) {
                if (fVar instanceof pds) {
                    ((pds) fVar).J0();
                }
                if (fragmentImpl instanceof pds) {
                    ((pds) fragmentImpl).i5(new iml0(fragmentImpl, 4));
                }
            }
            super.setPrimaryItem(viewGroup, i, obj);
            if (i2 == i || i2 < 0) {
                return;
            }
            ArrayList<Pair<DiscoverCategory, FragmentImpl>> arrayList = this.m;
            if (i2 >= arrayList.size() || i < 0 || i >= arrayList.size()) {
                return;
            }
            String str = k.a;
            k.d(i2, i, "swipe", arrayList.get(i2).i().b, arrayList.get(i).i().b);
        }

        @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }
    }

    @Override // xsna.ods
    public final void Kg(int i, int i2) {
    }
}
