package ru.ozon.app.android.composer.di.composer;

import A00.b;
import Hh.C3140a;
import Jb.d;
import Jb.j;
import Pc.a;
import Qj0.InterfaceC3896p;
import WZ.l;
import android.app.Application;
import android.content.Context;
import ei0.InterfaceC6369b;
import g00.InterfaceC6608a;
import java.util.Set;
import k20.C7475g;
import l20.c;
import m20.InterfaceC8046a;
import n20.i;
import n20.k;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalytics;
import ru.ozon.app.android.analytics.modules.tokenized.WidgetTokenizedAnalyticsImpl;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.plugins.AnalyticsEventExecutor;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListener;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerScreenFactory;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponent;
import ru.ozon.app.android.composer.di.modules.RetainComposerAnalyticsModule_Companion_ProvideAnalyticsFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerAnalyticsModule_Companion_ProvideRetainAnalyticsScreenStorageFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerAnalyticsModule_Companion_ProvideRetainTokenizedAnalyticsFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceAnalyticsModule_Companion_ProvideFpsTrackerFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceAnalyticsModule_Companion_ProvidePagePerformanceTrackerFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceModule_ProvideFrameBinderFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceModule_ProvideMultiFrameBinderOptimizerFactory;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceModule_ProvideScrollStateListenerFactory;
import ru.ozon.app.android.composer.issue.ComposerPageIssueFactory;
import ru.ozon.app.android.composer.references.ComposerReferencesFactory;
import ru.ozon.app.android.composer.references.ComposerReferencesFactoryImpl;
import ru.ozon.app.android.composer.tracker.BxPerformanceTraceHandler;
import ru.ozon.app.android.composer.tracker.ComposerEventLoadingCompositeCallback;
import ru.ozon.app.android.composer.tracker.ComposerPageLoadingCallback;
import ru.ozon.app.android.composer.tracker.WidgetDecodingTracker;
import ru.ozon.app.android.composer.tracker.WidgetDecodingTrackerImpl;
import ru.ozon.app.android.composer.view.ComposerNotificationController;
import ru.ozon.app.android.composer.view.ComposerViewInitBlockProvider;
import ru.ozon.app.android.composer.view.ComposerViewInitBlockProviderImpl;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderAnalyticHelper;
import ru.ozon.app.android.composer.view.multiframebinder.MultiFrameBinderOptimizer;
import ru.ozon.app.android.composer.view.multiframebinder.ScrollStateListener;
import ru.ozon.app.android.composer.view.performance.ComposerScreenPerformanceController;
import ru.ozon.app.android.composer.view.performance.ViewHoldersPerformanceTracker;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHolderLifecycleListener;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersFpsTracker;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTracker;
import ru.ozon.app.android.composer.view.performance.vhlisteners.ViewHoldersRumTrackerImpl;
import ru.ozon.app.android.composer.widgets.store.fast.FastWidgetStore;
import ru.ozon.app.android.composer.widgets.store.fast.FastWidgetStore2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.di.ComposerDebugMenuHostApiComponent;
import ru.ozon.app.android.storage.user.test.TestUserStorage;
import w10.InterfaceC10409a;

/* loaded from: classes6.dex */
public final class DaggerRetainComposerComponent {

    private static final class Factory implements RetainComposerComponent.Factory {
        /* synthetic */ Factory(int i11) {
            this();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent.Factory
        public RetainComposerComponent create(Set<Widget> set, boolean z11, ComposerComponent composerComponent, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent) {
            set.getClass();
            composerComponent.getClass();
            composerDebugMenuHostApiComponent.getClass();
            return new RetainComposerComponentImpl(composerComponent, composerDebugMenuHostApiComponent, set, Boolean.valueOf(z11), 0);
        }

        private Factory() {
        }
    }

