package ru.ozon.app.android.composer.di;

import Qj0.InterfaceC3896p;
import VZ.a;
import android.app.Application;
import android.content.Context;
import ei0.InterfaceC6369b;
import java.util.Set;
import kotlin.Metadata;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.di.PerformanceAnalyticsApi;
import ru.ozon.app.android.analytics.eventstorage.ViewEventStorage;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.time.ComposerPageLoadingListener;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.cart.CartNetworkDependencies;
import ru.ozon.app.android.composer.network.geo.GeoNetworkDependencies;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.composer.network.tiles.TilesNetworkDependencies;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.analytics.WidgetLayoutTimeMetricsStorage;
import ru.ozon.app.android.storage.debug.DebugToolsStorage;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.test.TestUserComponentApi;
import ru.ozon.app.android.storage.user.test.TestUserStorage;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u00019J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\tH&¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0\tH&¢\u0006\u0004\b \u0010\fJ\u000f\u0010\"\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H&¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H&¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/composer/di/ComposerComponent;", "Lru/ozon/app/android/composer/di/ComposerComponentApi;", "Lru/ozon/app/android/composer/di/AnalyticsScreenComponentApi;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "getWidgets", "()Ljava/util/Set;", "Ln20/i;", "getSdkWidgets", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "getPluginsManager", "()Lru/ozon/app/android/analytics/plugins/PluginsManager;", "Lei0/b;", "getOzonTracker", "()Lei0/b;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "getPerformanceTrackerDelegate", "()Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "getOzonTrackerSupportedPayloadTypes", "Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListener;", "getComposerPageLoadingListener", "()Lru/ozon/app/android/analytics/startup/time/ComposerPageLoadingListener;", "Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "getAsyncWidgetLayoutMetricsStorage", "()Lru/ozon/app/android/storage/analytics/WidgetLayoutTimeMetricsStorage;", "Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "getDebugToolsStorage", "()Lru/ozon/app/android/storage/debug/DebugToolsStorage;", "Lru/ozon/app/android/storage/user/test/TestUserStorage;", "getTestUserStorage", "()Lru/ozon/app/android/storage/user/test/TestUserStorage;", "Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "getViewEventStorage", "()Lru/ozon/app/android/analytics/eventstorage/ViewEventStorage;", "LVZ/a;", "getAnalyticsScreenFactory", "()LVZ/a;", "LZZ/a;", "getAnalyticsScreenToTrackerPageConverter", "()LZZ/a;", "LQj0/p;", "getInterceptedPerformanceTracker", "()LQj0/p;", "Factory", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerComponent extends ComposerComponentApi, AnalyticsScreenComponentApi {

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J°\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H&¨\u0006."}, d2 = {"Lru/ozon/app/android/composer/di/ComposerComponent$Factory;", "", "create", "Lru/ozon/app/android/composer/di/ComposerComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "navigationComponent", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "storageComponent", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "analyticsComponent", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "networkComponent", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkOzonIdComponentApi", "Lru/ozon/app/android/network/di/NetworkOzonIdComponentApi;", "widgetRegistrationComponentApi", "Lru/ozon/app/android/composer/di/WidgetRegistrationComponentApi;", "cacheComponent", "Lru/ozon/app/android/composer/network/cache/di/CacheComponentApi;", "cacheHandlerRegistrationComponent", "Lru/ozon/app/android/composer/network/cache/di/cacheHandler/CacheHandlerRegistrationComponentApi;", "runningPrefetchedRequestUrlsComponent", "Lru/ozon/app/android/composer/network/prefetch/di/runningPrefetch/RunningPrefetchedRequestUrlsComponentApi;", "ozonTrackerPayloadHandlerSupportedTypesComponentApi", "Lru/ozon/app/android/composer/di/OzonTrackerSupportedPayloadTypesComponentApi;", "testUserComponentApi", "Lru/ozon/app/android/storage/user/test/TestUserComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "eventStorageComponentApi", "Lru/ozon/app/android/analytics/eventstorage/di/EventStorageComponentApi;", "startupTimeTrackerComponentApi", "Lru/ozon/app/android/analytics/startup/time/di/StartupTimeTrackerComponentApi;", "analyticsScreenStorageComponentApi", "Lru/ozon/app/android/analytics/screen/storage/di/AnalyticsScreenStorageComponentApi;", "performanceAnalyticsApi", "Lru/ozon/app/android/analytics/di/PerformanceAnalyticsApi;", "cartNetworkDependencies", "Lru/ozon/app/android/composer/network/cart/CartNetworkDependencies;", "geoNetworkDependencies", "Lru/ozon/app/android/composer/network/geo/GeoNetworkDependencies;", "notificationStatusApi", "Lru/ozon/app/android/storefront/core/notifications/di/NotificationStatusComponentApi;", "tilesNetworkDependencies", "Lru/ozon/app/android/composer/network/tiles/TilesNetworkDependencies;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        ComposerComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NavigationComponentApi navigationComponent, @NotNull StorageComponentApi storageComponent, @NotNull AnalyticsComponentApi analyticsComponent, @NotNull NetworkComponentApi networkComponent, @NotNull NetworkOzonIdComponentApi networkOzonIdComponentApi, @NotNull WidgetRegistrationComponentApi widgetRegistrationComponentApi, @NotNull CacheComponentApi cacheComponent, @NotNull CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponent, @NotNull RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponent, @NotNull OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerPayloadHandlerSupportedTypesComponentApi, @NotNull TestUserComponentApi testUserComponentApi, @NotNull CoroutineDispatchersComponentApi coroutineDispatchersComponentApi, @NotNull EventStorageComponentApi eventStorageComponentApi, @NotNull StartupTimeTrackerComponentApi startupTimeTrackerComponentApi, @NotNull AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi, @NotNull PerformanceAnalyticsApi performanceAnalyticsApi, @NotNull CartNetworkDependencies cartNetworkDependencies, @NotNull GeoNetworkDependencies geoNetworkDependencies, @NotNull NotificationStatusComponentApi notificationStatusApi, @NotNull TilesNetworkDependencies tilesNetworkDependencies);
    }

    @NotNull
    a getAnalyticsScreenFactory();

    @NotNull
    ZZ.a getAnalyticsScreenToTrackerPageConverter();

    @NotNull
    Application getApplication();

    @NotNull
    WidgetLayoutTimeMetricsStorage getAsyncWidgetLayoutMetricsStorage();

    @NotNull
    ComposerPageLoadingListener getComposerPageLoadingListener();

    @NotNull
    Context getContext();

    @NotNull
    DebugToolsStorage getDebugToolsStorage();

    @NotNull
    FeatureChecker getFeatureChecker();

    @NotNull
    FeatureService getFeatureService();

    @NotNull
    InterfaceC3896p getInterceptedPerformanceTracker();

    @NotNull
    InterfaceC6369b getOzonTracker();

    @NotNull
    Set<YZ.a> getOzonTrackerSupportedPayloadTypes();

    @NotNull
    PerformanceTrackerDelegate getPerformanceTrackerDelegate();

    @NotNull
    PluginsManager getPluginsManager();

    @NotNull
    Set<i> getSdkWidgets();

    @NotNull
    TestUserStorage getTestUserStorage();

    @NotNull
    ViewEventStorage getViewEventStorage();

    @NotNull
    Set<Widget2> getWidgets();
}
