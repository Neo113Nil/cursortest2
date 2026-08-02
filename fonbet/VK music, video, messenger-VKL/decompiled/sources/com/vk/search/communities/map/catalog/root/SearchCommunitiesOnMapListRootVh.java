package com.vk.search.communities.map.catalog.root;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupCatalogItem;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.communities.map.api.domain.LocationCoordinate;
import com.vk.search.communities.map.catalog.item.SearchCommunitiesOnMapGroupCellVh;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.k;
import io.reactivex.rxjava3.internal.operators.observable.l1;
import io.reactivex.rxjava3.subjects.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ax0;
import xsna.cfp0;
import xsna.est;
import xsna.f5z;
import xsna.fda;
import xsna.izs;
import xsna.kea;
import xsna.l3a;
import xsna.m3a;
import xsna.moh0;
import xsna.msy;
import xsna.nda;
import xsna.orp;
import xsna.pw40;
import xsna.pye0;
import xsna.s3q0;
import xsna.soh0;
import xsna.toh0;

/* compiled from: SearchCommunitiesOnMapListRootVh.kt */
/* loaded from: classes5.dex */
public final class SearchCommunitiesOnMapListRootVh extends CatalogRootViewHolder implements fda {
    public final soh0 p;
    public final pye0 q;
    public final Object r;
    public final Object s;

    /* compiled from: SearchCommunitiesOnMapListRootVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<l3a, s3q0> {
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(l3a l3aVar) {
            Float f;
            Float f2;
            toh0 toh0Var;
            l3a l3aVar2 = l3aVar;
            SearchCommunitiesOnMapListRootVh searchCommunitiesOnMapListRootVh = (SearchCommunitiesOnMapListRootVh) this.receiver;
            searchCommunitiesOnMapListRootVh.getClass();
            if (l3aVar2 instanceof SearchCommunitiesOnMapGroupCellVh.a) {
                SearchCommunitiesOnMapGroupCellVh.a aVar = (SearchCommunitiesOnMapGroupCellVh.a) l3aVar2;
                GroupCatalogItem groupCatalogItem = aVar.b;
                Group group = aVar.a;
                LocationCoordinate locationCoordinate = null;
                if (groupCatalogItem != null) {
                    double d = groupCatalogItem.h;
                    Double valueOf = Double.valueOf(d);
                    if (Double.isNaN(d)) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        f = Float.valueOf((float) valueOf.doubleValue());
                        if (groupCatalogItem != null) {
                            double d2 = groupCatalogItem.i;
                            Double valueOf2 = Double.valueOf(d2);
                            if (Double.isNaN(d2)) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                f2 = Float.valueOf((float) valueOf2.doubleValue());
                                if (f != null && f2 != null) {
                                    locationCoordinate = new LocationCoordinate(f.floatValue(), f2.floatValue());
                                }
                                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.GROUP;
                                String str = group.O;
                                UiTracker uiTracker = UiTracker.a;
                                SearchStatsLoggingInfo searchStatsLoggingInfo = new SearchStatsLoggingInfo(null, 0, type, 0L, str, UiTracker.c(), null, false, false, 459, null);
                                toh0Var = (toh0) searchCommunitiesOnMapListRootVh.p.d.invoke();
                                if (toh0Var != null) {
                                    toh0Var.a(group, locationCoordinate, searchStatsLoggingInfo);
                                }
                            }
                        }
                        f2 = null;
                        if (f != null) {
                            locationCoordinate = new LocationCoordinate(f.floatValue(), f2.floatValue());
                        }
                        SchemeStat$EventItem.Type type2 = SchemeStat$EventItem.Type.GROUP;
                        String str2 = group.O;
                        UiTracker uiTracker2 = UiTracker.a;
                        SearchStatsLoggingInfo searchStatsLoggingInfo2 = new SearchStatsLoggingInfo(null, 0, type2, 0L, str2, UiTracker.c(), null, false, false, 459, null);
                        toh0Var = (toh0) searchCommunitiesOnMapListRootVh.p.d.invoke();
                        if (toh0Var != null) {
                        }
                    }
                }
                f = null;
                if (groupCatalogItem != null) {
                }
                f2 = null;
                if (f != null) {
                }
                SchemeStat$EventItem.Type type22 = SchemeStat$EventItem.Type.GROUP;
                String str22 = group.O;
                UiTracker uiTracker22 = UiTracker.a;
                SearchStatsLoggingInfo searchStatsLoggingInfo22 = new SearchStatsLoggingInfo(null, 0, type22, 0L, str22, UiTracker.c(), null, false, false, 459, null);
                toh0Var = (toh0) searchCommunitiesOnMapListRootVh.p.d.invoke();
                if (toh0Var != null) {
                }
            }
            return s3q0.a;
        }
    }

    public SearchCommunitiesOnMapListRootVh(FragmentActivity fragmentActivity, soh0 soh0Var, Bundle bundle) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) soh0Var, false, (f5z) null, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        this.p = soh0Var;
        pye0 pye0Var = new pye0(null);
        pye0Var.c = l1.b;
        this.q = pye0Var;
        int i = 0;
        int i2 = 0;
        est estVar = new est(i2, this, SearchCommunitiesOnMapListRootVh.class, "createSectionCatalogPresenter", "createSectionCatalogPresenter()Lcom/vk/catalog2/common/ui/mvp/presenter/CatalogSectionPresenter;", i, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.r = msy.a(lazyThreadSafetyMode, estVar);
        this.s = msy.a(lazyThreadSafetyMode, new ax0(i2, this, SearchCommunitiesOnMapListRootVh.class, "createSearchResultsVh", "createSearchResultsVh()Lcom/vk/catalog2/common/ui/mvp/holder/container/VerticalListVh;", i, 6));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        i0().N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final orp Q() {
        return new moh0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        b.a(b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.search_communities_on_map_list_fragment, viewGroup, false);
        if (inflate instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            ViewStub viewStub = (ViewStub) viewGroup2.findViewById(R.id.list);
            View k5 = i0().k5(layoutInflater, viewGroup, null);
            k5.setId(viewStub.getId());
            RecyclerPaginatedView recyclerPaginatedView = i0().n;
            (recyclerPaginatedView != null ? recyclerPaginatedView : null).setSwipeRefreshLayoutNestedScrollEnabled(false);
            int indexOfChild = viewGroup2.indexOfChild(viewStub);
            viewGroup2.removeViewInLayout(viewStub);
            viewGroup2.addView(k5, indexOfChild, viewStub.getLayoutParams());
            ((RecyclerPaginatedView) k5).setSwipeRefreshEnabled(false);
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        i0().L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.b(EmptyDisposable.INSTANCE, ((f) m3aVar.b).subscribe(new pw40(new a(1, this, SearchCommunitiesOnMapListRootVh.class, "onCatalogClickEvent", "onCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 8)));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fda
    public final void gb(k kVar) {
        this.q.c = kVar;
        ?? r4 = this.r;
        c cVar = ((kea) r4.getValue()).f;
        if (cVar != null) {
            cVar.dispose();
        }
        kea.w((kea) r4.getValue(), false, null, false, 7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final VerticalListVh i0() {
        return (VerticalListVh) this.s.getValue();
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        i0().onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        i0().onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        i0().onResume();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
