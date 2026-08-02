package ru.ozon.app.android.storefront.widgets.naviCategories.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesConfig;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.big.DoubleNaviCategoriesViewMapper;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.empty.EmptyNaviCategoriesViewMapper;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.single.SingleNaviCategoriesViewMapper;

/* loaded from: classes7.dex */
public final class NaviCategoriesModule_ProvideWidgets$storefront_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease(NaviCategoriesModule naviCategoriesModule, NaviCategoriesConfig naviCategoriesConfig, SingleNaviCategoriesViewMapper singleNaviCategoriesViewMapper, DoubleNaviCategoriesViewMapper doubleNaviCategoriesViewMapper, EmptyNaviCategoriesViewMapper emptyNaviCategoriesViewMapper) {
        Set<Widget2> provideWidgets$storefront_prodGoogleAllVendorsRelease = naviCategoriesModule.provideWidgets$storefront_prodGoogleAllVendorsRelease(naviCategoriesConfig, singleNaviCategoriesViewMapper, doubleNaviCategoriesViewMapper, emptyNaviCategoriesViewMapper);
        j.d(provideWidgets$storefront_prodGoogleAllVendorsRelease);
        return provideWidgets$storefront_prodGoogleAllVendorsRelease;
    }
}
