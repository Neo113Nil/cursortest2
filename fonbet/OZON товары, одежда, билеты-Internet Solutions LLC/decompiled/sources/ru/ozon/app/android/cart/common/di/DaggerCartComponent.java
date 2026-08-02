package ru.ozon.app.android.cart.common.di;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.cart.common.di.CartComponent;
import ru.ozon.app.android.cart.common.domain.FreshAddToCartRetryHandler;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsControllerImpl;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandler;
import ru.ozon.app.android.cart.common.presentation.throttleNotificationHandler.CartThrottleNotificationHandlerImpl;

/* loaded from: classes6.dex */
public final class DaggerCartComponent {

    private static final class CartComponentImpl implements CartComponent {
        private a<CartEventsController> bindCartEventsControllerProvider;
        private a<CartThrottleNotificationHandler> bindCartNotificationHandlerProvider;
        private final CartComponentImpl cartComponentImpl;
        private a<CartEventsControllerImpl> cartEventsControllerImplProvider;
        private a<CartThrottleNotificationHandlerImpl> cartThrottleNotificationHandlerImplProvider;
        private a<FreshAddToCartRetryHandler> freshAddToCartRetryHandlerProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CartComponentImpl cartComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92250id;

            SwitchingProvider(CartComponentImpl cartComponentImpl, int i11) {
                this.cartComponentImpl = cartComponentImpl;
                this.f92250id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92250id;
                if (i11 == 0) {
                    return (T) new CartEventsControllerImpl();
                }
                if (i11 == 1) {
                    return (T) new CartThrottleNotificationHandlerImpl();
                }
                if (i11 == 2) {
                    return (T) new FreshAddToCartRetryHandler();
                }
                throw new AssertionError(this.f92250id);
            }
        }

        /* synthetic */ CartComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.cartComponentImpl, 0);
            this.cartEventsControllerImplProvider = switchingProvider;
            this.bindCartEventsControllerProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.cartComponentImpl, 1);
            this.cartThrottleNotificationHandlerImplProvider = switchingProvider2;
            this.bindCartNotificationHandlerProvider = d.b(switchingProvider2);
            this.freshAddToCartRetryHandlerProvider = d.b(new SwitchingProvider(this.cartComponentImpl, 2));
        }

        @Override // ru.ozon.app.android.cart.common.di.CartComponentApi
        public CartEventsController getCartEventsController() {
            return this.bindCartEventsControllerProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartComponentApi
        public CartThrottleNotificationHandler getCartThrottleNotificationHandler() {
            return this.bindCartNotificationHandlerProvider.get();
        }

        @Override // ru.ozon.app.android.cart.common.di.CartComponentApi
        public FreshAddToCartRetryHandler getFreshAddToCartRetryHandler() {
            return this.freshAddToCartRetryHandlerProvider.get();
        }

        private CartComponentImpl() {
            this.cartComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements CartComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        private Factory() {
        }

        @Override // ru.ozon.app.android.cart.common.di.CartComponent.Factory
        public CartComponent create() {
            return new CartComponentImpl(0);
        }
    }

    public static CartComponent.Factory factory() {
        return new Factory(0);
    }
}
