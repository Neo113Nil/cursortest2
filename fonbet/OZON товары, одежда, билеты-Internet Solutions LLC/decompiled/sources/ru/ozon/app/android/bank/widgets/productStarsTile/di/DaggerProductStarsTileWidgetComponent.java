package ru.ozon.app.android.bank.widgets.productStarsTile.di;

import Jb.j;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.bank.widgets.productStarsTile.di.ProductStarsTileWidgetComponent;
import ru.ozon.app.android.bank.widgets.productStarsTile.presentation.ProductStarsTileWidgetViewModel;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;

/* loaded from: classes11.dex */
public final class DaggerProductStarsTileWidgetComponent {

    private static final class Factory implements ProductStarsTileWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.bank.widgets.productStarsTile.di.ProductStarsTileWidgetComponent.Factory
        public ProductStarsTileWidgetComponent create(CartServiceApi cartServiceApi, ActionComponentApi actionComponentApi) {
            cartServiceApi.getClass();
            actionComponentApi.getClass();
            return new ProductStarsTileWidgetComponentImpl(cartServiceApi, actionComponentApi, 0);
        }

        private Factory() {
        }
    }

    private static final class ProductStarsTileWidgetComponentImpl implements ProductStarsTileWidgetComponent {
        private final ActionComponentApi actionComponentApi;
        private final CartServiceApi cartServiceApi;
        private final ProductStarsTileWidgetComponentImpl productStarsTileWidgetComponentImpl;

        /* synthetic */ ProductStarsTileWidgetComponentImpl(CartServiceApi cartServiceApi, ActionComponentApi actionComponentApi, int i11) {
            this(cartServiceApi, actionComponentApi);
        }

        @Override // ru.ozon.app.android.bank.widgets.productStarsTile.di.ProductStarsTileWidgetComponent
        public ProductStarsTileWidgetViewModel getViewModel() {
            ActionV2Repository actionRepository = this.actionComponentApi.getActionRepository();
            j.c(actionRepository);
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            return new ProductStarsTileWidgetViewModel(actionRepository, cartService);
        }

        private ProductStarsTileWidgetComponentImpl(CartServiceApi cartServiceApi, ActionComponentApi actionComponentApi) {
            this.productStarsTileWidgetComponentImpl = this;
            this.actionComponentApi = actionComponentApi;
            this.cartServiceApi = cartServiceApi;
        }
    }

    public static ProductStarsTileWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
