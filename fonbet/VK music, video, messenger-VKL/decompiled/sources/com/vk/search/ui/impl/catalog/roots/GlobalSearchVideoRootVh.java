package com.vk.search.ui.impl.catalog.roots;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogSearchRequestFactory;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import kotlin.LazyThreadSafetyMode;
import xsna.awt0;
import xsna.b1j;
import xsna.bpn0;
import xsna.bwt0;
import xsna.bym;
import xsna.bzj;
import xsna.cfp0;
import xsna.i2u;
import xsna.izs;
import xsna.jw3;
import xsna.msy;
import xsna.o5a;
import xsna.ou1;
import xsna.pzh0;
import xsna.s180;
import xsna.s3q0;
import xsna.u4a;
import xsna.uxh0;
import xsna.vi0;
import xsna.vxh0;
import xsna.wet0;
import xsna.whe;
import xsna.wzs;
import xsna.x16;
import xsna.yqf;
import xsna.zqf;
import xsna.zth0;

/* compiled from: GlobalSearchVideoRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchVideoRootVh extends GlobalSearchCatalogRootVh implements zth0, vxh0, s180 {
    public final pzh0 A;
    public final bpn0 B;
    public final wet0 C;
    public final SearchContentVh D;
    public final String E;
    public SearchParametersBottomView F;
    public c G;
    public final Object x;
    public final Object y;
    public final VideoSearchFiltersImpl z;

    public GlobalSearchVideoRootVh() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSearchVideoRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, fragmentActivity, o5aVar, null);
        pzh0 pzh0Var;
        wet0 wet0Var = null;
        yqf yqfVar = new yqf(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = msy.a(lazyThreadSafetyMode, yqfVar);
        this.y = msy.a(lazyThreadSafetyMode, new zqf(this, 27));
        bpn0 bpn0Var = new bpn0(new b1j(this, 22));
        VideoSearchFiltersImpl videoSearchFiltersImpl = new VideoSearchFiltersImpl();
        this.z = videoSearchFiltersImpl;
        u4a u4aVar = this.m;
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory = new VideoCatalogSearchRequestFactory(u4aVar.b.s.N(), videoSearchFiltersImpl, (VideoCatalogSearchRequestFactory.VideoEntrypoint) null, 12);
        VideoCatalogSearchRequestFactory.VideoEntrypoint videoEntrypoint = VideoCatalogSearchRequestFactory.VideoEntrypoint.GlobalSearchTab;
        videoCatalogSearchRequestFactory.d = videoEntrypoint;
        s3q0 s3q0Var = s3q0.a;
        VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory2 = new VideoCatalogSearchRequestFactory(this.m.b.s.N(), videoSearchFiltersImpl, (VideoCatalogSearchRequestFactory.VideoEntrypoint) null, 12);
        videoCatalogSearchRequestFactory2.d = videoEntrypoint;
        pzh0 pzh0Var2 = new pzh0(this, u4aVar, videoCatalogSearchRequestFactory, videoCatalogSearchRequestFactory2, new bzj(this, 14), fragmentActivity);
        GlobalSearchVideoRootVh globalSearchVideoRootVh = this;
        globalSearchVideoRootVh.A = pzh0Var2;
        bpn0 bpn0Var2 = new bpn0(new vi0(21));
        globalSearchVideoRootVh.B = bpn0Var2;
        if (videoCatalogSearchRequestFactory.p == null || !((Boolean) bpn0Var2.getValue()).booleanValue()) {
            pzh0Var = pzh0Var2;
        } else {
            pzh0Var = pzh0Var2;
            ou1 ou1Var = new ou1(1, pzh0Var, pzh0.class, "reloadWithNewSearchParams", "reloadWithNewSearchParams(Lcom/vk/search/params/api/VideoSearchFilters;)V", 0, 3);
            int i = 0;
            int i2 = 0;
            i2u i2uVar = new i2u(i2, globalSearchVideoRootVh, GlobalSearchVideoRootVh.class, "showParamsInfoView", "showParamsInfoView()V", i, 0);
            Class<GlobalSearchVideoRootVh> cls = GlobalSearchVideoRootVh.class;
            String str = "hideParamsInfoView";
            String str2 = "hideParamsInfoView()V";
            globalSearchVideoRootVh = this;
            wet0Var = new wet0(ou1Var, i2uVar, new jw3(i2, globalSearchVideoRootVh, cls, str, str2, i, 1), new whe(1, pzh0Var, pzh0.class, "onFilterUpdate", "onFilterUpdate(Z)V", 0, 6), videoSearchFiltersImpl, ((Boolean) bpn0Var.getValue()).booleanValue(), 32);
        }
        globalSearchVideoRootVh.C = wet0Var;
        globalSearchVideoRootVh.D = pzh0Var.c();
        globalSearchVideoRootVh.E = "";
    }

    @Override // xsna.vxh0
    public final void E2(String str) {
        this.A.o.E2(str);
    }

    @Override // xsna.n0i0
    public final boolean F0() {
        uxh0 uxh0Var = this.r;
        if (uxh0Var != null) {
            return uxh0Var.F0();
        }
        return false;
    }

    @Override // xsna.vxh0
    public final void O(String str, SearchInputMethod searchInputMethod) {
        this.A.o.c3().j().invoke(str, searchInputMethod);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        this.A.getClass();
        b.a(b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    @Override // xsna.n0i0
    public final void Tg() {
        wet0 wet0Var = this.C;
        if (wet0Var != null) {
            wet0Var.d(this.b);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        return this.A.g();
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) super.X(layoutInflater, viewGroup, null);
        wet0 wet0Var = this.C;
        if (wet0Var != null && ((Boolean) this.B.getValue()).booleanValue()) {
            SearchParametersBottomView searchParametersBottomView = (SearchParametersBottomView) ((ViewGroup) layoutInflater.inflate(R.layout.catalog2_video_search_filter, viewGroup2, true)).findViewById(R.id.search_parameters_view);
            this.F = searchParametersBottomView;
            if (searchParametersBottomView == null) {
                searchParametersBottomView = null;
            }
            searchParametersBottomView.setOnCloseClickListener(new x16(wet0Var, 12));
            SearchParametersBottomView searchParametersBottomView2 = this.F;
            (searchParametersBottomView2 != null ? searchParametersBottomView2 : null).setOnClickListener(new bym(2, wet0Var, this));
            VideoSearchFiltersImpl videoSearchFiltersImpl = this.z;
            if (!videoSearchFiltersImpl.I()) {
                o0();
                izs<Boolean, s3q0> izsVar = wet0Var.e;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.valueOf(videoSearchFiltersImpl.I()));
                }
            }
        }
        this.G = this.A.s();
        return viewGroup2;
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        c cVar = this.G;
        if (cVar != null) {
            cVar.dispose();
        }
        super.Y();
    }

    @Override // xsna.s180
    public final boolean a0() {
        return this.A.g();
    }

    @Override // xsna.vxh0
    public final void a3(String str) {
        this.A.o.a3(str);
    }

    @Override // xsna.n0i0
    public final void ca(boolean z) {
        wet0 wet0Var = this.C;
        if (wet0Var != null) {
            wet0Var.c(z);
        }
    }

    @Override // xsna.n0i0
    public final String e6() {
        return this.E;
    }

    @Override // xsna.n0i0
    public final void f1(boolean z, boolean z2) {
        uxh0 uxh0Var = this.r;
        if (uxh0Var != null) {
            uxh0Var.f1(z, z2);
        }
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final SearchResultsVh j0() {
        return this.D;
    }

    @Override // xsna.n0i0
    public final String j9() {
        String i;
        uxh0 uxh0Var = this.r;
        return (uxh0Var == null || (i = uxh0Var.i()) == null) ? "" : i;
    }

    @Override // xsna.n0i0
    public final void jn(String str, boolean z) {
        uxh0 uxh0Var = this.r;
        if (uxh0Var != null) {
            uxh0Var.X1(str, z);
        }
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_VIDEO;
    }

    @Override // xsna.vxh0
    public final void n() {
        this.A.o.n();
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh
    public final void n0(SearchInputMethod searchInputMethod) {
        this.A.d.o(searchInputMethod);
    }

    public final void o0() {
        wet0 wet0Var = this.C;
        String f = wet0Var != null ? wet0Var.f(this.b) : null;
        SearchParametersBottomView searchParametersBottomView = this.F;
        if (searchParametersBottomView == null) {
            searchParametersBottomView = null;
        }
        searchParametersBottomView.setParameters(f);
        SearchParametersBottomView searchParametersBottomView2 = this.F;
        if (searchParametersBottomView2 == null) {
            searchParametersBottomView2 = null;
        }
        bwt0.p0(searchParametersBottomView2, true);
        RecyclerPaginatedView ck = this.A.c().b.ck();
        if (ck != null) {
            SearchParametersBottomView searchParametersBottomView3 = this.F;
            awt0.x(ck, 0, 0, 0, (searchParametersBottomView3 != null ? searchParametersBottomView3 : null).getPanelHeight(), 7);
        }
    }

    @Override // xsna.zth0
    public final SearchResultsImplVh ob(VideoCatalogSearchRequestFactory videoCatalogSearchRequestFactory, boolean z, wzs wzsVar) {
        return i0(this.m, videoCatalogSearchRequestFactory, !z, wzsVar);
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.D.onPause();
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.D.onResume();
    }

    @Override // xsna.vxh0
    public final void qb() {
        this.A.j();
    }

    @Override // xsna.n0i0
    public final void ul() {
        uxh0 uxh0Var = this.r;
        if (uxh0Var != null) {
            uxh0Var.d0();
        }
    }

    @Override // xsna.n0i0
    public final void y6() {
        uxh0 uxh0Var = this.r;
        if (uxh0Var != null) {
            uxh0Var.x9();
        }
    }

    @Override // com.vk.search.ui.impl.catalog.roots.GlobalSearchCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        UIBlockSearchSuggestion uIBlockSearchSuggestion;
        Activity activity = this.b;
        pzh0 pzh0Var = this.A;
        if (i == R.id.search_suggestion) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                pzh0Var.q(uIBlockSearchSuggestion, activity);
                return;
            }
            return;
        }
        if (i == R.id.search_suggestion_close) {
            uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                pzh0Var.o(uIBlockSearchSuggestion);
                return;
            }
            return;
        }
        if (i != R.id.content || uIBlock == null) {
            return;
        }
        pzh0Var.a(uIBlock, activity);
    }

    @Override // xsna.n0i0
    public final void z0(boolean z, boolean z2) {
        uxh0 uxh0Var = this.r;
        if (uxh0Var != null) {
            uxh0Var.z0(z, z2);
        }
    }
}
