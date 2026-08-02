package com.vk.search.integration.followers.impl.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetPeopleSearchRequestFactory;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureResultsVh;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.time.DurationUnit;
import xsna.asu0;
import xsna.bnc0;
import xsna.cfp0;
import xsna.cth0;
import xsna.dha;
import xsna.dth0;
import xsna.ems;
import xsna.eoo;
import xsna.epx;
import xsna.fha;
import xsna.fpf0;
import xsna.g0t;
import xsna.jth0;
import xsna.k7m;
import xsna.kpd;
import xsna.kss;
import xsna.lkz;
import xsna.m3a;
import xsna.m7m;
import xsna.n0q0;
import xsna.nwp0;
import xsna.o5a;
import xsna.orp;
import xsna.qqh0;
import xsna.s41;
import xsna.u4a;
import xsna.xd40;
import xsna.xwk;
import xsna.xzs;
import xsna.zk30;
import xsna.zno;
import xsna.zqh0;

/* compiled from: SearchFollowersCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class SearchFollowersCatalogRootVh extends SearchFeatureCatalogRootVh implements n0q0 {
    public final kss u;
    public final SearchFeatureResultsVh v;
    public final fha w;
    public final b x;
    public final ArrayList y;
    public final nwp0 z;

    /* compiled from: SearchFollowersCatalogRootVh.kt */
    public static final /* synthetic */ class a implements dha, g0t {
        public a() {
        }

        @Override // xsna.dha
        public final MobileOfficialAppsCoreNavStat$EventScreen a() {
            SearchFollowersCatalogRootVh.this.getClass();
            return MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_ALL_FOLLOWERS_SEARCH;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof dha) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, SearchFollowersCatalogRootVh.this, SearchFollowersCatalogRootVh.class, "getStatEventScreen", "getStatEventScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public SearchFollowersCatalogRootVh(UserId userId, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, jth0.d dVar, kss kssVar) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, dVar);
        this.u = kssVar;
        this.v = i0(this.m, new CatalogGetPeopleSearchRequestFactory(this.m.b.s.N(), CatalogGetPeopleSearchRequestFactory.SearchPeopleEntrypoint.SearchFollowers, userId, null, null, 24));
        u4a.a aVar = this.m.b;
        this.w = new fha(aVar.d, aVar.e, new cth0(((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 0), new dth0(((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0));
        this.x = new b();
        this.y = new ArrayList();
        zno.a aVar2 = zno.c;
        this.z = new nwp0(eoo.e(10, DurationUnit.SECONDS));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final orp Q() {
        return new qqh0(new a(), 2);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.w.a();
        c subscribe = new i0(xwk.e().T().m().d, new s41(new bnc0(this, 6), 29)).a0(asu0.a.d()).subscribe(new zk30(new kpd(1, this, SearchFollowersCatalogRootVh.class, "handleSubscriptionChanges", "handleSubscriptionChanges(Lcom/vk/subscription/api/SubscriptionInfo;)V", 0, 9), 18));
        b bVar = this.x;
        bVar.b(subscribe);
        bVar.b(this.z.c.subscribe());
        return super.X(layoutInflater, viewGroup, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.w.b();
        this.x.e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        int i = 17;
        return new b(EmptyDisposable.INSTANCE, ((f) m3aVar.b).b0(ems.class).subscribe(new lkz(new xd40(this, i), i)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.v;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.PROFILE_ALL_FOLLOWERS_SEARCH;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        super.onPause();
        this.v.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        this.v.onResume();
    }
}
