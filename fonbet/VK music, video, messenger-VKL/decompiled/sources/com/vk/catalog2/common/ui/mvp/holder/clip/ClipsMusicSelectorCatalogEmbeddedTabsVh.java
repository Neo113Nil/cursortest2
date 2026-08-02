package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.a;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockEmbeddedTabs;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogFullHeightListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.awt0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.e43;
import xsna.epx;
import xsna.f4m;
import xsna.fpf0;
import xsna.hda;
import xsna.iah0;
import xsna.l50;
import xsna.l7;
import xsna.m50;
import xsna.na;
import xsna.nda;
import xsna.pf1;
import xsna.pgn;
import xsna.qcy;
import xsna.qle;
import xsna.rl3;
import xsna.sa;
import xsna.u4a;
import xsna.usn0;
import xsna.vs;

/* compiled from: ClipsMusicSelectorCatalogEmbeddedTabsVh.kt */
/* loaded from: classes16.dex */
public final class ClipsMusicSelectorCatalogEmbeddedTabsVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] p;
    public final u4a b;
    public LayoutInflater c;
    public TabLayout d;
    public final ViewPagerVh e;
    public boolean g;
    public UIBlockEmbeddedTabs h;
    public int i;
    public Integer j;
    public int k;
    public Map<String, Integer> l;
    public boolean m;
    public final bpn0 f = new bpn0(new na(this, 26));
    public final pgn n = new pgn();
    public final SparseArray<io.reactivex.rxjava3.disposables.c> o = new SparseArray<>();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsMusicSelectorCatalogEmbeddedTabsVh.class, "disposableFavorites", "getDisposableFavorites()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        p = new qcy[]{mutablePropertyReference1Impl};
    }

    public ClipsMusicSelectorCatalogEmbeddedTabsVh(u4a u4aVar) {
        this.b = u4aVar;
        this.e = new ViewPagerVh(u4aVar, false, null, false, null, null, null, null, null, null, 7166);
        new Handler(Looper.getMainLooper());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        qcy<Object> qcyVar = p[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.n.b;
        if (cVar != null) {
            cVar.dispose();
        }
        SparseArray<io.reactivex.rxjava3.disposables.c> sparseArray = this.o;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            sparseArray.valueAt(i).dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockEmbeddedTabs)) {
            return;
        }
        UIBlockEmbeddedTabs uIBlockEmbeddedTabs = (UIBlockEmbeddedTabs) uIBlock;
        UIBlockCatalog uIBlockCatalog = uIBlockEmbeddedTabs.y;
        this.h = uIBlockEmbeddedTabs;
        TabLayout tabLayout = this.d;
        if (tabLayout == null) {
            return;
        }
        boolean z = this.g;
        ViewPagerVh viewPagerVh = this.e;
        if (!z) {
            viewPagerVh.b(uIBlockCatalog, null);
        }
        this.k = uIBlockCatalog.A.size();
        Map<String, Integer> map = this.l;
        if (map != null) {
            map.clear();
        } else {
            map = new HashMap<>();
        }
        this.l = map;
        tabLayout.r();
        Iterator<T> it = uIBlockCatalog.A.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                DisableableViewPager disableableViewPager = viewPagerVh.o;
                (disableableViewPager != null ? disableableViewPager : null).post(new m50(this, 1));
                this.g = true;
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlock uIBlock2 = (UIBlock) next;
            if (uIBlock2 instanceof UIBlockList) {
                Map<String, Integer> map2 = this.l;
                if (map2 != null) {
                    map2.put(uIBlock2.b, Integer.valueOf(i));
                }
                if (uIBlock2.e == CatalogDataType.DATA_TYPE_FAVORITES) {
                    this.j = Integer.valueOf(i);
                }
                TabLayout.g p2 = tabLayout.p();
                LayoutInflater layoutInflater = this.c;
                View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.catalog_minitab_layout_tab, (ViewGroup) p2.h, false) : null;
                if (!(inflate instanceof TextView)) {
                    return;
                }
                ((TextView) inflate).setTextColor(tabLayout.getTabTextColors());
                p2.l(inflate);
                UIBlockList uIBlockList = (UIBlockList) uIBlock2;
                p2.q(uIBlockList.z);
                p2.a = Integer.valueOf(i);
                if (uIBlockList.y.isEmpty()) {
                    a(i);
                }
                tabLayout.i(p2, i == this.i);
            }
            i = i2;
        }
    }

    public final void a(int i) {
        UIBlockEmbeddedTabs uIBlockEmbeddedTabs = this.h;
        if (uIBlockEmbeddedTabs == null) {
            return;
        }
        Integer num = this.j;
        if (num != null && i == num.intValue()) {
            this.m = false;
        }
        SparseArray<io.reactivex.rxjava3.disposables.c> sparseArray = this.o;
        io.reactivex.rxjava3.disposables.c cVar = sparseArray.get(i);
        if (cVar != null) {
            cVar.dispose();
        }
        q<hda> D = this.b.b.s.D(uIBlockEmbeddedTabs.y.A.get(i).b, null, false);
        l7 l7Var = new l7(new sa(this, 29), 10);
        D.getClass();
        sparseArray.put(i, new io.reactivex.rxjava3.internal.jdk8.a(D, l7Var).subscribe(new pf1(new qle(uIBlockEmbeddedTabs, i, this), 10)));
    }

    public final void b() {
        UIBlockEmbeddedTabs uIBlockEmbeddedTabs = this.h;
        if (uIBlockEmbeddedTabs == null) {
            return;
        }
        ViewPagerVh viewPagerVh = this.e;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        for (View view : awt0.d(disableableViewPager)) {
            if (view instanceof ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList) {
                ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList fullHeightList = (ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList) view;
                if (epx.f(fullHeightList.getSectionId(), uIBlockEmbeddedTabs.y.A.get(this.i).b)) {
                    DisableableViewPager disableableViewPager2 = viewPagerVh.o;
                    if (disableableViewPager2 == null) {
                        disableableViewPager2 = null;
                    }
                    bwt0.c0(fullHeightList.getMeasuredHeight(), disableableViewPager2);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = layoutInflater;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_minitab_layout, viewGroup, false);
        ViewPagerVh viewPagerVh = this.e;
        View k5 = viewPagerVh.k5(layoutInflater, viewGroup2, bundle);
        bwt0.c0(viewGroup != null ? viewGroup.getMeasuredHeight() : iah0.a(1000), k5);
        viewGroup2.addView(k5);
        io.reactivex.rxjava3.disposables.c subscribe = this.b.b.e.a().subscribe(new l50(new vs(this, 22), 12));
        qcy<Object> qcyVar = p[0];
        this.n.b(subscribe);
        TabLayout tabLayout = (TabLayout) viewGroup2.findViewById(R.id.tabs);
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(0);
            this.d = tabLayout;
            DisableableViewPager disableableViewPager = viewPagerVh.o;
            if (disableableViewPager == null) {
                disableableViewPager = null;
            }
            tabLayout.g(new a(disableableViewPager));
            DisableableViewPager disableableViewPager2 = viewPagerVh.o;
            if (disableableViewPager2 == null) {
                disableableViewPager2 = null;
            }
            disableableViewPager2.addOnPageChangeListener(new b());
            DisableableViewPager disableableViewPager3 = viewPagerVh.o;
            tabLayout.w(disableableViewPager3 != null ? disableableViewPager3 : null, false, false);
            usn0.a(tabLayout);
        }
        return viewGroup2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    /* compiled from: ClipsMusicSelectorCatalogEmbeddedTabsVh.kt */
    public static final class EndVh implements CatalogViewHolder, View.OnClickListener {
        public final u4a b;
        public View c;
        public View d;
        public UIBlockEmbeddedTabs.End e;

        /* compiled from: ClipsMusicSelectorCatalogEmbeddedTabsVh.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[UIBlockEmbeddedTabs.End.State.values().length];
                try {
                    iArr[UIBlockEmbeddedTabs.End.State.HIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[UIBlockEmbeddedTabs.End.State.SHOW_MORE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[UIBlockEmbeddedTabs.End.State.EMPTY_BANNER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public EndVh(u4a u4aVar) {
            this.b = u4aVar;
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final void N6(UIBlock uIBlock) {
            if (uIBlock instanceof UIBlockEmbeddedTabs.End) {
                UIBlockEmbeddedTabs.End end = (UIBlockEmbeddedTabs.End) uIBlock;
                this.e = end;
                int i = a.$EnumSwitchMapping$0[end.y.ordinal()];
                if (i == 1) {
                    View view = this.c;
                    if (view != null) {
                        f4m.j(view);
                    }
                    View view2 = this.d;
                    if (view2 != null) {
                        f4m.j(view2);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    View view3 = this.c;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    View view4 = this.d;
                    if (view4 != null) {
                        f4m.j(view4);
                        return;
                    }
                    return;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                View view5 = this.c;
                if (view5 != null) {
                    f4m.j(view5);
                }
                View view6 = this.d;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
            }
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View inflate = layoutInflater.inflate(R.layout.catalog_minitab_layout_info, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.option_empty_banner);
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            TextView textView = (TextView) viewGroup2.findViewById(R.id.catalog_placeholder_view_title);
            textView.setVisibility(0);
            textView.setText(R.string.clips_favorite_placeholder_text);
            ((TextView) viewGroup2.findViewById(R.id.catalog_placeholder_view_description)).setText(R.string.clips_favorite_placeholder_subtext);
            VkImage vkImage = (VkImage) viewGroup2.findViewById(R.id.catalog_placeholder_view_image);
            vkImage.setEmptyImagePlaceholder(R.drawable.vk_icon_bookmark_outline_56);
            bwt0.o0(vkImage, vkImage.getContext().getColor(R.color.vk_gray_500));
            vkImage.W();
            this.d = findViewById;
            View findViewById2 = inflate.findViewById(R.id.option_show_more);
            findViewById2.setOnClickListener(this);
            this.c = findViewById2;
            return inflate;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context;
            UIBlockEmbeddedTabs.End end;
            UIBlockEmbeddedTabs.End.State state;
            if (view == null || (context = view.getContext()) == null || (end = this.e) == null || (state = end.y) != UIBlockEmbeddedTabs.End.State.SHOW_MORE) {
                return;
            }
            u4a u4aVar = this.b;
            u4a.a aVar = u4aVar.b;
            u4a.a aVar2 = u4aVar.b;
            SearchStatsLoggingInfo b = aVar.m.b(SchemeStat$EventItem.Type.CATALOG_ITEM, "", true);
            aVar2.f.a(new cfp0(new UIBlockEmbeddedTabs.End(com.vk.catalog2.common.dto.api.ui.a.a(a.C0482a.a(end), "", null, null, null, null, null, 8190), state, end.z, end.A), null));
            nda.e(aVar2.b, context, aVar2.s, end.z, end.A, null, b, null, PsExtractor.AUDIO_STREAM);
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final void yh(int i, UIBlock uIBlock) {
            N6(uIBlock);
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final boolean ze(Rect rect) {
            return false;
        }

        @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
        public final void L() {
        }

        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
        }
    }

    /* compiled from: ClipsMusicSelectorCatalogEmbeddedTabsVh.kt */
    public static final class a extends TabLayout.j {
        public a(DisableableViewPager disableableViewPager) {
            super(disableableViewPager);
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            Object obj = gVar.a;
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null) {
                int intValue = num.intValue();
                ClipsMusicSelectorCatalogEmbeddedTabsVh clipsMusicSelectorCatalogEmbeddedTabsVh = ClipsMusicSelectorCatalogEmbeddedTabsVh.this;
                clipsMusicSelectorCatalogEmbeddedTabsVh.i = intValue;
                Integer num2 = clipsMusicSelectorCatalogEmbeddedTabsVh.j;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    if (!clipsMusicSelectorCatalogEmbeddedTabsVh.m || intValue2 == clipsMusicSelectorCatalogEmbeddedTabsVh.i) {
                        return;
                    }
                    clipsMusicSelectorCatalogEmbeddedTabsVh.a(intValue2);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }

    /* compiled from: ClipsMusicSelectorCatalogEmbeddedTabsVh.kt */
    public static final class b implements ViewPager.j {
        public View[] b;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            Integer num;
            ClipsMusicSelectorCatalogEmbeddedTabsVh clipsMusicSelectorCatalogEmbeddedTabsVh = ClipsMusicSelectorCatalogEmbeddedTabsVh.this;
            if (i == 0) {
                this.b = null;
                qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogEmbeddedTabsVh.p;
                clipsMusicSelectorCatalogEmbeddedTabsVh.b();
                return;
            }
            int i2 = clipsMusicSelectorCatalogEmbeddedTabsVh.k + 1;
            View[] viewArr = new View[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                viewArr[i3] = null;
            }
            DisableableViewPager disableableViewPager = clipsMusicSelectorCatalogEmbeddedTabsVh.e.o;
            for (View view : awt0.d(disableableViewPager != null ? disableableViewPager : null)) {
                if (view instanceof ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList) {
                    Map<String, Integer> map = clipsMusicSelectorCatalogEmbeddedTabsVh.l;
                    String sectionId = ((ClipsMusicSelectorCatalogFullHeightListVh.FullHeightList) view).getSectionId();
                    if (map != null && sectionId != null && (num = map.get(sectionId)) != null) {
                        viewArr[num.intValue()] = view;
                    }
                }
            }
            this.b = viewArr;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            View[] viewArr = this.b;
            if (viewArr == null) {
                return;
            }
            View view = (View) rl3.S(i, viewArr);
            int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
            float measuredHeight2 = ((((View) rl3.S(i + 1, viewArr)) != null ? r3.getMeasuredHeight() : 0) * f) + ((1.0f - f) * measuredHeight);
            DisableableViewPager disableableViewPager = ClipsMusicSelectorCatalogEmbeddedTabsVh.this.e.o;
            if (disableableViewPager == null) {
                disableableViewPager = null;
            }
            bwt0.c0((int) measuredHeight2, disableableViewPager);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
