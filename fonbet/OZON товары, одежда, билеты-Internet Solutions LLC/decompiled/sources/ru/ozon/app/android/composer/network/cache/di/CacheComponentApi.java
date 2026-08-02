package ru.ozon.app.android.composer.network.cache.di;

import We.C4862d;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.CachedUrls;
import ru.ozon.app.android.composer.network.cache.ComposerCacheCleaner;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/composer/network/cache/di/CacheComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "getCacheCleaner", "()Lru/ozon/app/android/composer/network/cache/ComposerCacheCleaner;", "cacheCleaner", "Lru/ozon/app/android/composer/network/cache/CachedUrls;", "getCachedUrls", "()Lru/ozon/app/android/composer/network/cache/CachedUrls;", "cachedUrls", "LWe/d;", "getCache", "()LWe/d;", "cache", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheComponentApi extends InterfaceC6958a {
    @NotNull
    C4862d getCache();

    @NotNull
    ComposerCacheCleaner getCacheCleaner();

    @NotNull
    CachedUrls getCachedUrls();
}
