package ru.ozon.app.android.injection.cache.handler;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.network.cache.di.CacheComponentApi;
import ru.ozon.app.android.composer.network.cache.di.cacheHandler.CacheHandlerRegistrationComponentApi;
import ru.ozon.app.android.composer.network.prefetch.di.runningPrefetch.RunningPrefetchedRequestUrlsComponentApi;
import ru.ozon.app.android.injection.cache.handler.CacheHandlerRegistrationComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/injection/cache/handler/CacheHandlerRegistrationComponentFactory;", "Lii/a;", "Lru/ozon/app/android/composer/network/cache/di/cacheHandler/CacheHandlerRegistrationComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "Lru/ozon/app/android/injection/cache/handler/CacheHandlerRegistrationComponent;", "create", "(Lgi/b;)Lru/ozon/app/android/injection/cache/handler/CacheHandlerRegistrationComponent;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheHandlerRegistrationComponentFactory implements InterfaceC7081a<CacheHandlerRegistrationComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public CacheHandlerRegistrationComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        CacheHandlerRegistrationComponent.Factory factory = DaggerCacheHandlerRegistrationComponent.factory();
        if (CacheComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CacheComponentApi is not DiComponent");
        }
        CacheComponentApi cacheComponentApi = (CacheComponentApi) componentStorage.b(CacheComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) componentStorage.b(NetworkComponentApi.class);
        if (RunningPrefetchedRequestUrlsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component RunningPrefetchedRequestUrlsComponentApi is not DiComponent");
        }
        RunningPrefetchedRequestUrlsComponentApi runningPrefetchedRequestUrlsComponentApi = (RunningPrefetchedRequestUrlsComponentApi) componentStorage.b(RunningPrefetchedRequestUrlsComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        return factory.create(cacheComponentApi, networkComponentApi, runningPrefetchedRequestUrlsComponentApi, (AnalyticsComponentApi) componentStorage.b(AnalyticsComponentApi.class));
    }
}
