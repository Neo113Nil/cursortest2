package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.catalog2.feature.music.holders.artist.MusicArtistErrorStateVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarVh;
import com.vk.catalog2.feature.music.holders.curator.CuratorInfoVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.ArrayList;
import xsna.b5a;
import xsna.ba40;
import xsna.bnn0;
import xsna.cfp0;
import xsna.f5z;
import xsna.fsq;
import xsna.g380;
import xsna.g3a;
import xsna.iv1;
import xsna.j5g;
import xsna.kbj0;
import xsna.ltz;
import xsna.m7m;
import xsna.mba;
import xsna.nda;
import xsna.o5a;
import xsna.rda;
import xsna.sa80;
import xsna.sj1;
import xsna.swp;
import xsna.tfc;
import xsna.too0;
import xsna.u4a;
import xsna.wf40;

/* compiled from: MusicCuratorCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicCuratorCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, rda, CatalogStatesViewHolder {
    public String p;
    public final Object q;
    public final SearchStatsLoggingInfo r;
    public final tfc s;
    public final ViewPagerVh t;
    public final g3a u;
    public final SwitchCatalogVh v;

    public MusicCuratorCatalogRootVh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderVh] */
    public MusicCuratorCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, kbj0 kbj0Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        u4a u4aVar = this.m;
        mba mbaVar = u4aVar.c.a;
        u4a.a aVar = u4aVar.b;
        b5a b5aVar = aVar.f;
        boolean z = aVar.c;
        MusicPageToolbarVh musicPageToolbarVh = new MusicPageToolbarVh(mbaVar, b5aVar, kbj0Var, z, false);
        if (!z) {
            musicPageToolbarVh = new MusicPagePhoneHeaderVh(new CuratorInfoVh(aVar.i, b5aVar, aVar.m, aVar.v, aVar.r, MusicPlaybackLaunchContext.Fb(bundle != null ? bundle.getString("ref") : null)), musicPageToolbarVh);
        }
        this.q = musicPageToolbarVh;
        SearchStatsLoggingInfo searchStatsLoggingInfo = bundle != null ? (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info") : null;
        this.r = searchStatsLoggingInfo;
        this.s = new tfc(m7m.f(this));
        if (searchStatsLoggingInfo != null) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            if (searchStatInfoProvider != null) {
                searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
            }
            if (searchStatInfoProvider != null) {
                searchStatInfoProvider.a = true;
            }
        }
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.t = viewPagerVh;
        u4a u4aVar2 = this.m;
        this.u = u4aVar2.b.s.S(u4aVar2, null);
        this.v = new SwitchCatalogVh(viewPagerVh, null, new MusicArtistErrorStateVh(this, new wf40(this, 0)), null, null, R.layout.catalog_frame_layout_with_scrolling, null, null, false, false, null, 2010);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.v.A(str);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.vk.catalog2.common.ui.holders.api.CatalogViewHolder, java.lang.Object] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList<UIBlock> arrayList;
        if (uIBlock instanceof UIBlockCatalog) {
            this.s.c();
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            Object a0 = j5g.a0(uIBlockCatalog.A);
            UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
            Serializer.StreamParcelableAdapter streamParcelableAdapter = (uIBlockList == null || (arrayList = uIBlockList.y) == null) ? null : (UIBlock) j5g.a0(arrayList);
            UIBlockMusicCurator uIBlockMusicCurator = streamParcelableAdapter instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) streamParcelableAdapter : null;
            if (uIBlockMusicCurator != null) {
                this.q.N6(uIBlockMusicCurator);
            }
            this.v.N6(uIBlock);
            this.p = uIBlockCatalog.D;
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.too0
    public final void Ng() {
        Object obj = this.q;
        too0 too0Var = obj != null ? (too0) obj : null;
        if (too0Var != null) {
            too0Var.Ng();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.r != null) {
            b.a(b.a, cfp0Var.a, cfp0Var.b, true, null, 16);
        } else {
            super.S(cfp0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.catalog2.common.ui.holders.api.CatalogViewHolder, java.lang.Object] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_artist_page, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        viewGroup2.addView(this.q.k5(layoutInflater, viewGroup2, null), 0);
        SwitchCatalogVh switchCatalogVh = this.v;
        viewGroup2.addView(switchCatalogVh.k5(layoutInflater, viewGroup2, null), 1);
        switchCatalogVh.i8(ltz.a);
        viewGroup2.post(new sj1(this, 10));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.v.L();
        this.u.b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c g0(b5a b5aVar) {
        return b5aVar.a.b0(sa80.class).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new fsq(new ba40(this, 1), 10));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.v.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.v.i8(bnn0Var);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.v.onConfigurationChanged(configuration);
        Object obj = this.q;
        g380 g380Var = obj instanceof g380 ? (g380) obj : null;
        if (g380Var != null) {
            g380Var.onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.s.d();
        this.t.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        Object obj = this.q;
        MusicPagePhoneHeaderVh musicPagePhoneHeaderVh = obj instanceof MusicPagePhoneHeaderVh ? (MusicPagePhoneHeaderVh) obj : null;
        if (musicPagePhoneHeaderVh != null) {
            musicPagePhoneHeaderVh.g.post(new iv1(musicPagePhoneHeaderVh, 7));
        }
        this.s.e();
        this.t.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.t.s();
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