    private static final class RetainComposerComponentImpl implements RetainComposerComponent {
        private a<b> bindComposerPageLoadingCallbackProvider;
        private a<ComposerReferencesFactory> bindComposerReferencesFactoryProvider;
        private a<ComposerViewInitBlockProvider> bindComposerViewInitBlockProvider;
        private a<ViewHolderLifecycleListener> bindViewHoldersFpsTrackerProvider;
        private a<ViewHoldersRumTracker> bindViewHoldersRumTrackerProvider;
        private a<WidgetDecodingTracker> bindWidgetDecodingTrackerProvider;
        private a<WidgetTokenizedAnalytics> bindsWidgetTokenizedAnalyticsProvider;
        private a<BxPerformanceTraceHandler> bxPerformanceTraceHandlerProvider;
        private final ComposerComponent composerComponent;
        private final ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent;
        private a<ComposerNotificationController> composerNotificationControllerProvider;
        private a<ComposerPageLoadingCallback> composerPageLoadingCallbackProvider;
        private a<ComposerReferencesFactoryImpl> composerReferencesFactoryImplProvider;
        private a<ComposerScreenFactory> composerScreenFactoryProvider;
        private a<ComposerViewInitBlockProviderImpl> composerViewInitBlockProviderImplProvider;
        private final Boolean isPageViewTrackingEnabled;
        private a<RZ.a> provideAnalyticsProvider;
        private a<InterfaceC10409a> provideComposerImagePrefetcherProvider;
        private a<C7475g> provideComposerWidgetComponentStorageProvider;
        private a<C3140a> provideFpsTrackerProvider;
        private a<FrameBinder> provideFrameBinderProvider;
        private a<ImagePrefetchInfoProviderStorage<c>> provideImagePrefetchInfoProviderStorageProvider;
        private a<MultiFrameBinderOptimizer> provideMultiFrameBinderOptimizerProvider;
        private a<Ih.b> providePagePerformanceTrackerProvider;
        private a<Sg.a> provideRetainAnalyticsScreenStorageProvider;
        private a<l> provideRetainTokenizedAnalyticsProvider;
        private a<ScrollStateListener> provideScrollStateListenerProvider;
        private a<k<InterfaceC8046a<?, ? extends c>>> provideWidgetStoreDelegateProvider;
        private final RetainComposerComponentImpl retainComposerComponentImpl;
        private a<ViewHoldersFpsTracker> viewHoldersFpsTrackerProvider;
        private a<ViewHoldersRumTrackerImpl> viewHoldersRumTrackerImplProvider;
        private a<WidgetDecodingTrackerImpl> widgetDecodingTrackerImplProvider;
        private a<WidgetTokenizedAnalyticsImpl> widgetTokenizedAnalyticsImplProvider;
        private final Set<Widget> widgets;

        private static final class SwitchingProvider<T> implements a<T> {

            /* renamed from: id, reason: collision with root package name */
            private final int f92476id;
            private final RetainComposerComponentImpl retainComposerComponentImpl;

            SwitchingProvider(RetainComposerComponentImpl retainComposerComponentImpl, int i11) {
                this.retainComposerComponentImpl = retainComposerComponentImpl;
                this.f92476id = i11;
            }

