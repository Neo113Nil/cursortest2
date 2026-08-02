package ru.ozon.app.android.analytics.screen.storage.di;

import Sg.a;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponent;
import ru.ozon.app.android.analytics.screen.storage.di.module.AnalyticsScreenStorageModule;
import ru.ozon.app.android.analytics.screen.storage.di.module.AnalyticsScreenStorageModule_ProvideAnalyticsScreenStorageFactory;
import ru.ozon.app.android.analytics.screen.storage.di.module.AnalyticsScreenStorageModule_ProvideApplicationAnalyticsScreenStorageFactory;

/* loaded from: classes6.dex */
public final class DaggerAnalyticsScreenStorageComponent {

    private static final class AnalyticsScreenStorageComponentImpl implements AnalyticsScreenStorageComponent {
        private final AnalyticsScreenStorageComponentImpl analyticsScreenStorageComponentImpl;
        private final AnalyticsScreenStorageModule analyticsScreenStorageModule;

        /* synthetic */ AnalyticsScreenStorageComponentImpl(AnalyticsScreenStorageModule analyticsScreenStorageModule, int i11) {
            this(analyticsScreenStorageModule);
        }

        @Override // ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi
        public a getAnalyticsScreenStorage() {
            return AnalyticsScreenStorageModule_ProvideAnalyticsScreenStorageFactory.provideAnalyticsScreenStorage(this.analyticsScreenStorageModule);
        }

        @Override // ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi
        public a getApplicationAnalyticsScreenStorage() {
            return AnalyticsScreenStorageModule_ProvideApplicationAnalyticsScreenStorageFactory.provideApplicationAnalyticsScreenStorage(this.analyticsScreenStorageModule);
        }

        private AnalyticsScreenStorageComponentImpl(AnalyticsScreenStorageModule analyticsScreenStorageModule) {
            this.analyticsScreenStorageComponentImpl = this;
            this.analyticsScreenStorageModule = analyticsScreenStorageModule;
        }
    }

    private static final class Factory implements AnalyticsScreenStorageComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponent.Factory
        public AnalyticsScreenStorageComponent create() {
            return new AnalyticsScreenStorageComponentImpl(new AnalyticsScreenStorageModule(), 0);
        }

        private Factory() {
        }
    }

    public static AnalyticsScreenStorageComponent.Factory factory() {
        return new Factory(0);
    }
}
