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
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.dha;
import xsna.e0a;
import xsna.epx;
import xsna.esh0;
import xsna.f5z;
import xsna.g0t;
import xsna.kbe;
import xsna.msy;
import xsna.nda;
import xsna.o5a;
import xsna.orp;
import xsna.qqh0;
import xsna.rda;
import xsna.sfg;
import xsna.sok0;
import xsna.t8a;
import xsna.xzs;
import xsna.z34;
import xsna.zqh0;

/* compiled from: GlobalSearchFeatureCatalogRootVh.kt */
/* loaded from: classes16.dex */
public abstract class GlobalSearchFeatureCatalogRootVh extends CatalogRootViewHolder implements CatalogViewHolder, rda, ResumableViewHolder {
    public final zqh0 p;
    public ViewGroup q;
    public final bpn0 r;
    public final Object s;
    public final Object t;

    /* compiled from: GlobalSearchFeatureCatalogRootVh.kt */
    public static final /* synthetic */ class a implements dha, g0t {
        public a() {
        }

        @Override // xsna.dha
        public final MobileOfficialAppsCoreNavStat$EventScreen a() {
            return GlobalSearchFeatureCatalogRootVh.this.l0();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dha) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, GlobalSearchFeatureCatalogRootVh.this, GlobalSearchFeatureCatalogRootVh.class, "getStatEventScreen", "getStatEventScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public GlobalSearchFeatureCatalogRootVh(Bundle bundle, Activity activity, o5a o5aVar, zqh0 zqh0Var, GlobalSearchFeatureCatalogFragment globalSearchFeatureCatalogFragment) {
        super(bundle, (Class) null, activity, (nda) o5aVar, true, (f5z) globalSearchFeatureCatalogFragment, 32);
        this.p = zqh0Var;
        this.r = new bpn0(new kbe(this, 26));
        z34 z34Var = new z34(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, z34Var);
        this.t = msy.a(lazyThreadSafetyMode, new sfg(this, 22));
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        searchStatInfoProvider.getClass();
        searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        k0().N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public orp Q() {
        return new qqh0(new a(), 2);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (((Boolean) this.s.getValue()).booleanValue()) {
            ((t8a) this.t.getValue()).a();
        }
        View inflate = layoutInflater.inflate(R.layout.catalog_search_layout, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.q = viewGroup2;
        if (viewGroup2 != null) {
            viewGroup2.addView(k0().k5(layoutInflater, this.q, null));
        }
        f5z f5zVar = this.d;
        if (f5zVar == null) {
            return inflate;
        }
        this.p.k((esh0) ((Pair) this.r.getValue()).j(), f5zVar);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void Y() {
        if (((Boolean) this.s.getValue()).booleanValue()) {
            t8a t8aVar = (t8a) this.t.getValue();
            t8aVar.e = null;
            t8aVar.d.dispose();
        }
        k0().L();
    }

    public abstract SearchRequestFactory i0();

    public sok0 j0() {
        return new e0a(this.b);
    }

    public final CommonSearchResultsVh k0() {
        return (CommonSearchResultsVh) ((Pair) this.r.getValue()).i();
    }

    public abstract MobileOfficialAppsCoreNavStat$EventScreen l0();

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        k0().onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onPause() {
        k0().onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void onResume() {
        k0().onResume();
    }

    @Override // xsna.rda
    public final void s() {
        k0().s();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
    }

    public void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
