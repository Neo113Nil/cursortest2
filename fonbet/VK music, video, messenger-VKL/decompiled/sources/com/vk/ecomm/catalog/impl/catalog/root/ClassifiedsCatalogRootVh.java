package com.vk.ecomm.catalog.impl.catalog.root;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.AnimSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.AnimStartSearchView;
import com.vk.dto.music.SearchSuggestion;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.ecomm.catalog.impl.catalog.base.b;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogFragment;
import com.vk.movika.sdk.base.observable.m;
import com.vk.movika.sdk.base.observable.q;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.a34;
import xsna.ah3;
import xsna.alj;
import xsna.av00;
import xsna.b5a;
import xsna.bnn0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cj4;
import xsna.d02;
import xsna.e43;
import xsna.egc;
import xsna.epx;
import xsna.ez;
import xsna.f4m;
import xsna.fnj;
import xsna.hg1;
import xsna.hgc;
import xsna.hwg0;
import xsna.iah0;
import xsna.igc;
import xsna.in0;
import xsna.jgc;
import xsna.jv;
import xsna.jw00;
import xsna.kca;
import xsna.kf3;
import xsna.kwg0;
import xsna.lgc;
import xsna.ltz;
import xsna.maz;
import xsna.mh;
import xsna.mhy;
import xsna.mo1;
import xsna.mzp0;
import xsna.o4;
import xsna.ou00;
import xsna.pa2;
import xsna.qt00;
import xsna.rda;
import xsna.s190;
import xsna.snh0;
import xsna.swp;
import xsna.u0a;
import xsna.u4a;
import xsna.u8;
import xsna.vtk0;
import xsna.vyh0;
import xsna.x8a;
import xsna.xfc;
import xsna.yfc;
import xsna.yw90;
import xsna.z24;
import xsna.zv00;

/* compiled from: ClassifiedsCatalogRootVh.kt */
/* loaded from: classes18.dex */
public final class ClassifiedsCatalogRootVh extends ClassifiedsCatalogBaseRootVh implements rda, View.OnTouchListener, SwitchCatalogVh.b, CatalogStatesViewHolder {
    public final mzp0 H;
    public final yw90 I;
    public final maz J;
    public final yfc K;
    public final boolean L;
    public final String M;
    public final kca N;
    public final lgc O;
    public final boolean P;
    public final egc Q;
    public final ah3 R;
    public final pa2 S;
    public boolean T;
    public boolean U;
    public bnn0 V;
    public bnn0 W;
    public String X;
    public String Y;
    public final ViewPagerVh Z;
    public final SearchResultsImplVh a0;
    public final AnimSearchQueryVh b0;
    public final AnimSearchQueryButtonWrapperVH c0;
    public final TabLayoutVh d0;
    public final SwitchCatalogVh e0;
    public final HidingToolbarVh f0;
    public xfc g0;
    public final b h0;

