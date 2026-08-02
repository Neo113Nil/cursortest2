package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.PaginatedGridListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.music.SearchSuggestion;
import com.vk.lists.c;
import com.vk.movika.sdk.base.model.e;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.t0;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.Collections;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.utils.Logger;
import xsna.a72;
import xsna.acd;
import xsna.alj;
import xsna.b3;
import xsna.b5a;
import xsna.b9q0;
import xsna.bcd;
import xsna.bn40;
import xsna.bnn0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.cmg;
import xsna.cqm0;
import xsna.dg;
import xsna.dhr0;
import xsna.dml;
import xsna.drm0;
import xsna.e6a;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fnj;
import xsna.fpf0;
import xsna.g3a;
import xsna.gzs;
import xsna.iah0;
import xsna.im0;
import xsna.izs;
import xsna.j7;
import xsna.jb5;
import xsna.jsh0;
import xsna.k7;
import xsna.kca;
import xsna.kea;
import xsna.l3a;
import xsna.l7s;
import xsna.ltz;
import xsna.m3a;
import xsna.mg;
import xsna.msy;
import xsna.n0q0;
import xsna.na;
import xsna.nda;
import xsna.o5a;
import xsna.pf;
import xsna.pp3;
import xsna.ra0;
import xsna.rda;
import xsna.s3q0;
import xsna.sa0;
import xsna.swp;
import xsna.t4a;
import xsna.tf1;
import xsna.trh0;
import xsna.u0a;
import xsna.u4a;
import xsna.urh0;
import xsna.vbd;
import xsna.vd7;
import xsna.vrh0;
import xsna.vs;
import xsna.vyh0;
import xsna.wbd;
import xsna.x0a;
import xsna.xbd;
import xsna.xhu0;
import xsna.xm1;
import xsna.y50;
import xsna.ybd;
import xsna.zmc;
import xsna.zqh0;

/* compiled from: ClipSearchRootVh.kt */
/* loaded from: classes16.dex */
public final class ClipSearchRootVh extends CatalogRootViewHolder implements rda, SwitchCatalogVh.b, CatalogStatesViewHolder, n0q0, View.OnTouchListener {
    public final g3a A;
    public final ClipDiscoverVh B;
    public final Object C;
    public final SwitchCatalogVh D;
    public final HidingToolbarVh E;
    public ViewGroup F;
    public PaginatedGridListVh G;
    public final zmc H;
    public final xm1 p;
    public final c q;
    public final bcd r;
    public final bpn0 s;
    public final String t;
    public final kca u;
    public String v;
    public String w;
    public final ViewPagerVh x;
    public final CommonSearchResultsVh y;
    public final VkSearchQueryVh z;

    /* compiled from: ClipSearchRootVh.kt */
    public final class b implements c {
        public final Object a;
        public cmg b;
        public final Object c;
        public boolean d;

