package ru.ozon.app.android.action.di;

import Jb.d;
import Jb.j;
import Pc.a;
import WZ.l;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.analytics.ActionUsageAnalytics;
import ru.ozon.app.android.action.di.ActionComponent;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.action.sheet.data.ActionSheetMapper;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.ActionV2RepositoryImpl;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegateImpl;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.metrics.client.MetricsClient;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;

/* loaded from: classes6.dex */
public final class DaggerActionComponent {

    private static final class ActionComponentImpl implements ActionComponent {
        private a<ActionAnalyticDelegateImpl> actionAnalyticDelegateImplProvider;
        private final ActionComponentImpl actionComponentImpl;
        private a<ActionSheetEventHandler> actionSheetEventHandlerProvider;
        private a<ActionV2RepositoryImpl> actionV2RepositoryImplProvider;
        private final AnalyticsComponentApi analyticsComponentApi;
        private final AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi;
        private a<ActionAnalyticDelegate> bindActionAnalyticDelegateProvider;
        private a<ActionV2Repository> bindActionRepositoryProvider;
        private final ComposerComponentApi composerComponentApi;
        private final MetricsClientComponentApi metricsClientComponentApi;
        private final NetworkComponentApi networkComponentApi;

        private static final class SwitchingProvider<T> implements a<T> {
            private final ActionComponentImpl actionComponentImpl;

            /* renamed from: id, reason: collision with root package name */
            private final int f92135id;

            SwitchingProvider(ActionComponentImpl actionComponentImpl, int i11) {
                this.actionComponentImpl = actionComponentImpl;
                this.f92135id = i11;
            }

            @Override // Pc.a
            public T get() {
                int i11 = this.f92135id;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            return (T) new ActionSheetEventHandler();
                        }
                        throw new AssertionError(this.f92135id);
                    }
                    l tokenizedAnalytics = this.actionComponentImpl.composerComponentApi.getTokenizedAnalytics();
                    j.c(tokenizedAnalytics);
                    return (T) new ActionAnalyticDelegateImpl(tokenizedAnalytics);
                }
                MetricsClient metricsClient = this.actionComponentImpl.metricsClientComponentApi.getMetricsClient();
                j.c(metricsClient);
                ActionAnalyticDelegate actionAnalyticDelegate = (ActionAnalyticDelegate) this.actionComponentImpl.bindActionAnalyticDelegateProvider.get();
                ActionSheetMapper actionSheetMapper = new ActionSheetMapper();
                JsonSerializer jsonSerializer = this.actionComponentImpl.networkComponentApi.getJsonSerializer();
                j.c(jsonSerializer);
                JsonParser jsonDeserializer = this.actionComponentImpl.networkComponentApi.getJsonDeserializer();
                j.c(jsonDeserializer);
                return (T) new ActionV2RepositoryImpl(metricsClient, actionAnalyticDelegate, actionSheetMapper, jsonSerializer, jsonDeserializer);
            }
        }

        /* synthetic */ ActionComponentImpl(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, int i11) {
            this(analyticsComponentApi, contextComponentDependencies, composerComponentApi, networkComponentApi, metricsClientComponentApi, analyticsScreenStorageComponentApi);
        }

        private void initialize(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            SwitchingProvider switchingProvider = new SwitchingProvider(this.actionComponentImpl, 1);
            this.actionAnalyticDelegateImplProvider = switchingProvider;
            this.bindActionAnalyticDelegateProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.actionComponentImpl, 0);
            this.actionV2RepositoryImplProvider = switchingProvider2;
            this.bindActionRepositoryProvider = d.b(switchingProvider2);
            this.actionSheetEventHandlerProvider = d.b(new SwitchingProvider(this.actionComponentImpl, 2));
        }

        @Override // ru.ozon.app.android.action.di.ActionComponentApi
        public ActionAnalyticDelegate getActionAnalyticDelegate() {
            return this.bindActionAnalyticDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.action.di.ActionComponentApi
        public ActionV2Repository getActionRepository() {
            return this.bindActionRepositoryProvider.get();
        }

        @Override // ru.ozon.app.android.action.di.ActionComponentApi
        public ActionSheetEventHandler getActionSheetEventHandler() {
            return this.actionSheetEventHandlerProvider.get();
        }

        @Override // ru.ozon.app.android.action.di.ActionComponentApi
        public ActionUsageAnalytics getActionUsageAnalytics() {
            AnalyticsDataLayer analyticsDataLayer = this.analyticsComponentApi.getAnalyticsDataLayer();
            j.c(analyticsDataLayer);
            PluginsManager pluginsManager = this.analyticsComponentApi.getPluginsManager();
            j.c(pluginsManager);
            Sg.a analyticsScreenStorage = this.analyticsScreenStorageComponentApi.getAnalyticsScreenStorage();
            j.c(analyticsScreenStorage);
            FeatureService featureService = this.networkComponentApi.getFeatureService();
            j.c(featureService);
            return new ActionUsageAnalytics(analyticsDataLayer, pluginsManager, analyticsScreenStorage, featureService);
        }

        private ActionComponentImpl(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, ComposerComponentApi composerComponentApi, NetworkComponentApi networkComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            this.actionComponentImpl = this;
            this.metricsClientComponentApi = metricsClientComponentApi;
            this.composerComponentApi = composerComponentApi;
            this.networkComponentApi = networkComponentApi;
            this.analyticsComponentApi = analyticsComponentApi;
            this.analyticsScreenStorageComponentApi = analyticsScreenStorageComponentApi;
            initialize(analyticsComponentApi, contextComponentDependencies, composerComponentApi, networkComponentApi, metricsClientComponentApi, analyticsScreenStorageComponentApi);
        }
    }

    private static final class Factory implements ActionComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.action.di.ActionComponent.Factory
        public ActionComponent create(AnalyticsComponentApi analyticsComponentApi, ContextComponentDependencies contextComponentDependencies, NetworkComponentApi networkComponentApi, ComposerComponentApi composerComponentApi, MetricsClientComponentApi metricsClientComponentApi, AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi) {
            analyticsComponentApi.getClass();
            contextComponentDependencies.getClass();
            networkComponentApi.getClass();
            composerComponentApi.getClass();
            metricsClientComponentApi.getClass();
            analyticsScreenStorageComponentApi.getClass();
            return new ActionComponentImpl(analyticsComponentApi, contextComponentDependencies, composerComponentApi, networkComponentApi, metricsClientComponentApi, analyticsScreenStorageComponentApi, 0);
        }

        private Factory() {
        }
    }

    public static ActionComponent.Factory factory() {
        return new Factory(0);
    }
}
