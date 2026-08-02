package ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di;

import Jb.j;
import Vg.d;
import WZ.l;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent;
import ru.ozon.app.android.cart.common.di.CartComponentApi;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.di.ComposerComponentApi;

/* loaded from: classes11.dex */
public final class DaggerCartSplitV2TitleWidgetComponent {

    private static final class CartSplitV2TitleWidgetComponentImpl implements CartSplitV2TitleWidgetComponent {
        private final CartComponentApi cartComponentApi;
        private final CartSplitV2TitleWidgetComponentImpl cartSplitV2TitleWidgetComponentImpl;
        private final ComposerComponentApi composerComponentApi;
        private final CustomActionHandlersComponentApi customActionHandlersComponentApi;

        /* synthetic */ CartSplitV2TitleWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ComposerComponentApi composerComponentApi, int i11) {
            this(customActionHandlersComponentApi, cartComponentApi, composerComponentApi);
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent
        public CartEventsController getCartEventsController() {
            CartEventsController cartEventsController = this.cartComponentApi.getCartEventsController();
            j.c(cartEventsController);
            return cartEventsController;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent
        public d getCustomActionHandlersStoreFactory() {
            d customActionHandlersStoreFactory = this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
            j.c(customActionHandlersStoreFactory);
            return customActionHandlersStoreFactory;
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent
        public l getTokenizedAnalytics() {
            l tokenizedAnalytics = this.composerComponentApi.getTokenizedAnalytics();
            j.c(tokenizedAnalytics);
            return tokenizedAnalytics;
        }

        private CartSplitV2TitleWidgetComponentImpl(CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ComposerComponentApi composerComponentApi) {
            this.cartSplitV2TitleWidgetComponentImpl = this;
            this.customActionHandlersComponentApi = customActionHandlersComponentApi;
            this.cartComponentApi = cartComponentApi;
            this.composerComponentApi = composerComponentApi;
        }
    }

    private static final class Factory implements CartSplitV2TitleWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.cartSplitV2.v1.presentation.title.di.CartSplitV2TitleWidgetComponent.Factory
        public CartSplitV2TitleWidgetComponent create(CustomActionHandlersComponentApi customActionHandlersComponentApi, CartComponentApi cartComponentApi, ComposerComponentApi composerComponentApi) {
            customActionHandlersComponentApi.getClass();
            cartComponentApi.getClass();
            composerComponentApi.getClass();
            return new CartSplitV2TitleWidgetComponentImpl(customActionHandlersComponentApi, cartComponentApi, composerComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CartSplitV2TitleWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