        /* compiled from: ClipSearchRootVh.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((zqh0) this.receiver).c();
                return s3q0.a;
            }
        }

        /* compiled from: ClipSearchRootVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C0497b extends FunctionReferenceImpl implements izs<l3a, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(l3a l3aVar) {
                ((jsh0) this.receiver).a(l3aVar);
                return s3q0.a;
            }
        }

        public b() {
            com.vk.movika.sdk.base.model.b bVar = new com.vk.movika.sdk.base.model.b(ClipSearchRootVh.this, 19);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.a = msy.a(lazyThreadSafetyMode, bVar);
            this.c = msy.a(lazyThreadSafetyMode, new e(ClipSearchRootVh.this, 16));
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void O(String str, SearchInputMethod searchInputMethod) {
            vrh0.a aVar;
            urh0 b = b();
            if (b.c || (aVar = b.b) == null) {
                return;
            }
            aVar.b(new SearchQuery(str, searchInputMethod, null, null, 12, null));
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final io.reactivex.rxjava3.disposables.c P(m3a m3aVar) {
            return ((f) m3aVar.b).subscribe(new tf1(new C0497b(1, new jsh0(a()), jsh0.class, "onCatalogClickEvent", "onCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 10));
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void Q() {
            ClipSearchRootVh clipSearchRootVh = ClipSearchRootVh.this;
            xm1 xm1Var = clipSearchRootVh.p;
            cmg cmgVar = this.b;
            if (cmgVar != null) {
                a().k(cmgVar, (f5z) xm1Var.invoke());
            }
            zqh0 a2 = a();
            urh0 b = b();
            b.getClass();
            a2.f(new trh0(b), (f5z) xm1Var.invoke());
            a().d(new com.vk.catalog2.common.ui.mvp.holder.clip.a(this, clipSearchRootVh), (f5z) xm1Var.invoke());
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void R(String str) {
            urh0 b = b();
            vrh0.a aVar = b.b;
            if (aVar != null) {
                aVar.c(b.a(str));
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final boolean S() {
            return false;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void T(String str, SearchInputMethod searchInputMethod, String str2, String str3) {
            SearchQuery searchQuery = new SearchQuery(str, searchInputMethod, str2, str3);
            b().b(searchQuery, false);
            a().e(searchQuery, b9q0.a.a);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void U(String str) {
            urh0 b = b();
            vrh0.a aVar = b.b;
            if (aVar != null) {
                aVar.e(b.a(str));
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final long V() {
            return 0L;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final CommonSearchResultsVh W(e6a e6aVar, vd7 vd7Var, CatalogConfiguration catalogConfiguration) {
            ClipSearchRootVh clipSearchRootVh = ClipSearchRootVh.this;
            kea keaVar = new kea(e6aVar, catalogConfiguration.K(clipSearchRootVh.m), clipSearchRootVh.m, vd7Var, false, null, null, false, null, null, null, new a(0, a(), zqh0.class, "notifyRequestFinished", "notifyRequestFinished()V", 0), null, false, null, 122720);
            PaginatedGridListVh i0 = ClipSearchRootVh.i0(clipSearchRootVh, keaVar, catalogConfiguration);
            clipSearchRootVh.G = i0;
            this.b = new cmg(keaVar, e6aVar, i0);
            return new SearchFeatureResultsVh(i0, catalogConfiguration);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final boolean X() {
            if (this.d) {
                return false;
            }
            a().a0();
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final zqh0 a() {
            return (zqh0) this.a.getValue();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final urh0 b() {
            return (urh0) this.c.getValue();
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void n() {
            vrh0.a aVar = b().b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* compiled from: ClipSearchRootVh.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public ClipSearchRootVh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipSearchRootVh(FragmentActivity fragmentActivity, o5a o5aVar, Bundle bundle, boolean z, xm1 xm1Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        this.p = xm1Var;
        SearchFeatures searchFeatures = SearchFeatures.HUB_CLIPS_SUGGESTER;
        searchFeatures.getClass();
        c bVar = com.vk.toggle.b.A.a(searchFeatures) ? new b() : new a();
        this.q = bVar;
        this.r = new bcd();
        bpn0 bpn0Var = new bpn0(new wbd(z, 0));
        this.s = bpn0Var;
        this.t = bundle != null ? bundle.getString("query") : null;
        kca kcaVar = new kca(new bpn0(new mg(6)));
        this.u = kcaVar;
        e6a e6aVar = new e6a(this.m.b.s.N(), kcaVar);
        e6aVar.s = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_CLIPS_SERVICE);
        this.v = "";
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, true, null, false, null, null, null, N(), null, null, 7164);
        this.x = viewPagerVh;
        u4a.a aVar = this.m.b;
        CommonSearchResultsVh W = bVar.W(e6aVar, new vd7(aVar.e), aVar.s);
        this.y = W;
        VkSearchQueryVh vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(R.string.clips_search_placeholder, new b3(this, 18), new acd(0, this, ClipSearchRootVh.class, "onVoiceSearchClicked", "onVoiceSearchClicked()V", 0, 0), null, new dml(new jb5(this, 2), null, new vs(this, 19), new com.vk.catalog2.common.ui.mvp.holder.clip.b(1, bVar, c.class, "onQueryActionSearchClicked", "onQueryActionSearchClicked(Ljava/lang/String;)V", 0), new com.vk.catalog2.common.ui.mvp.holder.clip.c(0, bVar, c.class, "onActionClearClicked", "onActionClearClicked()V", 0), bVar.V(), 2), bVar.S(), bVar.S()), null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        this.z = vkSearchQueryVh;
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new na(this, 21));
        u4a u4aVar = this.m;
        this.A = u4aVar.b.s.S(u4aVar, null);
        ProgressVh progressVh = new ProgressVh((Object) null);
        Bundle bundle2 = new Bundle(this.h);
        bundle2.remove("___CTLG_KEY_CLASS__");
        if (bundle2.containsKey("___CTLG_KEY_CLASS__")) {
            throw new IllegalStateException("Bundle already contains key: ___CTLG_KEY_CLASS__");
        }
        bundle2.putString("___CTLG_KEY_CLASS__", ClipDiscoverRootVh.class.getCanonicalName());
        xhu0 xhu0Var = t4a.a.a;
        ClipDiscoverVh clipDiscoverVh = new ClipDiscoverVh(null, u4a.a(this.m, (xhu0Var == null ? null : xhu0Var).a(bundle2, fpf0.a(ClipDiscoverRootVh.class).a().getCanonicalName())), N(), bundle, this);
        this.B = clipDiscoverVh;
        ViewPagerVh viewPagerVh2 = ((Boolean) bpn0Var.getValue()).booleanValue() ? clipDiscoverVh : viewPagerVh;
        this.C = viewPagerVh2;
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh2, W, errorStateVh, progressVh, this, 0, this, null, false, false, null, 1952);
        this.D = switchCatalogVh;
        this.E = new HidingToolbarVh(this.m.b.e, Collections.singletonList(vkSearchQueryVh), switchCatalogVh, null);
        this.H = new zmc(new x0a(new ra0(this, 22), new sa0(this, 23)), new im0(this, 18));
    }

    public static final PaginatedGridListVh i0(ClipSearchRootVh clipSearchRootVh, kea keaVar, CatalogConfiguration catalogConfiguration) {
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = new j7(clipSearchRootVh, 12);
        float f = 8;
        return new PaginatedGridListVh(catalogConfiguration, hVar, keaVar, clipSearchRootVh.m, new xbd(), new ybd(), clipSearchRootVh.N(), false, 0, new PaginatedGridListVh.a(null, new PaginatedGridListVh.e(iah0.a(f), iah0.a(f), 12), null, false, 59), null, 2944);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.D.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.E.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        this.r.getClass();
        bcd.a(cfp0Var);
        if (this.D.r instanceof vyh0) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        Context context2 = viewGroup != null ? viewGroup.getContext() : null;
        if (context2 != null) {
            dhr0.a.getClass();
            layoutInflater = layoutInflater.cloneInContext(new l7s(context2, dhr0.u().c));
        }
        HidingToolbarVh hidingToolbarVh = this.E;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        this.F = (ViewGroup) k5;
        k5.post(new a72(this, 6));
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                this.z.y8();
            }
        }
        this.y.setOnTouchListener(this);
        c cVar = this.q;
        String str = this.t;
        if (str != null) {
            SearchInputMethod searchInputMethod = SearchInputMethod.Preset;
            this.v = str;
            this.w = null;
            cVar.T(str, searchInputMethod, null, null);
            hidingToolbarVh.d(true, true);
            CatalogConfiguration catalogConfiguration = this.m.b.s;
            if ((catalogConfiguration instanceof vbd ? (vbd) catalogConfiguration : null) != null) {
                drm0.N(str);
            }
            i8(vyh0.a);
        }
        if (((Boolean) this.s.getValue()).booleanValue()) {
            i8(alj.a);
        } else {
            i8(vyh0.a);
            bwt0.n(k5, new com.vk.im.engine.internal.api_commands.messages.a(this, 16));
        }
        hidingToolbarVh.a(true);
        cVar.Q();
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.E.L();
        this.A.b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.b(EmptyDisposable.INSTANCE, this.q.P(m3aVar));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        f<u0a> fVar = b5aVar.a;
        k7 k7Var = new k7(new pf(13), 8);
        fVar.getClass();
        return new i0(fVar, k7Var).subscribe(new y50(new dg(this, 21), 14), new pp3(new d(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 8));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.D.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.D;
        if (epx.f(switchCatalogVh.r, bnn0Var)) {
            return;
        }
        vyh0 vyh0Var = vyh0.a;
        boolean equals = bnn0Var.equals(vyh0Var);
        HidingToolbarVh hidingToolbarVh = this.E;
        VkSearchQueryVh vkSearchQueryVh = this.z;
        CommonSearchResultsVh commonSearchResultsVh = this.y;
        if (equals) {
            commonSearchResultsVh.onResume();
            ImageView imageView = vkSearchQueryVh.m;
            if (imageView != null) {
                f4m.j(imageView);
            }
        } else if (bnn0Var.equals(alj.a)) {
            commonSearchResultsVh.onPause();
            hidingToolbarVh.d(true, false);
        } else {
            ImageView imageView2 = vkSearchQueryVh.m;
            if (imageView2 != null) {
                f4m.j(imageView2);
            }
            commonSearchResultsVh.onPause();
        }
        hidingToolbarVh.a(bnn0Var.equals(vyh0Var));
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof vyh0;
        VkSearchQueryVh vkSearchQueryVh = this.z;
        u4a u4aVar = this.m;
        if (z) {
            SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        } else {
            SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
            searchStatInfoProvider2.getClass();
            searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Disabled;
            ModernSearchView modernSearchView = vkSearchQueryVh.b.k;
            if (modernSearchView != null) {
                if (!(bnn0Var instanceof ltz)) {
                    modernSearchView.a();
                }
                modernSearchView.b(50L);
            }
        }
        if (bnn0Var instanceof swp) {
            vkSearchQueryVh.hide();
        } else {
            vkSearchQueryVh.c(false);
        }
    }

    public final boolean j0() {
        if (this.q.X()) {
            return true;
        }
        bnn0 bnn0Var = this.D.r;
        alj aljVar = alj.a;
        if (epx.f(bnn0Var, aljVar) || !((Boolean) this.s.getValue()).booleanValue()) {
            return this.m.b.b.c(false);
        }
        i8(aljVar);
        return true;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.E.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        if (epx.f(this.D.r, vyh0.a)) {
            return;
        }
        this.x.onResume();
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.u.a(this.v);
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        bnn0 bnn0Var = this.D.r;
        boolean z = bnn0Var instanceof vyh0;
        HidingToolbarVh hidingToolbarVh = this.E;
        if (z) {
            hidingToolbarVh.d(true, true);
            this.y.s();
        } else if (bnn0Var instanceof alj) {
            if (!((Boolean) this.s.getValue()).booleanValue()) {
                this.x.s();
            } else {
                hidingToolbarVh.d(true, true);
                this.B.s();
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        if (this.D.r instanceof vyh0) {
            return;
        }
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_DISCOVER;
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            s();
            return;
        }
        if (i != R.id.search_suggestion) {
            if (i != R.id.content) {
                j0();
                return;
            } else {
                if (uIBlock instanceof UIBlockVideo) {
                    SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIP;
                    String r = ((UIBlockVideo) uIBlock).B.r();
                    this.H.a(this.b, uIBlock, searchStatInfoProvider.b(type, r != null ? r : "", false));
                    return;
                }
                return;
            }
        }
        if (uIBlock instanceof UIBlockSearchSuggestion) {
            UIBlockSearchSuggestion uIBlockSearchSuggestion = (UIBlockSearchSuggestion) uIBlock;
            SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
            String str = searchSuggestion.c;
            String a2 = cqm0.a(searchSuggestion.f);
            SearchInputMethod searchInputMethod = SearchInputMethod.Suggest;
            String str2 = uIBlockSearchSuggestion.y.k;
            String str3 = str2 != null ? str2 : "";
            this.v = str;
            this.w = a2;
            this.q.T(str, searchInputMethod, a2, str3);
            this.E.d(true, true);
            CatalogConfiguration catalogConfiguration = this.m.b.s;
            if ((catalogConfiguration instanceof vbd ? (vbd) catalogConfiguration : null) != null) {
                drm0.N(str);
            }
        }
    }

    /* compiled from: ClipSearchRootVh.kt */
    public final class a implements c {
        public SearchResultsImplVh a;

