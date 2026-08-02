package ru.ozon.app.android.cart.ui.di;

import Jb.j;
import android.content.Context;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.domain.delegate.CartAtomEnablingStateDelegate;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponent;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes6.dex */
public final class DaggerCartAtomBinderComponent {

    private static final class CartAtomBinderComponentImpl implements CartAtomBinderComponent {
        private final AccountComponentApi accountComponentApi;
        private final CartAtomBinderComponentImpl cartAtomBinderComponentImpl;
        private final CartServiceApi cartServiceApi;
        private final ContextComponentDependencies contextComponentDependencies;

        /* synthetic */ CartAtomBinderComponentImpl(ContextComponentDependencies contextComponentDependencies, AccountComponentApi accountComponentApi, CartServiceApi cartServiceApi, int i11) {
            this(contextComponentDependencies, accountComponentApi, cartServiceApi);
        }

        @Override // ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi
        public CartAtomBinder getCartAtomBinder() {
            Context context = this.contextComponentDependencies.getContext();
            j.c(context);
            AdultHandler adultHandler = this.accountComponentApi.getAdultHandler();
            j.c(adultHandler);
            CartAtomEnablingStateDelegate cartAtomEnablingStateDelegate = new CartAtomEnablingStateDelegate();
            CartService cartService = this.cartServiceApi.getCartService();
            j.c(cartService);
            return new CartAtomBinder(context, adultHandler, cartAtomEnablingStateDelegate, cartService);
        }

        private CartAtomBinderComponentImpl(ContextComponentDependencies contextComponentDependencies, AccountComponentApi accountComponentApi, CartServiceApi cartServiceApi) {
            this.cartAtomBinderComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.accountComponentApi = accountComponentApi;
            this.cartServiceApi = cartServiceApi;
        }
    }

    private static final class Factory implements CartAtomBinderComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.cart.ui.di.CartAtomBinderComponent.Factory
        public CartAtomBinderComponent create(AccountComponentApi accountComponentApi, CartServiceApi cartServiceApi, ContextComponentDependencies contextComponentDependencies) {
            accountComponentApi.getClass();
            cartServiceApi.getClass();
            contextComponentDependencies.getClass();
            return new CartAtomBinderComponentImpl(contextComponentDependencies, accountComponentApi, cartServiceApi, 0);
        }

        private Factory() {
        }
    }

    public static CartAtomBinderComponent.Factory factory() {
        return new Factory(0);
    }
}
