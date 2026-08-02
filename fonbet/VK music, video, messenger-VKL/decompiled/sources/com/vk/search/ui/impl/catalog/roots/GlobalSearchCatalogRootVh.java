package com.vk.search.ui.impl.catalog.roots;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SearchEntityCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.ResumableViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalStackedListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityPerson;
import com.vk.lists.c;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.b;
import com.vk.toggle.features.CoreFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dha;
import xsna.e0a;
import xsna.epx;
import xsna.f5z;
import xsna.fha;
import xsna.fll;
import xsna.fpf0;
import xsna.g0t;
import xsna.h13;
import xsna.j5g;
import xsna.kea;
import xsna.km1;
import xsna.m7m;
import xsna.msy;
import xsna.nda;
import xsna.o5a;
import xsna.orp;
import xsna.pr;
import xsna.qqh0;
import xsna.rda;
import xsna.t8a;
import xsna.u4a;
import xsna.uxh0;
import xsna.vd7;
import xsna.w1u;
import xsna.wda;
import xsna.wzs;
import xsna.x1u;
import xsna.xzs;
import xsna.yms;
import xsna.z3v;

/* compiled from: GlobalSearchCatalogRootVh.kt */
/* loaded from: classes5.dex */
public abstract class GlobalSearchCatalogRootVh extends CatalogRootViewHolder implements CatalogViewHolder, rda, wda, ResumableViewHolder {
    public String p;
    public ViewGroup q;
    public uxh0 r;
    public DiscoverSearchFragment.d.a s;
    public boolean t;
    public final fha u;
    public final Object v;
    public final Object w;

    /* compiled from: GlobalSearchCatalogRootVh.kt */
    public static final /* synthetic */ class a implements dha, g0t {
        public a() {
        }

        @Override // xsna.dha
        public final MobileOfficialAppsCoreNavStat$EventScreen a() {
            return GlobalSearchCatalogRootVh.this.k0();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dha) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, GlobalSearchCatalogRootVh.this, GlobalSearchCatalogRootVh.class, "getStatEventScreen", "getStatEventScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public GlobalSearchCatalogRootVh(Bundle bundle, Activity activity, o5a o5aVar, f5z f5zVar) {
        super(bundle, (Class) null, activity, (nda) o5aVar, true, f5zVar, 32);
        this.p = "";
        u4a.a aVar = this.m.b;
        this.u = new fha(aVar.d, aVar.e, new yms(0, m7m.a(activity).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 1), new w1u(m7m.a(activity).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0));
        h13 h13Var = new h13(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = msy.a(lazyThreadSafetyMode, h13Var);
        this.w = msy.a(lazyThreadSafetyMode, new km1(11, this, activity));
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        searchStatInfoProvider.getClass();
        searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
    }

    public static boolean l0(UIBlockList uIBlockList) {
        boolean z;
        UIBlock uIBlock = (UIBlock) j5g.a0(uIBlockList.y);
        if (uIBlock instanceof UIBlockSearchEntityPerson) {
            CatalogViewStyle catalogViewStyle = ((UIBlockSearchEntityPerson) uIBlock).l;
            SearchEntityCatalogViewStyle searchEntityCatalogViewStyle = catalogViewStyle instanceof SearchEntityCatalogViewStyle ? (SearchEntityCatalogViewStyle) catalogViewStyle : null;
            if (searchEntityCatalogViewStyle != null && searchEntityCatalogViewStyle.b != SearchEntityCatalogViewStyle.EntityStyle.Flat) {
                z = true;
                return !z;
            }
        }
        z = false;
        return !z;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        j0().N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public orp Q() {
        return new qqh0(new a(), 2);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.a();
        if (((Boolean) this.v.getValue()).booleanValue()) {
            ((t8a) this.w.getValue()).a();
        }
        View inflate = layoutInflater.inflate(R.layout.catalog_search_layout, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.q = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.addView(j0().k5(layoutInflater, this.q, null));
        }
        SearchResultsVh j0 = j0();
        Context context = viewGroup2.getContext();
        CoreFeatures coreFeatures = CoreFeatures.MOURNING_MODE;
        coreFeatures.getClass();
        j0.setProgressDrawableFactory(b.A.a(coreFeatures) ? new fll(context) : new fll(context));
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void Y() {
        j0().L();
        this.u.b();
        if (((Boolean) this.v.getValue()).booleanValue()) {
            t8a t8aVar = (t8a) this.w.getValue();
            t8aVar.e = null;
            t8aVar.d.dispose();
        }
    }

    @Override // xsna.wda
    public final boolean c0() {
        UIBlockList O0 = j0().O0();
        if (O0 != null) {
            return l0(O0);
        }
        return true;
    }

    @Override // xsna.wda
    public void d0(String str, String str2, SearchInputMethod searchInputMethod) {
        n0(searchInputMethod);
        this.p = str;
        SearchResultsVh.cb(j0(), str, str2, null, false, null, false, 60);
    }

    public final SearchResultsImplVh i0(u4a u4aVar, SearchRequestFactory searchRequestFactory, boolean z, wzs wzsVar) {
        u4a.a aVar = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        kea keaVar = new kea(searchRequestFactory, catalogConfiguration.K(u4aVar), u4aVar, new vd7(aVar.e), false, null, null, false, null, null, aVar.H, null, null, false, new x1u(2, this, GlobalSearchCatalogRootVh.class, "onBlocksUpdatedCallback", "onBlocksUpdatedCallback(Lcom/vk/catalog2/common/dto/ui/UIBlockList;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)V", 0, 0), 61376);
        pr prVar = new pr(17);
        c.h hVar = new c.h((c.m) keaVar);
        hVar.o = prVar;
        return new SearchResultsImplVh(searchRequestFactory, keaVar, new VerticalStackedListVh(catalogConfiguration, hVar, keaVar, u4aVar, N(), R.layout.catalog_search_all_discover_search_result_list_vertical, new VerticalListVh.a(new z3v(false), null, null, 52), new e0a(this.b), 352), null, null, null, wzsVar, new SearchResultsVh.a(z, 90), null, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
    }

    public abstract SearchResultsVh j0();

    public abstract MobileOfficialAppsCoreNavStat$EventScreen k0();

    public abstract void n0(SearchInputMethod searchInputMethod);

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        j0().onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onPause() {
        j0().onPause();
        this.t = false;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onResume() {
        j0().onResume();
        this.t = true;
        DiscoverSearchFragment.d.a aVar = this.s;
        if (aVar != null) {
            aVar.a(c0());
        }
    }

    @Override // xsna.rda
    public final void s() {
        j0().s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
    }

    @Override // xsna.mba
    public void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
