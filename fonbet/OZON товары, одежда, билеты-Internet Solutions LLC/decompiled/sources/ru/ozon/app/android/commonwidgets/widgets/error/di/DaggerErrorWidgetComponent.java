package ru.ozon.app.android.commonwidgets.widgets.error.di;

import Jb.d;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.commonwidgets.widgets.error.ErrorAnalytics;
import ru.ozon.app.android.commonwidgets.widgets.error.di.ErrorWidgetComponent;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi;

/* loaded from: classes11.dex */
public final class DaggerErrorWidgetComponent {

    private static final class ErrorWidgetComponentImpl implements ErrorWidgetComponent {
        private final ErrorWidgetComponentImpl errorWidgetComponentImpl;
        private a<AnalyticsDataLayer> getAnalyticsDataLayerProvider;
        private a<Sg.a> getAnalyticsScreenStorageProvider;
        private a<PluginsManager> getPluginsManagerProvider;
        private a<ErrorAnalytics> provideErrorAnalyticsProvider;

        private static final class GetAnalyticsDataLayerProvider implements a<AnalyticsDataLayer> {
            private final ComposerComponent composerComponent;

            GetAnalyticsDataLayerProvider(ComposerComponent composerComponent) {
                this.composerComponent = composerComponent;
            }

            @Override // Pc.a
            public AnalyticsDataLayer get() {
                AnalyticsDataLayer analyticsDataLayer = this.composerComponent.getAnalyticsDataLayer();
                j.c(analyticsDataLayer);
                return analyticsDataLayer;
            }
        }

        private static final class GetAnalyticsScreenStorageProvider implements a<Sg.a> {
            private final RetainAnalyticsComponentApi retainAnalyticsComponentApi;

            GetAnalyticsScreenStorageProvider(RetainAnalyticsComponentApi retainAnalyticsComponentApi) {
                this.retainAnalyticsComponentApi = retainAnalyticsComponentApi;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // Pc.a
            public Sg.a get() {
                Sg.a analyticsScreenStorage = this.retainAnalyticsComponentApi.getAnalyticsScreenStorage();
                j.c(analyticsScreenStorage);
                return analyticsScreenStorage;
            }
        }

        private static final class GetPluginsManagerProvider implements a<PluginsManager> {
            private final ComposerComponent composerComponent;

            GetPluginsManagerProvider(ComposerComponent composerComponent) {
                this.composerComponent = composerComponent;
            }

            @Override // Pc.a
            public PluginsManager get() {
                PluginsManager pluginsManager = this.composerComponent.getPluginsManager();
                j.c(pluginsManager);
                return pluginsManager;
            }
        }

        /* synthetic */ ErrorWidgetComponentImpl(ComposerComponent composerComponent, RetainAnalyticsComponentApi retainAnalyticsComponentApi, int i11) {
            this(composerComponent, retainAnalyticsComponentApi);
        }

        private void initialize(ComposerComponent composerComponent, RetainAnalyticsComponentApi retainAnalyticsComponentApi) {
            this.getAnalyticsDataLayerProvider = new GetAnalyticsDataLayerProvider(composerComponent);
            this.getPluginsManagerProvider = new GetPluginsManagerProvider(composerComponent);
            GetAnalyticsScreenStorageProvider getAnalyticsScreenStorageProvider = new GetAnalyticsScreenStorageProvider(retainAnalyticsComponentApi);
            this.getAnalyticsScreenStorageProvider = getAnalyticsScreenStorageProvider;
            this.provideErrorAnalyticsProvider = d.b(ErrorAnalyticsModule_ProvideErrorAnalyticsFactory.create(this.getAnalyticsDataLayerProvider, this.getPluginsManagerProvider, getAnalyticsScreenStorageProvider));
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.error.di.ErrorWidgetComponent
        public ErrorAnalytics getErrorAnalytics() {
            return this.provideErrorAnalyticsProvider.get();
        }

        private ErrorWidgetComponentImpl(ComposerComponent composerComponent, RetainAnalyticsComponentApi retainAnalyticsComponentApi) {
            this.errorWidgetComponentImpl = this;
            initialize(composerComponent, retainAnalyticsComponentApi);
        }
    }

    private static final class Factory implements ErrorWidgetComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.commonwidgets.widgets.error.di.ErrorWidgetComponent.Factory
        public ErrorWidgetComponent create(ComposerComponent composerComponent, RetainAnalyticsComponentApi retainAnalyticsComponentApi) {
            composerComponent.getClass();
            retainAnalyticsComponentApi.getClass();
            return new ErrorWidgetComponentImpl(composerComponent, retainAnalyticsComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ErrorWidgetComponent.Factory factory() {
        return new Factory(0);
    }
}
