package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.EmptyScreenWithTextVh;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkCatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsWithTabsVh;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.view.AppBarShadowView;
import com.vk.movika.tools.controls.seekbar.i;
import com.vk.music.fragment.impl.MusicOfflineCatalogFragment;
import com.vk.music.offline.api.model.storage.StorageEvent;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.afs;
import xsna.alj;
import xsna.b010;
import xsna.b0y;
import xsna.bnn0;
import xsna.bq40;
import xsna.by20;
import xsna.c8;
import xsna.cc20;
import xsna.d4;
import xsna.d4r;
import xsna.dml;
import xsna.dn20;
import xsna.e43;
import xsna.e8;
import xsna.ebx;
import xsna.eiy;
import xsna.el30;
import xsna.epx;
import xsna.f2s;
import xsna.f5z;
import xsna.fa00;
import xsna.fi40;
import xsna.g3a;
import xsna.g950;
import xsna.gi40;
import xsna.grp0;
import xsna.gvs;
import xsna.gzs;
import xsna.ha40;
import xsna.hg1;
import xsna.hwg0;
import xsna.i3u;
import xsna.i7p0;
import xsna.ib50;
import xsna.ikv0;
import xsna.itg0;
import xsna.j0r;
import xsna.j5g;
import xsna.jsv;
import xsna.k840;
import xsna.k850;
import xsna.kk1;
import xsna.kwg0;
import xsna.m330;
import xsna.m7m;
import xsna.msy;
import xsna.mzp0;
import xsna.n0q0;
import xsna.n8b0;
import xsna.nda;
import xsna.nf0;
import xsna.o7y;
import xsna.oe50;
import xsna.oq;
import xsna.pa;
import xsna.pg;
import xsna.put;
import xsna.pyz;
import xsna.q3a;
import xsna.qey;
import xsna.qq40;
import xsna.r5v0;
import xsna.rda;
import xsna.re40;
import xsna.rq40;
import xsna.rzp0;
import xsna.st1;
import xsna.syq;
import xsna.tfc;
import xsna.tlo0;
import xsna.tp1;
import xsna.tt1;
import xsna.txh0;
import xsna.u3u;
import xsna.u4a;
import xsna.ugm;
import xsna.utk0;
import xsna.vtk0;
import xsna.vyh0;
import xsna.w7p0;
import xsna.wnh;
import xsna.xpt;
import xsna.y6c;

