package com.vk.search.ui.impl.catalog.roots;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.permission.PermissionHelper;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import xsna.ap0;
import xsna.atm;
import xsna.c2u;
import xsna.cfp0;
import xsna.cwh0;
import xsna.eqd;
import xsna.eru0;
import xsna.k220;
import xsna.m3a;
import xsna.msy;
import xsna.n3i;
import xsna.n3t;
import xsna.o5a;
import xsna.o8c0;
import xsna.oxz;
import xsna.q3a;
import xsna.qyh0;
import xsna.s3q0;
import xsna.sim;
import xsna.tts;

/* compiled from: GlobalSearchGroupsCatalogRootVhOld.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchGroupsCatalogRootVhOld extends GlobalSearchWithParamsCatalogRootVh {
    public final Object F;
    public final Object G;
    public final CatalogGetSearchGroupsRequestFactory H;
    public final SearchResultsImplVh I;
    public final b J;
    public final qyh0 K;
    public final SearchLocationPermissionsController L;

    public GlobalSearchGroupsCatalogRootVhOld() {
        throw null;
    }

    public GlobalSearchGroupsCatalogRootVhOld(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, fragmentActivity, o5aVar, null);
        q d0;
        sim simVar = new sim(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, simVar);
        this.G = msy.a(lazyThreadSafetyMode, new atm(this, 8));
        CatalogGetSearchGroupsRequestFactory catalogGetSearchGroupsRequestFactory = new CatalogGetSearchGroupsRequestFactory(this.m.b.s.N(), CatalogGetSearchGroupsRequestFactory.SearchGroupsEntrypoint.GlobalSearchTab, null, bundle != null ? bundle.getString("KEY_AD_CAMPAIGN_SOURCE") : null, false, 20);
        this.H = catalogGetSearchGroupsRequestFactory;
        this.I = i0(this.m, catalogGetSearchGroupsRequestFactory, true, null);
        this.J = new b();
        this.K = new qyh0();
        SearchLocationPermissionsController searchLocationPermissionsController = new SearchLocationPermissionsController(fragmentActivity, catalogGetSearchGroupsRequestFactory);
        PermissionHelper.a.getClass();
        if (PermissionHelper.b(fragmentActivity, PermissionHelper.h)) {
            AtomicReference<Location> atomicReference = oxz.a;
            d0 = oxz.e(fragmentActivity).U(new o8c0(new k220(22), 3)).d0(Optional.empty());
        } else {
            d0 = q.T(Optional.empty());
        }
        catalogGetSearchGroupsRequestFactory.t = d0.e();
        this.L = searchLocationPermissionsController;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh, com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View X = super.X(layoutInflater, viewGroup, null);
        Activity activity = this.b;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return X;
        }
        fragmentActivity.getSupportFragmentManager().l0("choose_search_location", fragmentActivity, ((cwh0) this.F.getValue()).a(new c2u(this, 0)));
        return X;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.J.e();
        super.Y();
        Activity activity = this.b;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return;
        }
        fragmentActivity.getSupportFragmentManager().f("choose_search_location");
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        return ((f) m3aVar.b).subscribe(new tts(new eqd(this, 22), 2));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().b0(ap0.class).subscribe(new n3t(new n3i(this, 23), 1));
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.I;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_GROUPS;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.H.o(searchInputMethod);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh
    public final Object o0() {
        SearchParams searchParams = this.y;
        VkGroupsSearchParams vkGroupsSearchParams = searchParams instanceof VkGroupsSearchParams ? (VkGroupsSearchParams) searchParams : null;
        if (vkGroupsSearchParams == null) {
            return s3q0.a;
        }
        VkGroupsSearchParams copy = vkGroupsSearchParams.copy();
        copy.reset();
        return new eru0(copy);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh, xsna.xda
    public final void v(String str, SearchParams searchParams, String str2, boolean z, SearchInputMethod searchInputMethod) {
        if (this.H.j && str.equals(this.p)) {
            super.v(str, searchParams, str2, true, searchInputMethod);
        } else {
            super.v(str, searchParams, str2, z, searchInputMethod);
        }
    }
}