        /* compiled from: ClipSearchRootVh.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0496a extends MutablePropertyReference0Impl {
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
            public final Object get() {
                return ((a) this.receiver).a;
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
            public final void set(Object obj) {
                ((a) this.receiver).a = (SearchResultsImplVh) obj;
            }
        }

        public a() {
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void O(String str, SearchInputMethod searchInputMethod) {
            SearchResultsImplVh searchResultsImplVh = this.a;
            if (searchResultsImplVh != null) {
                SearchResultsVh.cb(searchResultsImplVh, str, null, null, false, searchInputMethod, false, 44);
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final io.reactivex.rxjava3.disposables.c P(m3a m3aVar) {
            return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final boolean S() {
            return true;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void T(String str, SearchInputMethod searchInputMethod, String str2, String str3) {
            ClipSearchRootVh.this.z.zf(str, false);
            SearchResultsImplVh searchResultsImplVh = this.a;
            if (searchResultsImplVh != null) {
                SearchResultsVh.cb(searchResultsImplVh, str, str2, null, false, null, false, 60);
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void U(String str) {
            SearchResultsImplVh searchResultsImplVh = this.a;
            if (searchResultsImplVh != null) {
                SearchResultsVh.cb(searchResultsImplVh, str, ClipSearchRootVh.this.w, null, false, null, false, 60);
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final long V() {
            return 500L;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final CommonSearchResultsVh W(e6a e6aVar, vd7 vd7Var, CatalogConfiguration catalogConfiguration) {
            ClipSearchRootVh clipSearchRootVh = ClipSearchRootVh.this;
            kea keaVar = new kea(e6aVar, catalogConfiguration.K(clipSearchRootVh.m), clipSearchRootVh.m, vd7Var, false, null, null, false, null, null, null, null, null, false, null, 130912);
            PaginatedGridListVh i0 = ClipSearchRootVh.i0(clipSearchRootVh, keaVar, catalogConfiguration);
            clipSearchRootVh.G = i0;
            SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(e6aVar, keaVar, i0, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            new C0496a(this, a.class, "searchResultsImplVh", "getSearchResultsImplVh()Lcom/vk/catalog2/common/ui/mvp/holder/search/SearchResultsImplVh;", 0).set(searchResultsImplVh);
            return searchResultsImplVh;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final boolean X() {
            return false;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void Q() {
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void n() {
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh.c
        public final void R(String str) {
        }
    }

    /* compiled from: ClipSearchRootVh.kt */
    public interface c {
        default io.reactivex.rxjava3.disposables.c P(m3a m3aVar) {
            return new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
        }

        default boolean S() {
            return true;
        }

        void T(String str, SearchInputMethod searchInputMethod, String str2, String str3);

        default long V() {
            return 500L;
        }

        CommonSearchResultsVh W(e6a e6aVar, vd7 vd7Var, CatalogConfiguration catalogConfiguration);

        default boolean X() {
            return false;
        }

        default void Q() {
        }

        default void n() {
        }

        default void R(String str) {
        }

        default void U(String str) {
        }

        default void O(String str, SearchInputMethod searchInputMethod) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
