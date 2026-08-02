package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsWithTabsVh;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHidingToolbarVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.core.view.components.topbar.d;
import com.vk.dto.music.SearchSuggestion;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.navigation.VkMusicNavigationTab;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.music.view.vkmix.view.MusicMixAnimationView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.disposables.f;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.HashSet;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.Cnew;
import xsna.a550;
import xsna.ag20;
import xsna.alj;
import xsna.atm;
import xsna.b5a;
import xsna.bdn;
import xsna.bh5;
import xsna.bn40;
import xsna.bnn0;
import xsna.bpn0;
import xsna.btm;
import xsna.bwt0;
import xsna.c1a;
import xsna.c2y;
import xsna.cd40;
import xsna.cfp0;
import xsna.cqm0;
import xsna.cx00;
import xsna.d230;
import xsna.d5;
import xsna.d94;
import xsna.dcn;
import xsna.dd80;
import xsna.dhr0;
import xsna.dml;
import xsna.drh0;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.ef50;
import xsna.eiz;
import xsna.eoh;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fd4;
import xsna.fij0;
import xsna.fnj;
import xsna.fpf0;
import xsna.g3a;
import xsna.g950;
import xsna.gbj;
import xsna.gd40;
import xsna.gh1;
import xsna.gn40;
import xsna.gqg;
import xsna.grp0;
import xsna.gzs;
import xsna.h1j;
import xsna.hg1;
import xsna.hpj;
import xsna.hqh0;
import xsna.iah0;
import xsna.ie00;
import xsna.ikv0;
import xsna.itg0;
import xsna.iyx;
import xsna.iz3;
import xsna.izs;
import xsna.j4x;
import xsna.k130;
import xsna.k7m;
import xsna.k840;
import xsna.kca;
import xsna.l5m;
import xsna.l850;
import xsna.ld40;
import xsna.ln40;
import xsna.ltz;
import xsna.lyd;
import xsna.lz2;
import xsna.m1o;
import xsna.m3a;
import xsna.m3y;
import xsna.m7m;
import xsna.mba;
import xsna.msy;
import xsna.mzp0;
import xsna.mzt0;
import xsna.n0q0;
import xsna.ncb;
import xsna.nda;
import xsna.o25;
import xsna.o440;
import xsna.obh;
import xsna.od40;
import xsna.oek0;
import xsna.oqx0;
import xsna.p0r;
import xsna.pp00;
import xsna.pv2;
import xsna.pvh;
import xsna.qb8;
import xsna.r250;
import xsna.r6m;
import xsna.rda;
import xsna.rf20;
import xsna.rtg0;
import xsna.rzp0;
import xsna.s1m;
import xsna.s3q0;
import xsna.s750;
import xsna.sr80;
import xsna.swp;
import xsna.sx6;
import xsna.tfc;
import xsna.to2;
import xsna.txh0;
import xsna.u0a;
import xsna.u4a;
import xsna.u750;
import xsna.uha;
import xsna.utk0;
import xsna.uv20;
import xsna.v34;
import xsna.vsq;
import xsna.vtk0;
import xsna.vyh0;
import xsna.vza0;
import xsna.w8q;
import xsna.wnh;
import xsna.wq20;
import xsna.x2y;
import xsna.x4u;
import xsna.xis;
import xsna.yn40;
import xsna.yp70;
import xsna.z24;
import xsna.zda;
import xsna.zvj;

