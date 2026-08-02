package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.a7a;
import xsna.b7a;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fij0;
import xsna.g380;
import xsna.j9x;
import xsna.p4g;
import xsna.s3q0;
import xsna.so40;
import xsna.swe0;
import xsna.uog;
import xsna.usn0;
import xsna.wzs;
import xsna.xsn0;
import xsna.ysn0;
import xsna.zsn0;

/* compiled from: TabLayoutVh.kt */
/* loaded from: classes16.dex */
public final class TabLayoutVh implements CounterBadgeTabLayoutViewHolder, g380 {
    public final ViewPagerVh b;
    public final int c;
    public final Integer d;
    public final boolean e;
    public final b7a f;
    public VKTabLayout g;
    public VKTabLayout h;
    public final zsn0 i;
    public PagerAdapter j;
    public final ysn0 k;
    public final ArrayList l;
    public fij0 m;
    public UIBlockCatalog n;
    public boolean o;

    /* compiled from: TabLayoutVh.kt */
    public static final class a extends TabLayout.j {
        public a(DisableableViewPager disableableViewPager) {
            super(disableableViewPager);
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            View view = gVar.f;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                tabView.setTabSelected(true);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
            TabLayoutVh.this.b.s();
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
            if (gVar != null) {
                View view = gVar.f;
                TabView tabView = view instanceof TabView ? (TabView) view : null;
                if (tabView != null) {
                    tabView.setTabSelected(false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.ysn0] */
    public TabLayoutVh(ViewPagerVh viewPagerVh, int i, Integer num, boolean z, b7a b7aVar, int i2) {
        i = (i2 & 2) != 0 ? R.layout.catalog_tab_layout : i;
        num = (i2 & 4) != 0 ? null : num;
        z = (i2 & 16) != 0 ? false : z;
        this.b = viewPagerVh;
        this.c = i;
        this.d = num;
        this.e = z;
        this.f = b7aVar;
        this.i = new zsn0();
        this.k = new ViewPager.i() { // from class: xsna.ysn0
            @Override // androidx.viewpager.widget.ViewPager.i
            public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
                TabLayoutVh tabLayoutVh = TabLayoutVh.this;
                if (pagerAdapter != null) {
                    pagerAdapter.unregisterDataSetObserver(tabLayoutVh.i);
                }
                if (pagerAdapter2 != null) {
                    pagerAdapter2.registerDataSetObserver(tabLayoutVh.i);
                }
                tabLayoutVh.j = pagerAdapter2;
            }
        };
        this.l = new ArrayList();
        new ArrayList();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void C6() {
        VKTabLayout vKTabLayout = this.g;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        vKTabLayout.b(1);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void D5(UIBlockList uIBlockList) {
        ArrayList<UIBlock> arrayList;
        Pair i;
        UIBlockCatalog uIBlockCatalog = this.n;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null || (i = p4g.i(arrayList, new uog(uIBlockList, 7))) == null) {
            return;
        }
        ((Number) i.d()).intValue();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void K5(wzs<? super Integer, ? super TabView, s3q0> wzsVar) {
        VKTabLayout vKTabLayout = this.g;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        j9x it = swe0.q(0, vKTabLayout.getTabCount()).iterator();
        while (it.d) {
            int nextInt = it.nextInt();
            VKTabLayout vKTabLayout2 = this.g;
            if (vKTabLayout2 == null) {
                vKTabLayout2 = null;
            }
            TabLayout.g b2 = vKTabLayout2.b(nextInt);
            View view = b2 != null ? b2.f : null;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                wzsVar.invoke(Integer.valueOf(nextInt), tabView);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        fij0 fij0Var = this.m;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        this.l.clear();
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        if (disableableViewPager != null) {
            disableableViewPager.removeOnAdapterChangeListener(this.k);
        }
        PagerAdapter pagerAdapter = this.j;
        zsn0 zsn0Var = this.i;
        if (zsn0Var != null && pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(zsn0Var);
        }
        viewPagerVh.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6 A[SYNTHETIC] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        a7a a7aVar;
        VKTabLayout vKTabLayout = this.g;
        VKTabLayout vKTabLayout2 = vKTabLayout == null ? null : vKTabLayout;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        int i = 0;
        vKTabLayout2.setTabMode((vKTabLayout.getTabCount() > 2 || this.e) ? 0 : 1);
        UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog == null) {
            return;
        }
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (UIBlock uIBlock2 : arrayList) {
            CatalogDataType catalogDataType = uIBlock2.o;
            if (catalogDataType == null) {
                catalogDataType = uIBlock2.e;
            }
            arrayList2.add(catalogDataType);
        }
        K5(new xsn0(true));
        this.n = uIBlockCatalog;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.l;
            if (!hasNext) {
                arrayList4.addAll(arrayList3);
                a();
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlockHint uIBlockHint = ((UIBlock) next).j;
            if (uIBlockHint != null) {
                String str = uIBlockHint.y;
                if (this.f.a(str)) {
                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            if (str.equals(((a7a) it2.next()).a.y)) {
                            }
                        }
                    }
                    a7aVar = new a7a(uIBlockHint, i);
                    if (a7aVar == null) {
                        arrayList3.add(a7aVar);
                    }
                    i = i2;
                }
            }
            a7aVar = null;
            if (a7aVar == null) {
            }
            i = i2;
        }
    }

    public final void a() {
        if (this.o || this.m != null) {
            return;
        }
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            return;
        }
        a7a a7aVar = (a7a) arrayList.remove(0);
        VKTabLayout vKTabLayout = this.g;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        fij0 fij0Var = new fij0(vKTabLayout.b(a7aVar.b), this.f, a7aVar.a, new so40(this, 28));
        this.m = fij0Var;
        VKTabLayout vKTabLayout2 = this.g;
        (vKTabLayout2 != null ? vKTabLayout2 : null).postDelayed(fij0Var, 300L);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void cc(ViewPager.j jVar) {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.addOnPageChangeListener(jVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void d5() {
        ArrayList<UIBlock> arrayList;
        UIBlockCatalog uIBlockCatalog = this.n;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null) {
            return;
        }
        j9x it = e43.g(arrayList).iterator();
        while (it.d) {
            it.nextInt();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        ((java.lang.Number) r3.d()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gc(String str) {
        ArrayList<UIBlock> arrayList;
        UIBlockCatalog uIBlockCatalog = this.n;
        if (uIBlockCatalog != null && (arrayList = uIBlockCatalog.A) != null) {
            Iterator<T> it = arrayList.iterator();
            int i = 0;
            while (true) {
                Pair pair = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((UIBlock) next).b, str)) {
                    pair = new Pair(Integer.valueOf(i), next);
                    break;
                }
                i = i2;
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        VKTabLayout vKTabLayout = this.h;
        if (vKTabLayout != null) {
            f4m.j(vKTabLayout);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getContext();
        VKTabLayout vKTabLayout = (VKTabLayout) layoutInflater.inflate(this.c, viewGroup, false);
        this.g = vKTabLayout;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        vKTabLayout.setSpreadTabsEvenly(false);
        VKTabLayout vKTabLayout2 = this.g;
        if (vKTabLayout2 == null) {
            vKTabLayout2 = null;
        }
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        vKTabLayout2.f(new a(disableableViewPager));
        VKTabLayout vKTabLayout3 = this.g;
        if (vKTabLayout3 == null) {
            vKTabLayout3 = null;
        }
        Integer num = this.d;
        if (num != null) {
            vKTabLayout3.setCustomTabView(num.intValue());
        } else {
            vKTabLayout3.setCustomTabView(R.layout.default_tab_view);
        }
        VKTabLayout vKTabLayout4 = this.g;
        if (vKTabLayout4 == null) {
            vKTabLayout4 = null;
        }
        usn0.a(vKTabLayout4);
        VKTabLayout vKTabLayout5 = this.g;
        if (vKTabLayout5 == null) {
            vKTabLayout5 = null;
        }
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        if (disableableViewPager2 == null) {
            disableableViewPager2 = null;
        }
        vKTabLayout5.setupWithViewPager(disableableViewPager2);
        DisableableViewPager disableableViewPager3 = viewPagerVh.o;
        if (disableableViewPager3 == null) {
            disableableViewPager3 = null;
        }
        disableableViewPager3.addOnAdapterChangeListener(this.k);
        DisableableViewPager disableableViewPager4 = viewPagerVh.o;
        if (disableableViewPager4 == null) {
            disableableViewPager4 = null;
        }
        disableableViewPager4.addOnPageChangeListener(new b());
        VKTabLayout vKTabLayout6 = this.g;
        if (vKTabLayout6 == null) {
            vKTabLayout6 = null;
        }
        f4m.j(vKTabLayout6);
        VKTabLayout vKTabLayout7 = this.g;
        this.h = vKTabLayout7 == null ? null : vKTabLayout7;
        if (vKTabLayout7 == null) {
            return null;
        }
        return vKTabLayout7;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void m7() {
        ArrayList<UIBlock> arrayList;
        UIBlockCatalog uIBlockCatalog = this.n;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null) {
            return;
        }
        j9x it = e43.g(arrayList).iterator();
        while (it.d) {
            it.nextInt();
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        fij0 fij0Var = this.m;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
    }

    public final void onPause() {
        this.o = true;
        fij0 fij0Var = this.m;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        this.b.onPause();
    }

    public final void onResume() {
        this.o = false;
        a();
        this.b.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final int rc() {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        return disableableViewPager.getCurrentItem();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void s8(ViewPager.j jVar) {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnPageChangeListener(jVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void setEnabled(boolean z) {
        VKTabLayout vKTabLayout = this.g;
        if (vKTabLayout == null) {
            vKTabLayout = null;
        }
        View childAt = vKTabLayout.getChildAt(0);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setEnabled(z);
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt2 = viewGroup.getChildAt(i);
            if (childAt2 == null) {
                throw new IndexOutOfBoundsException();
            }
            childAt2.setClickable(z);
            i = i2;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        VKTabLayout vKTabLayout = this.h;
        if (vKTabLayout != null) {
            vKTabLayout.setVisibility(0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    /* compiled from: TabLayoutVh.kt */
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                VKTabLayout vKTabLayout = TabLayoutVh.this.g;
                if (vKTabLayout == null) {
                    vKTabLayout = null;
                }
                vKTabLayout.b(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            TabLayoutVh.this.K5(new xsn0(false));
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
