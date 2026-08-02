package ru.ozon.app.android.injection.factory.factories;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.di.PerformanceAnalyticsApi;
import ru.ozon.app.android.analytics.eventstorage.di.EventStorageComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.analytics.startup.time.di.StartupTimeTrackerComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponent;
import ru.ozon.app.android.composer.di.DaggerComposerComponent;
import ru.ozon.app.android.composer.di.OzonTrackerSupportedPayloadTypesComponentApi;
import ru.ozon.app.android.composer.di.WidgetRegistrationComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.cart.CartNetworkDependencies;
import ru.ozon.app.android.composer.network.geo.GeoNetworkDependencies;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.composer.network.tiles.TilesNetworkDependencies;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.user.test.TestUserComponentApi;
import ru.ozon.app.android.storefront.core.notifications.di.NotificationStatusComponentApi;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/injection/factory/factories/ComposerComponentFactory;", "Lii/a;", "Lru/ozon/app/android/composer/di/ComposerComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/composer/di/ComposerComponent;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerComponentFactory implements InterfaceC7081a<ComposerComponent> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public ComposerComponent create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        ComposerComponent.Factory factory = DaggerComposerComponent.factory();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) componentStorage.b(ContextComponentDependencies.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) componentStorage.b(NavigationComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) componentStorage.b(StorageComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) componentStorage.b(AnalyticsComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (WidgetRegistrationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WidgetRegistrationComponentApi is not DiComponent");
        }
        WidgetRegistrationComponentApi widgetRegistrationComponentApi = (WidgetRegistrationComponentApi) componentStorage.b(WidgetRegistrationComponentApi.class);
        if (CacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheComponentApi is not DiComponent");
        }
        CacheComponentApi cacheComponentApi = (CacheComponentApi) componentStorage.b(CacheComponentApi.class);
        if (CacheHandlerRegistrationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheHandlerRegistrationComponentApi is not DiComponent");
        }
        CacheHandlerRegistrationComponentApi cacheHandlerRegistrationComponentApi = (CacheHandlerRegistrationComponentApi) componentStorage.b(CacheHandlerRegistrationComponentApi.class);
        if (RunningPrefetchedRequestUrlsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RunningPrefetchedRequestUrlsComponentApi is not DiComponent");
        }
        RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi = (RunningPrefetchedRequestUrlsComponentApi) componentStorage.b(RunningPrefetchedRequestUrlsComponentApi.class);
        if (OzonTrackerSupportedPayloadTypesComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonTrackerSupportedPayloadTypesComponentApi is not DiComponent");
        }
        OzonTrackerSupportedPayloadTypesComponentApi ozonTrackerSupportedPayloadTypesComponentApi = (OzonTrackerSupportedPayloadTypesComponentApi) componentStorage.b(OzonTrackerSupportedPayloadTypesComponentApi.class);
        if (TestUserComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TestUserComponentApi is not DiComponent");
        }
        TestUserComponentApi testUserComponentApi = (TestUserComponentApi) componentStorage.b(TestUserComponentApi.class);
        if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
        }
        CoroutineDispatchersComponentApi coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) componentStorage.b(CoroutineDispatchersComponentApi.class);
        if (EventStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component EventStorageComponentApi is not DiComponent");
        }
        EventStorageComponentApi eventStorageComponentApi = (EventStorageComponentApi) componentStorage.b(EventStorageComponentApi.class);
        if (StartupTimeTrackerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StartupTimeTrackerComponentApi is not DiComponent");
        }
        StartupTimeTrackerComponentApi startupTimeTrackerComponentApi = (StartupTimeTrackerComponentApi) componentStorage.b(StartupTimeTrackerComponentApi.class);
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) componentStorage.b(AnalyticsScreenStorageComponentApi.class);
        if (PerformanceAnalyticsApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component PerformanceAnalyticsApi is not DiComponent");
        }
        PerformanceAnalyticsApi performanceAnalyticsApi = (PerformanceAnalyticsApi) componentStorage.b(PerformanceAnalyticsApi.class);
        if (CartNetworkDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CartNetworkDependencies is not DiComponent");
        }
        CartNetworkDependencies cartNetworkDependencies = (CartNetworkDependencies) componentStorage.b(CartNetworkDependencies.class);
        if (GeoNetworkDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component GeoNetworkDependencies is not DiComponent");
        }
        GeoNetworkDependencies geoNetworkDependencies = (GeoNetworkDependencies) componentStorage.b(GeoNetworkDependencies.class);
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        NetworkOzonIdComponentApi networkOzonIdComponentApi = (NetworkOzonIdComponentApi) componentStorage.b(NetworkOzonIdComponentApi.class);
        if (NotificationStatusComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NotificationStatusComponentApi is not DiComponent");
        }
        NotificationStatusComponentApi notificationStatusComponentApi = (NotificationStatusComponentApi) componentStorage.b(NotificationStatusComponentApi.class);
        if (TilesNetworkDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TilesNetworkDependencies is not DiComponent");
        }
        return factory.create(contextComponentDependencies, navigationComponentApi, storageComponentApi, analyticsComponentApi, networkComponentApi, networkOzonIdComponentApi, widgetRegistrationComponentApi, cacheComponentApi, cacheHandlerRegistrationComponentApi, runningPrefetchedRequestUrlsComponentApi, ozonTrackerSupportedPayloadTypesComponentApi, testUserComponentApi, coroutineDispatchersComponentApi, eventStorageComponentApi, startupTimeTrackerComponentApi, analyticsScreenStorageComponentApi, performanceAnalyticsApi, cartNetworkDependencies, geoNetworkDependencies, notificationStatusComponentApi, (TilesNetworkDependencies) componentStorage.b(TilesNetworkDependencies.class));
    }
}
