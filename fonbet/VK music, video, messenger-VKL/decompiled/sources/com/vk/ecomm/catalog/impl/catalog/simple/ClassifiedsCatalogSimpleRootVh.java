package com.vk.ecomm.catalog.impl.catalog.simple;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketOptions;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.ecomm.catalog.impl.catalog.simple.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import defpackage.z;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.av00;
import xsna.b5a;
import xsna.bpn0;
import xsna.bw;
import xsna.by00;
import xsna.c5g;
import xsna.cq3;
import xsna.dy00;
import xsna.e1;
import xsna.epx;
import xsna.f40;
import xsna.f4m;
import xsna.fy00;
import xsna.hg1;
import xsna.hwg0;
import xsna.ix2;
import xsna.iy00;
import xsna.izs;
import xsna.j5;
import xsna.j5g;
import xsna.jd4;
import xsna.jjc;
import xsna.jw00;
import xsna.k5;
import xsna.ku1;
import xsna.kwg0;
import xsna.l5;
import xsna.lfa;
import xsna.lu00;
import xsna.m5;
import xsna.maz;
import xsna.mu00;
import xsna.mzp0;
import xsna.o5a;
import xsna.o93;
import xsna.on;
import xsna.ou00;
import xsna.qt00;
import xsna.sa80;
import xsna.sv;
import xsna.sz;
import xsna.u0a;
import xsna.u4a;
import xsna.v5;
import xsna.wpg;
import xsna.yfc;

