package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSearchMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.holders.HidingToolbarVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CounterBadgeTabLayoutViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.CatalogSearchQueryViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.lists.c;
import com.vk.music.fragment.impl.MusicMyAudiosCatalogFragment;
import com.vk.search.ui.api.SearchInputMethod;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.Cnew;
import xsna.aa6;
import xsna.alj;
import xsna.ap40;
import xsna.atm;
import xsna.awt0;
import xsna.b1z;
import xsna.bdn;
import xsna.bnn0;
import xsna.bpn0;
import xsna.c5g;
import xsna.ca6;
import xsna.cfp0;
import xsna.dml;
import xsna.dq80;
import xsna.drm0;
import xsna.eba;
import xsna.eg50;
import xsna.eiz;
import xsna.epx;
import xsna.f5z;
import xsna.fa6;
import xsna.g3a;
import xsna.gv2;
import xsna.gzv;
import xsna.h1j;
import xsna.hg1;
import xsna.hl30;
import xsna.hpj;
import xsna.iah0;
import xsna.ib50;
import xsna.ie00;
import xsna.j5g;
import xsna.j5n;
import xsna.jba;
import xsna.k130;
import xsna.k840;
import xsna.kea;
import xsna.ktf0;
import xsna.leq;
import xsna.ln20;
import xsna.ltz;
import xsna.m7m;
import xsna.msy;
import xsna.mzp0;
import xsna.mzt0;
import xsna.n0q0;
import xsna.n8b0;
import xsna.nda;
import xsna.od40;
import xsna.om9;
import xsna.onh0;
import xsna.pp00;
import xsna.put;
import xsna.pyz;
import xsna.q3a;
import xsna.r;
import xsna.r2v;
import xsna.r5v0;
import xsna.rda;
import xsna.ro40;
import xsna.ron0;
import xsna.rzp0;
import xsna.swp;
import xsna.tfc;
import xsna.tlo0;
import xsna.tts;
import xsna.tyh0;
import xsna.u4a;
import xsna.uha;
import xsna.uo40;
import xsna.v1v;
import xsna.vd7;
import xsna.vt30;
import xsna.vyh0;
import xsna.vza0;
import xsna.w110;
import xsna.w950;
import xsna.wda;
import xsna.x2y;
import xsna.x4u;
import xsna.zd40;
import xsna.zda;
import xsna.zos;
import xsna.zra;
import xsna.zvj;
import xsna.zyu;

