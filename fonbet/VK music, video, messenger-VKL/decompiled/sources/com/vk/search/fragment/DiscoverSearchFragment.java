package com.vk.search.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.widget.LifecycleHandler;
import com.vk.log.L;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.search.discover.query.SearchQueryValueHelper;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.search.ui.impl.catalog.GlobalSearchCatalogFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh;
import com.vk.search.ui.impl.widget.FirstFixedTabsLayout;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b00;
import xsna.bih;
import xsna.bo8;
import xsna.bpn0;
import xsna.bw;
import xsna.bxh0;
import xsna.dgm;
import xsna.dn;
import xsna.dw20;
import xsna.ecm;
import xsna.f4m;
import xsna.fcj;
import xsna.fnj;
import xsna.h94;
import xsna.hg1;
import xsna.hvt0;
import xsna.iah0;
import xsna.iy2;
import xsna.iz0;
import xsna.izh0;
import xsna.izs;
import xsna.jrh;
import xsna.jrh0;
import xsna.k1q0;
import xsna.k41;
import xsna.kpv0;
import xsna.krh;
import xsna.ldl;
import xsna.lpj;
import xsna.lr;
import xsna.m1i;
import xsna.mag;
import xsna.mcr;
import xsna.mhy;
import xsna.msy;
import xsna.mtn0;
import xsna.myh;
import xsna.ncr;
import xsna.nt8;
import xsna.o0q0;
import xsna.om1;
import xsna.omo;
import xsna.oz50;
import xsna.pcs;
import xsna.pnh0;
import xsna.qcr;
import xsna.qqe;
import xsna.qwh0;
import xsna.rsr;
import xsna.s3q0;
import xsna.t34;
import xsna.ufk;
import xsna.unh0;
import xsna.uxh0;
import xsna.v1h0;
import xsna.vcr;
import xsna.w2o0;
import xsna.xz70;
import xsna.y760;
import xsna.ysg0;
import xsna.yve;
import xsna.z1h0;
import xsna.zuq;

