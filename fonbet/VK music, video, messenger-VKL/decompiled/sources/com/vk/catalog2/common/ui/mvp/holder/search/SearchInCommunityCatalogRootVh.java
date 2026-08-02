package com.vk.catalog2.common.ui.mvp.holder.search;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.EmptyScreenWithTextVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.community.SearchInCommunityVkTabVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.common.id.UserId;
import com.vk.search.integration.api.SearchTab;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import xsna.bdz;
import xsna.bn7;
import xsna.cfp0;
import xsna.epx;
import xsna.f5z;
import xsna.g3a;
import xsna.h630;
import xsna.j5g;
import xsna.kzn0;
import xsna.lrk;
import xsna.ltz;
import xsna.m3a;
import xsna.mzt0;
import xsna.nf0;
import xsna.nvh0;
import xsna.o5a;
import xsna.odc0;
import xsna.p4g;
import xsna.pvh0;
import xsna.qvh0;
import xsna.rtn0;
import xsna.swp;
import xsna.tzv;
import xsna.u4a;
import xsna.wf40;
import xsna.x0a;
import xsna.x850;
import xsna.zmc;
import xsna.zqh0;

/* compiled from: SearchInCommunityCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class SearchInCommunityCatalogRootVh extends SearchFeatureCatalogRootVh implements rtn0, mzt0 {
    public final kzn0 A;
    public final zmc B;
    public tzv C;
    public lrk D;
    public final SearchFeatureResultsWithTabsVh E;
    public final zqh0 u;
    public final f5z v;
    public final nvh0 w;
    public final g3a x;
    public final SearchInCommunityVkTabVh y;
    public final TabsOrListVh z;

    public SearchInCommunityCatalogRootVh() {
        throw null;
    }

    public SearchInCommunityCatalogRootVh(UserId userId, Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, f5z f5zVar, SearchTab searchTab) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, new x850(f5zVar, 23));
        this.u = zqh0Var;
        this.v = f5zVar;
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, this, null, null, null, null, null, 8062);
        nvh0 nvh0Var = new nvh0(this.m.b.s.N(), userId, searchTab);
        this.w = nvh0Var;
        u4a u4aVar = this.m;
        g3a S = u4aVar.b.s.S(u4aVar, null);
        S.i = nvh0Var;
        this.x = S;
        SearchInCommunityVkTabVh searchInCommunityVkTabVh = new SearchInCommunityVkTabVh(viewPagerVh);
        this.y = searchInCommunityVkTabVh;
        TabsOrListVh tabsOrListVh = new TabsOrListVh(this.m, null, 0, null, false, S, N(), viewPagerVh, searchInCommunityVkTabVh, new EmptyScreenWithTextVh(), false, null, 230588);
        this.z = tabsOrListVh;
        this.A = new kzn0(S, nvh0Var, tabsOrListVh);
        this.B = new zmc(new x0a(new odc0(this, 12), new wf40(this, 25)), new pvh0(this, 0));
        this.E = new SearchFeatureResultsWithTabsVh(tabsOrListVh);
        SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
        searchStatInfoProvider.getClass();
        searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.E.N6(uIBlock);
        tzv tzvVar = this.C;
        if (tzvVar != null) {
            tzvVar.invoke();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 20);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = this.E.k5(layoutInflater, viewGroup, null);
        this.t = (ViewGroup) k5;
        this.u.k(this.A, this.v);
        k5.post(new nf0(this, 12));
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.E.L();
        this.C = null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c f0(m3a m3aVar) {
        return ((f) m3aVar.b).subscribe(new bdz(new h630(this, m3aVar), 19));
    }

    @Override // xsna.rtn0
    public final void g(SearchTab searchTab) {
        Pair i;
        this.w.q = searchTab;
        int i2 = qvh0.$EnumSwitchMapping$1[searchTab.ordinal()];
        CatalogDataType catalogDataType = i2 != 5 ? i2 != 6 ? CatalogDataType.DATA_TYPE_WALL : CatalogDataType.DATA_TYPE_WALL : CatalogDataType.DATA_TYPE_VIDEO_VIDEOS;
        SearchInCommunityVkTabVh searchInCommunityVkTabVh = this.y;
        ArrayList<UIBlock> arrayList = searchInCommunityVkTabVh.e;
        if (arrayList == null || (i = p4g.i(arrayList, new bn7(catalogDataType, 13))) == null) {
            return;
        }
        int intValue = ((Number) i.d()).intValue();
        searchInCommunityVkTabVh.b.A(((UIBlock) i.g()).c);
        VkTabs vkTabs = searchInCommunityVkTabVh.c;
        VkTabs vkTabs2 = vkTabs == null ? null : vkTabs;
        if (vkTabs == null) {
            vkTabs = null;
        }
        VkTabs.k(vkTabs2, vkTabs.f(intValue));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final CommonSearchResultsVh j0() {
        return this.E;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen k0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_NEWS_COMMUNITY;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final void l0(tzv tzvVar) {
        this.C = tzvVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh
    public final void n0(lrk lrkVar) {
        this.D = lrkVar;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.E.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        super.onPause();
        this.E.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        super.onResume();
        this.E.onResume();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        this.z.i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, xsna.rda
    public final void s() {
        this.E.s();
    }

    @Override // xsna.mzt0
    public final void u(UIBlock uIBlock) {
        lrk lrkVar;
        CatalogDataType catalogDataType;
        SearchInCommunityVkTabVh searchInCommunityVkTabVh = this.y;
        ArrayList<UIBlock> arrayList = searchInCommunityVkTabVh.e;
        SearchTab searchTab = null;
        if (arrayList != null) {
            Iterator<UIBlock> it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (epx.f(it.next().b, uIBlock != null ? uIBlock.b : null)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            VkTabs vkTabs = searchInCommunityVkTabVh.c;
            VkTabs vkTabs2 = vkTabs == null ? null : vkTabs;
            if (vkTabs == null) {
                vkTabs = null;
            }
            VkTabs.k(vkTabs2, vkTabs.f(i));
            ArrayList<CatalogDataType> arrayList2 = searchInCommunityVkTabVh.f;
            if (arrayList2 != null && (catalogDataType = (CatalogDataType) j5g.b0(i, arrayList2)) != null) {
                int i2 = qvh0.$EnumSwitchMapping$0[catalogDataType.ordinal()];
                searchTab = i2 != 1 ? i2 != 2 ? SearchTab.WALL : SearchTab.WALL : SearchTab.VIDEOS;
            }
        }
        if (searchTab == null || (lrkVar = this.D) == null) {
            return;
        }
        lrkVar.invoke(searchTab);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.z.i8(ltz.a);
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
        this.B.a(this.b, uIBlock, searchStatInfoProvider.b(type, str, false));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.SearchFeatureCatalogRootVh, xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
