package com.vk.catalog2.common.ui.mvp.holder.search;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.lists.c;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cmg;
import xsna.dha;
import xsna.epx;
import xsna.f5z;
import xsna.g0t;
import xsna.gzs;
import xsna.kea;
import xsna.lrk;
import xsna.nda;
import xsna.o5a;
import xsna.orp;
import xsna.pr;
import xsna.qqh0;
import xsna.rda;
import xsna.tzv;
import xsna.u4a;
import xsna.vd7;
import xsna.xqh0;
import xsna.xzs;
import xsna.z3v;
import xsna.zqh0;

/* compiled from: SearchFeatureCatalogRootVh.kt */
/* loaded from: classes16.dex */
public abstract class SearchFeatureCatalogRootVh extends CatalogRootViewHolder implements CatalogViewHolder, rda, ResumableViewHolder {
    public final zqh0 p;
    public final gzs<f5z> q;
    public kea r;
    public cmg s;
    public ViewGroup t;

    /* compiled from: SearchFeatureCatalogRootVh.kt */
    public static final /* synthetic */ class a implements dha, g0t {
        public a() {
        }

        @Override // xsna.dha
        public final MobileOfficialAppsCoreNavStat$EventScreen a() {
            return SearchFeatureCatalogRootVh.this.k0();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dha) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, SearchFeatureCatalogRootVh.this, SearchFeatureCatalogRootVh.class, "getStatEventScreen", "getStatEventScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public SearchFeatureCatalogRootVh(Bundle bundle, Activity activity, o5a o5aVar, zqh0 zqh0Var, gzs gzsVar) {
        super(bundle, (Class) null, activity, (nda) o5aVar, true, (f5z) null, 96);
        this.p = zqh0Var;
        this.q = gzsVar;
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        searchStatInfoProvider.getClass();
        searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        j0().N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public orp Q() {
        return new qqh0(new a(), 2);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_search_layout, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.t = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.addView(j0().k5(layoutInflater, this.t, null));
        }
        cmg cmgVar = this.s;
        this.p.k(cmgVar != null ? cmgVar : null, this.q.invoke());
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void Y() {
        j0().L();
    }

    public final SearchFeatureResultsVh i0(u4a u4aVar, SearchRequestFactory searchRequestFactory) {
        u4a.a aVar = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        kea keaVar = new kea(searchRequestFactory, catalogConfiguration.K(u4aVar), u4aVar, new vd7(aVar.e), false, null, null, false, null, null, aVar.H, null, null, false, null, 126912);
        new xqh0(this, SearchFeatureCatalogRootVh.class, "presenter", "getPresenter()Lcom/vk/catalog2/common/ui/mvp/presenter/CatalogSectionPresenter;", 0).set(keaVar);
        pr prVar = new pr(17);
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = prVar;
        VerticalListVh.a aVar2 = new VerticalListVh.a(new z3v(false), null, null, 52);
        VerticalListVh verticalListVh = new VerticalListVh(catalogConfiguration, hVar, keaVar, u4aVar, N(), false, R.layout.catalog_search_all_discover_search_result_list_vertical, aVar2, 352);
        this.s = new cmg(keaVar, searchRequestFactory, verticalListVh);
        return new SearchFeatureResultsVh(verticalListVh, catalogConfiguration);
    }

    public abstract CommonSearchResultsVh j0();

    public abstract MobileOfficialAppsCoreNavStat$EventScreen k0();

    @Override // xsna.g380
    public void onConfigurationChanged(Configuration configuration) {
        j0().onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onPause() {
        j0().onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onResume() {
        j0().onResume();
    }

    @Override // xsna.rda
    public void s() {
        j0().s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public void ya() {
    }

    public void l0(tzv tzvVar) {
    }

    public void n0(lrk lrkVar) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public void rg(Throwable th) {
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
