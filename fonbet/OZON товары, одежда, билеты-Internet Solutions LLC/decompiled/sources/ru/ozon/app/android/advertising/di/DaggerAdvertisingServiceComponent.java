package ru.ozon.app.android.advertising.di;

import Jb.d;
import Jb.j;
import Pc.a;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import fi0.InterfaceC6571a;
import ru.ozon.app.android.advertising.FirebaseAdvertisingService;
import ru.ozon.app.android.advertising.di.AdvertisingServiceComponent;
import ru.ozon.app.android.advertising.di.module.FirebaseAdvertisingServiceModule;
import ru.ozon.app.android.analytics.firebase.di.FirebaseAnalyticsComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

/* loaded from: classes6.dex */
public final class DaggerAdvertisingServiceComponent {

    private static final class AdvertisingServiceComponentImpl implements AdvertisingServiceComponent {
        private final AdvertisingServiceComponentImpl advertisingServiceComponentImpl;
        private final ContextComponentDependencies contextComponentDependencies;
        private final FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi;
        private a<FirebaseAdvertisingService> provideFirebaseAdvertisingServiceProvider;

        private static final class SwitchingProvider<T> implements a<T> {
            private final AdvertisingServiceComponentImpl advertisingServiceComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92155id;

            SwitchingProvider(AdvertisingServiceComponentImpl advertisingServiceComponentImpl, int i11) {
                this.advertisingServiceComponentImpl = advertisingServiceComponentImpl;
                this.f92155id = i11;
            }

            @Override // Pc.a
            public T get() {
                if (this.f92155id != 0) {
                    throw new AssertionError(this.f92155id);
                }
                FirebaseAdvertisingServiceModule firebaseAdvertisingServiceModule = FirebaseAdvertisingServiceModule.INSTANCE;
                Context context = this.advertisingServiceComponentImpl.contextComponentDependencies.getContext();
                j.c(context);
                FirebaseAnalytics firebaseAnalytics = this.advertisingServiceComponentImpl.firebaseAnalyticsComponentApi.getFirebaseAnalytics();
                j.c(firebaseAnalytics);
                return (T) firebaseAdvertisingServiceModule.provideFirebaseAdvertisingService(context, firebaseAnalytics);
            }
        }

        /* synthetic */ AdvertisingServiceComponentImpl(ContextComponentDependencies contextComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi, int i11) {
            this(contextComponentDependencies, firebaseAnalyticsComponentApi);
        }

        private void initialize(ContextComponentDependencies contextComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi) {
            this.provideFirebaseAdvertisingServiceProvider = d.b(new SwitchingProvider(this.advertisingServiceComponentImpl, 0));
        }

        @Override // ru.ozon.app.android.advertising.di.AdvertisingServiceComponentApi
        public InterfaceC6571a getAdvertisingService() {
            return this.provideFirebaseAdvertisingServiceProvider.get();
        }

        private AdvertisingServiceComponentImpl(ContextComponentDependencies contextComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi) {
            this.advertisingServiceComponentImpl = this;
            this.contextComponentDependencies = contextComponentDependencies;
            this.firebaseAnalyticsComponentApi = firebaseAnalyticsComponentApi;
            initialize(contextComponentDependencies, firebaseAnalyticsComponentApi);
        }
    }

    private static final class Factory implements AdvertisingServiceComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.advertising.di.AdvertisingServiceComponent.Factory
        public AdvertisingServiceComponent create(ContextComponentDependencies contextComponentDependencies, FirebaseAnalyticsComponentApi firebaseAnalyticsComponentApi) {
            contextComponentDependencies.getClass();
            firebaseAnalyticsComponentApi.getClass();
            return new AdvertisingServiceComponentImpl(contextComponentDependencies, firebaseAnalyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static AdvertisingServiceComponent.Factory factory() {
        return new Factory(0);
    }
}
