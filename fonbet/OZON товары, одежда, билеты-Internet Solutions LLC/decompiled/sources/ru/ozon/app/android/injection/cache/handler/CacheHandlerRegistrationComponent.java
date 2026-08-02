package ru.ozon.app.android.injection.cache.handler;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/injection/cache/handler/CacheHandlerRegistrationComponent;", "Lru/ozon/app/android/composer/network/cache/di/cacheHandler/CacheHandlerRegistrationComponentApi;", "Factory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheHandlerRegistrationComponent extends CacheHandlerRegistrationComponentApi {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lru/ozon/app/android/injection/cache/handler/CacheHandlerRegistrationComponent$Factory;", "", "create", "Lru/ozon/app/android/injection/cache/handler/CacheHandlerRegistrationComponent;", "cacheComponent", "Lru/ozon/app/android/composer/network/cache/di/CacheComponentApi;", "networkComponent", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "runningPrefetchedRequestUrlsComponent", "Lru/ozon/app/android/composer/network/prefetch/di/runningPrefetch/RunningPrefetchedRequestUrlsComponentApi;", "analyticsComponentApi", "Lru/ozon/app/android/analytics/di/AnalyticsComponentApi;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CacheHandlerRegistrationComponent create(@NotNull CacheComponentApi cacheComponent, @NotNull NetworkComponentApi networkComponent, @NotNull RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponent, @NotNull AnalyticsComponentApi analyticsComponentApi);
    }
}
