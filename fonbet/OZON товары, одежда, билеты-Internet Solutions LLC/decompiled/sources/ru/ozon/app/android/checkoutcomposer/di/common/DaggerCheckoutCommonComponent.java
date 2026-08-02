package ru.ozon.app.android.checkoutcomposer.di.common;

import Jb.d;
import Pc.a;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepositoryImpl;
import ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponent;

/* loaded from: classes6.dex */
public final class DaggerCheckoutCommonComponent {

    private static final class CheckoutCommonComponentImpl implements CheckoutCommonComponent {
        private a<CheckoutScrollToWidgetKeyRepository> bindCheckoutScrollToWidgetKeyRepositoryProvider;
        private final CheckoutCommonComponentImpl checkoutCommonComponentImpl;
        private a<CheckoutScrollToWidgetKeyRepositoryImpl> checkoutScrollToWidgetKeyRepositoryImplProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CheckoutCommonComponentImpl checkoutCommonComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92296id;

            SwitchingProvider(CheckoutCommonComponentImpl checkoutCommonComponentImpl, int i11) {
                this.checkoutCommonComponentImpl = checkoutCommonComponentImpl;
                this.f92296id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92296id == 0) {
                    return (T) new CheckoutScrollToWidgetKeyRepositoryImpl();
                }
                throw new AssertionError(this.f92296id);
            }
        }

        /* synthetic */ CheckoutCommonComponentImpl(int i11) {
            this();
        }

        private void initialize() {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.checkoutCommonComponentImpl, 0);
            this.checkoutScrollToWidgetKeyRepositoryImplProvider = switchingProvider;
            this.bindCheckoutScrollToWidgetKeyRepositoryProvider = d.b(switchingProvider);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponentApi
        public CheckoutScrollToWidgetKeyRepository getCheckoutScrollToWidgetKeyRepository() {
            return this.bindCheckoutScrollToWidgetKeyRepositoryProvider.get();
        }

        private CheckoutCommonComponentImpl() {
            this.checkoutCommonComponentImpl = this;
            initialize();
        }
    }

    private static final class Factory implements CheckoutCommonComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutcomposer.di.common.CheckoutCommonComponent.Factory
        public CheckoutCommonComponent create() {
            return new CheckoutCommonComponentImpl(0);
        }

        private Factory() {
        }
    }

    public static CheckoutCommonComponent.Factory factory() {
        return new Factory(0);
    }
}
