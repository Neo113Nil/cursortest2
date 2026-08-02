package com.vk.catalog2.common.ui.mvp.holder.container;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenInfoPopup;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenQoeSurvey;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.VKTabLayout;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.hints.Hint;
import com.vk.movika.sdk.base.ui.g0;
import com.vk.movika.sdk.base.ui.o0;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.tab.presentation.TabView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.a7a;
import xsna.abg0;
import xsna.b0u0;
import xsna.b4r;
import xsna.b7a;
import xsna.bpn0;
import xsna.bvt0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cx;
import xsna.d4c;
import xsna.dhr0;
import xsna.dmr;
import xsna.dwt0;
import xsna.e43;
import xsna.ecm;
import xsna.f4m;
import xsna.f9h;
import xsna.fij0;
import xsna.g380;
import xsna.g9x;
import xsna.h4x;
import xsna.h7v;
import xsna.hha;
import xsna.i0q0;
import xsna.iah0;
import xsna.ijt0;
import xsna.iut0;
import xsna.iwj0;
import xsna.iy2;
import xsna.izs;
import xsna.j5g;
import xsna.j9x;
import xsna.jjt0;
import xsna.k6k;
import xsna.l9h;
import xsna.msy;
import xsna.n1d;
import xsna.nnb0;
import xsna.pg50;
import xsna.plr;
import xsna.plr.a;
import xsna.pv7;
import xsna.qj80;
import xsna.rgp;
import xsna.rl3;
import xsna.s3q0;
import xsna.slr;
import xsna.swe0;
import xsna.tlr;
import xsna.u080;
import xsna.utk0;
import xsna.vtk0;
import xsna.wlr;
import xsna.wx0;
import xsna.wzs;
import xsna.x8c;
import xsna.xlr;
import xsna.ylr;

/* compiled from: FirstPinnedTabLayoutVh.kt */
/* loaded from: classes16.dex */
public class FirstPinnedTabLayoutVh implements TabLayoutViewHolder, g380, hha {
    public static final SchemeStat$EventItem F = new SchemeStat$EventItem(SchemeStat$EventItem.Type.ONBOARDING, null, null, null, null, null, 62, null);
    public static final CommonOnboardingStat$TypeOnboardingEvent.OnboardingType G = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.TOOLTIP;
    public final bpn0 A;
    public final utk0 B;
    public final Object C;
    public boolean D;
    public tlr E;
    public final ViewPagerVh b;
    public final int c;
    public final Integer d;
    public final b7a e;
    public final jjt0 f;
    public final Integer g;
    public final Integer h;
    public final boolean i;
    public final h7v j;
    public final nnb0 k;
    public final x8c l;
    public final wzs<Integer, String, s3q0> m;
    public final Object n;
    public final Object o;
    public FirstPinnedTabLayout p;
    public Integer q;
    public FirstPinnedTabLayout r;
    public final pg50<izs<Boolean, s3q0>> s;
    public h4x t;
    public final ylr u;
    public PagerAdapter v;
    public final wlr w;
    public final ArrayList x;
    public fij0 y;
    public UIBlockCatalog z;

    /* compiled from: FirstPinnedTabLayoutVh.kt */
    public interface a {

        /* compiled from: FirstPinnedTabLayoutVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh$a$a, reason: collision with other inner class name */
        public static final class C0499a implements a {
            public static final C0499a a = new C0499a();
        }

        /* compiled from: FirstPinnedTabLayoutVh.kt */
        public static final class b implements a {
            public final CatalogHintType a;

            public b(CatalogHintType catalogHintType) {
                this.a = catalogHintType;
            }
        }

        /* compiled from: FirstPinnedTabLayoutVh.kt */
        public static final class c implements a {
            public final iwj0 a;

            public c(iwj0 iwj0Var) {
                this.a = iwj0Var;
            }
        }
    }

    /* compiled from: FirstPinnedTabLayoutVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogHintType.values().length];
            try {
                iArr[CatalogHintType.HIGHLIGHT_TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogHintType.HIGHLIGHT_KIDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FirstPinnedTabLayoutVh.kt */
    public static final class c extends rgp {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            ArrayList<UIBlock> arrayList;
            UIBlock uIBlock;
            UIBlockHint uIBlockHint;
            String str;
            Hint p;
            TextView textView;
            FirstPinnedTabLayout firstPinnedTabLayout;
            int i = gVar.e;
            FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = FirstPinnedTabLayoutVh.this;
            ?? r2 = firstPinnedTabLayoutVh.C;
            SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
            if (i == firstPinnedTabLayoutVh.c() && ((Boolean) firstPinnedTabLayoutVh.n.getValue()).booleanValue()) {
                int i2 = gVar.e;
                h7v h7vVar = firstPinnedTabLayoutVh.j;
                utk0 utk0Var = firstPinnedTabLayoutVh.B;
                FirstPinnedTabLayout firstPinnedTabLayout2 = firstPinnedTabLayoutVh.r;
                VkOnboardingHighlighter vkOnboardingHighlighter = firstPinnedTabLayout2 != null ? (VkOnboardingHighlighter) firstPinnedTabLayout2.findViewById(R.id.highlighter) : null;
                if (((Boolean) utk0Var.getValue()).booleanValue() && (firstPinnedTabLayout = firstPinnedTabLayoutVh.r) != null) {
                    qj80.a(firstPinnedTabLayout, new xlr(firstPinnedTabLayout, vkOnboardingHighlighter, firstPinnedTabLayoutVh, i2));
                }
                utk0Var.i(null, Boolean.FALSE);
                FirstPinnedTabLayout firstPinnedTabLayout3 = firstPinnedTabLayoutVh.r;
                if (firstPinnedTabLayout3 != null && (textView = (TextView) firstPinnedTabLayout3.findViewById(R.id.tab_title)) != null) {
                    FirstPinnedTabLayoutVh.g(textView, true, false);
                }
                UIBlockCatalog uIBlockCatalog = firstPinnedTabLayoutVh.z;
                if (uIBlockCatalog != null && (arrayList = uIBlockCatalog.A) != null && (uIBlock = arrayList.get(firstPinnedTabLayoutVh.c())) != null && (uIBlockHint = uIBlock.j) != null && (str = uIBlockHint.y) != null) {
                    Set<String> stringSet = ((SharedPreferences) r2.getValue()).getStringSet("highlighted_tabs_clicked", EmptySet.b);
                    Set<String> R0 = stringSet != null ? j5g.R0(stringSet) : new LinkedHashSet<>();
                    R0.add(str);
                    SharedPreferences.Editor edit = ((SharedPreferences) r2.getValue()).edit();
                    edit.putStringSet("highlighted_tabs_clicked", R0);
                    edit.apply();
                    if (h7vVar != null && (p = h7vVar.p(str)) != null) {
                        h7vVar.s(p);
                    }
                }
            }
            a(gVar, true);
        }

