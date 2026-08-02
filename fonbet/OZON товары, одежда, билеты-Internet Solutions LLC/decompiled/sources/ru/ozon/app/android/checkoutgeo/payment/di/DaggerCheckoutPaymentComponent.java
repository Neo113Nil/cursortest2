package ru.ozon.app.android.checkoutgeo.payment.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.app.Application;
import android.content.Context;
import ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponent;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManager;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayManagerImpl;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferences;
import ru.ozon.app.android.checkoutgeo.payment.sberpay.SberPayPreferencesImpl;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorage;
import ru.ozon.app.android.checkoutgeo.payment.storage.GooglePayAvailabilityStorageImpl;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.environment.EnvironmentService;

/* loaded from: classes6.dex */
public final class DaggerCheckoutPaymentComponent {

    private static final class CheckoutPaymentComponentImpl implements CheckoutPaymentComponent {
        private a<GooglePayAvailabilityStorage> bindGooglePayAvailabilityStorageProvider;
        private a<SberPayManager> bindSberPayManagerProvider;
        private a<SberPayPreferences> bindSberPayPreferencesProvider;
        private final CheckoutPaymentComponentImpl checkoutPaymentComponentImpl;
        private final ContextComponentDependencies contextComponentDependencies;
        private a<GooglePayAvailabilityStorageImpl> googlePayAvailabilityStorageImplProvider;
        private a<SberPayManagerImpl> sberPayManagerImplProvider;
        private a<SberPayPreferencesImpl> sberPayPreferencesImplProvider;
        private final StorageComponentApi storageComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final CheckoutPaymentComponentImpl checkoutPaymentComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92341id;

            SwitchingProvider(CheckoutPaymentComponentImpl checkoutPaymentComponentImpl, int i11) {
                this.checkoutPaymentComponentImpl = checkoutPaymentComponentImpl;
                this.f92341id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92341id;
                if (i11 == 0) {
                    return (T) new GooglePayAvailabilityStorageImpl();
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new AssertionError(this.f92341id);
                    }
                    Context context = this.checkoutPaymentComponentImpl.contextComponentDependencies.getContext();
                    j.c(context);
                    return (T) new SberPayPreferencesImpl(context);
                }
                Context context2 = this.checkoutPaymentComponentImpl.contextComponentDependencies.getContext();
                j.c(context2);
                Application application = this.checkoutPaymentComponentImpl.contextComponentDependencies.getApplication();
                j.c(application);
                EnvironmentService environmentService = this.checkoutPaymentComponentImpl.storageComponentApi.getEnvironmentService();
                j.c(environmentService);
                return (T) new SberPayManagerImpl(context2, application, environmentService, (SberPayPreferences) this.checkoutPaymentComponentImpl.bindSberPayPreferencesProvider.get());
            }
        }

        /* synthetic */ CheckoutPaymentComponentImpl(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi, int i11) {
            this(contextComponentDependencies, storageComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.checkoutPaymentComponentImpl, 0);
            this.googlePayAvailabilityStorageImplProvider = switchingProvider;
            this.bindGooglePayAvailabilityStorageProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.checkoutPaymentComponentImpl, 2);
            this.sberPayPreferencesImplProvider = switchingProvider2;
            this.bindSberPayPreferencesProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.checkoutPaymentComponentImpl, 1);
            this.sberPayManagerImplProvider = switchingProvider3;
            this.bindSberPayManagerProvider = d.b(switchingProvider3);
        }

        @Override // ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi
        public GooglePayAvailabilityStorage getGooglePayAvailabilityStorage() {
            return this.bindGooglePayAvailabilityStorageProvider.get();
        }

        @Override // ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi
        public SberPayManager getSberPayManager() {
            return this.bindSberPayManagerProvider.get();
        }

        @Override // ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponentApi
        public SberPayPreferences getSberPayPreferences() {
            return this.bindSberPayPreferencesProvider.get();
        }

        private CheckoutPaymentComponentImpl(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi) {
            this.checkoutPaymentComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.storageComponentApi = storageComponentApi;
            initialize(contextComponentDependencies, storageComponentApi);
        }
    }

    private static final class Factory implements CheckoutPaymentComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.checkoutgeo.payment.di.CheckoutPaymentComponent.Factory
        public CheckoutPaymentComponent create(ContextComponentDependencies contextComponentDependencies, StorageComponentApi storageComponentApi) {
            contextComponentDependencies.getClass();
            storageComponentApi.getClass();
            return new CheckoutPaymentComponentImpl(contextComponentDependencies, storageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static CheckoutPaymentComponent.Factory factory() {
        return new Factory(0);
    }
}