/* compiled from: DiscoverSearchFragment.kt */
/* loaded from: classes11.dex */
public final class DiscoverSearchFragment extends BaseFragment implements y760, uxh0, o0q0 {
    public static final int s0 = iah0.a(16);
    public final bpn0 S;
    public String U;
    public Integer V;
    public final VkFeedSearchParams Z;
    public final bxh0 a0;
    public final bpn0 b0;
    public final Object c0;
    public mcr<vcr<?>> d0;
    public final b e0;
    public d f0;
    public ViewPager2 g0;
    public FirstFixedTabsLayout h0;
    public AppBarShadowView i0;
    public View j0;
    public VkSearchView k0;
    public Integer l0;
    public final bpn0 m0;
    public final SearchQueryValueHelper n0;
    public final bpn0 o0;
    public final h94 p0;
    public LifecycleHandler q0;
    public izh0 r0;
    public boolean T = true;
    public final VkPeopleSearchParams W = new VkPeopleSearchParams();
    public final VkGroupsSearchParams X = new VkGroupsSearchParams();
    public final VkMarketSearchParams Y = new VkMarketSearchParams();

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends oz50 {
        public a() {
            super(DiscoverSearchFragment.class, null, null);
        }

        public final void A(FragmentWithGlobalSearch$EntryMethod fragmentWithGlobalSearch$EntryMethod) {
            this.j.putInt("entry_method", fragmentWithGlobalSearch$EntryMethod.ordinal());
        }

        public final void B(String str) {
            if (str != null) {
                this.j.putString("query", str);
            }
        }

        public final void C() {
            this.j.putString("tab", DiscoverSearchTabs.SearchTabName.SearchAll.i());
            A(FragmentWithGlobalSearch$EntryMethod.OtherTab);
        }

        public final void D() {
            this.j.putString("tab", DiscoverSearchTabs.SearchTabName.SearchGroups.i());
            A(FragmentWithGlobalSearch$EntryMethod.OtherTab);
        }

        public final void E() {
            this.j.putString("tab", DiscoverSearchTabs.SearchTabName.SearchNews.i());
            A(FragmentWithGlobalSearch$EntryMethod.OtherTab);
        }

        public final void F() {
            this.j.putString("tab", DiscoverSearchTabs.SearchTabName.SearchPeople.i());
            A(FragmentWithGlobalSearch$EntryMethod.OtherTab);
        }

        public final void y() {
            this.j.putBoolean("no_anim", true);
        }

        public final void z(String str) {
            this.j.putString("KEY_AD_CAMPAIGN_SOURCE", str);
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public final class b implements ncr<vcr<?>> {
        public b() {
        }

        @Override // xsna.ncr
        public final dw20 a(vcr vcrVar, final omo omoVar) {
            if (vcrVar.c() != 5) {
                return null;
            }
            int i = DiscoverSearchFragment.s0;
            DiscoverSearchFragment discoverSearchFragment = DiscoverSearchFragment.this;
            dw20.b bVar = ((pnh0) discoverSearchFragment.S.getValue()).c(discoverSearchFragment.kn(), "search_goods_filter_city_param").a;
            bVar.a0(new mag(omoVar, 14));
            bVar.X(new dgm(omoVar, 1));
            bVar.c0(new DialogInterface.OnKeyListener() { // from class: xsna.r6n
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    int i3 = DiscoverSearchFragment.s0;
                    return omo.this.a(i2);
                }
            });
            return bVar.a();
        }

        @Override // xsna.ncr
        public final void b() {
            int i = DiscoverSearchFragment.s0;
            DiscoverSearchFragment.this.io().f();
        }

        @Override // xsna.ncr
        public final void c(vcr vcrVar) {
            int i = DiscoverSearchFragment.s0;
            DiscoverSearchFragment.this.io().a(vcrVar);
        }

        @Override // xsna.ncr
        public final boolean t() {
            int i = DiscoverSearchFragment.s0;
            return DiscoverSearchFragment.this.io().g();
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public final class c {
        public c() {
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public final class d extends k1q0 {

        /* compiled from: DiscoverSearchFragment.kt */
        public static final class a {
            public final /* synthetic */ DiscoverSearchFragment a;
            public final /* synthetic */ int b;

            public a(DiscoverSearchFragment discoverSearchFragment, int i) {
                this.a = discoverSearchFragment;
                this.b = i;
            }

            public final void a(boolean z) {
                AppBarShadowView appBarShadowView;
                DiscoverSearchFragment discoverSearchFragment = this.a;
                izh0 izh0Var = discoverSearchFragment.r0;
                if (izh0Var != null) {
                    if (this.b != izh0Var.d3() || (appBarShadowView = discoverSearchFragment.i0) == null) {
                        return;
                    }
                    appBarShadowView.setSeparatorAllowed(z);
                }
            }
        }

        public d(ViewPager2 viewPager2) {
            super(DiscoverSearchFragment.this, viewPager2, DiscoverSearchFragment.this.D);
        }

        public final Fragment J0(int i) {
            Fragment F0 = F0(i);
            if (F0 == null || F0.isRemoving() || F0.isDetached()) {
                return null;
            }
            return F0;
        }

        public final void K0(Fragment fragment, int i) {
            boolean z = fragment instanceof GlobalSearchCatalogFragment;
            GlobalSearchCatalogFragment globalSearchCatalogFragment = z ? (GlobalSearchCatalogFragment) fragment : null;
            DiscoverSearchFragment discoverSearchFragment = DiscoverSearchFragment.this;
            if (globalSearchCatalogFragment != null) {
                globalSearchCatalogFragment.T = discoverSearchFragment;
                CatalogRootViewHolder catalogRootViewHolder = globalSearchCatalogFragment.P;
                GlobalSearchCatalogRootVh globalSearchCatalogRootVh = catalogRootViewHolder instanceof GlobalSearchCatalogRootVh ? (GlobalSearchCatalogRootVh) catalogRootViewHolder : null;
                if (globalSearchCatalogRootVh != null) {
                    globalSearchCatalogRootVh.r = discoverSearchFragment;
                }
            }
            GlobalSearchCatalogFragment globalSearchCatalogFragment2 = z ? (GlobalSearchCatalogFragment) fragment : null;
            if (globalSearchCatalogFragment2 != null) {
                a aVar = new a(discoverSearchFragment, i);
                globalSearchCatalogFragment2.U = aVar;
                CatalogRootViewHolder catalogRootViewHolder2 = globalSearchCatalogFragment2.P;
                GlobalSearchCatalogRootVh globalSearchCatalogRootVh2 = catalogRootViewHolder2 instanceof GlobalSearchCatalogRootVh ? (GlobalSearchCatalogRootVh) catalogRootViewHolder2 : null;
                if (globalSearchCatalogRootVh2 != null) {
                    globalSearchCatalogRootVh2.s = aVar;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = DiscoverSearchFragment.s0;
            return ((List) DiscoverSearchFragment.this.o0.getValue()).size();
        }

        @Override // xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i) {
            return i * 10;
        }

        @Override // xsna.k1q0, xsna.scs, androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            for (Fragment fragment : DiscoverSearchFragment.this.In().a.c.f()) {
                Bundle arguments = fragment.getArguments();
                Long e = arguments != null ? bo8.e(arguments, "_discover_fragment_item_id") : null;
                if (e != null) {
                    int longValue = (int) (e.longValue() / 10);
                    G0(fragment, longValue);
                    K0(fragment, longValue);
                }
            }
        }

        @Override // xsna.scs
        public final boolean y0(long j) {
            int i = (int) (j / 10);
            return i >= 0 && i < getItemCount();
        }

        @Override // xsna.scs
        public final Fragment z0(int i) {
            Fragment F0 = F0(i);
            long j = i * 10;
            if (F0 != null) {
                Bundle arguments = F0.getArguments();
                Long e = arguments != null ? bo8.e(arguments, "_discover_fragment_item_id") : null;
                if (e != null && e.longValue() == j) {
                    return F0;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            int i2 = DiscoverSearchFragment.s0;
            FragmentImpl invoke = DiscoverSearchFragment.this.jo(valueOf).b.invoke();
            Bundle arguments2 = invoke.getArguments();
            if (arguments2 == null) {
                arguments2 = new Bundle();
                invoke.setArguments(arguments2);
            }
            arguments2.putLong("_discover_fragment_item_id", j);
            G0(invoke, i);
            K0(invoke, i);
            return invoke;
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverSearchTabs.SearchTabName.values().length];
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchAll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchGroups.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchPeople.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchGames.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchMiniApps.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchNews.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchMusic.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchVideo.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchClips.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DiscoverSearchTabs.SearchTabName.SearchGoods.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public static final class h extends mtn0 {
        public h() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            DiscoverSearchFragment discoverSearchFragment = DiscoverSearchFragment.this;
            VkSearchView vkSearchView = discoverSearchFragment.k0;
            qwh0 qwh0Var = null;
            if (vkSearchView != null) {
                FirstFixedTabsLayout firstFixedTabsLayout = discoverSearchFragment.h0;
                vkSearchView.setHint(discoverSearchFragment.jo(firstFixedTabsLayout != null ? Integer.valueOf(firstFixedTabsLayout.e(gVar)) : null).d);
            }
            DiscoverSearchTabs.SearchTabName.a aVar = DiscoverSearchTabs.SearchTabName.Companion;
            FirstFixedTabsLayout firstFixedTabsLayout2 = discoverSearchFragment.h0;
            String str = discoverSearchFragment.jo(firstFixedTabsLayout2 != null ? Integer.valueOf(firstFixedTabsLayout2.e(gVar)) : null).e;
            aVar.getClass();
            DiscoverSearchTabs.SearchTabName a = DiscoverSearchTabs.SearchTabName.a.a(str);
            if (a != null) {
                d dVar = discoverSearchFragment.f0;
                Object J0 = dVar != null ? dVar.J0(DiscoverSearchTabs.c.indexOf(a)) : null;
                if (J0 instanceof qwh0) {
                    qwh0Var = (qwh0) J0;
                }
            }
            boolean z = true;
            switch (a == null ? -1 : e.$EnumSwitchMapping$0[a.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (qwh0Var != null) {
                        z = qwh0Var.c0();
                        break;
                    }
                    break;
                case 9:
                case 10:
                    break;
                default:
                    z = false;
                    break;
            }
            AppBarShadowView appBarShadowView = discoverSearchFragment.i0;
            if (appBarShadowView != null) {
                appBarShadowView.setSeparatorAllowed(z);
            }
        }

        @Override // xsna.mtn0, com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
            DiscoverSearchFragment discoverSearchFragment;
            d dVar;
            if (gVar == null || (dVar = (discoverSearchFragment = DiscoverSearchFragment.this).f0) == null) {
                return;
            }
            FirstFixedTabsLayout firstFixedTabsLayout = discoverSearchFragment.h0;
            z1h0 F0 = dVar.F0(firstFixedTabsLayout != null ? firstFixedTabsLayout.e(gVar) : -1);
            if (F0 instanceof qwh0) {
                ((unh0) F0).s();
            }
        }
    }

    public DiscoverSearchFragment() {
        int i = 2;
        this.S = new bpn0(new ufk(this, i));
        VkFeedSearchParams vkFeedSearchParams = new VkFeedSearchParams();
        this.Z = vkFeedSearchParams;
        this.a0 = new bxh0(vkFeedSearchParams, new bih(this, 12), new com.vk.movika.sdk.base.logic.interactor.e(this, 29), new iy2(19), new com.vk.movika.sdk.base.logic.interactor.g(13));
        this.b0 = new bpn0(new ecm(this, i));
        this.c0 = msy.a(LazyThreadSafetyMode.NONE, new m1i(this, 7));
        this.e0 = new b();
        FragmentWithGlobalSearch$EntryMethod.a aVar = FragmentWithGlobalSearch$EntryMethod.Companion;
        this.m0 = new bpn0(new jrh(this, 6));
        this.n0 = new SearchQueryValueHelper();
        this.o0 = new bpn0(new myh(this, 9));
        this.p0 = w2o0.a.a(R.drawable.vk_icon_filter_24, R.string.talkback_ic_search_params);
    }

    @Override // xsna.uxh0
    public final boolean F0() {
        EditText editView;
        VkSearchView vkSearchView = this.k0;
        if (vkSearchView == null || (editView = vkSearchView.getEditView()) == null) {
            return false;
        }
        return editView.isFocused();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final int Pn() {
        return 48;
    }

    @Override // xsna.uxh0
    public final void X1(String str, boolean z) {
        izh0 izh0Var = this.r0;
        if (izh0Var != null) {
            izh0Var.X1(str, z);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        boolean z;
        izh0 izh0Var = this.r0;
        if (!(izh0Var != null ? izh0Var.a0() : false)) {
            if (this.l0 != null) {
                ViewPager2 viewPager2 = this.g0;
                if (viewPager2 != null) {
                    viewPager2.e(0, false);
                }
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.uxh0
    public final void d0() {
        VkSearchView vkSearchView = this.k0;
        if (vkSearchView != null) {
            vkSearchView.d0();
        }
    }

    @Override // xsna.uxh0
    public final void f1(boolean z, boolean z2) {
        h94 h94Var = z ? this.p0 : null;
        VkSearchView vkSearchView = this.k0;
        if (vkSearchView != null) {
            vkSearchView.j5(h94Var);
        }
        VkSearchView vkSearchView2 = this.k0;
        if (vkSearchView2 != null) {
            vkSearchView2.h5(z, z2);
        }
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        ViewPager2 viewPager2 = this.g0;
        if (viewPager2 != null) {
            int currentItem = viewPager2.getCurrentItem();
            d dVar = this.f0;
            if (dVar != null) {
                return dVar.F0(currentItem);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // xsna.y760
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h9(Intent intent) {
        int i;
        d dVar;
        String string;
        ViewPager2 viewPager2;
        rsr rsrVar = oz50.k;
        FragmentEntry c2 = oz50.b.c(intent.getExtras());
        Bundle bundle = c2 != null ? c2.c : null;
        if (bundle == null) {
            return;
        }
        String string2 = bundle.getString("tab");
        if (string2 != null) {
            DiscoverSearchTabs.SearchTabName.Companion.getClass();
            DiscoverSearchTabs.SearchTabName a2 = DiscoverSearchTabs.SearchTabName.a.a(string2);
            if (a2 != null) {
                i = DiscoverSearchTabs.b(a2);
                if (i >= 0 && (viewPager2 = this.g0) != null) {
                    viewPager2.e(i, true);
                }
                FragmentWithGlobalSearch$EntryMethod.a aVar = FragmentWithGlobalSearch$EntryMethod.Companion;
                int i2 = bundle.getInt("entry_method");
                aVar.getClass();
                FragmentWithGlobalSearch$EntryMethod.a.a(i2);
                dVar = this.f0;
                if (dVar != null) {
                    Object obj = DiscoverSearchTabs.a;
                    dVar.J0(DiscoverSearchTabs.b(DiscoverSearchTabs.SearchTabName.SearchAll));
                }
                string = bundle.getString("query");
                if (string == null) {
                    SearchQueryValueHelper.e(this.n0, new SearchQuery(string, SearchInputMethod.Preset, null, null, 12, null));
                    return;
                }
                return;
            }
        }
        i = -1;
        if (i >= 0) {
            viewPager2.e(i, true);
        }
        FragmentWithGlobalSearch$EntryMethod.a aVar2 = FragmentWithGlobalSearch$EntryMethod.Companion;
        int i22 = bundle.getInt("entry_method");
        aVar2.getClass();
        FragmentWithGlobalSearch$EntryMethod.a.a(i22);
        dVar = this.f0;
        if (dVar != null) {
        }
        string = bundle.getString("query");
        if (string == null) {
        }
    }

    @Override // xsna.uxh0
    public final String i() {
        return this.n0.b().d();
    }

    public final qcr<vcr<?>> io() {
        return (qcr) this.b0.getValue();
    }

    public final DiscoverSearchTabs.a jo(Integer num) {
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            bpn0 bpn0Var = this.o0;
            if (intValue < ((List) bpn0Var.getValue()).size()) {
                return (DiscoverSearchTabs.a) ((List) bpn0Var.getValue()).get(num.intValue());
            }
        }
        return (DiscoverSearchTabs.a) this.m0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ko(int i) {
        Fragment J0;
        d dVar = this.f0;
        if (dVar == null || (J0 = dVar.J0(i)) == 0) {
            return;
        }
        izh0 izh0Var = this.r0;
        izh0 izh0Var2 = null;
        if (izh0Var != null && izh0Var.d3() == i) {
            izh0 izh0Var3 = this.r0;
            if ((izh0Var3 != null ? izh0Var3.g() : null) == J0) {
                return;
            }
        }
        izh0 izh0Var4 = this.r0;
        if (izh0Var4 != null) {
            izh0Var4.c3();
        }
        VkSearchView vkSearchView = this.k0;
        if (vkSearchView != null) {
            boolean z = J0 instanceof jrh0;
            h94 h94Var = this.p0;
            if (z) {
                izh0Var2 = new zuq(J0, i, vkSearchView, h94Var, this.n0, ((jrh0) J0).af());
            } else {
                DiscoverSearchTabs.SearchTabName a2 = DiscoverSearchTabs.a(i);
                if (a2 != null) {
                    SearchParams searchParams = null;
                    DiscoverSearchTabs.a jo = jo(Integer.valueOf(i));
                    DiscoverSearchTabs.SearchTabName a3 = DiscoverSearchTabs.a(i);
                    if (a3 != null) {
                        int i2 = e.$EnumSwitchMapping$0[a3.ordinal()];
                        if (i2 == 2) {
                            searchParams = this.X;
                        } else if (i2 == 3) {
                            searchParams = this.W;
                        } else if (i2 == 6) {
                            searchParams = this.Z;
                        } else if (i2 == 10) {
                            searchParams = this.Y;
                        }
                    }
                    izh0Var2 = new xz70(J0, i, a2, jo, vkSearchView, this.n0, searchParams, h94Var, new nt8(this));
                }
            }
        }
        this.r0 = izh0Var2;
        if (izh0Var2 != null) {
            izh0Var2.q1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i;
        pcs a2;
        Bundle a3;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.U = arguments != null ? arguments.getString("query") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("tab")) != null) {
            DiscoverSearchTabs.SearchTabName.Companion.getClass();
            DiscoverSearchTabs.SearchTabName a4 = DiscoverSearchTabs.SearchTabName.a.a(string);
            if (a4 != null) {
                i = DiscoverSearchTabs.b(a4);
                this.V = Integer.valueOf(i);
                FragmentWithGlobalSearch$EntryMethod.a aVar = FragmentWithGlobalSearch$EntryMethod.Companion;
                Bundle arguments3 = getArguments();
                int i2 = arguments3 != null ? arguments3.getInt("entry_method") : -1;
                aVar.getClass();
                FragmentWithGlobalSearch$EntryMethod.a.a(i2);
                FragmentActivity activity = getActivity();
                this.q0 = activity != null ? LifecycleHandler.c(activity) : null;
                FragmentManager supportFragmentManager = kn().getSupportFragmentManager();
                a2 = ((pnh0) this.S.getValue()).a(new yve(this, 16));
                supportFragmentManager.l0("search_goods_filter_city_param", this, a2);
                a3 = getSavedStateRegistry().a("params");
                if (a3 != null) {
                    VkMarketSearchParams vkMarketSearchParams = (VkMarketSearchParams) a3.getParcelable("market");
                    if (vkMarketSearchParams != null) {
                        this.Y.h5(vkMarketSearchParams);
                    }
                    VkPeopleSearchParams vkPeopleSearchParams = (VkPeopleSearchParams) a3.getParcelable("people");
                    if (vkPeopleSearchParams != null) {
                        this.W.h5(vkPeopleSearchParams);
                    }
                    VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) a3.getParcelable("groups");
                    if (vkGroupsSearchParams != null) {
                        this.X.h5(vkGroupsSearchParams);
                    }
                    VkFeedSearchParams vkFeedSearchParams = (VkFeedSearchParams) a3.getParcelable("feed");
                    if (vkFeedSearchParams != null) {
                        this.Z.h5(vkFeedSearchParams);
                    }
                }
                getSavedStateRegistry().c("params", new v1h0.b() { // from class: xsna.q6n
                    @Override // xsna.v1h0.b
                    public final Bundle r() {
                        int i3 = DiscoverSearchFragment.s0;
                        Bundle bundle2 = new Bundle();
                        DiscoverSearchFragment discoverSearchFragment = DiscoverSearchFragment.this;
                        bundle2.putParcelable("market", discoverSearchFragment.Y);
                        bundle2.putParcelable("people", discoverSearchFragment.W);
                        bundle2.putParcelable("groups", discoverSearchFragment.X);
                        bundle2.putParcelable("feed", discoverSearchFragment.Z);
                        return bundle2;
                    }
                });
            }
        }
        i = -1;
        this.V = Integer.valueOf(i);
        FragmentWithGlobalSearch$EntryMethod.a aVar2 = FragmentWithGlobalSearch$EntryMethod.Companion;
        Bundle arguments32 = getArguments();
        if (arguments32 != null) {
        }
        aVar2.getClass();
        FragmentWithGlobalSearch$EntryMethod.a.a(i2);
        FragmentActivity activity2 = getActivity();
        this.q0 = activity2 != null ? LifecycleHandler.c(activity2) : null;
        FragmentManager supportFragmentManager2 = kn().getSupportFragmentManager();
        a2 = ((pnh0) this.S.getValue()).a(new yve(this, 16));
        supportFragmentManager2.l0("search_goods_filter_city_param", this, a2);
        a3 = getSavedStateRegistry().a("params");
        if (a3 != null) {
        }
        getSavedStateRegistry().c("params", new v1h0.b() { // from class: xsna.q6n
            @Override // xsna.v1h0.b
            public final Bundle r() {
                int i3 = DiscoverSearchFragment.s0;
                Bundle bundle2 = new Bundle();
                DiscoverSearchFragment discoverSearchFragment = DiscoverSearchFragment.this;
                bundle2.putParcelable("market", discoverSearchFragment.Y);
                bundle2.putParcelable("people", discoverSearchFragment.W);
                bundle2.putParcelable("groups", discoverSearchFragment.X);
                bundle2.putParcelable("feed", discoverSearchFragment.Z);
                return bundle2;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewPager2 viewPager2;
        View inflate = layoutInflater.inflate(R.layout.discover_search_view_sticky_all, viewGroup, false);
        ViewPager2 viewPager22 = (ViewPager2) hvt0.c(R.id.viewpager, inflate);
        this.g0 = viewPager22;
        d dVar = new d(viewPager22);
        this.f0 = dVar;
        ViewPager2 viewPager23 = this.g0;
        if (viewPager23 != null) {
            viewPager23.setAdapter(dVar);
        }
        ViewPager2 viewPager24 = this.g0;
        if (viewPager24 != null) {
            viewPager24.setPageTransformer(new androidx.viewpager2.widget.c(iah0.a(10)));
        }
        ViewPager2 viewPager25 = this.g0;
        if (viewPager25 != null) {
            viewPager25.b(new g());
        }
        FirstFixedTabsLayout firstFixedTabsLayout = (FirstFixedTabsLayout) hvt0.c(R.id.first_fixed_tabs, inflate);
        this.h0 = firstFixedTabsLayout;
        if (firstFixedTabsLayout != null && (viewPager2 = this.g0) != null) {
            new kpv0(firstFixedTabsLayout, viewPager2, new t34(this, 13)).a();
        }
        FirstFixedTabsLayout firstFixedTabsLayout2 = this.h0;
        if (firstFixedTabsLayout2 != null) {
            firstFixedTabsLayout2.g();
        }
        FirstFixedTabsLayout firstFixedTabsLayout3 = this.h0;
        if (firstFixedTabsLayout3 != null) {
            firstFixedTabsLayout3.h(new h());
        }
        AppBarShadowView appBarShadowView = (AppBarShadowView) hvt0.c(R.id.shadow, inflate);
        this.i0 = appBarShadowView;
        if (appBarShadowView != null) {
            appBarShadowView.setSeparatorAllowed(true);
        }
        this.j0 = hvt0.c(R.id.search_qr, inflate);
        VkSearchView vkSearchView = (VkSearchView) hvt0.c(R.id.search_view, inflate);
        this.k0 = vkSearchView;
        SearchQueryValueHelper searchQueryValueHelper = this.n0;
        if (vkSearchView != null) {
            Bundle arguments = getArguments();
            boolean z = arguments != null && arguments.getBoolean("no_anim", false);
            boolean z2 = !z;
            if (!z || fnj.b(mo2getContext())) {
                vkSearchView.X4(false);
            }
            BaseVkSearchView.d5(vkSearchView, 0, vkSearchView.getSelfMargin(), 11);
            vkSearchView.getLayoutParams().height -= vkSearchView.getPaddingBottom();
            vkSearchView.setPadding(vkSearchView.getPaddingLeft(), vkSearchView.getPaddingTop(), vkSearchView.getPaddingRight(), 0);
            vkSearchView.setVoiceInputEnabled(true);
            vkSearchView.setVoiceSearchCallback(new dn(12));
            vkSearchView.setMaxInputLength(255);
            View findViewById = vkSearchView.findViewById(R.id.msv_left_icon_container);
            if (findViewById != null) {
                f4m.s(s0, findViewById);
            }
            this.O.b(searchQueryValueHelper.a(vkSearchView));
            go(new fcj(this, vkSearchView, z2, 1));
        }
        ysg0<Object> ysg0Var = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0Var.a;
        lr lrVar = new lr(12);
        fVar.getClass();
        fo(new i0(fVar, lrVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new om1(this, 14)));
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var.a;
        q1 q1Var = new q1(17);
        fVar2.getClass();
        fo(new i0(fVar2, q1Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k41(this, 16)));
        fo(new i0(fVar2, new hg1.g1()).U(new hg1.f1()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new bw(new qqe(this, 9), 22)));
        fo(searchQueryValueHelper.d(0L, true, true).subscribe(new b00(new iz0(this, 26), 20)));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FragmentActivity activity = getActivity();
        LifecycleHandler lifecycleHandler = this.q0;
        if (activity != null && lifecycleHandler != null) {
            LifecycleHandler.h(activity, lifecycleHandler);
        }
        kn().getSupportFragmentManager().f("search_goods_filter_city_param");
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        izh0 izh0Var = this.r0;
        if (izh0Var != null) {
            izh0Var.onDestroyView();
        }
        this.r0 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Features.Type type = Features.Type.FEATURE_SEARCH_GLOBAL_SMALL_TABS_SPACE;
        type.getClass();
        return onGetLayoutInflater.cloneInContext(new lpj(requireContext(), com.vk.toggle.b.A.a(type) ? R.style.SearchThemeOverlay_ThinTabLayout : R.style.SearchThemeOverlay));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        mhy.b(getActivity());
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            go(new krh(this, 8));
            String str = this.U;
            if (str != null) {
                SearchQueryValueHelper.e(this.n0, new SearchQuery(str, SearchInputMethod.Preset, null, null, 12, null));
            } else {
                Bundle arguments = getArguments();
                if (arguments == null || !arguments.getBoolean("start_voice_search")) {
                    VkSearchView vkSearchView = this.k0;
                    if (vkSearchView != null) {
                        vkSearchView.b5(500L);
                    }
                } else {
                    VkSearchView vkSearchView2 = this.k0;
                    if (vkSearchView2 != null) {
                        vkSearchView2.k5();
                    }
                }
            }
        }
        go(new ldl(this, 3));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewPager2 viewPager2;
        super.onViewCreated(view, bundle);
        FirstFixedTabsLayout firstFixedTabsLayout = this.h0;
        if (firstFixedTabsLayout == null || (viewPager2 = this.g0) == null) {
            return;
        }
        new com.vk.search.fragment.a(this, firstFixedTabsLayout, viewPager2);
    }

    @Override // xsna.uxh0
    public final void x9() {
        VkSearchView vkSearchView = this.k0;
        if (vkSearchView != null) {
            vkSearchView.e5();
        }
        VkSearchView vkSearchView2 = this.k0;
        if (vkSearchView2 != null) {
            vkSearchView2.a5();
        }
    }

    @Override // xsna.uxh0
    public final void z0(boolean z, boolean z2) {
        if (z) {
            VkSearchView vkSearchView = this.k0;
            if (vkSearchView != null) {
                vkSearchView.g5(z2);
                return;
            }
            return;
        }
        VkSearchView vkSearchView2 = this.k0;
        if (vkSearchView2 != null) {
            vkSearchView2.Y4(z2);
        }
    }

    /* compiled from: DiscoverSearchFragment.kt */
    /* loaded from: classes5.dex */
    public static final class g extends ViewPager2.g {
        public g() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageSelected(int i) {
            AppBarShadowView appBarShadowView;
            int i2 = DiscoverSearchFragment.s0;
            DiscoverSearchFragment discoverSearchFragment = DiscoverSearchFragment.this;
            discoverSearchFragment.ko(i);
            Integer num = discoverSearchFragment.l0;
            if (num == null || num.intValue() != i) {
                discoverSearchFragment.l0 = null;
            }
            ViewPager2 viewPager2 = discoverSearchFragment.g0;
            if (viewPager2 == null || (appBarShadowView = discoverSearchFragment.i0) == null) {
                return;
            }
            appBarShadowView.V(viewPager2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }
}
