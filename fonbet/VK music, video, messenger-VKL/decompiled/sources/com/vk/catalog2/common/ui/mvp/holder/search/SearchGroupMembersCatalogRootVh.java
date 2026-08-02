package com.vk.catalog2.common.ui.mvp.holder.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetPeopleSearchRequestFactory;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import xsna.auh0;
import xsna.buh0;
import xsna.cfp0;
import xsna.fha;
import xsna.fpf0;
import xsna.hyh0;
import xsna.k7m;
import xsna.m7m;
import xsna.o5a;
import xsna.u4a;
import xsna.yzh0;
import xsna.zqh0;

/* compiled from: SearchGroupMembersCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SearchGroupMembersCatalogRootVh extends ParametrizedSearchFeatureCatalogRootVh {
    public final fha v;
    public final SearchFeatureResultsVh w;

    public SearchGroupMembersCatalogRootVh(UserId userId, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, hyh0.b bVar, yzh0 yzh0Var, boolean z) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, bVar, yzh0Var, z);
        CatalogGetPeopleSearchRequestFactory catalogGetPeopleSearchRequestFactory = new CatalogGetPeopleSearchRequestFactory(this.m.b.s.N(), CatalogGetPeopleSearchRequestFactory.SearchPeopleEntrypoint.SearchPeopleCommunityMembers, null, userId, null, 20);
        u4a.a aVar = this.m.b;
        this.v = new fha(aVar.d, aVar.e, new auh0(((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 0), new buh0(((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0));
        this.w = i0(this.m, catalogGetPeopleSearchRequestFactory);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.ParametrizedSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.a();
        return super.X(layoutInflater, viewGroup, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.ParametrizedSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        super.Y();
        this.v.b();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.w;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.GROUP_MEMBERS_LIST;
    }
}
