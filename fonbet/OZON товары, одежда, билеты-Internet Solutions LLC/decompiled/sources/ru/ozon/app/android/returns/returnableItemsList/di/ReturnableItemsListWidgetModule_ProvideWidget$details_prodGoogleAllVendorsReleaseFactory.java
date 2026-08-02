package ru.ozon.app.android.returns.returnableItemsList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.returnableItemsList.core.ReturnableItemsListConfig;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewMapper.ReturnableItemsListViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewMapper.ReturnableItemsTitleViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewMapper.TotalMobileViewMapper;

/* loaded from: classes7.dex */
public final class ReturnableItemsListWidgetModule_ProvideWidget$details_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$details_prodGoogleAllVendorsRelease(ReturnableItemsListWidgetModule returnableItemsListWidgetModule, ReturnableItemsListConfig returnableItemsListConfig, ReturnableItemsTitleViewMapper returnableItemsTitleViewMapper, ReturnableItemsListViewMapper returnableItemsListViewMapper, PaginationMobileViewMapper paginationMobileViewMapper, TotalMobileViewMapper totalMobileViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Widget2 provideWidget$details_prodGoogleAllVendorsRelease = returnableItemsListWidgetModule.provideWidget$details_prodGoogleAllVendorsRelease(returnableItemsListConfig, returnableItemsTitleViewMapper, returnableItemsListViewMapper, paginationMobileViewMapper, totalMobileViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideWidget$details_prodGoogleAllVendorsRelease);
        return provideWidget$details_prodGoogleAllVendorsRelease;
    }
}
