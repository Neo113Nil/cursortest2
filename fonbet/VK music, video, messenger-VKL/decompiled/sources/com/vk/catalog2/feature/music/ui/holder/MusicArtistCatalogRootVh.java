package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtist;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicArtistNew;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderNewVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.toggle.b;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;
import xsna.atm;
import xsna.bn40;
import xsna.bnn0;
import xsna.by20;
import xsna.c2u;
import xsna.ca40;
import xsna.cfp0;
import xsna.da40;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.g3a;
import xsna.iah0;
import xsna.iv1;
import xsna.izs;
import xsna.j3;
import xsna.j5g;
import xsna.kbj0;
import xsna.kg;
import xsna.kr6;
import xsna.kv2;
import xsna.ltz;
import xsna.m1o;
import xsna.m7m;
import xsna.msy;
import xsna.nda;
import xsna.nef;
import xsna.o5a;
import xsna.obh;
import xsna.pvh;
import xsna.q3a;
import xsna.qb8;
import xsna.rda;
import xsna.ry3;
import xsna.s3q0;
import xsna.swp;
import xsna.t8f0;
import xsna.tfc;
import xsna.tn9;
import xsna.too0;
import xsna.tts;
import xsna.u4a;
import xsna.uha;
import xsna.uk;
import xsna.ux00;
import xsna.w8q;
import xsna.w950;
import xsna.zd40;