/* compiled from: MusicMyAudiosCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicMyAudiosCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, SwitchCatalogVh.b, rda, wda, CatalogStatesViewHolder, zda, ap40, mzt0, n0q0 {
    public final vza0 A;
    public final SearchRequestFactory B;
    public final SearchResultsImplVh C;
    public final Object D;
    public final hpj E;
    public final Object F;
    public final zd40 G;
    public final dml H;
    public final g3a I;
    public UIBlockList J;
    public final bpn0 K;
    public final MusicCollectionType L;
    public final Object M;
    public final Object N;
    public final ViewPagerVh O;
    public final Object P;
    public final SwitchCatalogVh Q;
    public final Object R;
    public final Object S;
    public final SearchStatsLoggingInfo T;
    public final tfc U;
    public final mzp0 V;
    public final bpn0 p;
    public String q;
    public String r;
    public final b s;
    public String t;
    public boolean u;
    public boolean v;
    public final Playlist w;
    public ro40 x;
    public boolean y;
    public boolean z;

    /* compiled from: MusicMyAudiosCatalogRootVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EditorMode.values().length];
            try {
                iArr[EditorMode.ENTER_EDITOR_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EditorMode.EXIT_EDITOR_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EditorMode.EXIT_EDITOR_MODE_DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MusicCollectionType.values().length];
            try {
                iArr2[MusicCollectionType.AUDIOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MusicCollectionType.PLAYLISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MusicCollectionType.ALBUMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MusicMyAudiosCatalogRootVh() {
        throw null;
    }

    public MusicMyAudiosCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, MusicMyAudiosCatalogFragment.b bVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) bVar, false, (f5z) null, 112);
        SearchResultsImplVh searchResultsImplVh;
        bpn0 bpn0Var = new bpn0(new vt30(bundle, 3));
        this.p = bpn0Var;
        this.s = new b();
        this.t = "";
        this.w = new Playlist(-1, null, 0, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, false, 0, 0, 0L, null, null, null, null, null, false, false, false, null, null, null, 0, false, null, null, false, null, ((Boolean) bpn0Var.getValue()).booleanValue() ? 1 : 0, -2, 127, null);
        this.A = new vza0(m7m.f(this), new put(0, this, MusicMyAudiosCatalogRootVh.class, "getState", "getState()Lcom/vk/catalog2/common/ui/holders/container/SwitchCatalogVhState;", 0, 1));
        eg50 eg50Var = new eg50();
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        eba ebaVar = catalogConfiguration instanceof eba ? (eba) catalogConfiguration : null;
        jba c = ebaVar != null ? ebaVar.c() : null;
        this.B = c;
        if (c != null) {
            u4a u4aVar = this.m;
            u4a.a aVar = u4aVar.b;
            u4a a2 = u4a.a(u4aVar, u4a.a.a(aVar, null, null, null, null, null, new tyh0(aVar.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
            u4a.a aVar2 = a2.b;
            CatalogConfiguration catalogConfiguration2 = aVar2.s;
            jba jbaVar = c;
            kea keaVar = new kea(jbaVar, catalogConfiguration2.K(a2), a2, new vd7(aVar2.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
            searchResultsImplVh = new SearchResultsImplVh(jbaVar, keaVar, new VerticalListVh(catalogConfiguration2, new c.h((c.m) keaVar), keaVar, a2, N(), false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 864), null, null, null, null, new SearchResultsVh.a(false, 125), null, 376);
        } else {
            searchResultsImplVh = null;
        }
        this.C = searchResultsImplVh;
        atm atmVar = new atm(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, atmVar);
        bdn bdnVar = bdn.a;
        this.E = zvj.a(ie00.a);
        Lazy a3 = msy.a(lazyThreadSafetyMode, new pp00(this, 9));
        this.F = a3;
        this.G = new zd40(this.m.b.f, (w950) a3.getValue(), new ln20(this, 2), 4);
        this.H = new dml(new om9(this, 7), null, null, null, null, 0L, 62);
        u4a u4aVar2 = this.m;
        g3a S = u4aVar2.b.s.S(u4aVar2, null);
        this.I = S;
        MusicCatalogErrorRedesignedStateScrollableVh musicCatalogErrorRedesignedStateScrollableVh = new MusicCatalogErrorRedesignedStateScrollableVh(this, new fa6(0, S, g3a.class, "reload", "reload()V", 0, 3), null, null, 12);
        int i = 16;
        this.K = new bpn0(new r(16));
        MusicCollectionType.a aVar3 = MusicCollectionType.Companion;
        String string = bundle != null ? bundle.getString("type") : null;
        aVar3.getClass();
        this.L = MusicCollectionType.a.a(string);
        this.M = msy.a(lazyThreadSafetyMode, new gzv(this, 17));
        this.N = msy.a(lazyThreadSafetyMode, new x4u(this, i));
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, true, null, false, this, null, null, N(), null, null, 7036);
        this.O = viewPagerVh;
        this.P = msy.a(lazyThreadSafetyMode, new Cnew(this, 12));
        this.Q = new SwitchCatalogVh(viewPagerVh, searchResultsImplVh, musicCatalogErrorRedesignedStateScrollableVh, null, this, R.layout.catalog_frame_layout_with_scrolling, null, null, false, false, null, 1992);
        this.R = msy.a(lazyThreadSafetyMode, new h1j(this, 28));
        this.S = msy.a(lazyThreadSafetyMode, new b1z(this, 8));
        SearchStatsLoggingInfo searchStatsLoggingInfo = bundle != null ? (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info") : null;
        this.T = searchStatsLoggingInfo;
        this.U = new tfc(m7m.f(this));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.V = rzp0.d(bundle);
        if (searchStatsLoggingInfo != null) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
            this.m.b.m.a = true;
        }
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.Q.A(str);
    }

    @Override // xsna.ap40
    public final void E() {
        String str = this.q;
        if (str != null) {
            this.m.b.e.b(new zra(EditorMode.ENTER_EDITOR_MODE, str), false);
        }
        l0().d(true);
    }

    @Override // xsna.ap40
    public final void F() {
        this.m.b.e.b(new ktf0(this.L.l()), false);
    }

    @Override // xsna.ap40
    public final void G() {
        u4a u4aVar = this.m;
        u4aVar.b.e.b(new ktf0(this.L.l()), false);
        String str = this.q;
        if (str != null) {
            u4aVar.b.e.b(new ktf0(str), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockCatalog) {
            mzp0 mzp0Var = this.V;
            if (mzp0Var != null) {
                mzp0Var.c(((UIBlockCatalog) uIBlock).E);
            }
            n0().N6(uIBlock);
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            Object a0 = j5g.a0(uIBlockCatalog.A);
            UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
            if (uIBlockList == null) {
                return;
            }
            i0(uIBlockList);
            this.q = uIBlockCatalog.D;
            ro40 ro40Var = this.x;
            if (ro40Var != null) {
                ro40Var.f.add(this);
            }
            ro40 ro40Var2 = this.x;
            if (ro40Var2 != null && ro40Var2.j) {
                d();
            }
            if (mzp0Var != null) {
                mzp0Var.d(null);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return this.G;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.T != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, true, null, 16);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean T(boolean z) {
        if (this.t.length() > 0) {
            o0().zf("", false);
            return true;
        }
        if (l0().a0()) {
            return true;
        }
        return super.T(z);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = n0().k5(layoutInflater, viewGroup, null);
        o0().y8();
        o0().hide();
        TopBarVh l0 = l0();
        tlo0.a aVar = tlo0.Companion;
        boolean booleanValue = ((Boolean) this.p.getValue()).booleanValue();
        MusicCollectionType musicCollectionType = this.L;
        int n = (booleanValue && musicCollectionType == MusicCollectionType.AUDIOS) ? R.string.music_title_my_audios_kids : musicCollectionType.n();
        aVar.getClass();
        l0.setTitle(new tlo0.f(n));
        this.Q.i8(ltz.a);
        k5.post(new gv2(this, 10));
        n0().a(true);
        k0().a(true);
        int i = a.$EnumSwitchMapping$1[musicCollectionType.ordinal()];
        b bVar = this.s;
        if (i == 1) {
            r5v0 r5v0Var = k840.a.h;
            if (r5v0Var == null) {
                r5v0Var = null;
            }
            bVar.b(new i0(new i0(r5v0Var.a.a.b0(ib50.class), new r2v(new zos(9), 7)), new hl30(new pyz(8), 3)).subscribe(new tts(new x2y(this, 17), 16)));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            r5v0 r5v0Var2 = k840.a.h;
            if (r5v0Var2 == null) {
                r5v0Var2 = null;
            }
            bVar.b(new i0(new i0(r5v0Var2.a.a.b0(n8b0.class), new aa6(new leq(19), 28)), new ca6(new j5n(14), 26)).subscribe(new k130(new eiz(this, 14), 5)));
        }
        u4a u4aVar = this.m;
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        uo40 uo40Var = catalogConfiguration instanceof uo40 ? (uo40) catalogConfiguration : null;
        if (uo40Var != null) {
            uo40Var.R = this;
        }
        ViewGroup viewGroup2 = k5 instanceof ViewGroup ? (ViewGroup) k5 : null;
        if (viewGroup2 != null) {
            this.x = new ro40(this.b, viewGroup2, u4aVar, this.L, this.w);
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        zvj.c(this.E, null);
        this.Q.L();
        this.I.b();
        this.s.e();
        ro40 ro40Var = this.x;
        if (ro40Var != null) {
            ro40Var.f.clear();
            ro40Var.g.e();
        }
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        uo40 uo40Var = catalogConfiguration instanceof uo40 ? (uo40) catalogConfiguration : null;
        if (uo40Var != null) {
            uo40Var.R = null;
        }
    }

    @Override // xsna.wda
    public final boolean c0() {
        return true;
    }

    @Override // xsna.ap40
    public final void d() {
        j0().C6();
    }

    @Override // xsna.wda
    public final void d0(String str, String str2, SearchInputMethod searchInputMethod) {
        o0().zf(str, false);
        this.H.getClass();
        SearchResultsImplVh searchResultsImplVh = this.C;
        if (searchResultsImplVh != null) {
            SearchResultsVh.cb(searchResultsImplVh, str, str2, null, false, null, false, 60);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.Q.r;
    }

    @Override // xsna.ap40
    public final void h() {
        j0().C6();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c h0(q3a q3aVar) {
        return hg1.c(q3aVar.a(), zra.class, dq80.class, ron0.class).subscribe(new zyu(new w110(this, 8), 8));
    }

    public final void i0(UIBlockList uIBlockList) {
        ro40 ro40Var;
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode = uIBlockList.C;
        UIBlockActionShowFilters uIBlockActionShowFilters = uIBlockList.B;
        UIBlockActionSearchMode uIBlockActionSearchMode = uIBlockList.I;
        this.y = (uIBlockActionEnterEditMode == null && uIBlockActionSearchMode == null && uIBlockActionShowFilters == null) ? false : true;
        this.z = uIBlockActionSearchMode != null;
        boolean booleanValue = ((Boolean) this.K.getValue()).booleanValue();
        MusicCollectionType musicCollectionType = this.L;
        if (booleanValue && musicCollectionType == MusicCollectionType.AUDIOS) {
            UIBlockList zb = uIBlockList.zb();
            zb.y.clear();
            this.J = zb;
        }
        l0().N6(uIBlockList);
        TopBarVh l0 = l0();
        tlo0.a aVar = tlo0.Companion;
        int n = (((Boolean) this.p.getValue()).booleanValue() && musicCollectionType == MusicCollectionType.AUDIOS) ? R.string.music_title_my_audios_kids : musicCollectionType.n();
        aVar.getClass();
        l0.setTitle(new tlo0.f(n));
        if (uIBlockActionSearchMode != null) {
            String str = uIBlockActionSearchMode.A;
            if (str != null) {
                o0().P1(str);
            }
            CatalogSearchQueryViewHolder o0 = o0();
            if (o0 instanceof VkSearchQueryVh) {
                VkSearchQueryVh vkSearchQueryVh = (VkSearchQueryVh) o0;
                vkSearchQueryVh.b(iah0.a(4));
                View view = vkSearchQueryVh.r;
                if (view != null) {
                    awt0.x(view, 0, 0, 0, 0, 11);
                }
            }
            o0.show();
            SearchRequestFactory searchRequestFactory = this.B;
            jba jbaVar = searchRequestFactory instanceof jba ? (jba) searchRequestFactory : null;
            if (jbaVar != null) {
                jbaVar.r = uIBlockActionSearchMode.c;
            }
        }
        if (!this.z) {
            o0().hide();
        }
        if (uIBlockActionShowFilters == null || (ro40Var = this.x) == null) {
            return;
        }
        ro40Var.m = uIBlockActionShowFilters.A;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.Q.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        CounterBadgeTabLayoutViewHolder j0 = j0();
        if ((bnn0Var instanceof alj) || (bnn0Var instanceof vyh0)) {
            j0.show();
        } else {
            j0.hide();
        }
        this.A.j(bnn0Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CounterBadgeTabLayoutViewHolder j0() {
        return (CounterBadgeTabLayoutViewHolder) this.P.getValue();
    }

    @Override // xsna.zda
    public final void k(UIBlock uIBlock) {
        Object obj;
        Object obj2;
        boolean z;
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList != null) {
            String str = uIBlockList.b;
            this.U.c();
            boolean z2 = true;
            if (epx.f(str, this.L.l())) {
                if (uIBlockList.y.isEmpty()) {
                    return;
                }
                Object a0 = j5g.a0(uIBlockList.y);
                UIBlockPlaceholder uIBlockPlaceholder = a0 instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) a0 : null;
                if (!epx.f(uIBlockPlaceholder != null ? uIBlockPlaceholder.z : null, "synthetic_offline_my_audios_placeholder_id")) {
                    Object a02 = j5g.a0(uIBlockList.y);
                    UIBlockPlaceholder uIBlockPlaceholder2 = a02 instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) a02 : null;
                    if (!epx.f(uIBlockPlaceholder2 != null ? uIBlockPlaceholder2.b : null, "synthetic_offline_subs_placeholder")) {
                        z = true;
                        if (epx.f(this.r, str) || this.u == z) {
                            this.u = z;
                        } else {
                            this.u = z;
                            q0(this.t);
                        }
                    }
                }
                z = false;
                if (epx.f(this.r, str)) {
                }
                this.u = z;
            }
            UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
            if (epx.f(uIBlockList2.b, this.q)) {
                if (uIBlockList2.C == null && uIBlockList2.I == null && uIBlockList2.B == null) {
                    z2 = false;
                }
                if (z2 != this.y) {
                    i0(uIBlockList2);
                }
            }
            ro40 ro40Var = this.x;
            if (ro40Var != null) {
                UIBlock uIBlock2 = (UIBlock) j5g.k0(uIBlockList.y);
                String str2 = uIBlock2 != null ? uIBlock2.b : null;
                if (str2 != null && ro40Var.d != MusicCollectionType.AUDIOS) {
                    Iterator<T> it = ro40Var.m.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (epx.f(j5g.k0(drm0.c0(((CatalogFilterData) obj).b, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)), str2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
                    if (catalogFilterData != null && !catalogFilterData.e) {
                        List<CatalogFilterData> list = ro40Var.m;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (CatalogFilterData catalogFilterData2 : list) {
                            boolean f = epx.f(catalogFilterData.b, catalogFilterData2.b);
                            StringBuilder b = v1v.b(str2, '/');
                            b.append((String) j5g.k0(drm0.c0(catalogFilterData2.b, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6)));
                            arrayList.add(CatalogFilterData.zb(catalogFilterData2, b.toString(), null, f, 502));
                        }
                        ro40Var.m = arrayList;
                    }
                    Iterator it2 = ro40Var.l.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (epx.f(((CatalogFilterData) obj2).b, str2)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    CatalogFilterData catalogFilterData3 = (CatalogFilterData) obj2;
                    if (catalogFilterData3 != null && !catalogFilterData3.e) {
                        ArrayList arrayList2 = ro40Var.l;
                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            CatalogFilterData catalogFilterData4 = (CatalogFilterData) it3.next();
                            arrayList3.add(CatalogFilterData.zb(catalogFilterData4, null, null, epx.f(catalogFilterData3.b, catalogFilterData4.b), 503));
                        }
                        ro40Var.l = arrayList3;
                    }
                }
            }
            ro40 ro40Var2 = this.x;
            if (ro40Var2 == null || ro40Var2.j) {
                return;
            }
            j0().D5(uIBlockList);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final HidingToolbarVh k0() {
        return (HidingToolbarVh) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final TopBarVh l0() {
        return (TopBarVh) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final HidingToolbarVh n0() {
        return (HidingToolbarVh) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final CatalogSearchQueryViewHolder o0() {
        return (CatalogSearchQueryViewHolder) this.N.getValue();
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q.onConfigurationChanged(configuration);
        HidingToolbarVh n0 = n0();
        if (n0 == null) {
            n0 = null;
        }
        if (n0 != null) {
            n0.onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.U.d();
        this.A.a(null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.U.e();
        vza0 vza0Var = this.A;
        vza0Var.a(vza0Var.d.invoke(vza0Var.c.invoke()));
    }

    public final void p0(String str) {
        SwitchCatalogVh switchCatalogVh = this.Q;
        bnn0 bnn0Var = switchCatalogVh.r;
        boolean z = bnn0Var instanceof vyh0;
        SearchResultsImplVh searchResultsImplVh = this.C;
        ViewPagerVh viewPagerVh = this.O;
        if (!z) {
            if (!(bnn0Var instanceof alj) || str.length() <= 0 || str.equals("0")) {
                return;
            }
            j0().d5();
            switchCatalogVh.i8(vyh0.a);
            if (searchResultsImplVh != null) {
                SearchResultsVh.cb(searchResultsImplVh, str, null, null, false, null, false, 60);
            }
            DisableableViewPager disableableViewPager = viewPagerVh.o;
            (disableableViewPager != null ? disableableViewPager : null).setTouchEnabled(false);
            return;
        }
        if (str.length() == 0 || str.equals("0")) {
            j0().m7();
            switchCatalogVh.i8(alj.a);
            DisableableViewPager disableableViewPager2 = viewPagerVh.o;
            (disableableViewPager2 != null ? disableableViewPager2 : null).setTouchEnabled(true);
            return;
        }
        j0().d5();
        if (searchResultsImplVh != null) {
            SearchResultsVh.cb(searchResultsImplVh, str, null, null, false, null, false, 60);
        }
        DisableableViewPager disableableViewPager3 = viewPagerVh.o;
        (disableableViewPager3 != null ? disableableViewPager3 : null).setTouchEnabled(false);
    }

    public final void q0(String str) {
        u4a u4aVar = this.m;
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        eba ebaVar = catalogConfiguration instanceof eba ? (eba) catalogConfiguration : null;
        boolean z = false;
        if (ebaVar != null ? ebaVar.a(str) : false) {
            u4aVar.b.e.b(new ktf0(this.L.l()), false);
        }
        if (this.u) {
            o0().show();
        } else {
            o0().hide();
        }
        boolean z2 = str.length() == 0;
        ViewPagerVh viewPagerVh = this.O;
        if (!z2) {
            j0().d5();
            SearchResultsImplVh searchResultsImplVh = this.C;
            if (searchResultsImplVh != null) {
                SearchResultsVh.cb(searchResultsImplVh, str, null, null, false, null, false, 60);
            }
            DisableableViewPager disableableViewPager = viewPagerVh.o;
            (disableableViewPager != null ? disableableViewPager : null).setTouchEnabled(false);
            return;
        }
        ro40 ro40Var = this.x;
        if (ro40Var != null && !ro40Var.j) {
            z = true;
        }
        if (z) {
            j0().m7();
        }
        this.Q.i8(alj.a);
        DisableableViewPager disableableViewPager2 = viewPagerVh.o;
        (disableableViewPager2 != null ? disableableViewPager2 : null).setTouchEnabled(true);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.V;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.O.s();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mzt0
    public final void u(UIBlock uIBlock) {
        String str;
        SwitchCatalogVh switchCatalogVh = this.Q;
        boolean z = switchCatalogVh.r instanceof vyh0;
        MusicCollectionType musicCollectionType = this.L;
        if (z) {
            switchCatalogVh.i8(alj.a);
            ro40 ro40Var = this.x;
            if (((ro40Var != null && !ro40Var.j) || !epx.f(this.r, musicCollectionType.l())) && (str = this.r) != null) {
                j0().gc(str);
            }
        }
        this.r = uIBlock != null ? uIBlock.b : null;
        ((od40) this.f.getValue()).a(this.r);
        if ((uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null) == null) {
            return;
        }
        if (epx.f(this.r, musicCollectionType.l())) {
            q0(this.t);
        } else if (this.z) {
            o0().show();
            p0(this.t);
        } else {
            o0().hide();
        }
        this.A.u(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        if (((Boolean) this.K.getValue()).booleanValue()) {
            this.O.y(uiTrackingScreen);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        this.m.b.b.c(false);
    }

    @Override // xsna.zda
    public final void H(UIBlockCatalog uIBlockCatalog) {
    }

    @Override // xsna.zda
    public final void I(Throwable th) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
