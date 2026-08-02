package com.vk.search.ui.impl.catalog;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchAll;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchAllRequestFactory;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import kotlin.NoWhenBranchMatchedException;
import xsna.irh0;
import xsna.o5a;

/* compiled from: SearchAllFeatureCatalogFragment.kt */
/* loaded from: classes5.dex */
public final class SearchAllFeatureCatalogFragment extends GlobalSearchFeatureCatalogFragment {
    public final FragmentWithGlobalSearch$EntryMethod S;

    /* compiled from: SearchAllFeatureCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public SearchAllFeatureCatalogFragment() {
        super(GlobalSearchAllCatalogRootVh.class);
        this.S = FragmentWithGlobalSearch$EntryMethod.Unknown;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        CatalogGetSearchAll.EntryMethod entryMethod;
        GlobalSearchAllCatalogRootVh globalSearchAllCatalogRootVh = new GlobalSearchAllCatalogRootVh(requireArguments(), kn(), new o5a(this), af(), this);
        CatalogGetSearchAllRequestFactory catalogGetSearchAllRequestFactory = (CatalogGetSearchAllRequestFactory) globalSearchAllCatalogRootVh.u.getValue();
        switch (GlobalSearchAllCatalogRootVh.a.$EnumSwitchMapping$0[this.S.ordinal()]) {
            case 1:
                entryMethod = CatalogGetSearchAll.EntryMethod.Unknown;
                break;
            case 2:
                entryMethod = CatalogGetSearchAll.EntryMethod.OtherTab;
                break;
            case 3:
                entryMethod = CatalogGetSearchAll.EntryMethod.FeedScreenSearchIcon;
                break;
            case 4:
                entryMethod = CatalogGetSearchAll.EntryMethod.HomeBottomIconLongTap;
                break;
            case 5:
                entryMethod = CatalogGetSearchAll.EntryMethod.ServiceScreenSearchIcon;
                break;
            case 6:
                entryMethod = CatalogGetSearchAll.EntryMethod.ServiceScreenQueryView;
                break;
            case 7:
                entryMethod = CatalogGetSearchAll.EntryMethod.ServiceBottomIconLongTap;
                break;
            case 8:
                entryMethod = CatalogGetSearchAll.EntryMethod.LeftTabletMenuSearchIconClick;
                break;
            case 9:
                entryMethod = CatalogGetSearchAll.EntryMethod.OverviewScreenSearchIcon;
                break;
            case 10:
                entryMethod = CatalogGetSearchAll.EntryMethod.OverviewBottomIconLongTap;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        catalogGetSearchAllRequestFactory.s = entryMethod;
        return globalSearchAllCatalogRootVh;
    }

    @Override // com.vk.search.ui.impl.catalog.GlobalSearchFeatureCatalogFragment
    public final irh0 go() {
        return new irh0(false, false, 503);
    }
}