/* compiled from: MusicArtistCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicArtistCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, rda, CatalogStatesViewHolder {
    public final Object A;
    public CatalogViewHolder B;
    public final LinkedHashMap C;
    public ViewGroup D;
    public View E;
    public View F;
    public AppBarLayout G;
    public Integer H;
    public final da40 I;
    public final SearchStatsLoggingInfo J;
    public UIBlockList K;
    public final ViewPagerVh L;
    public final g3a M;
    public final MusicCatalogErrorRedesignedStateScrollableVh N;
    public final SwitchCatalogVh O;
    public final zd40 P;
    public final tfc Q;
    public final boolean p;
    public final Object q;
    public final MusicPlaybackLaunchContext r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: MusicArtistCatalogRootVh.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public MusicArtistCatalogRootVh() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [xsna.da40] */
    public MusicArtistCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, kbj0 kbj0Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        CatalogFeatures catalogFeatures = CatalogFeatures.AUDIO_ARTIST_HEADER_REDESIGN;
        catalogFeatures.getClass();
        this.p = b.A.a(catalogFeatures);
        kr6 kr6Var = new kr6(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, kr6Var);
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(bundle.getString("ref"));
        String string = bundle.getString("launch_origin");
        this.r = Fb.Cb(string == null ? "unknown" : string);
        this.s = msy.a(lazyThreadSafetyMode, new ry3(this, kbj0Var, bundle, 6));
        this.t = msy.a(lazyThreadSafetyMode, new uk(15, this, kbj0Var));
        this.u = msy.a(lazyThreadSafetyMode, new pvh(this, 21));
        this.v = msy.a(lazyThreadSafetyMode, new obh(this, 20));
        this.w = msy.a(lazyThreadSafetyMode, new j3(20, this, kbj0Var));
        this.x = msy.a(lazyThreadSafetyMode, new nef(this, 22));
        this.y = msy.a(lazyThreadSafetyMode, new kg(17, this, kbj0Var));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new atm(this, 22));
        this.z = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new m1o(this, 23));
        this.A = a3;
        CatalogViewHolder catalogViewHolder = (CatalogViewHolder) a3.getValue();
        this.B = catalogViewHolder == null ? (CatalogViewHolder) a2.getValue() : catalogViewHolder;
        this.C = new LinkedHashMap();
        this.I = new AppBarLayout.f() { // from class: xsna.da40
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void a(AppBarLayout appBarLayout, int i) {
                MusicArtistCatalogRootVh.this.H = Integer.valueOf(i);
            }
        };
        SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
        this.J = searchStatsLoggingInfo;
        if (searchStatsLoggingInfo != null) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
            this.m.b.m.a = true;
        }
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.L = viewPagerVh;
        u4a u4aVar = this.m;
        this.M = u4aVar.b.s.S(u4aVar, null);
        MusicCatalogErrorRedesignedStateScrollableVh musicCatalogErrorRedesignedStateScrollableVh = new MusicCatalogErrorRedesignedStateScrollableVh(this, new w8q(this, 23), null, new by20(this, 5), 4);
        this.N = musicCatalogErrorRedesignedStateScrollableVh;
        this.O = new SwitchCatalogVh(viewPagerVh, null, musicCatalogErrorRedesignedStateScrollableVh, null, null, R.layout.catalog_frame_layout_with_scrolling, null, null, false, false, null, 2010);
        this.P = new zd40(this.m.b.f, (w950) null, new qb8(10), 6);
        this.Q = new tfc(m7m.f(this));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.O.A(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlock uIBlock2;
        View view;
        CatalogViewHolder catalogViewHolder;
        ArrayList<UIBlock> arrayList;
        UIBlock uIBlock3;
        Object obj;
        UIBlock uIBlock4;
        if (uIBlock instanceof UIBlockCatalog) {
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            this.K = new UIBlockList(uIBlock.b, uIBlock.d, uIBlock.e, uIBlock.f, uIBlock.g, uIBlock.h, uIBlock.Db(), uIBlock.j, uIBlock.m, null, j5g.u0(uIBlockCatalog.z.y, uIBlockCatalog.y.y), null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1072693248, null);
            this.Q.c();
            Object a0 = j5g.a0(uIBlockCatalog.A);
            Boolean bool = null;
            UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
            boolean z = this.p;
            if (uIBlockList == null || (arrayList = uIBlockList.y) == null) {
                uIBlock2 = null;
            } else if (z) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((UIBlock) obj) instanceof UIBlockMusicArtistNew) {
                            break;
                        }
                    }
                }
                uIBlock2 = (UIBlock) obj;
                if (uIBlock2 == null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            uIBlock4 = 0;
                            break;
                        } else {
                            uIBlock4 = it2.next();
                            if (((UIBlock) uIBlock4) instanceof UIBlockMusicArtist) {
                                break;
                            }
                        }
                    }
                    uIBlock2 = uIBlock4;
                }
            } else {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        uIBlock3 = 0;
                        break;
                    } else {
                        uIBlock3 = it3.next();
                        if (((UIBlock) uIBlock3) instanceof UIBlockMusicArtist) {
                            break;
                        }
                    }
                }
                uIBlock2 = uIBlock3;
            }
            if (uIBlock2 != null) {
                i0(uIBlock2);
            }
            this.O.N6(uIBlock);
            if (uIBlock2 != null) {
                ?? r1 = this.A;
                ?? r2 = this.z;
                if (z && ((CatalogViewHolder) r1.getValue()) != null && (uIBlock2 instanceof UIBlockMusicArtistNew)) {
                    catalogViewHolder = (CatalogViewHolder) r1.getValue();
                    if (catalogViewHolder == null) {
                        catalogViewHolder = (CatalogViewHolder) r2.getValue();
                    }
                } else {
                    catalogViewHolder = (CatalogViewHolder) r2.getValue();
                }
                bool = Boolean.valueOf(epx.f(catalogViewHolder, (CatalogViewHolder) r1.getValue()));
            }
            boolean f = epx.f(bool, Boolean.TRUE);
            if (z && f && (view = this.F) != null) {
                int a2 = e3m.a(R.dimen.overlap_separator_height, view.getContext());
                View view2 = this.F;
                if (view2 != null) {
                    f4m.t(-a2, view2);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.too0
    public final void Ng() {
        CatalogViewHolder catalogViewHolder = this.B;
        too0 too0Var = catalogViewHolder instanceof too0 ? (too0) catalogViewHolder : null;
        if (too0Var != null) {
            too0Var.Ng();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final uha P() {
        return this.P;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.J != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, true, null, 16);
        }
        super.S(cfp0Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_page, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.D = viewGroup2;
        CatalogViewHolder catalogViewHolder = this.B;
        LinkedHashMap linkedHashMap = this.C;
        View view = (View) linkedHashMap.get(catalogViewHolder);
        if (view == null) {
            view = catalogViewHolder.k5(layoutInflater, viewGroup2, null);
            linkedHashMap.put(catalogViewHolder, view);
        }
        this.E = view;
        viewGroup2.addView(view, 0);
        k0(this.E);
        SwitchCatalogVh switchCatalogVh = this.O;
        View k5 = switchCatalogVh.k5(layoutInflater, viewGroup2, null);
        this.F = k5;
        viewGroup2.addView(k5, 1);
        switchCatalogVh.i8(ltz.a);
        viewGroup2.post(new kv2(this, 6));
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        CatalogViewHolder catalogViewHolder;
        AppBarLayout appBarLayout = this.G;
        if (appBarLayout != null) {
            appBarLayout.f(this.I);
        }
        this.G = null;
        this.O.L();
        ?? r1 = this.z;
        if (r1.isInitialized()) {
            ((CatalogViewHolder) r1.getValue()).L();
        }
        ?? r12 = this.A;
        if (r12.isInitialized() && (catalogViewHolder = (CatalogViewHolder) r12.getValue()) != null) {
            catalogViewHolder.L();
        }
        this.C.clear();
        this.D = null;
        this.E = null;
        this.M.b();
        this.N.L();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.O.r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().b0(t8f0.class).subscribe(new ux00(new c2u(this, 19), 3), new tts(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(UIBlock uIBlock) {
        CatalogViewHolder catalogViewHolder;
        ViewGroup viewGroup;
        boolean z = this.p;
        ?? r1 = this.z;
        if (z) {
            ?? r0 = this.A;
            if (((CatalogViewHolder) r0.getValue()) != null && (uIBlock instanceof UIBlockMusicArtistNew)) {
                catalogViewHolder = (CatalogViewHolder) r0.getValue();
                if (catalogViewHolder == null) {
                    catalogViewHolder = (CatalogViewHolder) r1.getValue();
                }
                if (this.B == catalogViewHolder || this.E == null) {
                    this.B = catalogViewHolder;
                    viewGroup = this.D;
                    if (viewGroup != null) {
                        LinkedHashMap linkedHashMap = this.C;
                        View view = (View) linkedHashMap.get(catalogViewHolder);
                        if (view == null) {
                            view = catalogViewHolder.k5(LayoutInflater.from(viewGroup.getContext()), viewGroup, null);
                            linkedHashMap.put(catalogViewHolder, view);
                        }
                        View view2 = this.E;
                        da40 da40Var = this.I;
                        if (view2 != null) {
                            AppBarLayout appBarLayout = this.G;
                            if (appBarLayout != null) {
                                appBarLayout.f(da40Var);
                            }
                            this.G = null;
                            int indexOfChild = viewGroup.indexOfChild(view2);
                            if (indexOfChild >= 0) {
                                viewGroup.removeViewAt(indexOfChild);
                                viewGroup.addView(view, 0);
                            } else {
                                viewGroup.addView(view, 0);
                            }
                        } else {
                            AppBarLayout appBarLayout2 = this.G;
                            if (appBarLayout2 != null) {
                                appBarLayout2.f(da40Var);
                            }
                            this.G = null;
                            viewGroup.addView(view, 0);
                        }
                        this.E = view;
                        k0(view);
                    }
                }
                catalogViewHolder.N6(uIBlock);
            }
        }
        catalogViewHolder = (CatalogViewHolder) r1.getValue();
        if (this.B == catalogViewHolder) {
        }
        this.B = catalogViewHolder;
        viewGroup = this.D;
        if (viewGroup != null) {
        }
        catalogViewHolder.N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.O.i8(bnn0Var);
    }

    public final void j0(boolean z) {
        AppBarLayout appBarLayout;
        CatalogViewHolder catalogViewHolder = this.B;
        if (catalogViewHolder instanceof MusicPagePhoneHeaderVh) {
            AppBarLayout appBarLayout2 = ((MusicPagePhoneHeaderVh) catalogViewHolder).e;
            if (appBarLayout2 != null) {
                appBarLayout2.setExpanded(z);
                return;
            }
            return;
        }
        if (!(catalogViewHolder instanceof MusicPagePhoneHeaderNewVh) || (appBarLayout = ((MusicPagePhoneHeaderNewVh) catalogViewHolder).e) == null) {
            return;
        }
        appBarLayout.setExpanded(z);
    }

    public final void k0(View view) {
        AppBarLayout appBarLayout = view != null ? (AppBarLayout) view.findViewById(R.id.app_bar_layout) : null;
        this.G = appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.a(this.I);
        }
        Integer num = this.H;
        if (num != null) {
            int intValue = num.intValue();
            if (appBarLayout == null) {
                return;
            }
            appBarLayout.post(new ca40(appBarLayout, intValue, 0));
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        MusicPagePhoneHeaderNewVh musicPagePhoneHeaderNewVh;
        CollapsingToolbarLayout collapsingToolbarLayout;
        Context context;
        ViewGroup.LayoutParams layoutParams;
        this.O.onConfigurationChanged(configuration);
        CatalogViewHolder catalogViewHolder = this.B;
        if (!(catalogViewHolder instanceof MusicPagePhoneHeaderNewVh) || (collapsingToolbarLayout = (musicPagePhoneHeaderNewVh = (MusicPagePhoneHeaderNewVh) catalogViewHolder).d) == null || (context = collapsingToolbarLayout.getContext()) == null) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.catalog_artist_new_cover_height);
        HashSet hashSet = iah0.a;
        int min = Math.min(dimensionPixelSize, context.getResources().getDisplayMetrics().heightPixels);
        CollapsingToolbarLayout collapsingToolbarLayout2 = musicPagePhoneHeaderNewVh.d;
        if (collapsingToolbarLayout2 != null) {
            collapsingToolbarLayout2.getLayoutParams().height = min;
            View childAt = collapsingToolbarLayout2.getChildAt(0);
            if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null) {
                layoutParams.height = min;
            }
            collapsingToolbarLayout2.requestLayout();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.Q.d();
        this.L.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.Q.e();
        CatalogViewHolder catalogViewHolder = this.B;
        if (catalogViewHolder instanceof MusicPagePhoneHeaderVh) {
            MusicPagePhoneHeaderVh musicPagePhoneHeaderVh = (MusicPagePhoneHeaderVh) catalogViewHolder;
            musicPagePhoneHeaderVh.g.post(new iv1(musicPagePhoneHeaderVh, 7));
        } else if (catalogViewHolder instanceof MusicPagePhoneHeaderNewVh) {
            MusicPagePhoneHeaderNewVh musicPagePhoneHeaderNewVh = (MusicPagePhoneHeaderNewVh) catalogViewHolder;
            musicPagePhoneHeaderNewVh.g.post(new tn9(musicPagePhoneHeaderNewVh, 10));
        }
        this.L.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.L.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        this.m.b.b.c(false);
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
