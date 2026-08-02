package com.vk.catalog2.common.ui.mvp.holder.container;

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
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vk.catalog2.feature.music.holders.di.MusicCatalogComponent;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vkontakte.android.R;
import java.util.UUID;
import xsna.cfp0;
import xsna.eda;
import xsna.epx;
import xsna.f5z;
import xsna.fpf0;
import xsna.g3a;
import xsna.g880;
import xsna.gzs;
import xsna.i7p0;
import xsna.itj0;
import xsna.k7m;
import xsna.ltz;
import xsna.m7m;
import xsna.mzp0;
import xsna.n3b0;
import xsna.n9w;
import xsna.nda;
import xsna.o5a;
import xsna.ov;
import xsna.q3a;
import xsna.qb8;
import xsna.r1d;
import xsna.rda;
import xsna.rzp0;
import xsna.swp;
import xsna.u4a;
import xsna.uha;
import xsna.w7p0;
import xsna.w950;
import xsna.wba;
import xsna.zd40;

/* compiled from: SingleCatalogRootVh.kt */
/* loaded from: classes16.dex */
public class SingleCatalogRootVh extends CatalogRootViewHolder implements rda {
    public final uha p;
    public final g3a q;
    public final TabsOrListVh r;
    public final SearchStatsLoggingInfo s;
    public final mzp0 t;

    public /* synthetic */ SingleCatalogRootVh(Class cls, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        this(cls, bundle, fragmentActivity, o5aVar, null);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.r.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.t;
        if (mzp0Var != null) {
            UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
            boolean z = false;
            if (uIBlockCatalog != null && uIBlockCatalog.E) {
                z = true;
            }
            mzp0Var.c(z);
        }
        this.r.N6(uIBlock);
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public uha P() {
        return this.p;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        P().c(cfp0Var.a, cfp0Var.b);
        this.r.b(cfp0Var);
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.s;
        if (searchStatsLoggingInfo != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, searchStatsLoggingInfo.i, null, 16);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        return this.r.a0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.r.k5(layoutInflater, viewGroup, null);
        k5.post(new ov(this, 13));
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.q.b();
        this.r.L();
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.r.A.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onPause() {
        this.r.n.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onResume() {
        this.r.n.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.t;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        this.r.i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.r.s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.r.i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            s();
        } else {
            this.m.b.b.c(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleCatalogRootVh(Class cls, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, r1d r1dVar) {
        super(bundle, cls, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        this.p = epx.f(this.g.getCanonicalName(), ((MusicCatalogComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MusicCatalogComponent.class))).Jd().a().getCanonicalName()) ? new zd40(this.m.b.f, (w950) (0 == true ? 1 : 0), (gzs) new qb8(10), 6) : new uha(0);
        u4a u4aVar = this.m;
        g3a S = u4aVar.b.s.S(u4aVar, null);
        this.q = S;
        i7p0 i7p0Var = new i7p0(new g880(this, 22), null, null, null, 14);
        u4a.a aVar = this.m.b;
        nda ndaVar = aVar.b;
        q3a q3aVar = aVar.e;
        wba N = aVar.s.N();
        u4a u4aVar2 = this.m;
        u4a.a aVar2 = u4aVar2.b;
        eda edaVar = new eda(N, aVar2.e, aVar2.s.K(u4aVar2), new itj0(0));
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        TabsOrListVh tabsOrListVh = new TabsOrListVh(this.m, new VkTopBarVh(ndaVar, q3aVar, i7p0Var, new w7p0(false, null, com.vk.core.compose.component.semantics.b.a(mode, new n9w(26), 2), com.vk.core.compose.component.semantics.b.a(mode, new n3b0(fragmentActivity, 13), 2), null, null, null, null, null, 32575), null, edaVar, null, null, 3952), 0, null, false, S, N(), null, null, null, false, r1dVar, 130300);
        this.r = tabsOrListVh;
        SearchStatsLoggingInfo searchStatsLoggingInfo = bundle != null ? (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info") : null;
        this.s = searchStatsLoggingInfo;
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.t = rzp0.d(bundle);
        if (searchStatsLoggingInfo != null) {
            if (searchStatsLoggingInfo.j) {
                SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
                searchStatInfoProvider.getClass();
                searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
            } else {
                SearchStatInfoProvider searchStatInfoProvider2 = this.m.b.m;
                searchStatInfoProvider2.getClass();
                searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Enabled;
            }
            this.m.b.m.a = searchStatsLoggingInfo.i;
        }
        tabsOrListVh.h = searchStatsLoggingInfo;
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
