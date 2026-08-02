package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabLayoutVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.tab.presentation.TabView;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.a7a;
import xsna.b7a;
import xsna.e43;
import xsna.f4m;
import xsna.fij0;
import xsna.g380;
import xsna.izs;
import xsna.lpv0;
import xsna.mlf0;
import xsna.s3q0;
import xsna.usn0;
import xsna.vsn0;
import xsna.wzs;
import xsna.yzs;
import xsna.zi7;

/* compiled from: VkTabLayoutVh.kt */
/* loaded from: classes16.dex */
public final class VkTabLayoutVh implements CounterBadgeTabLayoutViewHolder, g380 {
    public final ViewPagerVh b;
    public final int c;
    public final yzs<Integer, Integer, TabLayout.g, View> d;
    public final b7a e;
    public final izs<Integer, s3q0> f;
    public final vsn0 g;
    public VkTabLayout h;
    public fij0 k;
    public UIBlockCatalog l;
    public boolean m;
    public final lpv0 i = new ViewPager.i() { // from class: xsna.lpv0
        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            VkTabLayoutVh.this.getClass();
        }
    };
    public final ArrayList j = new ArrayList();
    public final ArrayList n = new ArrayList();

    /* compiled from: VkTabLayoutVh.kt */
    public static final class a extends TabLayout.j {
        public a(DisableableViewPager disableableViewPager) {
            super(disableableViewPager);
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            VkTabLayoutVh.this.f.invoke(Integer.valueOf(gVar.e));
            View view = gVar.f;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                tabView.setTabSelected(true);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
            VkTabLayoutVh.this.b.s();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.lpv0] */
    public VkTabLayoutVh(ViewPagerVh viewPagerVh, int i, yzs<? super Integer, ? super Integer, ? super TabLayout.g, ? extends View> yzsVar, b7a b7aVar, izs<? super Integer, s3q0> izsVar, vsn0 vsn0Var) {
        this.b = viewPagerVh;
        this.c = i;
        this.d = yzsVar;
        this.e = b7aVar;
        this.f = izsVar;
        this.g = vsn0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void K5(wzs<? super Integer, ? super TabView, s3q0> wzsVar) {
        VkTabLayout vkTabLayout = this.h;
        if (vkTabLayout == null) {
            vkTabLayout = null;
        }
        int tabCount = vkTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            VkTabLayout vkTabLayout2 = this.h;
            if (vkTabLayout2 == null) {
                vkTabLayout2 = null;
            }
            TabLayout.g b2 = vkTabLayout2.b(i);
            View view = b2 != null ? b2.f : null;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                wzsVar.invoke(Integer.valueOf(i), tabView);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        fij0 fij0Var = this.k;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        this.j.clear();
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnAdapterChangeListener(this.i);
        viewPagerVh.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093 A[SYNTHETIC] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        int tabCount;
        vsn0 vsn0Var;
        a7a a7aVar;
        boolean z = uIBlock instanceof UIBlockCatalog;
        if (z) {
            tabCount = ((UIBlockCatalog) uIBlock).A.size();
        } else {
            VkTabLayout vkTabLayout = this.h;
            if (vkTabLayout == null) {
                vkTabLayout = null;
            }
            tabCount = vkTabLayout.getTabCount();
        }
        VkTabLayout vkTabLayout2 = this.h;
        if (vkTabLayout2 == null) {
            vkTabLayout2 = null;
        }
        int i = 0;
        vkTabLayout2.setTabMode(tabCount > 2 ? 0 : 1);
        UIBlockCatalog uIBlockCatalog = z ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog == null) {
            return;
        }
        a(true);
        this.l = uIBlockCatalog;
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList3 = this.j;
            if (!hasNext) {
                arrayList3.addAll(arrayList2);
                b();
                UIBlockCatalog uIBlockCatalog2 = this.l;
                if (uIBlockCatalog2 == null || (vsn0Var = this.g) == null) {
                    return;
                }
                VkTabLayout vkTabLayout3 = this.h;
                vsn0Var.a(vkTabLayout3 != null ? vkTabLayout3 : null, uIBlockCatalog2);
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
                if (this.e.a(str)) {
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (str.equals(((a7a) it2.next()).a.y)) {
                            }
                        }
                    }
                    a7aVar = new a7a(uIBlockHint, i);
                    if (a7aVar == null) {
                        arrayList2.add(a7aVar);
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

    public final void a(boolean z) {
        VkTabLayout vkTabLayout = this.h;
        if (vkTabLayout == null) {
            vkTabLayout = null;
        }
        int tabCount = vkTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            VkTabLayout vkTabLayout2 = this.h;
            if (vkTabLayout2 == null) {
                vkTabLayout2 = null;
            }
            TabLayout.g b2 = vkTabLayout2.b(i);
            View view = b2 != null ? b2.f : null;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                tabView.setSkipAnimation(z);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final void b() {
        if (this.m || this.k != null) {
            return;
        }
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return;
        }
        a7a a7aVar = (a7a) arrayList.remove(0);
        VkTabLayout vkTabLayout = this.h;
        if (vkTabLayout == null) {
            vkTabLayout = null;
        }
        fij0 fij0Var = new fij0(vkTabLayout.b(a7aVar.b), this.e, a7aVar.a, new mlf0(this, 25));
        this.k = fij0Var;
        VkTabLayout vkTabLayout2 = this.h;
        (vkTabLayout2 != null ? vkTabLayout2 : null).postDelayed(fij0Var, 300L);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void cc(ViewPager.j jVar) {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.addOnPageChangeListener(jVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        VkTabLayout vkTabLayout = this.h;
        if (vkTabLayout == null) {
            vkTabLayout = null;
        }
        f4m.j(vkTabLayout);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTabLayout vkTabLayout = (VkTabLayout) layoutInflater.inflate(this.c, viewGroup, false);
        vkTabLayout.setSpreadTabsEvenly(true);
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        vkTabLayout.f(new a(disableableViewPager));
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        if (disableableViewPager2 == null) {
            disableableViewPager2 = null;
        }
        PagerAdapter adapter = disableableViewPager2.getAdapter();
        vkTabLayout.setCustomTabView(new zi7(this, adapter != null ? adapter.getCount() : 0, 3));
        usn0.a(vkTabLayout);
        DisableableViewPager disableableViewPager3 = viewPagerVh.o;
        if (disableableViewPager3 == null) {
            disableableViewPager3 = null;
        }
        vkTabLayout.setupWithViewPager(disableableViewPager3);
        f4m.j(vkTabLayout);
        this.h = vkTabLayout;
        DisableableViewPager disableableViewPager4 = viewPagerVh.o;
        if (disableableViewPager4 == null) {
            disableableViewPager4 = null;
        }
        disableableViewPager4.addOnAdapterChangeListener(this.i);
        DisableableViewPager disableableViewPager5 = viewPagerVh.o;
        if (disableableViewPager5 == null) {
            disableableViewPager5 = null;
        }
        disableableViewPager5.addOnPageChangeListener(new b());
        VkTabLayout vkTabLayout2 = this.h;
        if (vkTabLayout2 == null) {
            return null;
        }
        return vkTabLayout2;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        fij0 fij0Var = this.k;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = (View) it.next();
            g380 g380Var = callback instanceof g380 ? (g380) callback : null;
            if (g380Var != null) {
                g380Var.onConfigurationChanged(configuration);
            }
        }
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
        VkTabLayout vkTabLayout = this.h;
        if (vkTabLayout == null) {
            vkTabLayout = null;
        }
        View childAt = vkTabLayout.getChildAt(0);
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
        VkTabLayout vkTabLayout = this.h;
        if (vkTabLayout == null) {
            vkTabLayout = null;
        }
        vkTabLayout.setVisibility(0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void C6() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void d5() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void m7() {
    }

    /* compiled from: VkTabLayoutVh.kt */
    public static final class b implements ViewPager.j {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            VkTabLayoutVh.this.a(false);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void D5(UIBlockList uIBlockList) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void gc(String str) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
