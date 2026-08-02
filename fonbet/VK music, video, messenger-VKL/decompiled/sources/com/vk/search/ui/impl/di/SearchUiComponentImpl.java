package com.vk.search.ui.impl.di;

import android.content.Context;
import android.os.Bundle;
import com.vk.di.component.DiScopedComponent;
import com.vk.search.integration.api.SearchTab;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.search.ui.impl.catalog.SearchInCommunityCatalogFragment;
import com.vk.search.ui.impl.catalog.SearchOwnerVideosCatalogFragment;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.brh0;
import xsna.bzh0;
import xsna.c8m;
import xsna.crh0;
import xsna.fpf0;
import xsna.g8m;
import xsna.i8c0;
import xsna.irh0;
import xsna.kwh0;
import xsna.nwy;
import xsna.nzh0;
import xsna.pwj0;
import xsna.qcy;
import xsna.zzh0;

/* compiled from: SearchUiComponentImpl.kt */
/* loaded from: classes5.dex */
public final class SearchUiComponentImpl implements SearchUiComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final SearchParamsComponent a;
    public final nwy b = new nwy(new i8c0(4));

    /* compiled from: SearchUiComponentImpl.kt */
    public static final class a implements c8m<SearchUiComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SearchUiComponentImpl((SearchParamsComponent) g8mVar.a(fpf0.a(SearchParamsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SearchUiComponentImpl.class, "searchTracker", "getSearchTracker()Lcom/vk/search/ui/impl/stat/SearchStatsTrackerImpl;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public SearchUiComponentImpl(SearchParamsComponent searchParamsComponent) {
        this.a = searchParamsComponent;
    }

    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final void G9(Context context, SearchUiComponent.a.InterfaceC1776a interfaceC1776a) {
        if (interfaceC1776a instanceof SearchUiComponent.a.InterfaceC1776a.b) {
            long j = ((SearchUiComponent.a.InterfaceC1776a.b) interfaceC1776a).a;
            SearchOwnerVideosCatalogFragment.a aVar = new SearchOwnerVideosCatalogFragment.a(SearchOwnerVideosCatalogFragment.class, null, null);
            aVar.j.putLong("owner_id", j);
            aVar.k(context);
            return;
        }
        if (!(interfaceC1776a instanceof SearchUiComponent.a.InterfaceC1776a.C1777a)) {
            throw new NoWhenBranchMatchedException();
        }
        SearchUiComponent.a.InterfaceC1776a.C1777a c1777a = (SearchUiComponent.a.InterfaceC1776a.C1777a) interfaceC1776a;
        long j2 = c1777a.a;
        SearchTab searchTab = c1777a.b;
        SearchInCommunityCatalogFragment.a aVar2 = new SearchInCommunityCatalogFragment.a(SearchInCommunityCatalogFragment.class, null, null);
        Bundle bundle = aVar2.j;
        bundle.putLong("owner_id", j2);
        bundle.putInt("tab", searchTab.ordinal());
        aVar2.k(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final bzh0 Ga() {
        qcy<Object> qcyVar = c[0];
        return (bzh0) this.b.c();
    }

    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final brh0 Td() {
        return new brh0(this.a.M9());
    }

    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final crh0 W(irh0 irh0Var) {
        return Td().b(irh0Var, null);
    }

    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final crh0 h5(irh0 irh0Var, VkGroupsSearchParams vkGroupsSearchParams) {
        return Td().b(irh0Var, vkGroupsSearchParams);
    }

    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final kwh0 lf() {
        return new kwh0();
    }

    @Override // com.vk.search.ui.api.di.SearchUiComponent
    public final zzh0 o9() {
        return new zzh0(nzh0.b);
    }
}
