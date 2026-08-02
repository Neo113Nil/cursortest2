package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation;

import EZ.h;
import GZ.g;
import Ib.b;

/* loaded from: classes13.dex */
public final class ProductSelectorActivity_MembersInjector implements b<ProductSelectorActivity> {
    public static void injectNavigator(ProductSelectorActivity productSelectorActivity, ProductSelectorNavigator productSelectorNavigator) {
        productSelectorActivity.navigator = productSelectorNavigator;
    }

    public static void injectNavigatorHolder(ProductSelectorActivity productSelectorActivity, h hVar) {
        productSelectorActivity.navigatorHolder = hVar;
    }

    public static void injectRouter(ProductSelectorActivity productSelectorActivity, g gVar) {
        productSelectorActivity.router = gVar;
    }
}