/* compiled from: MusicOfflineCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicOfflineCatalogRootVh extends CatalogRootViewHolder implements rda, CatalogStatesViewHolder, n0q0, SwitchCatalogVh.b {
    public final g3a A;
    public final a B;
    public final String C;
    public final VkTopBarVh D;
    public final Object E;
    public final CatalogSearchQueryViewHolder F;
    public final rq40 G;
    public final ViewPagerVh H;
    public final ViewPagerVh I;
    public final VkTabLayoutVh J;
    public final SwitchCatalogVh K;
    public final HidingToolbarVh L;
    public final tfc M;
    public final mzp0 N;
    public final boolean p;
    public final k850 q;
    public final g950 r;
    public ikv0 s;
    public c t;
    public final b u;
    public final b v;
    public c w;
    public final utk0 x;
    public final Object y;
    public final g3a z;

    /* compiled from: MusicOfflineCatalogRootVh.kt */
    public interface a {
        boolean a(String str);
    }

    public MusicOfflineCatalogRootVh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicOfflineCatalogRootVh(FragmentActivity fragmentActivity, MusicOfflineCatalogFragment.b bVar, Bundle bundle, gzs gzsVar, MusicOfflineCatalogFragment.c cVar, MusicOfflineCatalogFragment.d dVar, boolean z, k850 k850Var, g950 g950Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) bVar, false, (f5z) null, 112);
        MusicOfflineCatalogRootVh musicOfflineCatalogRootVh;
        CatalogSearchQueryViewHolder vkSearchQueryVh;
        CatalogSearchQueryViewHolder vkSearchViewVh;
        this.p = z;
        this.q = k850Var;
        this.r = g950Var;
        this.u = new b();
        this.v = new b();
        this.x = vtk0.a(Boolean.FALSE);
        kk1 kk1Var = new kk1(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = msy.a(lazyThreadSafetyMode, kk1Var);
        u4a u4aVar = this.m;
        this.z = u4aVar.b.s.S(u4aVar, null);
        u4a u4aVar2 = this.m;
        g3a S = u4aVar2.b.s.S(u4aVar2, "key_offline_search");
        this.A = S;
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        this.B = catalogConfiguration instanceof a ? (a) catalogConfiguration : null;
        String string = fragmentActivity.getString(R.string.vk_offline_music_toolbar_title);
        this.C = string;
        q3a q3aVar = this.m.b.e;
        tlo0.h d = oq.d(tlo0.Companion, string);
        i7p0 i7p0Var = new i7p0(null, cVar, dVar, null, 9);
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        VkTopBarVh vkTopBarVh = new VkTopBarVh(bVar, q3aVar, i7p0Var, new w7p0(z, gzsVar, com.vk.core.compose.component.semantics.b.a(mode, new pyz(9), 2), com.vk.core.compose.component.semantics.b.a(mode, new qey(10), 2), null, null, null, null, null, 32542), d, null, null, null, 4064);
        this.D = vkTopBarVh;
        this.E = msy.a(lazyThreadSafetyMode, new b010(this, 9));
        int i = 1;
        if (j0()) {
            vkSearchViewVh = new VkTopBarSearchQueryVh(R.string.music_hint_downloads_search, new dml(new pg(this, 6), null, null, null, null, 0L, 62), new grp0(true, true), new txh0(new put(0, this, MusicOfflineCatalogRootVh.class, "onBackIconClicked", "onBackIconClicked()Z", 0, 2), null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, 0L, null, 1008);
            musicOfflineCatalogRootVh = this;
        } else {
            boolean h = MusicFeatures.AUDIO_VKUI_SEARCH.h();
            int i2 = R.string.music_hint_search;
            if (!h) {
                musicOfflineCatalogRootVh = this;
                vkSearchQueryVh = new VkSearchQueryVh(new SearchQueryVh(musicOfflineCatalogRootVh.j0() ? R.string.music_hint_downloads_search : i2, new re40(musicOfflineCatalogRootVh, 1), new d4(24), null, new dml(new i(musicOfflineCatalogRootVh, 9), null, null, null, null, 0L, 62), 96), null, null, null, new by20(musicOfflineCatalogRootVh, 7), 766);
                musicOfflineCatalogRootVh.F = vkSearchQueryVh;
                musicOfflineCatalogRootVh.G = new rq40(!(vkSearchQueryVh instanceof VkCatalogSearchQueryViewHolder) ? (VkCatalogSearchQueryViewHolder) vkSearchQueryVh : null, z);
                ViewPagerVh viewPagerVh = new ViewPagerVh(musicOfflineCatalogRootVh.m, false, null, false, null, null, null, musicOfflineCatalogRootVh.N(), null, null, 7166);
                musicOfflineCatalogRootVh.H = viewPagerVh;
                ViewPagerVh viewPagerVh2 = new ViewPagerVh(musicOfflineCatalogRootVh.m, false, null, false, null, null, null, musicOfflineCatalogRootVh.N(), null, null, 7166);
                musicOfflineCatalogRootVh.I = viewPagerVh2;
                MusicCatalogErrorRedesignedStateScrollableVh musicCatalogErrorRedesignedStateScrollableVh = new MusicCatalogErrorRedesignedStateScrollableVh(musicOfflineCatalogRootVh, new wnh(musicOfflineCatalogRootVh, 29), null, null, 12);
                ProgressVh progressVh = new ProgressVh((Object) null);
                VkTabLayoutVh vkTabLayoutVh = new VkTabLayoutVh(viewPagerVh2, R.layout.catalog2_my_music_tab_layout_collapsed, new syq(musicOfflineCatalogRootVh, i), musicOfflineCatalogRootVh.m.b.r, new f2s(musicOfflineCatalogRootVh, 29), null);
                musicOfflineCatalogRootVh.J = vkTabLayoutVh;
                SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh, new SearchFeatureResultsWithTabsVh(new TabsOrListVh(musicOfflineCatalogRootVh.m, null, 0, null, false, S, musicOfflineCatalogRootVh.N(), viewPagerVh2, vkTabLayoutVh, new EmptyScreenWithTextVh(), false, null, 131260)), musicCatalogErrorRedesignedStateScrollableVh, progressVh, this, 0, this, null, false, false, null, 1952);
                this.K = switchCatalogVh;
                this.L = new HidingToolbarVh(this.m.b.e, !j0() ? Collections.singletonList(vkSearchQueryVh) : k840.a.i.c() ? e43.l(vkTopBarVh, vkSearchQueryVh) : Collections.singletonList(vkTopBarVh), !j0() ? switchCatalogVh : viewPagerVh, null);
                this.M = new tfc(m7m.f(this));
                LruCache<UUID, mzp0> lruCache = rzp0.a;
                this.N = rzp0.d(this.h);
            }
            musicOfflineCatalogRootVh = this;
            vkSearchViewVh = new VkSearchViewVh(R.string.music_hint_search, new txh0(new bq40(0, musicOfflineCatalogRootVh, MusicOfflineCatalogRootVh.class, "onBackPressed", "onBackPressed(Z)Z", 0), null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), new grp0(true, true), new dml(new y6c(musicOfflineCatalogRootVh, 8), null, null, null, null, 0L, 62));
        }
        vkSearchQueryVh = vkSearchViewVh;
        musicOfflineCatalogRootVh.F = vkSearchQueryVh;
        musicOfflineCatalogRootVh.G = new rq40(!(vkSearchQueryVh instanceof VkCatalogSearchQueryViewHolder) ? (VkCatalogSearchQueryViewHolder) vkSearchQueryVh : null, z);
        ViewPagerVh viewPagerVh3 = new ViewPagerVh(musicOfflineCatalogRootVh.m, false, null, false, null, null, null, musicOfflineCatalogRootVh.N(), null, null, 7166);
        musicOfflineCatalogRootVh.H = viewPagerVh3;
        ViewPagerVh viewPagerVh22 = new ViewPagerVh(musicOfflineCatalogRootVh.m, false, null, false, null, null, null, musicOfflineCatalogRootVh.N(), null, null, 7166);
        musicOfflineCatalogRootVh.I = viewPagerVh22;
        MusicCatalogErrorRedesignedStateScrollableVh musicCatalogErrorRedesignedStateScrollableVh2 = new MusicCatalogErrorRedesignedStateScrollableVh(musicOfflineCatalogRootVh, new wnh(musicOfflineCatalogRootVh, 29), null, null, 12);
        ProgressVh progressVh2 = new ProgressVh((Object) null);
        VkTabLayoutVh vkTabLayoutVh2 = new VkTabLayoutVh(viewPagerVh22, R.layout.catalog2_my_music_tab_layout_collapsed, new syq(musicOfflineCatalogRootVh, i), musicOfflineCatalogRootVh.m.b.r, new f2s(musicOfflineCatalogRootVh, 29), null);
        musicOfflineCatalogRootVh.J = vkTabLayoutVh2;
        SwitchCatalogVh switchCatalogVh2 = new SwitchCatalogVh(viewPagerVh3, new SearchFeatureResultsWithTabsVh(new TabsOrListVh(musicOfflineCatalogRootVh.m, null, 0, null, false, S, musicOfflineCatalogRootVh.N(), viewPagerVh22, vkTabLayoutVh2, new EmptyScreenWithTextVh(), false, null, 131260)), musicCatalogErrorRedesignedStateScrollableVh2, progressVh2, this, 0, this, null, false, false, null, 1952);
        this.K = switchCatalogVh2;
        this.L = new HidingToolbarVh(this.m.b.e, !j0() ? Collections.singletonList(vkSearchQueryVh) : k840.a.i.c() ? e43.l(vkTopBarVh, vkSearchQueryVh) : Collections.singletonList(vkTopBarVh), !j0() ? switchCatalogVh2 : viewPagerVh3, null);
        this.M = new tfc(m7m.f(this));
        LruCache<UUID, mzp0> lruCache2 = rzp0.a;
        this.N = rzp0.d(this.h);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return j0() && (this.K.r instanceof vyh0);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.N;
        if (mzp0Var != null) {
            UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
            boolean z = false;
            if (uIBlockCatalog != null && uIBlockCatalog.E) {
                z = true;
            }
            mzp0Var.c(z);
        }
        this.M.c();
        l0(uIBlock);
        this.L.N6(uIBlock);
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        if (!j0() || !epx.f(this.F.c9(), Boolean.TRUE)) {
            return false;
        }
        k0();
        return true;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        HidingToolbarVh hidingToolbarVh = this.L;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        int i = 8;
        k5.post(new nf0(this, 8));
        if (this.h.getBoolean("key_include_offline_mode")) {
            hidingToolbarVh.a(true);
            AppBarShadowView appBarShadowView = hidingToolbarVh.g;
            if (appBarShadowView != null) {
                appBarShadowView.setVisibility(4);
            }
        } else {
            this.F.y8();
        }
        this.w = itg0.m(this.q.d(this.b, StorageEvent.SD_CARD_REMOVED));
        if (j0()) {
            n0();
            Context context = layoutInflater.getContext();
            r5v0 r5v0Var = k840.a.h;
            if (r5v0Var == null) {
                r5v0Var = null;
            }
            m1 a0 = hg1.c(r5v0Var.a.a, fi40.class, gi40.class, tt1.class, st1.class).y(1L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            eiy eiyVar = new eiy(new com.vk.movika.sdk.base.logic.interactor.i(21, this, context), 6);
            int i2 = kwg0.a;
            c subscribe = a0.subscribe(eiyVar, new hwg0());
            b bVar = this.v;
            bVar.b(subscribe);
            r5v0 r5v0Var2 = k840.a.h;
            if (r5v0Var2 == null) {
                r5v0Var2 = null;
            }
            bVar.b(new i0(r5v0Var2.a.a.b0(ib50.class), new tp1(new gvs(13), 19)).subscribe(new m330(new ebx(this, 11), 3), new hwg0()));
            r5v0 r5v0Var3 = k840.a.h;
            bVar.b(new i0((r5v0Var3 != null ? r5v0Var3 : null).a.a.b0(ib50.class), new pa(new xpt(8), 29)).subscribe(new afs(new u3u(this, 12), i), new hwg0()));
            Iterator<T> it = i0().iterator();
            while (it.hasNext()) {
                bVar.b((c) it.next());
            }
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.v.dispose();
        c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
        this.L.L();
        this.z.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.K.r;
    }

    public final List<c> i0() {
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        int i = 11;
        i0 i0Var = new i0(new i0(r5v0Var.a.a.b0(ib50.class), new c8(new j0r(11), 22)), new e8(new ha40(1), 23));
        o7y o7yVar = new o7y(new fa00(this, 7), 5);
        int i2 = kwg0.a;
        c subscribe = i0Var.subscribe(o7yVar, new hwg0());
        r5v0 r5v0Var2 = k840.a.h;
        if (r5v0Var2 == null) {
            r5v0Var2 = null;
        }
        c subscribe2 = new i0(r5v0Var2.a.a.b0(n8b0.class), new i3u(new d4r(14), 5)).subscribe(new b0y(new el30(this, 4), i), new hwg0());
        r5v0 r5v0Var3 = k840.a.h;
        return e43.l(subscribe, subscribe2, (r5v0Var3 != null ? r5v0Var3 : null).a.a.b0(oe50.class).subscribe(new cc20(new ugm(this, 27), 6), new hwg0()));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.K.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof vyh0;
        VkTabLayoutVh vkTabLayoutVh = this.J;
        if (z) {
            vkTabLayoutVh.show();
        } else {
            vkTabLayoutVh.hide();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean j0() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    public final boolean k0() {
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.F;
        if (!epx.f(catalogSearchQueryViewHolder.c9(), Boolean.TRUE)) {
            return T(false);
        }
        i8(alj.a);
        catalogSearchQueryViewHolder.k3();
        n0();
        return true;
    }

    public final void l0(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockCatalog) {
            l0((UIBlock) j5g.Y(((UIBlockCatalog) uIBlock).A));
            return;
        }
        if (uIBlock instanceof UIBlockList) {
            CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.F;
            boolean z = catalogSearchQueryViewHolder.i().length() == 0;
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            int size = uIBlockList.y.size();
            rq40 rq40Var = this.G;
            VkTopBarVh vkTopBarVh = this.D;
            HidingToolbarVh hidingToolbarVh = this.L;
            if (size != 1 || !z) {
                hidingToolbarVh.a(j0() || this.r.c());
                if (j0()) {
                    AppBarShadowView appBarShadowView = hidingToolbarVh.g;
                    if (appBarShadowView != null) {
                        appBarShadowView.setVisibility(4);
                    }
                    VkCatalogSearchQueryViewHolder vkCatalogSearchQueryViewHolder = rq40Var.a;
                    if (vkCatalogSearchQueryViewHolder != null) {
                        vkCatalogSearchQueryViewHolder.en();
                        vkCatalogSearchQueryViewHolder.Tk();
                        vkCatalogSearchQueryViewHolder.j5();
                    }
                    rq40Var.c = true;
                }
                if (this.h.getBoolean("key_include_offline_mode") && !j0()) {
                    vkTopBarVh.hide();
                }
                catalogSearchQueryViewHolder.show();
                return;
            }
            boolean z2 = ((UIBlock) j5g.Y(uIBlockList.y)).d == CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BIG;
            hidingToolbarVh.a(z2);
            if (!j0()) {
                vkTopBarVh.show();
                catalogSearchQueryViewHolder.hide();
                return;
            }
            boolean z3 = !z2;
            VkCatalogSearchQueryViewHolder vkCatalogSearchQueryViewHolder2 = rq40Var.a;
            if (vkCatalogSearchQueryViewHolder2 != null) {
                if (z2) {
                    vkCatalogSearchQueryViewHolder2.r9();
                    vkCatalogSearchQueryViewHolder2.fi();
                    vkCatalogSearchQueryViewHolder2.xi();
                } else {
                    vkCatalogSearchQueryViewHolder2.en();
                    vkCatalogSearchQueryViewHolder2.Tk();
                    vkCatalogSearchQueryViewHolder2.j5();
                }
            }
            rq40Var.c = z3;
        }
    }

    public final void n0() {
        rq40 rq40Var = this.G;
        VkCatalogSearchQueryViewHolder vkCatalogSearchQueryViewHolder = rq40Var.a;
        if (vkCatalogSearchQueryViewHolder != null) {
            vkCatalogSearchQueryViewHolder.Ml(R.drawable.vk_icon_settings_outline_28, R.string.vk_talkback_music_downloads_setting);
            vkCatalogSearchQueryViewHolder.Tk();
            vkCatalogSearchQueryViewHolder.hc();
            boolean z = rq40Var.c;
            VkCatalogSearchQueryViewHolder vkCatalogSearchQueryViewHolder2 = rq40Var.a;
            if (vkCatalogSearchQueryViewHolder2 != null) {
                if (z) {
                    vkCatalogSearchQueryViewHolder2.en();
                    vkCatalogSearchQueryViewHolder2.Tk();
                    vkCatalogSearchQueryViewHolder2.j5();
                } else {
                    vkCatalogSearchQueryViewHolder2.r9();
                    vkCatalogSearchQueryViewHolder2.fi();
                    vkCatalogSearchQueryViewHolder2.xi();
                }
            }
            vkCatalogSearchQueryViewHolder.sj(this.C);
            if (rq40Var.b) {
                vkCatalogSearchQueryViewHolder.N2();
            }
            vkCatalogSearchQueryViewHolder.Ll();
            vkCatalogSearchQueryViewHolder.Km(0L);
            vkCatalogSearchQueryViewHolder.Kf(new qq40(this.b, 0));
            vkCatalogSearchQueryViewHolder.show();
        }
        this.J.hide();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.u.e();
        this.M.d();
        c cVar = this.t;
        if (cVar != null) {
            cVar.dispose();
        }
        this.t = null;
        ikv0 ikv0Var = this.s;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.s = null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        if (!j0()) {
            Iterator<T> it = i0().iterator();
            while (it.hasNext()) {
                this.u.b((c) it.next());
            }
        }
        this.M.e();
        if (((Boolean) this.y.getValue()).booleanValue()) {
            this.L.d(true, false);
        }
        if (this.h.getBoolean("key_include_offline_mode")) {
            c cVar = this.t;
            if (cVar == null || cVar.h()) {
                com.vk.core.utils.newtork.b.a.getClass();
                d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
                dVar.getClass();
                this.t = new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jsv(new dn20(this, 6), 6));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.N;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
    }

    @Override // xsna.rda
    public final void s() {
        this.L.d(true, true);
        this.H.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