        public final void a(TabLayout.g gVar, boolean z) {
            View view = gVar.f;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                tabView.setTabSelected(z);
            }
            izs<Boolean, s3q0> b = FirstPinnedTabLayoutVh.this.s.b(gVar.e);
            if (b != null) {
                b.invoke(Boolean.valueOf(z));
            }
        }

        @Override // xsna.rgp, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
            FirstPinnedTabLayoutVh.this.b.s();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.rgp, com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
            FirstPinnedTabLayout firstPinnedTabLayout;
            TextView textView;
            int i = gVar.e;
            SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
            FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = FirstPinnedTabLayoutVh.this;
            if (i == firstPinnedTabLayoutVh.c() && ((Boolean) firstPinnedTabLayoutVh.n.getValue()).booleanValue() && (firstPinnedTabLayout = firstPinnedTabLayoutVh.r) != null && (textView = (TextView) firstPinnedTabLayout.findViewById(R.id.tab_title)) != null) {
                FirstPinnedTabLayoutVh.g(textView, false, false);
            }
            a(gVar, false);
        }
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [xsna.wlr] */
    public FirstPinnedTabLayoutVh(ViewPagerVh viewPagerVh, b7a b7aVar, jjt0 jjt0Var, Integer num, boolean z, h7v h7vVar, nnb0 nnb0Var, x8c x8cVar, pv7 pv7Var, int i) {
        Integer valueOf = Integer.valueOf(R.layout.catalog_tab_with_indicator);
        h7vVar = (i & 512) != 0 ? null : h7vVar;
        nnb0Var = (i & 1024) != 0 ? null : nnb0Var;
        x8cVar = (i & 2048) != 0 ? null : x8cVar;
        pv7Var = (i & 4096) != 0 ? null : pv7Var;
        this.b = viewPagerVh;
        this.c = R.layout.catalog_first_pinned_tab_layout;
        this.d = valueOf;
        this.e = b7aVar;
        this.f = jjt0Var;
        this.g = num;
        this.h = 21;
        this.i = z;
        this.j = h7vVar;
        this.k = nnb0Var;
        this.l = x8cVar;
        this.m = pv7Var;
        g0 g0Var = new g0(21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.n = msy.a(lazyThreadSafetyMode, g0Var);
        this.o = msy.a(lazyThreadSafetyMode, new iy2(20));
        this.s = g9x.a();
        this.t = h4x.c(0, 0, 0, 0);
        this.u = new ylr(this);
        this.w = new ViewPager.i() { // from class: xsna.wlr
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            @Override // androidx.viewpager.widget.ViewPager.i
            public final void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
                jjt0 jjt0Var2;
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = FirstPinnedTabLayoutVh.this;
                bpn0 bpn0Var = firstPinnedTabLayoutVh.A;
                plr plrVar = (plr) bpn0Var.getValue();
                ylr ylrVar = firstPinnedTabLayoutVh.u;
                FirstPinnedTabLayout firstPinnedTabLayout = plrVar.a;
                if (plrVar.i) {
                    PagerAdapter pagerAdapter3 = plrVar.e;
                    if (pagerAdapter3 != null) {
                        pagerAdapter3.unregisterDataSetObserver(plrVar.l);
                        plrVar.l = null;
                    }
                    plr.c cVar = plrVar.k;
                    if (cVar == null) {
                        firstPinnedTabLayout.getClass();
                    } else {
                        firstPinnedTabLayout.e.remove(cVar);
                    }
                    firstPinnedTabLayout.setSelectTabInterceptor(null);
                    plr.b bVar = plrVar.j;
                    if (bVar != null) {
                        plrVar.b.removeOnPageChangeListener(bVar);
                    }
                    plrVar.k = null;
                    plrVar.j = null;
                    plrVar.e = null;
                    plrVar.i = false;
                }
                if (pagerAdapter != null) {
                    pagerAdapter.unregisterDataSetObserver(ylrVar);
                }
                if (pagerAdapter2 != null) {
                    pagerAdapter2.registerDataSetObserver(ylrVar);
                }
                firstPinnedTabLayoutVh.v = pagerAdapter2;
                plr plrVar2 = (plr) bpn0Var.getValue();
                ViewPager viewPager2 = plrVar2.b;
                FirstPinnedTabLayout firstPinnedTabLayout2 = plrVar2.a;
                if (plrVar2.i) {
                    throw new IllegalStateException("VkTabLayoutMediator is already attached");
                }
                PagerAdapter adapter = viewPager2.getAdapter();
                plrVar2.e = adapter;
                if (adapter == null) {
                    throw new IllegalStateException("VkTabLayoutMediator attached before ViewPager has an adapter");
                }
                plrVar2.i = true;
                plr.b bVar2 = new plr.b(firstPinnedTabLayout2);
                plrVar2.j = bVar2;
                viewPager2.addOnPageChangeListener(bVar2);
                plr.c cVar2 = new plr.c(viewPager2, firstPinnedTabLayout2);
                plrVar2.k = cVar2;
                firstPinnedTabLayout2.g(cVar2);
                plr.a aVar = plrVar2.new a();
                plrVar2.l = aVar;
                PagerAdapter pagerAdapter4 = plrVar2.e;
                if (pagerAdapter4 == null) {
                    throw new IllegalStateException("Adapter is null");
                }
                pagerAdapter4.registerDataSetObserver(aVar);
                Object obj = plrVar2.e;
                uoa0 uoa0Var = obj instanceof uoa0 ? (uoa0) obj : null;
                firstPinnedTabLayout2.setPinnedTabsCount(uoa0Var != null ? uoa0Var.a() : 0);
                plrVar2.a(plrVar2.c);
                if (!plrVar2.f.isEmpty() || plrVar2.d) {
                    firstPinnedTabLayout2.setSelectTabInterceptor(plrVar2.h);
                }
                firstPinnedTabLayout2.d(viewPager2.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
                UIBlockCatalog uIBlockCatalog = firstPinnedTabLayoutVh.z;
                if (uIBlockCatalog == null || (jjt0Var2 = firstPinnedTabLayoutVh.f) == null) {
                    return;
                }
                FirstPinnedTabLayout firstPinnedTabLayout3 = firstPinnedTabLayoutVh.p;
                jjt0Var2.a(uIBlockCatalog, firstPinnedTabLayout3 != null ? firstPinnedTabLayout3 : null);
            }
        };
        this.x = new ArrayList();
        this.A = new bpn0(new ecm(this, 9));
        this.B = vtk0.a(Boolean.FALSE);
        this.C = msy.a(lazyThreadSafetyMode, new o0(16));
    }

    public static void g(TextView textView, boolean z, boolean z2) {
        textView.setTextColor(dhr0.t.c(z2 ? R.attr.vk_ui_text_contrast : z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_secondary));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.b.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void K5(wzs<? super Integer, ? super TabView, s3q0> wzsVar) {
        FirstPinnedTabLayout firstPinnedTabLayout = this.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        j9x it = swe0.q(0, firstPinnedTabLayout.getTabCount()).iterator();
        while (it.d) {
            int nextInt = it.nextInt();
            FirstPinnedTabLayout firstPinnedTabLayout2 = this.p;
            if (firstPinnedTabLayout2 == null) {
                firstPinnedTabLayout2 = null;
            }
            TabLayout.g b2 = firstPinnedTabLayout2.b(nextInt);
            View view = b2 != null ? b2.f : null;
            TabView tabView = view instanceof TabView ? (TabView) view : null;
            if (tabView != null) {
                wzsVar.invoke(Integer.valueOf(nextInt), tabView);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        fij0 fij0Var = this.y;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        this.x.clear();
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager != null) {
            if (disableableViewPager == null) {
                disableableViewPager = null;
            }
            disableableViewPager.removeOnAdapterChangeListener(this.w);
        }
        PagerAdapter pagerAdapter = this.v;
        ylr ylrVar = this.u;
        if (ylrVar != null && pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(ylrVar);
        }
        jjt0 jjt0Var = this.f;
        if (jjt0Var != null) {
            ValueAnimator valueAnimator = jjt0Var.a;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            jjt0Var.a = null;
        }
        viewPagerVh.L();
        this.s.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        a7a a7aVar;
        UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog == null) {
            return;
        }
        ArrayList<UIBlock> arrayList = uIBlockCatalog.A;
        K5(new d4c(true));
        this.z = uIBlockCatalog;
        List<iwj0> b2 = b(uIBlockCatalog);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (UIBlock uIBlock2 : arrayList) {
            UIBlockHint uIBlockHint = uIBlock2.j;
            CatalogHintType catalogHintType = uIBlockHint != null ? uIBlockHint.B : null;
            int i = catalogHintType == null ? -1 : b.$EnumSwitchMapping$0[catalogHintType.ordinal()];
            Object obj = a.C0499a.a;
            if (i != 1) {
                if (i == 2) {
                    obj = new a.b(catalogHintType);
                }
            } else if (((Boolean) this.n.getValue()).booleanValue()) {
                UIBlockHint uIBlockHint2 = uIBlock2.j;
                String str = uIBlockHint2 != null ? uIBlockHint2.y : null;
                if (str == null) {
                    str = "";
                }
                Set<String> stringSet = ((SharedPreferences) this.C.getValue()).getStringSet("highlighted_tabs_clicked", EmptySet.b);
                if (!(stringSet != null ? j5g.R0(stringSet) : new LinkedHashSet()).contains(str)) {
                    obj = new a.b(catalogHintType);
                }
            }
            arrayList2.add(obj);
        }
        List<iwj0> b3 = b(uIBlockCatalog);
        ArrayList arrayList3 = new ArrayList(c5g.u(b3, 10));
        Iterator<T> it = b3.iterator();
        while (it.hasNext()) {
            arrayList3.add(new a.c((iwj0) it.next()));
        }
        ArrayList u0 = j5g.u0(arrayList3, arrayList2);
        this.s.d();
        FirstPinnedTabLayout firstPinnedTabLayout = this.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        firstPinnedTabLayout.setCustomTabView(new cx(7, u0, this));
        plr plrVar = (plr) this.A.getValue();
        FirstPinnedTabLayout firstPinnedTabLayout2 = plrVar.a;
        ArrayList arrayList4 = (ArrayList) b2;
        int i2 = 0;
        plrVar.g = plrVar.f.size() != arrayList4.size();
        plrVar.f = b2;
        if (!arrayList4.isEmpty() || plrVar.d) {
            firstPinnedTabLayout2.setSelectTabInterceptor(plrVar.h);
        } else {
            firstPinnedTabLayout2.setSelectTabInterceptor(null);
        }
        if (plrVar.i) {
            plrVar.a(plrVar.b.getCurrentItem());
        }
        tlr tlrVar = this.E;
        if (tlrVar != null) {
            tlrVar.d.clear();
            tlrVar.e = arrayList;
            tlrVar.a.addOnLayoutChangeListener(new slr(tlrVar));
        }
        jjt0 jjt0Var = this.f;
        if (jjt0Var != null) {
            FirstPinnedTabLayout firstPinnedTabLayout3 = this.p;
            if (firstPinnedTabLayout3 == null) {
                firstPinnedTabLayout3 = null;
            }
            jjt0Var.a(uIBlockCatalog, firstPinnedTabLayout3);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator<T> it2 = arrayList.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            ArrayList arrayList6 = this.x;
            if (!hasNext) {
                arrayList6.addAll(arrayList5);
                e();
                FirstPinnedTabLayout firstPinnedTabLayout4 = this.p;
                FirstPinnedTabLayout firstPinnedTabLayout5 = firstPinnedTabLayout4 != null ? firstPinnedTabLayout4 : null;
                firstPinnedTabLayout5.addOnLayoutChangeListener(new dwt0(firstPinnedTabLayout5, new wx0(26, new f9h(this, 6), firstPinnedTabLayout5)));
                return;
            }
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            UIBlockHint uIBlockHint3 = ((UIBlock) next).j;
            if (uIBlockHint3 != null) {
                String str2 = uIBlockHint3.y;
                if (this.e.a(str2)) {
                    if (arrayList6 == null || !arrayList6.isEmpty()) {
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            if (str2.equals(((a7a) it3.next()).a.y)) {
                            }
                        }
                    }
                    a7aVar = new a7a(uIBlockHint3, i2);
                    if (a7aVar == null) {
                        arrayList5.add(a7aVar);
                    }
                    i2 = i3;
                }
            }
            a7aVar = null;
            if (a7aVar == null) {
            }
            i2 = i3;
        }
    }

    public final View a(int i, ViewGroup viewGroup) {
        FirstPinnedTabLayout firstPinnedTabLayout = this.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        LayoutInflater from = LayoutInflater.from(firstPinnedTabLayout.getContext());
        Integer num = this.d;
        int intValue = num != null ? num.intValue() : R.layout.default_tab_view;
        DisableableViewPager disableableViewPager = this.b.o;
        PagerAdapter adapter = (disableableViewPager != null ? disableableViewPager : null).getAdapter();
        if (adapter != null) {
            adapter.getCount();
        }
        return from.inflate(intValue, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<iwj0> b(UIBlockCatalog uIBlockCatalog) {
        iwj0 iwj0Var;
        ArrayList<UIBlockAction> arrayList = uIBlockCatalog.F;
        iwj0 iwj0Var2 = null;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof UIBlockActionOpenQoeSurvey) {
                    arrayList2.add(obj);
                }
            }
            UIBlockActionOpenQoeSurvey uIBlockActionOpenQoeSurvey = (UIBlockActionOpenQoeSurvey) j5g.a0(arrayList2);
            if (uIBlockActionOpenQoeSurvey != null) {
                abg0 abg0Var = dhr0.t;
                iwj0Var = new iwj0(new iwj0.b(abg0Var.c(R.attr.vk_ui_text_accent)), new iwj0.a(R.drawable.vk_icon_rate_outline_28, abg0Var.c(R.attr.vk_ui_icon_accent)), null, new b4r(this, uIBlockActionOpenQoeSurvey), 4);
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (obj2 instanceof UIBlockActionOpenInfoPopup) {
                            arrayList3.add(obj2);
                        }
                    }
                    UIBlockActionOpenInfoPopup uIBlockActionOpenInfoPopup = (UIBlockActionOpenInfoPopup) j5g.a0(arrayList3);
                    if (uIBlockActionOpenInfoPopup != null) {
                        iwj0Var2 = new iwj0(null, new iwj0.a(R.drawable.vk_icon_info_circle_outline_24, dhr0.t.c(R.attr.vk_ui_icon_medium)), uIBlockActionOpenInfoPopup.z, new n1d(this, uIBlockActionOpenInfoPopup), 1);
                    }
                }
                return rl3.I(new iwj0[]{iwj0Var, iwj0Var2});
            }
        }
        iwj0Var = null;
        if (arrayList != null) {
        }
        return rl3.I(new iwj0[]{iwj0Var, iwj0Var2});
    }

    public final int c() {
        UIBlockCatalog uIBlockCatalog = this.z;
        List list = uIBlockCatalog != null ? uIBlockCatalog.A : null;
        if (list == null) {
            list = EmptyList.b;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            UIBlockHint uIBlockHint = ((UIBlock) it.next()).j;
            if ((uIBlockHint != null ? uIBlockHint.B : null) == CatalogHintType.HIGHLIGHT_TABS) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.TabLayoutViewHolder
    public final void cc(ViewPager.j jVar) {
        DisableableViewPager disableableViewPager = this.b.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.addOnPageChangeListener(jVar);
    }

    public final void d(VkOnboardingHighlighter vkOnboardingHighlighter, int i) {
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock;
        UIBlockHint uIBlockHint;
        VkOnboardingHighlighter.e(vkOnboardingHighlighter, false, null, false, null, 12);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW;
        UIBlockCatalog uIBlockCatalog = this.z;
        String str = (uIBlockCatalog == null || (arrayList = uIBlockCatalog.A) == null || (uIBlock = arrayList.get(i)) == null || (uIBlockHint = uIBlock.j) == null) ? null : uIBlockHint.q;
        if (str == null) {
            str = "";
        }
        new bvt0(c2, SchemeStat$TypeView.a.b(F, "", "", null, new CommonOnboardingStat$TypeOnboardingEvent(G, eventType, str, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 8)).q();
    }

    public final void e() {
        if (this.D || this.y != null) {
            return;
        }
        ArrayList arrayList = this.x;
        if (arrayList.isEmpty()) {
            return;
        }
        a7a a7aVar = (a7a) arrayList.remove(0);
        FirstPinnedTabLayout firstPinnedTabLayout = this.p;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        fij0 fij0Var = new fij0(firstPinnedTabLayout.b(a7aVar.b), this.e, a7aVar.a, new l9h(this, 16));
        this.y = fij0Var;
        FirstPinnedTabLayout firstPinnedTabLayout2 = this.p;
        if (firstPinnedTabLayout2 == null) {
            firstPinnedTabLayout2 = null;
        }
        firstPinnedTabLayout2.postDelayed(fij0Var, 300L);
        FirstPinnedTabLayout firstPinnedTabLayout3 = this.p;
        (firstPinnedTabLayout3 != null ? firstPinnedTabLayout3 : null).postDelayed(new dmr(this), 300L);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void hide() {
        FirstPinnedTabLayout firstPinnedTabLayout = this.r;
        if (firstPinnedTabLayout != null) {
            f4m.j(firstPinnedTabLayout);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        FirstPinnedTabLayout firstPinnedTabLayout = (FirstPinnedTabLayout) layoutInflater.inflate(this.c, viewGroup, false);
        this.p = firstPinnedTabLayout;
        if (firstPinnedTabLayout == null) {
            firstPinnedTabLayout = null;
        }
        firstPinnedTabLayout.setSpreadTabsEvenly(false);
        if (this.i) {
            FirstPinnedTabLayout firstPinnedTabLayout2 = this.p;
            if (firstPinnedTabLayout2 == null) {
                firstPinnedTabLayout2 = null;
            }
            VKTabLayout vKTabLayout = firstPinnedTabLayout2.c;
            if (vKTabLayout != null) {
                f4m.l(vKTabLayout.getTabCount() > 0 ? iah0.a(32) : 0, 0, vKTabLayout);
            }
            VKTabLayout vKTabLayout2 = firstPinnedTabLayout2.b;
            if (vKTabLayout2 != null) {
                VKTabLayout vKTabLayout3 = firstPinnedTabLayout2.c;
                if (vKTabLayout3 != null && vKTabLayout3.getTabCount() == 0) {
                    i = iah0.a(32);
                }
                f4m.l(i, iah0.a(32), vKTabLayout2);
            }
        }
        FirstPinnedTabLayout firstPinnedTabLayout3 = this.p;
        if (firstPinnedTabLayout3 == null) {
            firstPinnedTabLayout3 = null;
        }
        firstPinnedTabLayout3.g(new c());
        FirstPinnedTabLayout firstPinnedTabLayout4 = this.p;
        if (firstPinnedTabLayout4 == null) {
            firstPinnedTabLayout4 = null;
        }
        Integer num = this.d;
        if (num != null) {
            firstPinnedTabLayout4.setCustomTabView(num.intValue());
        } else {
            firstPinnedTabLayout4.setCustomTabView(R.layout.default_tab_view);
        }
        Integer num2 = this.g;
        if (num2 != null) {
            FirstPinnedTabLayout firstPinnedTabLayout5 = this.p;
            if (firstPinnedTabLayout5 == null) {
                firstPinnedTabLayout5 = null;
            }
            firstPinnedTabLayout5.setTabIndicator(num2.intValue());
        }
        Integer num3 = this.h;
        if (num3 != null) {
            FirstPinnedTabLayout firstPinnedTabLayout6 = this.p;
            if (firstPinnedTabLayout6 == null) {
                firstPinnedTabLayout6 = null;
            }
            ViewGroup.LayoutParams layoutParams = firstPinnedTabLayout6.getLayoutParams();
            AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
            if (dVar != null) {
                dVar.a = num3.intValue();
            }
        }
        ViewPagerVh viewPagerVh = this.b;
        DisableableViewPager disableableViewPager = viewPagerVh.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.addOnAdapterChangeListener(this.w);
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        if (disableableViewPager2 == null) {
            disableableViewPager2 = null;
        }
        disableableViewPager2.addOnPageChangeListener(new d());
        wzs<Integer, String, s3q0> wzsVar = this.m;
        if (wzsVar != null) {
            FirstPinnedTabLayout firstPinnedTabLayout7 = this.p;
            if (firstPinnedTabLayout7 == null) {
                firstPinnedTabLayout7 = null;
            }
            this.E = new tlr(firstPinnedTabLayout7, wzsVar);
        }
        FirstPinnedTabLayout firstPinnedTabLayout8 = this.p;
        if (firstPinnedTabLayout8 == null) {
            firstPinnedTabLayout8 = null;
        }
        f4m.j(firstPinnedTabLayout8);
        FirstPinnedTabLayout firstPinnedTabLayout9 = this.p;
        this.r = firstPinnedTabLayout9 != null ? firstPinnedTabLayout9 : null;
        if (firstPinnedTabLayout9 == null) {
            firstPinnedTabLayout9 = null;
        }
        u080 u080Var = new u080() { // from class: xsna.vlr
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                FirstPinnedTabLayoutVh.this.t = bqx0Var.a.i(129);
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(firstPinnedTabLayout9, u080Var);
        FirstPinnedTabLayout firstPinnedTabLayout10 = this.p;
        if (firstPinnedTabLayout10 != null) {
            return firstPinnedTabLayout10;
        }
        return null;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        fij0 fij0Var = this.y;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
    }

    public final void onPause() {
        this.D = true;
        fij0 fij0Var = this.y;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        this.b.onPause();
        tlr tlrVar = this.E;
        if (tlrVar != null) {
            tlrVar.d.clear();
        }
    }

    public final void onResume() {
        tlr tlrVar;
        if (this.z != null && this.D && (tlrVar = this.E) != null) {
            i0q0.f(new k6k(tlrVar, 12));
        }
        this.D = false;
        e();
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder
    public final void show() {
        FirstPinnedTabLayout firstPinnedTabLayout = this.r;
        if (firstPinnedTabLayout != null) {
            firstPinnedTabLayout.setVisibility(0);
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

    /* compiled from: FirstPinnedTabLayoutVh.kt */
    public static final class d implements ViewPager.j {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
            jjt0 jjt0Var;
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = FirstPinnedTabLayoutVh.this;
                FirstPinnedTabLayout firstPinnedTabLayout = firstPinnedTabLayoutVh.p;
                if (firstPinnedTabLayout == null) {
                    firstPinnedTabLayout = null;
                }
                TabLayout.g b = firstPinnedTabLayout.b(i);
                if (b == null || (jjt0Var = firstPinnedTabLayoutVh.f) == null) {
                    return;
                }
                jjt0Var.getClass();
                final View findViewById = b.h.findViewById(R.id.badge_indicator);
                ValueAnimator valueAnimator = jjt0Var.a;
                if (valueAnimator != null) {
                    valueAnimator.end();
                }
                if (f4m.h(findViewById)) {
                    final int width = findViewById.getWidth();
                    final int N = bwt0.N(findViewById);
                    ValueAnimator ofInt = ValueAnimator.ofInt(width, 0);
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.hjt0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            View view = findViewById;
                            bwt0.r0(intValue, view);
                            f4m.s((int) (N * (intValue / width)), view);
                        }
                    });
                    ofInt.setDuration(100L);
                    ofInt.addListener(new ijt0(findViewById, width, N, jjt0Var));
                    ofInt.start();
                    jjt0Var.a = ofInt;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i) {
            SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
            FirstPinnedTabLayoutVh.this.K5(new d4c(false));
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