/* compiled from: ClassifiedsCatalogSimpleRootVh.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsCatalogSimpleRootVh extends ClassifiedsCatalogBaseRootVh {
    public final boolean H;
    public final jd4 I;
    public final maz J;
    public final mzp0 K;
    public final yfc L;
    public List<Pair<String, Integer>> M;
    public final String N;
    public final ArrayList O;
    public com.vk.ecomm.catalog.impl.catalog.simple.b P;
    public final ToolbarVh Q;
    public final ShowAllListVh R;
    public final TabsOrListVh S;

    /* compiled from: RxExt.kt */
    public static final class a implements izs {
        public static final a b = new a();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof sa80);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class b implements izs {
        public static final b b = new b();

        @Override // xsna.izs
        public final sa80 invoke(Object obj) {
            if (obj != null) {
                return (sa80) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.OnReloadCatalogSectionEvent");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class c implements izs {
        public static final c b = new c();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof mu00);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class d implements izs {
        public static final d b = new d();

        @Override // xsna.izs
        public final mu00 invoke(Object obj) {
            if (obj != null) {
                return (mu00) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.market.MarketCatalogActionChangeFilter");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ou00);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class f implements izs {
        public static final f b = new f();

        @Override // xsna.izs
        public final ou00 invoke(Object obj) {
            if (obj != null) {
                return (ou00) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.catalog2.common.ui.core.events.market.MarketCatalogActionClearFilters");
        }
    }

    /* compiled from: RxExt.kt */
    public static final class g implements izs {
        public static final g b = new g();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof dy00);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class h implements izs {
        public static final h b = new h();

        @Override // xsna.izs
        public final dy00 invoke(Object obj) {
            if (obj != null) {
                return (dy00) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.vk.ecomm.market.api.bus.MarketEventAlbumDeleted");
        }
    }

    public ClassifiedsCatalogSimpleRootVh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Type inference failed for: r39v1, types: [com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration] */
    /* JADX WARN: Type inference failed for: r43v1, types: [com.vk.catalog2.common.dto.api.ui.UIBlock] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.vk.catalog2.common.dto.ui.UIBlockList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClassifiedsCatalogSimpleRootVh(FragmentActivity fragmentActivity, o5a o5aVar, Bundle bundle, boolean z, jd4 jd4Var, maz mazVar, mzp0 mzp0Var, ClassifiedsCatalogSimpleFragment classifiedsCatalogSimpleFragment) {
        super(bundle, fragmentActivity, o5aVar, null, classifiedsCatalogSimpleFragment);
        Integer num;
        String string;
        CatalogConfiguration catalogConfiguration;
        this.H = z;
        this.I = jd4Var;
        this.J = mazVar;
        this.K = mzp0Var;
        yfc yfcVar = bundle != null ? new yfc(bundle) : null;
        this.L = yfcVar;
        String string2 = yfcVar != null ? yfcVar.a.getString("KEY_CATALOG_CONTEXT") : null;
        if (yfcVar != null) {
            Bundle bundle2 = yfcVar.a;
            if (bundle2.containsKey("KEY_CATEGORY_ID")) {
                num = Integer.valueOf(bundle2.getInt("KEY_CATEGORY_ID"));
                Pair pair = num != null ? null : new Pair(string2, num);
                this.M = pair == null ? Collections.singletonList(pair) : null;
                string = yfcVar == null ? yfcVar.a.getString("KEY_SECTION_ID") : null;
                this.N = string;
                this.O = new ArrayList();
                u4a.a aVar = this.m.b;
                ToolbarVh toolbarVh = new ToolbarVh(aVar.b, aVar.e, null, R.layout.catalog_classified_category_toolbar, false, null, null, null, null, null, null, 4194292);
                this.Q = toolbarVh;
                ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, true, null, false, null, null, null, N(), null, null, 7164);
                CatalogConfiguration catalogConfiguration2 = this.m.b.s;
                CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SHOW_ALL;
                CatalogViewType catalogViewType = CatalogViewType.LIST;
                if (string == null) {
                    r2 = yfcVar != null ? yfcVar.a.getString("title") : null;
                    catalogConfiguration = catalogConfiguration2;
                    r2 = new UIBlockList(string, catalogViewType, catalogDataType, "", UserId.d, new ArrayList(), EmptySet.b, null, null, r2, EmptyList.b, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1072693248, null);
                } else {
                    catalogConfiguration = catalogConfiguration2;
                }
                this.R = (ShowAllListVh) catalogConfiguration.w(catalogDataType, catalogViewType, null, r2, this.m);
                this.S = new TabsOrListVh(this.m, toolbarVh, 0, null, false, this.z, N(), viewPagerVh, null, null, false, null, 259324);
            }
        }
        num = null;
        if (num != null) {
        }
        this.M = pair == null ? Collections.singletonList(pair) : null;
        if (yfcVar == null) {
        }
        this.N = string;
        this.O = new ArrayList();
        u4a.a aVar2 = this.m.b;
        ToolbarVh toolbarVh2 = new ToolbarVh(aVar2.b, aVar2.e, null, R.layout.catalog_classified_category_toolbar, false, null, null, null, null, null, null, 4194292);
        this.Q = toolbarVh2;
        ViewPagerVh viewPagerVh2 = new ViewPagerVh(this.m, true, null, false, null, null, null, N(), null, null, 7164);
        CatalogConfiguration catalogConfiguration22 = this.m.b.s;
        CatalogDataType catalogDataType2 = CatalogDataType.DATA_SYNTHETIC_SHOW_ALL;
        CatalogViewType catalogViewType2 = CatalogViewType.LIST;
        if (string == null) {
        }
        this.R = (ShowAllListVh) catalogConfiguration.w(catalogDataType2, catalogViewType2, null, r2, this.m);
        this.S = new TabsOrListVh(this.m, toolbarVh2, 0, null, false, this.z, N(), viewPagerVh2, null, null, false, null, 259324);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockList uIBlockList;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock2;
        ArrayList<UIBlock> arrayList2;
        ArrayList<UIBlock> arrayList3;
        UIBlock uIBlock3;
        mzp0 mzp0Var = this.K;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        boolean z = uIBlock instanceof UIBlockCatalog;
        UIBlockCatalog uIBlockCatalog = z ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog != null && (arrayList3 = uIBlockCatalog.A) != null && (uIBlock3 = (UIBlock) j5g.a0(arrayList3)) != null && (uIBlock3 instanceof UIBlockList)) {
            o0((UIBlockList) uIBlock3);
        }
        ArrayList arrayList4 = this.O;
        arrayList4.clear();
        UIBlockCatalog uIBlockCatalog2 = z ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog2 != null && (uIBlockList = uIBlockCatalog2.y) != null && (arrayList = uIBlockList.y) != null && (uIBlock2 = (UIBlock) j5g.a0(arrayList)) != null) {
            UIBlockButtons uIBlockButtons = uIBlock2 instanceof UIBlockButtons ? (UIBlockButtons) uIBlock2 : null;
            if (uIBlockButtons != null && (arrayList2 = uIBlockButtons.y) != null) {
                for (UIBlock uIBlock4 : arrayList2) {
                    if (uIBlock4 instanceof UIBlockActionMarketOptions) {
                        arrayList4.add(uIBlock4);
                    }
                }
            }
        }
        r0();
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
        this.S.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k0().a();
        bpn0 bpn0Var = this.t;
        int i = 16;
        int i2 = 18;
        this.C.d(((fy00) bpn0Var.getValue()).a().b0(by00.class).r0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k5(new j5(this, i), 10)), ((fy00) bpn0Var.getValue()).a().b0(iy00.class).subscribe(new m5(new l5(this, i2), 15)));
        mzp0 mzp0Var = this.K;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        boolean z = this.H;
        maz mazVar = this.J;
        if (z) {
            View k5 = this.R.k5(layoutInflater, viewGroup, null);
            AppBarShadowView appBarShadowView = (AppBarShadowView) k5.findViewById(R.id.shadow_view);
            if (appBarShadowView != null) {
                appBarShadowView.setSeparatorAllowed(false);
            }
            com.vk.ecomm.catalog.impl.catalog.simple.b bVar = new com.vk.ecomm.catalog.impl.catalog.simple.b(k5, mazVar);
            this.P = bVar;
            jjc.g(bVar.k.a, new sz(this, i));
            return k5;
        }
        TabsOrListVh tabsOrListVh = this.S;
        View k52 = tabsOrListVh.k5(layoutInflater, viewGroup, null);
        AppBarShadowView appBarShadowView2 = tabsOrListVh.v;
        if (appBarShadowView2 != null) {
            appBarShadowView2.setSeparatorAllowed(false);
        }
        com.vk.ecomm.catalog.impl.catalog.simple.b bVar2 = new com.vk.ecomm.catalog.impl.catalog.simple.b(k52, mazVar);
        this.P = bVar2;
        jjc.g(bVar2.k.a, new ix2(this, i2));
        k52.post(new o93(this, 3));
        return k52;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        io.reactivex.rxjava3.subjects.f<u0a> fVar = b5aVar.a;
        hg1.f0 f0Var = new hg1.f0(a.b);
        fVar.getClass();
        j1 U = new i0(fVar, f0Var).U(new hg1.e0(b.b));
        int i = 14;
        z zVar = new z(new com.vk.movika.sdk.base.data.a(this, 20), i);
        int i2 = kwg0.a;
        bVar.b(U.subscribe(zVar, new hwg0()));
        io.reactivex.rxjava3.subjects.f<lu00> fVar2 = av00.a;
        hg1.f0 f0Var2 = new hg1.f0(c.b);
        fVar2.getClass();
        bVar.b(new i0(fVar2, f0Var2).U(new hg1.e0(d.b)).subscribe(new f40(new e1(this, 23), 9), new hwg0()));
        bVar.b(new i0(fVar2, new hg1.f0(e.b)).U(new hg1.e0(f.b)).subscribe(new bw(new v5(this, 19), 12), new hwg0()));
        bVar.b(new i0(((fy00) this.t.getValue()).a(), new hg1.f0(g.b)).U(new hg1.e0(h.b)).subscribe(new sv(new on(this, 17), i), new hwg0()));
        return bVar;
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final void i0(MarketProfileInfoDto marketProfileInfoDto) {
        this.D = marketProfileInfoDto;
        r0();
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        super.onPause();
        if (this.H) {
            this.R.onPause();
        } else {
            this.S.n.onPause();
        }
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        if (this.H) {
            this.R.onResume();
        } else {
            this.S.n.onResume();
        }
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final void p0(jw00.c cVar) {
        int i;
        com.vk.ecomm.catalog.impl.catalog.simple.b bVar = this.P;
        String str = null;
        if (bVar == null) {
            bVar = null;
        }
        qt00 qt00Var = bVar.l;
        if (cVar != null && (i = cVar.a) > 0) {
            str = String.valueOf(i);
        }
        qt00Var.b(str);
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final void q0(jw00.a aVar) {
        int i;
        com.vk.ecomm.catalog.impl.catalog.simple.b bVar = this.P;
        String str = null;
        if (bVar == null) {
            bVar = null;
        }
        qt00 qt00Var = bVar.k;
        if (aVar != null && (i = aVar.a) > 0) {
            str = String.valueOf(i);
        }
        qt00Var.b(str);
    }

    public final void r0() {
        com.vk.ecomm.catalog.impl.catalog.simple.b bVar = this.P;
        if (bVar == null) {
            bVar = null;
        }
        List<Pair<String, Integer>> list = this.M;
        MarketProfileInfoDto marketProfileInfoDto = this.D;
        ArrayList arrayList = this.O;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new b.a((UIBlockActionMarketOptions) it.next()));
        }
        yfc yfcVar = this.L;
        b.C0929b c0929b = new b.C0929b(yfcVar, list, marketProfileInfoDto, this.I, this.A, arrayList2);
        View view = bVar.e;
        qt00 qt00Var = bVar.k;
        View view2 = bVar.d;
        qt00 qt00Var2 = bVar.i;
        qt00 qt00Var3 = bVar.l;
        if (marketProfileInfoDto == null) {
            return;
        }
        String string = yfcVar != null ? yfcVar.a.getString("KEY_SECTION_ID") : null;
        if (epx.f(string, MarketCatalogSectionId.CATEGORY.h())) {
            view2.setVisibility(0);
            f4m.j(view);
            qt00Var.c();
            qt00Var3.c();
            qt00Var2.a();
        } else if (epx.f(string, MarketCatalogSectionId.ALBUM.h())) {
            f4m.j(view2);
            qt00Var2.c();
            qt00Var3.a();
            if (arrayList2.isEmpty()) {
                qt00Var.c();
                f4m.j(view);
            } else {
                qt00Var.a();
                view.setVisibility(0);
            }
        } else {
            f4m.j(view2);
            f4m.j(view);
            qt00Var.c();
            qt00Var3.c();
            qt00Var2.a();
        }
        MarketProfileInfoSimpleButtonDto e2 = marketProfileInfoDto.e();
        qt00Var.b(e2 != null ? e2.d() : null);
        MarketProfileInfoSimpleButtonDto d2 = marketProfileInfoDto.d();
        qt00Var3.b(d2 != null ? d2.d() : null);
        jjc.g(view2, new wpg(c0929b, 27));
        jjc.g(qt00Var3.a, new cq3(19, c0929b, bVar));
        jjc.g(qt00Var2.a, new lfa(8, c0929b, bVar));
        jjc.g(view, new ku1(19, c0929b, bVar));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.K;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        this.S.rg(th);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MarketAnalyticsParams b2;
        yfc yfcVar = this.L;
        if (yfcVar == null || (b2 = yfcVar.b()) == null || (mobileOfficialAppsCoreNavStat$EventScreen = b2.c) == null) {
            mobileOfficialAppsCoreNavStat$EventScreen = epx.f(this.N, MarketCatalogSectionId.CATEGORY.h()) ? MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH : MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SECTION;
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        this.m.b.b.c(false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