/* compiled from: MusicCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicCatalogRootVh extends CatalogRootViewHolder implements rda, View.OnTouchListener, SwitchCatalogVh.b, CatalogStatesViewHolder, n0q0, mzt0, zda {
    public final bpn0 A;
    public final hqh0 B;
    public final VkTopBarSearchQueryVh C;
    public final g3a D;
    public hpj E;
    public final utk0 F;
    public final VkTabLayoutVh G;
    public final Object H;
    public final SwitchCatalogVh I;
    public final MusicHidingToolbarVh J;
    public boolean K;
    public final sr80 L;
    public final gn40 M;
    public final ln40 N;
    public ef50 O;
    public io.reactivex.rxjava3.disposables.c P;
    public io.reactivex.rxjava3.disposables.c Q;
    public RecyclerView R;
    public final Object S;
    public final tfc T;
    public final mzp0 U;
    public final ld40 p;
    public final Object q;
    public final bpn0 r;
    public final vza0 s;
    public String t;
    public final u750 u;
    public final io.reactivex.rxjava3.disposables.b v;
    public boolean w;
    public final ViewPagerVh x;
    public final Object y;
    public final r250 z;

    /* compiled from: MusicCatalogRootVh.kt */
    public static final class a implements mba {
        public final /* synthetic */ CatalogRootViewHolder.a b;

        public a() {
            this.b = new CatalogRootViewHolder.a();
        }

        @Override // xsna.mba
        public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
            this.b.m(i, uIBlock, izsVar);
        }

        @Override // xsna.mba
        public final void q(int i, UIBlock uIBlock, Object obj) {
            this.b.q(i, uIBlock, obj);
        }

        @Override // xsna.mba
        public final void w(View view, UIBlock uIBlock, Object obj) {
            this.b.w(view, uIBlock, obj);
        }

        @Override // xsna.mba
        public final void z(int i, UIBlock uIBlock) {
            boolean z = uIBlock instanceof UIBlockActionSwitchSection;
            MusicCatalogRootVh musicCatalogRootVh = MusicCatalogRootVh.this;
            if (!z) {
                CatalogRootViewHolder b = musicCatalogRootVh.m.b.b.b();
                if (b != null) {
                    b.z(i, uIBlock);
                    return;
                }
                return;
            }
            UIBlockActionSwitchSection uIBlockActionSwitchSection = (UIBlockActionSwitchSection) uIBlock;
            if (musicCatalogRootVh.x.a(uIBlockActionSwitchSection.c)) {
                return;
            }
            String str = uIBlockActionSwitchSection.c;
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.AUDIO_MAIN_NAVIGATION_EVENTS.h(), null, "switch_section_id_not_found", null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262, 3, null);
            l5mVar.q();
            String str2 = uIBlockActionSwitchSection.D;
            if (str2 != null) {
                a550.b(lyd.g().z(), musicCatalogRootVh.b, o25.a().c(), 0, null, null, str2, null, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
            } else {
                u4a.a aVar = musicCatalogRootVh.m.b;
                nda.e(aVar.b, musicCatalogRootVh.b, aVar.s, uIBlockActionSwitchSection.c, uIBlockActionSwitchSection.z, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
            }
        }
    }

    /* compiled from: MusicCatalogRootVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((g950) this.receiver).b());
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class c implements izs<Object, Boolean> {
        public static final c b = new c();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof UiBlockInteractiveVkMix);
        }
    }

    public MusicCatalogRootVh() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicCatalogRootVh(FragmentActivity fragmentActivity, MusicCatalogFragment.a aVar, Bundle bundle, ld40 ld40Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) aVar, false, (f5z) null, 112);
        h1j h1jVar = ld40Var.e;
        this.p = ld40Var;
        pvh pvhVar = new pvh(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, pvhVar);
        this.r = new bpn0(new wnh(this, 28));
        this.s = new vza0(m7m.f(this), new z24(0, this, MusicCatalogRootVh.class, "getState", "getState()Lcom/vk/catalog2/common/ui/holders/container/SwitchCatalogVhState;", 0, 3));
        ncb ncbVar = new ncb(this, 9);
        s750 s750Var = k840.a.e;
        this.u = s750Var == null ? null : s750Var;
        this.v = new io.reactivex.rxjava3.disposables.b();
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, this, null, ncbVar, N(), null, null, 6526);
        this.x = viewPagerVh;
        kca kcaVar = new kca(new bpn0(new lz2(18)));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new atm(this, 23));
        this.y = a2;
        r250 r250Var = new r250(kcaVar);
        this.z = r250Var;
        this.A = new bpn0(new m1o(this, 24));
        hqh0 hqh0Var = new hqh0(bundle, this.m, m7m.f(this), N(), kcaVar, new btm(fragmentActivity, 24), h1jVar, new x2y(this, 14), r250Var, (yp70) a2.getValue(), new s1m(this, 27), new d94(0, this, MusicCatalogRootVh.class, "isObjectSearchHistoryEnabled", "isObjectSearchHistoryEnabled()Z", 0, 4));
        this.B = hqh0Var;
        txh0 txh0Var = new txh0(new gd40(this, 0), new gbj(this, 29), null, ld40Var.c, ld40Var.d, new Cnew(this, 10), 64);
        grp0 grp0Var = new grp0(hqh0Var.a().S(), hqh0Var.a().S());
        dml dmlVar = new dml(new bh5(hqh0Var, 11), null, new l850(hqh0Var, 8), new rtg0(hqh0Var, 2), new sx6(0, hqh0Var.a(), drh0.class, "onActionClearClicked", "onActionClearClicked()V", 0, 3), hqh0Var.a().V(), 2);
        cd40 cd40Var = ld40Var.b;
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = new VkTopBarSearchQueryVh(R.string.music_hint_search_short, dmlVar, grp0Var, txh0Var, VkTopBar.m.b.a, d.a, cd40Var, ((Boolean) cd40Var.get()).booleanValue() ? 0L : 100L, null, 640);
        hqh0Var.i = vkTopBarSearchQueryVh;
        this.C = vkTopBarSearchQueryVh;
        MusicCatalogErrorRedesignedStateScrollableVh musicCatalogErrorRedesignedStateScrollableVh = new MusicCatalogErrorRedesignedStateScrollableVh(this, new ag20(this, 4), new xis(this, 22), null, 8);
        u4a u4aVar = this.m;
        this.D = u4aVar.b.s.S(u4aVar, bundle != null ? bundle.getString("key_url") : null);
        this.F = vtk0.a(Boolean.FALSE);
        VkTabLayoutVh vkTabLayoutVh = new VkTabLayoutVh(viewPagerVh, R.layout.catalog_2_my_music_tab_layout, new p0r(this, 2), this.m.b.r, new uv20(this, 6), ld40Var.j);
        this.G = vkTabLayoutVh;
        ProgressVh progressVh = new ProgressVh((Object) null);
        this.H = msy.a(lazyThreadSafetyMode, new d5(14, fragmentActivity, this));
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh, hqh0Var.s, musicCatalogErrorRedesignedStateScrollableVh, progressVh, this, 0, this, null, false, false, null, 1952);
        hqh0Var.j = switchCatalogVh;
        this.I = switchCatalogVh;
        this.J = new MusicHidingToolbarVh(this.m.b.e, e43.l(vkTopBarSearchQueryVh, vkTabLayoutVh), switchCatalogVh, new fd4(this, 7), this.m.b.Q, h1jVar);
        this.L = new sr80(fragmentActivity);
        this.M = new gn40(fragmentActivity);
        this.N = new ln40(fragmentActivity, ((MusicPrefsComponent) ((k7m) m7m.f(this)).a(fpf0.a(MusicPrefsComponent.class))).Q0());
        a.m mVar = io.reactivex.rxjava3.internal.functions.a.b;
        this.P = new f(mVar);
        this.Q = new f(mVar);
        this.S = msy.a(lazyThreadSafetyMode, new iz3(13));
        this.T = new tfc(m7m.f(this));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.U = rzp0.d(bundle);
        this.m.b.r.b(new obh(this, 21));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.I.A(str);
    }

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        if (musicHidingToolbarVh == null) {
            musicHidingToolbarVh = null;
        }
        if (musicHidingToolbarVh != null) {
            musicHidingToolbarVh.r = dd80.f(uIBlockCatalog, new vsq(14)) == null;
            musicHidingToolbarVh.E.c();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final mba J() {
        return new a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.U;
        if (mzp0Var != null) {
            UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
            boolean z = false;
            if (uIBlockCatalog != null && uIBlockCatalog.E) {
                z = true;
            }
            mzp0Var.c(z);
        }
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        musicHidingToolbarVh.N6(uIBlock);
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null) {
            musicHidingToolbarVh.a(uIBlockList.J);
            this.t = uIBlock.b;
        }
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
        this.p.i.a();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.too0
    public final void Ng() {
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        if (musicHidingToolbarVh == null) {
            musicHidingToolbarVh = null;
        }
        if (musicHidingToolbarVh != null) {
            musicHidingToolbarVh.Ng();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return (uha) this.r.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.I.r instanceof vyh0) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
        }
        super.S(cfp0Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        if (!(this.I.r instanceof vyh0)) {
            return false;
        }
        i8(alj.a);
        this.C.g(false, false);
        this.B.r = "";
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        Context context;
        bdn bdnVar = bdn.a;
        this.E = zvj.a(ie00.a.U().plus(iyx.a()));
        u4a u4aVar = this.m;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        com.vk.catalog2.feature.music.configuration.b bVar = catalogConfiguration instanceof com.vk.catalog2.feature.music.configuration.b ? (com.vk.catalog2.feature.music.configuration.b) catalogConfiguration : null;
        if (bVar != null) {
            bVar.O = this.L;
            bVar.P = this.M;
            bVar.Q = this.N;
            bVar.R = this.z;
            bVar.S = this.w;
            bVar.h0 = new pp00(this, 8);
        }
        this.u.P();
        View k5 = this.J.k5(layoutInflater, viewGroup, null);
        boolean z = k5 instanceof ViewGroup;
        ld40 ld40Var = this.p;
        if (z) {
            this.O = new ef50((ViewGroup) k5, new b(0, ld40Var.h, g950.class, "hasMusicSubscription", "hasMusicSubscription()Z", 0));
        }
        int i = 4;
        k5.post(new gh1(this, i));
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.C;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            HashSet hashSet = iah0.a;
            if (fnj.b(context)) {
                vkTopBarSearchQueryVh.y8();
            }
        }
        hqh0 hqh0Var = this.B;
        CommonSearchResultsVh commonSearchResultsVh = hqh0Var.s;
        CommonSearchResultsVh commonSearchResultsVh2 = hqh0Var.s;
        commonSearchResultsVh.setOnTouchListener(this);
        vkTopBarSearchQueryVh.Kf(new x4u(this, 15));
        vkTopBarSearchQueryVh.Ml(R.drawable.vk_icon_newsfeed_music_note_outline_28, R.string.vk_talkback_music_feed_icon);
        io.reactivex.rxjava3.disposables.c subscribe = aVar2.E.a().subscribe(new m3y(new wq20(this, i), i));
        Activity activity = this.b;
        itg0.a(activity, subscribe);
        this.Q = subscribe;
        i8(ltz.a);
        if (!ld40Var.a) {
            vkTopBarSearchQueryVh.y8();
        }
        vkTopBarSearchQueryVh.sj(activity.getString(R.string.vk_music_toolbar_title));
        CatalogConfiguration catalogConfiguration2 = aVar2.s;
        com.vk.catalog2.feature.music.configuration.b bVar2 = catalogConfiguration2 instanceof com.vk.catalog2.feature.music.configuration.b ? (com.vk.catalog2.feature.music.configuration.b) catalogConfiguration2 : null;
        if (bVar2 != null) {
            bVar2.j0 = this;
        }
        String str = hqh0Var.q;
        if (str != null) {
            SearchInputMethod searchInputMethod = SearchInputMethod.Preset;
            hqh0Var.r = str;
            hqh0Var.a().T(str, searchInputMethod, null, null);
            hqh0Var.f.invoke(vyh0.a);
        }
        hqh0Var.a().Q();
        RecyclerPaginatedView ck = commonSearchResultsVh2.ck();
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = ck instanceof CatalogRecyclerPaginatedView ? (CatalogRecyclerPaginatedView) ck : null;
        if (catalogRecyclerPaginatedView != null) {
            catalogRecyclerPaginatedView.setCustomFooterLoadingAction(new gqg((byte) 0, i));
        }
        SearchFeatureResultsWithTabsVh searchFeatureResultsWithTabsVh = commonSearchResultsVh2 instanceof SearchFeatureResultsWithTabsVh ? (SearchFeatureResultsWithTabsVh) commonSearchResultsVh2 : null;
        if (searchFeatureResultsWithTabsVh != null && (view = searchFeatureResultsWithTabsVh.c) != null) {
            f4m.v(iah0.a(54.0f), view);
        }
        return k5;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.t = null;
        this.J.L();
        this.D.b();
        this.u.p0();
        u4a u4aVar = this.m;
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        com.vk.catalog2.feature.music.configuration.b bVar = catalogConfiguration instanceof com.vk.catalog2.feature.music.configuration.b ? (com.vk.catalog2.feature.music.configuration.b) catalogConfiguration : null;
        if (bVar != null) {
            bVar.O = null;
            if (((Boolean) bVar.J.getValue()).booleanValue()) {
                ((c1a) bVar.M.getValue()).e.b(null);
            }
        }
        u4aVar.b.r.b(new qb8(10));
        hpj hpjVar = this.E;
        if (hpjVar != null) {
            zvj.c(hpjVar, null);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.b(EmptyDisposable.INSTANCE, this.B.a().P(m3aVar));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        hqh0 hqh0Var = this.B;
        hqh0Var.getClass();
        io.reactivex.rxjava3.subjects.f<u0a> fVar = b5aVar.a;
        hg1.m3 m3Var = new hg1.m3();
        fVar.getClass();
        return new i0(new i0(fVar, m3Var), new v34(new d230(12), 28)).subscribe(new cx00(new o440(hqh0Var, 23), 22), new c2y(new eoh(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0, 3), 25));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.I.r;
    }

    public final boolean i0() {
        return epx.f(this.I.r, vyh0.a) && epx.f(this.B.r, "");
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        mzp0 mzp0Var;
        SwitchCatalogVh switchCatalogVh = this.I;
        bnn0 bnn0Var2 = switchCatalogVh.r;
        if (epx.f(bnn0Var2, bnn0Var)) {
            return;
        }
        if ((bnn0Var instanceof swp) && (mzp0Var = this.U) != null) {
            mzp0Var.f();
        }
        vyh0 vyh0Var = vyh0.a;
        this.J.a(bnn0Var.equals(vyh0Var) || this.K);
        switchCatalogVh.i8(bnn0Var);
        boolean equals = bnn0Var.equals(vyh0Var);
        hqh0 hqh0Var = this.B;
        if (!equals) {
            if (epx.f(bnn0Var2, vyh0Var)) {
                hqh0Var.s.onPause();
            }
        } else {
            hqh0Var.s.onResume();
            if (i0()) {
                ((yp70) this.y.getValue()).a(new rf20(this, 3));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        MusicHidingToolbarVh musicHidingToolbarVh2 = musicHidingToolbarVh != null ? musicHidingToolbarVh : null;
        if (musicHidingToolbarVh2 != null) {
            boolean z = bnn0Var instanceof alj;
            fd4 fd4Var = musicHidingToolbarVh2.m;
            if (musicHidingToolbarVh2.q != z && musicHidingToolbarVh2.L) {
                if (!z || musicHidingToolbarVh2.u) {
                    View e = musicHidingToolbarVh2.e();
                    if (e != null) {
                        bwt0.p0(e, false);
                    }
                    fd4Var.invoke(Boolean.FALSE, null);
                } else {
                    View e2 = musicHidingToolbarVh2.e();
                    if (e2 != null) {
                        bwt0.p0(e2, true);
                    }
                    if (musicHidingToolbarVh2.G) {
                        fd4Var.invoke(Boolean.TRUE, Float.valueOf(musicHidingToolbarVh2.p));
                    }
                }
            }
            musicHidingToolbarVh2.q = z;
        }
        boolean z2 = bnn0Var instanceof vyh0;
        u4a u4aVar = this.m;
        ld40 ld40Var = this.p;
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.C;
        if (z2) {
            this.B.l.b = MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC_SERVICE;
            SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
            if (!ld40Var.a) {
                vkTopBarSearchQueryVh.N2();
                vkTopBarSearchQueryVh.m();
                vkTopBarSearchQueryVh.c();
                vkTopBarSearchQueryVh.fi();
                vkTopBarSearchQueryVh.d();
            }
        } else {
            SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
            searchStatInfoProvider2.getClass();
            searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Disabled;
            if (!(bnn0Var instanceof ltz)) {
                vkTopBarSearchQueryVh.k3();
            }
            vkTopBarSearchQueryVh.Km(50L);
            if (((Boolean) ld40Var.b.get()).booleanValue()) {
                vkTopBarSearchQueryVh.l();
            } else {
                vkTopBarSearchQueryVh.c();
            }
            vkTopBarSearchQueryVh.Tk();
            vkTopBarSearchQueryVh.hc();
            vkTopBarSearchQueryVh.en();
            vkTopBarSearchQueryVh.j5();
            vkTopBarSearchQueryVh.y8();
            vkTopBarSearchQueryVh.Ll();
            vkTopBarSearchQueryVh.Km(0L);
            if (ld40Var.a) {
                vkTopBarSearchQueryVh.N2();
            }
        }
        if (bnn0Var instanceof swp) {
            vkTopBarSearchQueryVh.hide();
        } else {
            vkTopBarSearchQueryVh.show();
        }
        boolean z3 = this.I.r instanceof alj;
        VkTabLayoutVh vkTabLayoutVh = this.G;
        if (z3) {
            vkTabLayoutVh.show();
        } else {
            vkTabLayoutVh.hide();
        }
        this.s.j(bnn0Var);
        if (bnn0Var.equals(vyh0.a)) {
            AppBarShadowView appBarShadowView = musicHidingToolbarVh.g;
            if (appBarShadowView != null) {
                appBarShadowView.setVisibility(4);
            }
            musicHidingToolbarVh.d(true, true);
            musicHidingToolbarVh.c(false);
        } else {
            musicHidingToolbarVh.c(true);
        }
        g3a g3aVar = this.D;
        if (!z2) {
            g3aVar.e();
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = g3aVar.n;
        if (cVar != null) {
            cVar.dispose();
        }
        g3aVar.n = null;
    }

    public final void j0() {
        RecyclerView recyclerView = this.R;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.v()) : null;
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        MusicHidingToolbarVh musicHidingToolbarVh2 = musicHidingToolbarVh != null ? musicHidingToolbarVh : null;
        if (musicHidingToolbarVh2 != null) {
            boolean z = valueOf != null && valueOf.intValue() == 0;
            if (musicHidingToolbarVh2.G != z) {
                musicHidingToolbarVh2.G = z;
                musicHidingToolbarVh2.E.c();
            }
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.J.onConfigurationChanged(configuration);
        this.p.f.a();
        gn40 gn40Var = this.M;
        dcn dcnVar = gn40Var.c;
        if (dcnVar != null) {
            dcnVar.dismiss();
        }
        gn40Var.c = null;
        gn40Var.d = configuration.orientation != 2;
        VkTabLayoutVh vkTabLayoutVh = this.G;
        VkTabLayoutVh vkTabLayoutVh2 = vkTabLayoutVh != null ? vkTabLayoutVh : null;
        if (vkTabLayoutVh2 != null) {
            vkTabLayoutVh2.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        ViewGroup viewGroup;
        Context context;
        Activity h;
        Window window;
        MusicMixAnimationView musicMixAnimationView;
        yn40 yn40Var;
        this.P.dispose();
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        musicHidingToolbarVh.L = false;
        if (((Boolean) musicHidingToolbarVh.B.getValue()).booleanValue() && (musicMixAnimationView = musicHidingToolbarVh.H) != null && (yn40Var = musicMixAnimationView.b) != null) {
            yn40Var.g();
        }
        if (musicHidingToolbarVh.F && (viewGroup = musicHidingToolbarVh.K) != null && (context = viewGroup.getContext()) != null && (h = e3m.h(context)) != null && (window = h.getWindow()) != null) {
            oek0 oek0Var = new oek0(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            (i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var)).f(!dhr0.M());
            window.setStatusBarColor(dhr0.t.c(R.attr.vk_ui_header_background));
        }
        VkTabLayoutVh vkTabLayoutVh = this.G;
        vkTabLayoutVh.m = true;
        fij0 fij0Var = vkTabLayoutVh.k;
        if (fij0Var != null) {
            fij0Var.dismiss();
        }
        vkTabLayoutVh.b.onPause();
        this.v.e();
        if (epx.f(this.I.r, vyh0.a)) {
            this.B.s.onPause();
        }
        this.L.a();
        this.s.a(null);
        ef50 ef50Var = this.O;
        if (ef50Var != null) {
            ikv0 ikv0Var = ef50Var.e;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            ef50Var.e = null;
        }
        this.T.d();
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        MusicMixAnimationView musicMixAnimationView;
        yn40 yn40Var;
        if (!hg1.d(this.P)) {
            com.vk.core.utils.newtork.b.a.getClass();
            io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
            dVar.getClass();
            this.P = new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pv2(new j4x(this, 18), 29));
        }
        this.T.e();
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        musicHidingToolbarVh.L = true;
        if (((Boolean) musicHidingToolbarVh.B.getValue()).booleanValue() && (musicMixAnimationView = musicHidingToolbarVh.H) != null && (yn40Var = musicMixAnimationView.b) != null) {
            yn40Var.h();
        }
        MusicHidingToolbarVh.a aVar = musicHidingToolbarVh.x;
        if (!musicHidingToolbarVh.q || musicHidingToolbarVh.u) {
            View e = musicHidingToolbarVh.e();
            if (e != null) {
                bwt0.p0(e, false);
            }
            aVar.e();
        } else {
            View e2 = musicHidingToolbarVh.e();
            if (e2 != null) {
                bwt0.p0(e2, true);
            }
            aVar.f();
        }
        VkTabLayoutVh vkTabLayoutVh = this.G;
        vkTabLayoutVh.m = false;
        vkTabLayoutVh.b();
        vkTabLayoutVh.b.onResume();
        if (((Boolean) this.S.getValue()).booleanValue()) {
            musicHidingToolbarVh.d(true, false);
            ViewGroup viewGroup = musicHidingToolbarVh.K;
            if (viewGroup != null) {
                viewGroup.post(new to2(musicHidingToolbarVh, 10));
            }
        }
        if (epx.f(this.I.r, vyh0.a)) {
            this.B.s.onResume();
            if (i0()) {
                ((yp70) this.y.getValue()).a(new w8q(this, 24));
            }
        }
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            boolean i = r6m.i();
            sr80 sr80Var = this.L;
            if (i) {
                sr80Var.d = false;
                sr80Var.b.dispose();
                ikv0 ikv0Var = sr80Var.c;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                sr80Var.c = null;
                ef50 ef50Var = this.O;
                if (ef50Var != null) {
                    int i2 = ef50.g;
                    ef50Var.a(this.b, true);
                }
            } else {
                sr80Var.d = true;
                ef50 ef50Var2 = this.O;
                if (ef50Var2 != null) {
                    boolean z = !r6m.i() && ef50Var2.f;
                    if (z) {
                        ef50Var2.f = false;
                    }
                    if (z) {
                        this.D.d();
                    }
                }
            }
        }
        vza0 vza0Var = this.s;
        vza0Var.a(vza0Var.d.invoke(vza0Var.c.invoke()));
        io.reactivex.rxjava3.subjects.f<u0a> fVar = this.m.b.f.a;
        hg1.n2 n2Var = new hg1.n2();
        fVar.getClass();
        this.v.b(new i0(fVar, n2Var).U(new hg1.m2()).subscribe(new k130(new eiz(this, 13), 4)));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.J.d(true, true);
        bnn0 bnn0Var = this.I.r;
        if (bnn0Var instanceof vyh0) {
            this.B.s.s();
        } else if (bnn0Var instanceof alj) {
            this.x.s();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mzt0
    public final void u(UIBlock uIBlock) {
        com.vk.catalog2.feature.music.configuration.b bVar;
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return;
        }
        this.t = uIBlockList.b;
        ((od40) this.f.getValue()).a(((UIBlockList) uIBlock).c);
        String str = uIBlockList.M;
        u4a u4aVar = this.m;
        hqh0 hqh0Var = this.B;
        Activity activity = this.b;
        VkTopBarSearchQueryVh vkTopBarSearchQueryVh = this.C;
        if (str != null && drm0.D(str, VkMusicNavigationTab.KIDS.i(), false)) {
            this.w = true;
            vkTopBarSearchQueryVh.P1(activity.getString(R.string.music_hint_search_kids));
            CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint searchMusicEntrypoint = CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids;
            if (searchMusicEntrypoint != null) {
                hqh0Var.m = searchMusicEntrypoint;
            }
            hqh0Var.p.d = searchMusicEntrypoint;
            CatalogConfiguration catalogConfiguration = u4aVar.b.s;
            bVar = catalogConfiguration instanceof com.vk.catalog2.feature.music.configuration.b ? (com.vk.catalog2.feature.music.configuration.b) catalogConfiguration : null;
            if (bVar != null) {
                bVar.S = true;
            }
        } else if (this.w) {
            this.w = false;
            vkTopBarSearchQueryVh.P1(activity.getString(R.string.music_hint_search_short));
            CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint searchMusicEntrypoint2 = CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInService;
            if (searchMusicEntrypoint2 != null) {
                hqh0Var.m = searchMusicEntrypoint2;
            }
            hqh0Var.p.d = searchMusicEntrypoint2;
            CatalogConfiguration catalogConfiguration2 = u4aVar.b.s;
            bVar = catalogConfiguration2 instanceof com.vk.catalog2.feature.music.configuration.b ? (com.vk.catalog2.feature.music.configuration.b) catalogConfiguration2 : null;
            if (bVar != null) {
                bVar.S = false;
            }
        }
        this.K = uIBlockList.J;
        boolean z = uIBlockList.L;
        MusicHidingToolbarVh musicHidingToolbarVh = this.J;
        if (z != musicHidingToolbarVh.F) {
            musicHidingToolbarVh.F = z;
            musicHidingToolbarVh.E.c();
        }
        musicHidingToolbarVh.a(this.K);
        this.T.c();
        boolean z2 = this.I.r instanceof alj;
        VkTabLayoutVh vkTabLayoutVh = this.G;
        if (z2) {
            vkTabLayoutVh.show();
        } else {
            vkTabLayoutVh.hide();
        }
        this.s.u(uIBlockList);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.x.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        SearchSuggestion searchSuggestion;
        if (i == R.id.toolbar) {
            s();
            return;
        }
        if (i != R.id.search_suggestion) {
            if ((uIBlock != null ? uIBlock.e : null) == CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS) {
                this.C.Km(0L);
                return;
            } else {
                this.m.b.b.c(false);
                return;
            }
        }
        UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion == null || (searchSuggestion = uIBlockSearchSuggestion.y) == null) {
            return;
        }
        String str = searchSuggestion.c;
        hqh0 hqh0Var = this.B;
        if (hqh0Var.m != CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids) {
            hqh0Var.c.a(str);
        }
        String a2 = cqm0.a(searchSuggestion.f);
        SearchInputMethod searchInputMethod = SearchInputMethod.Suggest;
        String str2 = searchSuggestion.k;
        if (str2 == null) {
            str2 = "";
        }
        hqh0Var.r = str;
        hqh0Var.a().T(str, searchInputMethod, a2, str2);
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
