package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabsVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.c;
import com.vk.core.view.components.tabs.d;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import xsna.a7a;
import xsna.arm0;
import xsna.b7a;
import xsna.dcn;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.g380;
import xsna.li0;
import xsna.n250;
import xsna.p4g;
import xsna.rpv0;
import xsna.s3q0;
import xsna.t3v;
import xsna.tpv0;
import xsna.upv0;
import xsna.v16;
import xsna.wzs;
import xsna.xk6;
import xsna.z8x;
import xsna.zzs;

/* compiled from: VkTabsVh.kt */
/* loaded from: classes16.dex */
public final class VkTabsVh implements CounterBadgeTabLayoutViewHolder, g380 {
    public final ViewPagerVh b;
    public final zzs<Integer, Integer, String, Context, d> c;
    public final b7a d;
    public final int e;
    public final Tab$Mode f;
    public final boolean g;
    public final boolean h;
    public final t3v i;
    public VkTabs j;
    public final a k;
    public PagerAdapter l;
    public final c m;
    public final rpv0 n;
    public final upv0 o;
    public final tpv0 p;
    public final ArrayList q;
    public dcn r;
    public UIBlockCatalog s;

    /* compiled from: VkTabsVh.kt */
    public final class a {
        public final HashMap<d, UIBlockList> a = new HashMap<>();

        public a() {
        }

        public final void a(d dVar) {
            UIBlockBadge uIBlockBadge;
            CatalogBadge catalogBadge;
            UIBlockList orDefault = this.a.getOrDefault(dVar, null);
            String str = (orDefault == null || (uIBlockBadge = orDefault.H) == null || (catalogBadge = uIBlockBadge.y) == null) ? null : catalogBadge.b;
            if (str == null) {
                str = "";
            }
            if (str.equals("0")) {
                str = null;
            }
            Integer m = str != null ? arm0.m(10, str) : null;
            if (m != null) {
                dVar.setIndicator(new c.b(m.intValue()));
            } else {
                dVar.setIndicator(c.C0866c.a);
            }
        }

