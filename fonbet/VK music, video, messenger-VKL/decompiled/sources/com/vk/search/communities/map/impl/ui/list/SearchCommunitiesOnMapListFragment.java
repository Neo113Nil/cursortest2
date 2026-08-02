package com.vk.search.communities.map.impl.ui.list;

import android.os.Bundle;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.communities.map.catalog.root.SearchCommunitiesOnMapListRootVh;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import io.reactivex.rxjava3.internal.operators.observable.k;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.fda;
import xsna.soh0;
import xsna.toh0;

/* compiled from: SearchCommunitiesOnMapListFragment.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapListFragment extends BaseCatalogFragment implements fda, toh0.a {
    public toh0 Q;

    /* compiled from: SearchCommunitiesOnMapListFragment.kt */
    public static final /* synthetic */ class a extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((SearchCommunitiesOnMapListFragment) this.receiver).Q;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((SearchCommunitiesOnMapListFragment) this.receiver).Q = (toh0) obj;
        }
    }

    public SearchCommunitiesOnMapListFragment() {
        super(SearchCommunitiesOnMapListRootVh.class, true);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        return new SearchCommunitiesOnMapListRootVh(kn(), new soh0(this, new a(this, SearchCommunitiesOnMapListFragment.class, "outerListRouter", "getOuterListRouter()Lcom/vk/search/communities/map/impl/ui/list/router/SearchCommunitiesOnMapListRouter;", 0)), getArguments());
    }

    @Override // xsna.fda
    public final void gb(k kVar) {
        CatalogVh catalogVh = this.P;
        fda fdaVar = catalogVh instanceof fda ? (fda) catalogVh : null;
        if (fdaVar != null) {
            fdaVar.gb(kVar);
        }
    }

    @Override // xsna.toh0.a
    public final void n3(SearchCommunitiesOnMapFragment.h hVar) {
        this.Q = hVar;
    }
}