    /* compiled from: ClassifiedsCatalogRootVh.kt */
    public static final class a {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }
    }

    public ClassifiedsCatalogRootVh() {
        throw null;
    }

    public ClassifiedsCatalogRootVh(FragmentActivity fragmentActivity, ClassifiedsCatalogFragment.b bVar, Bundle bundle, FragmentManager fragmentManager, ClassifiedsCatalogFragment classifiedsCatalogFragment, mzp0 mzp0Var, yw90 yw90Var, maz mazVar) {
        super(bundle, fragmentActivity, bVar, fragmentManager, classifiedsCatalogFragment);
        lgc igcVar;
        AnimSearchQueryButtonWrapperVH animSearchQueryButtonWrapperVH;
        ClassifiedsCatalogRootVh classifiedsCatalogRootVh;
        MarketAnalyticsParams b;
        this.H = mzp0Var;
        this.I = yw90Var;
        this.J = mazVar;
        yfc yfcVar = bundle != null ? new yfc(bundle) : null;
        this.K = yfcVar;
        boolean z = yfcVar != null && yfcVar.a.getBoolean("KEY_MODE_SEARCH_ONLY", false);
        this.L = z;
        this.M = z ? "" : yfcVar != null ? yfcVar.a.getString("KEY_SEARCH_QUERY") : null;
        kca kcaVar = new kca(new bpn0(new cj4(3)));
        this.N = kcaVar;
        u4a u4aVar = this.m;
        if (t0()) {
            igcVar = new jgc(u4aVar.b.s.N(), s0(yfcVar));
        } else {
            igcVar = new igc(u4aVar.b.s.N(), kcaVar, s0(yfcVar), yfcVar != null ? yfcVar.a.getString("KEY_SEARCH_SECTION_ID") : null);
        }
        this.O = igcVar;
        this.P = yfcVar != null ? yfcVar.a.getBoolean("KEY_OPEN_VOICE_SEARCH", false) : false;
        MarketAnalyticsParams marketAnalyticsParams = this.y;
        this.Q = new egc(marketAnalyticsParams, this.A);
        u4a u4aVar2 = this.m;
        this.R = new ah3(u4aVar2);
        this.S = new pa2(yfcVar);
        this.U = marketAnalyticsParams != null ? marketAnalyticsParams.l : false;
        this.V = alj.a;
        this.Y = "";
        ViewPagerVh viewPagerVh = new ViewPagerVh(u4aVar2, true, null, false, null, null, null, N(), null, null, 7164);
        this.Z = viewPagerVh;
        u4a u4aVar3 = this.m;
        SearchResultsImplVh a2 = (t0() ? new snh0(u4aVar3, igcVar, fragmentActivity) : new zv00(u4aVar3, igcVar)).a();
        this.a0 = a2;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        AnimSearchQueryVh animSearchQueryVh = new AnimSearchQueryVh(new a34(i3, this, ClassifiedsCatalogRootVh.class, "onSearchIconClicked", "onSearchIconClicked()V", i, i2), new in0(this, 16), new z24(i3, this, ClassifiedsCatalogRootVh.class, "startVoiceSearch", "startVoiceSearch()V", i, i2), new m(this, 23));
        this.b0 = animSearchQueryVh;
        AnimSearchQueryButtonWrapperVH animSearchQueryButtonWrapperVH2 = new AnimSearchQueryButtonWrapperVH(animSearchQueryVh);
        this.c0 = animSearchQueryButtonWrapperVH2;
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new mh(this, 19));
        TabLayoutVh tabLayoutVh = new TabLayoutVh(viewPagerVh, 0, null, false, this.m.b.r, 990);
        this.d0 = tabLayoutVh;
        ProgressVh progressVh = new ProgressVh((Object) null);
        if (yfcVar == null || (b = yfcVar.b()) == null || b.i) {
            animSearchQueryButtonWrapperVH = animSearchQueryButtonWrapperVH2;
            classifiedsCatalogRootVh = this;
        } else {
            animSearchQueryButtonWrapperVH = animSearchQueryButtonWrapperVH2;
            classifiedsCatalogRootVh = null;
        }
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh, a2, errorStateVh, progressVh, this, 0, classifiedsCatalogRootVh, null, false, false, null, 1952);
        this.e0 = switchCatalogVh;
        this.f0 = new HidingToolbarVh(this.m.b.e, e43.l(animSearchQueryButtonWrapperVH, tabLayoutVh), switchCatalogVh, null);
        b.C0927b j0 = j0(t0());
        u4a.a aVar = this.m.b;
        this.h0 = new b(aVar.a, this.F, j0, aVar.e);
    }

    public static Bundle s0(yfc yfcVar) {
        if (yfcVar == null) {
            return null;
        }
        Bundle bundle = yfcVar.a;
        String string = bundle.getString("KEY_SEARCH_QUERY");
        if ((string != null && string.length() != 0) || bundle.getBoolean("KEY_MODE_SEARCH_ONLY", false)) {
            return d02.o(yfcVar);
        }
        x8a x8aVar = new x8a(0);
        d02.p(yfcVar, x8aVar);
        Bundle bundle2 = (Bundle) x8aVar.b;
        return bundle2 != null ? new Bundle(bundle2) : new Bundle();
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.e0.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.H;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        this.f0.N6(uIBlock);
        bnn0 bnn0Var = this.V;
        alj aljVar = alj.a;
        if (epx.f(bnn0Var, aljVar)) {
            i8(aljVar);
        }
        if (uIBlock instanceof UIBlockCatalog) {
            ArrayList<UIBlock> arrayList = ((UIBlockCatalog) uIBlock).A;
            boolean z = arrayList.size() > 1;
            this.T = z;
            boolean z2 = z && !epx.f(this.V, vyh0.a);
            TabLayoutVh tabLayoutVh = this.d0;
            if (z2) {
                tabLayoutVh.show();
            } else {
                tabLayoutVh.hide();
            }
            this.Y = !arrayList.isEmpty() ? arrayList.get(0).b : "";
        }
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
        yw90 yw90Var = this.I;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        super.S(cfp0Var);
        if (t0() && epx.f(this.e0.r, vyh0.a)) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        yfc yfcVar;
        if (!(this.e0.r instanceof vyh0) || (yfcVar = this.K) == null || yfcVar.a.getBoolean("KEY_MODE_SEARCH_ONLY", false)) {
            return false;
        }
        i8(alj.a);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_clasified_root_vh, viewGroup, false);
        HidingToolbarVh hidingToolbarVh = this.f0;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        k5.post(new o4(this, 4));
        ((ViewGroup) inflate.findViewById(R.id.catalog_content)).addView(k5);
        this.g0 = new xfc(this.c0, new a(inflate));
        this.a0.setOnTouchListener(this);
        String str = this.M;
        if (str != null) {
            u0(str, null, str.length() == 0);
            vyh0 vyh0Var = vyh0.a;
            this.V = vyh0Var;
            i8(vyh0Var);
            if (this.P) {
                vtk0.d().d(R(), new hgc(this));
            } else {
                AnimStartSearchView animStartSearchView = this.b0.g;
                if (animStartSearchView != null) {
                    mhy.j(animStartSearchView.b);
                }
            }
        }
        i8(ltz.a);
        hidingToolbarVh.j = false;
        hidingToolbarVh.a(true);
        k0().a();
        return inflate;
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        super.Y();
        this.f0.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c g0(b5a b5aVar) {
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        f<u0a> fVar = b5aVar.a;
        int i = 7;
        kf3 kf3Var = new kf3(new mo1(9), i);
        fVar.getClass();
        i0 i0Var = new i0(fVar, kf3Var);
        jv jvVar = new jv(new q(this, 21), 13);
        int i2 = kwg0.a;
        bVar.b(i0Var.subscribe(jvVar, new hwg0()));
        bVar.b(new i0(fVar, new hg1.d0()).U(new hg1.c0()).subscribe(new ez(new u8(this, 23), i), new hwg0()));
        return bVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.e0.r;
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final void i0(MarketProfileInfoDto marketProfileInfoDto) {
        this.D = marketProfileInfoDto;
        this.R.c = marketProfileInfoDto.f();
        xfc xfcVar = this.g0;
        if (xfcVar == null) {
            xfcVar = null;
        }
        qt00 qt00Var = xfcVar.c;
        MarketProfileInfoSimpleButtonDto e = marketProfileInfoDto.e();
        qt00Var.b(e != null ? e.d() : null);
        qt00 qt00Var2 = xfcVar.b;
        MarketProfileInfoSimpleButtonDto d = marketProfileInfoDto.d();
        qt00Var2.b(d != null ? d.d() : null);
        bwt0.p0(xfcVar.d.b, !e43.m(marketProfileInfoDto.g() != null ? r5.e() : null).isEmpty());
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        vyh0 vyh0Var = vyh0.a;
        boolean equals = bnn0Var.equals(vyh0Var);
        TabLayoutVh tabLayoutVh = this.d0;
        SearchResultsImplVh searchResultsImplVh = this.a0;
        if (equals) {
            searchResultsImplVh.onResume();
            tabLayoutVh.onPause();
        } else if (bnn0Var.equals(alj.a)) {
            searchResultsImplVh.onPause();
            tabLayoutVh.onResume();
        } else {
            searchResultsImplVh.onPause();
            tabLayoutVh.onPause();
        }
        xfc xfcVar = this.g0;
        Bundle bundle = null;
        if (xfcVar == null) {
            xfcVar = null;
        }
        s190 s190Var = xfcVar.d;
        qt00 qt00Var = xfcVar.b;
        xfcVar.c.c();
        if (bnn0Var.equals(vyh0Var)) {
            qt00Var.c();
            f4m.j(s190Var.a);
        } else {
            qt00Var.c();
            s190Var.a.setVisibility(0);
        }
        SwitchCatalogVh switchCatalogVh = this.e0;
        if (epx.f(switchCatalogVh.r, bnn0Var)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
        if (bnn0Var.equals(alj.a) || (bnn0Var.equals(vyh0Var) && !bnn0Var.equals(this.V))) {
            yfc yfcVar = this.K;
            if (yfcVar != null) {
                x8a x8aVar = new x8a(0);
                d02.p(yfcVar, x8aVar);
                Bundle bundle2 = (Bundle) x8aVar.b;
                bundle = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            }
            this.O.b = bundle;
            av00.a(new ou00(this.m.b.a));
            this.V = bnn0Var;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        AnimStartSearchView animStartSearchView;
        AnimStartSearchView animStartSearchView2;
        boolean z = bnn0Var instanceof vyh0;
        AnimSearchQueryVh animSearchQueryVh = this.b0;
        if (!z && (animStartSearchView2 = animSearchQueryVh.g) != null) {
            EditText editText = animStartSearchView2.b;
            if (!(bnn0Var instanceof ltz) && editText.getText().length() > 0) {
                editText.setText("");
            }
            mhy.d(editText);
            editText.clearFocus();
        }
        if (z && (animStartSearchView = animSearchQueryVh.g) != null) {
            mhy.j(animStartSearchView.b);
        }
        r0(bnn0Var);
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(this.b);
        AnimStartSearchView animStartSearchView3 = animSearchQueryVh.g;
        if (animStartSearchView3 != null) {
            animStartSearchView3.setVisibility(0);
        }
        if (d) {
            AnimStartSearchView animStartSearchView4 = animSearchQueryVh.g;
            if (animStartSearchView4 != null) {
                animStartSearchView4.a(false);
            }
        } else {
            AnimStartSearchView animStartSearchView5 = animSearchQueryVh.g;
            if (animStartSearchView5 != null) {
                animStartSearchView5.a(true);
            }
        }
        boolean z2 = bnn0Var instanceof alj;
        TabLayoutVh tabLayoutVh = this.d0;
        if (z2 && this.T) {
            tabLayoutVh.show();
        } else {
            tabLayoutVh.hide();
        }
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final b k0() {
        return this.h0;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.f0.onConfigurationChanged(configuration);
        TabLayoutVh tabLayoutVh = this.d0;
        if (tabLayoutVh == null) {
            tabLayoutVh = null;
        }
        if (tabLayoutVh != null) {
            tabLayoutVh.onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        super.onPause();
        if (epx.f(this.e0.r, vyh0.a)) {
            this.a0.onPause();
        } else {
            this.d0.onPause();
        }
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        SwitchCatalogVh switchCatalogVh = this.e0;
        if (epx.f(switchCatalogVh.r, vyh0.a)) {
            this.a0.onResume();
        } else {
            this.d0.onResume();
        }
        r0(switchCatalogVh.r);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        AnimStartSearchView animStartSearchView = this.b0.g;
        if (animStartSearchView == null || (str = animStartSearchView.getQuery()) == null) {
            str = "";
        }
        this.N.a(str);
        return false;
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final void p0(jw00.c cVar) {
        int i;
        xfc xfcVar = this.g0;
        String str = null;
        if (xfcVar == null) {
            xfcVar = null;
        }
        if (cVar != null && (i = cVar.a) > 0) {
            str = String.valueOf(i);
        }
        xfcVar.b.b(str);
    }

    @Override // com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh
    public final void q0(jw00.a aVar) {
        int i;
        xfc xfcVar = this.g0;
        String str = null;
        if (xfcVar == null) {
            xfcVar = null;
        }
        if (aVar != null && (i = aVar.a) > 0) {
            str = String.valueOf(i);
        }
        xfcVar.c.b(str);
    }

    public final void r0(bnn0 bnn0Var) {
        boolean f = epx.f(bnn0Var, vyh0.a);
        u4a u4aVar = this.m;
        if (f && t0()) {
            SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        } else {
            SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
            searchStatInfoProvider2.getClass();
            searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Disabled;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.H;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        bnn0 bnn0Var = this.e0.r;
        if (bnn0Var instanceof vyh0) {
            this.a0.s();
        } else if (bnn0Var instanceof alj) {
            this.Z.s();
        }
    }

    public final boolean t0() {
        String str;
        yfc yfcVar = this.K;
        if (yfcVar == null || (str = yfcVar.a.getString("KEY_SEARCH_SECTION_ID")) == null) {
            str = "search";
        }
        return str.equals("search");
    }

    public final void u0(String str, String str2, boolean z) {
        this.X = str2;
        AnimSearchQueryVh animSearchQueryVh = this.b0;
        AnimStartSearchView animStartSearchView = animSearchQueryVh.g;
        if (animStartSearchView != null) {
            EditText editText = animStartSearchView.b;
            if (z) {
                c cVar = animSearchQueryVh.f;
                if (cVar != null) {
                    cVar.dispose();
                }
                editText.setText(str);
                editText.setSelection(editText.getText().length());
                animSearchQueryVh.f = animSearchQueryVh.a(animStartSearchView);
            } else {
                editText.setText(str);
                editText.setSelection(editText.getText().length());
            }
        }
        SearchResultsVh.cb(this.a0, str, str2, null, false, null, false, 60);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        MarketAnalyticsParams b;
        bnn0 bnn0Var = this.e0.r;
        yfc yfcVar = (yfc) this.S.b;
        if (yfcVar == null || (b = yfcVar.b()) == null || (mobileOfficialAppsCoreNavStat$EventScreen = b.c) == null) {
            if (bnn0Var instanceof vyh0) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH;
            } else if (bnn0Var instanceof alj) {
                String string = yfcVar != null ? yfcVar.a.getString("KEY_SECTION_ID") : null;
                mobileOfficialAppsCoreNavStat$EventScreen = string == null ? MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_MAIN : string.equals("category") ? MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SEARCH : MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_SECTION;
            } else {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.MARKETPLACE_MAIN;
            }
        }
        uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            s();
            return;
        }
        if (i != R.id.search_suggestion) {
            this.m.b.b.c(false);
            return;
        }
        UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion != null) {
            SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
            u0(searchSuggestion.c, searchSuggestion.f, false);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