            @Override // Pc.a
            public T get() {
                switch (this.f92476id) {
                    case 0:
                        return (T) RetainComposerAnalyticsModule_Companion_ProvideRetainAnalyticsScreenStorageFactory.provideRetainAnalyticsScreenStorage();
                    case 1:
                        InterfaceC6369b ozonTracker = this.retainComposerComponentImpl.composerComponent.getOzonTracker();
                        j.c(ozonTracker);
                        AnalyticsEventExecutor analyticsEventExecutor = this.retainComposerComponentImpl.composerComponent.getAnalyticsEventExecutor();
                        j.c(analyticsEventExecutor);
                        Sg.a aVar = (Sg.a) this.retainComposerComponentImpl.provideRetainAnalyticsScreenStorageProvider.get();
                        Sg.a applicationAnalyticsScreenStorage = this.retainComposerComponentImpl.composerComponent.getApplicationAnalyticsScreenStorage();
                        j.c(applicationAnalyticsScreenStorage);
                        VZ.a analyticsScreenFactory = this.retainComposerComponentImpl.composerComponent.getAnalyticsScreenFactory();
                        j.c(analyticsScreenFactory);
                        ZZ.a analyticsScreenToTrackerPageConverter = this.retainComposerComponentImpl.composerComponent.getAnalyticsScreenToTrackerPageConverter();
                        j.c(analyticsScreenToTrackerPageConverter);
                        Set<YZ.a> ozonTrackerSupportedPayloadTypes = this.retainComposerComponentImpl.composerComponent.getOzonTrackerSupportedPayloadTypes();
                        j.c(ozonTrackerSupportedPayloadTypes);
                        Set<YZ.a> set = ozonTrackerSupportedPayloadTypes;
                        boolean booleanValue = this.retainComposerComponentImpl.isPageViewTrackingEnabled.booleanValue();
                        FeatureService featureService = this.retainComposerComponentImpl.composerComponent.getFeatureService();
                        j.c(featureService);
                        return (T) RetainComposerAnalyticsModule_Companion_ProvideAnalyticsFactory.provideAnalytics(ozonTracker, analyticsEventExecutor, aVar, applicationAnalyticsScreenStorage, analyticsScreenFactory, analyticsScreenToTrackerPageConverter, set, booleanValue, featureService);
                    case 2:
                        FeatureService featureService2 = this.retainComposerComponentImpl.composerComponent.getFeatureService();
                        j.c(featureService2);
                        return (T) RetainComposerPerformanceModule_ProvideFrameBinderFactory.provideFrameBinder(featureService2, (ScrollStateListener) this.retainComposerComponentImpl.provideScrollStateListenerProvider.get(), this.retainComposerComponentImpl.multiFrameBinderAnalyticHelper(), (MultiFrameBinderOptimizer) this.retainComposerComponentImpl.provideMultiFrameBinderOptimizerProvider.get());
                    case 3:
                        return (T) RetainComposerPerformanceModule_ProvideScrollStateListenerFactory.provideScrollStateListener();
                    case 4:
                        PerformanceTrackerDelegate performanceTrackerDelegate = this.retainComposerComponentImpl.composerComponent.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate);
                        Sg.a aVar2 = (Sg.a) this.retainComposerComponentImpl.provideRetainAnalyticsScreenStorageProvider.get();
                        FeatureService featureService3 = this.retainComposerComponentImpl.composerComponent.getFeatureService();
                        j.c(featureService3);
                        DebugToolsStorage debugToolsStorage = this.retainComposerComponentImpl.composerComponent.getDebugToolsStorage();
                        j.c(debugToolsStorage);
                        return (T) RetainComposerPerformanceAnalyticsModule_Companion_ProvideFpsTrackerFactory.provideFpsTracker(performanceTrackerDelegate, aVar2, featureService3, debugToolsStorage);
                    case 5:
                        FeatureService featureService4 = this.retainComposerComponentImpl.composerComponent.getFeatureService();
                        j.c(featureService4);
                        return (T) RetainComposerPerformanceModule_ProvideMultiFrameBinderOptimizerFactory.provideMultiFrameBinderOptimizer(featureService4);
                    case 6:
                        return (T) RetainComposerModule_Companion_ProvideImagePrefetchInfoProviderStorageFactory.provideImagePrefetchInfoProviderStorage();
                    case 7:
                        BxPerformanceTraceHandler bxPerformanceTraceHandler = (BxPerformanceTraceHandler) this.retainComposerComponentImpl.bxPerformanceTraceHandlerProvider.get();
                        RZ.a aVar3 = (RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get();
                        Sg.a analyticsScreenStorage = this.retainComposerComponentImpl.composerComponent.getAnalyticsScreenStorage();
                        j.c(analyticsScreenStorage);
                        FeatureChecker featureChecker = this.retainComposerComponentImpl.composerComponent.getFeatureChecker();
                        j.c(featureChecker);
                        return (T) RetainComposerPerformanceAnalyticsModule_Companion_ProvidePagePerformanceTrackerFactory.providePagePerformanceTracker(bxPerformanceTraceHandler, aVar3, analyticsScreenStorage, featureChecker);
                    case 8:
                        InterfaceC3896p interceptedPerformanceTracker = this.retainComposerComponentImpl.composerComponent.getInterceptedPerformanceTracker();
                        j.c(interceptedPerformanceTracker);
                        return (T) new BxPerformanceTraceHandler(interceptedPerformanceTracker);
                    case 9:
                        return (T) RetainComposerModule_Companion_ProvideWidgetStoreDelegateFactory.provideWidgetStoreDelegate(this.retainComposerComponentImpl.fastWidgetStore(), this.retainComposerComponentImpl.fastWidgetStore2());
                    case 10:
                        Context context = this.retainComposerComponentImpl.composerComponent.getContext();
                        j.c(context);
                        return (T) RetainComposerModule_Companion_ProvideComposerWidgetComponentStorageFactory.provideComposerWidgetComponentStorage(context);
                    case 11:
                        K00.a composerNetwork = this.retainComposerComponentImpl.composerComponent.getComposerNetwork();
                        j.c(composerNetwork);
                        RZ.a aVar4 = (RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get();
                        k kVar = (k) this.retainComposerComponentImpl.provideWidgetStoreDelegateProvider.get();
                        E10.c prefetchManager = this.retainComposerComponentImpl.composerComponent.getPrefetchManager();
                        j.c(prefetchManager);
                        ComposerPageIssueFactory composerPageIssueFactory = new ComposerPageIssueFactory();
                        ComposerEventLoadingCompositeCallback composerEventLoadingCompositeCallback = this.retainComposerComponentImpl.composerEventLoadingCompositeCallback();
                        FeatureService featureService5 = this.retainComposerComponentImpl.composerComponent.getFeatureService();
                        j.c(featureService5);
                        TestUserStorage testUserStorage = this.retainComposerComponentImpl.composerComponent.getTestUserStorage();
                        j.c(testUserStorage);
                        ComposerScreenPerformanceController composerScreenPerformanceController = this.retainComposerComponentImpl.composerScreenPerformanceController();
                        InterfaceC10409a interfaceC10409a = (InterfaceC10409a) this.retainComposerComponentImpl.provideComposerImagePrefetcherProvider.get();
                        InterfaceC6608a provideComposerDebugMenuHostApi = this.retainComposerComponentImpl.composerDebugMenuHostApiComponent.provideComposerDebugMenuHostApi();
                        j.c(provideComposerDebugMenuHostApi);
                        return (T) new ComposerScreenFactory(composerNetwork, aVar4, kVar, prefetchManager, composerPageIssueFactory, composerEventLoadingCompositeCallback, featureService5, testUserStorage, composerScreenPerformanceController, interfaceC10409a, provideComposerDebugMenuHostApi);
                    case 12:
                        ComposerPageLoadingListener composerPageLoadingListener = this.retainComposerComponentImpl.composerComponent.getComposerPageLoadingListener();
                        j.c(composerPageLoadingListener);
                        return (T) new ComposerPageLoadingCallback(composerPageLoadingListener, (RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get());
                    case 13:
                        PerformanceTrackerDelegate performanceTrackerDelegate2 = this.retainComposerComponentImpl.composerComponent.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate2);
                        Sg.a aVar5 = (Sg.a) this.retainComposerComponentImpl.provideRetainAnalyticsScreenStorageProvider.get();
                        RZ.a aVar6 = (RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get();
                        WidgetLayoutTimeMetricsStorage asyncWidgetLayoutMetricsStorage = this.retainComposerComponentImpl.composerComponent.getAsyncWidgetLayoutMetricsStorage();
                        j.c(asyncWidgetLayoutMetricsStorage);
                        return (T) new ViewHoldersRumTrackerImpl(performanceTrackerDelegate2, aVar5, aVar6, asyncWidgetLayoutMetricsStorage);
                    case 14:
                        PerformanceTrackerDelegate performanceTrackerDelegate3 = this.retainComposerComponentImpl.composerComponent.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate3);
                        return (T) new WidgetDecodingTrackerImpl(performanceTrackerDelegate3, (Sg.a) this.retainComposerComponentImpl.provideRetainAnalyticsScreenStorageProvider.get(), (RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get());
                    case 15:
                        FeatureService featureService6 = this.retainComposerComponentImpl.composerComponent.getFeatureService();
                        j.c(featureService6);
                        return (T) RetainComposerModule_Companion_ProvideComposerImagePrefetcherFactory.provideComposerImagePrefetcher(featureService6, (ImagePrefetchInfoProviderStorage) this.retainComposerComponentImpl.provideImagePrefetchInfoProviderStorageProvider.get());
                    case 16:
                        return (T) RetainComposerAnalyticsModule_Companion_ProvideRetainTokenizedAnalyticsFactory.provideRetainTokenizedAnalytics((RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get());
                    case 17:
                        AnalyticsDataLayer analyticsDataLayer = this.retainComposerComponentImpl.composerComponent.getAnalyticsDataLayer();
                        j.c(analyticsDataLayer);
                        PluginsManager pluginsManager = this.retainComposerComponentImpl.composerComponent.getPluginsManager();
                        j.c(pluginsManager);
                        return (T) new WidgetTokenizedAnalyticsImpl(analyticsDataLayer, pluginsManager, (Sg.a) this.retainComposerComponentImpl.provideRetainAnalyticsScreenStorageProvider.get(), (l) this.retainComposerComponentImpl.provideRetainTokenizedAnalyticsProvider.get());
                    case 18:
                        TestUserStorage testUserStorage2 = this.retainComposerComponentImpl.composerComponent.getTestUserStorage();
                        j.c(testUserStorage2);
                        Application application = this.retainComposerComponentImpl.composerComponent.getApplication();
                        j.c(application);
                        RZ.a aVar7 = (RZ.a) this.retainComposerComponentImpl.provideAnalyticsProvider.get();
                        ComposerNavigator composerNavigator = this.retainComposerComponentImpl.composerComponent.getComposerNavigator();
                        j.c(composerNavigator);
                        C3140a c3140a = (C3140a) this.retainComposerComponentImpl.provideFpsTrackerProvider.get();
                        ViewHoldersRumTracker viewHoldersRumTracker = (ViewHoldersRumTracker) this.retainComposerComponentImpl.bindViewHoldersRumTrackerProvider.get();
                        PerformanceTrackerDelegate performanceTrackerDelegate4 = this.retainComposerComponentImpl.composerComponent.getPerformanceTrackerDelegate();
                        j.c(performanceTrackerDelegate4);
                        ViewHoldersPerformanceTracker viewHoldersPerformanceTracker = this.retainComposerComponentImpl.viewHoldersPerformanceTracker();
                        WidgetsDebugToolsInteractor widgetsDebugToolsInteractor = this.retainComposerComponentImpl.composerComponent.getWidgetsDebugToolsInteractor();
                        j.c(widgetsDebugToolsInteractor);
                        DebugToolsStorage debugToolsStorage2 = this.retainComposerComponentImpl.composerComponent.getDebugToolsStorage();
                        j.c(debugToolsStorage2);
                        a aVar8 = this.retainComposerComponentImpl.composerNotificationControllerProvider;
                        ViewEventStorage viewEventStorage = this.retainComposerComponentImpl.composerComponent.getViewEventStorage();
                        j.c(viewEventStorage);
                        return (T) new ComposerViewInitBlockProviderImpl(testUserStorage2, application, aVar7, composerNavigator, c3140a, viewHoldersRumTracker, performanceTrackerDelegate4, viewHoldersPerformanceTracker, widgetsDebugToolsInteractor, debugToolsStorage2, aVar8, viewEventStorage, (Ih.b) this.retainComposerComponentImpl.providePagePerformanceTrackerProvider.get());
                    case 19:
                        return (T) new ViewHoldersFpsTracker((C3140a) this.retainComposerComponentImpl.provideFpsTrackerProvider.get());
                    case 20:
                        FeatureChecker featureChecker2 = this.retainComposerComponentImpl.composerComponent.getFeatureChecker();
                        j.c(featureChecker2);
                        return (T) new ComposerNotificationController(featureChecker2);
                    case 21:
                        ComposerNavigator composerNavigator2 = this.retainComposerComponentImpl.composerComponent.getComposerNavigator();
                        j.c(composerNavigator2);
                        return (T) new ComposerReferencesFactoryImpl(composerNavigator2, (l) this.retainComposerComponentImpl.provideRetainTokenizedAnalyticsProvider.get(), (C7475g) this.retainComposerComponentImpl.provideComposerWidgetComponentStorageProvider.get(), (Sg.a) this.retainComposerComponentImpl.provideRetainAnalyticsScreenStorageProvider.get(), this.retainComposerComponentImpl.provideFrameBinderProvider, d.a(this.retainComposerComponentImpl.provideScrollStateListenerProvider));
                    default:
                        throw new AssertionError(this.f92476id);
                }
            }
        }

        /* synthetic */ RetainComposerComponentImpl(ComposerComponent composerComponent, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, Set set, Boolean bool, int i11) {
            this(composerComponent, composerDebugMenuHostApiComponent, set, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerEventLoadingCompositeCallback composerEventLoadingCompositeCallback() {
            return new ComposerEventLoadingCompositeCallback(setOfComposerEventLoadingCallback());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ComposerScreenPerformanceController composerScreenPerformanceController() {
            PerformanceTrackerDelegate performanceTrackerDelegate = this.composerComponent.getPerformanceTrackerDelegate();
            j.c(performanceTrackerDelegate);
            return new ComposerScreenPerformanceController(performanceTrackerDelegate, this.bindViewHoldersRumTrackerProvider.get(), this.providePagePerformanceTrackerProvider.get(), this.bindWidgetDecodingTrackerProvider.get(), this.provideRetainAnalyticsScreenStorageProvider.get(), this.provideAnalyticsProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FastWidgetStore fastWidgetStore() {
            Set<Widget> set = this.widgets;
            Set<i> sdkWidgets = this.composerComponent.getSdkWidgets();
            j.c(sdkWidgets);
            return new FastWidgetStore(set, sdkWidgets, this.provideComposerWidgetComponentStorageProvider.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FastWidgetStore2 fastWidgetStore2() {
            Set<Widget2> widgets = this.composerComponent.getWidgets();
            j.c(widgets);
            return new FastWidgetStore2(widgets, this.provideComposerWidgetComponentStorageProvider.get());
        }

        private void initialize(ComposerComponent composerComponent, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, Set<Widget> set, Boolean bool) {
            this.provideRetainAnalyticsScreenStorageProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 0));
            this.provideAnalyticsProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 1));
            this.provideScrollStateListenerProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 3));
            this.provideFpsTrackerProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 4));
            this.provideMultiFrameBinderOptimizerProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 5));
            this.provideFrameBinderProvider = new SwitchingProvider(this.retainComposerComponentImpl, 2);
            this.provideImagePrefetchInfoProviderStorageProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 6));
            this.bxPerformanceTraceHandlerProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 8));
            this.providePagePerformanceTrackerProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 7));
            this.provideComposerWidgetComponentStorageProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 10));
            this.provideWidgetStoreDelegateProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 9));
            SwitchingProvider switchingProvider = new SwitchingProvider(this.retainComposerComponentImpl, 12);
            this.composerPageLoadingCallbackProvider = switchingProvider;
            this.bindComposerPageLoadingCallbackProvider = d.b(switchingProvider);
            SwitchingProvider switchingProvider2 = new SwitchingProvider(this.retainComposerComponentImpl, 13);
            this.viewHoldersRumTrackerImplProvider = switchingProvider2;
            this.bindViewHoldersRumTrackerProvider = d.b(switchingProvider2);
            SwitchingProvider switchingProvider3 = new SwitchingProvider(this.retainComposerComponentImpl, 14);
            this.widgetDecodingTrackerImplProvider = switchingProvider3;
            this.bindWidgetDecodingTrackerProvider = d.b(switchingProvider3);
            this.provideComposerImagePrefetcherProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 15));
            this.composerScreenFactoryProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 11));
            this.provideRetainTokenizedAnalyticsProvider = d.b(new SwitchingProvider(this.retainComposerComponentImpl, 16));
            SwitchingProvider switchingProvider4 = new SwitchingProvider(this.retainComposerComponentImpl, 17);
            this.widgetTokenizedAnalyticsImplProvider = switchingProvider4;
            this.bindsWidgetTokenizedAnalyticsProvider = d.b(switchingProvider4);
            SwitchingProvider switchingProvider5 = new SwitchingProvider(this.retainComposerComponentImpl, 19);
            this.viewHoldersFpsTrackerProvider = switchingProvider5;
            this.bindViewHoldersFpsTrackerProvider = d.b(switchingProvider5);
            this.composerNotificationControllerProvider = new SwitchingProvider(this.retainComposerComponentImpl, 20);
            SwitchingProvider switchingProvider6 = new SwitchingProvider(this.retainComposerComponentImpl, 18);
            this.composerViewInitBlockProviderImplProvider = switchingProvider6;
            this.bindComposerViewInitBlockProvider = d.b(switchingProvider6);
            SwitchingProvider switchingProvider7 = new SwitchingProvider(this.retainComposerComponentImpl, 21);
            this.composerReferencesFactoryImplProvider = switchingProvider7;
            this.bindComposerReferencesFactoryProvider = d.b(switchingProvider7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MultiFrameBinderAnalyticHelper multiFrameBinderAnalyticHelper() {
            return new MultiFrameBinderAnalyticHelper(this.provideFpsTrackerProvider.get());
        }

        private Set<b> setOfComposerEventLoadingCallback() {
            Jb.k d11 = Jb.k.d(2);
            d11.a(this.providePagePerformanceTrackerProvider.get());
            d11.a(this.bindComposerPageLoadingCallbackProvider.get());
            return d11.c();
        }

        private Set<ViewHolderLifecycleListener> setOfViewHolderLifecycleListener() {
            Jb.k d11 = Jb.k.d(2);
            d11.a(this.bindViewHoldersFpsTrackerProvider.get());
            d11.a(this.bindViewHoldersRumTrackerProvider.get());
            return d11.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ViewHoldersPerformanceTracker viewHoldersPerformanceTracker() {
            return new ViewHoldersPerformanceTracker(setOfViewHolderLifecycleListener());
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainAnalyticsComponentApi
        public Sg.a getAnalyticsScreenStorage() {
            return this.provideRetainAnalyticsScreenStorageProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerAnalyticsComponentApi
        public RZ.a getComposerAnalytics() {
            return this.provideAnalyticsProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public ComposerNavigator getComposerNavigator() {
            ComposerNavigator composerNavigator = this.composerComponent.getComposerNavigator();
            j.c(composerNavigator);
            return composerNavigator;
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public ComposerReferencesFactory getComposerReferencesFactory() {
            return this.bindComposerReferencesFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public ComposerScreenFactory getComposerScreenFactory() {
            return this.composerScreenFactoryProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public C7475g getComposerWidgetComponentStorage() {
            return this.provideComposerWidgetComponentStorageProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerPerformanceComponentApi
        public FrameBinder getFrameBinder() {
            return this.provideFrameBinderProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainImagePrefetchComponentApi
        public ImagePrefetchInfoProviderStorage<c> getImagePrefetchInfoProviderStorage() {
            return this.provideImagePrefetchInfoProviderStorageProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public K00.a getNetwork() {
            K00.a composerNetwork = this.composerComponent.getComposerNetwork();
            j.c(composerNetwork);
            return composerNetwork;
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerPagePerformanceComponentApi
        public Ih.b getPagePerformanceTracker() {
            return this.providePagePerformanceTrackerProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public l getTokenizedAnalytics() {
            return this.provideRetainTokenizedAnalyticsProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public ComposerViewInitBlockProvider getViewInitBlockProvider() {
            return this.bindComposerViewInitBlockProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public k<InterfaceC8046a<?, ? extends c>> getWidgetStore() {
            return this.provideWidgetStoreDelegateProvider.get();
        }

        @Override // ru.ozon.app.android.composer.di.composer.RetainComposerComponent
        public WidgetTokenizedAnalytics getWidgetTokenizedAnalytics() {
            return this.bindsWidgetTokenizedAnalyticsProvider.get();
        }

        private RetainComposerComponentImpl(ComposerComponent composerComponent, ComposerDebugMenuHostApiComponent composerDebugMenuHostApiComponent, Set<Widget> set, Boolean bool) {
            this.retainComposerComponentImpl = this;
            this.composerComponent = composerComponent;
            this.isPageViewTrackingEnabled = bool;
            this.widgets = set;
            this.composerDebugMenuHostApiComponent = composerDebugMenuHostApiComponent;
            initialize(composerComponent, composerDebugMenuHostApiComponent, set, bool);
        }
    }

    public static RetainComposerComponent.Factory factory() {
        return new Factory(0);
    }
}
