package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di;

import EZ.h;
import Jb.j;
import androidx.appcompat.app.g;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.ProductSelectorActivity;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.ProductSelectorActivity_MembersInjector;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.ProductSelectorNavigator;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di.ProductSelectorComponent;

/* loaded from: classes13.dex */
public final class DaggerProductSelectorComponent {

    private static final class Factory implements ProductSelectorComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di.ProductSelectorComponent.Factory
        public ProductSelectorComponent create(NavigationComponentApi navigationComponentApi, g gVar) {
            navigationComponentApi.getClass();
            gVar.getClass();
            return new ProductSelectorComponentImpl(new ProductSelectorNavModule(), navigationComponentApi, gVar, 0);
        }

        private Factory() {
        }
    }

    private static final class ProductSelectorComponentImpl implements ProductSelectorComponent {
        private final g activity;
        private final NavigationComponentApi navigationComponentApi;
        private final ProductSelectorComponentImpl productSelectorComponentImpl;
        private final ProductSelectorNavModule productSelectorNavModule;

        /* synthetic */ ProductSelectorComponentImpl(ProductSelectorNavModule productSelectorNavModule, NavigationComponentApi navigationComponentApi, g gVar, int i11) {
            this(productSelectorNavModule, navigationComponentApi, gVar);
        }

        private ProductSelectorActivity injectProductSelectorActivity(ProductSelectorActivity productSelectorActivity) {
            h navigatorHolder = this.navigationComponentApi.getNavigatorHolder();
            j.c(navigatorHolder);
            ProductSelectorActivity_MembersInjector.injectNavigatorHolder(productSelectorActivity, navigatorHolder);
            GZ.g ozonRouter = this.navigationComponentApi.getOzonRouter();
            j.c(ozonRouter);
            ProductSelectorActivity_MembersInjector.injectRouter(productSelectorActivity, ozonRouter);
            ProductSelectorActivity_MembersInjector.injectNavigator(productSelectorActivity, productSelectorNavigator());
            return productSelectorActivity;
        }

        private ProductSelectorNavigator productSelectorNavigator() {
            return ProductSelectorNavModule_ProvideProductSelectorNavigator$search_prodGoogleAllVendorsReleaseFactory.provideProductSelectorNavigator$search_prodGoogleAllVendorsRelease(this.productSelectorNavModule, this.activity);
        }

        @Override // ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di.ProductSelectorComponent
        public void inject(ProductSelectorActivity productSelectorActivity) {
            injectProductSelectorActivity(productSelectorActivity);
        }

        private ProductSelectorComponentImpl(ProductSelectorNavModule productSelectorNavModule, NavigationComponentApi navigationComponentApi, g gVar) {
            this.productSelectorComponentImpl = this;
            this.navigationComponentApi = navigationComponentApi;
            this.productSelectorNavModule = productSelectorNavModule;
            this.activity = gVar;
        }
    }

    public static ProductSelectorComponent.Factory factory() {
        return new Factory(0);
    }
}
