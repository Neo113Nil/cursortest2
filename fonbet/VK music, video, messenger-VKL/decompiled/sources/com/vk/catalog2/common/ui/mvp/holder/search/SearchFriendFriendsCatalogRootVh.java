package com.vk.catalog2.common.ui.mvp.holder.search;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.search.CatalogGetPeopleSearchRequestFactory;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.subjects.f;
import xsna.cfp0;
import xsna.ems;
import xsna.fl30;
import xsna.m3a;
import xsna.o5a;
import xsna.wo40;
import xsna.wxt;
import xsna.zqh0;

/* compiled from: SearchFriendFriendsCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SearchFriendFriendsCatalogRootVh extends SearchFeatureCatalogRootVh {
    public final SearchFeatureResultsVh u;

    public SearchFriendFriendsCatalogRootVh(UserId userId, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, wxt wxtVar) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, wxtVar);
        this.u = i0(this.m, new CatalogGetPeopleSearchRequestFactory(this.m.b.s.N(), CatalogGetPeopleSearchRequestFactory.SearchPeopleEntrypoint.SearchFriendFriends, userId, null, null, 24));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return new io.reactivex.rxjava3.disposables.b(EmptyDisposable.INSTANCE, ((f) m3aVar.b).b0(ems.class).subscribe(new fl30(new wo40(15), 21)));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.u;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.FRIEND_FRIENDS_SEARCH;
    }
}
