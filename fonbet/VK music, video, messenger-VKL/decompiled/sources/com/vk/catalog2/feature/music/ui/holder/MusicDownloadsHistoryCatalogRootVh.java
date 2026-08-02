package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockShimmer;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockDownloadAll;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchViewVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.catalog2.feature.music.holders.MusicShimmerByLayoutIdVh;
import com.vk.core.view.AppBarShadowView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.lists.c;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.d1;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.p0;
import io.reactivex.rxjava3.internal.operators.observable.y0;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.asu0;
import xsna.bnn0;
import xsna.bpn0;
import xsna.c24;
import xsna.dml;
import xsna.e43;
import xsna.eg50;
import xsna.enh;
import xsna.f5z;
import xsna.g3a;
import xsna.grp0;
import xsna.gzs;
import xsna.ji3;
import xsna.k840;
import xsna.kco;
import xsna.kea;
import xsna.l9;
import xsna.lkz;
import xsna.ltz;
import xsna.m7m;
import xsna.mhj0;
import xsna.mzp0;
import xsna.n0q0;
import xsna.n6f;
import xsna.nda;
import xsna.np3;
import xsna.nvg;
import xsna.o5a;
import xsna.oi40;
import xsna.onh0;
import xsna.pa;
import xsna.r7o;
import xsna.rda;
import xsna.ri40;
import xsna.rzp0;
import xsna.s3q0;
import xsna.sl30;
import xsna.swp;
import xsna.te0;
import xsna.tfc;
import xsna.tlo0;
import xsna.tq;
import xsna.tv9;
import xsna.txh0;
import xsna.tyh0;
import xsna.u4a;
import xsna.u6k;
import xsna.u7o;
import xsna.v7o;
import xsna.vd7;
import xsna.w11;
import xsna.w5h;
import xsna.w7o;
import xsna.x8m;
import xsna.xd40;
import xsna.xsw;
import xsna.yzt;
import xsna.z5;
import xsna.zl20;

/* compiled from: MusicDownloadsHistoryCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicDownloadsHistoryCatalogRootVh extends CatalogRootViewHolder implements rda, CatalogStatesViewHolder, n0q0, SwitchCatalogVh.b {
    public final ViewPagerVh A;
    public final mhj0 B;
    public final SearchResultsImplVh C;
    public final SwitchCatalogVh D;
    public final HidingToolbarVh E;
    public final tfc F;
    public final mzp0 G;
    public final /* synthetic */ u7o p;
    public final /* synthetic */ w7o q;
    public final /* synthetic */ kco r;
    public final /* synthetic */ r7o s;
    public final bpn0 t;
    public final g3a u;
    public final b v;
    public UIBlock w;
    public final VkTopBarVh x;
    public final MusicShimmerByLayoutIdVh y;
    public final CatalogSearchQueryViewHolder z;

    /* compiled from: MusicDownloadsHistoryCatalogRootVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            MusicDownloadsHistoryCatalogRootVh.i0((MusicDownloadsHistoryCatalogRootVh) this.receiver);
            return s3q0.a;
        }
    }

    public MusicDownloadsHistoryCatalogRootVh() {
        throw null;
    }

    public MusicDownloadsHistoryCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        this.p = new u7o(fragmentActivity);
        this.q = new w7o(fragmentActivity, k840.a.c(), k840.a.d(), k840.a.d());
        this.r = new kco(k840.a.d());
        this.s = new r7o();
        this.t = new bpn0(new l9(20));
        u4a u4aVar = this.m;
        this.u = u4aVar.b.s.S(u4aVar, bundle != null ? bundle.getString("key_url") : null);
        this.v = new b();
        VkTopBarVh vkTopBarVh = new VkTopBarVh(o5aVar, this.m.b.e, null, null, tq.h(tlo0.Companion, R.string.music_offline_downloads_history_title), null, null, null, 4076);
        this.x = vkTopBarVh;
        MusicShimmerByLayoutIdVh musicShimmerByLayoutIdVh = new MusicShimmerByLayoutIdVh(R.layout.catalog_music_downloads_history_search_shimmer);
        this.y = musicShimmerByLayoutIdVh;
        CatalogSearchQueryViewHolder vkSearchViewVh = MusicFeatures.AUDIO_VKUI_SEARCH.h() ? new VkSearchViewVh(R.string.music_hint_downloads_history_search, new txh0(null, null, null, null, null, null, 127), new grp0(true, true), new dml(new z5(this, 3), null, null, null, null, 0L, 62)) : new VkSearchQueryVh(new SearchQueryVh(R.string.music_hint_downloads_history_search, null, new te0(26), null, new dml(new w5h(this, 4), null, null, null, null, 0L, 62), 96), null, null, null, new c24(0), 766);
        this.z = vkSearchViewVh;
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.A = viewPagerVh;
        mhj0 mhj0Var = new mhj0(this.m.b.s.N());
        this.B = mhj0Var;
        u4a u4aVar2 = this.m;
        eg50 eg50Var = new eg50();
        u4a.a aVar = u4aVar2.b;
        u4a a2 = u4a.a(u4aVar2, u4a.a.a(aVar, null, null, null, null, null, new tyh0(aVar.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
        u4a.a aVar2 = a2.b;
        CatalogConfiguration catalogConfiguration = aVar2.s;
        kea keaVar = new kea(mhj0Var, catalogConfiguration.K(a2), a2, new vd7(aVar2.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        SearchResultsImplVh searchResultsImplVh = new SearchResultsImplVh(mhj0Var, keaVar, new VerticalListVh(catalogConfiguration, new c.h((c.m) keaVar), keaVar, a2, N(), false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 864), null, null, null, null, new SearchResultsVh.a(false, 125), null, 376);
        this.C = searchResultsImplVh;
        SwitchCatalogVh switchCatalogVh = new SwitchCatalogVh(viewPagerVh, searchResultsImplVh, new MusicCatalogErrorRedesignedStateScrollableVh(this, new xsw(this, 11), null, null, 12), new ProgressVh((Object) null), this, 0, this, null, false, false, null, 1952);
        this.D = switchCatalogVh;
        this.E = new HidingToolbarVh(this.m.b.e, e43.l(vkTopBarVh, musicShimmerByLayoutIdVh, vkSearchViewVh), switchCatalogVh, null);
        this.F = new tfc(m7m.f(this));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.G = rzp0.d(this.h);
    }

    public static final void i0(MusicDownloadsHistoryCatalogRootVh musicDownloadsHistoryCatalogRootVh) {
        io.reactivex.rxjava3.disposables.c cVar;
        Object obj;
        musicDownloadsHistoryCatalogRootVh.getClass();
        enh enhVar = new enh(musicDownloadsHistoryCatalogRootVh, 29);
        w7o w7oVar = musicDownloadsHistoryCatalogRootVh.q;
        Iterator<T> it = w7oVar.c.z().iterator();
        while (true) {
            cVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Playlist) obj).b == -1) {
                    break;
                }
            }
        }
        Playlist playlist = (Playlist) obj;
        if (playlist == null || !(playlist.H instanceof DownloadingState.Downloading)) {
            y l = new p0(new y0(new d1(new v7o(new Ref$IntRef(), w7oVar))), new w11(new x8m(2), 15)).E0().l(new pa(new u6k(w7oVar, 4), 16));
            asu0 asu0Var = asu0.a;
            cVar = l.q(asu0Var.c()).m(asu0Var.d()).subscribe(new ji3(new nvg(w7oVar, 14), 27), new np3(new n6f(enhVar, 15), 21));
        }
        if (cVar != null) {
            musicDownloadsHistoryCatalogRootVh.v.b(cVar);
        }
    }

    public static UIBlockDownloadAll j0(UIBlock uIBlock) {
        ArrayList<UIBlockAction> arrayList;
        Object obj;
        UIBlockDownloadAll uIBlockDownloadAll;
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null && (uIBlockDownloadAll = uIBlockList.P) != null) {
            return uIBlockDownloadAll;
        }
        UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
        if (uIBlockCatalog == null || (arrayList = uIBlockCatalog.F) == null) {
            return null;
        }
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof UIBlockDownloadAll) {
                break;
            }
        }
        return (UIBlockDownloadAll) (obj instanceof UIBlockDownloadAll ? obj : null);
    }

    public static Playlist k0(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Playlist) obj).b == -1) {
                break;
            }
        }
        Playlist playlist = (Playlist) obj;
        if ((playlist != null ? playlist.H : null) instanceof DownloadingState.Downloading) {
            return playlist;
        }
        return null;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.D.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList<UIBlock> arrayList;
        boolean z = false;
        mzp0 mzp0Var = this.G;
        if (mzp0Var != null) {
            UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
            mzp0Var.c(uIBlockCatalog != null && uIBlockCatalog.E);
        }
        this.E.N6(uIBlock);
        if (uIBlock instanceof UIBlockCatalog) {
            this.F.c();
            Playlist k0 = k0(((ri40) this.t.getValue()).z());
            ArrayList<UIBlock> arrayList2 = ((UIBlockCatalog) uIBlock).A;
            if (arrayList2.size() == 1) {
                uIBlock = arrayList2.get(0);
            }
            this.w = uIBlock;
            UIBlockDownloadAll j0 = j0(uIBlock);
            if (j0 != null) {
                j0.z = k0 != null;
            }
            UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
            if (uIBlockList != null && (arrayList = uIBlockList.y) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!(((UIBlock) it.next()) instanceof UIBlockShimmer)) {
                            break;
                        }
                    }
                }
                z = true;
            }
            UIBlockActionSearchMode uIBlockActionSearchMode = uIBlockList != null ? uIBlockList.I : null;
            CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.z;
            MusicShimmerByLayoutIdVh musicShimmerByLayoutIdVh = this.y;
            if (uIBlockActionSearchMode != null) {
                String str = uIBlockActionSearchMode.z;
                mhj0 mhj0Var = this.B;
                mhj0Var.p = str;
                mhj0Var.q = uIBlockActionSearchMode.c;
                if (z) {
                    musicShimmerByLayoutIdVh.show();
                    catalogSearchQueryViewHolder.hide();
                } else {
                    musicShimmerByLayoutIdVh.hide();
                    catalogSearchQueryViewHolder.show();
                }
            } else {
                catalogSearchQueryViewHolder.hide();
                musicShimmerByLayoutIdVh.hide();
            }
            if (!z) {
                this.x.N6(uIBlock);
            }
            if (mzp0Var != null) {
                mzp0Var.d(null);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        HidingToolbarVh hidingToolbarVh = this.E;
        View k5 = hidingToolbarVh.k5(layoutInflater, viewGroup, null);
        k5.post(new tv9(this, 5));
        hidingToolbarVh.a(true);
        AppBarShadowView appBarShadowView = hidingToolbarVh.g;
        if (appBarShadowView != null) {
            appBarShadowView.setVisibility(4);
        }
        CatalogSearchQueryViewHolder catalogSearchQueryViewHolder = this.z;
        ModernSearchView pi = catalogSearchQueryViewHolder.pi();
        if (pi != null) {
            pi.setVoiceIsAvailable(false);
        }
        catalogSearchQueryViewHolder.hide();
        this.y.hide();
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.E.L();
        this.u.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.D.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.D.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.F.d();
        this.v.e();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.F.e();
        io.reactivex.rxjava3.disposables.c subscribe = this.m.b.e.a().b0(VkTopBarVh.b.class).subscribe(new lkz(new xd40(this, 1), 5));
        b bVar = this.v;
        bVar.b(subscribe);
        j1 U = ((ri40) this.t.getValue()).w().U(new yzt(new oi40(this, 0), 8));
        asu0 asu0Var = asu0.a;
        bVar.b(U.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new sl30(new zl20(this, 6), 3)));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.G;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.E.d(true, true);
        this.A.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
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
