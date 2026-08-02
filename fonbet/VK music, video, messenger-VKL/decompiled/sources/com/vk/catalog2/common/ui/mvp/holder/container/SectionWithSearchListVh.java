package com.vk.catalog2.common.ui.mvp.holder.container;

import android.graphics.Rect;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.lists.c;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import xsna.alj;
import xsna.bnn0;
import xsna.cfp0;
import xsna.eg50;
import xsna.epx;
import xsna.izs;
import xsna.kea;
import xsna.ltz;
import xsna.mhj0;
import xsna.n0q0;
import xsna.onh0;
import xsna.s3q0;
import xsna.swp;
import xsna.to;
import xsna.tyh0;
import xsna.u4a;
import xsna.vd7;
import xsna.vyh0;
import xsna.wia;

/* compiled from: SectionWithSearchListVh.kt */
/* loaded from: classes16.dex */
public abstract class SectionWithSearchListVh implements CatalogVh, CatalogStatesViewHolder, SwitchCatalogVh.b, n0q0, TopBarVh.a {
    public final ResumableViewHolder b;
    public final SearchStatInfoProvider c;
    public final mhj0 d;
    public final SearchResultsImplVh e;
    public final ProgressVh f;
    public SearchStatsLoggingInfo g;
    public SearchStatsLoggingInfo h;

    public SectionWithSearchListVh(u4a u4aVar, ResumableViewHolder resumableViewHolder, wia wiaVar, SearchStatInfoProvider searchStatInfoProvider) {
        this.b = resumableViewHolder;
        this.c = searchStatInfoProvider;
        eg50 eg50Var = new eg50();
        mhj0 mhj0Var = new mhj0(u4aVar.b.s.N());
        this.d = mhj0Var;
        u4a.a aVar = u4aVar.b;
        u4a a = u4a.a(u4aVar, u4a.a.a(aVar, null, null, null, null, null, new tyh0(aVar.s), null, null, null, eg50Var, new onh0(), -524289, 1048551));
        u4a.a aVar2 = a.b;
        CatalogConfiguration catalogConfiguration = aVar2.s;
        kea keaVar = new kea(mhj0Var, catalogConfiguration.K(a), a, new vd7(aVar2.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        to toVar = new to(27);
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = toVar;
        this.e = new SearchResultsImplVh(mhj0Var, keaVar, new VerticalListVh(catalogConfiguration, hVar, keaVar, a, wiaVar, false, R.layout.catalog_list_vertical_with_appbar_behaviour, null, 864), null, null, null, null, new SearchResultsVh.a(false, 125), null, 376);
        this.f = new ProgressVh((Object) null);
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh.a
    public final void B(String str) {
        this.d.p = str;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final <T extends View> void Se(T t, String str, izs<? super T, s3q0> izsVar) {
        super.Se(t, "Call method \"setExpanded(..)\" only after \"createView(..)\"", izsVar);
    }

    public abstract CatalogStatesViewHolder a();

    public void b(cfp0 cfp0Var) {
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        if (!(a().getState() instanceof vyh0) || (searchStatsLoggingInfo = this.g) == null) {
            return;
        }
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, searchStatsLoggingInfo.i, null, 16);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return a().getState();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        bnn0 state = a().getState();
        if (epx.f(state, bnn0Var)) {
            return;
        }
        a().i8(bnn0Var);
        vyh0 vyh0Var = vyh0.a;
        boolean equals = bnn0Var.equals(vyh0Var);
        SearchStatInfoProvider searchStatInfoProvider = this.c;
        SearchResultsImplVh searchResultsImplVh = this.e;
        ResumableViewHolder resumableViewHolder = this.b;
        if (equals) {
            resumableViewHolder.onPause();
            searchResultsImplVh.onResume();
            this.g = searchStatInfoProvider != null ? searchStatInfoProvider.b(SchemeStat$EventItem.Type.SEARCH_AUTHOR, "", true) : null;
            return;
        }
        this.g = null;
        if (epx.f(state, vyh0Var)) {
            searchResultsImplVh.onPause();
        }
        if (!(a().getState() instanceof vyh0) && searchStatInfoProvider != null) {
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Disabled;
        }
        resumableViewHolder.onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof vyh0;
        SearchStatInfoProvider searchStatInfoProvider = this.c;
        if (z) {
            if (searchStatInfoProvider != null) {
                searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
                return;
            }
            return;
        }
        if (searchStatInfoProvider != null) {
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Disabled;
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.h;
        if (searchStatsLoggingInfo != null) {
            if (searchStatsLoggingInfo.j) {
                if (searchStatInfoProvider != null) {
                    searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
                }
            } else if (searchStatInfoProvider != null) {
                searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
            }
            if (searchStatInfoProvider != null) {
                searchStatInfoProvider.a = searchStatsLoggingInfo.i;
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh.a
    public final void o(String str) {
        this.d.q = str;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.holders.header.TopBarVh.a
    public final void setSearchQuery(String str) {
        SearchResultsVh.cb(this.e, str, null, null, false, null, false, 62);
        i8(str.length() > 0 ? vyh0.a : alj.a);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public void ya() {
        i8(ltz.a);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public boolean ze(Rect rect) {
        return false;
    }
}