        public final void b(UIBlockCatalog uIBlockCatalog) {
            ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof UIBlockList) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                UIBlockList uIBlockList = (UIBlockList) next;
                d a = VkTabsVh.this.a(i);
                if (a != null) {
                    c(a, uIBlockList);
                }
                i = i2;
            }
        }

        public final void c(d dVar, UIBlockList uIBlockList) {
            CatalogBadge catalogBadge;
            this.a.put(dVar, uIBlockList);
            if (dVar instanceof n250) {
                ((n250) dVar).Z4(false);
            }
            UIBlockBadge uIBlockBadge = uIBlockList.H;
            String str = (uIBlockBadge == null || (catalogBadge = uIBlockBadge.y) == null) ? null : catalogBadge.b;
            if (str == null) {
                str = "";
            }
            if (str.equals("0")) {
                str = null;
            }
            Integer m = str != null ? arm0.m(10, str) : null;
            if (m != null) {
                dVar.setIndicator(new c.b(m.intValue()));
            } else {
                dVar.setIndicator(c.C0866c.a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [xsna.rpv0] */
    public VkTabsVh(ViewPagerVh viewPagerVh, zzs zzsVar, b7a b7aVar, Tab$Mode tab$Mode, int i) {
        tab$Mode = (i & 16) != 0 ? Tab$Mode.Secondary : tab$Mode;
        boolean z = (i & 64) == 0;
        t3v t3vVar = new t3v(26);
        this.b = viewPagerVh;
        this.c = zzsVar;
        this.d = b7aVar;
        this.e = R.layout.catalog_2_vk_tabs_layout;
        this.f = tab$Mode;
        this.g = true;
        this.h = z;
        this.i = t3vVar;
        this.k = new a();
        this.m = new c(this);
        this.n = new ViewPager.i() { // from class: xsna.rpv0
            @Override // androidx.viewpager.widget.ViewPager.i
            public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
                VkTabsVh vkTabsVh = VkTabsVh.this;
                if (pagerAdapter != null) {
                    pagerAdapter.unregisterDataSetObserver(vkTabsVh.m);
                }
                if (pagerAdapter2 != null) {
                    pagerAdapter2.registerDataSetObserver(vkTabsVh.m);
                }
                vkTabsVh.l = pagerAdapter2;
                UIBlockCatalog uIBlockCatalog = vkTabsVh.s;
                if (uIBlockCatalog != null) {
                    vkTabsVh.k.b(uIBlockCatalog);
                }
            }
        };
        this.o = new upv0(this);
        this.p = new tpv0(this);
        this.q = new ArrayList();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void C6() {
        d a2 = a(1);
        if (a2 != null) {
            this.k.getClass();
            a2.setIndicator(c.C0866c.a);
            if (a2 instanceof n250) {
                ((n250) a2).Z4(true);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void D5(UIBlockList uIBlockList) {
        ArrayList<UIBlock> arrayList;
        Pair i;
        d a2;
        UIBlockCatalog uIBlockCatalog = this.s;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null || (i = p4g.i(arrayList, new xk6(uIBlockList, 15))) == null || (a2 = a(((Number) i.d()).intValue())) == null) {
            return;
        }
        this.k.c(a2, uIBlockList);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        dcn dcnVar = this.r;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        this.q.clear();
        VkTabs vkTabs = this.j;
        if (vkTabs == null) {
            vkTabs = null;
        }
        vkTabs.e.remove(this.p);
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnAdapterChangeListener(this.n);
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        (disableableViewPager2 != null ? disableableViewPager2 : null).removeOnPageChangeListener(this.o);
        PagerAdapter pagerAdapter = this.l;
        c cVar = this.m;
        if (cVar != null && pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(cVar);
        }
        viewPagerVh.L();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120 A[SYNTHETIC] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        a7a a7aVar;
        String str;
        if (!(uIBlock instanceof UIBlockCatalog)) {
            return;
        }
        UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        if (arrayList.isEmpty()) {
            return;
        }
        VkTabs vkTabs = this.j;
        if (vkTabs == null) {
            vkTabs = null;
        }
        int i = 0;
        vkTabs.h(false);
        VkTabs vkTabs2 = this.j;
        if (vkTabs2 == null) {
            vkTabs2 = null;
        }
        vkTabs2.setFixedTab(null);
        VkTabs vkTabs3 = this.j;
        if (vkTabs3 == null) {
            vkTabs3 = null;
        }
        vkTabs3.setTabLayoutMode(arrayList.size() > 2 ? VkTabs.TabLayoutMode.SCROLLABLE : this.g ? VkTabs.TabLayoutMode.FILL_WIDTH : VkTabs.TabLayoutMode.FIXED);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            UIBlock uIBlock2 = arrayList.get(i2);
            UIBlockList uIBlockList = uIBlock2 instanceof UIBlockList ? (UIBlockList) uIBlock2 : null;
            if (uIBlockList != null && (str = uIBlockList.z) != null) {
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(arrayList.size());
                VkTabs vkTabs4 = this.j;
                if (vkTabs4 == null) {
                    vkTabs4 = null;
                }
                d invoke = this.c.invoke(valueOf, valueOf2, str, vkTabs4.getContext());
                VkTabs.c cVar = new VkTabs.c(invoke);
                if (this.h && i2 == 0) {
                    invoke.setOnClickListener(new v16(this, 12));
                    VkTabs vkTabs5 = this.j;
                    if (vkTabs5 == null) {
                        vkTabs5 = null;
                    }
                    vkTabs5.setFixedTab(cVar);
                } else {
                    VkTabs vkTabs6 = this.j;
                    if (vkTabs6 == null) {
                        vkTabs6 = null;
                    }
                    vkTabs6.b(cVar, false);
                }
            }
        }
        VkTabs vkTabs7 = this.j;
        if (vkTabs7 == null) {
            vkTabs7 = null;
        }
        if (vkTabs7.getFixedTab() != null) {
            VkTabs vkTabs8 = this.j;
            if (vkTabs8 == null) {
                vkTabs8 = null;
            }
            vkTabs8.j();
        } else if (!arrayList.isEmpty()) {
            VkTabs vkTabs9 = this.j;
            if (vkTabs9 == null) {
                vkTabs9 = null;
            }
            vkTabs9.l(0, false);
        }
        this.s = uIBlockCatalog;
        this.k.b(uIBlockCatalog);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList3 = this.q;
            if (!hasNext) {
                arrayList3.addAll(arrayList2);
                if (this.r == null) {
                    ArrayList arrayList4 = this.q;
                    if (arrayList4.isEmpty()) {
                        return;
                    }
                    a7a a7aVar2 = (a7a) arrayList4.remove(0);
                    VkTabs vkTabs10 = this.j;
                    if (vkTabs10 == null) {
                        vkTabs10 = null;
                    }
                    vkTabs10.postDelayed(new li0(6, this, a7aVar2), 300L);
                    return;
                }
                return;
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlockHint uIBlockHint = ((UIBlock) next).j;
            if (uIBlockHint != null) {
                String str2 = uIBlockHint.y;
                if (this.d.a(str2)) {
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (str2.equals(((a7a) it2.next()).a.y)) {
                            }
                        }
                    }
                    a7aVar = new a7a(uIBlockHint, i);
                    if (a7aVar == null) {
                        arrayList2.add(a7aVar);
                    }
                    i = i3;
                }
            }
            a7aVar = null;
            if (a7aVar == null) {
            }
            i = i3;
        }
    }

    public final d a(int i) {
        boolean z = this.h;
        if (!z || i != 0) {
            if (!z || i <= 0) {
                VkTabs vkTabs = this.j;
                return (vkTabs != null ? vkTabs : null).f(i).a;
            }
            VkTabs vkTabs2 = this.j;
            return (vkTabs2 != null ? vkTabs2 : null).f(i - 1).a;
        }
        VkTabs vkTabs3 = this.j;
        if (vkTabs3 == null) {
            vkTabs3 = null;
        }
        VkTabs.c fixedTab = vkTabs3.getFixedTab();
        if (fixedTab != null) {
            return fixedTab.a;
        }
        return null;
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
        UIBlockCatalog uIBlockCatalog = this.s;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null) {
            return;
        }
        Iterator<Integer> it = e43.g(arrayList).iterator();
        while (it.hasNext()) {
            d a2 = a(((z8x) it).nextInt());
            if (a2 != null) {
                this.k.getClass();
                a2.setIndicator(c.C0866c.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r6 = a(((java.lang.Number) r3.d()).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r6 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        r5.k.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gc(String str) {
        ArrayList<UIBlock> arrayList;
        UIBlockCatalog uIBlockCatalog = this.s;
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
        VkTabs vkTabs = this.j;
        if (vkTabs == null) {
            vkTabs = null;
        }
        f4m.j(vkTabs);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTabs vkTabs = (VkTabs) layoutInflater.inflate(this.e, viewGroup, false);
        this.j = vkTabs;
        vkTabs.setMode(this.f);
        vkTabs.a(this.p);
        f4m.j(vkTabs);
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.addOnAdapterChangeListener(this.n);
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        (disableableViewPager2 != null ? disableableViewPager2 : null).addOnPageChangeListener(this.o);
        return vkTabs;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder
    public final void m7() {
        ArrayList<UIBlock> arrayList;
        UIBlockCatalog uIBlockCatalog = this.s;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null) {
            return;
        }
        Iterator<Integer> it = e43.g(arrayList).iterator();
        while (it.hasNext()) {
            d a2 = a(((z8x) it).nextInt());
            if (a2 != null) {
                this.k.a(a2);
            }
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        dcn dcnVar = this.r;
        if (dcnVar != null) {
            dcnVar.dismiss();
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
        VkTabs vkTabs = this.j;
        if (vkTabs == null) {
            vkTabs = null;
        }
        for (VkTabs.c cVar : vkTabs.getTabs()) {
            cVar.d = z;
            cVar.a.setEnabled(z);
        }
        VkTabs vkTabs2 = this.j;
        VkTabs.c fixedTab = (vkTabs2 != null ? vkTabs2 : null).getFixedTab();
        if (fixedTab != null) {
            fixedTab.d = z;
            fixedTab.a.setEnabled(z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        VkTabs vkTabs = this.j;
        if (vkTabs == null) {
            vkTabs = null;
        }
        vkTabs.setVisibility(0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void K5(wzs<? super Integer, ? super TabView, s3q0> wzsVar) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
