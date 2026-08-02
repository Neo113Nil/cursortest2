package com.vk.search.ui.impl.catalog.roots;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.dto.music.SearchSuggestion;
import com.vk.movika.sdk.base.ui.o0;
import com.vk.search.params.api.SearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.search.ui.impl.catalog.SearchGroupsFeatureCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.f;
import kotlin.LazyThreadSafetyMode;
import xsna.ap0;
import xsna.b9q0;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cqm0;
import xsna.cwh0;
import xsna.ecm;
import xsna.eru0;
import xsna.hfy;
import xsna.hms;
import xsna.hxl;
import xsna.ify;
import xsna.j3;
import xsna.j50;
import xsna.jl4;
import xsna.kl6;
import xsna.krh0;
import xsna.l9h;
import xsna.m3a;
import xsna.maj;
import xsna.mhy;
import xsna.msy;
import xsna.o5a;
import xsna.q3a;
import xsna.qrh0;
import xsna.qyh0;
import xsna.rsg0;
import xsna.s6k;
import xsna.tb4;
import xsna.wik;
import xsna.xxf0;
import xsna.y50;
import xsna.yfb;
import xsna.yh90;
import xsna.ysg0;
import xsna.yzh0;
import xsna.zng;
import xsna.zqh;

/* compiled from: GlobalSearchGroupsCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchGroupsCatalogRootVh extends GlobalSearchFeatureCatalogRootVh {
    public final Object A;
    public final Object B;
    public final bpn0 C;
    public final b D;
    public final qyh0 E;
    public final SearchLocationPermissionsController F;
    public c G;
    public final SearchGroupsFeatureCatalogFragment u;
    public final yh90<VkGroupsSearchParams> v;
    public final VkGroupsSearchParams w;
    public final bpn0 x;
    public final Object y;
    public final bpn0 z;

    /* compiled from: GlobalSearchGroupsCatalogRootVh.kt */
    public final class a implements krh0<VkGroupsSearchParams> {
        public a() {
        }

        @Override // xsna.krh0
        public final void a(SearchParams searchParams) {
            int i = ify.a;
            GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh = GlobalSearchGroupsCatalogRootVh.this;
            Activity activity = globalSearchGroupsCatalogRootVh.b;
            j3 j3Var = new j3(12, globalSearchGroupsCatalogRootVh, (VkGroupsSearchParams) searchParams);
            if (!ify.e(ify.c)) {
                j3Var.invoke();
            } else {
                ify.a(new hfy(j3Var));
                mhy.b(activity);
            }
        }
    }

    public GlobalSearchGroupsCatalogRootVh() {
        throw null;
    }

    public GlobalSearchGroupsCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, SearchGroupsFeatureCatalogFragment searchGroupsFeatureCatalogFragment, o5a o5aVar, yh90 yh90Var, yzh0 yzh0Var) {
        super(bundle, fragmentActivity, o5aVar, yh90Var, searchGroupsFeatureCatalogFragment);
        this.u = searchGroupsFeatureCatalogFragment;
        this.v = yh90Var;
        this.w = new VkGroupsSearchParams();
        this.x = new bpn0(new com.vk.voip.a(15, yzh0Var, this));
        ecm ecmVar = new ecm(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = msy.a(lazyThreadSafetyMode, ecmVar);
        this.z = new bpn0(new o0(19));
        this.A = msy.a(lazyThreadSafetyMode, new l9h(this, 21));
        this.B = msy.a(lazyThreadSafetyMode, new maj(this, 19));
        bpn0 bpn0Var = new bpn0(new jl4(9, this, bundle));
        this.C = bpn0Var;
        this.D = new b();
        this.E = new qyh0();
        this.F = new SearchLocationPermissionsController(fragmentActivity, (CatalogGetSearchGroupsRequestFactory) bpn0Var.getValue());
    }

    public static void n0(GlobalSearchGroupsCatalogRootVh globalSearchGroupsCatalogRootVh, String str, String str2, SearchInputMethod searchInputMethod, String str3, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            searchInputMethod = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        globalSearchGroupsCatalogRootVh.p.e(new SearchQuery(str, searchInputMethod, str2, str3), new b9q0.b(z));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2;
        View X = super.X(layoutInflater, viewGroup, null);
        Activity activity = this.b;
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            fragmentActivity.getSupportFragmentManager().l0("choose_search_location", fragmentActivity, ((cwh0) this.y.getValue()).a(new wik(this, 11)));
        }
        this.v.j(new a(), this.u);
        qrh0 qrh0Var = (qrh0) this.x.getValue();
        return (qrh0Var == null || (a2 = qrh0Var.a(X)) == null) ? X : a2;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.D.e();
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
        return ((f) m3aVar.b).subscribe(new y50(new zqh(this, 17), 27));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().b0(ap0.class).subscribe(new hms(new s6k(this, 22), 1));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final SearchRequestFactory i0() {
        return (CatalogGetSearchGroupsRequestFactory) this.C.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen l0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_GROUPS;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        super.onPause();
        c cVar = this.G;
        if (cVar != null) {
            cVar.dispose();
        }
        this.G = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        this.G = ysg0.b.a.b0(eru0.class).subscribe(new j50(new hxl(this, 6), 24));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        UIBlockSearchSuggestion uIBlockSearchSuggestion;
        if (i == R.id.search_suggestion) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
                n0(this, searchSuggestion.c, cqm0.a(searchSuggestion.f), SearchInputMethod.Suggest, cqm0.a(searchSuggestion.k), 2);
                return;
            }
            return;
        }
        if (i == R.id.search_suggestion_close) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                SearchSuggestion searchSuggestion2 = uIBlockSearchSuggestion.y;
                this.D.b(rsg0.T(yfb.x(this.E.b(searchSuggestion2.k, searchSuggestion2.b))).subscribe(new zng(new com.vk.movika.sdk.base.utils.b(29), 1), new kl6(new tb4(26), 20)));
                this.m.b.e.b(new xxf0(uIBlockSearchSuggestion.Fb()), false);
            }
        }
    }
}
