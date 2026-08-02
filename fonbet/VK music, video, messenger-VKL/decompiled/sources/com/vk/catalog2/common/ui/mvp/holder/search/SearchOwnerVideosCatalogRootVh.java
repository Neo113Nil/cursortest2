package com.vk.catalog2.common.ui.mvp.holder.search;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogSearchRequestFactory;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import xsna.cfp0;
import xsna.f550;
import xsna.f5z;
import xsna.h440;
import xsna.hj60;
import xsna.m3a;
import xsna.o5a;
import xsna.pwh0;
import xsna.vk40;
import xsna.x0a;
import xsna.x850;
import xsna.zmc;
import xsna.zqh0;

/* compiled from: SearchOwnerVideosCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SearchOwnerVideosCatalogRootVh extends SearchFeatureCatalogRootVh {
    public final zqh0 u;
    public final f5z v;
    public final SearchFeatureResultsVh w;
    public final zmc x;

    public SearchOwnerVideosCatalogRootVh() {
        throw null;
    }

    public SearchOwnerVideosCatalogRootVh(long j, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, f5z f5zVar) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, new x850(f5zVar, 23));
        this.u = zqh0Var;
        this.v = f5zVar;
        this.w = i0(this.m, new VideoCatalogSearchRequestFactory(this.m.b.s.N(), new VideoSearchFiltersImpl(), VideoCatalogSearchRequestFactory.VideoEntrypoint.SearchOwnerVideos, j));
        this.x = new zmc(new x0a(new pwh0(this, 0), new hj60(this, 23)), new f550(this, 23));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return ((f) m3aVar.b).subscribe(new vk40(new h440(16, this, m3aVar), 17));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.w;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_OWNER_VIDEOS;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        String str;
        if (i != R.id.content || uIBlock == null) {
            return;
        }
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIP;
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null || (str = uIBlockVideo.B.r()) == null) {
            str = "";
        }
        this.x.a(this.b, uIBlock, searchStatInfoProvider.b(type, str, false));
    }
}
